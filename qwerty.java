import java.io.*;
public class qwerty
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = (b.readLine().split(" "));
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[] costs = new int[n];
        for(int i = 0; i<n; i++)
        {
            costs[i] = Integer.parseInt(b.readLine());
        }
        int[][] deals = new int[m][n+1];
        for(int i = 0; i<m; i++)
        {
            String[] s = b.readLine().split(" ");
            for(int j = 0; j<n+1; j++)
            {
                deals[i][j] = Integer.parseInt(s[j]);
            }
        }
        int[] quantities = new int[n];
        String[] q = b.readLine().split(" ");
        for(int i = 0; i<n; i++){
            quantities[i] = Integer.parseInt(q[i]);
        }
        
        
}
}