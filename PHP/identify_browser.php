<?php
if (strpos($_SERVER['HTTP_USER_AGENT'], 'MSIE') ) {
    echo 'Você está usando o IE.';
} 
if (strpos($_SERVER['HTTP_USER_AGENT'], 'Chrome') ){
    echo 'Você está usando o Chrome';
}
?>