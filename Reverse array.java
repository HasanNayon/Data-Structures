public class App {
    public static void main(String[] args) throws Exception {
       int array[]={1,2,3};

       for(int j=0;j<array.length;j++){
        System.out.print("->" +array[j]);
       }
       System.out.println();

       for(int i=array.length-1;i>=0;i--){
        
        System.out.print("->" +array[i]);
       }
    }
}
