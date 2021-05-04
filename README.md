# Los socios

![Portada](assets/portada.jpg)

## Antes de empezar: algunos consejos

El enunciado tiene **mucha** información, van a necesitar leerlo varias veces. La sugerencia es que lo lean entero una vez (para tener una idea general) y luego vuelvan a consultarlo las veces que hagan falta.

Concentrensé en los requerimientos y, excepto que se traben mucho, respeten el orden sugerido. No es necesario que hagan TDD, pero sí sería interesante que vayan creando las distintas clases y métodos a medida que resuelven cada requerimiento y no antes.

En otras palabras: trabajen completando cada requerimiento antes de pasar al siguiente, con los tests que aseguran que funciona incluidos. Si al avanzar en los requerimientos les parece necesario refactorizar, adelante, van a tener los tests que garantizan que no rompieron nada. :smirk:

## Descripción del dominio

Una conocida empresa de envíos a domicilios en bicicleta nos pidió elaborar un "simulador de cliente" para estimar cuánta propina van a ganar sus trabajadores o _socios_ (como ellos los llaman para pagar menos impuestos).

Por lo que nos contaron, un/a cliente promedio de la aplicación da propina según el estado de ánimo en el que se encuentre:

* :angry: si está **enojado/a**, no da nada de propina,
* :smiley: si está **feliz**, le deja como propina el 25% de lo que salió el pedido,
* :neutral_face: si está **indiferente**, deja como propina lo que tenga en el bolsillo,
* :mask: si está **resfriado/a**, le invade el sentimiento de culpa y le deja de propina el 100% de lo que salió el pedido.

Además del estado de ánimo, la zona donde vive el o la clienta puede influir en la propina que le deja a la persona que le hace la entrega. Por el momento solo está disponible en unos pocos barrios y no es necesario contemplar la posibilidad de agregar nuevos. Los que están disponibles ahora son:

* **Las Rosas** :rose:: agrega un plus fijo de $50 a la propina,
* **Las Lauchas** :mouse:: reduce a la mitad la propina,
* **Barrio Verde** :money_with_wings:: fija un mínimo de $200 para la propina,
* **Las Torres** :cityscape:: no modifica en nada a la propina.

En todos los casos, las modificaciones que puedan surgir se aplican sobre el valor que resulta del ánimo. Por ejemplo, una clienta resfriada de barrio Las Lauchas dejaría $500 de propina para un pedido de $1000 ($1000 que dejaría por estar resfriada, dividido a la mitad por lo que indica su barrio).

De cada cliente sabemos su estado de ánimo, cuánta plata tiene en el bolsillo y en qué barrio vive. Esas tres cosas tienen que poder modificarse en cualquier momento.

## Requerimientos

Se pide implementar la solución a este problema en Kotlin, junto con los tests que prueben cada uno de los requerimientos.

1. Saber cuánta propina dejaría un/a cliente para un pedido de un determinado importe, teniendo en cuenta su estado de ánimo.
1. Incorporar a la cuenta anterior la variación que pueda surgir según el barrio.

## Créditos

[Enunciado original](https://sites.google.com/site/utndesign/material/guia-de-ejercicios/guia-objetos-patrones/mozo-la-cuenta) creado por Fernando Dodino y el equipo de Diseño de Sistemas de Información para UTN - FRBA. Transformado a Markdown, reformateado, reorganizado el texto y agregados nuevos requerimientos por Federico Aloi para UNaHur.

[![CC BY-SA 4.0][cc-by-sa-image]][cc-by-sa]

Esta obra está bajo una [Licencia Creative Commons Atribución-CompartirIgual 4.0 Internacional][cc-by-sa].

[cc-by-sa]: https://creativecommons.org/licenses/by-sa/4.0/deed.es
[cc-by-sa-image]: https://licensebuttons.net/l/by-sa/4.0/88x31.png
