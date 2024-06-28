public class RutaMasRapida implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {

        return "Ruta más rápida entre " + puntoA + " y " + puntoB;
    }
}

class RutaMasCorta implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {

        return "Ruta más corta entre " + puntoA + " y " + puntoB;
    }
}

class RutaMasEconomica implements RutaStrategy {
    public String calcularRuta(String puntoA, String puntoB) {

        return "Ruta más económica entre " + puntoA + " y " + puntoB;
    }
}

