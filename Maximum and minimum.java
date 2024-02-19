public class App {
    public static void maximum(int array[],int x){
        
         for(int i= 1;i<array.length;i++){
            if (array[i]>x) {
                x=array[i];
            } 
         }
         System.out.println("The Maximum Value is:"+x);
    }
   
    
    public static void minimum(int array[],int x){
        for(int j=1;j<array.length;j++){
            if (array[j]<x) {
                x= array[j];
            }
        }
        System.out.println("The Minimum Value is:"+x);

    }
    public static void main(String[] args) throws Exception {
       int array[]= {3, 5, 4, 1, 9};
       int x= 3;
       maximum(array, x);
       minimum(array, x);

    }
}
