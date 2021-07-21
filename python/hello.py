# Un joli code
print("Hello, le monde entier")
print("Python est interprété")

# variables
nom = "SOSA"
prenom = "Josh"
age  = 12

# Print, type()  | isinstance
print("nom :", nom, " de type :", type(nom))
print("Prenom: ", prenom, " instance :", isinstance(prenom, str), sep="**")

# Deux fonctions indispensables
# dir() : connaitre les différentes méthodes disponibles sur un objet
# help(nom.upper)
#dir(nom)
#dir(str)
help(nom.upper)      # donne comment utiliser la fonction


# TYPES PRIMITIFS
# int, str, float, bool, NoneType
age = 12
nb = int("15")   # transtyper à partir du constructeur int()
print(type(nb))

f = 5.3
print(type(f))
f2 = float(45)
print(type(f2))

d = 8 / 4
print(type(d))

# Concaténation de 2 chaines
identite = nom + " " + prenom
print(identite)

# Donnée booléenne, opérateurs : not, and, or, in, <, >, ==
ok = True
print(9 > 5)
x = 5
print(2 <= x <= 9)

# Exemple
if x == 6:
    print("Egalité OK")
else:
    print("Egalité KO")

# Fonction print() : est-ce une fonction ou une procédure
retour = print("Bye Bye le Covid 19")
print(type(retour))

taille = None      # On itilialise à None
print(type(taille))
taille = len(nom)
print(type(taille))
print(None==False, None==True)


# RECUP DE LA SAISIE, ALTERNATIVE, REPETITIVE

# input() : récup de la saisie = cette saisie est de type str
age = int(input("Donnez moi votre age: "))
print("Age :", age, type(age))

# Alternative
x = 7
if x == 6:
    print("OK")
elif x == 7:
    print("OK encore")
else:
    print("KO")

# Boucle : while
i = 0
while i < 5:
    print(i)
    i += 1

# Boucle : for
fruits = ["mangue", "poire", "prune"]
for fruit in fruits:
    print(fruit)

for c in "MACRON":
    print(c)

for a in range(15):   # range(debut, fin, pas)  --> on va jusqu'à fin-1
    print(a)

print()
for a in range(0, 15, 2):   # range(debut, fin, pas)  --> on va jusqu'à fin-1
    print(a)


# TYPES AGREGES : list, tuple, set, dict

# Listes : list
fruits = ["mangue", "poire", "prune"]       # Type itérable, Type mutable = modifiable
fruits[1] = "avocat"                        # mutable
print(fruits.append("figue"))
print(fruits)
print()
print(list("MACRON"))                       # Transtyper

# Listes : tuple
villes = ("Paris", "Marseille", "Lyon")     # Type itérable, Type non mutable = non modifiable
#45
# villes[1] = "Nice"                          # KO, car non mutable

for v in villes:                            # Un tuple est itérable
    print(v)

t = ("Monde")
print(type(t))                              # Il s'agit d'un str

t = ("Monde",)
print(type(t))                              # In s'agit d'un tuple de 1 seul élément


# Ensembles = comme en maths
ens = {"Hugo", "Lamartine", "Platon", 400}
print(ens)

# Union, intersection, différence
e1 = {1, 2}; e2 = {5, 2}; e3 = {4, 9}

#u = e1.union(e2)
u = e1 | e2 | e3
print(u)

#d = e1.difference(e2)
d = e1 -e2
print(d)

#i = e1.intersection(e2)
i = e1 & e2
print(i)