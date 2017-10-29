package ProxyPattern;

/**
 * Anblick Fahrzeug:Vista Vehiculo
 *
 * @author johan
 */
public class AnblickFahrzeug {
    public static void main(String[] args) {
        Animation animation = new AnimationProxy();
        animation.zeichnet();
        animation.klick();
        animation.zeichnet();
    }
}
