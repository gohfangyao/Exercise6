public class Students{
private String stumatricNo;
	private double test1, test2, averageMark;
	
	
	public Students(String matric, double ts1, double ts2 ){
		stumatricNo = matric;
		test1 = ts1;
		test2 = ts2;	 
	}
	
	public String getStudentInfo()
{
		return "\t"+stumatricNo+"\t\t"+averageMark;
	}
	
public void calculateAverage()
	{
		averageMark = (test1 + test2)/2;
	} 
  }
