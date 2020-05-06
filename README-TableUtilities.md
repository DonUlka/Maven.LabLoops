# TableUtilities

* Asegura que todos los test en la clase `TableUtilitiesTest` pasen después de completar los métodos en la clase `TableUtilities`:
  * `String getSmallMultiplicationTable()`
  * `String getLargeMultiplicationTable()`
  * `String getMultiplicationTable(int width)`
    
<br><br>
## `String getSmallMultiplicationTable()`
* Descripción
  * Genera un string con la tabla de multiplicar `4 x 4` 
  
### Ejemplo
* Script de muestra

  ```
        // : Given
  
        // : When
        String outcome = TableUtilities.getSmallMultiplicationTable();
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
    1 |  2 |  3 |  4 |
    2 |  4 |  6 |  8 |
    3 |  6 |  9 | 12 |
    4 |  8 | 12 | 16 |
  ```


<br><br>
## `String getLargeMultiplicationTable()`
* Descripción
  * Genera un string con la tabla de multiplicar `10 x 10` 
  
### Ejemplo
* Script de muestra

  ```
        // : Given
  
        // : When
        String outcome = TableUtilities.getLargeMultiplicationTable();
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
    1 |  2 |  3 |  4 |  5 |  6 |  7 |  8 |  9 | 10 |
    2 |  4 |  6 |  8 | 10 | 12 | 14 | 16 | 18 | 20 |
    3 |  6 |  9 | 12 | 15 | 18 | 21 | 24 | 27 | 30 |
    4 |  8 | 12 | 16 | 20 | 24 | 28 | 32 | 36 | 40 |
    5 | 10 | 15 | 20 | 25 | 30 | 35 | 40 | 45 | 50 |
    6 | 12 | 18 | 24 | 30 | 36 | 42 | 48 | 54 | 60 |
    7 | 14 | 21 | 28 | 35 | 42 | 49 | 56 | 63 | 70 |
    8 | 16 | 24 | 32 | 40 | 48 | 56 | 64 | 72 | 80 |
    9 | 18 | 27 | 36 | 45 | 54 | 63 | 72 | 81 | 90 |
    10 | 20 | 30 | 40 | 50 | 60 | 70 | 80 | 90 |100 |
  ```

<br><br>
## `String getMultiplicationTable(int input)`
* Descripción
  * Genera un string con la tabla de multiplicar `n x n` 
  
### Ejemplo 1
* Script de muestra

  ```
        // : Given
        int input = 3;
  
        // : When
        String outcome = TableUtilities.getMultiplicationTable(input);
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
    1 |  2 |  3 |
    2 |  4 |  6 |
    3 |  6 |  9 |
  ```
  
### Ejemplo 2
* Script de muestra

  ```
        // : Given
        int input = 5;
  
        // : When
        String outcome = TableUtilities.getMultiplicationTable(input);
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
    1 |  2 |  3 |  4 |  5 |
    2 |  4 |  6 |  8 | 10 |
    3 |  6 |  9 | 12 | 15 |
    4 |  8 | 12 | 16 | 20 |
    5 | 10 | 15 | 20 | 25 |
  ```
