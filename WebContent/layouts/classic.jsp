<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
	<div id="head">
	 	<tiles:insertAttribute name="head" />
	</div>

  <body>
	 
	<tiles:insertAttribute name="barra" />

	<jsp:include page="/tiles/menu_.jsp"></jsp:include>	

	<jsp:include page="/tiles/painel_.jsp"></jsp:include>
	
		

   <jsp:include page="/tiles/js.jsp"></jsp:include>
  </body>
</html>
