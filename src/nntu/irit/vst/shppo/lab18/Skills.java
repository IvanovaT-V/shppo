package nntu.irit.vst.shppo.lab18;

import java.util.List;

import data.COC;

public class Skills implements Component {

	COC code;
	String skills;


	public Skills(COC code, String skills) {
		this.code = code;
		this.skills = skills;
	}


	public COC getCode() {
		return code;
	}


	public String getSkills() {
		return skills;
	}


	public void setCode(COC code) {
		this.code = code;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}


	@Override
	public String toString() {
		return "Skills [code=" + code + ", skills=" + skills + "]";
	}


	@Override
	public List<Component> getComponent(COC code) {
		// TODO Auto-generated method stub
		return null;
	};
	
	//public IZUN getZUN(COC c) {
		//IZUN x = null;
		//for (int i=0; i<=8; i++) { 
			//if (c == skills[i].code) x = skills[i];}
		//return x;
	//};	
	

	
	
}
