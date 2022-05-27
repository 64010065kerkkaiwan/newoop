import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class EditController implements Initializable {

    @FXML
    private TextField AgeField;

    @FXML
    private ChoiceBox<String> Choicebox;

    @FXML
    private ChoiceBox<String> Choicefirst;

    @FXML
    private ChoiceBox<String> Choicesecond;

    @FXML
    private ChoiceBox<String> Choicethird;

    @FXML
    private PasswordField ConPassId;

    @FXML
    private TextField DiseaseField;

    @FXML
    private TextField HeightField;

    @FXML
    private Button Inforadd;

    @FXML
    private TextField LastField;

    @FXML
    private TextField NameField;

    @FXML
    private RadioButton No1ch;

    @FXML
    private RadioButton No2ch;

    @FXML
    private PasswordField PassId;

    @FXML
    private Label TextD1;

    @FXML
    private Label TextD2;

    @FXML
    private Label TextD3;

    @FXML
    private TextField WeightField;

    @FXML
    private ImageView imback;

    @FXML
    private Label lblStatus;

    @FXML
    private TextField usename;

    @FXML
    private RadioButton yes1ch;

    @FXML
    private RadioButton yes2ch;

    String Uname = "";
    String Pname ="" ;
    String id ="";
    String fname = "";
    String lname= "";
    String agr= "";
    String sex= "";
    String height = "";
    String weight = "";
    String vacc = "";
    String does1 = "";
    String does2 = "";
    String does3 = "";
    String dis ="";
    String covid = "";

    private String[] Sex = {"Male","female"};
    private String[] Vaccin = {"SinoFarm","Pfizer","AstraZeneca","Sinovec","Moderna","Other","None"};


    


    public static void editText(String filepath, String editAim, String newName, String newLName, String newAge, String newSex, String newHeight, String newWeight, String newCovid,
    String newVacc, String newDose1, String newDose2 , String newDose3, String newDis) {
        String tempfile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempfile);
       
        String Uname = "";
        String Pname ="" ;
        String id ="";
        String fname = "";
        String lname= "";
        String agr= "";
        String sex= "";
        String height = "";
        String weight = "";
        String vacc = "";
        String does1 = "";
        String does2 = "";
        String does3 = "";
        String dis ="";
        String covid = "";

        try {
            FileWriter fw = new FileWriter(tempfile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner x = new Scanner(new File(filepath));
            //x.useDelimiter("[,\n]");

            while(x.hasNext()) {
               /* Id = x.next();
                Name = x.next();*/
                String[] line = (x.nextLine()).split(",");
                Uname = line[0];
                Pname = line[1];
                id = line[2];
                fname = line[3];
                lname = line[4];
                agr = line[5];
                sex = line[6];
                height = line[7];
                weight = line[8];
                covid = line[10];
                vacc = line[11];
                does1 = line[12];
                does2 = line[13];
                does3 = line[14];
                dis = line[15];
                if (line[0].equalsIgnoreCase(editAim)) {
                    //fw.write(Uname +","+Pname+","+id+","+newName+","+newLName+","+newAge+","+newSex+","+newHeight+","+newWeight+","+line[9]+","+newCovid+","+newVacc+","+newDose1+","+newDose2+","+newDose3+","+newDis);
                    pw.println(Uname +","+Pname+","+id+","+newName+","+newLName+","+newAge+","+newSex+","+newHeight+","+newWeight+","+line[9]+","+newCovid+","+newVacc+","+newDose1+","+newDose2+","+newDose3+","+newDis);
                    //System.out.println("ok");
                   // System.out.println(line[0]);
                }
                else
                {
                    pw.println(Uname +","+Pname+","+id+","+fname+","+lname+","+agr+","+sex+","+height+","+weight+","+line[9]+","+covid+","+vacc+","+does1+","+does2+","+does3+","+dis);
                }
            }

            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
            //newFile.renameTo(oldFile);
            
        } catch (Exception var13) {
            System.out.println("Error");
        }

    }
    public static void delete(String filepath, String editAim){
        String tempfile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempfile);
        
        String Uname ="" ;
        String Pname ="" ;
        String id ="";
        String fname = "";
        String lname= "";
        String agr= "";
        String sex= "";
        String height = "";
        String weight = "";
        String vacc = "";
        String does1 = "";
        String does2 = "";
        String does3 = "";
        String dis ="";
        String covid = "";
        try {
            FileWriter fw = new FileWriter(tempfile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner x = new Scanner(new File(filepath));

            while(x.hasNext()) {
                String[] line = (x.nextLine()).split(",");
                Uname = line[0];
                Pname = line[1];
                id = line[2];
                fname = line[3];
                lname = line[4];
                agr = line[5];
                sex = line[6];
                height = line[7];
                weight = line[8];
                covid = line[10];
                vacc = line[11];
                does1 = line[12];
                does2 = line[13];
                does3 = line[14];
                dis = line[15];
                if (!line[0].equalsIgnoreCase(editAim)) {
                    pw.println(Uname +","+Pname+","+id+","+fname+","+lname+","+agr+","+sex+","+height+","+weight+","+line[9]+","+covid+","+vacc+","+does1+","+does2+","+does3+","+dis);
                }
            }
            x.close();
            pw.flush();
            pw.close();
            bw.close();
            x.close();
            fw.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
    
    String getTextch(RadioButton box) {
        if(box.isSelected()){
            return "Yes";
        }
        return "No";
    }


    @FXML
    void AddInfo(ActionEvent event) throws IOException {
        if(event.getSource()==Inforadd){
            editText("record.txt",controllreLog.getUsername(),NameField.getText(),LastField.getText(),AgeField.getText(),Choicebox.getValue(),HeightField.getText(),WeightField.getText(),getTextch(yes2ch),getTextch(yes1ch),Choicefirst.getValue(),Choicesecond.getValue(),Choicethird.getValue(),DiseaseField.getText());    
            System.out.println(NameField.getText());

            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("MainController.fxml"));
            Scene scene = new Scene(root);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(scene);
            primaryStage.show();
            ((Node) event.getSource()).getScene().getWindow().hide();
        }
    }

    



    


    @FXML
    void ClickInfor(MouseEvent event) {
                    HelperStage.close((Node) event.getSource());

    }

    @FXML
    void getAddicCovid(ActionEvent event) {
        
    
    }

    public void getSex(ActionEvent event){
        sex = Choicebox.getValue();

    }

    public void getVaccin1(ActionEvent event){
        does1 = Choicefirst.getValue();

    }

    public void getVaccin2(ActionEvent event){
        does2 = Choicesecond.getValue();

    }

    public void getVaccin3(ActionEvent event){
        does3 = Choicethird.getValue();

    }





    @Override
    public void initialize(URL location, ResourceBundle resources) {

        
        Choicebox.getItems().addAll(Sex);
        Choicebox.setOnAction(this :: getSex);
        Choicefirst.getItems().addAll(Vaccin);
        Choicefirst.setOnAction(this::getVaccin1);
        Choicesecond.getItems().addAll(Vaccin);
        Choicesecond.setOnAction(this::getVaccin2);
        Choicethird.getItems().addAll(Vaccin);
        Choicethird.setOnAction(this::getVaccin3);
        

    }

}