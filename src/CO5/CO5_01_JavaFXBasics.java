package CO5;
public class CO5_01_JavaFXBasics {
    // Hierarchy: Application -> Stage -> Scene -> Root(VBox) -> Node(Button/Label/TextField) + EventHandler
    public static void main(String[] args){
        System.out.println("Application: main class, extend Application");
        System.out.println("Stage: window, Scene: holds GUI, Root: top Node VBox");
        System.out.println("Control: Button/Label/TextField, EventHandler: setOnAction");
    }
}