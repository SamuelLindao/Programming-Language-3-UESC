try:
    numerador = 10
    denominador = int(input("Digite um numero: "))
    resultado = numerador/denominador
    print(resultado)
except ZeroDivisionError:
    print("Dividindo por zero")
except ValueError:
    print("Valor indevido")
except Exception as e:
    print(e)