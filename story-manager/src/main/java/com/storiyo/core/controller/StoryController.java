package com.storiyo.core.controller;


import com.storiyo.core.model.Story;
import com.storiyo.core.service.JPA.StoryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/story")
public class StoryController {

    private static final Logger logger = LoggerFactory.getLogger(StoryController.class);

    private StoryRepository storyRepository;

    @Autowired
    public StoryController(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    @ResponseBody
    @PostMapping(path = "/saveStory")
    public boolean saveNewStory(@RequestBody Story story) {
        logger.info("Saving new story, story title: ", story.getStoryTitle());
        Story newStory = new Story();
        newStory.setStoryTitle(story.getStoryTitle());
        newStory.setStoryDescription(story.getStoryDescription());
        newStory.setStoryBody(story.getStoryBody());
        Story savedStory = storyRepository.save(newStory);
        if (savedStory.getStoryId() != null) {
            logger.info("Story: {} successfully saved in the database", story.getStoryTitle());
            return true;
        } else {
            logger.error("Unable to persist story: {} in the database", story.getStoryTitle());
            return false;
        }
    }

}
