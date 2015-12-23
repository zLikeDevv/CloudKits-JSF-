<?php



$form:titulo=$_POST['form:titulo'];



$form:responsavel=$_POST['form:responsavel'];



$form:descricao=$_POST['form:descricao'];



$form:status=$_POST['form:status'];



$Destinatario="cloudkits1@gmail.com";





$Titulo="$Report de bug site/forum";





$mensagem1="



Novo report enviado do site.



form:titulo: $form:titulo



form:responsavel: $form:responsavel



form:descricao: $form:descricao



form:status: $form:status





mail("$Destinatario","$Titulo", "$mensagem1","From:$email");



?>



<html>


<link rel="stylesheet" type="text/css" href="database.css" />


<body>



<title></title>

<center>

Enviado com sucesso !



  <meta http-equiv="refresh" content="1; URL=painel.php">



</center>

</body>



</html>

