<?php
$numero = (int) readline("Digite quantos patinhos foram passear: ");

echo "contagem de patinhos : " . PHP_EOL;
while($numero > 0){
    echo 
"$numero patinhos foram passear 
Além das montanhas para brincar
A mamãe gritou: Quack, quack, quack, quack
Mas só quatro patinhos voltaram de lá" . PHP_EOL;
    $numero --;
    
    usleep(1000000);
}

echo "\nPoxa, a mamãe patinha ficou tão triste naquele dia
Aonde sera que estavam os seus filhotinhos?
Mas essa história vai ter um final feliz
Sabe por quê?

A mamãe patinha foi procurar
Além das montanhas na beira do mar
A mamãe gritou: Quack, quack, quack, quack
E os cinco patinhos voltaram de lá" . PHP_EOL;


?>