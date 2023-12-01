package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;
import model.ProjectModelManager;

import java.io.IOException;

public class ViewHandler
{
  private Stage stage;
  private ProjectModelManager projectManager;
  private StartViewController startViewController;
  private ProjectViewController projectViewController;
  private MenuViewController menuViewController;
  private ManageViewController manageViewController;
  private AddProjectViewController addProjectViewController;
  private AddIndustrialViewController addIndustrialViewController;
  private AddResidentialViewController addResidentialViewController;

  public ViewHandler(Stage stage, ProjectModelManager projectManager)
  {
    this.stage = stage;
    this.projectManager = projectManager;
  }

  public void start()
  {
    loadStartView();
    loadMenuView();
    loadProjectView();
    loadManageView();
    loadAddProjectView();
    loadAddIndustrialView();
    loadAddResidentialView();
    openView("StartView");
  }

  public void openView(String id)
  {
    switch (id)
    {
      case "ProjectView":
        stage.setScene(projectViewController.getScene());
        projectViewController.reset();
        break;
      case "StartView":
        stage.setScene(startViewController.getScene());
        startViewController.reset();
        break;
      case "MenuView":
        stage.setScene(menuViewController.getScene());
        menuViewController.reset();
        break;
      case "ManageView":
        stage.setScene(manageViewController.getScene());
        manageViewController.reset();
        break;
      case "AddProjectView":
        stage.setScene(addProjectViewController.getScene());
        addProjectViewController.reset();
        break;
      case "AddIndustrialView":
        stage.setScene(addIndustrialViewController.getScene());
        addIndustrialViewController.reset();
      case "AddResidentialView":
        stage.setScene(addResidentialViewController.getScene());
        addResidentialViewController.reset();
    }

    String title = "";

    if(stage.getScene().getRoot().getUserData() !=null)
    {
      title = stage.getScene().getRoot().getUserData().toString();
    }

    stage.setTitle(title);
    stage.show();
  }

  private void loadStartView()
  {
    try
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("StartView.fxml"));
      Region root = loader.load();
      startViewController = loader.getController();
      startViewController.init(this, new Scene(root), projectManager);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  private void loadProjectView()
  {
    try
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("ProjectView.fxml"));
      Region root = loader.load();
      projectViewController = loader.getController();
      projectViewController.init(this, new Scene(root), projectManager);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  private void loadMenuView()
  {
    try
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("MenuView.fxml"));
      Region root = loader.load();
      menuViewController = loader.getController();
      menuViewController.init(this, new Scene(root), projectManager);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  private void loadManageView()
  {
    try
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("ManageView.fxml"));
      Region root = loader.load();
      manageViewController= loader.getController();
      manageViewController.init(this, new Scene(root), projectManager);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  private void loadAddProjectView()
  {
    try
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("AddProjectView.fxml"));
      Region root = loader.load();
      addProjectViewController = loader.getController();
      addProjectViewController.init(this, new Scene(root), projectManager);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  private void loadAddIndustrialView()
  {
    try
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("AddIndustrialView.fxml"));
      Region root = loader.load();
      addIndustrialViewController = loader.getController();
      addIndustrialViewController.init(this,new Scene(root),projectManager);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }

  private void loadAddResidentialView()
  {
    try
    {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("AddResidentialView.fxml"));
      Region root = loader.load();
      addResidentialViewController = loader.getController();
      addResidentialViewController.init(this,new Scene(root),projectManager);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
