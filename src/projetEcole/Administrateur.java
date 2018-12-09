package projetEcole;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
@Path("/admin")
@Produces("application/json")
public class Administrateur   {

private Map<String, String> memoire = new HashMap<>();

@PUT
public void insert(Login a) {
memoire.put("admin", a.password);
 }
}
