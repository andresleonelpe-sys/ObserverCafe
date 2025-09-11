/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subject;

/**
 *
 * @author andre
 */
import cafeobserver.model.LoteCafe;
import cafeobserver.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CooperativaCafe implements Subject {
    private List<Observer> observadores;

    public CooperativaCafe() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notifyObservers(LoteCafe lote) {
        for (Observer o : observadores) {
            o.update(lote);
        }
    }

    public void registrarLote(LoteCafe lote) {
        System.out.println("\nSe registró un nuevo lote en la cooperativa.");
        notifyObservers(lote);
    }
}
