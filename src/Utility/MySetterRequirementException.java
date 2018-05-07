package Utility;

public class MySetterRequirementException extends Exception {
    private String message;
    public MySetterRequirementException(String message) {
        this.message=message;
    }

    @Override
    public String toString() {
        return  String.format("%s",message );
    }
}
