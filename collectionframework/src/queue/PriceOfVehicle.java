package queue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;


//import wrapperclass.Comparator_compare;

class ComparePrize implements Comparator<PriceOfVehicle>{
		
		@Override
		public int compare(queue.PriceOfVehicle o1, queue.PriceOfVehicle o2) {
			if (o1.Prize<o2.Prize)
				return -1;
				else if (o1.Prize>o2.Prize)
					return 1;
				else 
					return 0;
		}

		}

public class PriceOfVehicle {
	
	double Prize;
	String Name,FuelType,Transmission,ACPresent,VehicleType;
	
	public PriceOfVehicle(String Name,String FuelType,String Transmission,String ACPresent,double Prize,String VehicleType) {
		this.Prize=Prize;
		this.Name=Name;
		this.FuelType=FuelType;
		this.ACPresent=ACPresent;
		this.Transmission=Transmission;
		this.VehicleType=VehicleType;
		
	}
	public String toString() {
		return this.Prize+" "+this.Name+" "+this.FuelType+" "+this.Transmission+" "+this.ACPresent+" "+this.VehicleType;
	}

	public static void main(String[] args) {
		PriceOfVehicle P1=new PriceOfVehicle("Thar", "Petrol", "Manual", "AC", 2300000,"Private");
		PriceOfVehicle P2=new PriceOfVehicle("Traveller", "Disel", "Manual", "AC", 3000000,"Transport");
		PriceOfVehicle P3=new PriceOfVehicle("Verna", "Disel", "Manual", "AC", 2200000,"Private");
		
		
		PriorityQueue<PriceOfVehicle> queue=new PriorityQueue<PriceOfVehicle>(new ComparePrize());
		
		queue.offer(P1);
		queue.offer(P2);
		queue.offer(P3);
		
		Iterator<PriceOfVehicle>itr =queue.iterator();
		while(itr.hasNext()) {
			PriceOfVehicle P=itr.next();
			if(P.VehicleType.equals("Private")) {
				System.out.println(P.Name+" "+P.Prize);
			}
		}
		

	}

}

