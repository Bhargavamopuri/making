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
#feature added by feature2
<!DOCTYPE html>
<html>
<head>
	<title>DOM open() Method</title>
</head>
<body>
	<p>GeeksforGeeks</p>
	<button onclick="Geeks()">
		Click Here!
	</button>
	<script>
		function Geeks() {
			/* DOM open() method used here */
			document.open("text/html", "replace");
			document.write("Welcome to GeeksforGeeks");
			document.close();	 
		}
	</script>
</body>
</html>
#ended by feature2