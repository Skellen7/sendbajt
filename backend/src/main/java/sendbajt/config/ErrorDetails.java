package sendbajt.config;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String details;

    public ErrorDetails(Date timestamp, String details) {
        super();
        this.timestamp = timestamp;
        this.details = details;
    }
}