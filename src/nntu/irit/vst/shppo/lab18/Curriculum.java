package nntu.irit.vst.shppo.lab18;

import java.util.ArrayList;

import java.util.List;

import data.COC;

public class Curriculum implements Component{

public String name;
private List<Component> disces = new ArrayList<>();

public Curriculum(String name) {
	this.name = name;
}

public Curriculum() {
}



public void addD(Component d)
{
	
	ZUN zunIn = ((Subject) d).getZUNin();
	COC cIn = ((ZUN) zunIn).getCode();
	if (disces.isEmpty() == true) disces.add(d);
	for(Component s : disces) {
		ZUN zunOut = ((Subject) s).getZUNout();
		COC cOut = ((ZUN) zunOut).getCode();
		if (cIn == cOut) disces.add(disces.lastIndexOf(s)+1, d);		
	}

}
		
	

public void delD(Component d)
{

}

public List<Component> getComponent(COC code){
	return disces;

}

@Override
public String toString() {
	return "Curriculum [name=" + name + ", disces=" + disces + "]";
};



}
