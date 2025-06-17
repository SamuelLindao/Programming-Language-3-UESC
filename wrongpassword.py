class SenhaInvalidaError(Exception):
    def __init__(self):
        super().__init__("Senha Invalida")

def validar_senha(senha):
    if(len(senha) < 8):
        raise SenhaInvalidaError()
    else:
        print("Senha valida")

senha = input("Digite uma senha: ")
validar_senha(senha)

