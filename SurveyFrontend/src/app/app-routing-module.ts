import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {SurveyForm} from './survey-form/survey-form';
import {SurveyResults} from './survey-results/survey-results';

const routes: Routes = [
  { path: '', redirectTo: 'survey_forms', pathMatch: 'full'},
  { path: 'survey_forms', component: SurveyForm},
  { path: 'survey_results', component: SurveyResults}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
