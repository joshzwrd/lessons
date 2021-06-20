# Exploiter les donnés avec JDBC(Le ResultSet)


Pour exploiter les données d’une base de données en Java, il faut avoir un objet de l’interface ResultSet pour pouvoir stocker les résultats que l’on obtient, par exécution de la méthode executeQuery(String) . Les instances de l’interface ResultSet contiennent les résultats d’une requête SQL .

## L’exécution de requêtes SQL (Le ResultSet)

L’exécution des requêtes d’interrogation SQL sont exécutées avec les méthodes d’un objet Statement que l’on obtient à partir d’un objet Connection.


Un ResultSet est créer à partir d’un objet Statement avec la méthode executeQuery();
	
    ResultSet res = null;
    String select = "SELECT * FROM client";
    
    try {
    Statement stmt = con.createStatement();
    res = stmt.executeQuery(select);
    } catch (SQLException e) {
    //traitement de l'exception
    }

Pour envoyer des requêtes SQL à la base de donnees. On utilise un objet de la classe Statement. La création d’un objet Statement s’effectue à partir d’une instance de la classe Connection :
	
    Statement stmt = con.createStatement();

Pour une requête de type interrogation (SELECT), la méthode à utiliser de la classe Statement est executeQuery(). Pour des traitements de mise à jour, il faut utiliser la méthode executeUpdate(). Lors de l’appel à la méthode d’exécution, il est nécessaire de lui passer en paramètre la requête SQL sous forme de chaine.

Le résultat d’une requête d’interrogation est renvoyé dans un objet de la classe ResultSet par la méthode executeQuery() qui doit etre fermer apres son utilisation.

**Exemple :**
	
    ResultSet rs = stmt.executeQuery("SELECT * FROM personne");

La méthode executeUpdate() retourne le nombre d’enregistrements qui ont été mis à jour.

**Exercice** d’exploitation des données.

Nous allons créer trois classes :

Une classe ConnexionDB qui va permet à notre application de communiquer avec la base de données.

Une classe Personne qui va se charger de créer l’objet personne avec nom et prenom.

Une Classe Application qui se charger de lancer notre programme grace à la méthode main.


**Source de la classe ConnexionDB :**

    package exploite;
    
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    
    import javax.swing.JOptionPane;
    
    public class ConnexionDB {
        static String url="jdbc:mysql://localhost/mabase";
        static String driver="com.mysql.jdbc.Driver";
        static String user="root";
        static String password="1111";
        
        public static Connection getCon() {
            Connection con=null;
                    try {
                Class.forName(driver);
                con=DriverManager.getConnection(url, user, password);
                
                
            } catch (ClassNotFoundException | SQLException e) {
                
                
            }
            return con;
            
        }
    
    }


**Source de la classe Personne :**
	
    package exploite;
    
    public class Personne {
        
        String nom;
        String prenom;
        
        public Personne(String nom, String prenom){
            this.nom = nom;
            this.prenom = prenom;           
        }
    }


**Soucer de la classe Application :**

    package exploite;
    
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    
    public class Application {
    
        public static void main(String[] args) {
    
            ResultSet rs = null;
            String select = "SELECT * FROM personne";
            Connection con = null;
            con = ConnexionDB.getCon();
            PreparedStatement ps = null;
            try {
                ps = con.prepareStatement(select);
                rs = ps.executeQuery();
    
                while (rs.next()) {
                    Personne p = new Personne(rs.getString("nom"), rs.getString("prenom"));
                    System.out.println(p.nom + "\t" + p.prenom);
                }
                ps.close();
                rs.close();
                con.close();
    
            } catch (SQLException e) {
    
                e.printStackTrace();
            }
    
        }
    
    }