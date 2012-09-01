import java.util.Collection;//se importa una clase de java para utilizar el Collection
import java.util.Arrays;//se importa una clase de java para funciones con arreglos
import java.util.List;//se importa una clase de java para crear una lista 
import java.util.ArrayList;//se importa una clase para usar los arreglos de listas.

class Test{//clase principal
    static TestInterno resumir(Collection<TestInterno> c){//funcion resumir compartida ,le paso un Testinterno
        String ans = "";//declaracion de una  variable String ans  inicalizada como vacia
        int total = 0;//declaracion de una  variable entero total  inicalizada en 0
        for(TestInterno t : c){//for para iterar por test interno de t 
            total += t.a;//suma los enteros
            ans += t.b;//concatena las cadenas
        }
        return new TestInterno(total, ans);//retorna un nuevo Test interno con las nuevas  cadenas y un nuevo entero
    }

    public static void main(String[] args){//funcion main con paramtro String 
        List<TestInterno> lista = new ArrayList<TestInterno>();//crea una nueva lista Test interno
        while(true){//ciclo que simpre se va ha cumplir
            int i = Integer.parseInt(System.console().readLine());//ingreso por consola de un entero
            String j = System.console().readLine();//ingreso por consola cadena de texto
            lista.add(new TestInterno(i,j));// crea un nuevo  Test interno y lo add ha la lista
            lista.get(lista.size()-1).calcular((int)(3*Math.random()));//va hasta la ultima lista de Testinterno y calcula  cambia los nuevos Testinterno por un numero aleario de  1 a 3

            TestInterno a = resumir(lista);//le aplica la funcion resumir en Test Interno, coge todos los enteros ingresados y cadenas
            System.out.println(">"+a.a);//muestra a
            System.out.println(">"+a.b);//muestra a

            TestInterno total = new TestInterno(0, "");//crea un test interno con un entero inicializado en 0 , y una cadena vacia
            for(TestInterno t : lista){//itera por la lista de Test interno
                TestInterno actual = resumir(Arrays.asList(t.c));//le aplica la funcion ha los que estan dentro de la lista
                total.a += actual.a;//resume ha un total lo q hay  a 
                total.b += actual.b;//resume ha un total lo q hay en b
            }

            System.out.println("->"+total.a);//imprime total apuntando ha a
            System.out.println("->"+total.b);   //imprime total apuntando ha b         
        }
    }
}//CIERRA LA CLASE
//Bueno mirando y revisando el programa ,ingreso un entero una cadena, 
//en el primer estado me vota lo que ingrese despues   este concatena una cadena y suma el entero ,
//despues me vota un numero aleatorio ,y depues una cadena hexadeximal que tambien se va concatenando ,
//con la anterior asi repetidamente porque esta dentro de un while que es true asi que hay un bucle infinito.
