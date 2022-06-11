@BackgroundExmaple
  Feature: To explain the usage of background
    Background: Two condition one and two
      Given The student in science
      Given The student in engineering

      Scenario: To study science
        Given the student can study the science subject
        When the student can cleared
        Then the student become scienctist

      Scenario: To study engineering
        Given the student can study the engineering subject
        When the student can cleared and pass
        Then the studen become engineer