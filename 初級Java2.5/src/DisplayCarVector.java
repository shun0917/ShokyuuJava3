
import java.util.Vector;

public class DisplayCarVector extends MyFrame{
	public void run() {
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car(50,50,1,0));
		
		
		cars.add(new Car(50,80,2,0));
		
		
		cars.add(new Car(50,120,3,0));
		
		
		cars.add(new Car(50,160,4,0));
		
		
		cars.add(new Car(50,200,5,0));
		
		for(int i=0; i<40; i++) {
			clear();
			for(int j=0; j<cars.size(); j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			sleep(0.16);

		}
			
		
		
	}

}
