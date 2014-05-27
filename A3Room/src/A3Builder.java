
public class A3Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Tanes Kanchanawanchai";
		StringBuilder sb = new StringBuilder(name);
		
		System.out.println(name.length());
		System.out.println(sb.capacity());
		sb.append(" Love Java.");
		sb.insert(name.length(), " Really ");
		System.out.println(sb);
		
				
	}

}
