package net.javaguides.surveybackend.repository;

import net.javaguides.surveybackend.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository  extends JpaRepository<Survey, Long> {

}
