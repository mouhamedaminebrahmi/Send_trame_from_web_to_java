<?php
$host = "localhost"; 
$port = 81;
$tram1 = $_POST['tram1'];

 


if ( ($socket = socket_create(AF_INET, SOCK_STREAM, SOL_TCP)) === FALSE )
    echo "socket_create() failed: reason: " .             socket_strerror(socket_last_error());
else 
{
    echo "Connecting to '$host' on port '$port'...<br>";
    if ( ($result = socket_connect($socket, $host, $port)) === FALSE )
        echo "socket_connect() failed. Reason: ($result) " .     socket_strerror(socket_last_error($socket));
    else {
        echo "Sending Trame...<br>";
		for ($tram = 1; $tram <= 100; $tram++) {
        socket_write ($socket, $tram1."\r\n", strlen ($tram1."\r\n"));
        echo "OK<br>";
		}

        
    }
    socket_close($socket);      
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
	<title>Brahmi Med Amine</title>
	<meta charset="UTF-8">
	</head>
	<body></body>
	
	</html>