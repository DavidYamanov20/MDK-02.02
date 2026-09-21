public abstract class Parallelogram implements Figure {
    protected final double a; // основание
    protected final double h; // высота

    public Parallelogram(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h;
    }
}
