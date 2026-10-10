# Kata 1 - Familiarización con IntelliJ IDEA y flujo básico de trabajo

## Objetivo

El objetivo de esta kata es practicar el flujo básico de desarrollo con IntelliJ IDEA, Java, Git y GitHub mediante la creación repetida de un microproyecto sencillo.

A lo largo de las distintas repeticiones se ha practicado la creación y ejecución de clases Java, el uso de shortcuts de IntelliJ IDEA, la depuración mediante breakpoints, la refactorización y el trabajo con las ramas `develop` y `master` de Git.

## Requisitos y entorno

- JDK 27
- IntelliJ IDEA
- Maven
- Git

El proyecto utiliza Maven y está configurado para compilar con Java 27 mediante el fichero `pom.xml`.

No se utilizan dependencias externas.

## Estructura del proyecto

```text
kata1/
├── src/
│   └── main/
│       └── java/
│           └── software/
│               └── ulpgc/
│                   ├── Main.java
│                   └── Product.java
├── .gitignore
├── pom.xml
└── README.md
```

La versión final contiene:

- `Product`: clase de dominio con los atributos `name`, `price` y `quantity`, constructor, métodos de consulta y un método para calcular el precio total aplicando un descuento.
- `Main`: crea una instancia de `Product`, invoca su comportamiento y muestra el resultado por consola.

## Compilación y ejecución

1. Abrir el proyecto en IntelliJ IDEA.
2. Configurar JDK 27 como SDK del proyecto.
3. Cargar el proyecto Maven a partir de `pom.xml`.
4. Compilar el proyecto mediante **Build Project** (`Ctrl + F9`).
5. Abrir `Main.java` y ejecutarlo mediante `Shift + F10`.

## Repeticiones realizadas

La kata se realizó tres veces manteniendo un alcance equivalente e introduciendo únicamente pequeñas variaciones.

### Repetición 1 - Product

Se creó una clase `Product` con:

- `name`
- `price`
- `quantity`

El método derivado calculaba el precio total:

```java
totalPrice()
```

Durante esta repetición se practicó también una refactorización mediante IntelliJ, renombrando el método original `calculateTotalPrice()` a `totalPrice()`.

### Repetición 2 - Book

Se cambió la entidad a `Book`, manteniendo un nivel de complejidad equivalente.

Sus atributos fueron:

- `title`
- `price`
- `quantity`

El método:

```java
totalPrice()
```

calculaba el precio total de los ejemplares.

### Repetición 3 - Product con descuento

Se volvió a utilizar la entidad `Product`, introduciendo una pequeña variación en el cálculo derivado.

El método:

```java
priceWithDiscount(double discount)
```

recibe un porcentaje de descuento y calcula el precio total después de aplicarlo.

## Shortcuts y funcionalidades de IntelliJ IDEA practicados

- `Alt + Insert`: generar constructor y métodos de acceso.
- `Ctrl + Alt + L`: formatear el código.
- `Shift + F10`: ejecutar el programa.
- `Shift + F9`: ejecutar en modo Debug.
- `F8`: avanzar una línea mediante Step Over.
- `F9`: continuar la ejecución hasta el siguiente breakpoint.
- `Alt + F8`: evaluar una expresión durante la depuración.
- `Shift + F6`: renombrar mediante refactorización.

También se utilizaron los live templates:

- `main`: generación del método `main`.
- `sout`: generación de `System.out.println()`.

## Depuración y verificación

En las repeticiones se utilizaron breakpoints en el constructor de la clase de dominio y en el método de cálculo.

Durante la depuración se comprobaron los valores de los atributos y parámetros y se utilizó **Evaluate Expression** para verificar los cálculos antes de continuar la ejecución.

Después de las modificaciones y refactorizaciones se volvió a ejecutar el programa para comprobar que el comportamiento seguía siendo correcto.

## Flujo Git y GitHub

El proyecto utiliza dos ramas:

- `master`: contiene la versión final evaluable.
- `develop`: se utiliza como rama habitual de trabajo.

El flujo seguido en las repeticiones fue:

1. Trabajar sobre `develop`.
2. Realizar commits con los cambios relevantes.
3. Verificar el funcionamiento del programa.
4. Cambiar a `master`.
5. Integrar `develop` en `master`.
6. Hacer push de ambas ramas al repositorio remoto de GitHub.

El historial de commits permite identificar las distintas repeticiones de la kata y la evolución del proyecto.

## Clonación y comprobación desde una carpeta limpia

El repositorio se clonó desde GitHub en una carpeta distinta a la del proyecto original mediante:

```bash
git clone https://github.com/C-nizo/kata1.git kata1-clone-test
```

Después se abrió el proyecto clonado en IntelliJ IDEA y se comprobó que:

- el proyecto se reconoce correctamente como proyecto Maven;
- utiliza OpenJDK 27 como SDK;
- `pom.xml` configura Java 27 como versión de compilación;
- el proyecto compila correctamente;
- `Main` puede ejecutarse desde la copia clonada sin depender de la carpeta original.

La prueba de clonación se completó correctamente.

## Vídeo explicativo

**Pendiente de añadir el enlace al vídeo explicativo.**