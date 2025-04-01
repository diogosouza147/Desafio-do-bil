<?php

$clientes = [
    [
        "nome" => "João Silva",
        "numero_conta" => "12345",
        "cpf" => "123.456.789-00",
        "saldo" => 1000.50
    ],
    [
        "nome" => "Maria Oliveira",
        "numero_conta" => "67890",
        "cpf" => "896.452.321-00",  
        "saldo" => 6001.75
    ],
    [
        "nome" => "Carlos Pereira",
        "numero_conta" => "54321",
        "cpf" => "091.323.206-70",  
        "saldo" => 845.36
    ]
];

echo "Digite o número da conta que deseja consultar: ";
$numeroConta = trim(fgets(STDIN));  

$encontrada = false;

foreach ($clientes as $cliente) {
    if ($cliente['numero_conta'] === $numeroConta) {
        $encontrada = true;
        echo "\nInformações da Conta:\n";
        echo "Nome do Proprietário: " . $cliente['nome'] . "\n";
        echo "Número da Conta: " . $cliente['numero_conta'] . "\n";
        echo "CPF do Proprietário: " . $cliente['cpf'] . "\n";
        echo "Saldo: R$ " . number_format($cliente['saldo'], 2, ',', '.') . "\n";
        break;
    }
}

if (!$encontrada) {
    echo "\nConta não encontrada.\n"; 
}
?>