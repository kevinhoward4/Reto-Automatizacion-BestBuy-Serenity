package userInterFace;

import net.serenitybdd.screenplay.targets.Target;

public class BestUserInterFace {
    public static final Target BtnPais = Target.the("Seleciona el pais en que se buscara").locatedBy("//img[@alt='Estados Unidos']");
    public static final Target BtnVentana = Target.the("Se da click en la X para cerra ventana emergente").locatedBy("//button[@class='c-close-icon c-modal-close-icon']");
    public static final Target TxtBuscadorPage = Target.the("Donde se ingresara el texto a buscar").locatedBy("//input[@id='gh-search-input']");
    public static final Target BtnBuscadorPage = Target.the("Se da click en el boton de buscar").locatedBy("//button[@class='header-search-button']");
    public static final Target BtnProducto = Target.the("Da click en el producto").locatedBy("//h4[@class='sku-header']//a[contains(text(),'{0}')]");
    public static final Target LblProducto = Target.the("Valida el texto del producto").locatedBy("//h1[contains(text(),'{0}')]");
    public static final Target BtnCategoria = Target.the("Da click para ingresar en la categoria").locatedBy("//a[@data-lid='hdr_health']");
    public static final Target BtnCategoria2 = Target.the("Da click para ingresar en la categoria").locatedBy("//div[@class='flex-copy-wrapper']//a[contains(text(),'Strength training and free weights')]");
    public static final Target BtnProductoAleatorio = Target.the("productoAleatorio").locatedBy("//ol[@class='sku-item-list']//a[@class='image-link']");

}