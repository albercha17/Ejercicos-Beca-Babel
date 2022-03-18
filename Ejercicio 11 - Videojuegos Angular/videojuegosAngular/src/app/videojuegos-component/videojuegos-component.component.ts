import { Component, OnInit } from '@angular/core';
import { Videojuegos } from '../entidades/Videojuegos';
@Component({
  selector: 'app-videojuegos-component',
  templateUrl: './videojuegos-component.component.html',
  styleUrls: ['./videojuegos-component.component.css']
})
export class VideojuegosComponentComponent implements OnInit {
  listaVideojuegos: Videojuegos[] = []

  nombreObligatorio: boolean= true;
  companiaObligatoria: boolean= true;
  valoracionObligatoria: boolean= true;

  modificarBorrarDeshabilitado : boolean = true;
  insertarDeshabilitado : boolean = false;

  videojuego : Videojuegos | null = null//permitimos al heroe apuntar null

  id : number = 0
  nombre : string = ""
  compania : string = ""
  valoracion:number=0

  constructor() {
    var vJ= new Videojuegos("Call of Duty","Activision",7)
    this.listaVideojuegos.push(vJ);
    vJ= new Videojuegos("FIFA 22","EA",6)
    this.listaVideojuegos.push(vJ);

   }
  ngOnInit() {
  }

  public hayErroresEnFormulario():boolean{
    let error : boolean = false
    this.nombreObligatorio = true
    this.companiaObligatoria= true;
    this.valoracionObligatoria= true;

    if(this.nombre.trim().length==0){
      this.nombreObligatorio= false
      error = true
    }
    
    if(this.compania.trim().length==0){
      this.companiaObligatoria = false
      error = true
    }
    if(this.valoracion<=0 || this.valoracion>10){
      this.valoracionObligatoria = false
      error = true
    }
    return error
  }

  public insertar(){
    if(!this.hayErroresEnFormulario()){
      var existe : boolean = false;
      for(var i=0;i<this.listaVideojuegos.length;i++){
        if(this.id==this.listaVideojuegos[i].id)
          existe=true;
      }
      if(!existe){
        this.videojuego = new Videojuegos(this.nombre, this.compania,this.valoracion)
        this.listaVideojuegos.push(this.videojuego)
        this.vaciar()
      }
      
    }    
  }

  public modificar(){
    if(!this.hayErroresEnFormulario()){
      for(var i=0;i<this.listaVideojuegos.length;i++){
        if(this.id==this.listaVideojuegos[i].id){
          this.listaVideojuegos[i].nombre=this.nombre
          this.listaVideojuegos[i].compania=this.compania
          this.listaVideojuegos[i].valoracion=this.valoracion
        }
      }
    }    
  }

  public borrar(){
      for(var i=0;i<this.listaVideojuegos.length;i++){
        if(this.id==this.listaVideojuegos[i].id)
          this.listaVideojuegos.splice(i,1)
      }
      this.vaciar();
  }

  public vaciar(){
    console.log("Vaciando...")     
    this.id = 0
    this.nombre = ""
    this.compania = ""
    this.valoracion=0;

    this.nombreObligatorio = true
    this.companiaObligatoria= true;
    this.valoracionObligatoria= true;
    this.insertarDeshabilitado=false;
    this.modificarBorrarDeshabilitado=true;
  }

  public seleccionar(videojuego : Videojuegos) : void{
    console.log("Seleccionando...")

    this.nombreObligatorio = true
    this.companiaObligatoria= true;
    this.valoracionObligatoria= true;

    this.id = videojuego.id
    this.nombre = videojuego.nombre
    this.compania = videojuego.compania
    this.valoracion = videojuego.valoracion

    this.insertarDeshabilitado=true;
    this.modificarBorrarDeshabilitado=false;
   
  }

}
