import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;


public class PersistenciaPassageiros{
    public PersistenciaPassageiros(){

    }

    public List<Passageiro> carregaPassageiros(String str){
        
    	List<Passageiro> lista = new ArrayList<>();
    	try {
    		Scanner sc = new Scanner(new File(str));
    		String line = sc.nextLine();
    		String [] fields = line.split(",");
    		for(int i = 0; i < fields.length; i = i + 4) {
    			Passageiro passageiro = new Passageiro(fields[i], fields[i+1], fields[i+2], fields[i+3]); ;
    			lista.add(passageiro);
    		}   	
    		sc.close();
    	}catch(FileNotFoundException e) {
    		System.out.println("Arquivo nao encontrado!");
    	}
    	return lista;
        
    }

    public boolean persistePassageiros(ArrayList<Passageiro> list){
    	try{
			File listaPassageiros = new File("lstPassageiros.dat");
			PrintWriter saida = new PrintWriter(listaPassageiros);
			for(Passageiro p: list){
				saida.print(p.getCPF() + ",");
				saida.print(p.getNome()+ ",");
                saida.print(p.getFormaPgto()+",");
                saida.print(p.getNroCartao()+",");
                saida.print(p.getPontuacaoMedia()+",");
                
			}
			saida.close();
		}catch(FileNotFoundException e){
			return false;
		}
		return true;
	}
}