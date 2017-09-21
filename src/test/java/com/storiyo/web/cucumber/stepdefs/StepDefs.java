package com.storiyo.web.cucumber.stepdefs;

import com.storiyo.web.StoriyoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = StoriyoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
