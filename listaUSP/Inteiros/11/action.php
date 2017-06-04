<?php
$num = $_POST['num'];

for ($i = 1; $i <= $num; $i++){
    if ($num % $i == 0){
        $cont++;
    }
}

    if ($cont == 2){
    echo "O número " .$num. " é primo.";
    } else {
    echo "O número " .$num. " não é primo.";
    }
?>