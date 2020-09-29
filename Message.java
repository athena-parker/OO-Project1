public class Message { //attempt to transfer message from observable to observer
    final String message;
    Message (String m) {
        this.message = m;
    }
    public String getMessage() {
        return message;
    }
}