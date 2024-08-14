package casosECasos;

import java.util.ArrayList;
import java.util.Arrays;

public class RelembrandoAsRepeticoes {

	public static void main(String[] args) {
		String[] disiplinas = {"matematica", "filossofia", "inglês", "geografia"};
		ArrayList<String> novalista = new ArrayList<String>(Arrays.asList(disiplinas));
		
		novalista.add("historia");
		novalista.add("lingua portuguesa");
		
		for (String i:novalista) {
			System.out.println("Disiplinas:" + i);
		}
	}

}
