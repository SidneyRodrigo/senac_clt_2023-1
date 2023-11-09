$("#formulario").validate({
    debug: true,
    rules: {
}


// const form = document.getElementById('form')
// const nome = document.getElementById('nome')
// const sobrenome = document.getElementById('sobrenome')
// const telefone = document.getElementById('telefone')
// const email = document.getElementById('email')

// form.addEventListener('submit', (e) => {
//     e.preventDefault();

//     checkInputs();
// });

// function checkInputs() {
//     const nameValue = nome.value
//     const sobrenomeValue = sobrenome.value
//     const telefoneValue = telefone.value
//     const emailValue = email.value

//     if (nomeValue === "") {
//         setErrorFor(nome, 'O nome é obrigatório.');
//     }
// }

// function setErrorFor(input, message) {
//     const formControl = input.parentElement;
//     const small = formControl.querySelector('small');
    
//     // Adicionar a mensagem de erro
//     small.innerText = message;

//     // Adicionar a classe de erro
//     formControl.className = "form-control error";

// }

// function setSuccessFor(input) {
//     const formControl = input.parentElement;

//     // Adicionar a classe de sucesso
//     formControl.className = 'form-control success'
// }
