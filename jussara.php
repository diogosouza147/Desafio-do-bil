<?php
$senha= " ";
do {
    $senha= readline("Digite sua senha (Ela deve conter pelo menos 9 caracteres): ");
       
    if (strlen($senha) < 9) {
        echo "A senha deve conter pelo menos 9 caracteres. Por favor, tente novamente." . PHP_EOL; 
    }
} while (strlen($senha) < 9); // Corrigido: continua enquanto a senha for menor que 9

echo "Senha criada com sucesso!" . PHP_EOL;
?>