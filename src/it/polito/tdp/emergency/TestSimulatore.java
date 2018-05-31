package it.polito.tdp.emergency;

public class TestSimulatore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Simulatore sim = new Simulatore();
		
		sim.setNP(250);
		sim.setT_ARRIVAL(3);
		sim.setNS(3);
		
		sim.init();
		
		sim.run();
		
		System.out.println("Pazienti curati: "+sim.getPazientiCurati());
		System.out.println("Pazienti abbandonati: "+sim.getPazientiAbbandonati());
		System.out.println("Pazienti morti: "+sim.getPazientiMorti());
	}

}
