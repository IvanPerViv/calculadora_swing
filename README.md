##Repositorio oficial del alumno Ivan Perez Vivas
**Introducción:**

En primer lugar, a la hora de crear mi calculadora, elegí un diseño que fuese sencillo y legible, sin complicaciones para el usuario.
Cada botón, con su correspondiente número y operaciones, se asemejaba a la calculadora típica que todos reconocemos fácilmente hoy en día. 
Visualmente, es de colores claros, que sea atractiva a la vista, sin cansar demasiado. 

Añadir, que en caso de que el usuario pulsase por error un operando aritmético, le saldrá un mensaje por pantalla, así elimínanos los posibles errores. 

**Código:**

El código elegido a la hora de programar esta calculadora fue sencillo, estructuro un poco los pasos que seguí:

>>En primer lugar, para cada botón, se le asigno el valor precedido mas su propio valor. Así, cada vez que pulsáramos, se iba desplazando a la izquierda.

	pantallaInicial.setText(pantallaInicial.getText() + "2");

>>En el caso de los botones aritméticos (suma, resta, etc), cada vez que pulsaramos en el boton del operando, le asignavamos su valor equivalente.
	
	this.operador_Uno = Float.parseFloat(pantallaInicial.getText());
        this.el_Operador = "+";
        this.pantallaInicial.setText("");

>> Para finalmente, comprobar que valor que era, y proceder hacer la operacion solitida.

	this.operador_Dos = Float.parseFloat(pantallaInicial.getText());
            switch(el_Operador){
                case "+": this.pantallaInicial.setText(Float.toString(operador_Uno + operador_Dos));
                    break;
                case "-": this.pantallaInicial.setText(Float.toString(operador_Uno - operador_Dos));
                    break;
                case "*": this.pantallaInicial.setText(Float.toString(operador_Uno * operador_Dos));
                    break;
                case "/": this.pantallaInicial.setText(Float.toString(operador_Uno / operador_Dos));
                    break;
>> 
