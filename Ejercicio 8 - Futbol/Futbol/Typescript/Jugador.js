"use strict";
exports.__esModule = true;
exports.Jugador = void 0;
//Jugador------------------------------------------
var Jugador = /** @class */ (function () {
    function Jugador(id, nombre, edad, pais, historial) {
        this._id = id;
        this._nombre = nombre;
        this._edad = edad;
        this._pais = pais;
        this._historial = historial;
    }
    Object.defineProperty(Jugador.prototype, "id", {
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
    Object.defineProperty(Jugador.prototype, "nombre", {
        get: function () {
            return this._nombre;
        },
        set: function (value) {
            this._nombre = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Jugador.prototype, "edad", {
        get: function () {
            return this._edad;
        },
        set: function (value) {
            this._edad = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Jugador.prototype, "pais", {
        get: function () {
            return this._pais;
        },
        set: function (value) {
            this._pais = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Jugador.prototype, "historial_1", {
        get: function () {
            return this._historial;
        },
        set: function (value) {
            this._historial = value;
        },
        enumerable: false,
        configurable: true
    });
    return Jugador;
}());
exports.Jugador = Jugador;
