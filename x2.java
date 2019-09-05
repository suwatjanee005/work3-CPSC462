public class x2{
  public static void main(String args[]) {

int f[]={5,10,15,20,55,2,84};
int max=0;
int min=999;
int total=0;
for(int s=0;s<f.length;s++){
 if(max<f[s]) max=f[s];
 if(min>f[s]) min=f[s];
total+=f[s];
}
    System.out.println("max="+max);
    System.out.println("min="+min);
    System.out.println("total="+total);
}
}
