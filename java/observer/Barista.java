/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author andre
 */
import cafeobserver.model.LoteCafe;

public class Barista implements Observer {
    private String nombre;
    private String id;

    public Barista(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public void update(LoteCafe lote) {
        System.out.println("Notificación para " + nombre + " (ID: " + id + ")");
        System.out.println("Nuevo lote disponible:");
        System.out.println("Varietal: " + lote.getVarietal());
        System.out.println("Notas de cata: " + lote.getNotasCata());
        System.out.println("Origen: " + lote.getOrigen());
        System.out.println("Altura: " + lote.getAltura() + " msnm");
        System.out.println("Productor: " + lote.getProductor());
        System.out.println("Cantidad: " + lote.getCantidadLibras() + " lbs");
        System.out.println("--------------------------------------------");
    }
