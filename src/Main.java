import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import random.Main2;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		String csvFiles = "C:\\Users\\mulamba\\Desktop\\Overage Alerts\\usage_oneCompany.csv";
		// FileWriter writers = new FileWriter(csvFiles, true);

		FileWriter fw = new FileWriter(csvFiles);
		BufferedWriter bw = new BufferedWriter(fw);

		List<Date> allDates = Main2.getDatesBetweenUsingJava7(new Date(115, 0, 1), new Date(118, 7, 30));

		/*
		 * String ECCIDs = "0000000000|" + "0001445424|" + "10000|" + "10001|" +
		 * "10002|" + "10003|" + "10004|" + "10005|" + "10006|" + "10007|" + "10008|" +
		 * "10009|" + "10010|" + "10011|" + "10012|" + "10013|" + "10014|" + "10015|" +
		 * "10016|" + "10017|" + "10018|" + "10019|" + "10020|" + "10021|" + "10022|" +
		 * "10023|" + "10024|" + "10025|" + "10026|" + "10027|" + "10028|" + "10029|" +
		 * "10030|" + "10031|" + "10032|" + "10033|" + "10034|" + "10035|" + "10036|" +
		 * "10037|" + "10038|" + "10039|" + "1435647" + "-89830" + "1436733" + "1435167"
		 * + "146721629" + "10039|"; System.out.println(ECCIDs);
		 */

		String ECCIDs = "10028";
		String ECCIDsArray[] = ECCIDs.split("\\|");

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < ECCIDsArray.length; i++) {
			System.out.println(ECCIDsArray[i]);

			for(int j=2;j<21;j++)
			{
			for (Iterator<Date> iterator = allDates.iterator(); iterator.hasNext();) {
				int random = (int) (Math.random() * 35000);// 0-199
				int overallRandom = 2 * random;

				Date date = (Date) iterator.next();
				String a = "" + df.format(date) + "|" + ECCIDsArray[i] + "|" + ECCIDsArray[i] + "_RS"+j+"|UNK|1001|"
						+ overallRandom + "|" + overallRandom + "|" + overallRandom + "|" + overallRandom
						+ "|2018-03-10 14:40:32.0|ZCC_MED|" + ECCIDsArray[i] + "|2018-01-11 12:29:01.224|" + random
						+ "|" + random + "|" + random + "|" + random + "|" + random + "|" + random + "|" + random + "|"
						+ random + "|2018-03-10 14:40:32.0|A|0|2018-03-11 22:51:35.736";

				bw.write(a);
				bw.newLine();
			}
			bw.newLine();
			}
			bw.newLine();
			bw.newLine();
		}
	}
}