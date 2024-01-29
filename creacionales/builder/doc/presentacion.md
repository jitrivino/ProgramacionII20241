---
marp: true
header: <div class="encabezado"><img src='imagenes/franjaSuperior.png'  /><div class="titulo"><h1 class="texto"></h1></div></div>
footer: '![image](imagenes/franjaInferior.png)' 
_header: '' 
_footer: '' 
paginate: true
_paginate: false
_backgroundImage: url('imagenes/fondo.png')
style: |

  .encabezado {
    position: relative; left: 0; top:0;display: inline-block; text-align: center;
  }
  .titulo {
    position: absolute; top: 40%; left: 50%; transform: translate(0%, -50%); color: gray;
  }
  .columns {
    display: grid;
    grid-template-columns: repeat(2, minmax(0, 1fr));
    gap: 1rem;
  }
  .texto:after {
    content: 'Titulo';
  }
  
  h1 { color: black }
---

<div style="position: absolute; left: 30%; top:45%; width: 70%; text-align: left"><h1 style="color: gray">Programación II</h1></div>
<div style="position: absolute; left: 30%; top:55%; width: 70%; text-align: left"><h5 style="color: gray">Área de programación<br />
Programa de Ingeniería de Sistemas y Computación<br />
Facultad de Ingeniería
</h5></div>

<div style="position: absolute; left: 45%; top:20%; background-color: rgb(212, 231, 205); width: 550px; display:table-cell; text-align: center; padding: 30px 0;">
<b>
<h2>Builder</h2>
</b>
</div>


<div style="position: absolute; left: 93%; top:10px; ">

![width:80](imagenes/licencia.png)
</div>

---

<style scoped>
.texto:after {
    content: 'Contenido';
  }
</style>

- Problema
- Solución
- Ventajas
- Desventajas

---

<style scoped>
.texto:after {
    content: 'Builder - Problema';
  }
</style>

## Creación de objetos complejos
 Cuando se vuelve difícil manejar todas las combinaciones posibles de parámetros de construcción debido que el proceso de  creación del objeto implica pasos complicados donde en cada paso las partes del objeto pueden variar.

---

<style scoped>
.texto:after {
    content: 'Builder - Problema';
  }
</style>

## Evitar errores

En situaciones donde los objetos son muy complejos y el número de parámetros así como su similitud aumenta la probabilidad de errores durante su invocación.

---

<style scoped>
.texto:after {
    content: 'Builder - Problema';
  }
</style>

## Creación de diferentes tipos concretos
En casos en los que, puede tener varios sub tipo de una clase (hijos), y se necesita un proceso de construcción flexible para crear las instancias de manera independiente.

---

<style scoped>
.texto:after {
    content: 'Builder - Problema';
  }
</style>

## Separación de la construcción y la clase

Cuando se quiere tener un control más fino sobre cómo se construye un objeto sin tener que cambiar la clase del objeto en sí.


---

<style scoped>
.texto:after {
    content: 'Builder - Problema';
  }
</style>

## ¿ Cómo se puede construir un objeto paso a paso sin interferir con la clase del objeto en si mismo y permitír que el mismo proceso de construcción cree diferentes representaciones del objeto. ?

---

<style scoped>
.texto:after {
    content: 'Builder - Solución';
  }
</style>

- Define una interfaz abstracta para construir partes del producto (Builder).
- Implementar la interfaz del Builder para proporcionar la implementación concreta que permita construir las partes del objeto.


---


<style scoped>
.texto:after {
    content: 'Builder - Ventajas';
  }
</style>

- Separación de la construcción y de la clase
- Facilita la construcción paso a paso
- Flexibilidad y variabilidad
- Mejora la legibilidad del código
- Permite la construcción de objetos inmutables

<!-- 
Separación de la construcción y representación: El patrón Builder permite separar el proceso de construcción de un objeto complejo de su representación. Esto facilita la variación de la representación del objeto sin cambiar la lógica de construcción.
Facilita la construcción paso a paso: Permite la construcción de un objeto complejo paso a paso, facilitando la configuración y personalización de cada parte del objeto.
Flexibilidad y variabilidad: Puede crear diferentes configuraciones del mismo objeto utilizando distintos constructores concretos. Esto proporciona flexibilidad y variabilidad en la creación del objeto.
Mejora la legibilidad del código: Al utilizar el patrón Builder, el código de construcción puede ser más legible y expresivo, ya que cada paso de construcción tiene su propio método.
Permite la construcción de objetos inmutables: En algunos casos, el patrón Builder se utiliza para construir objetos inmutables, lo que puede ser beneficioso en términos de seguridad y concurrencia.
-->
---

<style scoped>
.texto:after {
    content: 'Builder - Desventajas';
  }
</style>

- Complejidad adicional
- Más código para mantener
- Dependencia de la implementación
- Requiere una comprensión sólida del diseño

<!-- 
Complejidad adicional: Introducir un patrón Builder puede aumentar la complejidad del código, especialmente si la construcción del objeto no es muy compleja o variable. En algunos casos, la simplicidad puede perderse en favor de la flexibilidad.
Necesidad de crear una interfaz Builder: Se debe crear una interfaz específica para el Builder y las clases concretas que implementan esta interfaz. Esto agrega un nivel adicional de abstracción y puede aumentar la cantidad de clases en el sistema.
Más código para mantener: Con el patrón Builder, puede haber más clases y métodos que mantener, lo que puede aumentar la carga de mantenimiento del código en comparación con un enfoque más simple.
Dependencia de la implementación: Si hay cambios en la interfaz del producto, todos los constructores concretos deben ajustarse para cumplir con la nueva interfaz. Esto puede ser una desventaja si la interfaz del producto cambia con frecuencia.
Requiere una comprensión sólida del diseño: La implementación correcta del patrón Builder requiere una comprensión sólida del diseño de software y puede no ser la mejor opción para proyectos más simples o para desarrolladores menos experimentados
-->

---

<!-- 
_header: ''
_footer: '' 
_paginate: false
_backgroundImage: url('imagenes/gracias.png')
-->
