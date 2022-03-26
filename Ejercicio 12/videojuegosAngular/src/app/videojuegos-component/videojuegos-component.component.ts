import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Videojuegos } from '../entidades/Videojuegos';
@Component({
  selector: 'app-videojuegos-component',
  templateUrl: './videojuegos-component.component.html',
  styleUrls: ['./videojuegos-component.component.css']
})
export class VideojuegosComponentComponent implements OnInit {
   static listaVideojuegos: Videojuegos[] =
    [new Videojuegos("Call of Duty","Activision",7,"https://cdn.akamai.steamstatic.com/steam/apps/115300/capsule_616x353.jpg?t=1646849563")
    ,new Videojuegos("Fornite","Epic Games",8,"https://areajugones.sport.es/wp-content/uploads/2022/03/fortnite-ucrania-1080x609.jpg")
    ,new Videojuegos("FIFA 22","EA",6,"https://as01.epimg.net/meristation/imagenes/2021/10/01/guias/1633081476_163721_1633081863_noticia_normal.jpg")
    ,new Videojuegos("Super Mario Odyssey","Nintendo",7,"https://www2.minijuegosgratis.com/v3/games/thumbnails/233039_1.jpg")
  ]
   listaVideojuegos2: Videojuegos[] = []

  videojuego : Videojuegos | null = null//permitimos al heroe apuntar null

  mostrarInfo:boolean=false;
  id : number = 0
  nombre : string = ""
  compania : string = ""
  valoracion:number=0
  foto:string=""
  usuario :string =""

  constructor(route:ActivatedRoute) {
    this.listaVideojuegos2=VideojuegosComponentComponent.listaVideojuegos
   }
  ngOnInit() {
  }

  public seleccionar(videojuego : Videojuegos) : void{
    this.mostrarInfo=true;
    this.id = videojuego.id
    this.nombre = videojuego.nombre
    this.compania = videojuego.compania
    this.valoracion = videojuego.valoracion
    this.foto=videojuego.foto
   
  }

  public borrarInfo():void{
    this.mostrarInfo=false;
  }
}
