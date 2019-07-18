@RealizarCadastroeLogin
Feature: Realizar cadastro e validar que foi efetuado com sucesso.
    
    Scenario: Iniciar o Cadastro 
    Given que estou navegando no site
    When clico em Login
    And informo meu email
    And clico em Create Account
    And o site deve ser direcionado até a tela de cadastro
    And que preencho os dados obrigatórios
    And clico em Register
    And sou direcionado para My Account
    And que clico em Sign out para sair da conta
    And informo email e senha 
    And clico em Sign in
    Then sou direcionado para My Account

# Luis, o meu eclipse está com problema, não consegui colocar o plugin, por isso as palavras chave estão em inglês e o texto em português, 
# Isso influenciou também na estruturação dos cenários, por isso tive que fazer essa série de "And", mas o descritivo completo está logo abaixo comentado.

#    Scenario: Realizar o Cadastro
#    Given que preencho os dados obrigatórios
#    When clico em Register
#    Then sou direcionado para My Account
#    
#    Scenario: Validar Cadastro
#    Given que clico em Sign out para sair da conta
#    And sou direcionado para tela de login
#    When informo email e senha 
#    And clico em Sign in 
#    Then sou direcionado para My Account
