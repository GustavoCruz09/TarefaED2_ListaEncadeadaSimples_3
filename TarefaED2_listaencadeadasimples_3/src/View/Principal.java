package View;

import Controller.PreencheListaController;
import GustavoCruz.ListaInt.Lista;

public class Principal {

	public static void main(String[] args) {
		Lista L = new Lista();
		PreencheListaController cntrl = new PreencheListaController();
		
		int[] vt = {25,42,23,74,80,77,13,41,59,35,68,53,75,84,44,94,39,71,88};
		//25 42 23 74 80 77 13 41 59 35 68 53 75 84 44 94 39 71 88
		
		cntrl.Operacoes(L, vt);
	}

}
