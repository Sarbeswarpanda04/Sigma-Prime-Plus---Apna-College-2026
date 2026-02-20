public class String_Linear_Search {
    public static int MenuSearch(String Menu[],String Key){
    for(int i=0;i<Menu.length;i++){
        if(Menu[i]==Key){
           return i;
        }
    }
  return -1;
}
    public static void main(String[] args) {
        String Menu[] = {"Dosa", "Idli", "Bara", "Samosa", "Cold-drink"};
        String Key = "Samosa";

        int index = MenuSearch(Menu,Key);
        if(index== -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Key is at index : "+index);
        }
    }
}
