package net.javaguides.surveybackend.controller;

import net.javaguides.surveybackend.model.Calculation;
import net.javaguides.surveybackend.model.Survey;

import net.javaguides.surveybackend.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/surveys")
@CrossOrigin(origins = "*")
public class SurveyController {

    @Autowired
    private SurveyRepository surveyRepository;

    @PostMapping
    public Survey createSurvey(@RequestBody Survey survey) {
        return surveyRepository.save(survey);
    }

    @GetMapping
    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    @GetMapping("/stats")
    public Calculation getSurveyStatistics() {
        List<Survey> surveys = surveyRepository.findAll();
        Calculation stats = new Calculation();

        stats.setTotalSurveys(surveys.size());

        if (surveys.isEmpty()) {
            return stats;
        }

        List<Integer> ages = surveys.stream()
                .map(survey -> {
                    LocalDate dob = survey.getDateOfBirth();
                    LocalDate today = LocalDate.now();
                    int age = today.getYear() - dob.getYear();
                    if (today.getDayOfYear() < dob.getDayOfYear()) {
                        age--;
                    }
                    return age;
                }).toList();

        double averageAge = ages.stream().mapToInt(Integer::intValue).average().orElse(0);
        stats.setAverageAge(Math.round(averageAge * 10) / 10.0);

        stats.setOldestAge(ages.stream().max(Integer::compare).orElse(0));
        stats.setYoungestAge(ages.stream().min(Integer::compare).orElse(0));

        long pizzaCount = surveys.stream().filter(Survey::isPizza).count();
        double pizzaPercentage = (double) pizzaCount / surveys.size() * 100;
        stats.setPizzaPercentage(Math.round(pizzaPercentage * 10) / 10.0);

        long pastaCount = surveys.stream().filter(Survey::isPasta).count();
        double pastaPercentage = (double) pastaCount / surveys.size() * 100;
        stats.setPastaPercentage(Math.round(pastaPercentage * 10) / 10.0);

        long papWorsCount = surveys.stream().filter(Survey::isPapWors).count();
        double papWorsPercentage = (double) papWorsCount / surveys.size() * 100;
        stats.setPapWorsPercentage(Math.round(papWorsPercentage * 10) / 10.0);


        double movieAverage = surveys.stream().mapToInt(Survey::getWatchMovies).average().orElse(0);
        stats.setMoviesAverage(Math.round(movieAverage * 10) / 10.0);

        double radioAverage = surveys.stream().mapToInt(Survey::getListenRadio).average().orElse(0);
        stats.setRadioAverage(Math.round(radioAverage * 10) / 10.0);

        double eatOutAverage = surveys.stream().mapToInt(Survey::getEatOut).average().orElse(0);
        stats.setEatOutAverage(Math.round(eatOutAverage * 10) / 10.0);

        double tvAverage = surveys.stream().mapToInt(Survey::getWatchTV).average().orElse(0);
        stats.setTvAverage(Math.round(tvAverage * 10) / 10.0);

        return stats;
    }
}
