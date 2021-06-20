# Notion de classes en Java

## Les classes en Java

**C’est quoi une classe en java?**

Une classe c’est un moule de construction d’objet c’est-à-dire à partir d’une classe on peut créer ou construire des objets. Les classes en Java sont composées de méthodes et d’attributs qui peuvent être de différentes visibilité: public, private, ou protected.

Selon leur niveau de visibilité, les classes, les attributs et les méthodes peuvent être accessibles ou non depuis des classes du même paquetage ou depuis des classes d’autres paquetages.

    public: accessible par n’importe quelle classe;
    protected: accessible depuis les classes héritées et les classes du même package;
    private: Accès limite par toute autre classe;
    Aucune visibilité: Accessible depuis les classes du même package;

Pour créer une classe on commence par le mot clé class suivi du nom de la classe puis terminer par des accolades ouvrantes fermantes.



**Exemple de la création d’une classe Java :**
	
    class Personne{
    }

Le nom d’une classe commence toujours par lettre majuscule. Si le nom d’une classe se compose de plusieurs mots on fait commencer chaque mot par une lettre majuscule.



**Exemple :**
	
    public class ChauffeurCamion{
    }



**Exemple d’une classe avec des attributs :**

    public class Personne{
    private String nom;
    private int age;
    }

Lorsque les attributs d’une classe sont déclarées privé pour y accéder depuis l’extérieur, il faut avoir des méthode d’accès comme les accesseurs (getter) et les mutateurs (setter).

## La notion d’accesseur

Un accesseur est une fonction membre permettant de récupérer le contenu d’une donnée membre protégée soit private ou protected. Un accesseur, pour accomplir sa fonction :

- doit avoir comme type de retour le type de la variable à renvoyer ne doit pas nécessairement posséder d’arguments

- ne doit pas nécessairement renvoyer de valeur (il possède dans sa plus simple expression le type void)

## La notion de mutateur

Un mutateur est une fonction membre permettant de modifier le contenu d’une donnée membre protégée soit private ou protected. Un mutateur, pour accomplir sa fonction :

    doit avoir comme paramètre la valeur à assigner à la donnée membre. Le paramètre doit donc être du type de la donnée membre
    ne doit pas nécessairement renvoyer de valeur (il possède dans sa plus simple expression le type void)

**Un Objet c’est quoi?**

Un objet c’est une instance d’une classe. Pour utiliser une classe, on doit créer un objet concret de cette classe.  Le processus est appelé instanciation ou initialisation d’un objet.

**Exemple :** 

    Personne pers = new Personne();