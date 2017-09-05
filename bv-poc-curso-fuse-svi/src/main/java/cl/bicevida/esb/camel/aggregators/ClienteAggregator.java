package cl.bicevida.esb.camel.aggregators;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.apache.log4j.Logger;
import cl.bicevida.apv.model.services.GetProductosAPVResponse;
import cl.bicevida.apv.model.services.ListOfProducto;
import cl.bicevida.esb.services.expose.data.Cliente;
import cl.bicevida.esb.services.expose.data.Producto;

public class ClienteAggregator implements AggregationStrategy {
	
	Logger logger = Logger.getLogger(ClienteAggregator.class);
	
	Integer i = 0;

	@Override
	public Exchange aggregate(Exchange oldex, Exchange newex) {
		
		Cliente clienteResponse = null;
		
		i++;
		logger.info("count de aggregator " + i);
		
		if(oldex == null){
			
			logger.info("Primera llamada del aggregator");
			oldex = newex.copy();				
			clienteResponse = new Cliente();			
			oldex.getIn().setBody(clienteResponse);		
			
		}
		
		clienteResponse = oldex.getIn().getBody(Cliente.class);
		
		Object o = newex.getIn().getBody();
		
		logger.info("objeto -> " + o.getClass().getName());
		
		if(o instanceof cl.bicevida.esb.services.data.Cliente){
			logger.info("Objecto Cliente llega a aggregator");
			cl.bicevida.esb.services.data.Cliente cl = (cl.bicevida.esb.services.data.Cliente)o;
			
			clienteResponse.setNombre(cl.getNombres());
			clienteResponse.setApellidoPaterno(cl.getApellidoPaterno());
			clienteResponse.setApellidoMaterno(cl.getApellidoMaterno());			
		}
		
		if(o instanceof ListOfProducto){
			logger.info("Objecto ProductosApv llega a aggregator");
			ListOfProducto prods = (ListOfProducto)o;
			 
			if(prods != null){
				
			
			     for (cl.bicevida.apv.model.services.Producto p : prods.getItem()) {
					Producto productoResponse = new Producto();
					
					productoResponse.setNpoliza(p.getNPoliza());	
					productoResponse.setRamo(p.getRamSubRamo());
					productoResponse.setNombreProducto(p.getDesclProd());
					
					clienteResponse.getProductos().add(productoResponse);
			    	 
			     }
		     
			}
			
		}
		
		oldex.getIn().setBody(clienteResponse);				
		
		return oldex;
	}	
	

}
