package parcial01.entity;

public class Pedidos {
    private int idpedidos;
    private String fecha;
    private String direccion;
    private int idusuario;
	public Pedidos() {
		
	}
	public Pedidos(int idpedidos, String fecha, String direccion, int idusuario) {
	
		this.idpedidos = idpedidos;
		this.fecha = fecha;
		this.direccion = direccion;
		this.idusuario = idusuario;
	}
	public int getIdpedidos() {
		return idpedidos;
	}
	public void setIdpedidos(int idpedidos) {
		this.idpedidos = idpedidos;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	
    
    
}
