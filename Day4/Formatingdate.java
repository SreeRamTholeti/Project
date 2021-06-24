package Task4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Formatingdate {
	int i;
		
	String[] Formate_1(List<Date> bdate,int length)
	{	
		String[] array= new String[length];
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		for(i=1;i<length;i++) {
			array[i] = formatter.format((bdate.get(i-1)));
		}
		return array;
	}
	
	String[] Formate_2(List<Date> bdate,int length)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		String[] array= new String[length];
		for(i=1;i<length;i++) {
			array[i]=formatter.format(bdate.get(i-1));
		}
		return array;
	}

}
