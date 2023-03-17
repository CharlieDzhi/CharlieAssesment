package PageObjects;

import org.openqa.selenium.By;
import utilities.SeleniumDriver;

public class RyzeDashboardPage {

    SeleniumDriver seleniumDriver = new SeleniumDriver();
    By repositoryMenuOption = By.id("menuMdb");
    By studiesOption = By.id("menuMdbStudies");
    By techStudyMenu = By.id("fdxMdbContainerListItem0Name");
    By dataAcquisitionLabel = By.id("dataAcquisitionType");
    By formsLabel = By.id("FORMTypeName");
    By medicalHistoryOption = By.xpath("(//div[@class='assetBrowseListItem'])[4]");
    By editButton = By.id("switchEditMode");
    By descriptionField = By.id("assetLocaleEditTextTextareadescriptionen");
    By updateButton = By.id("saveAsset");
    By testMatchMenuOption = By.id("menuUser");
    By signOutButton = By.id("menuUserLogout");


    public void NavigatesStudies() {

        seleniumDriver.Click(repositoryMenuOption);
        seleniumDriver.Click(studiesOption);
    }

    public void NavigatesToTechStudy() {

        seleniumDriver.Click(techStudyMenu);
    }

    public void NavigatesDataAcquisition() {

        seleniumDriver.Click(dataAcquisitionLabel);
    }

    public void NavigatesForms() {

        seleniumDriver.Click(formsLabel);
    }

    public void NavigatesMedicalHistory() {

        seleniumDriver.Click(medicalHistoryOption);
    }

    public void EditButtonDescription() throws Exception {

        seleniumDriver.Click(editButton);
        seleniumDriver.SendKeys(descriptionField,"hellow");
    }

    public void SaveButton() throws Exception {

        seleniumDriver.Click(updateButton);
    }

    public void Logout() throws Exception {

        seleniumDriver.Click(testMatchMenuOption);
        seleniumDriver.Click(signOutButton);
    }


}
