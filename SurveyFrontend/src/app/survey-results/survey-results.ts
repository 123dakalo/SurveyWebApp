import {Component, OnInit} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-survey-results',
  standalone: false,
  templateUrl: './survey-results.html',
  styleUrl: './survey-results.css'
})
export class SurveyResults implements OnInit{

  stats: any = {};

  constructor(private http: HttpClient) {}

  ngOnInit() {
    this.http.get('http://localhost:8080/api/surveys/stats').subscribe({
      next: (data) => {
        this.stats = data;
      },
      error: (err) => {
        console.error('Error fetching stats:', err);
      }
    });
  }
}
