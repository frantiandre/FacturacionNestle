/*
  UNIANDES PUYO
Sistema de Facturacion 2016 
Octavo Semestre
Franklin Cando
23/05/2016
 */

package entidades;

/**
 *
 * @author FRANKLIN
 */
public class clsproveedor {
    private String _ruc;    
    private String _nombres;
    private String _razonSocial; //ejemplo aceite la favorita razon social supermaxi
    private String _direccion;
    private String _telefono;

    public clsproveedor() {
    }

    public clsproveedor(String _ruc, String _nombres, String _razonSocial, String _direccion, String _telefono) {
        this._ruc = _ruc;
        this._nombres = _nombres;
        this._razonSocial = _razonSocial;
        this._direccion = _direccion;
        this._telefono = _telefono;
    }

    public String Ruc() {
        return _ruc;
    }

    public void Ruc(String _ruc) {
        this._ruc = _ruc;
    }

    public String Nombres() {
        return _nombres;
    }

    public void Nombres(String _nombres) {
        this._nombres = _nombres;
    }

    public String RazonSocial() {
        return _razonSocial;
    }

    public void RazonSocial(String _razonSocial) {
        this._razonSocial = _razonSocial;
    }

    public String Direccion() {
        return _direccion;
    }

    public void Direccion(String _direccion) {
        this._direccion = _direccion;
    }

    public String Telefono() {
        return _telefono;
    }

    public void Telefono(String _telefono) {
        this._telefono = _telefono;
    }
    
    
    
}
