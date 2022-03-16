"use strict";
exports.__esModule = true;
exports.Historial = void 0;
var Historial = /** @class */ (function () {
    function Historial(id, goles, amarillas, rojas) {
        this._id = id;
        this._goles = goles;
        this._amarillas = amarillas;
        this._rojas = rojas;
    }
    Object.defineProperty(Historial.prototype, "id", {
        //Getters y Settes--------------------------------------------------------------------------------------------------------
        get: function () {
            return this._id;
        },
        set: function (value) {
            this._id = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Historial.prototype, "goles", {
        get: function () {
            return this._goles;
        },
        set: function (value) {
            this._goles = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Historial.prototype, "amarillas_1", {
        get: function () {
            return this._amarillas;
        },
        set: function (value) {
            this._amarillas = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Historial.prototype, "rojas_1", {
        get: function () {
            return this._rojas;
        },
        set: function (value) {
            this._rojas = value;
        },
        enumerable: false,
        configurable: true
    });
    //Los atributos estaticos son comunes a todos los objetos
    Historial.numeroPersonas = 0;
    return Historial;
}());
exports.Historial = Historial;
