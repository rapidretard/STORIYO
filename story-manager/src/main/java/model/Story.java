package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Story {

    @GeneratedValue
    @Id
    private Long storyId;
    private String storyTitle;
    private String storyDescription;
    private String storyBody;

    public Story(String storyTitle, String storyDescription, String storyBody) {
        this.storyTitle = storyTitle;
        this.storyDescription = storyDescription;
        this.storyBody = storyBody;
    }


    public Long getStoryId() {
        return storyId;
    }

    public void setStoryId(Long storyId) {
        this.storyId = storyId;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getStoryDescription() {
        return storyDescription;
    }

    public void setStoryDescription(String storyDescription) {
        this.storyDescription = storyDescription;
    }

    public String getStoryBody() {
        return storyBody;
    }

    public void setStoryBody(String storyBody) {
        this.storyBody = storyBody;
    }

}
