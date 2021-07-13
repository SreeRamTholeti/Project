package Task_8;

public class Main {
	public static void main(String [] args) throws Exception {
		Randomsite rs = new Randomsite();
		Getfromxlsx getxl = new Getfromxlsx();
		
		int rownum = getxl.get_rowcount();
		String set[] = rs.open_site(rownum);
		
		getxl.Create_newSheet();
		getxl.save_to_sheet(set, set.length);
	}
}
