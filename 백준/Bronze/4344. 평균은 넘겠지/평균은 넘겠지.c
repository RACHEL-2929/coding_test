#include <stdio.h>
#include <string.h>

int main() {

  int num;
  scanf("%d", &num);
  int stud;
  
  for(int i = 0; i < num; i++)
    {
      scanf("%d", &stud);
      int s[1001], score = 0;
      double avg = 0.00;
      for(int j = 0; j < stud; j++)
        {
          scanf("%d",&s[j]);
          score += s[j];
        }
      avg = (double)score/stud;
      int cnt = 0;
      for(int j = 0; j < stud; j++)
        {
          if(s[j] > avg) cnt++;
        }
      printf("%.3f%%\n",(double)cnt/stud * 100);
      
    }
  
    return 0;
}
  