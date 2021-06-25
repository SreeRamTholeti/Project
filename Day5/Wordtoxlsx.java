package pak5;

public class Wordtoxlsx {
	public static void main(String[] args) {
		String path = "D:\\WorkSpace\\Day5\\src\\pak5\\username.csv";
		Opencsv oc = new Opencsv();
		
		try {
			if(oc.readcsv(path)) {
				System.out.println("Work Done . . .");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
