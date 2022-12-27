// Interface
interface MusicalInstrument {
	public void sound(); // interface method (does not have a body)
}

// ElectricGuitar "implements" the MusicalInstrument interface
class ElectricGuitar implements MusicalInstrument {

	@Override
	public void sound() {
		// the body of sound() is provided here
		System.out.println("Blem, blem, blemmmmmmmmmm!!!"); 
	}
}

// ElectricBass "implements" the MusicalInstrument interface
class ElectricBass implements MusicalInstrument {

	@Override
	public void sound() {
		// the body of sound() is provided here
		System.out.println("Blom, blom, blommmmmmmmmm!!!");
	}
}

public class GuitarAndBass {

	public static void main(String[] args) {
		ElectricGuitar myElectricGuitar = new ElectricGuitar();
		myElectricGuitar.sound();
		
		ElectricBass myElectricBass = new ElectricBass();
		myElectricBass.sound();
	}
}