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

public class PersistenciaMotoristas{
    public PersistenciaMotoristas(){

    }
    public List<Motorista> carregaMotoristas(String str){
        
    	List<Motorista> lista = new ArrayList<>();
    	try {
    		Scanner sc = new Scanner(new File(str));
    		String line = sc.nextLine();
    		String [] fields = line.split(",");
    		for(int i = 0; i < fields.length; i = i + 4) {
    			Motorista motorista = new Motorista(fields[i], fields[i+1], fields[i+2], fields[i+3]); ;
    			lista.add(motorista);
    		}   	
    		sc.close();
    	}catch(FileNotFoundException e) {
    		System.out.println("Arquivo nao encontrado!");
    	}
    	return lista;
        
    }

    public boolean persisteMotoristas(ArrayList<Motorista> list){
    	try{
			File listaMotorista = new File("lstMotorista.dat");
			PrintWriter saida = new PrintWriter(listaMotorista);
			for(Motorista m: list){
				saida.print(m.getCPF() + ",");
				saida.print(m.getNome()+ ",");
				saida.print(m.getVeiculo()+",");
                saida.print(m.getFormaPgto()+",");
                saida.print(m.getPontuacaoMedia()+",");
                
			}
			saida.close();
		}catch(FileNotFoundException e){
			return false;
		}
		return true;
	}

}