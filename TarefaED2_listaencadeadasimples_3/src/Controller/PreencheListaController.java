package Controller;

import GustavoCruz.ListaInt.Lista;

public class PreencheListaController {

	public PreencheListaController() {
		super();
	}

	public void Operacoes(Lista L, int[] vt) {
		int tamanho = vt.length;
		for (int i = 0; i < tamanho; i++) {
			if (L.isEmpty()) {
				L.addFirst(vt[i] * 2);
			} else if (L.size() < 3) {
				try {
					L.addLast((int) vt[i] / 2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (L.size() > 10) {
				try {
					L.add(vt[i] * 3, 5);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					L.add(vt[i], 1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		while (!L.isEmpty()) {
			if (L.size() > 10) {
				try {
					System.out.println(L.get(3));
					L.remove(3);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (L.size() > 5) {
				try {
					System.out.println(L.get(L.size() - 1));
					L.removeLast();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (L.size() > 3) {
				try {
					System.out.println(L.get(1));
					L.remove(1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					System.out.println(L.get(0));
					L.removeFirst();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
