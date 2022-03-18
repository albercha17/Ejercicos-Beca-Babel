export class Videojuegos{
    private _id: number;
    private _nombre: string;
    private _compania: string;
    private _valoracion: number;

    private static contadorId : number = 1;

    constructor(nombre:string,compania:string,valoracion:number){
        this._id= Videojuegos.contadorId++;;
        this._nombre=nombre;
        this._compania=compania;
        this._valoracion=valoracion;
    }


public get id(): number {
        return this._id;
    }
    public set id(value: number) {
        this._id = value;
    }
 public get nombre(): string {
        return this._nombre;
    }
    public set nombre(value: string) {
        this._nombre = value;
    }
    public get compania(): string {
        return this._compania;
    }
    public set compania(value: string) {
        this._compania = value;
    } 
    public get valoracion(): number {
        return this._valoracion;
    }
    public set valoracion(value: number) {
        this._valoracion = value;
    }
}