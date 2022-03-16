import{ Historial } from "./Historial"
//Jugador------------------------------------------
 export class Jugador {
    private _id: string;
    private _nombre: string;
    private _edad: number;
    private _pais: string;
    private _historial: Historial;
  
    constructor(
      id: string,
      nombre: string,
      edad: number,
      pais: string,
      historial: Historial
    ) {
      this._id = id;
      this._nombre = nombre;
      this._edad = edad;
      this._pais = pais;
      this._historial = historial;
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
    //--------------------------------------------------------------------------------------------------------
  }