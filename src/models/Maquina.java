package models;

import java.util.*;

public class Maquina {
    
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;
    int resultado;

    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
    }

    public int calcularSubred() {
        String[] subred = ip.split("\\.");
        String num = subred[3];
        int num2 = Integer.parseInt(num);
        return num2;
    }

    public int calcularRiesgo() {
        Set<Character> caracteres = new HashSet<>();
        char[] char1 = nombre.toCharArray();
        
        for (Character c : char1) {
            caracteres.add(c);
        }
        int cantidad = caracteres.size();

        for (int codes : codigos) {
            if(codes %3 == 0) {
                resultado =+ codes;
            }
        }

        return resultado * cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public List<Integer> getCodigos() {
        return codigos;
    }
    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }
    public int getSubred() {
        return subred;
    }
    public void setSubred(int subred) {
        this.subred = subred;
    }
    public int getRiesgo() {
        return riesgo;
    }
    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + subred;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Maquina other = (Maquina) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (subred != other.subred)
            return false;
        return true;
    }

    
    
}
