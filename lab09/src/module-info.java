module lab09 {
	requires java.desktop;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens hust.soict.hedspi.gui.javafx to javafx.graphics, javafx.fxml;
	opens hust.soict.hedspi.aims.gui to javafx.graphics, javafx.fxml;
	opens hust.soict.hedspi.aims.media to javafx.graphics, javafx.fxml, javafx.base;
}
