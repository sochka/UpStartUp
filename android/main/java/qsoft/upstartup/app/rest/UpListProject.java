package qsoft.upstartup.app.rest;

/**
 * Created by p_val on 22.02.15.
 */
public class UpListProject {
    private String id;
    private String title;
    private String type;
    private String image;
    private String followers;

    public UpListProject(String id, String title, String type, String image, String followers) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.image = image;
        this.followers = followers;
    }

    public UpListProject() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "UpListProject{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", image='" + image + '\'' +
                ", followers='" + followers + '\'' +
                '}';
    }
}
