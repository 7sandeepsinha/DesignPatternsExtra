package factory;

import factory.components.button.Button;
import factory.components.dropdown.DropDown;
import factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
