
public class Trapezio {
    
    private double b;
    private double a;
    private double h;
    
    public Trapezio(double b, double a, double h) {
        this.b = b;
        this.a = a;
        this.h = h;
    }
    

    public double getB() {
        return this.b;
    }

    public double getA() {
        return this.a;
    }

    public double getH() {
        return this.h;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setH(double h) {
        this.h = h;
    }
    
    double calcularArea(){
       double A= (0.5 * getH()) * (getA()+getB());
        
        return A;
    }

    
    
}
