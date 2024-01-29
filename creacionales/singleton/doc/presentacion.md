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
<h2>Singleton</h2>
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
    content: 'Singleton - Problema';
  }
</style>

## Control de acceso global 
Cuando se requiere un punto de acceso global a una instancia, que otros objetos puedan acceder de manera consistente desde cualquier lugar del programa.

---

<style scoped>
.texto:after {
    content: 'Singleton - Problema';
  }
</style>

## Un único punto de coordinación

En situaciones donde es necesario tener un único punto de coordinación dentro de un sistema, el cual sirva de controlador central para gestionar y coordinar diversas actividades.

---

<style scoped>
.texto:after {
    content: 'Singleton - Problema';
  }
</style>

## Conservación de recursos
En casos en los que la creación de múltiples instancias de una clase es costosa en términos de recursos (como la conexión a una base de datos o la carga de configuraciones).

---

<style scoped>
.texto:after {
    content: 'Singleton - Problema';
  }
</style>

## Gestión de configuraciones

Cuando se requiera gestionar configuraciones globales de la aplicación, las cuales por su naturaleza requieren ser accedidas y modificadas desde cualquier punto de la aplicación.


---

<style scoped>
.texto:after {
    content: 'Singleton - Problema';
  }
</style>

## ¿ Cómo podemos restringir la instanciación de una clase a un solo objeto y garantizar que no haya más instancias creadas ?

---

<style scoped>
.texto:after {
    content: 'Singleton - Solución';
  }
</style>

Garantiza que una clase tenga una única instancia y proporciona un punto global de acceso a ella.

- Restringir la creación de instancias de la clase. Por ejemplo modificando el acceso del constructor de la clase.
- Crear una instancia estática de la clase.
- Proveer una forma de accesarla desde cualquier punto del programa.

---


<style scoped>
.texto:after {
    content: 'Singleton - Ventajas';
  }
</style>

- Única instancia
- Acceso global
- Conservación de recursos
- Control de inicialización
- Fácil implementación

<!-- 

-->
---

<style scoped>
.texto:after {
    content: 'Singleton - Desventajas';
  }
</style>

- Fuerte acoplamiento
- Dificulta las pruebas
- Manejo de hilos
- Dificil de extender (limita la flexibilidad)
- Encubre problemas de diseño
- Fomenta el uso global de datos

<!-- 
Acoplamiento fuerte: El uso de un Singleton puede introducir acoplamiento fuerte en el código, ya que muchos componentes pueden depender de la misma instancia global. Esto puede hacer que el código sea menos modular y más difícil de mantener.
Testabilidad: Debido a que los Singleton a menudo se acceden globalmente, pueden complicar la realización de pruebas unitarias. Las dependencias globales pueden dificultar la sustitución de instancias para realizar pruebas unitarias aisladas.
Manejo de hilos (threads): Si no se manejan adecuadamente, los Singletons pueden causar problemas en entornos multihilo. Si dos hilos intentan crear la instancia del Singleton al mismo tiempo, podría resultar en la creación de dos instancias, violando el propósito del patrón.
Dificultad para extender: A veces, puede resultar complicado extender o heredar de una clase que utiliza el patrón Singleton. Esto puede limitar la flexibilidad y la capacidad de extensión del código.
Fomenta el uso global: El Singleton fomenta el acceso global a su instancia única, lo cual puede ir en contra de los principios de diseño que promueven la encapsulación y la reducción de dependencias.
Encubrimiento de problemas de diseño: El uso excesivo del patrón Singleton puede ser un indicador de problemas subyacentes en el diseño de la aplicación. En lugar de abordar estos problemas, el Singleton podría utilizarse como una solución rápida, lo que puede llevar a un diseño menos claro y menos mantenible.
-->

---

<!-- 
_header: ''
_footer: '' 
_paginate: false
_backgroundImage: url('imagenes/gracias.png')
-->
