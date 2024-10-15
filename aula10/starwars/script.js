const btn = document.getElementById("btn_enviar");
const txtInput = document.getElementById("txt_input");
const txtOutput = document.getElementById("txt_output");

btn.addEventListener("click", getData);

async function getData() {
  let codigo = txtInput.value;
  let url = "https://swapi.dev/api/people/" + codigo;

  let resultado = await fetch(url, {
    headers: {
      "Content-Type": "application/json",
    },
  });

  console.log(resultado);

  if (resultado.status == 200) {
    let dados = await resultado.json();
    console.log(dados);
    let nome = dados["name"];
    let peso = dados["mass"];
    txtOutput.value = "Nome: " + nome + "\n" + "Peso: " + peso;
  } else {
    console.log("Não encontrado");
  }
}
