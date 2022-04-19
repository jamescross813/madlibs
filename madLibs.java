public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: James
    Date: 4/19/2022
    */
        public static void main(String[] args){
      String name1 = "Jeff";
      String adjective1 = "funny";
      String adjective2 = "good";
      String adjective3 = "smelly"; 
      String verb1 = "wash";
      String noun1 = "fish";
      String noun2 = "chicken";
      String noun3 = "chair";
      String noun4 = "ball";
      String noun5 = "book";
      String noun6 = "computer";
      String name2 = "Loki";
      int number = 6;
      String place1 = "Midgard";
  
        
        
        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
  
        System.out.println(story);
      }       
  }