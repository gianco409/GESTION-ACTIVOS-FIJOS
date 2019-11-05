package pe.com.unmsm.gaf.activos.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Activo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String codigo;
	String descripcion;
	String etActi;
	String material;
	String color;
	Integer medAncho;
	Integer medLargo;
	Integer medAlto;
	String estado;
	String serie;
	String placa;
	String motor;
	String cantidad;
	String tipoActivo;
	String precio;
	String equipo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEtActi() {
		return etActi;
	}

	public void setEtActi(String etActi) {
		this.etActi = etActi;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getMedAncho() {
		return medAncho;
	}

	public void setMedAncho(Integer medAncho) {
		this.medAncho = medAncho;
	}

	public Integer getMedLargo() {
		return medLargo;
	}

	public void setMedLargo(Integer medLargo) {
		this.medLargo = medLargo;
	}

	public Integer getMedAlto() {
		return medAlto;
	}

	public void setMedAlto(Integer medAlto) {
		this.medAlto = medAlto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipoActivo() {
		return tipoActivo;
	}

	public void setTipoActivo(String tipoActivo) {
		this.tipoActivo = tipoActivo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

}
