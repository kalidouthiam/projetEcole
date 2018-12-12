package projetEcole;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/directeur")
@Produces("application/json")
public class Directeur {
	Integer idDirecteurEtude;
	String nomDirecteurEtude;
	Integer idDirecteurGeneral;
	String nomDirecteurGeneral;
	
	
    private static  Map<String , String> info_mat= new HashMap<>();
    
    @GET
    public Map<String , String> getValue(){
    	return info_mat;
    }
    
    @PUT
	@Path("/ajouterMat")
	public void ajouterMat(Matiere mat){
		info_mat.put(mat.nom , mat.creneau);
	}
}

