import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-bienvenida',
  templateUrl: './bienvenida.component.html',
  styleUrls: ['./bienvenida.component.css']
})
export class BienvenidaComponent implements OnInit {
  nombre:string
  constructor(route:ActivatedRoute) {
    this.nombre =route.snapshot.params["nombre"]
   }

  ngOnInit() {
  }

}
