// ProjectTableItem.java
package view;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import model.Customer;
import model.MyDate;

public class ProjectTableItem {
  private final SimpleIntegerProperty projectId;
  private final SimpleStringProperty projectType;
  private final SimpleStringProperty projectStatus;
  private final SimpleIntegerProperty projectBudget;
  private final SimpleIntegerProperty projectTimeline;
  private final SimpleObjectProperty<MyDate> projectDeadline;
  private final SimpleStringProperty projectCustomer;
  private final SimpleIntegerProperty projectManHours;
  private final SimpleDoubleProperty projectCosts;

  public ProjectTableItem(int projectId, String projectType, String projectStatus, int projectBudget,
      int projectTimeline, MyDate projectDeadline, String projectCustomer, int projectManHours
      , double projectCosts) {
    this.projectId = new SimpleIntegerProperty(projectId);
    this.projectType = new SimpleStringProperty(projectType);
    this.projectStatus = new SimpleStringProperty(projectStatus);
    this.projectBudget = new SimpleIntegerProperty(projectBudget);
    this.projectTimeline = new SimpleIntegerProperty(projectTimeline);
    this.projectDeadline = new SimpleObjectProperty<>(projectDeadline);
    this.projectCustomer = new SimpleStringProperty(projectCustomer);
    this.projectManHours = new SimpleIntegerProperty(projectManHours);
    this.projectCosts = new SimpleDoubleProperty(projectCosts);
  }

  public int getProjectId() {
    return projectId.get();
  }

  public String getProjectType() {
    return projectType.get();
  }

  public String getProjectStatus() {
    return projectStatus.get();
  }

  public int getProjectBudget() {
    return projectBudget.get();
  }

  public int getProjectTimeline() {
    return projectTimeline.get();
  }

  public MyDate getProjectDeadline() {
    return projectDeadline.get();
  }

  public String getProjectCustomer() {
    return projectCustomer.get();
  }

  public int getProjectManHours() {
    return projectManHours.get();
  }
  public double getProjectCosts() {return projectCosts.get();}
}