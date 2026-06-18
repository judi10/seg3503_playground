# Lab 03 - Mesures de couverture

## Objectifs
- Exécution des outils de couverture de code (JaCoCo)
- Application de techniques de couverture en boîte blanche
- Refactoring par petites étapes
- Pratique de Git/GitHub

## Computation

Couverture initiale avec les tests existants : **85% instructions, 70% branches**.

## Date - Couverture avant refactoring

![Couverture avant refactoring](assets/date_coverage_before_refactoring.jpeg)

Couverture initiale : **91% instructions, 79% branches**.

## Date - Couverture après refactoring

![Couverture après refactoring](assets/date_coverage_after_refactoring.jpeg)

Couverture après refactoring : **85% instructions, 79% branches**.

## La couverture s'est-elle améliorée après le refactoring ?

La couverture est restée similaire après le refactoring, car le refactoring ne modifie pas la logique du code, ni les tests mais, il améliore seulement la lisibilité. La légère variation est due au fait que `MONTH_NAMES` est maintenant `static`, créant un nouveau bloc `static {...}` compté séparément par JaCoCo.

## Refactorings effectués

1. `isThirtyDayMonth()` — retourne l'expression booléenne directement au lieu de `if/else return true/false`
2. `isEndOfMonth()` — retourne l'expression booléenne directement au lieu de `if/else return true/false`
3. `monthNames` — renommé en `MONTH_NAMES` et déclaré `private static final`

## Est-il possible d'atteindre 100% de couverture ?

Non, pas complètement, puisque `isEndOfMonth()` contient une condition `||` composée sur plusieurs lignes. JaCoCo compte chaque sous-expression comme une branche séparée, et certaines combinaisons sont impossibles à atteindre.