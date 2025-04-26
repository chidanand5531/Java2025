package test;

public class TestStatic
{
	private static int TestValue = 0 ;

	public TestStatic()
	{
		if (TestValue == 0)
		{
			TestValue = 5;
		}
	}

	public void Print()
	{
		if (TestValue == 5)
		{
			TestValue = 6;
		}
		System.out.println(("TestValue : " + TestValue));
	}



	 public static void Main(String[] args)

	{
		TestStatic t = new TestStatic();
		t.Print();

	}
}


