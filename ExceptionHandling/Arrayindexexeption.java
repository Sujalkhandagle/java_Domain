public class Arrayindexexeption {
    public static void main(String[] args) {
    try{    
    int arr[]={1,2,3,};
    arr[2]=5;
    System.out.println(arr);
    

    }
    catch(ArrayIndexOutOfBoundsException e)
{
    System.out.println(e);
}   

catch(ArrayStoreException e){
    System.out.println(e);
}
 
    
}

   
}
