package lk.ijse.dep11.pos.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.dep11.pos.db.CustomerDataAccess;
import lk.ijse.dep11.pos.tm.Item;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;

public class ManageItemFormController {
    public AnchorPane root;
    public JFXTextField txtCode;
    public JFXTextField txtDescription;
    public JFXTextField txtQtyOnHand;
    public JFXButton btnSave;
    public JFXButton btnDelete;
    public TableView<Item> tblItems;
    public JFXTextField txtUnitPrice;

    public void initialize(){
        String[] columns = {"code","description","qty","unit_price"};
        for (int i = 0; i < columns.length; i++) {
            tblItems.getColumns().get(i).setCellValueFactory(new PropertyValueFactory<>(columns[i]));
        }
    }
    public void navigateToHome(MouseEvent mouseEvent) throws IOException {
        URL resource = this.getClass().getResource("/view/MainForm.fxml");
        Parent root = FXMLLoader.load(resource);
        Scene scene = new Scene(root);
        Stage primaryStage = (Stage) (this.root.getScene().getWindow());
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        Platform.runLater(primaryStage::sizeToScene);
    }

    public void btnAddNew_OnAction(ActionEvent actionEvent) {
        for (TextField textField : new TextField[]{txtUnitPrice, txtDescription, txtQtyOnHand,txtUnitPrice})
            textField.clear();
        tblItems.getSelectionModel().clearSelection();
        txtCode.requestFocus();

    }

    public void btnSave_OnAction(ActionEvent actionEvent) {


    }

    public void btnDelete_OnAction(ActionEvent actionEvent) {
    }
}
