<?php

$sales = $_POST['dia']; // Atribui $sales ao array dia.

// echo "Total das vendas: " .array_sum($sales). "<br/>"; //imprime o total das vendas

$i = 1;
foreach ($_POST['dia'] as $key => $value[$i]) { // atribui os valores da array dia para $value[$i];
    $i++;
   // echo $value[$i] . "<br/>"; // imprime as variáveis armazenadas em $value[$i]
}

$maiorValor = 0;
for ($i = 1; $i <= 30; $i++){
    if ($value[$i] >= $maiorValor){
        $maiorValor = $value[$i];
        $dia = $i;
    }
}

echo "O maior número de vendas foi de " .$maiorValor. " unidades no dia " .$dia. " de março."; 
?>