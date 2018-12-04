import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ContatoListComponent } from './contatos/contato-list/contato-list.component';
import { ContatoFormComponent } from './contatos/contato-form/contato-form.component';
import { ProdutoFormComponent } from './produtos/produto-form/produto-form.component';
import { ProdutoListComponent } from './produtos/produto-list/produto-list.component';

const routes: Routes = [
  {
    path: "contatos",
    component: ContatoListComponent
  },
  {
    path: "contatos/:id",
    component: ContatoFormComponent
  },
  {
    path: "",
    redirectTo: 'contatos',
    pathMatch: 'full'
  },

  {
    path: "produtos",
    component: ProdutoListComponent
  },
  {
    path: "produtos/:id",
    component: ProdutoFormComponent
  },
  {
    path: "",
    redirectTo: 'produtos',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
