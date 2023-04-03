let cpfValue = document.querySelector('.cpf');
let verificouPrimeiroDigito = 0;
let verificouSegundoDigito = 0;

function verificaPrimeiroDigito(valor) {
    let primeiroDigito = valor[valor.length - 2];
    let verificaPrimeiroDigito = 0;
    let multiplicador = 10;

    for(let i = 0; i < valor.length - 2; i++) {
        verificaPrimeiroDigito += valor[i] * multiplicador;
        multiplicador--;
    }

    verificaPrimeiroDigito = verificaPrimeiroDigito % 11;

    let valorFinal = (verificaPrimeiroDigito != 0 || verificaPrimeiroDigito != 1) ? 
    11 - verificaPrimeiroDigito : verificaPrimeiroDigito;

    return valorFinal == primeiroDigito ? verificouPrimeiroDigito = 1 
        : verificouPrimeiroDigito = 0;

}

function verificaSegundoDigito(valor) {
    let segundoDigito = valor[valor.length - 1];
    let verificaSegundoDigito = 0;
    let multiplicador = 10;

    for(let i = 1; i < valor.length - 1; i++) {
        verificaSegundoDigito += valor[i] * multiplicador;
        multiplicador--;
    }

    verificaSegundoDigito = verificaSegundoDigito % 11;

    let valorFinal = (verificaSegundoDigito != 0 || verificaSegundoDigito != 1) ? 
        11 - verificaSegundoDigito : verificaSegundoDigito;

    return valorFinal == segundoDigito ? verificouSegundoDigito = 1 
        : verificouSegundoDigito = 0;
        
}

function validaCpf() {
    verificaPrimeiroDigito(cpfValue.value)
    verificaSegundoDigito(cpfValue.value)
    if(verificouPrimeiroDigito == 1 && verificouSegundoDigito == 1) {
        document.getElementById('cpfValidado').style.display = "block";
        document.getElementById('cpfInvalidado').style.display = "none";
        document.getElementById('btn-submit').disabled = false;
        return;
    } else {
        document.getElementById('cpfInvalidado').style.display = "block";
        document.getElementById('cpfValidado').style.display = "none";
        document.getElementById('btn-submit').disabled = true;
    }
}
