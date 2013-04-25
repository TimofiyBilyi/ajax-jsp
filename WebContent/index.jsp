<html>
<head>
<title>AJAX calls using Jquery in Servlet</title>
        <script src="http://code.jquery.com/jquery.js">   
        </script>
        <script>
            $(document).ready(function() {                        
                $('#submit').click(function(event) {  
                    var username=$('#user').val();
                 $.get('ActionServlet',{user:username},function(responseText) { 
                        $('#welcometext').text(responseText);         
                    });
                });
            });
        </script>
</head>
<body>
<form id="form1">
<h1>Demo using Jquery in JSP and Servlet</h1>
Enter your Name:
<input type="text" id="user"/>
<input type="button" id="submit" value="Ajax Submit"/>
<br/>
<div id="welcometext">
</div>
</form>
</body>
</html>