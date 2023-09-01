import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewcadastroCarrosComponent } from './viewcadastro-carros.component';

describe('ViewcadastroCarrosComponent', () => {
  let component: ViewcadastroCarrosComponent;
  let fixture: ComponentFixture<ViewcadastroCarrosComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewcadastroCarrosComponent]
    });
    fixture = TestBed.createComponent(ViewcadastroCarrosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
