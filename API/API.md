# API


## Qu'est-ce que c'est et à quoi ça sert ?

Une API permet par le biais du Web Service REST de faire communiquer plusieurs langages de programmations en l’aide du JSON ou XML ils peuvent tous interpréter et manipuler des données. 

## Qu’est-ce que le Web Service REST ?

Il s’agit des méthodes HTTP dit CRUD.


| HTTP Method |  CRUD   |
|-----------|-----------|
|      POST     |      Create     |
|      GET     |     Read      |
|      PUT     |     Update/Replace      |
|      PATCH     |     Partial Update/Modify      |
|      DELETE     |      DELETE     |



## Qu’est-ce que le JSON et le XML ?

Il S'agit clairement des traducteurs, il classe les données dans des tableaux afin de pouvoir être exploitable dans chaque langages.

Exemple **JSON** :

```json
{
    "employes":[
        {"firstName": "John",  "lastName": "Doe"},
        {"firstName": "Anna",  "lastName": "Smith"},
        {"firstName": "Peter", "lastName": "Jones"}
    ]
}
```

Exemple **XML** :

```xml
<employes>
     <employe>
         <firstName> John </firstName><lastName> Doe </lastName>
     </employe>
     <employe>
         <firstName> Anna </firstName><lastName> Smith </lastName>
     </employe>
     <employe>
         <firstName> Peter </firstName><lastName> Jones </lastName>
     </employe>
</employes>
```