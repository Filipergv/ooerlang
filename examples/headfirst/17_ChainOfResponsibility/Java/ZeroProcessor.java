//Este fonte foi retirado de: http://javapapers.com/design-patterns/chain-of-responsibility-design-pattern/
//Ultimo acesso em Agosto de 2013

public class ZeroProcessor implements Chain {

	private Chain nextInChain;

	public void setNext(Chain c) {
		nextInChain = c;
	}

	public void process(Number request) {
		if (request.getNumber() == 0) {
			System.out.println("ZeroProcessor : " + request.getNumber());
		} else {
			nextInChain.process(request);
		}
	}
}
