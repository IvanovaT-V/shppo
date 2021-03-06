
package nntu.irit.vst.shppo.lab18;

import data.*;

import java.util.ArrayList;
import java.util.List;


public class Subject implements Component {
	public String name;
	private ZUN ZUNin;
	private ZUN ZUNout;
	


	public Subject(String name, COC zUNin, COC zUNout) {
		this.name = name;
		ZUNin = new ZUN(zUNin);
		ZUNout = new ZUN(zUNout);
	}

	public String getName() {
		return name;
	}

	public ZUN getZUNin() {
		return ZUNin;
	}

	public ZUN getZUNout() {
		return ZUNout;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setZUNin(ZUN zUNin) {
		ZUNin = zUNin;
	}

	public void setZUNout(ZUN zUNout) {
		ZUNout = zUNout;
	}

	@Override
	public String toString() {
		return "Subject [name=" + name + ", ZUNin=" + ZUNin + ", ZUNout=" + ZUNout + "]";
	}



	@Override
	public List<Component> getComponent(COC code) {
		List<Component> zun = new ArrayList<>(2);	
		zun.add(ZUNin);
		zun.add(ZUNout);
		return zun;
	}

	
	}
	





	
