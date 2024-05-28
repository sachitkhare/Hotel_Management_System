
public class AverageNum{
void average(double...a){
double sum=0;
for(double x:a){
sum+=x;
}
System.out.println("Average of Numbers :"+sum/a.length);
}

public static void main(String args[]) {
	AverageNum obj= new AverageNum();
	obj.average(10.5,58,64,45);
	
}

}