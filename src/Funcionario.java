
public class Funcionario {
    private double salario;

    public Funcionario(double s) {
        this.salario = s;
    }
    
    

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double s) {
        this.salario = s;
    }
    
    double calcularSalarioFinal(){
        double desconto11= salario -(salario * 0.11);
        return desconto11;
    }
    
    
    
}
