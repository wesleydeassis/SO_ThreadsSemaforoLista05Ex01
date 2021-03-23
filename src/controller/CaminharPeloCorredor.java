

package controller;

import java.util.concurrent.Semaphore;

public class CaminharPeloCorredor  extends Thread{
	private int idPessoa;
	private Semaphore semaforo;
	private static int tamanhoCorredor = 200; 
	
	
	public CaminharPeloCorredor(int idPessoa, Semaphore semaforo) {
		this.idPessoa = idPessoa;
		this.semaforo = semaforo;
		
	}
	
	@Override
	public void run() {
		
		caminhantesPeloCorredor();
		
		try {
			semaforo.acquire();
			caminhanteAbrePorta();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			semaforo.release();
		}
		
		
		
		
		
}
	
	public void caminhantesPeloCorredor() {
		int distanciaPercorrida=0;
		int distanciaPace = (int)((Math.random()*4.1)+2);
		
		System.out.println("O Pace da pessoa# "+idPessoa +" é : "+ distanciaPace);
		
		while (distanciaPercorrida < tamanhoCorredor){
			
			distanciaPercorrida += distanciaPace;
			
				}
		
		if(distanciaPercorrida >=195){
			
			System.out.println("A pessoa# "+idPessoa +" percorreu todos os 200 metros e chegou na porta ");
			
		}
			
			
		}
		
		
	

	public void caminhanteAbrePorta() {
		
		
		int tempoCruzarPorta= (int)((Math.random()*1.1)+1);
		
		System.out.println("O id# "+idPessoa+ " cruzou a porta" );
		
		try {
			sleep(tempoCruzarPorta);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	
	
}



