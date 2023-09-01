import java.util.ArrayList;

public class Taller {
	public static void main(String[] args) {
		new procesosUno();
		
		new procesosDos();
		
		new procesosTres();
		int valor = procesosTres.numeros();
    	System.out.println("Número generado: " + valor);
    	
    	new procesosCuatro();
    	int[] arreglo= {23,10,6,11};
    	procesosCuatro procesos= new procesosCuatro();
        System.out.println("El mayor es: "+ procesos.arreglos(arreglo));

        ArrayList<Integer> ListaNumeros = new ArrayList<Integer>();
        ListaNumeros.add(20);
        ListaNumeros.add(11);
        ListaNumeros.add(23);
        ListaNumeros.add(44);
        ListaNumeros.add(10);
        ListaNumeros.add(13);
        procesosCinco procesos1 = new procesosCinco();
        System.out.println("El mayor es: "+ procesos1.arreglo2(ListaNumeros));
        
        
        int arreglo1[]= new int [10];
        int arreglo2[]= new int[arreglo1.length];
           for (int i = 0; i < arreglo1.length; i++) {
        	   arreglo1[i] = i+1;
        	  }
           for (int i = 0; i < arreglo2.length; i++) {
        	   arreglo2[i] = i+1;
        	  }
        	    procesosSeis procesos11 = new procesosSeis();
        	    int [] suma = procesos11.Arre(arreglo1, arreglo2);
        	    for (int i = 0; i < suma.length; i++) {
        	        System.out.println("La suma de los arrelos es: "+suma[i]);
        	  }

        procesosSiete  run = new procesosSiete();
	    run.iniciar();
	 }
}