# DI04_Usability

Para la realización de este proyecto, se ha reutilizado el código entregado para la Tarea de la Unidad 1. 
En primer luegar, se ha realizado una lectura de los objetivos y requerimientos de la tarea y del PowerPoint de Support Notes, para tener una visión general de la unidad. 

--- Look & Feel ---
A continuación, hemos descargado un tema prediseñado desde https://www.formdev.com/flatlaf/, añadiendo la correspondiente dependencia al Pom. De los temas que incorpora, nos hemos decantado por el tema Darcula, similar al que utiliza IntelliJ. Hemos comenzadoa experimentar con el rediseño de algunos componentes. Por ejemplo, escogiendo un estilo redondeado para los botones y una forma sólida para las flechas.

Se ha añadido un borde sólido que resalta el elemento que está usando el usuario. 
Se ha añadido botones a las barras de scroll y se les ha dado el mismo aspecto redondeado que el resto de componentes. 

Se ha redistribuido la ubicación de los distintos elementos dentro de la aplicación. 

--- Fonts ---
Se ha añadido a la carpeta resources, una nueva carpeta Fonts. Hemos descargado desde https://www.dafont.com/es/quitars.font, la fuente Quitars, con uso personal. Es una fuente con un look moderno, pero con buena legibilidad. 

Hemos creado una nueva clase, CustomFontLoader, para cargar esta fuente desde el archivo y registrarla en el GraphicsEnvironment. Desde el main, llamamos al método pasando como parámetro el tamaño de la fuente para crear tres fuentes custom distintas, una pequeña, una mediana y una grande. 