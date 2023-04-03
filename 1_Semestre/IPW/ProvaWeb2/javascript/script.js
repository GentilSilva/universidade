function verificaCpf(valor) {
    const cpfValue = valor;
    if(cpfValue.length != 11) {
        document.getElementById('cpfInvalidado').style.display = "block";
        document.getElementById('cpfValidado').style.display = "none";
        document.getElementById('btn-submit').disabled = true;
    } else {
        document.getElementById('cpfValidado').style.display = "block";
        document.getElementById('cpfInvalidado').style.display = "none";
        document.getElementById('btn-submit').disabled = false;
        return;
    }
}

function validaSenha(valor) {
    const senhaValue = valor;
    let cont = 0;
    if(senhaValue == "1A267004155" || senhaValue == "1a267004155") {
        return
    } else {
        alert("Senha inválida")
        cont++
    }
    if(cont == 3) {
        alert('Formulário bloqueado')
        document.getElementById('btn-submit').disabled = true;
    }
}