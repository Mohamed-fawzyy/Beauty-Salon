package beautysalon;

import java.io.IOException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI 
{
	public static class Main extends Application 
	{
	    @Override
	    public void start(Stage primaryStage) 
	    {
	    	Text txt=new Text("Welcome");
			Text Name=new Text("Name:");
			Text Phone=new Text("Phone Number:");
			
			TextField Name1=new TextField();
			TextField Phoneno=new TextField();
			
			CheckBox box1=new CheckBox("Spa = 100LE");
		    CheckBox box2=new CheckBox("Massage = 400LE");
		    CheckBox box3=new CheckBox("MakeUp = 700LE");
		    CheckBox box4=new CheckBox("Nail Care = 300LE");
		    CheckBox box5=new CheckBox("Hair Treatment = 500LE");
		    CheckBox box6=new CheckBox("Facial Treatment = 499LE");
		    
		    Button btn1 =new Button("Done");
		    Button btn2=new Button("Reset");
		    
		    VBox vbox = new VBox(); 
		    GridPane G=new GridPane();
		    
		    G.setMinSize(400, 200);  
		    G.setVgap(5);
		    G.setHgap(5); 
		    G.setAlignment(Pos.CENTER);
		    
		    G.add(Name, 0, 0);
		    G.add(Name1, 1,0);
		    
		    G.add(Phone, 0, 1);
		    G.add(Phoneno, 1, 1);
		    
		    G.add(box1, 0, 2);
		    G.add(box2, 1, 2);
		    G.add(box3, 0, 3);
		    G.add(box4, 1, 3);
		    G.add(box5, 0, 4);
		    G.add(box6, 1, 4);
		    G.add(btn1, 0, 5);
		    G.add(btn2, 1, 5);
		    
		    BorderPane B=new BorderPane();
		    Scene s=new Scene(B,600,400);	
		     
		    B.setTop(txt);
		    B.setCenter(G);
		    B.setLeft(vbox);
		    primaryStage.setTitle("Client");
		    primaryStage.setScene(s);
		    primaryStage.show();
	    }
	    
//	    String checkboxhandeler(CheckBox box1,CheckBox box2,CheckBox box3,
//	    		CheckBox box4,CheckBox box5,CheckBox box6)// throws IOException 
//	    {
//	    	
//	    }
	    
	    public static void main(String[] args) 
	    {
	        launch(args);
	    }
	}
}