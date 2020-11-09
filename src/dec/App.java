package dec;


import decorateur.Caramel;
import decorateur.Chantilly;
import decorateur.Chocolat;
import decorateur.Vani;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

	Boisson b;
	public static void main(String[] args) {



	/*	b=new Espresso();
		System.out.println(b.getDescription());
		System.err.println(b.cout());

		System.out.println("--------------------");
		b=new Deca();
		System.out.println(b.getDescription());
		System.err.println(b.cout());

		System.out.println("--------------------");
		b=new Chocolat(b);
		System.out.println(b.getDescription());
		System.err.println(b.cout());	

		System.out.println("--------------------");
		b=new Vani(b);
		System.out.println(b.getDescription());
		System.err.println(b.cout());*/
		Application.launch(args); 
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbxBoisson=new HBox(10);
		HBox hboxSupp=new HBox(10);
		VBox vboxResulta=new VBox(10);
		VBox vbx=new VBox(20);
		Button btnEspreso=new Button("Espresso"); 
		Button btnDaca=new Button("Deca"); 
		Button btnSumatra=new Button("Sumatra"); 

		Button btnCaramel=new Button("Caramel"); 
		Button btnChantilly=new Button("Chantilly"); 
		Button btnChocolat=new Button("Chocolat"); 
		Button btnVani=new Button("Vani"); 

		Label lblDescription=new Label();
		Label lblCout=new Label();

		hbxBoisson.getChildren().addAll(btnEspreso,btnDaca,btnSumatra);
		hboxSupp.getChildren().addAll(btnCaramel,btnChantilly,btnChocolat,btnVani);

		vboxResulta.getChildren().addAll(lblDescription,lblCout);
		vbx.getChildren().addAll(hbxBoisson,hboxSupp,vboxResulta);

		btnEspreso.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				b=new Espresso();

			}
		});

		btnDaca.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				b=new Deca();

			}
		});
		btnSumatra.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				b=new Sumatra();

			}
		});


		btnCaramel.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				b=new Caramel(b);
				lblDescription.setText(b.getDescription()+"");
				lblCout.setText(b.cout()+"");

			}
		});
		btnChantilly.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				b=new Chantilly(b);
				lblDescription.setText(b.getDescription()+"");
				lblCout.setText(b.cout()+"");

			}
		});
		btnChocolat.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				b=new Chocolat(b);
				lblDescription.setText(b.getDescription()+"");
				lblCout.setText(b.cout()+"");

			}
		});
		btnVani.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				b=new Vani(b);
				lblDescription.setText(b.getDescription()+"");
				lblCout.setText(b.cout()+"");

			}
		});



		final Pane root = new Pane(); 
		root.getChildren().add(vbx);
		final Scene scene = new Scene(root, 500, 400); 
		primaryStage.setTitle("Demo Design pattern Observer"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 		
	}

}
