import java.io.File;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class baseDeDatos {
public static void main(String[] args) {
	
	File Directorio=new File("C:\\Users\\hermanos\\Documents\\UVG\\Cuarto Semestre\\Semana 18\\Algoritmos\\base de datos");
	GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
	GraphDatabaseService db= dbFactory.newEmbeddedDatabase(Directorio);
	try (Transaction tx = db.beginTx()) {
			
		Node Per_1 = db.createNode(Etiquetas.PERSONA);
		Node Per_2 = db.createNode(Etiquetas.PERSONA);
		Node Per_3 = db.createNode(Etiquetas.PERSONA);
		Node Per_4 = db.createNode(Etiquetas.PERSONA);
		Node Per_5 = db.createNode(Etiquetas.PERSONA);
		Node Per_6 = db.createNode(Etiquetas.PERSONA);
		Node Per_7 = db.createNode(Etiquetas.PERSONA);
		Node Per_8 = db.createNode(Etiquetas.PERSONA);
		Node Per_9 = db.createNode(Etiquetas.PERSONA);
		Node Per_10 = db.createNode(Etiquetas.PERSONA);
		Node Per_11 = db.createNode(Etiquetas.PERSONA);
		Node Per_12 = db.createNode(Etiquetas.PERSONA);
		Node Per_13 = db.createNode(Etiquetas.PERSONA);
		Node Per_14 = db.createNode(Etiquetas.PERSONA);
		System.out.println("Nodos creados.");
		
		
		// Ajustamos sus propiedades
		
		
		Relationship relationship_11 = Per_1.createRelationshipTo(Per_2,Relaciones.NUM_CORREOS); // Establece que hay una relacion entre odo_1 y nodo_2
		Relationship relationship_12 = Per_1.createRelationshipTo(Per_3,Relaciones.NUM_CORREOS);
		Relationship relationship_13 = Per_1.createRelationshipTo(Per_9,Relaciones.NUM_CORREOS);
		Relationship relationship_14 = Per_1.createRelationshipTo(Per_14,Relaciones.NUM_CORREOS);
		
		relationship_11.setProperty("Correos:","3"); // Colocamos el numero de correos que existen entre estas personas.
		relationship_12.setProperty("Correos:","2");
		relationship_13.setProperty("Correos:","6");
		relationship_14.setProperty("Correos:","1");
		
		Relationship relationship_21 = Per_2.createRelationshipTo(Per_1,Relaciones.NUM_CORREOS);
		Relationship relationship_22 = Per_2.createRelationshipTo(Per_3,Relaciones.NUM_CORREOS);
		Relationship relationship_23 = Per_2.createRelationshipTo(Per_4,Relaciones.NUM_CORREOS);
		Relationship relationship_24 = Per_2.createRelationshipTo(Per_12,Relaciones.NUM_CORREOS);
		
		relationship_21.setProperty("Correos:","5");
		relationship_22.setProperty("Correos:","8");
		relationship_23.setProperty("Correos:","2");
		relationship_24.setProperty("Correos:","1");
		
		Relationship relationship_31 = Per_3.createRelationshipTo(Per_1,Relaciones.NUM_CORREOS);
		Relationship relationship_32 = Per_3.createRelationshipTo(Per_4,Relaciones.NUM_CORREOS);
		
		relationship_31.setProperty("Correos:","5");
		relationship_32.setProperty("Correos:","2");
		
		Relationship relationship_41 = Per_4.createRelationshipTo(Per_5,Relaciones.NUM_CORREOS);
		Relationship relationship_42 = Per_4.createRelationshipTo(Per_6,Relaciones.NUM_CORREOS);
		Relationship relationship_43 = Per_4.createRelationshipTo(Per_11,Relaciones.NUM_CORREOS);
		Relationship relationship_44 = Per_4.createRelationshipTo(Per_13,Relaciones.NUM_CORREOS);
		Relationship relationship_45 = Per_4.createRelationshipTo(Per_14,Relaciones.NUM_CORREOS);
		
		relationship_41.setProperty("Correos:","5");
		relationship_42.setProperty("Correos:","7");
		relationship_43.setProperty("Correos:","2");
		relationship_44.setProperty("Correos:","3");
		relationship_45.setProperty("Correos:","7");
		
		
		Relationship relationship_51 = Per_5.createRelationshipTo(Per_4,Relaciones.NUM_CORREOS);
		Relationship relationship_52 = Per_5.createRelationshipTo(Per_6,Relaciones.NUM_CORREOS);
		Relationship relationship_53 = Per_5.createRelationshipTo(Per_11,Relaciones.NUM_CORREOS);
		Relationship relationship_54 = Per_5.createRelationshipTo(Per_12,Relaciones.NUM_CORREOS);
		Relationship relationship_55 = Per_5.createRelationshipTo(Per_13,Relaciones.NUM_CORREOS);
		Relationship relationship_56 = Per_5.createRelationshipTo(Per_14,Relaciones.NUM_CORREOS);
		
		relationship_51.setProperty("Correos:","2");
		relationship_52.setProperty("Correos:","6");
		relationship_53.setProperty("Correos:","4");
		relationship_54.setProperty("Correos:","3");
		relationship_55.setProperty("Correos:","7");
		relationship_56.setProperty("Correos:","9");
		
		Relationship relationship_61 = Per_6.createRelationshipTo(Per_4,Relaciones.NUM_CORREOS);
		Relationship relationship_62 = Per_6.createRelationshipTo(Per_5,Relaciones.NUM_CORREOS);
		Relationship relationship_63 = Per_6.createRelationshipTo(Per_12,Relaciones.NUM_CORREOS);
		Relationship relationship_64 = Per_6.createRelationshipTo(Per_13,Relaciones.NUM_CORREOS);
		
		relationship_61.setProperty("Correos:","6");
		relationship_62.setProperty("Correos:","2");
		relationship_63.setProperty("Correos:","7");
		relationship_64.setProperty("Correos:","7");
		
		Relationship relationship_71 = Per_7.createRelationshipTo(Per_8,Relaciones.NUM_CORREOS);
		Relationship relationship_72 = Per_7.createRelationshipTo(Per_9,Relaciones.NUM_CORREOS);
		Relationship relationship_73 = Per_7.createRelationshipTo(Per_11,Relaciones.NUM_CORREOS);
		
		
		relationship_71.setProperty("Correos:","12");
		relationship_72.setProperty("Correos:","13");
		relationship_73.setProperty("Correos:","1");
		
		Relationship relationship_81 = Per_8.createRelationshipTo(Per_6,Relaciones.NUM_CORREOS);
		Relationship relationship_82 = Per_8.createRelationshipTo(Per_7,Relaciones.NUM_CORREOS);
		Relationship relationship_83 = Per_8.createRelationshipTo(Per_9,Relaciones.NUM_CORREOS);
		Relationship relationship_84 = Per_8.createRelationshipTo(Per_10,Relaciones.NUM_CORREOS);
		
		
		relationship_81.setProperty("Correos:","3");
		relationship_82.setProperty("Correos:","14");
		relationship_83.setProperty("Correos:","21");
		relationship_84.setProperty("Correos:","2");
		
		Relationship relationship_91 = Per_9.createRelationshipTo(Per_5,Relaciones.NUM_CORREOS);
		Relationship relationship_92 = Per_9.createRelationshipTo(Per_7,Relaciones.NUM_CORREOS);
		Relationship relationship_93 = Per_9.createRelationshipTo(Per_8,Relaciones.NUM_CORREOS);
		
		relationship_91.setProperty("Correos:","4");
		relationship_92.setProperty("Correos:","12");
		relationship_93.setProperty("Correos:","23");
		
		Relationship relationship_101 = Per_10.createRelationshipTo(Per_4,Relaciones.NUM_CORREOS);
		Relationship relationship_102 = Per_10.createRelationshipTo(Per_5,Relaciones.NUM_CORREOS);
		Relationship relationship_103 = Per_10.createRelationshipTo(Per_6,Relaciones.NUM_CORREOS);
		Relationship relationship_104 = Per_10.createRelationshipTo(Per_7,Relaciones.NUM_CORREOS);
		Relationship relationship_105 = Per_10.createRelationshipTo(Per_11,Relaciones.NUM_CORREOS);
		Relationship relationship_106 = Per_10.createRelationshipTo(Per_12,Relaciones.NUM_CORREOS);
		Relationship relationship_107 = Per_10.createRelationshipTo(Per_13,Relaciones.NUM_CORREOS);
		Relationship relationship_108 = Per_10.createRelationshipTo(Per_14,Relaciones.NUM_CORREOS);
		
		relationship_101.setProperty("Correos:","9");
		relationship_102.setProperty("Correos:","7");
		relationship_103.setProperty("Correos:","1");
		relationship_104.setProperty("Correos:","1");
		relationship_105.setProperty("Correos:","5");
		relationship_106.setProperty("Correos:","4");
		relationship_107.setProperty("Correos:","8");
		relationship_108.setProperty("Correos:","7");
		
		Relationship relationship_111 = Per_11.createRelationshipTo(Per_4,Relaciones.NUM_CORREOS);
		Relationship relationship_112 = Per_11.createRelationshipTo(Per_6,Relaciones.NUM_CORREOS);
		Relationship relationship_113 = Per_11.createRelationshipTo(Per_10,Relaciones.NUM_CORREOS);
		Relationship relationship_114 = Per_11.createRelationshipTo(Per_13,Relaciones.NUM_CORREOS);
		Relationship relationship_115 = Per_11.createRelationshipTo(Per_14,Relaciones.NUM_CORREOS);
		
		relationship_111.setProperty("Correos:","4");
		relationship_112.setProperty("Correos:","1");
		relationship_113.setProperty("Correos:","1");
		relationship_114.setProperty("Correos:","9");
		relationship_115.setProperty("Correos:","1");
		
		
		Relationship relationship_121 = Per_12.createRelationshipTo(Per_4,Relaciones.NUM_CORREOS);
		Relationship relationship_122 = Per_12.createRelationshipTo(Per_5,Relaciones.NUM_CORREOS);
		Relationship relationship_123 = Per_12.createRelationshipTo(Per_6,Relaciones.NUM_CORREOS);
		Relationship relationship_124 = Per_12.createRelationshipTo(Per_10,Relaciones.NUM_CORREOS);
		Relationship relationship_125 = Per_12.createRelationshipTo(Per_11,Relaciones.NUM_CORREOS);
		Relationship relationship_126 = Per_12.createRelationshipTo(Per_13,Relaciones.NUM_CORREOS);
		Relationship relationship_127 = Per_12.createRelationshipTo(Per_14,Relaciones.NUM_CORREOS);
		
		
		relationship_121.setProperty("Correos:","4");
		relationship_122.setProperty("Correos:","4");
		relationship_123.setProperty("Correos:","9");
		relationship_124.setProperty("Correos:","2");
		relationship_125.setProperty("Correos:","4");
		relationship_126.setProperty("Correos:","8");
		relationship_127.setProperty("Correos:","9");
		
		
		Relationship relationship_131 = Per_13.createRelationshipTo(Per_4,Relaciones.NUM_CORREOS);
		Relationship relationship_132 = Per_13.createRelationshipTo(Per_5,Relaciones.NUM_CORREOS);
		Relationship relationship_133 = Per_13.createRelationshipTo(Per_10,Relaciones.NUM_CORREOS);
		Relationship relationship_134 = Per_13.createRelationshipTo(Per_11,Relaciones.NUM_CORREOS);
		Relationship relationship_135 = Per_13.createRelationshipTo(Per_12,Relaciones.NUM_CORREOS);
		
		
		relationship_131.setProperty("Correos:","1");
		relationship_132.setProperty("Correos:","3");
		relationship_133.setProperty("Correos:","2");
		relationship_134.setProperty("Correos:","3");
		relationship_135.setProperty("Correos:","2");
		
		Relationship relationship_141 = Per_13.createRelationshipTo(Per_4,Relaciones.NUM_CORREOS);
		Relationship relationship_142 = Per_13.createRelationshipTo(Per_10,Relaciones.NUM_CORREOS);
		Relationship relationship_143 = Per_13.createRelationshipTo(Per_11,Relaciones.NUM_CORREOS);
		Relationship relationship_144 = Per_13.createRelationshipTo(Per_12,Relaciones.NUM_CORREOS);
		
		relationship_141.setProperty("Correos:","7");
		relationship_142.setProperty("Correos:","6");
		relationship_143.setProperty("Correos:","8");
		relationship_144.setProperty("Correos:","3");
		
		
		System.out.println("Relaciones creadas.");
		
		System.out.println("Finalizado con exito");
		tx.success();
	}	
	
	System.out.println("Hecho");
	
	
	
}
}
