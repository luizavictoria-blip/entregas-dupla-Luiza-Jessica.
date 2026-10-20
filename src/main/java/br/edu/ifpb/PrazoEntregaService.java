package br.edu.ifpb;

public class PrazoEntregaService {

    public int calcularPrazo(int distanciaKm) {
        if (distanciaKm <= 0) {
            throw new IllegalArgumentException("Distancia invalida");
        }

        if (distanciaKm <= 50) {
            return 1;
        }

        if (distanciaKm <= 200) {
            return 3;
        }

        return 5;
    }
}
