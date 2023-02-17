#Author: Rym
#Keywords Summary :
#Feature: List of scenarios.

@tag
Feature: Authentification Orange
  Nous allons faire authentification du site Orange

  @tag1
  Scenario: Authentication valide
    Given Ouvrir URL application
    When Saisir login 
    And Saisir mot de passe
    And Cliquer Bouton
    Then Ouvrir page acceuil