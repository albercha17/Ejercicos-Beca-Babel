import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BienvenidaComponent } from './bienvenida/bienvenida.component';
import { CabezeraComponent } from './cabezera/cabezera.component';
import { ContactoComponent } from './contacto/contacto.component';
import { LoginComponent } from './login/login.component';
import { SobreNosotrosComponent } from './sobreNosotros/sobreNosotros.component';
import { VideojuegosComponentComponent } from './videojuegos-component/videojuegos-component.component';

const routes: Routes = [
  {
    path : '',
    component : LoginComponent
  },
  {
    path : 'login',
    component : LoginComponent
  },
  {
    path : 'listaV',
    component : VideojuegosComponentComponent
  },
  {
    path : 'bienvenida/:nombre',
    component : BienvenidaComponent
  },
  {path : 'contacto', component : ContactoComponent}
  ,
  {path : 'nosotros', component : SobreNosotrosComponent}
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
