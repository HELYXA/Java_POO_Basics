# ☕ Java - Démo POO & héritage

> Petit programme Java illustrant l'héritage entre classes : recherche du min/max et d'une valeur dans un tableau d'entiers.

## 🎯 Le projet

Un menu interactif en ligne de commande permettant de saisir 3 entiers, puis d'effectuer des opérations dessus (min, max, recherche) via un ensemble de classes organisées en **héritage**.

## 🧱 Architecture (POO)

| Classe | Rôle |
|---|---|
| `Caracteristiques` | Classe parente : `trouverMin()`, `trouverMax()` |
| `CaracteristiquesAvancees extends Caracteristiques` | Classe enfant : hérite du min/max et ajoute `rechercherEntier()` |
| `Main` | Point d'entrée : saisie utilisateur + menu interactif |

Ce projet illustre concrètement le principe d'**héritage** (`extends`) : `CaracteristiquesAvancees` a accès à `trouverMin()`/`trouverMax()` sans les réécrire, tout en apportant sa propre méthode supplémentaire.

## ✨ Fonctionnalités

- Saisie de 3 entiers par l'utilisateur
- Affichage de la valeur minimale
- Affichage de la valeur maximale
- Recherche d'une valeur précise dans le tableau

## 🗂️ Structure

```
├── Main.java                        # Point d'entree + menu
├── Caracteristiques.java             # Classe parente (min/max)
└── CaracteristiquesAvancees.java     # Classe enfant (herite + recherche)
```

*Note : dans la version originale, ces deux classes étaient imbriquées (`static class`) à l'intérieur de `Main`. Elles ont été extraites en fichiers séparés, plus proche des conventions Java standard et plus lisible pour illustrer l'héritage.*

## 🚀 Utilisation

```bash
javac *.java
java Main
```

## 🛠️ Stack technique

`Java` `POO` (héritage, `extends`, `switch`, `do...while`)

---

*Exercice - Bachelor Cybersécurité, module Programmation.*
