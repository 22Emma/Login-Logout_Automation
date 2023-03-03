package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.Scenario;
import org.apache.poi.hssf.record.chart.DatRecord;
import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks2 {
/*
    @After
   public void tearDown(){
        Driver.closeDriver();
    }*/



  @AfterClass
    public static void tearDownScenario(){

        Driver.closeDriver();
    }





}
