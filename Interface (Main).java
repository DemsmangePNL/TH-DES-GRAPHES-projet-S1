import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while(running) {
            clearScreen();
            System.out.println("============================================");
            System.out.println("     SYSTEME DE GESTION DES COLLECTES");
            System.out.println("============================================");
            System.out.println("1 - Collectivité (configuration du réseau)");
            System.out.println("2 - Entreprise de collecte (calculs & tournées)");
            System.out.println("3 - Charger un projet existant");
            System.out.println("4 - Quitter");
            System.out.print("\nVotre choix : ");

            int choix = sc.nextInt();
            sc.nextLine(); // Consomme le retour chariot

            switch(choix) {
                case 1 -> menuCollectivite(sc);
                case 2 -> menuEntreprise(sc);
                case 3 -> chargerProjet(sc);
                case 4 -> {
                    System.out.println("\nFermeture du système...");
                    running = false;
                }
                default -> System.out.println("Choix invalide.");
            }

            if(running) pause();
        }
        sc.close();
    }

    //=================== MENU COLLECTIVITE ===================//
    public static void menuCollectivite(Scanner sc) {
        boolean back = false;

        while(!back) {
            clearScreen();
            System.out.println("========= GESTION DE LA COMMUNE =========");
            System.out.println("1 - Créer un nouveau graphe");
            System.out.println("2 - Charger un graphe existant");
            System.out.println("3 - Modifier le réseau routier");
            System.out.println("4 - Gérer habitations / points collecte");
            System.out.println("5 - Définir les secteurs géographiques");
            System.out.println("6 - Retour");
            System.out.print("\nVotre choix : ");

            int choix = sc.nextInt(); sc.nextLine();

            switch(choix) {
                case 1 -> System.out.println("\n[NON IMPLEMENTÉ] Création de graphe...");
                case 2 -> System.out.println("\n[NON IMPLEMENTÉ] Chargement de graphe...");
                case 3 -> modifierReseau(sc);
                case 4 -> System.out.println("\n[NON IMPLEMENTÉ] Gestion points de collecte / habitations...");
                case 5 -> System.out.println("\n[NON IMPLEMENTÉ] Définition secteurs...");
                case 6 -> back = true;
                default -> System.out.println("Choix invalide.");
            }
            if(!back) pause();
        }
    }

    //================ MODIFICATION DU RESEAU =================//
    public static void modifierReseau(Scanner sc) {
        boolean back = false;

        while(!back) {
            clearScreen();
            System.out.println("--- Modification réseau routier ---");
            System.out.println("1 - Ajouter un noeud (intersection)");
            System.out.println("2 - Ajouter une rue (arête)");
            System.out.println("3 - Modifier sens / voies d'une rue");
            System.out.println("4 - Affecter collectabilité (gauche/droite)");
            System.out.println("5 - Supprimer une rue");
            System.out.println("6 - Voir résumé du graphe");
            System.out.println("7 - Retour");
            System.out.print("\nVotre choix : ");

            int choix = sc.nextInt(); sc.nextLine();

            switch(choix) {
                case 1 -> System.out.println("\n[NON IMPLEMENTÉ] Ajout noeud...");
                case 2 -> System.out.println("\n[NON IMPLEMENTÉ] Ajout arête...");
                case 3 -> System.out.println("\n[NON IMPLEMENTÉ] Modification orientation/voies...");
                case 4 -> System.out.println("\n[NON IMPLEMENTÉ] Attribution collecte par côté...");
                case 5 -> System.out.println("\n[NON IMPLEMENTÉ] Suppression arête...");
                case 6 -> System.out.println("\n[NON IMPLEMENTÉ] Affichage textuel du graphe ici...");
                case 7 -> back = true;
                default -> System.out.println("Choix invalide");
            }
            if(!back) pause();
        }
    }

    //==================== MENU ENTREPRISE =====================//
    public static void menuEntreprise(Scanner sc) {
        boolean back = false;

        while(!back) {
            clearScreen();
            System.out.println("============ CALCULS & TOURNEES ============");
            System.out.println("\n--- THEME 1 : Porte-à-porte / encombrants ---");
            System.out.println("1. Itinéraire simple vers 1 domicile");
            System.out.println("2. Tournée multi-domicile (TSP)");
            System.out.println("3. Parcours complet de collecte (Euler/CPP)");

            System.out.println("\n--- THEME 2 : Points de collecte ---");
            System.out.println("4. Heuristique plus proche voisin");
            System.out.println("5. Méthode MST + DFS + Shortcutting");
            System.out.println("6. Gestion des capacités");

            System.out.println("\n--- THEME 3 : Planification ---");
            System.out.println("7. Coloration des secteurs");
            System.out.println("8. Planification avec capacités");

            System.out.println("\n9. Retour");
            System.out.print("\nVotre choix : ");

            int choix = sc.nextInt(); sc.nextLine();

            switch(choix) {
                case 1 -> System.out.println("\n[NON IMPLEMENTÉ] Dijkstra un domicile");
                case 2 -> System.out.println("\n[NON IMPLEMENTÉ] TSP multi-encombrants");
                case 3 -> System.out.println("\n[NON IMPLEMENTÉ] Euler / Postier Chinois");
                case 4 -> System.out.println("\n[NON IMPLEMENTÉ] TSP - voisin le plus proche");
                case 5 -> System.out.println("\n[NON IMPLEMENTÉ] MST → DFS → Shortcutting");
                case 6 -> System.out.println("\n[NON IMPLEMENTÉ] Capacités thème 2");
                case 7 -> System.out.println("\n[NON IMPLEMENTÉ] Coloration graphe secteurs");
                case 8 -> System.out.println("\n[NON IMPLEMENTÉ] Planification + contraintes capacité");
                case 9 -> back = true;
                default -> System.out.println("Choix invalide");
            }
            if(!back) pause();
        }
    }

    //======================== DIVERS ========================//
    public static void chargerProjet(Scanner sc) {
        System.out.println("\n[NON IMPLEMENTÉ] Chargement de projet JSON/TXT...");
    }

    public static void pause() {
        System.out.println("\nAppuyez sur ENTER pour continuer...");
        try { System.in.read(); } catch(Exception ignored) {}
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
