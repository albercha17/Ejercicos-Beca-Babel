export class Historial {
    constructor(id, goles, amarillas, rojas) {
        this._id = id;
        this._goles = goles;
        this._amarillas = amarillas;
        this._rojas = rojas;
    }
    //Getters y Settes--------------------------------------------------------------------------------------------------------
    get id() {
        return this._id;
    }
    set id(value) {
        this._id = value;
    }
    get goles() {
        return this._goles;
    }
    set goles(value) {
        this._goles = value;
    }
    get amarillas_1() {
        return this._amarillas;
    }
    set amarillas_1(value) {
        this._amarillas = value;
    }
    get rojas_1() {
        return this._rojas;
    }
    set rojas_1(value) {
        this._rojas = value;
    }
}
//Los atributos estaticos son comunes a todos los objetos
Historial.numeroPersonas = 0;
