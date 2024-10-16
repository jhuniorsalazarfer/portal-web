package pe.gob.senamhi.dto;

import pe.gob.senamhi.config.Utilidades;

import javax.persistence.MappedSuperclass;
import java.util.Date;
@MappedSuperclass
public abstract class ComunDto {

    protected String id;
    protected Integer estado;
    protected Date fechaRegistro;

    public ComunDto() {}

    public String getId() {
        String idTmp = null;
        try {
            idTmp = (id != null) ? (Utilidades.esNumerico(id)) ? Utilidades.Encriptar(id) : Utilidades.Desencriptar(id) : null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idTmp;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getEstado() {
        return (estado != null) ? estado : 1;
    }

    public void setEstado(Integer estado) {
        this.estado = (estado != null) ? estado : 1;
    }

    public Date getFechaRegistro() {
        return (fechaRegistro != null) ? fechaRegistro : new Date();
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = (fechaRegistro != null) ? fechaRegistro : new Date();
    }
}
