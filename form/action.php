Olá <?php echo htmlspecialchars($_POST['name']); ?>.
Você tem <?php echo (int)$_POST['age']; ?> anos e pode ser considerado uma pessoa 
<?php if ((int)$_POST['age'] < 40){
    echo 'jovem.';
} else {
    echo 'longeva.';
}