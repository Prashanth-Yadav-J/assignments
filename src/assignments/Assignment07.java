package assignments;

public class Assignment07 {

	public static void main(String[] args) {

		String Customername = "John doe";
		int creditscore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;

		if (creditscore > 650) {

			System.out.println("Credit Score:" + creditscore);
			if (income >= 50000) {
				System.out.println("Income:" + income);
				if (isEmployed = true) {
					System.out.println("Employment Status:" + isEmployed);
					if (debtToIncomeRatio < 40) {
						System.out.println("Debt-To-Income Ratio:" + debtToIncomeRatio);
						System.out.println("Eligible for Loan:" + Customername);
					}
				}
			} else {
				System.out.println("Not Eligible for Loan");
			}

			// TODO Auto-generated method stub

		}
	}
}
