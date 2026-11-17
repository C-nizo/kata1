# Kata 1 — IntelliJ IDEA, Java y Git/GitHub

## Objetivo

Esta kata tiene como objetivo practicar el flujo básico de trabajo con IntelliJ IDEA, Java, Maven y Git/GitHub mediante la repetición deliberada de un microproyecto sencillo.

Se han realizado tres repeticiones con un alcance equivalente, introduciendo pequeñas variaciones en la clase de dominio y en el cálculo realizado.

## Tecnologías

- Java 27
- Maven
- IntelliJ IDEA
- Git
- GitHub

El proyecto no utiliza dependencias externas.

El paquete base utilizado es:

```text
software.ulpgc.katas
```

Se utiliza esta convención para mantener una estructura homogénea entre las distintas katas de la asignatura.

## Compilación

Desde la raíz del proyecto:

```bash
mvn clean compile
```

También puede importarse directamente como proyecto Maven en IntelliJ IDEA.

## Ejecución

La aplicación puede ejecutarse desde IntelliJ IDEA ejecutando la clase:

```text
software.ulpgc.katas.Main
```

Durante el desarrollo se utilizó también el shortcut:

```text
Shift + F10
```

para ejecutar la configuración activa.

## Estructura

La versión final contiene principalmente:

```text
src/main/java/software/ulpgc/katas/
├── Main.java
└── Product.java
```

`Product` representa la clase de dominio y contiene los datos y el cálculo correspondiente.

`Main` se limita a crear el objeto, invocar su comportamiento y mostrar el resultado por consola.

## Repeticiones realizadas

### Primera repetición

Se implementó una clase `Product` con:

- nombre;
- precio;
- cantidad;
- cálculo del precio total mediante `totalPrice()`.

Resultado comprobado:

```text
13.5
```

### Segunda repetición

Se sustituyó la entidad por una clase `Book`, manteniendo un alcance equivalente.

Se utilizaron:

- título;
- precio;
- cantidad;
- cálculo del precio total mediante `totalPrice()`.

Resultado comprobado:

```text
22.5
```

### Tercera repetición

Se volvió a utilizar una clase `Product`, introduciendo como pequeña variación el cálculo de un descuento mediante `priceWithDiscount(double discount)`.

Resultado comprobado:

```text
5.6000000000000005
```

El valor corresponde al resultado esperado de `5.6`, con la precisión propia de la representación de valores `double`.

Las diferentes repeticiones pueden consultarse mediante el historial de commits del repositorio.

## Flujo Git utilizado

Se utilizaron dos ramas:

- `develop`: rama habitual de trabajo.
- `master`: rama que contiene las versiones evaluables.

El proceso seguido en cada repetición fue:

1. trabajar en `develop`;
2. realizar el commit correspondiente;
3. hacer `push` a GitHub;
4. integrar `develop` en `master`;
5. hacer `push` de `master`;
6. volver a `develop` para comenzar la siguiente repetición.

El historial contiene commits específicos para identificar la preparación y la implementación de cada repetición.

## Verificación desde un clon limpio

También se comprobó que el repositorio podía clonarse en una carpeta distinta del proyecto original.

Repositorio:

```text
https://github.com/C-nizo/kata1.git
```

Puede clonarse mediante:

```bash
git clone https://github.com/C-nizo/kata1.git
```

Tras abrir el proyecto clonado en IntelliJ IDEA se comprobó que la versión final podía ejecutarse correctamente.

## Verificaciones realizadas

Se ha comprobado:

- la ejecución correcta de las tres repeticiones;
- la salida obtenida por consola;
- la existencia y sincronización de las ramas `develop` y `master`;
- la integración de cada repetición en `master`;
- la correcta publicación de los commits en GitHub;
- la clonación del repositorio en una carpeta limpia;
- la ejecución correcta del proyecto clonado.

## Vídeo explicativo

El enlace al vídeo explicativo se añadirá al README una vez realizada la grabación.