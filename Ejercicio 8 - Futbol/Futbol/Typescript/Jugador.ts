import{ Historial } from "./Historial"
//Jugador------------------------------------------
 export class Jugador {
    private _id: string;
    private _nombre: string;
    private _edad: number;
    private _pais: string;
    private _historial: Historial;
    private _foto: string;
    private _titular: boolean;
  
    constructor(
      id: string,
      nombre: string,
      edad: number,
      pais: string,
      historial: Historial,
      foto: string,
      titular: boolean
    ) {
      this._id = id;
      this._nombre = nombre;
      this._edad = edad;
      this._pais = pais;
      this._historial = historial;
      this._foto=foto
      this._titular=titular
    }
    //Getters y Settes--------------------------------------------------------------------------------------------------------
    public get id(): string {
      return this._id;
    }
    public set id(value: string) {
      this._id = value;
    }
    public get nombre(): string {
      return this._nombre;
    }
    public set nombre(value: string) {
      this._nombre = value;
    }
  
    public get edad(): number {
      return this._edad;
    }
    public set edad(value: number) {
      this._edad = value;
    }
    public get pais(): string {
      return this._pais;
    }
    public set pais(value: string) {
      this._pais = value;
    }
    public get historial_1(): Historial {
      return this._historial;
    }
    public set historial_1(value: Historial) {
      this._historial = value;
    }
    public get foto(): string {
      return this._foto;
    }
    public set foto(value: string) {
      this._foto = value;
    }
    public get titular(): boolean {
      return this._titular;
    }
    public set titular(value: boolean) {
      this._titular = value;
    }
   
    //--------------------------------------------------------------------------------------------------------
  }