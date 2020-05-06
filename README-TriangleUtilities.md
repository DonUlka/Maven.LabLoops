# TriangleUtilities

* Asegura que todos los test en la clase `TriangleUtilitiesTest` pasen después de completar los métodos en la clase `TriangleUtilities`:
  * `String getRow(int numberOfStars)`
  * `String getSmallTriangle()`
  * `String getLargeTriangle()`
  * `String getTriangle(int numberOfRows)`
    
<br><br>
## `String getRow(int numberOfStars)`
* Descripción
  * Dado un número entero, `numberOfStars`, regresa una fila de `*`.
  
### Ejemplo
* Script de muestra

  ```
        // : Given
        Integer numberOfStars = 10;
  
        // : When
        String outcome = TriangleUtilities.getRow(numberOfStars);
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
  "**********"
  ```

<br><br>
## `String getSmallTriangle(int numberOfStars)`
* Descripción
  * Regresa un triángulo pequeño con altura y base de 5 `*`.
  
### Ejemplo
* Script de muestra

  ```
        // : Given
  
        // : When
        String outcome = TriangleUtilities.getSmallTriangle();
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
  "*"
  "**"
  "***"
  "****"
  "*****"
  ```

<br><br>
## `String getLargeTriangle(int numberOfStars)`
* Descripción
  * Regresa un triángulo grande con altura y base de 10 `*`.
  
### Ejemplo
* Script de muestra

  ```
        // : Given
  
        // : When
        String outcome = TriangleUtilities.getLargeTriangle();
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
  "*"
  "**"
  "***"
  "****"
  "*****"
  "******"
  "*******"
  "********"
  "*********"
  "**********"
  ```

<br><br>
## `String getTriangle(int numberOfRows)`
* Descripción
  * Regresa un triángulo con altura y base definida por `numberOfRows`.
  
### Ejemplo
* Script de muestra

  ```
        // : Given
        int numberOfRows = 12;
  
        // : When
        String outcome = TriangleUtilities.getTriangle(numberOfRows);
  
        // : Then
         System.out.println(outcome);
  ```
* Salida
  ```
  "*"
  "**"
  "***"
  "****"
  "*****"
  "******"
  "*******"
  "********"
  "*********"
  "**********"
  "***********"
  "************"
  ```
