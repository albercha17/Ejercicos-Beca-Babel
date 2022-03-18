import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.componet';
import { PlantillaComponetComponent } from './plantilla-componet/plantilla-componet.component';
import { CabezeraComponent } from './cabezera/cabezera.component';

@NgModule({
  declarations: [		
    AppComponent,
      PlantillaComponetComponent,
      CabezeraComponent
   ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
