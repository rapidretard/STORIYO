package com.storiyo.core.service.JPA;

import com.storiyo.core.model.Story;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoryRepository extends JpaRepository<Story, Long> {

}
