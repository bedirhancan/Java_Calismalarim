class Kare extends GeometrikSekil {
    private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double Cevre() {
        return 4 * kenar;
    }

    @Override
    public double Alan() {
        return Math.pow(kenar, 2);
    }
}