package devices;

public class ConcretePrinter extends Device implements Scanner {

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}

	@Override
	public String scan() {
		// TODO Auto-generated method stub
		return null;
	}
}