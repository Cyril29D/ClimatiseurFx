module sio.d3.javafx.climatiseurfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.d3.javafx.climatiseurfx to javafx.fxml;
    exports sio.d3.javafx.climatiseurfx;
}