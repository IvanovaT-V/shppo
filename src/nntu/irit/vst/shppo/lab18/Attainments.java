package nntu.irit.vst.shppo.lab18;

import java.util.List;

import data.*;

public class Attainments implements Component {
	
    COC code;
	String attainments;
	
	
	public Attainments(COC code, String attainments) {
		this.code = code;
		this.attainments = attainments;
	}
	
	
	public COC getCode() {
		return code;
	}


	public String getAttainments() {
		return attainments;
	}


	public void setCode(COC code) {
		this.code = code;
	}


	public void setAttainments(String attainments) {
		this.attainments = attainments;
	}


	@Override
	public String toString() {
		return "Attainments [code=" + code + ", attainments=" + attainments + "]";
	}


	@Override
	public List<Component> getComponent(COC code) {
		// TODO Auto-generated method stub
		return null;
	}


		
	
	//public ZUN getZUN(COC c) {
		//ZUN x = null;
		//for (int i=0; i<=8; i++) { 
			//if (c == attainments[i].code) x = attainments[i];}
		//return x;
	//};	
	
}
