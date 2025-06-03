import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SurveyForm } from './survey-form';

describe('SurveyForm', () => {
  let component: SurveyForm;
  let fixture: ComponentFixture<SurveyForm>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SurveyForm]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SurveyForm);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
