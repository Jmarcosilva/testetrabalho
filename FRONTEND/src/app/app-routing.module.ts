import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastroCarrosComponent } from './components/cadastro-carros/cadastro-carros.component';
import { ViewcadastroCarrosComponent } from './components/viewcadastro-carros/viewcadastro-carros.component';

const routes: Routes = [
  {path:"cadastrocarro",component:CadastroCarrosComponent},
  {path:"", component: ViewcadastroCarrosComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
