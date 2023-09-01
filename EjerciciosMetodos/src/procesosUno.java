
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class procesosUno{
	public procesosUno() {
		nombre();
	}
	public void nombre() {
		System.out.println("Valentina Aguja Lopez");		 
	}
}


class procesosDos{
	public procesosDos() {
		numero(0);
	}
	public void numero(int num) {
	num=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
		if (num>10) {
			System.out.println(num);	
		}
	}
}


class procesosTres {
	public procesosTres() {
		numeros();
	}
	public static int numeros() {
		Random numero = new Random();
		int valor = numero.nextInt(101);
		return valor;
	}
}


class procesosCuatro {
    int mayor=0;
    public int arreglos(int[] entero){
        for (int i = 0; i < entero.length; i++) {
            if (entero[i] > mayor) {
                mayor = entero[i];
            }
        }
    return mayor;
    }
}


class procesosCinco{
	int mayor=0;
	public Integer arreglo2(ArrayList<Integer> listaNumeros) {
		for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i)> mayor) {
                mayor = listaNumeros.get(i);
        	}
		}
		return mayor;
	}
}
	
class procesosSeis {
    int suma[];
    public  int[] Arre (int[] arreglo1,  int[] arreglo2 ) {
        suma = new int [arreglo1.length];
        for (int i = 0; i < arreglo2.length; i++) {
            suma[i]= arreglo1[i]+ arreglo2[i];
        }
        return suma;
    }

}

class procesosSiete {
    String palabra,opcion,eleccion;
    public void iniciar() {
        menu();
    }

    public void menu() {
        opcion = "desea ver otra palabra";
        opcion += "\n 1. Si";
        opcion += "\n 2. No";
        opcion += "\nIngrese una opcion:";
        do {
            diccionario();
            eleccion = JOptionPane.showInputDialog(opcion);
        } while (!eleccion.equals("2"));
        System.out.println("gracia por utilizar nuestro diccionario");
    }

    public void diccionario() {
        HashMap<String, String> diccionarioIngles = new HashMap<String, String>();
        diccionarioIngles.put("hello","hola");
        diccionarioIngles.put("love","amor");
        diccionarioIngles.put("cat","gato");
        diccionarioIngles.put("dog","perro");
        diccionarioIngles.put("water","agua");
        diccionarioIngles.put("tree","arbol");

        palabra = JOptionPane.showInputDialog("ingrese la palabra que desea buscara");
        validarExistencia(diccionarioIngles, palabra);
    }

    public void validarExistencia(HashMap<String, String> diccionarioIngles, String palabra) {
        if (diccionarioIngles.containsKey(palabra)) {
            System.out.println("la palabra: " + palabra + " Traduce: " +  diccionarioIngles.get(palabra));
        } else {
            System.out.println("la palabra: " + palabra + " no se necuntra en el diccionario");
        }
    }
}



