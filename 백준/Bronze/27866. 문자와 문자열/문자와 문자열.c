#include <stdio.h>

int main() {

  int i;

  char arr[1001];
  scanf("%s",arr);
  scanf("%d", &i);
  printf("%c",arr[i-1]);
  
  return 0;
}