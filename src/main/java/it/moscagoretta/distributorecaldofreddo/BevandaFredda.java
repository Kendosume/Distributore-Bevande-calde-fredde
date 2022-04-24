/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.moscagoretta.distributorecaldofreddo;

/**
 *
 * @author Matteo
 */
public class BevandaFredda extends Prodotto {

    private B_Fredda selezione;

    public BevandaFredda(B_Fredda selezione) {
        super("freddo");
        this.selezione = selezione;
    }

    public B_Fredda getSelezione() {
        return selezione;
    }

    public void setSelezione(B_Fredda selezione) {
        this.selezione = selezione;
    }

    @Override
    public String toString() {
        return "Tipo bevanda: " + getTipo() + ", bevanda selezianata: " + selezione ;
    }

}
