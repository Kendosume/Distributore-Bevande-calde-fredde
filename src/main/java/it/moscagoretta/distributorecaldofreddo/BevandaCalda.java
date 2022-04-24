/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.moscagoretta.distributorecaldofreddo;

/**
 *
 * @author Matteo
 */
public class BevandaCalda extends Prodotto {

    private B_Calda selezione;

    public BevandaCalda(B_Calda selezione) {
        super("caldo");

        this.selezione = selezione;
    }

    public B_Calda getSelezione() {
        return selezione;
    }

    public void setSelezione(B_Calda selezione) {
        this.selezione = selezione;
    }

    @Override
    public String toString() {
        return "Tipo bevanda: " + getTipo() + ", bevanda selezianata: " + selezione;
    }

}
