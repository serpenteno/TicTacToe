module me.serpenteno.tictactoefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.serpenteno.tictactoefx to javafx.fxml;
    exports me.serpenteno.tictactoefx;
}