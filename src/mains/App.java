package mains;
import data.COC;
import nntu.irit.vst.shppo.lab18.*;

public class App {


	public static void main(String[] args) {

		Curriculum c1 = new Curriculum ("бакалавр");
		Subject s1 = new Subject("история", COC.OK_1, COC.OK_2);
		c1.addD(s1);
		System.out.println(c1);
	}


}
