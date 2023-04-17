import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFacts {
    private String id;
    private String text;
    private String user;
    private String type;
    private int upvotes;

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getUser() {
        return user;
    }

    public String getType() {
        return type;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public CatFacts(
            @JsonProperty("text") String text,
            @JsonProperty("id") String id,
            @JsonProperty("user") String user,
            @JsonProperty("type") String type,
            @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.user = user;
        this.type = type;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "CatFacts{" +
                "\n     id='" + id + '\'' +
                ",\n      text='" + text + '\'' +
                ",\n      user='" + user + '\'' +
                ",\n      type='" + type + '\'' +
                ",\n      upvotes=" + upvotes +
                "\n     }";
    }
}
