# NumberUtilities

* Asegura que todos los test en la clase `NumberUtilitiesTest` pasen despues de completar los métodos en la clase `NumberUtilities`:

    * `String getRange(int start, int stop, int step)`
    * `String getEvenNumbers(int start, int stop)`
    * `String getOddNumbers(int start, int stop)`
    * `String getNumbersAt(int start, int stop, int step, int exponent)`


<br><br>
## `String getRange(int stop)`
* Descripción
  * Dado un número entero, `stop`, regresa un string (cadena) con la concatenación de todos los enteros del `0` hasta el `stop` (no inclusivo).
  
### Ejemplo
* Script de muestra

  ```
        // : Given
        Integer stop = "5";
  
        // : When
        String outcome = NumberUtilities.getRange(stop);
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
  "01234"
  ```

<br><br>
## `String getRange(int start, int stop)`
* Descripción
  * Dado dos números enteros, `start` y `stop`, regresa un string con la concatenación de todos los enteros desde el `start` hasta el `stop` (no inclusivo).
  
### Ejemplo
* Script de muestra

  ```
        // : Given
        Integer start = "2";
        Integer stop = "15";
  
        // : When
        String outcome = NumberUtilities.getRange(start, stop);
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
  "234567891011121314"
  ```

<br><br>
## `String getRange(int start, int stop, int step)`
* Descripción
  * Dado tres números enteros, `start`, `stop` y `step`, regresa un string con la concatenación de todos los enteros desde el `start` hasta el `stop` (no inclusivo) con salto definidos por el `step`.
  
### Ejemplo
* Script de muestra

  ```
        // : Given
        Integer start = "5";
        Integer stop = "30";
        Integer step = "5";
  
        // : When
        String outcome = NumberUtilities.getRange(start, stop, step);
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
  "510152025"
  ```  

<br><br>
## `String getEvenNumbers(int start, int stop)`
* Descripción
  * Dado dos números enteros, `start` y `stop`, regresa un string con la concatenación de todos los enteros pares desde el `start` hasta el `stop` (no inclusivo).
  
### Ejemplo
* Script de muestra

  ```
        // : Given
        Integer start = "5";
        Integer stop = "15";
  
        // : When
        String outcome = NumberUtilities.getEvenNumbers(start, stop, step);
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
  "68101214"
  ```
  
<br><br>
## `String getNumbersAt(int start, int stop)`
* Descripción
  * Dado dos números enteros, `start` y `stop`, regresa un string con la concatenación de todos los enteros elevados al exponente `(exponent)` desde el `start` hasta el `stop` (no inclusivo). Para el ejemplo de abajo el cuadrado.
  
### Ejemplo
* Script de muestra

  ```
        // : Given
        Integer start = "2";
        Integer stop = "6";
        Integer exponent = "2";
  
        // : When
        String outcome = NumberUtilities.getNumbersAt(start, stop, step);
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
  "491625"
  ```
