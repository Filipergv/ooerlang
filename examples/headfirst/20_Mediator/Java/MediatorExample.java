//Este fonte foi retirado de: http://javapapers.com/design-patterns/mediator-design-pattern
//Ultimo acesso em Agosto de 2013

public class MediatorExample {
	public static void main(String args[]) {

		IATCMediator atcMediator = new ATCMediator();
		Flight sparrow101 = new Flight(atcMediator);
		Runway mainRunway = new Runway(atcMediator);
		
		atcMediator.registerFlight(sparrow101);
		atcMediator.registerRunway(mainRunway);
		
		sparrow101.getReady();
		sparrow101.land();
		mainRunway.land();
		sparrow101.land();
	}
}
