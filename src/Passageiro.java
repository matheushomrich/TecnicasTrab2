import java.util.ArrayList;
import java.util.List;

public class Passageiro{
    public String CPF;
    public String Cartao;
    public String Nome;
    public int pontuacaomedia;
    public FormaPagamento forma;

    public Passageiro(String CPF, String Cartao, String Nome, int pontuacaomedia, String forma){
        this.CPF = CPF;
        this.Cartao = Cartao;
        this.Nome = Nome;
        this.pontuacaomedia = pontuacao;
        forma = forma.toUpperCase();
        if(catveiculo.equals("DINHEIRO")) {
            this.forma = FormaPagamento.DINHEIRO;
    	}else if(forma.equals("CARTAO")) {
            this.forma = FormaPagamento.CARTAO;
        }else if(forma.equals("TODAS")) {
            this.forma = FormaPagamento.TODAS;
    	}
    }

    public String getCPF(){
        return CPF;
    }

    public String getNome(){
        return Nome;
    }

    public String getNroCartao(){
        return Cartao;
    }

    public int getPontuacaoMedia(){
        return pontuacaomedia;
    }

    public FormaPagamento getFormaPgto(){
        return forma;
    }

    public void infoPontuacao(int pontuacaomedia){
        List<> pontos = new ArrayList<>();
        pontos.add(pontuacaomedia);
    }

    @Override
	public String toString() {
		return "Nome: " + Nome + " | CPF: " + CPF + " | Cartao: " + Cartao + " | Pontuacao: " + pontuacaomedia + " | Forma Pagamento: " + forma + "\n";
	}
}