package controller;

import java.util.*;
import models.Maquina;

public class MaquinaController{
    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral) {
        LinkedList<Maquina> cola = new LinkedList<>();
        for (Maquina m : maquinas) {
            if(m.getSubred() > umbral) {
                cola.addLast(m);
            }
        }
        Stack<Maquina> pila = new Stack<>();
        for (Maquina m : cola) {
            pila.push(m);
        }
        return pila;
    }

    public Set<Maquina> ordenarPorSubred(Stack<Maquina> pila) {
        TreeSet<Maquina> ordenadas = new TreeSet<>();
        for (Maquina m : pila) {
            ordenadas.add(m);
        }
        return ordenadas;
    }

    //public Map<Integer, Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquinas) {

    //}

    public Stack<Maquina> explotarGrupo(Map<Integer, Queue<Maquina>> mapa) {
        Stack<Maquina> mayor = new Stack<>();
        int tamanio = 0;
        for (Queue<Maquina> m : mapa.values()) {
            if(m.size() >= tamanio) {
                tamanio = m.size();
                for (Maquina ma : m) {
                    mayor.add(ma);
                }
            }
        }
        return mayor;
    }

}
