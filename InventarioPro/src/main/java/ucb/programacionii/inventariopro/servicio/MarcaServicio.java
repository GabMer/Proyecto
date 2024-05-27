/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.programacionii.inventariopro.servicio;

import java.util.ArrayList;
import ucb.programacionii.inventariopro.dominio.Marca;
import ucb.programacionii.inventariopro.dominio.MarcaRepository;

/**
 *
 * @author OMEN
 */
public class MarcaServicio {

    private final MarcaRepository marcaRepository;

    public MarcaServicio(MarcaRepository repository) {
        this.marcaRepository = repository;
    }

    public Marca createMarca(
            int ID,
            String Marca
    ) throws Exception{
    
    int id = this.marcaRepository.nextIdentity();

        Marca marca = new Marca(ID, Marca);

        if (this.marcaRepository.store(marca)) {
            return marca;
        } else {
            throw new Exception("No se pudo guardar el artículo");
        }

    }
    
    public Marca getMarca(int id){
        return this.marcaRepository.getById(id);
    }
    
     public ArrayList<Marca> search(String filtro) {
        return this.marcaRepository.search(filtro);
    }
     
     // (U)PDATE
    public boolean updateMarca(Marca marca) throws Exception {
        //1: valida los nuevos datos
            // 2.1: recupera objeto original            
            // 2.2: compara y valida datos
            
        // guarda el objeto
        if (this.marcaRepository.store(marca)) {
            return true;
        } else {
            throw new Exception("No se pudo guardar el artículo");
        }
    }

    // (D)ELETE
    public boolean deleteMarca(Marca marca) throws Exception {
        //1: valida si se puede borrar
        
        //2: borra el objeto
        return this.marcaRepository.delete(marca);
    }
}
