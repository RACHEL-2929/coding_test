#include <stdio.h>
#include <string.h>

int main() {

  int n, len = 0;
  char arr[1001] = "\0";
  char c,h;
  scanf("%d",&n);
  
  for(int i  = 0; i < n; i++)
    {
      scanf("%s",arr);
      len = strlen(arr);
      c = arr[0];
      h = arr[len - 1];
      printf("%c%c\n", c,h);
    }
  return 0;
}