//Jugador------------------------------------------
export class Jugador {
    constructor(id, nombre, edad, pais, historial, foto, titular) {
        this._id = id;
        this._nombre = nombre;
        this._edad = edad;
        this._pais = pais;
        this._historial = historial;
        this._foto = foto;
        this._titular = titular;
    }
    //Getters y Settes--------------------------------------------------------------------------------------------------------
    get id() {
        return this._id;
    }
    set id(value) {
        this._id = value;
    }
    get nombre() {
        return this._nombre;
    }
    set nombre(value) {
        this._nombre = value;
    }
    get edad() {
        return this._edad;
    }
    set edad(value) {
        this._edad = value;
    }
    get pais() {
        return this._pais;
    }
    set pais(value) {
        this._pais = value;
    }
    get historial_1() {
        return this._historial;
    }
    set historial_1(value) {
        this._historial = value;
    }
    get foto() {
        return this._foto;
    }
    set foto(value) {
        this._foto = value;
    }
    get titular() {
        return this._titular;
    }
    set titular(value) {
        this._titular = value;
    }
}
