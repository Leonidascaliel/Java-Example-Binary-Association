
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
/**
 *
 * @author Fatec
 */
public class Aplic {
    public static void main(String[] args) {

       FuncionarioHorista funcHor = new FuncionarioHorista(1010,"Pedro Silveira","15/03/1978",15.80);
       FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,"Ana Paula","27/11/1991",850);
       FuncionarioComissionado funcCom = new FuncionarioComissionado(3030,"Joao Mendes","10/12/1975",10);
       Departamento dep1 = new Departamento("CP","Compras");
      
       funcCom.setCargo("Vendedor");
       funcMen.setCargo("Mensalista");
       funcHor.setCargo("Horista");
       
       //Estabelecer a ligação entre um objeto da classe "FuncionarioHorista" com o "Departamento".
       funcHor.setDepartamento(dep1);
       System.out.println("O Funcionário Horista " + funcHor.getNome() + "Trabalha no departamento de " + dep1.getNomeDepartamento());
       
       funcMen.setDepartamento(dep1);
       System.out.println("O Funcionário Mensalista " + funcMen.getNome() + "Trabalha no departamento de " + dep1.getNomeDepartamento());
       
       funcCom.setDepartamento(dep1);
       System.out.println("O Funcionário Comissionado " + funcCom.getNome() + "Trabalha no departamento de " + dep1.getNomeDepartamento());
       
       
    }
    
    
}
