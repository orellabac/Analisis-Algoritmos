Instituto Tecnológico de Costa Rica
Ingeniería en Computación
Tarea 1.
Análisis de los algoritmos de ordenamiento BubbleSort y SelectedSort.
Estudiante: Amanda Sofia Solano Astorga
Carné:2013100025

Hipótesis

**1.BubbleSort **

* 1.a Desordenada : Es el caso medio, ya que la comparación de los elementos dependerá del desorden de la lista,ya que el reemplazo se realiza sí y solo sí el elemento adyacente es mayor.
* 1.b Ordenada ascendente: Es el caso mejor, ya que el elemento adyacente siempre será mayor, por ende no debe entrar en comparaciones.
* 1.c Ordenada descendente : Es el caso peor, ya que el elemento adyacente será menor, por ende debe de recorrer toda la lista hasta que termine.

**2.SelectedSort**

* 2.a Desordenada : Es el caso medio, ya que el tiempo de ejecución no siempre será igual ya que dependerá de el orden los elementos.
* 2.b Ordenada ascendente: Es el caso mejor, ya que el tiempo de ejecución del algoritmo debe de ser menor, ya que no entra en ciclo de comparación.
* 2.c Ordenada descendente : Este es el caso peor, ya que todos los elementos se encuentran desordenados y el algoritmos encontrada cada elemento mas pequeño según vaya recorriendo la lista. 

Parámetros de entrada
 

Utilizando una función para la generación de número aleatorios, se generará una lista con un total de 10000 elementos. Tomando como base esta lista se realizaran otras dos ejecuciones del programa una con la lista ordenada y otra con la lista descendente.

Método Teórico o Priori


* Imagen del Pseudocódigo del BubbleSort

<a href="http://es.zimagez.com/zimage/bubblesortpseudocodigo.php" target="_blank" title="Foto alojada por zimagez.com"><img src="http://es.zimagez.com/miniature/bubblesortpseudocodigo.png" alt="Foto alojada por zimagez.com" /></a>


* Imagen Pseudocódigo del SelectedSort

<a href="http://es.zimagez.com/zimage/pseudocodigoselectedsort.php" target="_blank" title="Foto alojada por zimagez.com"><img src="http://es.zimagez.com/miniature/pseudocodigoselectedsort.png" alt="Foto alojada por zimagez.com" /></a>

Ambos algoritmos  algoritmo maneja la siguiente función cuadrática:

<a href="http://es.zimagez.com/zimage/grafico1.php" target="_blank" title="Foto alojada por zimagez.com"><img src="http://es.zimagez.com/miniature/grafico1.png" alt="Foto alojada por zimagez.com" /></a>

La gráfica de la función sería la siguiente 

<a href="http://es.zimagez.com/zimage/formulabubble.php" target="_blank" title="Foto alojada por zimagez.com"><img src="http://es.zimagez.com/miniature/formulabubble.png" alt="Foto alojada por zimagez.com" /></a>

**Método Posteriori**

O grande = n ^ 2; por lo tanto se puede observar que la O en ambos casos en cuadrática

**Resultados del BubbleSort**

En la siguiente tabla se podrá observar los resultados en segundo arrojados por el algoritmo

<a href="http://es.zimagez.com/zimage/tabla10.php" target="_blank" title="Foto alojada por zimagez.com"><img src="http://es.zimagez.com/miniature/tabla10.png" alt="Foto alojada por zimagez.com" /></a>

**Resultados del SelectionSort**

En la siguiente tabla se podrá observar los resultados en segundo arrojados por el algoritmo

<a href="http://es.zimagez.com/zimage/tabla20.php" target="_blank" title="Foto alojada por zimagez.com"><img src="http://es.zimagez.com/miniature/tabla20.png" alt="Foto alojada por zimagez.com" /></a>

**Conclusiones Finales**

La hipótesis planteada para el algoritmo BubbleSort demuestra ser cierta, ya que los resultados arrojaron que el caso mejor será cuando la lista este completamente ordenada, si la lista se encuentra ordenada de forma descendente entrará en el caso peor, ya que el tiempo de ejecución siempre será mayor. El caso medio es un ordenamiento de los elementos y ya que en la mayoría de las ocasiones el algoritmo recibe como entrada este tipo de datos, no es un problema.

Por otra parte la hipótesis para el SelectionSort resulto no ser acertada, ya que los casos suelen variar de acuerdo a la longitud de elementos:
1. Si la lista contiene muchos elementos, por ejemplo M=100000, podemos notar que en el caso mejor será si la lista esta desordenada y una lista ordenada entra en el caso peor. Aunque el caso medio, si coincide.

Por ende, el SelectionSort presenta ciertas variaciones con respecto al caso mejor y el caso peor, ya que este no es fijo según los resultados arrojados, pero mantiene la tendencia en el caso medio.

En conclusión, para listas muy largas se puede utilizar cualquiera de los dos, pero el SelectionSort presenta tiempos de calculo más bajos.

Si la lista esta ordenada, el bubblesort presenta un mejor rendimiento que el SelectionSort
