<?php
$soma = 0;
for ($i = 0; $i <= (int)$_POST['num']; $i++){
    $soma = $soma + $i;
}
echo 'A soma dos '.(int)$_POST['num']. " primeiros números inteiros é igual a: "  .$soma;
?>