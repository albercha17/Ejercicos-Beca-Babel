//Equipo
export class Equipo {
    constructor(id, nombre, fecha, jugadores) {
        this._id = id;
        this._nombre = nombre;
        this._fecha = fecha;
        this._jugadores = jugadores;
    }
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
    get fecha() {
        return this._fecha;
    }
    set fecha(value) {
        this._fecha = value;
    }
    get jugadores() {
        return this._jugadores;
    }
    set jugadores(value) {
        this._jugadores = value;
    }
}
