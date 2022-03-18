export class Historial {
    private _id: string;
    private _goles: number;
    private _amarillas: number;
    private _rojas: number;
  
    //Los atributos estaticos son comunes a todos los objetos
    public static numeroPersonas: number = 0;
  
    constructor(id: string, goles: number, amarillas: number, rojas: number) {
      this._id = id;
      this._goles = goles;
      this._amarillas = amarillas;
      this._rojas = rojas;
    }
  
    //Getters y Settes--------------------------------------------------------------------------------------------------------
  
    public get id(): string {
      return this._id;
    }
    public set id(value: string) {
      this._id = value;
    }
    public get goles(): number {
      return this._goles;
    }
    public set goles(value: number) {
      this._goles = value;
    }
    public get amarillas_1(): number {
      return this._amarillas;
    }
    public set amarillas_1(value: number) {
      this._amarillas = value;
    }
    public get rojas_1(): number {
      return this._rojas;
    }
    public set rojas_1(value: number) {
      this._rojas = value;
    }
  }
  
  