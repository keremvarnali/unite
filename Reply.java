import java.util.Calendar;

public class Reply {
    private String content;
    private Calendar replyDate;
    private User owner;

    public Reply(String content, User owner, Calendar replyDate){
        this.content = content;
        this.owner = owner;
        this.replyDate = replyDate;
    }

    public Calendar getReplyDate() {
        return replyDate;
    }

    public String getContent() {
        return content;
    }

    public User getOwner() {
        return owner;
    }
}
