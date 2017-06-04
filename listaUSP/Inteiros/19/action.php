<?php

    $maior = max ($_POST['num1'], $_POST['num2'], $_POST['num3']);
    $menor = min ($_POST['num1'], $_POST['num2'], $_POST['num3']);
   

    if ($_POST['num1'] != $maior AND $_POST['num1'] != $menor){
        $meio = $_POST['num1'];
    } else {
    if ($_POST['num2'] != $maior AND $_POST['num2'] != $menor){
        $meio = $_POST['num2'];
        } else {
            $meio = $_POST['num3'];
        }
    }
  
    echo "Ordem crescente: " .$menor.", ".$meio.", ".$maior.".";
?>