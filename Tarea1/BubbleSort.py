import random
import time

def generacion():
    lista = []
    for i in range (1,100000):
        
        numero = int (random.uniform(0,100000))
        
        lista.append(numero)
    return lista
def bubblesort(l):
    print ("hola")
    for pasada in range(1, len(l)-1):
        for i in range(0,len(l)-1):
          
            if l[i] > l[i+1]:
                l[i], l[i+1] = l[i+1], l[i]
    print ("ready")
    return 0


def main():
    lista = generacion()
    print ("Espere mientras el programa ordena la lista. Esto va a tardar un rato")

    inicio = time.time()
    bubblesort(lista)    
    fin=time.time()
    total = fin - inicio
    print ("Ordenar lista desordenada",total)
    inicio = time.time()
    bubblesort(lista)    
    fin=time.time()
    total = fin - inicio
    print ("Ordenar lista ordenada",total)
    lista.reverse()
    inicio = time.time()
    bubblesort(lista)    
    fin=time.time()
    total = fin - inicio
    print ("Ordenar lista ordenada descendentemente",total)
    raw_input ("Presione enter para continuar")
            
main()
