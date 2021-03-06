package in.clouthink.daas.edm.sms;

public class SmsMessage {
    
    private String cellphone;
    
    private String message;
    
    public SmsMessage() {
    }
    
    public SmsMessage(String cellphone, String message) {
        this.cellphone = cellphone;
        this.message = message;
    }
    
    public String getCellphone() {
        return cellphone;
    }
    
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
}
