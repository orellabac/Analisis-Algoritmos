def SelectedSort(l):
    for i in range(0, len(l)-1) :
        indiceMenor=i 
        for j in range(i+1, len(l)) :
            if l[j]<l[indiceMenor] : 
                indiceMenor=j 
        if i!=indiceMenor : 
            l[i],l[indiceMenor]=l[indiceMenor],l[i]


x=[4,5,23,1]

SelectedSort(x)
print (x)
