const btn = document.getElementById("btn_enviar");
const txtInput = document.getElementById("txt_input");
const txtOutput = document.getElementById("txt_output");

btn.addEventListener("click", getData);

async function getData() {
  let codigo = txtInput.value;
  let url = "http://localhost:8080/produto/" + codigo;

  let resultado = await fetch(url, {
    headers: {
      "Content-Type": "application/json",
    },
  });

  console.log(resultado);

  if (resultado.status == 200) {
    let dados = await resultado.json();
    console.log(dados);
    let id = dados["cod"];
    let nome = dados["name"];
    let valor = dados["value"];
    txtOutput.value = "ID: " + id + " Nome: " + nome + "\n" + "valor: " + valor;
  } else {
    console.log("Produto não encontrado");
  }
}
