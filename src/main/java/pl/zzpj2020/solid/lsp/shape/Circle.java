package pl.zzpj2020.solid.lsp.shape;

public class Circle extends Shape{
   private  double radius;

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double circuit() {
        return radius*2*3.14;
    }
}
