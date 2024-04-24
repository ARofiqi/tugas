import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Kalkulator extends Application {

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Kalkulator Sederhana");

    Label label = new Label("Nama:");
    TextField textField = new TextField();

    // Menambahkan label dan textfield ke dalam layout VBox
    VBox vbox = new VBox(20);
    vbox.setPadding(new Insets(20));
    vbox.getChildren().addAll(label, textField);

    // Menampilkan layout VBox di dalam scene
    Scene scene = new Scene(vbox, 300, 200);
    primaryStage.setScene(scene);

    // Menampilkan jendela utama
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
