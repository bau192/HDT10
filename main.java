
import java.util.Scanner;

public class main 
{


	
	private static Scanner scan;

	public static void main(String[] args)
	{
		
	scan = new Scanner( System.in );
	String seleccion="";
	int llave=0;
	while(llave==0)
	{
		
	
	try
		{
	System.out.println("\nSeleccione una de las siguientes opciones \n");
	System.out.println("1)Visualizar el Grafo de Selecciones");
	System.out.println("2)Visualizar aquellas relaciones que tienen mas de 6 correos");	
	System.out.println("3)Simplificar el grafo, eliminando las relaciones en las que una persona se auto envio un correo");
	System.out.println("\n4)Brindar una metrica al estilo del algoritmo page-rank");
	System.out.println("5)Mostrar las personas mas comunicadas y las menos comunicadas.");
	System.out.println("6)Mostrar la cantidad minima de correos que ha enviado una persona directa e indirectamente");
	System.out.println("7) Salir");
	seleccion=scan.nextLine();
	
	if(seleccion.equals("1"))
	{
			try {
				grafo frame = new grafo();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}
	if(seleccion.equals("2"))
	{
		
	}
	if(seleccion.equals("3"))
	{
		
	}
	if(seleccion.equals("4"))
	{
		
	}
	if(seleccion.equals("5"))
	{
		
	}
	if(seleccion.equals("6"))
	{	
		
		
	}
	
	if(seleccion.equals("7"))
	{	
		llave=1;	
	}
	
		
	}catch(Exception e)
		{
			System.err.println("No seleccionaste una opcion valida" + e.getMessage());
		}
	}
	}	
}

