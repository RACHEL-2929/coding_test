#include <stdio.h>
#include <string.h>

int main() {
  double sum1 = 0, sum2 = 0;
  for(int i = 0; i < 20; i++)
    {
      char name[50];
      float hak;
      char grade[2];
      
      scanf("%s %f %s",name, &hak, grade);
      
      if(strcmp(grade, "A+") == 0)
      {
        sum1 = sum1 + (hak * 4.5);
        sum2 = sum2 + hak;
      }
      else if(strcmp(grade, "A0") == 0)
      {
        sum1 = sum1 + (hak * 4.0);
        sum2 = sum2 + hak;
      }
      else if(strcmp(grade, "B+") == 0)
      {
        sum1 = sum1 + (hak * 3.5);
        sum2 = sum2 + hak;
      }
      else if(strcmp(grade, "B0") == 0)
      {
        sum1 = sum1 + (hak * 3.0);
        sum2 = sum2 + hak;
      }
      else if(strcmp(grade, "C+") == 0)
      {
        sum1 = sum1 + (hak * 2.5);
        sum2 = sum2 + hak;
      }
      else if(strcmp(grade, "C0") == 0)
      {
        sum1 = sum1 + (hak * 2.0);
        sum2 = sum2 + hak;
      }
      else if(strcmp(grade, "D+") == 0)
      {
        sum1 = sum1 + (hak * 1.5);
        sum2 = sum2 + hak;
      }
      else if(strcmp(grade, "D0") == 0)
      {
        sum1 = sum1 + (hak * 1.0);
        sum2 = sum2 + hak;
      }
      else if(strcmp(grade, "F") == 0)
      {
        sum1 = sum1 + (hak * 0.0);
        sum2 = sum2 + hak;
      }
    }

  printf("%lf", sum1/sum2);
      
      
      
    
    return 0;
}
  