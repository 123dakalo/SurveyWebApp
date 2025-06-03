# SurveyWebApp

This is a survey application developed as part of the Software Development Assignment. The app allows users to fill out a lifestyle preference survey, stores the responses in a database, and displays summarized survey results.

## 🔧 Technologies Used

- **Frontend**: Angular / HTML, CSS, Typescript
- **Backend**: Spring Boot / Java
- **Database**: MySQL /

---

## 🚀 Features

### 👤 Fill Out Survey
- Users enter:
  - Full Name
  - Contact Number
  - Age (between 5 and 120)
  - Date (via date picker)
  - Favourite Food (multiple selection with checkboxes)
  - Lifestyle Ratings (1–5 using radio buttons)

- All fields are validated:
  - No empty fields
  - Age must be between 5 and 120
  - Rating fields are required

- On clicking **Submit**, data is saved to the database.

### 📊 View Survey Results
- Displays the following stats:
  - Total number of surveys completed
  - Average age
  - Oldest participant
  - Youngest participant
  - % of participants who like Pizza
  - Average rating for "I like to eat out"

- If no data exists: “No Surveys Available” message is shown.

---

## 📂 Project Structure

