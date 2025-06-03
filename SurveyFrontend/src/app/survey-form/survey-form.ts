import {Component} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AbstractControl, FormBuilder, FormGroup, ValidationErrors, Validators} from '@angular/forms';

function ageValidator(control: AbstractControl): ValidationErrors | null {
  if (!control.value) {
    return null;
  }

  const dob = new Date(control.value);
  const today = new Date();

  let age = today.getFullYear() - dob.getFullYear();
  const monthDiff = today.getMonth() - dob.getMonth();
  if (monthDiff < 0 || (monthDiff === 0 && today.getDate() < dob.getDate())) {
    age--;
  }

  if (age < 5 || age > 100) {
    return { invalidAge: true };
  }

  return null;
}


@Component({
  selector: 'app-survey-form',
  standalone: false,
  templateUrl: './survey-form.html',
  styleUrl: './survey-form.css'
})
export class SurveyForm {

  surveyForm: FormGroup;

  ratings = [
    { label: 'I like to watch movies', control: 'watchMovies' },
    { label: 'I like to listen to radio', control: 'listenRadio' },
    { label: 'I like to eat out', control: 'eatOut' },
    { label: 'I like to watch TV', control: 'watchTV' },
  ];

  constructor(private fb: FormBuilder, private http: HttpClient) {
    this.surveyForm = this.fb.group({
      fullName: ['', Validators.required],
      email: ['', [Validators.required, Validators.email]],
      dateOfBirth: ['', [Validators.required, ageValidator]],
      contactNumber: ['', Validators.required],
      pizza: [false],
      pasta: [false],
      papWors: [false],
      other: [false],
      watchMovies: ['', Validators.required],
      listenRadio: ['', Validators.required],
      eatOut: ['', Validators.required],
      watchTV: ['', Validators.required],
    });
  }

  onSubmit() {
    if (this.surveyForm.invalid) {
      const dobControl = this.surveyForm.get('dateOfBirth');

      if (dobControl && dobControl.value) {
        const dob = new Date(dobControl.value);
        const age = this.calculateAge(dob);
        if (age < 5) {
          alert('User must be 5 years or older');
        } else {
          alert('Please fill in all required fields correctly.');
        }
      } else {
        alert('Please fill in all fields and make selections!');
      }
      return;
    }

    const surveyData = this.surveyForm.value;

    this.http.post('http://localhost:8080/api/surveys', surveyData).subscribe({
      next: (response) => {
        console.log('Survey saved:', response);
        alert('Survey submitted successfully!');
        this.surveyForm.reset();
      },
      error: (error) => {
        console.error('Error submitting survey:', error);
        alert('Error submitting survey. Please try again.');
      },
    });
  }

  private calculateAge(dob: Date): number {
    const today = new Date();
    let age = today.getFullYear() - dob.getFullYear();
    const m = today.getMonth() - dob.getMonth();

    if (m < 0 || (m === 0 && today.getDate() < dob.getDate())) {
      age--;
    }

    return age;
  }



}
