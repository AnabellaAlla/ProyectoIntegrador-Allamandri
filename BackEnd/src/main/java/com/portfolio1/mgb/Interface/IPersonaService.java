
package com.portfolio1.mgb.Interface;

import com.portfolio1.mgb.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer lista de personas
    public List<Persona> getPersona ();
    
    //Guardar objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar objeto pero se busca por Id
    public void deletePersona(Long id);
    
    //Bucar persona por ID
    public Persona findPersona(Long id);
}
