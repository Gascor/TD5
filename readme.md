---
title:  Dossier de tests
author: Lucas DA SILVA FERREIRA
---

# DOSSIER DE TEST / COMPTE RENDU (TD 5)

<table>
    <tbody>
        <tr>
            <td style='border: 1px solid black;text-align: left'> Nom du projet : Test_Classe_Date </td>
            <td style='border: 1px solid black;text-align: left'> Version : 0.0.02a </td>
        </tr>
        <tr>
            <td style='border: 1px solid black;text-align: left'> Document : Dossier de test </td>
            <td style='border: 1px solid black;text-align: left'> Date : 02/06/2023 </td>
        </tr>
        <tr>
            <td colspan=2 style='border: 1px solid black;text-align: left'> Responsables de la rédation : Lucas DA SILVA FERREIRA </td>
        </tr>
    </tbody>
</table>

## **Ce fichier servira de compte rendu.**

## Sommaire<!-- omit in toc -->
- [Dossier de tests](#dossier-de-tests)
    - [1. Introduction](#1-introduction)
    - [1bis. Partie Compte Rendu](#bis-introduction)
    - [2. Description de la procédure de test](#2-description-de-la-procédure-de-test)
    - [3. Description des informations à enregistrer pour le test](#3-description-des-informations-à-enregistrer-pour-le-test)
        - [3.1. Campagne de test](#3.1-campagne-de-test)
        - [3.2. Tests](#3.2-tests)
        - [3.3. Résultats](#3.3-résultats)
        - [3.4. Conclusions](#3.4-conclusions)

### Etape 1: On ajoute la classe date
### Etape 2: on crée la partition d'échange avec la methode dernierjour du mois et est bissextile
### Etape 3: Ajout de "print" à chaque méthode de test

On remarque qu'en rajoutant un print à chaque méthode quand nous éxécutons les tests. le terminal affiche "Test méthode {nom de méthode} au lieu de ne rien afficher. On pourra donc montrer plus correctement quel test à été éxécuté.

### Etape 4: Maniére d'effectuer les tests

Je préfere effectuer les tests en bottom up car cette maniére permet d'identifer d'où vient exactement le probléme comparée à la méthode top_down où si une fonction ne marche pas nous ne savons pas exactement d'ou vient le probléme "Est ce que le probléme vient de de cette fonction ou de la fonction qu'elle appelle". Le bottom up semble plus précis et clair. Cette manière permet donc d'identifier le problème d'une manière plus localisé et

### Etape 5: L'ordre d'éxecution des tests

Oui, Plusieurs tests peuvent avoir le même ordre car certaines méthodes n'en appellent aucune et d'autres fonctions appellent les mêmes fonctions. Donc certains codes seront éxécutés en meme temps.

## **partitions d'équivalence est bissextile**

| Classe |    a divisible par    | Résultat attendu |      
|:------:|:---------------------:|:----------------:|
|   P0   | 4:non 100:non 400:non |       Faux       |
|   P1   | 4:oui 100:non 400:non |       Vrai       |
|   P2   | 4:oui 100:oui 400:non |       Faux       |
|   P3   | 4:oui 100:oui 400:oui |       Vrai       |

| Classe |    a                  | Résultat          |
|:------:|:---------------------:|:----------------:|
|   P0   | 2017                  |       Faux       |
|   P1   | 2016                  |       Vrai       |
|   P2   | 2100                  |       Faux       |
|   P3   | 2400                  |       Vrai       |

### Etape 3: Ajout de "print" à chaque méthode de test

On remarque qu'en rajoutant un print à chaque méthode quand nous éxécutons les tests. le terminal affiche "Test méthode {nom de méthode} au lieu de ne rien afficher. On pourra donc montrer plus correctement quel test à été éxécuté.

### Etape 4: Maniére d'effectuer les tests

Je préfere effectuer les tests en bottom up car cette maniére permet d'identifer d'où vient exactement le probléme comparée à la méthode top_down où si une fonction ne marche pas nous ne savons pas exactement d'ou vient le probléme "Est ce que le probléme vient de de cette fonction ou de la fonction qu'elle appelle". Le bottom up semble plus précis et clair. Cette manière permet donc d'identifier le problème d'une manière plus localisé et

### Etape 5: L'ordre d'éxecution des tests

Oui, Plusieurs tests peuvent avoir le même ordre car certaines méthodes n'en appellent aucune et d'autres fonctions appellent les mêmes fonctions. Donc certains codes seront éxécutés en meme temps.