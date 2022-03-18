import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculadora',
  templateUrl: './calculadora.component.html',
  styleUrls: ['./calculadora.component.css']
})
export class CalculadoraComponent implements OnInit {

  numero1=0
  numero2=0
  resultado=0
  constructor() { }

  ngOnInit() {
  }
   Sumar() {
    let resultado1 =  Number(this.numero1) + Number(this.numero2)
    this.resultado = resultado1

}
 Restar() {
    let resultado1 = this.numero1 - this.numero2
    this.resultado = resultado1

}
 Multiplicar() {
    let resultado1 = this.numero1 * this.numero2
    this.resultado = resultado1

}
 Dividir() {
    let resultado1 = this.numero1 / this.numero2
    this.resultado = resultado1

}
}
