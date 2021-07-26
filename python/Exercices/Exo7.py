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