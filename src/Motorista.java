import java.util.ArrayList;

public class Motorista{
    public String CPF;
    public String nome;
    public ArrayList<Integer> pontos = new ArrayList<Integer>();

    public enum FormaPagamento{
        DINHEIRO,CARTAO,TODAS;
    }

    public String getCPF(){
        return CPF;
    }

    public String getNome(){
        return nome;
    }

    public Veiculo getVeiculo(){
        return Veiculo;
    }

    public FormaPagamento[] getFormaPagamento(){
        return FormaPagamento[];
    }

    public int getPontuacaoMedia(){
        int sum = 0;

        for(int i=0; i < pontos.size(); i++) 
        {
            sum += pontos.get(i);
        }
 
        return sum/pontos.size();    
    }

    public void infoPontuacao(int pontuacao){
        pontos.add(pontuacao);
    }
}