package TorneoEsports.Model;

public class Partida {
    private String id;
    private String idEquipo;
    private TipoPartida tipo;
    private int puntosObtenidos;

    public Partida(String id, String idEquipo, TipoPartida tipo, int puntosObtenidos) {
        this.id = id;
        this.idEquipo = idEquipo;
        this.tipo = tipo;
        this.puntosObtenidos = puntosObtenidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public TipoPartida getTipo() {
        return tipo;
    }

    public void setTipo(TipoPartida tipo) {
        this.tipo = tipo;
    }

    public int getPuntosObtenidos() {
        return puntosObtenidos;
    }

    public void setPuntosObtenidos(int puntosObtenidos) {
        this.puntosObtenidos = puntosObtenidos;
    }
}
