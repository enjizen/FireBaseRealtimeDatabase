package cockatoo.enjizen.firebaserealtimedatabase;

/**
 * Created by wanchalermyuphasuk on 1/2/2018 AD.
 */

public class FriendlyMessage {

    private String text;
    private String username;

    public FriendlyMessage(String text, String username) {
        this.text = text;
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
