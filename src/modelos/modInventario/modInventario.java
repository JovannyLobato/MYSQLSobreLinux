/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.modInventario;

import java.util.Date;

/**
 *
 * @author jovan
 */
public class modInventario {
    private int id;
    private String nombreCorto;
    private String descripcion;
    private String serie;
    private String color;
    private Date fechaAdquisision;
    private String tipoAdquisision;
    private String observaciones;
    private int area_id;

    public void setFechaAdquisision(Date fechaAdquisision) {
        this.fechaAdquisision = fechaAdquisision;
    }

    public void setTipoAdquisision(String tipoAdquisision) {
        this.tipoAdquisision = tipoAdquisision;
    }

    public modInventario( String nombreCorto, String descripcion, String serie, String color, Date fechaAdquisision,
        String tipoAdquisision, String observaciones,int area_id) {
        this.nombreCorto = nombreCorto;
        this.descripcion = descripcion;
        this.serie = serie;
        this.color = color;
        this.fechaAdquisision = fechaAdquisision;
        this.tipoAdquisision = tipoAdquisision;
        this.observaciones = observaciones;
        this.area_id = area_id;
    }

    public String getTipoAdquisision() {
        return tipoAdquisision;
    }
    public Date getFechaAdquisision() {
        return fechaAdquisision;
    }
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public String getNombreCorto() {
        return nombreCorto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getSerie() {
        return serie;
    }

    public String getColor() {
        return color;
    }

    public String getFechaAdquisision() {
        return fechaAdquisision;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreCorto(String nombreCorto) {
        this.nombreCorto = nombreCorto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFechaAdquisision(String fechaAdquisision) {
        this.fechaAdquisision = fechaAdquisision;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }
    
}
