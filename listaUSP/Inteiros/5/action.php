<?php

//var_dump($_POST['dia']);
//OPCIONAL - Quantos produtos foram vendidos

$sales = $_POST['dia'];

echo "Total das vendas: " .array_sum($sales). "<br/>";

foreach ($_POST['dia'] as $key => $value) {
    echo $value . "<br/>";
}
?>