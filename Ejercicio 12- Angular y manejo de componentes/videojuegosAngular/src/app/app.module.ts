import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { VideojuegosComponentComponent } from './videojuegos-component/videojuegos-component.component';
import { LoginComponent } from './login/login.component';
import { CabezeraComponent } from './cabezera/cabezera.component';
import { ContactoComponent } from './contacto/contacto.component';
import { BienvenidaComponent } from './bienvenida/bienvenida.component';
import { SobreNosotrosComponent } from './sobreNosotros/sobreNosotros.component';

@NgModule({
  declarations: [						
    AppComponent,
      VideojuegosComponentComponent,
      LoginComponent,
      CabezeraComponent,
      ContactoComponent,
      BienvenidaComponent,
      SobreNosotrosComponent
   ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
