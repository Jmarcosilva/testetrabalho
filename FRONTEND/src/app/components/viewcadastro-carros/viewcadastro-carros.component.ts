import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Carro } from 'src/app/interfaces/carro';
import { CarroService } from 'src/app/services/carro/carro.service';

@Component({
  selector: 'app-viewcadastro-carros',
  templateUrl: './viewcadastro-carros.component.html',
  styleUrls: ['./viewcadastro-carros.component.css']
})
export class ViewcadastroCarrosComponent  implements OnInit{

  carros: Carro[] | undefined
  url: string = "http://localhost:8080/";

  constructor(private carroservice: CarroService, private router: Router) { 
   
  }

  ngOnInit(): void {
    this.carroservice.getCarro().subscribe(data => {
      this.carros = data;
    })
  }

  deleteCarro(id: number){
    this.carroservice.deleteCarro(id).subscribe(data => {
      this.carros = this.carros?.filter(carro => carro.idcar !== id);
    })
    
      setTimeout(()=>{
        window.location.reload();
      }, 100);
  
  }

  updateCarro(id: number){
    this.router.navigate(['update', id]);
  }

}
