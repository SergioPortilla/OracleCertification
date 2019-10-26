package java8.questions.certified.material;

import java.io.Serializable;
import java.util.Date;

/**
 * Clase modelo de la tabla {@code SGR_OPCION_MENU}.
 *
 * <p>Fecha de creación: 2018-11-06.</p>
 *
 * @author Leonardo Reyes.
 */
public class SgrOpcionMenu implements Serializable {
    private static final long serialVersionUID = 1L;
    /** Identificador de la opcion de menu. */
    private Long id;
    /** Codigo que identifica el registro. */
    private String codigo;
    /** Nombre de la opcion del menu. */
    private String nombre;
    /** URL de acceso a la opcion del sistema. */
    private String url;
    /** Opcion menu padre. */
    private SgrOpcionMenu padre;
    /** Posicion de la opcion, como se muestra en el menu. */
    private long orden;
    /** Auditoría: Fecha de Modificación del registro. */
    private Date fechaCreacion;
    /** Auditoría: Fecha de Modificación del registro. */
    private Date fechaModificacion;
    /** Auditoría: Cantidad de modificaciones realizadas al registro. */
    private long numeroModificaciones;

    /** Contructor vacio. */
    public SgrOpcionMenu() {
    }

    /**
     * Contructor que inicializa un objeto con su identificador.
     *
     * @param id
     *        Identificador de la opcion de menu.
     */
    public SgrOpcionMenu(Long id) {
        this.id = id;
    }

    /**
     * Consctructor que inicializa un objeto con su nombre.
     *
     * @param nombre
     */
    public SgrOpcionMenu(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Contructor que inicializa un objeto con todos su elementos, a excepcion del id.
     *
     * @param codigo
     *        Codigo que identifica el registro.
     *
     * @param nombre
     *        Nombre de la opcion del menu.
     *
     * @param url
     *        URL de acceso a la opcion del sistema.
     *
     * @param padre
     *        Opcion menu padre.
     *
     * @param orden
     *        Posicion de la opcion, como se muestra en el menu.
     *
     * @param fechaCreacion
     *        Auditoría: Fecha de creación del registro.
     *
     * @param fechaModificacion
     *        Auditoría: Fecha de Modificación del registro.
     *
     * @param numeroModificaciones
     *        Auditoría: Cantidad de modificaciones realizadas al registro.
     */
    public SgrOpcionMenu(String codigo, String nombre, String url,
                         SgrOpcionMenu padre, long orden,
                         Date fechaCreacion, Date fechaModificacion,
                         long numeroModificaciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.url = url;
        this.padre = padre;
        this.orden = orden;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.numeroModificaciones = numeroModificaciones;
    }

    /**
     * Contructor que inicializa un objeto con todos su elementos.
     *
     * @param id
     *        Identificador de la opcion de menu
     *
     * @param codigo
     *        Codigo que identifica el registro.
     *
     * @param nombre
     *        Nombre de la opcion del menu.
     *
     * @param url
     *        URL de acceso a la opcion del sistema.
     *
     * @param padre
     *        Opcion menu padre.
     *
     * @param orden
     *        Posicion de la opcion, como se muestra en el menu.
     *
     * @param fechaCreacion
     *        Auditoría: Fecha de creación del registro.
     *
     * @param fechaModificacion
     *        Auditoría: Fecha de Modificación del registro.
     *
     * @param numeroModificaciones
     *        Auditoría: Cantidad de modificaciones realizadas al registro.
     */
    public SgrOpcionMenu(Long id, String codigo, String nombre, String url,
                         SgrOpcionMenu padre, long orden,
                         Date fechaCreacion, Date fechaModificacion,
                         long numeroModificaciones) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.url = url;
        this.padre = padre;
        this.orden = orden;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.numeroModificaciones = numeroModificaciones;
    }

    /**
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     */
    public long getOrden() {
        return orden;
    }

    /**
     *
     * @param orden
     */
    public void setOrden(long orden) {
        this.orden = orden;
    }

    /**
     *
     * @return
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     *
     * @param fechaCreacion
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     *
     * @return
     */
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     *
     * @param fechaModificacion
     */
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    /**
     *
     * @return
     */
    public long getNumeroModificaciones() {
        return numeroModificaciones;
    }

    /**
     *
     * @param numeroModificaciones
     */
    public void setNumeroModificaciones(long numeroModificaciones) {
        this.numeroModificaciones = numeroModificaciones;
    }

    /**
     *
     * @return
     */
    public SgrOpcionMenu getPadre() {
        return padre;
    }

    /**
     *
     * @param padre
     */
    public void setPadre(SgrOpcionMenu padre) {
        this.padre = padre;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SgrOpcionMenu)) {
            return false;
        }
        SgrOpcionMenu other = (SgrOpcionMenu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.gov.rnec.ani.model.sgr.SgrOpcionMenu[ id=" + id + " ]";
    }

}
