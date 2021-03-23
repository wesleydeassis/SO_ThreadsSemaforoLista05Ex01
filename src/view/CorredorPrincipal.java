package view;

import java.util.concurrent.Semaphore;

import controller.CaminharPeloCorredor;

public class CorredorPrincipal {

	public static void main(String[] args) {
		
		int permissoes =1;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for(int idCaminhante = 0; idCaminhante < 4;idCaminhante++){
			
			Thread caminhanteId = new CaminharPeloCorredor(idCaminhante, semaforo);
			caminhanteId.start();
			
		}
		

	}

}