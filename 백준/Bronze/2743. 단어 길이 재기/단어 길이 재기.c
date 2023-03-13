#include <stdio.h>
#include <string.h>

int main() {

  int count = 0;
  char arr[101];
  scanf("%s",arr);
  
  for(int i  = 0; i < strlen(arr); i++)
    count++;
  printf("%d\n", count);
  return 0;
}