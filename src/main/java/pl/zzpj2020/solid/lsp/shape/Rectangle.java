package pl.zzpj2020.solid.lsp.shape;

public class Rectangle extends Shape {
    private double a;
    private double b;

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double circuit() {
        return (2*a) + (2*b);
    }
}
