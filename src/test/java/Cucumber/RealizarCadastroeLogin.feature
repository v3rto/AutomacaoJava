#language: pt
@RealizarCadastroeLogin
	Funcionalidade: Realizar cadastro e validar que foi efetuado com sucesso.
    
    Cenário: Iniciar o Cadastro 
    Dado que estou navegando no site
    Quando clico em Login
    E informo meu email
    E clico em Create Account
    Então o site deve ser direcionado até a tela de cadastro

    Cenário: Realizar o Cadastro
   	Dado que preencho os dados obrigatórios
    Quando clico em Register
   	Então sou direcionado para My Account
    
    Cenário: Validar Cadastro
    Dado que clico em Sign out para sair da conta
    E sou direcionado para tela de login
    Quando informo email e senha 
    E clico em Sign in 
    Então sou direcionado para My Account
