#include <stdio.h>
#include <string.h>

int main() {
  int t;
  scanf("%d",&t);

  for(int i = 0; i < t; i++)
    {
      int r;
      scanf("%d", &r);
      char arr[20] = {0};
      scanf("%s",arr);
      int n = strlen(arr);
      
      for(int j = 0; j < n; j++)
        {
          for(int k = 0; k < r; k++) printf("%c", arr[j]);
        }
      printf("\n");
    }
  
    return 0;
}
  