/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ucb.programacionii.inventariopro.dominio;

import java.util.ArrayList;

/**
 *
 * @author OMEN
 */
public interface MarcaRepository {
    public boolean store(Marca marca);
    public boolean delete(Marca marca);
    public Marca getById(int id);
    public ArrayList<Marca> search(String filtro);
    public int nextIdentity();
}
