<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:param name="rut"/>
	<xsl:template match="/">
		<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
		    <soap:Body xmlns:ns1="http://services.model.apv.bicevida.cl/">
		        <ns1:getProductosAPV>
		            <ns1:InProducto_1>
		                <ns1:rut><xsl:value-of select="$rut" /></ns1:rut>
		            </ns1:InProducto_1>
		        </ns1:getProductosAPV>
		    </soap:Body>
		</soap:Envelope>		
	</xsl:template>
</xsl:stylesheet>