# SEG3503 - Lab 04 - TDD FizzBuzz

## Équipe
| Rôle | Nom | Matricule |
|------|-----|-----------|
| Membre 1 | Judicael Tokam | XXXXXXXX |
| Membre 2 | [Nom coéquipier 1] | XXXXXXXX |
| Membre 3 | [Nom coéquipier 2] | XXXXXXXX |

---

## Judicael Tokam — 5 groupes de commits

### Groupe 1 — test15 : FizzBuzz échoue puis passe

| | Commit | Description |
|-|--------|-------------|
| 🔴 ROUGE | `[hash ici]` | test15 échoue — fizzbuzz(15) retourne null au lieu de "FizzBuzz" |
| 🟢 VERT  | `[hash ici]` | Ajout du cas n%15==0 dans converter() |

**Test :**
```java
@Test
void test15(){
    String result = fbConverter.fizzbuzz(15);
    assertEquals("FizzBuzz", result);
}
```

**Implémentation :**
```java
if (n % 15 == 0) return "FizzBuzz";
```

---

### Groupe 2 — test5 : Buzz échoue puis passe

| | Commit | Description |
|-|--------|-------------|
| 🔴 ROUGE | `[hash ici]` | test5 échoue — fizzbuzz(5) retourne null au lieu de "Buzz" |
| 🟢 VERT  | `[hash ici]` | Ajout du cas n%5==0 dans converter() |

**Test :**
```java
@Test
void test5(){
    String result = fbConverter.fizzbuzz(5);
    assertEquals("Buzz", result);
}
```

**Implémentation :**
```java
else if (n % 5 == 0) return "Buzz";
```

---

### Groupe 3 — test237 : Fizz sur grand nombre

| | Commit | Description |
|-|--------|-------------|
| 🔴 ROUGE | `[hash ici]` | test237 échoue — fizzbuzz(237) retourne null |
| 🟢 VERT  | `[hash ici]` | Cas n%3==0 couvre 237 |

**Test :**
```java
@Test
void test237(){
    String result = fbConverter.fizzbuzz(237);
    assertEquals("Fizz", result);
}
```

---

### Groupe 4 — test_listfizzbuzz : méthode fizzbuzz(n,m)

| | Commit | Description |
|-|--------|-------------|
| 🔴 ROUGE | `[hash ici]` | test_listfizzbuzz échoue — méthode fizzbuzz(int,int) inexistante |
| 🟢 VERT  | `[hash ici]` | Implémentation de fizzbuzz(n,m) avec ArrayList |

**Test :**
```java
@Test
void test_listfizzbuzz(){
    List<String> result = fbConverter.fizzbuzz(1, 2);
    assertEquals(List.of("1", "2"), result);
}
```

**Implémentation :**
```java
public List<String> fizzbuzz(int n, int m){
    ArrayList<String> liste = new ArrayList<>();
    for(int i = n; i <= m; i++){
        liste.add(fizzbuzz(i));
    }
    return liste;
}
```

---

### Groupe 5 — test0 : comportement de fizzbuzz(0)

| | Commit | Description |
|-|--------|-------------|
| 🔴 ROUGE | `[hash ici]` | test0 échoue — fizzbuzz(0) retourne "FizzBuzz" au lieu de "0" |
| 🟢 VERT  | `[hash ici]` | Ajout du cas n==0 retourne "0" |
| 🔵 REFACTOR | `[hash ici]` | Refactoring : remplacement des if hardcodés par modulo généralisé |

**Test :**
```java
@Test
void test0(){
    String result = fbConverter.fizzbuzz(0);
    assertEquals("0", result);
}
```

---

## [Nom coéquipier 1] — 5 groupes de commits

*À compléter par le coéquipier 1*

---

## [Nom coéquipier 2] — 5 groupes de commits

*À compléter par le coéquipier 2*
