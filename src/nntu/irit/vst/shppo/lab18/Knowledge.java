package nntu.irit.vst.shppo.lab18;


import java.util.List;

import data.*;

public class Knowledge implements Component{

	COC code;
	String knowledge;
	   
	public Knowledge(COC code, String knowledge) {
		this.code = code;
		this.knowledge = knowledge;
	}

	public COC getCode() {
		return code;
	}

	public String getKnowledge() {
		return knowledge;
	}

	public void setCode(COC code) {
		this.code = code;
	}

	public void setKnowledge(String knowledge) {
		this.knowledge = knowledge;
	}
	

	@Override
	public String toString() {
		return "Knowledge [code=" + code + ", knowledge=" + knowledge + "]";
	}

	@Override
	public List<Component> getComponent(COC code) {
		// TODO Auto-generated method stub
		return null;
	}

}
