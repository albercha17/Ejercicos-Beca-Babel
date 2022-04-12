import { Videojuegos } from "./Videojuegos";
export class Usuario{

    private _nombre: string;
    private _password: string;
    private _listaV: Videojuegos[];
    
    constructor(nombre:string,password:string, listaV:Videojuegos[]){
        this._nombre=nombre
        this._password=password
        this._listaV=listaV
    }
    public get password(): string {
        return this._password;
    }
    public set password(value: string) {
        this._password = value;
    }
    public get nombre(): string {
        return this._nombre;
    }
    public set nombre(value: string) {
        this._nombre = value;
    }
    public get listaV(): Videojuegos[] {
            return this._listaV;
        }
    public set listaV(value: Videojuegos[]) {
        this._listaV = value;
        }
}