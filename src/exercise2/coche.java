package exercise2;

public class coche {

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String modelo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    private String marca;

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    private int año;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    private int precio;

    public void automovil ( String _modelo, String _marca, int _año, int _precio) {
        modelo=_modelo;
        marca=_marca;
        año=_año;
        precio=_precio;

    }
}
