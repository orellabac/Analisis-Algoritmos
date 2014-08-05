def bubblesort(l):
    for pasada in range(1, len(l)-1):
        for i in range(0,len(l)-1):
            if l[i] > l[i+1]:
                l[i], l[i+1] = l[i+1], l[i]

def main():
    lista =[15,25,65,10,15]
    bubblesort(lista)
    print (lista)

main()
