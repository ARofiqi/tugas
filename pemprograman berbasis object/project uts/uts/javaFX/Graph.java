import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Graph extends Application {

  @Override
  public void start(Stage primaryStage) {
    // Membuat button
    Button btn = new Button("Klik Saya!");
    btn.setOnAction(e -> buttonClicked());

    // Membuat layout StackPane dan menambahkan button ke dalamnya
    StackPane root = new StackPane();
    root.getChildren().add(btn);

    // Membuat scene dengan menggunakan layout StackPane sebagai root node
    Scene scene = new Scene(root, 500, 200);

    // Mengatur scene pada stage (jendela utama)
    primaryStage.setScene(scene);
    primaryStage.setTitle("Contoh Scene Graph");
    primaryStage.show();
  }

  private void buttonClicked() {
    System.out.println("Tombol telah diklik!");
  }

  public static void main(String[] args) {
    launch(args);
  }
}
