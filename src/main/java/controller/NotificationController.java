package controller;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class NotificationController {
    public static Notifications notification(String text, String title) {
        Image image =new Image("/img/login-notification.png");  //image path here
        Notifications notifications=Notifications.create();
        notifications.graphic(new ImageView(image));
        notifications.text(text); //notification text
        notifications.title(title); //notification title
        notifications.hideAfter(Duration.seconds(5)); //notification hide seconds
        //notifications.darkStyle();
        notifications.show();
        notifications.position(Pos.TOP_RIGHT); //notification position
        return notifications;
    }
}
