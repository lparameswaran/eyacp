package com.ey.acp.cucumber.stepdefs;

import com.ey.acp.AcpApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AcpApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
