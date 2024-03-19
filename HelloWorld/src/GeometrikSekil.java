public abstract class GeometrikSekil {
    private String renk = "Mavi";

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public abstract double Alan();

    public abstract double Cevre();
}
