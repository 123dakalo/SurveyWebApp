import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SurveyResults } from './survey-results';

describe('SurveyResults', () => {
  let component: SurveyResults;
  let fixture: ComponentFixture<SurveyResults>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SurveyResults]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SurveyResults);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
