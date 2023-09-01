import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { Carro } from 'src/app/interfaces/carro';

@Injectable({
  providedIn: 'root'
})
export class CarroService {

  private url = "http://localhost:8080/";
 
  constructor(private http: HttpClient) { }
 
  //add carro (criar)
  addCarro(carro: Carro){
    return this.http.post<Carro>(`${this.url}addcarro`, carro)
  }
 
  //Read carro (listar)
  getCarro(): Observable<any[]>{
    return this.http.get<any[]>(this.url+'carros')
  }
 
  // Read carro by Id (listar por id)
  getCarroById(id: number): Observable<Carro>{
    return this.http.get<Carro>(`${this.url}carro/${id}`)
  }
 
  // Update Carro by id- (atualizar carro pelo id)
  updateCarro(id?: number ,carro?: any): Observable<any>{
    return this.http.put<any>(`${this.url}update/${id}`, carro)
  }
 
  // Delete Carro by id- Delete carro pelo id
  deleteCarro(id: number): Observable<any>{
    return this.http.delete<any>(`${this.url}delete/${id}`)
  }
 
}

