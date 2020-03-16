import java.util.HashMap;

public class test {

	public static void main(String[] args) {
		
		String s1 = "ooo";
		String s2 = "aab";
		System.out.println(checkMap(s1,s2));

	}
	
	public static boolean checkMap(String s1,String s2)
	{
		HashMap<String, String> values = new HashMap<String, String>();
		if(s1.length()>s2.length())
			return false;
		else
		{
			for(int count =0; count<s1.length();count++)
			{
				if(count==0)
				{
					values.put(s1.charAt(count)+"",(s2.charAt(count)+""));
				}
				else
				{
					if(values.containsKey(s1.charAt(count)+""))
					{
						if(values.get(s1.charAt(count)+"").equals((s2.charAt(count)+"")))
						{}
						else
							return false;
					}
					else
						values.put(s1.charAt(count)+"",s2.charAt(count)+"");
				}
			}
		}
		return true;
	}

}
