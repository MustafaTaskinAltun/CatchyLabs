@login
Feature: Edit Account


  Scenario: Edit account rakam ile giris yapma
    Given kullanici catchylab sayfasina gider
    Then kullanici valid user ve valid password ile girer
    And Sayfa basliginin apps olarak geldigi gorulur
    And kullanici open money transfer butonuna tiklar
    And kullanici money transfer ekraninin acildigini kontrol eder
    And kullanici edit account butonuna tiklar
    And kullanici account name alanina rakam girer ve update e tiklar
    And hata almadan gectigini gorur

  Scenario: Edit account space(boşluk) ile giris yapma
    Given kullanici catchylab sayfasina gider
    Then kullanici valid user ve valid password ile girer
    And Sayfa basliginin apps olarak geldigi gorulur
    And kullanici open money transfer butonuna tiklar
    And kullanici money transfer ekraninin acildigini kontrol eder
    And kullanici edit account butonuna tiklar
    And kullanici account name alanina space tusu ile bosluk karakteri girer ve update e tiklar
    And kulanici hata almadan gectigini gorur

  Scenario: Edit account special karakter ile giris yapma
    Given kullanici catchylab sayfasina gider
    Then kullanici valid user ve valid password ile girer
    And Sayfa basliginin apps olarak geldigi gorulur
    And kullanici open money transfer butonuna tiklar
    And kullanici money transfer ekraninin acildigini kontrol eder
    And kullanici edit account butonuna tiklar
    And kullanici account name special karakter girer ve update e tiklar
    And kulanici special karakter ile hata almadan gectigini gorur