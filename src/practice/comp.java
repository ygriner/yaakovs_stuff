package practice;

import java.util.Comparator;

public class comp<String> implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		int s1 = 0;
		int s2 = 0;
		
		for (int i = 0; i < arg0.toString().length(); i++)
if (arg0.toString().charAt(i) ==
 			arg0.toString().toUpperCase().charAt(i))
			{
				s1++;
			}
		for (int i = 0; i < arg1.toString().length(); i++)
if (arg1.toString().charAt(i) ==
arg1.toString().toUpperCase().charAt(i))
			{
				s2++;
			}
		return s1 - s2;

	}
}
