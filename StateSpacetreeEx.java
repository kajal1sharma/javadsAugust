package recursion;
class StateSpacetreeEx{

    static void print(int n){
        if(n==4){
            return;
        }
        print(n+1);
        print(n+1);
        System.out.print(n+"  ");
    } 
    public static void main(String[] args) {
        
        print(1);
    }
}