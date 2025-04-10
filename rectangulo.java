
class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void setDimensiones(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void dibujar() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}