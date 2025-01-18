import java.util.Scanner;

public class WorldMapAgeXKCD {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);

        intro(in);
        end(in);

    }

    public static void intro(Scanner in) throws InterruptedException {
        System.out.println("");
        System.out.println("Loading..");
        System.out.println("");

        for (int i = 0; i < 20; i++) {
            System.out.print("*");
            Thread.sleep(15);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
            Thread.sleep(60);
        }
        for (int i = 0; i < 20; i++) {
            System.out.print("*");
            Thread.sleep(10);
        }

        System.out.println("");
        System.out.println("Loading complete!");
        System.out.println("");

        System.out.println("GUIDE TO FIGURING OUT THE AGE OF AN UNDATED WORLD MAP");
        System.out.println("(Assuming it's complete, labeled in English, and detailed enough)");
        System.out.println("");
        System.out.println("Based on the XKCD comic: https://xkcd.com/1688/");

        System.out.println("");
        System.out.println("Enter \"S\" to Start");
        System.out.println("");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("S")) {
            	System.out.println("");
                System.out.println("Starting");
                start(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter S to start.");
            }
        }
    }

    public static void start(Scanner in) {
        System.out.println("");
        System.out.println("Istanbul or Constantinople?");
        System.out.println("");
        System.out.println("A: Constantinople");
        System.out.println("B: Neither");
        System.out.println("C: Istanbul");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                doAnyOfThese(in);
                break;
            } else if (answer.equalsIgnoreCase("B")) {
            	System.out.println("");
                System.out.println("B");
                doesTheOttoman(in);
                break;
            } else if (answer.equalsIgnoreCase("C")) {
            	System.out.println("");
                System.out.println("C");
                doesTheSovietUnion(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter A, B, or C.");
            }
        }
    }
    
    public static void end(Scanner in) {
    	System.out.println("");
        System.out.println("The program has ended.");
        System.out.println("");
        // System.out.println("Start again?");

        // System.out.println("Y: Yes");
        // System.out.println("N: No");
        
        // while (true) {
        //     String answer = in.nextLine();

        //     if (answer.equalsIgnoreCase("Y")) {
        //     	System.out.println("");
        //         System.out.println("Yes");
        //         start(in);
        //         break;
        //     } else if (answer.equalsIgnoreCase("N")) {
        //         break;
        //     } else {
        //         System.out.println("Invalid input. Please enter Y or N.");
        //     }
        // }
    }

    public static void doAnyOfThese(Scanner in) {

        System.out.println("");
        System.out.println("Does any of these exist?");
        System.out.println("· Independent Canada");
        System.out.println("· US Territory of Alaska");
        System.out.println("· Tokyo");
        System.out.println("");
        System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                southAfrica(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                holyRomanEmpire(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void holyRomanEmpire(Scanner in) {
    	System.out.println("");
    	System.out.println("The Holy Roman Empire?");
        System.out.println("");
        System.out.println("Y: Yes");
        System.out.println("N: No");
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                System.out.println("1805 or earlier. (Before this point, the modern idea of a complete political map of the world gets hard to apply.)");
                System.out.println("");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
            	System.out.println("");
                System.out.println("No");
                theUnitedStates(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void theUnitedStates(Scanner in) {
    	System.out.println("");
    	System.out.println("The United States?");
        System.out.println("");
        System.out.println("Y: Yes");
        System.out.println("N: No");
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                texasIs(in);
  
                break;
            } else if (answer.equalsIgnoreCase("N")) {
            	System.out.println("");
                System.out.println("No");
            	System.out.println("");
            	System.out.println("How sure are you that this map is in English?");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void texasIs(Scanner in) {
    	System.out.println("");
    	System.out.println("Texas is...");
        System.out.println("A: Part of Mexico");
        System.out.println("B: Independent");
        System.out.println("C: Part of the US");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                floridaIs(in);
                break;
            } else if (answer.equalsIgnoreCase("B")) {
            	System.out.println("");
                System.out.println("B");
                System.out.println("1834-1845.");
                break;
            } else if (answer.equalsIgnoreCase("C")) {
            	System.out.println("");
                System.out.println("C");
                doesRussiaBorder(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter A, B, or C.");
            }
        }
    }
    
    public static void floridaIs(Scanner in) {
    	System.out.println("");
    	System.out.println("Florida is part of...");
    	System.out.println("A: Spain");
        System.out.println("B: The US");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                paraguay(in);
                break;
            } else if (answer.equalsIgnoreCase("B")) {
            	System.out.println("");
                System.out.println("B");
                venezuela(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void paraguay(Scanner in) {
    	System.out.println("");
    	System.out.println("Paraguay?");
    	 System.out.println("Y: Yes");
         System.out.println("N: No");
         while (true) {
             String answer = in.nextLine();

             if (answer.equalsIgnoreCase("Y")) {
             	System.out.println("");
                 System.out.println("Yes");
                 System.out.println("1811-1817");
   
                 break;
             } else if (answer.equalsIgnoreCase("N")) {
             	System.out.println("");
                 System.out.println("No");
             	System.out.println("1806-1810");
                 break;
             } else {
                 System.out.println("Invalid input. Please enter Y or N.");
             }
         }
    }
    
    public static void venezuela(Scanner in) {
    	System.out.println("");
    	System.out.println("Venezuela and/or Equador?");
    	 System.out.println("Y: Yes");
         System.out.println("N: No");
         while (true) {
             String answer = in.nextLine();

             if (answer.equalsIgnoreCase("Y")) {
             	System.out.println("");
                 System.out.println("Yes");
                 System.out.println("1830-1833");
   
                 break;
             } else if (answer.equalsIgnoreCase("N")) {
             	System.out.println("");
                System.out.println("No");
             	System.out.println("1818-1829");
                 break;
             } else {
                 System.out.println("Invalid input. Please enter Y or N.");
             }
         }
    }
    
    public static void doesRussiaBorder(Scanner in) {
    	System.out.println("");
    	System.out.println("Does Russia border the Sea of Japan?");
    	 System.out.println("Y: Yes");
         System.out.println("N: No");
         while (true) {
             String answer = in.nextLine();

             if (answer.equalsIgnoreCase("Y")) {
             	System.out.println("");
                 System.out.println("Yes");
                 System.out.println("1858-1867");
   
                 break;
             } else if (answer.equalsIgnoreCase("N")) {
             	System.out.println("");
                System.out.println("No");
             	usSouthBorder(in);
                 break;
             } else {
                 System.out.println("Invalid input. Please enter Y or N.");
             }
         }
    }
    
    public static void usSouthBorder(Scanner in) {
    	System.out.println("");
    	System.out.println("The US's Southern Border looks...");
    	 System.out.println("A: Weird");
         System.out.println("B: Normal");
         while (true) {
             String answer = in.nextLine();

             if (answer.equalsIgnoreCase("A")) {
             	System.out.println("");
                 System.out.println("Weird");
                 System.out.println("1846-1853");
   
                 break;
             } else if (answer.equalsIgnoreCase("B")) {
             	System.out.println("");
                System.out.println("Normal");
             	System.out.println("1854-1856");
                 break;
             } else {
                 System.out.println("Invalid input. Please enter Y or N.");
             }
         }
    }
    
    public static void southAfrica(Scanner in) {
        System.out.println("");
        System.out.println("South Africa?");
        System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                austriaHungary(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                rhodesia(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void austriaHungary(Scanner in) {
    	System.out.println("");
    	System.out.println("Austria-Hungary?");
        System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                albania(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                leningrad(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void albania(Scanner in) {
    	System.out.println("");
        System.out.println("Albania?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                System.out.println("1913-1918");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("1910-1912");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void leningrad(Scanner in) {
    	System.out.println("");
    	System.out.println("Leningrad?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                System.out.println("1924-1929");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("1919-1923");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void rhodesia(Scanner in) {
    	System.out.println("");
    	System.out.println("Rhodesia?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                isNorway(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                isBolivia(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void isNorway(Scanner in) {
    	System.out.println("");
    	System.out.println("Is Norway part of Sweden?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                System.out.println("1896-1905");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("1906-1909");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void isBolivia(Scanner in) {
    	System.out.println("");
    	System.out.println("Is Bolivia landlocked?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                System.out.println("1884-1895");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                budaAndPest(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void budaAndPest(Scanner in) {
    	System.out.println("");
    	System.out.println("\"Buda\" and \"Pest\" or \"Budapest\"?");
    	System.out.println("A: Buda and Pest");
        System.out.println("B: Budapest");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("1868-1872");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("1873-1883");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void doesTheOttoman(Scanner in) {
    	System.out.println("");
    	System.out.println("Does The Ottoman Empire exist?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                doAnyOfThese(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                theSovietUnion(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void theSovietUnion(Scanner in) {
    	System.out.println("");
    	System.out.println("The Soviet Union?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                saudiArabia(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                northKorea(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void saudiArabia(Scanner in) {
    	System.out.println("");
    	System.out.println("Saudi Arabia?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                isMostOfWest(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("1922-1932");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void isMostOfWest(Scanner in) {
    	System.out.println("");
    	System.out.println("Is most of West Africa a giant French blob?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                pakistan(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                howManyVietnams(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void doesTheSovietUnion(Scanner in) {
    	System.out.println("");
    	System.out.println("Does The Soviet Union exist?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                isMostOfWest(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                zaire(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void zaire(Scanner in) {
    	System.out.println("");
    	System.out.println("Zaire? Or: \"Hong Kong (UK)\"");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                System.out.println("1992-1996");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                serbiaAndMontenegro(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void serbiaAndMontenegro(Scanner in) {
    	System.out.println("");
    	System.out.println("Serbia/Montenegro are...");
    	System.out.println("A: One country");
        System.out.println("B: Two countries");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                eastTimor(in);
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                howManySudans(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void eastTimor(Scanner in) {
    	System.out.println("");
    	System.out.println("East Timor?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                System.out.println("2002-2006");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("1997-2001");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void howManySudans(Scanner in) {
    	System.out.println("");
    	System.out.println("How many Sudans are there?");
    	System.out.println("A: One");
        System.out.println("B: Two");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("2007-2011");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                isCrimea(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void isCrimea(Scanner in) {
    	System.out.println("");
    	System.out.println("Is Crimea disputed?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                colorado(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("2012-2013");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void colorado(Scanner in) {
    	System.out.println("");
    	System.out.println("\"Colorado\" or \"Danger - Radioactive Exlusion Zone - Avoid\"?");
    	System.out.println("A: Colorado");
        System.out.println("B: Danger");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("2014-2021");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                doesTheWarning(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void doesTheWarning(Scanner in) {
    	System.out.println("");
    	System.out.println("Does the warning mention the spiders?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                System.out.println("2023 or later.");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("2022");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void northKorea(Scanner in) {
    	System.out.println("");
    	System.out.println("North Korea?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                zaire(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                saintTrimbles(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void saintTrimbles(Scanner in) {
    	System.out.println("");
    	System.out.println("Saint Trimble's Island?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                System.out.println("No, I made that one up");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                isJanMayen(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void isJanMayen(Scanner in) {
    	System.out.println("");
    	System.out.println("Is Jan Mayen part of The Kingdom of Norway?");
    	System.out.println("");
    	System.out.println("A: Yes");
        System.out.println("B: What?");
        System.out.println("C: Not yet");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                pakistan(in);
                break;
            } else if (answer.equalsIgnoreCase("B")) {
            	System.out.println("");
                System.out.println("B");
                canYouSeeTheFamiliar(in);
                break;
            } else if (answer.equalsIgnoreCase("C")) {
            	System.out.println("");
                System.out.println("C");
                doAnyOfThese(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter A, B, or C.");
            }
        }
    }
    
    public static void howManyVietnams(Scanner in) {
    	System.out.println("");
    	System.out.println("How many Vietnams are there?");
    	System.out.println("A: One");
        System.out.println("B: Two");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                jimmyCarterIs(in);
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                bangladesh(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void jimmyCarterIs(Scanner in) {
    	System.out.println("");
    	System.out.println("Jimmy Carter is...");
    	System.out.println("A: Being attacked by a giant swimming rabbit");
        System.out.println("B: Fine");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("April 20, 1979");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                theSinaiIs(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void bangladesh(Scanner in) {
    	System.out.println("");
    	System.out.println("Bangladesh?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                System.out.println("1972-1975");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                isTheAreaSouthOf(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void isTheAreaSouthOf(Scanner in) {
    	System.out.println("");
    	System.out.println("Is the area South of Lake Victoria...");
    	System.out.println("A: British");
        System.out.println("B: Tanganyika");
        System.out.println("C: Tanzania");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("1960");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("1961-1964");
                break;
            } else if (answer.equalsIgnoreCase("C")) {
                System.out.println("");
                System.out.println("C");
                System.out.println("1965-1971");
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void theSinaiIs(Scanner in) {
    	System.out.println("");
    	System.out.println("The Sinai is part of what country?");
    	System.out.println("A: Israel");
        System.out.println("B: Mostly Israel");
        System.out.println("C: Mostly Egypt");
        System.out.println("D: Egypt");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("1976-1979");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("1980");
                break;
            } else if (answer.equalsIgnoreCase("C")) {
                System.out.println("");
                System.out.println("C");
                System.out.println("1981");
            } else if (answer.equalsIgnoreCase("D")) {
            	System.out.println("");
                System.out.println("C");
                whatsTheCapitalOfMicronesia(in);
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void whatsTheCapitalOfMicronesia(Scanner in) {
    	System.out.println("");
    	System.out.println("What's the capital of Micronesia?");
    	System.out.println("A: Kolonia");
        System.out.println("B: Palikir");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                republicOfTheUpper(in);
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                numberOfYemens(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void republicOfTheUpper(Scanner in) {
    	System.out.println("");
    	System.out.println("Republic of The Upper Volta or Burkina Faso?");
    	System.out.println("A: Upper Volta");
        System.out.println("B: Burkina Faso");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("1982-1984");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("1985-1988");
                break;
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void numberOfYemens(Scanner in) {
    	System.out.println("");
    	System.out.println("(Number of Yemens) + (Number of Germanys) = ?");
    	System.out.println("A: Two");
        System.out.println("B: Three");
        System.out.println("C: Four");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("Late 1990-1991");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("Mid-1990");
                break;
            } else if (answer.equalsIgnoreCase("C")) {
                System.out.println("");
                System.out.println("C");
                System.out.println("1989-Early 1990");
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void pakistan(Scanner in) {
    	System.out.println("");
    	System.out.println("Pakistan?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                cambodia(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                howManyGermanys(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void howManyGermanys(Scanner in) {
    	System.out.println("");
    	System.out.println("How many Germanys arae there?");
    	System.out.println("A: One");
        System.out.println("B: One, but it's HUGE");
        System.out.println("C: Two");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                persiaOrIran(in);
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("1941-1945");
                break;
            } else if (answer.equalsIgnoreCase("C")) {
                System.out.println("");
                System.out.println("C");
                System.out.println("1946-1947");
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void persiaOrIran(Scanner in) {
    	System.out.println("");
    	System.out.println("Persia or Iran?");
    	System.out.println("A: Persia");
        System.out.println("B: Iran");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("1930-1934");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("1935-1940");
                break;
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void cambodia(Scanner in) {
    	System.out.println("");
    	System.out.println("Cambodia?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                isTheAreaSouthOf(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                eritreaIs(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void eritreaIs(Scanner in) {
    	System.out.println("");
    	System.out.println("Eritrea is part of...");
    	System.out.println("A: Italy");
        System.out.println("B: Ethiopia");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                canadaIs(in);
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("1952-1953");
                break;
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void canadaIs(Scanner in) {
    	System.out.println("");
    	System.out.println("Canada is...");
    	System.out.println("A: Missing a piece.");
        System.out.println("B: Fine.");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("1948");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                theTownOnI(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void theTownOnI(Scanner in) {
    	System.out.println("");
    	System.out.println("The town on I-25 between Albuquerque and El Paso is...");
    	System.out.println("A: Hot Springs");
        System.out.println("B: Truth or Consequences");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("1948-1949");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("1950-1952");
                break;
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }
    
    public static void canYouSeeTheFamiliar(Scanner in) {
    	System.out.println("");
    	System.out.println("Can you see the familiar continents?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                thisSoundsLikeAPhysical(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                riversSirionAndAnduin(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }
    
    public static void thisSoundsLikeAPhysical(Scanner in) {
    	System.out.println("");
    	System.out.println("This sounds like a physical map or satellite photo.");
    	System.out.println("Y: Yes, that's it");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes, that's it");
                isLakeChad(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y.");
            }
        }
    }

    public static void isLakeChad(Scanner in) {
    	System.out.println("");
    	System.out.println("Is Lake Chad missing?");
    	System.out.println("Y: Yes");
        System.out.println("N: No");
        
        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
            	System.out.println("");
                System.out.println("Yes");
                isTheAralSea(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                howFarEastDoTheAmerican(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void isTheAralSea(Scanner in) {
        System.out.println("");
        System.out.println("Is the Aral Sea missing?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                System.out.println("2000s-");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("1970s-90s");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }

    }

    public static void howFarEastDoTheAmerican(Scanner in) {
        System.out.println("");
        System.out.println("How far east do the American prairies reach?");
        System.out.println("A: Indiana");
        System.out.println("B: The Mississippi");
        System.out.println("C: Nebraska");
        System.out.println("D: What prairies?");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("Before 1830");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("1830s-80s");
                break;
            } else if (answer.equalsIgnoreCase("C")) {
                System.out.println("");
                System.out.println("C");
                isThereABigLakeCali(in);
            } else if (answer.equalsIgnoreCase("D")) {
                System.out.println("");
                System.out.println("D");
                isThereABigLakeGhana(in);
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }

    public static void isThereABigLakeCali(Scanner in) {
        System.out.println("");
        System.out.println("Is there a big lake in the middle of Southern California? (Created by mistake)");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                System.out.println("1910s");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("1860s-1900s");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void isThereABigLakeGhana(Scanner in) {
        System.out.println("");
        System.out.println("Is there a big lake in the middle of Ghana? (Created on purpose)");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                System.out.println("1960s-70s");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("1920s-50s");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void riversSirionAndAnduin(Scanner in) {
        System.out.println("");
        System.out.println("Rivers \"Sirion\" or \"Anduin\"?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                mordor(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                cairParavel(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }    

    public static void mordor(Scanner in) {
        System.out.println("");
        System.out.println("Mordor?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                numenor(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                beleriand(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void beleriand(Scanner in) {
        System.out.println("");
        System.out.println("Beleriand?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                System.out.println("First Age");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("Early Second Age");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void numenor(Scanner in) {
        System.out.println("");
        System.out.println("Númenor?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                System.out.println("Late Second Age");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                theForestsEastOfTheMisty(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void theForestsEastOfTheMisty(Scanner in) {
        System.out.println("");
        System.out.println("The forest east of the Misty Mountains is...?");
        System.out.println("A: Greenwood the Great");
        System.out.println("B: Mirkwood");
        System.out.println("C: The Wood of Greenleaves");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
            	System.out.println("");
                System.out.println("A");
                System.out.println("Early Third Age");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("Late Third Age");
                break;
            } else if (answer.equalsIgnoreCase("C")) {
                System.out.println("");
                System.out.println("C");
                System.out.println("Fourth Age");
                break;

            } else {
                System.out.println("Invalid input. Please enter A, B or C.");
            }
        }
    }

    public static void cairParavel(Scanner in) {
        System.out.println("");
        System.out.println("Cair Paravel?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                calormen(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                mossflower(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void calormen(Scanner in) {
        System.out.println("");
        System.out.println("Calormen?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                weirdRecursiveHeaven(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                lottaIslands(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void weirdRecursiveHeaven(Scanner in) {
        System.out.println("");
        System.out.println("Weird recursive heaven?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                System.out.println("The Last Battle");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("One of the random later books");
                beleriand(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void lottaIslands(Scanner in) {
        System.out.println("");
        System.out.println("Lotta Islands?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                System.out.println("Dawn Treader");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                beruna(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void beruna(Scanner in) {
        System.out.println("");
        System.out.println("Beruna");
        System.out.println("A: Ford");
        System.out.println("B: Bridge");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
                System.out.println("");
                System.out.println("A");
                System.out.println("The Lion, The Witch and the Wardrobe");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("Prince Caspian");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void mossflower(Scanner in) {
        System.out.println("");
        System.out.println("Mossflower?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                System.out.println("Redwall");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                isTheWorldOnTheBack(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void isTheWorldOnTheBack(Scanner in) {
        System.out.println("");
        System.out.println("Is the world on the back of a turtle?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                System.out.println("Discworld");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                areYouSure(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void areYouSure(Scanner in) {
        System.out.println("");
        System.out.println("Are you sure this is a map?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                didYouMake(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                isItTryingTo(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void didYouMake(Scanner in) {
        System.out.println("");
        System.out.println("Did you make it yourself?");
        System.out.println("Y: Yes");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                itsVeryNice(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y.");
            }
        }
    }

    public static void itsVeryNice(Scanner in) {
        System.out.println("");
        System.out.println("It's very nice.");
        System.out.println("A: Thank you!");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
                System.out.println("");
                System.out.println("Yes");
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid input. Please enter A.");
            }
        }
    }

    public static void isItTryingTo(Scanner in) {
        System.out.println("");
        System.out.println("Is it trying to bite you?");
        System.out.println("Y: Yes");
        System.out.println("N: No");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                ifYouLetGo(in);
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                isItLargerThan(in);
                break;
            } else {
                System.out.println("Invalid input. Please enter Y or N.");
            }
        }
    }

    public static void ifYouLetGo(Scanner in) {
        System.out.println("");
        System.out.println("If you let it go, what does it do?");
        System.out.println("A: Hisses and runs away");
        System.out.println("B: Screeches and flaps around the room breaking things");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("A")) {
                System.out.println("");
                System.out.println("A");
                System.out.println("Cat");
                break;
            } else if (answer.equalsIgnoreCase("B")) {
                System.out.println("");
                System.out.println("B");
                System.out.println("Seagull");
                break;
            } else {
                System.out.println("Invalid input. Please enter A or B.");
            }
        }
    }

    public static void isItLargerThan(Scanner in) {
        System.out.println("");
        System.out.println("Is it larger than a breadbox?");
        System.out.println("Y: Yes");
        System.out.println("N: No");
        System.out.println("C: About the same");

        while (true) {
            String answer = in.nextLine();

            if (answer.equalsIgnoreCase("Y")) {
                System.out.println("");
                System.out.println("Yes");
                System.out.println("Tuba");
                break;
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("");
                System.out.println("No");
                System.out.println("Stapler");
                break;
            } else if (answer.equalsIgnoreCase("C")) {
                System.out.println("");
                System.out.println("C");
                System.out.println("Breadbox");
                break;
            } else {
                System.out.println("Invalid input. Please enter Y, N or C.");
            }
        }
    }


    
} // End of main
