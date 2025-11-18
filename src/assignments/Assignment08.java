package assignments;

public class Assignment08 {

	public static void main(String[] args) {
		int[] credittransactions = { 50000, 3000, 4000 };
		int[] debittransactions = { 2000, 15000, 200, 300, 3000 };
		int creditfirstvalue = credittransactions[0];
		int creditsecondvalue = credittransactions[1];
		int creditthirdvalue = credittransactions[2];
		int totalcredit = creditfirstvalue + creditsecondvalue + creditthirdvalue;
		int debitfirstvalue = debittransactions[0];
		int debitsecondvalue = debittransactions[1];
		int debitthirdvalue = debittransactions[2];
		int debitfourthvalue = debittransactions[3];
		int debitfifthvalue = debittransactions[4];
		int totaldebit = debitfirstvalue + debitsecondvalue + debitthirdvalue + debitfourthvalue + debitfifthvalue;
		int totalnumberoftransactions = credittransactions.length + debittransactions.length;
		int balanceamount = totalcredit - totaldebit;
		System.out.println("Total number of completed credit and debit transactions:" + totalnumberoftransactions);
		System.out.println("Total amount credited in account:" + totalcredit);
		System.out.println("Total amount debited from account:" + totaldebit);
		System.out.println("Total amount remaining at the end in Bank Account:" + balanceamount);
		int suspiciouscreditdebitcount = 0;

		for (int credit : credittransactions) {
			if (credit > 10000) {
				System.out.println("Suspicious credit Transaction Amount:" + credit);
				suspiciouscreditdebitcount++;
			}
		}

		for (int debit : debittransactions) {
			if (debit > 10000) {
				System.out.println("Suspicious debit Transaction Amount:" + debit);
				suspiciouscreditdebitcount++;
			}
		}
		System.out.println("Total Number of Suspicious Debit and Credit Transactions:" + suspiciouscreditdebitcount);
	}
}
