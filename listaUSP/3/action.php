<?php
echo 'Os ' .$_POST['num']. ' primeiros ímpares são: '; // Imprime a mensagem inicial

while ($i != $_POST['num']){ // Enquanto a quantidade de $i for diferente do número recebido
    $x++; //Incrementa o número $x
if (($x % 2) != 0){ // Testa se o número $x é impar
    $i++; // Incrementa a contagem de números ímpares
    echo  $x. ' ';  // Imprime o número ímpar atual
    }   
}
?>