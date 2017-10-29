package ProxyPattern;

/**
 *
 * @author Johans
 */
public class Video implements Animation {   
     /**
      *zeichnet:Dibuja
    */
    @Override
    public void zeichnet() {
        System.out.println("Laufen von Draws");/*Ejecutando desde (Param)*/
        System.out.println("Proxy.Video.zeichnet()");
    }

    /**
     * klick:Clic
     */
    @Override
    public void klick() {
        System.out.println("Laufen von klic");/*Ejecutando desde (Param)*/
        System.out.println("Proxy.Video.klick()");
    }

    /**
     * laden:Carga
     */
    public void laden() {
        System.out.println("Laufen von laden");/*Ejecutando desde (Param)*/
        System.out.println("Proxy.Video.laden()");
    }

    /**
     * abspielen:Reproduce
     */
    public void abspielen() {
        System.out.println("Laufen von abspielen");/*Ejecutando desde (Param)*/
        System.out.println("Proxy.Video.abspielen");
    }
}
