#include <stdio.h>
#include <string.h>

int main() {
  int N,count = 0;
  scanf("%d", &N);
  
  for(int i = 0; i < N; i++)
    {
      char word[101];
      scanf("%s",word);
      int len = strlen(word);
      int al[26] ={0};
      
      for(int j = 0; j < len; j++)
        {
          
          if(al[word[j] - 'a'] == 0)
          {
            al[word[j] - 'a'] = 1;
          }
          else
          {
            if(word[j-1] != word[j])
              break;
          }
          if(j == len-1)
            count++;
        }
    }
  printf("%d",count);
    return 0;
}
  