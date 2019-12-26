package automation.restassured.core;

public interface ReportLogger {
    public void startReport();
    public void EndReport();
    public void startTest();
    public void EndTest();
    public void LogInfo(String info);
    public void LogError(String error, Exception e);
    public void LogError(Exception e);
    public void LogSuccessOrFailure(boolean result);
}
