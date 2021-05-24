package nntu.irit.vst.shppo.lab18;

import java.util.ArrayList;
import java.util.List;

import data.*;

public class ZUN implements Component  {
	
	COC code;
	private List<Component> zun = new ArrayList<>(3);


	public ZUN(COC code) {
		this.code = code;
		zun = getComponent(code);

	}

	public void addZun()
	{
          zun = getComponent(code);
		
	    }
	
	public COC getCode() {
		return code;
	}
	public void setCode(COC code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "ZUN [code=" + code + ", zun=" + zun + "]";
	}
	@Override
   public List<Component> getComponent(COC code) {
			List<Component> zun = new ArrayList<>(3);
			 Base b = Base.getInstance();
			 for(int i =0; i < b.k.length; i++) {
				 if(((Knowledge) b.k[i]).getCode().equals(code)) zun.add(b.k[i]); 
				 if(((Skills) b.s[i]).getCode().equals(code)) zun.add(b.s[i]);
				 if(((Attainments) b.a[i]).getCode().equals(code)) zun.add(b.a[i]);
			 }
			 return zun;
			}

	}
	
