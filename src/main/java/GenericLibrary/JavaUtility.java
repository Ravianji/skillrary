package GenericLibrary;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * this method generate random number with in the limit
 * @param limit
 * @return 
 */

public class JavaUtility {
	public int generateRandomNum(int limit) {
		Random random=new Random();
		int randamNum=random.nextInt(limit);
		return randamNum;
	}
	/**
	 * this method return current time in specified format
	 * @return
*/

public String getCurrentTime() {
	Date date =new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
	String currentTime=sdf.format(date);
	return currentTime;
}
}