@login
Feature: login

  Scenario: invalid user ile giris yapma
    Given kullanici catchylab sayfasina gider
    Then kullanici invalid user ve invalid password girer
    And kullanici Username or Password Invalid! hatasini aldigini gorur

  Scenario: valid user ile giris yapma
    Given kullanici catchylab sayfasina gider
    Then kullanici valid user ve valid password ile girer
    And Sayfa basliginin apps olarak geldigi gorulur