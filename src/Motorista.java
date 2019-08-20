import java.util.ArrayList;

public class Motorista{
    public String CPF;
    public String nome;
    public ArrayList<Integer> pontos = new ArrayList<Integer>();
    public Veiculo veiculo;

    public Motorista(String CPF, String Nome, Veiculo veiculo){
        this.CPF = CPF;
        this.Nome = Nome;
    }

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
        return v;
    }

    public FormaPagamento[] getFormaPagamento(){
        return FormaPagamento;
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

    @Override
	public String toString() {
		return "Nome: " + nome + " | CPF: " + CPF + "\n";
	}
}