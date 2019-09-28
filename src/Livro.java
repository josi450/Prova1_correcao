public class Livro {
    
    private String nome;
    private double preco;
    private Data dataDeLancamento;
    
    public Livro(String n, double p, Data dn){
        this.nome= n;
        this.preco=p;
        this.dataDeLancamento=dn;
       
    }

    
    
    public String getNome(){
        return this.nome;
        
    }
    
    public double getPreco(){
        return this.preco;
        
    }
    
    public Data getDataDeNascimento(){
        return this.dataDeLancamento;
        
    }
    
    public void setNome(String n){
        this.nome=n;
    }
    
    public void setPreco(double p){
        this.preco=p;
    }
}
    
