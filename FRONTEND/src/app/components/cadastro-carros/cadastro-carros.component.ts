import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';


import { Router } from '@angular/router';
import { CarroService } from 'src/app/services/carro/carro.service';

@Component({
  selector: 'app-cadastro-carros',
  templateUrl: './cadastro-carros.component.html',
  styleUrls: ['./cadastro-carros.component.css']
})
export class CadastroCarrosComponent implements OnInit {

  constructor(private carroservice: CarroService, private router: Router) { }
  data: any
  
  //formulario reactivo
  form = new FormGroup({
    placa: new FormControl('', [Validators.required]),
    //renavam: new FormControl('', [Validators.required]),
   // marca: new FormControl('', [Validators.required]),
   // modelo: new FormControl('', [Validators.required]),
   // anodefabricacao: new FormControl('', [Validators.required]),
   // anodemodelo: new FormControl('', [Validators.required]),
   // cor: new FormControl('', [Validators.required]),
   // combustivel: new FormControl('', [Validators.required]),
   // quilometragem: new FormControl('', [Validators.required]),
    //tipo: new FormControl('', [Validators.required]),
    //valordecompra: new FormControl('', [Validators.required]),
    //anexodoc: new FormControl('', [Validators.required]),
   // datadeentrada: new FormControl('', [Validators.required])
  })
  
  ngOnInit(): void {
  }

  submit(){
    this.data = this.form.value
    console.log(this.data)

    this.carroservice.addCarro(this.data).subscribe(data => {
      console.log(data)
    })
    this.router.navigate(['/']);

    setTimeout(()=>{
      window.location.reload();
    }, 100);
  }

}
