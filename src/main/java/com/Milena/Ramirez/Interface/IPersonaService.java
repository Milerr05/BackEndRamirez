
package com.Milena.Ramirez.Interface;

import com.Milena.Ramirez.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    // Traer una lista de personas
    public List<Persona> getPersona();

    // Guardar un objeto de tipo persona y devolver la persona guardada
   public void savePersona(Persona persona);

    // Eliminar un objeto por id y devolver la persona eliminada
    public void deletePersona(Long id);

    // Buscar una persona por id y devolverla
    public Persona findPersona(Long id);
}