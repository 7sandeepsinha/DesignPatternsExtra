package factory;

import factory.components.button.Button;
import factory.components.button.MacButton;
import factory.components.dropdown.DropDown;
import factory.components.dropdown.MacDropDown;
import factory.components.menu.MacMenu;
import factory.components.menu.Menu;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }
}
