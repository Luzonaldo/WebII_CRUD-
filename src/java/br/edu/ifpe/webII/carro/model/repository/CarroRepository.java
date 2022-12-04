/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.webII.carro.model.repository;

import br.edu.ifpe.webII.carro.model.entities.Carro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luzon
 */
public class CarroRepository {
    private static CarroRepository myself = null;

    private static List<Carro> carros = null;

    private CarroRepository(){
        this.carros = new ArrayList<>();
    }

    public static CarroRepository getCurrentInstance(){

        if(myself == null)
            myself = new CarroRepository();

        return myself;

    }

    public void insert(Carro c ){
        this.carros.add(c);
    }

    public static void update(Carro c) {
        for (Carro i: carros) {
            if(i.getCodigo().equals(c.getCodigo())) {
                i.setNome(c.getNome());
                i.setMarca(c.getMarca());
                i.setAno(c.getAno());
                i.setCor(c.getCor());
                
                return;
            }
        }
    }

    public static Carro read(String codigo){
        for (Carro i: carros) {
            if(i.getCodigo().equals(codigo))
                return i;
        }
        return null;
    }

    public static void delete (Carro c) {
        Carro iAux = null;
        
        for (Carro i: carros) {
            if(i.getCodigo().equals(c.getCodigo())) {
                iAux = i;
                break;
            }
        }
        carros.remove(iAux);
    }

   public static List<Carro> readAll() {
        return carros;
    }

}
