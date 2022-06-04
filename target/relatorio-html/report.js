$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Realizar login com cadastro ja criado",
  "description": "",
  "id": "realizar-login-com-cadastro-ja-criado",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Realizar login no site",
  "description": "",
  "id": "realizar-login-com-cadastro-ja-criado;realizar-login-no-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "que acesso o conexaoQA",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "clico no login",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "coloco \"usuario\" e \"senha\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "sera exibido a tela de dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "o botao de criar perfil estara sendo exibido",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "visualizo a tela de criacao do perfil",
  "keyword": "And "
});
formatter.match({
  "location": "Login.queAcessoOConexaoQA()"
});
formatter.result({
  "duration": 3927285600,
  "status": "passed"
});
formatter.match({
  "location": "Login.clicoNoLogin()"
});
formatter.result({
  "duration": 69770999,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usuario",
      "offset": 8
    },
    {
      "val": "senha",
      "offset": 20
    }
  ],
  "location": "Login.colocoE(String,String)"
});
formatter.result({
  "duration": 390385201,
  "status": "passed"
});
formatter.match({
  "location": "Login.seraExibidoATelaDeDashboard()"
});
formatter.result({
  "duration": 21001,
  "status": "passed"
});
formatter.match({
  "location": "Login.oBotaoDeCriarPerfilEstaraSendoExibido()"
});
formatter.result({
  "duration": 525693900,
  "status": "passed"
});
formatter.match({
  "location": "Login.visualizoATelaDeCriacaoDoPerfil()"
});
formatter.result({
  "duration": 197201600,
  "status": "passed"
});
});