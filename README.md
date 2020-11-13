##Repositorio oficial del alumno Ivan Perez Vivas
**Introducci�n:**

En primer lugar, a la hora de crear mi calculadora, eleg� un dise�o que fuese sencillo y legible, sin complicaciones para el usuario.
Cada bot�n, con su correspondiente n�mero y operaciones, se asemejaba a la calculadora t�pica que todos reconocemos f�cilmente hoy en d�a. 
Visualmente, es de colores claros, que sea atractiva a la vista, sin cansar demasiado. 

A�adir, que en caso de que el usuario pulsase por error un operando aritm�tico, le saldr� un mensaje por pantalla, as� elim�nanos los posibles errores. 

**C�digo:**

El c�digo elegido a la hora de programar esta calculadora fue sencillo, estructuro un poco los pasos que segu�:

>>En primer lugar, para cada bot�n, se le asigno el valor precedido mas su propio valor. As�, cada vez que puls�ramos, se iba desplazando a la izquierda.

	pantallaInicial.setText(pantallaInicial.getText() + "2");

>>En el caso de los botones aritm�ticos (suma, resta, etc), cada vez que pulsaramos en el boton del operando, le asignavamos su valor equivalente.
	
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
