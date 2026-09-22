public class PascalTriangle2 {
    void pascalTriangle2(int row){
        int ans=1;
        System.out.print(ans +" ");
        for (int i = 1; i < row; i++) {
            ans=ans*(row-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }
}
