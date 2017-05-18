<?php
echo 'Os ' .$_POST['num']. ' primeiros ímpares são: ';

while ($i != $_POST['num']){
    $x++;
if (($x % 2) != 0){
    // é impar
    $i++;
    echo  $x. ' '; 
    }   

}
?>