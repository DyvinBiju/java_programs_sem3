package CO5;
public class CO5_02_ButtonTextLabel {
    // Program2: window with TextField + Button + Label (console simulation; needs JavaFX runtime for GUI)
    public static void main(String[] args){
        String textBox="Hello"; String label="You typed: "+textBox;
        System.out.println(label);
        System.out.println("JavaFX: VBox root.getChildren().addAll(textBox, button, label)");
    }
}