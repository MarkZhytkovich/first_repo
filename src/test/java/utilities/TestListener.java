package utilities;

import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext result) {
        System.out.println(String.format("%s started", result.getName()));
    }

    @Override
    public void onFinish(ITestContext result) {
        System.out.println(String.format("%s finished", result.getName()));
    }
}
