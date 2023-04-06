package RECAP;

public class InterviewQuestions {
    /*

    INTERVIEW QUESTIONS:

    1)What do you know about Cucumber?
      It is a collaboration tool that makes a connection/bridge between technical and non-technical people
      Cucumber is a BDD(Behavioral-Driven Development)

    2)What is Gherkin language?
      It is a language that is used for Cucumber.
      Cucumber works with TestNG and JUnit(preferable)

    3)What do you achieve with Cucumber in your framework?
      a)Parameterization
      b)Getting professional and readable reports
      c)Clear and understandable Test Cases
      d)Control Execution
      e)Data-Driven Testing (soft-skill)
    NOTE:In my project, we use Cucumber for Automation Testing with JUnit
         Every sprint I get new stories from Jira and write feature files for them.Then I start automating
         the Test Cases based on the requirements from documentation/story

    4)What makes Cucumber unique?
      a)Gherkin language
      b)Feature files
      c)Step Definitions
      d)Hooks
      e)Runner classes
      f)Tags
      g)Cucumber reports

    5)What are the advantages of Cucumber?
      a)Readability -> Clear requirements written by Gherkin Language which is a plain and understandable English
      b)Reusability -> You do not have to write same steps all the time (No duplication)
      c)DDT(Data-Driven Testing) -> Very easy with "Scenario Outline" and "Examples" table
      d)Efficient tool for testing

    6)Can you tell me about Runner class in Cucumber and components in it?
      Runner is a way to centralize and execute your Test cases from one spot

     COMPONENTS:
        ->@RunWith()
        ->@CucumberOptions(
        *features = the location of feature file (CONTENT ROOT)
        *glue = the location step definitions file (SOURCE ROOT)
        *dryRun = to get the snips without execution
        *snippets = type of snippet (camel or underscore)
        *tags = filtration for execution
        *plugin = reports and failed tests)

    7)What are the keywords do you use in Cucumber feature file?
       Feature: General description of test
       Background: Runs before every scenario(It is kind of @Before annotation in Java)
       Scenario: Test case
       Scenario Outline: Runs same scenarios with different set of data
         Examples: Provide data for scenario outline

       Given = Precondition
       When = Actions
       And = Continuous conditions
       Then = Result of action
       But = Opposite condition but expected
       * = Can be used for anything

    8)What do you know about Hooks?Where do you use hooks in Cucumber?
      To be honest, hook reminds me TestBase in TestNG that I was using little bit
       ->We generally store our @Before and @After annotations in this class
       ->It helps to reduce the code redundancy

    9)What is the difference between Scenario Outline and Data Table?
      Scenario Outline:
       1-Comes with "Examples" and belongs to all steps
       2-Run as many as you have pipes under "Examples"

       Data Table:
       1-No keyword and belong to step generally
       2-Runs only ONE TIME per scenario

    10)How do you create report and share with your team?
      TestNG -> I provide "Listeners" (EmailableReporter,FailedEmailableReport)
      JUnit+Cucumber -> I provide dependencies+plugin+Run from MAVEN
        *Once I get the report, if I am running locally I share the link with my team
        *If I am running remotely, they already have access from Jenkins




     */
}
