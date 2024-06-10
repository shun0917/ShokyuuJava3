import java.util.Vector;

public class DisplayVehicleVector extends MyFrame{
	public void run() {
		Vector<Vehicle> vehicles=new Vector<Vehicle>();
		vehicles.add(new Car(180,30,3,0));
		vehicles.add(new Car(180,100,-5,0));
		vehicles.add(new Train(180,160,14,0));
		vehicles.add(new Train(180,195,-12,0));
		vehicles.add(new Truck(180,230,8,0));
		vehicles.add(new Truck(180,275,6,0));
		
		for (int i=0; i<30; i++) {
			clear();
			for (int j=0; j<vehicles.size();j++) {
				vehicles.get(j).draw(this);
				vehicles.get(j).move();
			}
			sleep(0.1);
		}
	}

}