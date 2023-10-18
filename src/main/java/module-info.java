module com.hibernate.hibernate {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;
    requires lombok;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;


    opens com.hibernate.hibernate to javafx.fxml;
    exports com.hibernate.hibernate;
}