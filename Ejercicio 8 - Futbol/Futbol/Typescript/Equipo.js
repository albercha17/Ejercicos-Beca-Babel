"use strict";
exports.__esModule = true;
exports.Equipo = void 0;
//Equipo
var Equipo = /** @class */ (function () {
    function Equipo(id, nombre, fecha, jugadores) {
        this._id = id;
        this._nombre = nombre;
        this._fecha = fecha;
        this._jugadores = jugadores;
    }
    Object.defineProperty(Equipo.prototype, "id", {
        get: function () {
            return this._id;
        },
        set: function (value) {
            this._id = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Equipo.prototype, "nombre", {
        get: function () {
            return this._nombre;
        },
        set: function (value) {
            this._nombre = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Equipo.prototype, "fecha", {
        get: function () {
            return this._fecha;
        },
        set: function (value) {
            this._fecha = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Equipo.prototype, "jugadores", {
        get: function () {
            return this._jugadores;
        },
        set: function (value) {
            this._jugadores = value;
        },
        enumerable: false,
        configurable: true
    });
    return Equipo;
}());
exports.Equipo = Equipo;
