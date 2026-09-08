package constructor;

public class Varars {
    void add(int ...nums){
        System.out.println("number of parameter := "+nums.length);
        int sum=0;
        for(int n :nums){
            sum+=n;
        }
        System.out.println("addition := "+sum);
    }

    public static void main(String[] args) {
        Varars obj=new Varars();
        obj.add(1,2,3);
        obj.add(1,2,3,4);
        obj.add(1,2,3,4,5,6);
        obj.add(1,2,3,4,5,7,8);
    }
}
