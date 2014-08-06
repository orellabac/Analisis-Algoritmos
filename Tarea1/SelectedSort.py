import random
import time

def generacion(largo):
    lista = []
    for i in range (0,largo):
        
        numero = int (random.uniform(0,100000))
        
        lista.append(numero)
    return lista

def SelectedSort(l):
    
    for i in range(0, len(l)-1) :
        indiceMenor=i 
        for j in range(i+1, len(l)) :
            if l[j]<l[indiceMenor] : 
                indiceMenor=j 
        if i!=indiceMenor : 
            l[i],l[indiceMenor]=l[indiceMenor],l[i]


print ("SelectedSort")
print ("Informacion Basica: El algorito genera una lista aleatoria, dicha lista no se muestra. ")
longitud = int (raw_input ("Ingrese la longitud de elementos deseados"))
lista = generacion(longitud)
print ("Espere mientras el programa ordena la lista. Esto va a tardar un rato")
inicio = time.time()
SelectedSort(lista)
fin=time.time()
total = fin - inicio
print ("Ordenar lista desordenada",total)
inicio = time.time()
SelectedSort(lista)
fin=time.time()
total = fin - inicio
print ("Ordenar lista ordenada",total)
lista.reverse()
inicio = time.time()
SelectedSort(lista)
fin=time.time()
total = fin - inicio
print ("Ordenar lista ordena descendentemente",total)
raw_input ("Presione enter para continuar")
