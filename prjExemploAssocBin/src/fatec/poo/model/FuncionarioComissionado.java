package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;//em porcentagem Exemplo: 5%
    private double totalVendas;

    public FuncionarioComissionado(int r, String n, String dtAdm,double tc) {
        super(r, n, dtAdm);//chamada do método construtor da superclasse
        taxaComissao = tc;
    }
    
    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double sb) {
        salBase = sb;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVendas(double vendas){
        totalVendas += vendas; //totalVendas = totalVendas + vendas
    }
    
    //aplicando o polimorfismo
    //sobreposição(override) do método
    public double calcSalBruto(){
        return salBase + (taxaComissao/100 * totalVendas); 
    }
    
    public double calcGratificacao(){
        if(totalVendas <= 5000){
            return 0;
        }else 
           if(totalVendas <= 10000){
             return calcSalBruto()*0.03; //3%
           } 
           else              
             return calcSalBruto()*0.05; //5%
    }
    
    //aplicando o polimorfismo
    //sobreposição(override) do método
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
