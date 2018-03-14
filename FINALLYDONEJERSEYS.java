import java.io.*;
public class FINALLYDONEJERSEYS
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int j = Integer.parseInt(b.readLine());
        int a = Integer.parseInt(b.readLine());
        String[] jerseys = new String[j];
        for(int i = 0; i<j; i++)
        {
            jerseys[i] = b.readLine();
        }
        int count = 0;
        for(int i = 0; i < a; i++)
        {
            String s = b.readLine();
            String[] input = s.split(" ");
            String size = input[0];
            int numberIndex = Integer.parseInt(input[1])-1;
            if(jerseys[numberIndex].equals("L"))
            {
                count++;
                jerseys[numberIndex] = "T";
            }
            else if(size.equals(jerseys[numberIndex]))
            {
                count++;
                jerseys[numberIndex] = "T";
            }
            else if(size.equals("S") && jerseys[numberIndex].equals("M"))
            {
                count++;
                jerseys[numberIndex] = "T";
            }
        }
        System.out.println(count);
    }
}
/*j = int(input())
a = int(input())

jerseys = []
for i in range(j):
    jerseys.append(input())

requestsSatisfied = 0
for i in range(a):
    data = input().split()
    size = data[0]
    number = int(data[1]) - 1
    if jerseys[number] != 'T':
        if size == 'S' or \
               size == jerseys[number] or \
               (size == 'M' and jerseys[number] == 'L'):
            requestsSatisfied = requestsSatisfied + 1
            jerseys[number] = 'T'

print(requestsSatisfied)*/