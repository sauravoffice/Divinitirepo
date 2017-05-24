package utiliti;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		System.out.println("Test case finished and the name is -"+result.getName());
		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println(" started and the name is -"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed and the name is -"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped and the name is -"+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started and the name is -"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case executed successfully and the name is -"+result.getName());
		
	}
}
