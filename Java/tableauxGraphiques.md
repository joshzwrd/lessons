# Tableaux graphiques en Java(JTable)


Un **JTable** est un composant graphique Swing permettant d’afficher un tableau formé d’un certain nombre de lignes et d’un certain nombre de colonnes.

Un **JTable** est compose deux parties: Une partie d’en-tête présentant un titre pour chaque colonne et une partie corps (body en anglais) présentant les données. Les données d’un JTable présente sous la forme d’un tableau a deux dimensions.

Comment ajouter des donnees dans un JTable

Pour ajouter des données dans un **JTable** il suffit de passer directement au constructeur JTable (JTable(Object data[] [], String header[]);), un tableau à deux dimensions pour les données et un tableau à une dimension pour l’en-tête de chaque colonne en paramètre, mais qui n’est pas la bonne pratique.

**Exemple d’un code :**
	
    import javax.swing.JFrame;
    import javax.swing.JScrollPane;
    import javax.swing.JTable;
    
    public class TableauGraphique extends JFrame{
        
        public TableauGraphique() {
            this.setLocationRelativeTo(null);
            this.setSize(500,200);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("JTable");
            String header[] = {"Nom","Prenom","Sexe"};
            Object data[] []= {
                    {"Jean","Herard","Masculin"},
                    {"Wiliams","Jean","Masculin"},
                    {"Chuck","Batosky","Masculin"},
                    {"Joel","Fouckan","Masculin"}
            };
            
            JTable table = new JTable(data, header);
            this.getContentPane().add(new JScrollPane(table));
            
        }
    
        public static void main(String[] args) {
            new TableauGraphique().setVisible(true);
            
        }
    
    }

Résultat du code ci-dessus

Tableau dans un scroll

Vous avez remarqué qu’on a mis le tableau dans un JScrollPane. Pour que les titres soient affichées dans l’en-tête de de notre tableau, il faut penser a le mettre dans un JScrollPane.

Non seulement le JScrollPane nous permet de defiler vers le haut ou vers le bas quand les données sont nombreux dans un JTable, il permet aussi d’afficher les titres dans l’en-tête d’un JTable.

Le JScrollPane indique automatiquement au tableau l’endroit où il doit afficher ses titres.

**Exemple d’un JTable sans ScrollPane :**
	
    package exo.jtable;
    
    import javax.swing.JFrame;
    import javax.swing.JScrollPane;
    import javax.swing.JTable;
    
    public class TableauGraphique extends JFrame{
        
        public TableauGraphique() {
            this.setLocationRelativeTo(null);
            this.setSize(500,200);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("JTable");
            String header[] = {"Nom","Prenom","Sexe"};
            Object data[] []= {
                    {"Jean","Herard","Masculin"},
                    {"Wiliams","Jean","Masculin"},
                    {"Chuck","Batosky","Masculin"},
                    {"Joel","Fouckan","Masculin"},
                    {"Jean","Herard","Masculin"},
                    {"Wiliams","Jean","Masculin"},
                    {"Chuck","Batosky","Masculin"},
                    {"Joel","Fouckan","Masculin"},
                    {"Jean","Herard","Masculin"},
                    {"Wiliams","Jean","Masculin"},
                    {"Chuck","Batosky","Masculin"},
                    {"Joel","Fouckan","Masculin"},
                    {"Jean","Herard","Masculin"},
                    {"Wiliams","Jean","Masculin"},
                    {"Chuck","Batosky","Masculin"},
                    {"Joel","Fouckan","Masculin"}
            };
            
            JTable table = new JTable(data, header);
            this.getContentPane().add(table);
            
        }
    
        public static void main(String[] args) {
            TableauGraphique tableau = new TableauGraphique();
            tableau.setVisible(true);
            
        }
    
    }

Résultat du code ci-dessus sans scroll
Tableau sans scroll

On remarque que les titres ne s’affichent pas dans l’en-tête de notre tableau. Pour que les titre soient affichées dans l’en-tête de notre tableau il faut qu’on mettre le tableau dans uns scroll.

On peut préciser l’endroit où l’en-tête doit afficher dans notre tableau manuellement a l’aide de code suivant.

    //On indique que l'en-tête doit être au nord, au-dessus
    this.getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
    //Et le corps au centre !
    this.getContentPane().add(tableau, BorderLayout.CENTER);