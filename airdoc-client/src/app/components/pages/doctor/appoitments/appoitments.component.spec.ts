import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AppoitmentsComponent } from './appoitments.component';

describe('AppoitmentsComponent', () => {
  let component: AppoitmentsComponent;
  let fixture: ComponentFixture<AppoitmentsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AppoitmentsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AppoitmentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
