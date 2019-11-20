package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Comentario;
import entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Que Legal");
		Comentario c2 = new Comentario("Muito Bom");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Indo para Juazeiro do Norte", "Viajando para esse lugar Bacana", 10);
		
		p1.addComentario(c1);
		p1.addComentario(c2);
		
		Comentario c3 = new Comentario("Relaxando um pouquinho");
        Comentario c4 = new Comentario("Bacana");
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),"Bebendo água de coco em fortaleza - CE", "Visitando esse lugar quente", 5);
		
        p2.addComentario(c3);
        p2.addComentario(c4);
        
        System.out.println(p1);		
        System.out.println(p2);	

	}

}
