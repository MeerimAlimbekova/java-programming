package day_59_polymorphism_exceptions;

public class ElementsTest {
    public static void main(String[] args) {
        Link link=new Link();
        link.click();
        link.getText();
        link.sendKeys("hi");
        link.getLinkHref();

        WebElement loginLink= new Link();
        loginLink.click();
        loginLink.getText();
        String txt=loginLink.getText();
        System.out.println("txt "+txt);

        WebElement username=new InputField();
        username.sendKeys("wooden spoon");
        username.click();

        WebElementUtil.clickElement(loginLink);
        WebElementUtil.clickElement(username);

       WebElement login= WebElementUtil.getLinkWithText("login");
       login.click();



    }
}
