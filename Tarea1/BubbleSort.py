import random
import time

def generacion(longitud):
    lista = []
    for i in range (0,longitud):
        
        numero = int (random.uniform(0,100000))
        
        lista.append(numero)
    return lista

def bubblesort(l):
    for pasada in range(1, len(l)-1):
        for i in range(0,len(l)-1):
          
            if l[i] > l[i+1]:
                l[i], l[i+1] = l[i+1], l[i]
    
    return 0


def main():
    print ("BubbleSort")
    print ("Informacion Basica: El algorito genera una lista aleatoria, dicha lista no se muestra. ")
    longitud = int (raw_input ("Ingrese la longitud de elementos deseados"))
    lista = generacion(longitud)
    print ("Espere mientras el programa ordena la lista. Esto puede tardar")
    
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
