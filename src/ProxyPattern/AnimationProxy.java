package ProxyPattern;

/**
 *
 * @author Johans
 */
public class AnimationProxy implements Animation {

    protected Video video = null;
    protected String foto = "zeige das Foto";/*Mostrar la foto*/

    public void clic() {
        if (video == null) {
            video = new Video();
            video.laden();
        }
        video.zeichnet();
    }

    /**
     * zeichnet:Dibuja
     */
    @Override
    public void zeichnet() {
        if (video != null) {
            video.zeichnet();
        } else {
            zeichnet(foto);
        }
    }

    /**
     * zeichnet:Dibuja
     *
     * @param foto
     */
    public void zeichnet(String foto) {
        System.out.println(foto);
    }

    @Override
    public void klick() {
        System.out.println("Laufen von klic");/*Ejecutando desde (Param)*/
        System.out.println("Proxy.AnimationProxy.klick()");
    }
}
