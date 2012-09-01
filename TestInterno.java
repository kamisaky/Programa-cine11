class TestInterno{//nombre de la clase secundaria donde se puede observar unas declaraciones,una funcion calcular y un constructor.
    int a;//declaracion variable de un entero a
    String b;//declara variable de una cadena de texto
    TestInterno[] c;//declara el arreglo test interno 

    TestInterno(int a, String b){//constructor test interno con dos parametros un entero y un string
        this.a=a;//para diferencia a del objeto de la clase al del parametro
        this.b=b;//para diferencia a del objeto de la clase al del parametro
    }

    void calcular(int size){//funcion calcular ,con parametro de un entero llamado size o tama;o en espa;ol
        c = new TestInterno[size];//crea un objeto c en el arreglo test interno
        for(int i = 0; i<size; i++){//un for que inicializa en 0 hasta el tamano del parametro y va incrementanto de 1 en 1
            c[i] = new TestInterno((int)(100*Math.random()), Long.toHexString(Double.doubleToLongBits(Math.random())));//  genera una cadena de texto hexadecimal  aleatoria de tamaño  de 1 a 100 en  Test interno
        }
    }
}//CIERRA LA CLASE
