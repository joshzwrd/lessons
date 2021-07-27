# Écrire le script convertir.py, qui effectue une conversion euros en dollars.Le programme commencera par demander à l’utilisateur d’indiquer par un caractère ’E’ ou ’$’ la devise du montant qu’il va entrer. Puis le programme exécutera une action conditionnelle.

# devise

devise = input("Saisissez votre devise € ou $ : ")
montant = float(input("Donnez le montant à convertir : "))
f = 1.30

# Faire le if
if devise == "":
    print("Somme € :" + str(montant*f))
elif devise == "$":
    print ("Somme :", montant/f)
else:
    print("On ne peut rien faire pour vous.")