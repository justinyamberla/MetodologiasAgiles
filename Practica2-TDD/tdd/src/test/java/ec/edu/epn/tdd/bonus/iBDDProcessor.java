package ec.edu.epn.tdd.bonus;

public class iBDDProcessor {

    private iBDD baseDatos;

    public iBDDProcessor(iBDD baseDatos) {
        this.baseDatos = baseDatos;
    }

    public boolean verificarContraseñaAntigua(String password){
        iBDDResponse respuesta = (iBDDResponse) baseDatos.requestLastPass(new iBDDRequest(password));
        if(respuesta.getStatus() == iBDDResponse.BDDStatus.OK){
            return true;
        }else {
            return false;
        }

    }
}