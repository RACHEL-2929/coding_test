#include <stdio.h>
#include <string.h>

int main() {

  char arr[1000000];
  scanf("%[^\n]",arr);
  int n = strlen(arr);
  int cnt = 0;

  if(n == 1)
  {
    if(arr[0] == ' ')
    {
      printf("0\n");
      return 0;
    }
  }

  for(int i = 1; i < n-1; i++)
    {
      if(arr[i] == ' ') cnt++;
    }
  printf("%d", cnt+1);


  return 0;
}
  