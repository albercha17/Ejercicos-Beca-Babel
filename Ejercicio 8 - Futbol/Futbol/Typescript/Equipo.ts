import { Jugador } from "./Jugador"
//Equipo
export class Equipo{

    private _id: string;
    private _nombre: string;
    private _fecha: string;
    private _jugadores: Jugador[];
    
    constructor(id:string,nombre:string,fecha:string, jugadores: Jugador[]){
        this._id=id;
        this._nombre=nombre;
        this._fecha=fecha;
        this._jugadores=jugadores;
    }

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
    public get fecha(): string {
        return this._fecha;
    }
    public set fecha(value: string) {
        this._fecha = value;
    }
    public get jugadores(): Jugador[] {
        return this._jugadores;
    }
    public set jugadores(value: Jugador[]) {
        this._jugadores = value;
    }

}
