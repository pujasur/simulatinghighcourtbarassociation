module mainpkg.highcourt.operationofhighcourtbarassociation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens mainpkg.highcourt.operationofhighcourtbarassociation to javafx.fxml;
    opens mainpkg.highcourt.operationofhighcourtbarassociation.Register to javafx.fxml, javafx.base;
    opens mainpkg.highcourt.operationofhighcourtbarassociation.Treasurer to javafx.fxml, javafx.base;
    exports mainpkg.highcourt.operationofhighcourtbarassociation;
}