class Practical7
 {


   public static void main(String[] args) {
        int size = 1;

        String n = displayN(size);
        String i1 = displayI(size);
        String k = displayK(size);
        String h = displayH(size);
        String i2 = displayI(size);
        String l = displayL(size);

        String[] nLines = n.split("\n");
        String[] i1Lines = i1.split("\n");
        String[] kLines = k.split("\n");
        String[] hLines = h.split("\n");
        String[] i2Lines = i2.split("\n");
        String[] lLines = l.split("\n");

        int maxRows = Math.max(nLines.length, Math.max(i1Lines.length, Math.max(kLines.length, Math.max(hLines.length, Math.max(i2Lines.length, lLines.length)))));

        for (int row = 0; row < maxRows; row++) {
            if (row < nLines.length) {
                System.out.print(nLines[row]);
            } else {
                System.out.print("     "); 
            }
            System.out.print("  "); 

            if (row < i1Lines.length) {
                System.out.print(i1Lines[row]);
            } else {
                System.out.print("     "); 
            }
            System.out.print("  "); 

            if (row < kLines.length) {
                System.out.print(kLines[row]);
            } else {
                System.out.print("     "); 
            }
            System.out.print("  "); 

            if (row < hLines.length) {
                System.out.print(hLines[row]);
            } else {
                System.out.print("     "); 
            }
            System.out.print("  "); 

            if (row < i2Lines.length) {
                System.out.print(i2Lines[row]);
            } else {
                System.out.print("     "); 
            }
            System.out.print("  "); 

            if (row < lLines.length) {
                System.out.print(lLines[row]);
            } else {
                System.out.print("     "); 
            }

            System.out.println();
        }
    }

    
    
    
    
  

    public static String displayL(int size) {
        int lnn = 5 * size;
         String pattern = "";
        String blankString = "";


        for (int i = 0; i < lnn - 1; i++) {
             pattern += "*";

            for (int j = 0; j < lnn - 2; j++) {
                  blankString += " ";
            }
            pattern += blankString;  
                blankString = "";       

           	 pattern += "\n";      
        }

        
       	 for (int i = 0; i < lnn; i++) {
            	 pattern += "* ";
        }

         return pattern;
    }


      public static String displayN(int size) {
          int lnn = 5 * size;
              String pattern = "";


        for (int i = 0; i < lnn; i++) {
            for (int j = 0; j < lnn; j++) {
                if (j == 0 || j == lnn - 1 || i == j) { 
                      pattern += "*";
                } else {
                   	  pattern += " ";
                }
            }
             pattern += "\n";
        } 
       	 return pattern;
    }



       public static String displayI(int size) {
         int lnn = 5 * size;
        	String pattern = "";


        for (int j = 0; j < lnn; j++) {
            	pattern += "*";
        }
         pattern += "\n";


        for (int i = 1; i < lnn - 1; i++) { 
             for (int j = 0; j < lnn; j++) {
                  if (j == lnn / 2) { 
                   	  pattern += "*";
                } else {
                    	pattern += " ";
                }
            }
            	pattern += "\n";
        }


        for (int j = 0; j < lnn; j++) {
           	 pattern += "*";
        }
      	  pattern += "\n";

         return pattern;
    }

 
     public static String displayK(int size) {
        	int lnn = 5 * size;
       			 String pattern = "";
	
        for (int i = 0; i < lnn; i++) {
            	 pattern += "*"; 
  
            for (int j = 1; j < lnn; j++) {
                 if (i < lnn / 2) {
                      if (j == lnn - i - 1) {
                         pattern += "*";
                    } 
                     else {
                          pattern += " ";
                    }
                } 
                 else if (i > lnn / 2) { 
                       if (j == i) {
                          pattern += "*";
                    } 
                    else {
                        pattern += " ";
                    }
                }
            }
             pattern += "\n";
        }

       	 return pattern;
    }
 

   public static String displayH(int size) {
        int lnn = 5 * size;
         	String pattern = "";


        for (int i = 0; i < lnn / 2; i++) {
           	 pattern += "*";
             for (int j = 1; j < lnn - 1; j++) {
               	  pattern += " ";
            }
           	 pattern += "*\n";
        }


        for (int j = 0; j < lnn; j++) {
           	 pattern += "* "; 
        }
      	   pattern += "\n";


        for (int i = 0; i < lnn / 2; i++) {
           		 pattern += "*";
             for (int j = 1; j < lnn - 1; j++) {
               	 	pattern += " ";
            }
           	  pattern += "*\n";
        }
	
        return pattern;
    }


}


