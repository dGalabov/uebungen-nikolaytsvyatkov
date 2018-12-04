package geometry;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class DekstopApplication extends Application {
	private static final int SCALE=50;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		
		GeometricObject[] drawings=new GeometricObject[10];
		drawings[0]=new Rechtangle(new Point(1,0),1.5,2);
		drawings[1]=new Rechtangle(new Point(3,3),2,1);
		drawings[2]=new Rechtangle(new Point(0,5),1.5,2.5);
		drawings[3]=new Ellipse(new Point(0.5,3),1,1);
		drawings[4]=new Ellipse(new Point(4,3),1,1);
		drawings[5]=new Ellipse(new Point(3,5),2,1);
		drawings[6]=new Triangle(new Point(1,1.5),new Point(1,3),new Point(0,3));
		drawings[7]=new Triangle(new Point(3,1.5),new Point(3,3),new Point(2,3));
		drawings[8]=new Triangle(new Point(7,2),new Point(8,3),new Point(7,4));
		drawings[9]=new Quadrangle(new Point(4,1.5),new Point(6.5,1.5),new Point(5.5,3),new Point(5,3));
	
		Shape[] shapes=new Shape[10];
		for(int index=0;index<shapes.length;index++) {
			Shape shape=drawings[index].createShape(SCALE);
			shape.setStroke(Color.BLACK);
			shape.setFill(Color.WHITE);
			shapes[index]=shape;
		}
		Label informationLabel=new Label();
		informationLabel.setLayoutX(300);
		Pane root=new Pane();
		root.getChildren().addAll(shapes);
		root.getChildren().addAll(informationLabel);
		root.setOnMouseClicked(new MauseClickHandler(drawings,shapes,informationLabel,SCALE));
		
		Scene scene=new Scene(root,500,500);
		primaryStage.setTitle("Geometrie");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
