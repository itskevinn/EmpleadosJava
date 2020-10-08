package parcial;
public class Validaciones {
    public void validarLetra(Object evt){
        if((evt.getKeyChar()<'a'||evt.getKeyChar()>'z') && (evt.getKeyChar()<'A'||evt.getKeyChar()>'Z')){
            evt.consume();
        }
    }
}
