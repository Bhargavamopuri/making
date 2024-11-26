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
#feature added by feature1
<!DOCTYPE html> 
<html> 

<body> 
	<!-- Various HTML elements with 
	different tag names -->
	<div class="gfg">GFG</div> 
	<div class="gfg">G</div> 
	<div class="gfg">F</div> 
	<div class="gfg">G</div> 
	<p>Geeks</p> 

	<script> 
		
		// Using "." for prefix class selector 
		const divs = 
			document.querySelectorAll(".gfg"); 
		console.log(divs); 
	</script> 
</body> 

</html>
#enede by feature1
#feature added by feature3
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
			let x = window.open();
			/* DOM open() method used here */
			x.document.open("text/html", "replace");
			x.document.write("Welcome to GeeksforGeeks");
			x.document.close();
		}
	</script>
</body>
</html>
#enede by feature3
#feature5
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
#eneded by feature5