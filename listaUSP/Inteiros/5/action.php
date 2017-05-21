<?php

var_dump($_POST['dia']);
//OPCIONAL - Quantos produtos foram vendidos

for ($i = 0; $i <= 30; $i++){
echo $dia[$i];
}
print_r(array_values ($dia));
echo array_sum($dia);
?>