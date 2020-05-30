import scala.io.StdIn.readInt
object q1{
	def main(args : Array[String])
	{
	print("Enter Normal Hours: ");
	var normal = readInt();
	
	print("Enter OT Hours: ");
	var ot = readInt();
	
	salary(normal, ot);
	}
	
	def salary(n : Int, o : Int) : Unit = {
		
	if(n>=40 && o>=20)
	{
	var tax = (n*150 + o*75)*0.9;
	var total = tax*4;
	print("Monthly Salary: "+total);
	}
	
	else
	{
	var total = (n*150 + o*75);
	print("Monthly Salary: "+total);
	}
	}	
}
