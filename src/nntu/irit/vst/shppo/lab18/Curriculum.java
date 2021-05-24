package nntu.irit.vst.shppo.lab18;

import java.util.ArrayList;

import java.util.List;

import data.COC;

public class Curriculum implements Component{

public String name;
private List<Component> Disces = new ArrayList<>();

public Curriculum(String name, List<Component> disces) {
	this.name = name;
	this.Disces = disces;
}

public Curriculum() {
}



public void addD(Component d)
{
		
			Disces.add(d);
	}
		
	

public void delD(Component d)
{

}

public List<Component> getComponent(COC code){
	return Disces;
	
};



}
