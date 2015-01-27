package game;

import java.io.Serializable;

public class SaveClass implements Serializable {
	//Back bck=new Back();
	int i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13;
	double d1;
	
	private static final long serialVersionUID = 50L;
	public void loader(){
		new Back().day=200;
	}
	public  void saver(){
		 i1 = new Back().day;
		 i2=new Back().day1;
		d1=new Back().bancMoney;
		i3=new Back().daydLS1;
		i4=new Back().daydLS2;
		i5=new Back().daydLS3;
		i6=new Back().daydLS4;
		i7=new Back().daydLS5;
		i8=new Back().daydLS6;
		i9=new Back().daydLS7;
	}
	
}
