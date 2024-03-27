package factory;

import factory.components.button.Button;
import factory.components.button.IosButton;
import factory.components.dropdown.DropDown;
import factory.components.dropdown.IosDropDown;
import factory.components.menu.IosMenu;
import factory.components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
