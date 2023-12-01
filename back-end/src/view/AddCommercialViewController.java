package view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.CommercialProject;
import model.Customer;
import model.MyDate;
import model.Resources;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class AddCommercialViewController implements Initializable {

  @FXML
  private TextField projectTypeTextField;

  @FXML
  private TextField budgetTextField;

  @FXML
  private TextField dayTextField;

  @FXML
  private TextField monthTextField;

  @FXML
  private TextField yearTextField;

  @FXML
  private ComboBox<String> statusComboBox;

  @FXML
  private TextField projectIDTextField;

  @FXML
  private TextField timelineTextField;

  @FXML
  private TextField firstNameTextField;

  @FXML
  private TextField surnameTextField;

  @FXML
  private TextField customerIDTextField;

  @FXML
  private TextField phoneNumberTextField;

  @FXML
  private TextField emailTextField;

  @FXML
  private TextField addressTextField;

  @FXML
  private TextField expectedManHoursTextField;

  @FXML
  private TextField materialExpensesTextField;

  @FXML
  private TextField sizeTextField;

  @FXML
  private TextField floorsTextField;

  @FXML
  private TextField usageTextField;

  private CommercialProject commercialProject;

  private Button clear;
  private Button addProject;
  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    // Initialization code goes here
  }
  public void setAddProject(){
    int budget = Integer.parseInt(budgetTextField.getText());

    int day = Integer.parseInt(dayTextField.getText());
    int month = Integer.parseInt(monthTextField.getText());
    int year = Integer.parseInt(yearTextField.getText());

    String status = "";

    int projectID = Integer.parseInt(projectIDTextField.getText());

    int timeline = Integer.parseInt(timelineTextField.getText());

    Customer customer = new Customer(firstNameTextField.getText(), surnameTextField.getText(), Integer.parseInt(customerIDTextField.getText()),
        Integer.parseInt(phoneNumberTextField.getText()), emailTextField.getText(), addressTextField.getText());

    Resources resources = new Resources(Integer.parseInt(expectedManHoursTextField.getText()), Integer.parseInt(materialExpensesTextField.getText()));

    int size = Integer.parseInt(sizeTextField.getText());
    short floors = Short.parseShort(floorsTextField.getText());
    commercialProject = new CommercialProject(budget, new MyDate(day, month, year), status, projectID, timeline, customer, resources, size, floors, usageTextField.getText());
  }


}