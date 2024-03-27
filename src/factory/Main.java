package factory;

import factory.components.button.Button;
import factory.components.dropdown.DropDown;
import factory.components.menu.Menu;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.MAC);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
    }
}

/*
    Flutter ->
    If we choose IOS, it will generate IOS Apps
    else if we choose Android, it will android apps
 */