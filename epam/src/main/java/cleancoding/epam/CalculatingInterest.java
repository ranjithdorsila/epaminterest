package cleancoding.epam;

public class CalculatingInterest {
	double principle_amount,interest,rate_of_interest,time;
	CalculatingInterest(double principle,double rate,double time)
	{
		this.principle_amount=principle;
		this.rate_of_interest=rate;
		this.time=time;
	}
	double calculatingSimpleInterest()
	{
		interest=(principle_amount*time*rate_of_interest)/100;
		return interest;
	}
	double calculatingCompoundInterest()
	{
		interest=principle_amount*(Math.pow((1+(rate_of_interest/100)),time))-principle_amount;
		return interest;
	}

}
