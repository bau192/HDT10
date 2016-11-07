import java.io.File;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.Label;


public class baseDatos {
	
	public static void main(String[] args) 
	
	{
		try{
			/*
			 * Creamos la base de datos.
			 */
				File Directorio=new File("new");
				GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
				GraphDatabaseService db= dbFactory.newEmbeddedDatabase(Directorio);
				System.out.println("Iniciando con exito.");
				
				try (Transaction tx = db.beginTx()) 
				{	
					
					// Creamos el nodo de cada persona. 
					
					Node nodo_1 = db.createNode(etiquetas.PERSONA);
					Node nodo_2 = db.createNode(etiquetas.PERSONA);
					Node nodo_3 = db.createNode(etiquetas.PERSONA);
					Node nodo_4 = db.createNode(etiquetas.PERSONA);
					Node nodo_5 = db.createNode(etiquetas.PERSONA);
					Node nodo_6 = db.createNode(etiquetas.PERSONA);
					Node nodo_7 = db.createNode(etiquetas.PERSONA);
					Node nodo_8 = db.createNode(etiquetas.PERSONA);
					Node nodo_9 = db.createNode(etiquetas.PERSONA);
					Node nodo_10 = db.createNode(etiquetas.PERSONA);
					Node nodo_11 = db.createNode(etiquetas.PERSONA);
					Node nodo_12 = db.createNode(etiquetas.PERSONA);
					Node nodo_13 = db.createNode(etiquetas.PERSONA);
					Node nodo_14 = db.createNode(etiquetas.PERSONA);
					System.out.println("Nodos credos.");
					
					
					// Ajustamos sus propiedades
					
					
					Relationship relationship_1 = nodo_1.createRelationshipTo(nodo_2,relaciones.NUM_CORREOS); // Establece que hay una relacion entre odo_1 y nodo_2
					
					relationship_1.setProperty("Correos:","3"); // Colocamos el numero de correos que existen entre estas personas.
					
					System.out.println("Relaciones creadas.");
					
					System.out.println("Finalizado con exito");
					tx.success();
				}
				
		}
		
		catch(Exception e){
			System.out.println("Finalizado sin exito");
		}
		
		
	}
}