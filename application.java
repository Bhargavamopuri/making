<!DOCTYPE html> 
<html> 

<body> 
	<!-- Various HTML elements with 
	different tag names -->
	<div>GFG</div> 
	<p>Geeks</p> 
	<p>For</p> 
	<p>Geeks</p> 

	<script> 
		const p = document.getElementsByTagName("p"); 
		console.log(p); 

		// Select third element with tag name "p" 
		console.log(p[2]); 
	</script> 
</body> 

</html>
