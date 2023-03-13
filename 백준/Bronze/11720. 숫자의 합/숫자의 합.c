#include <stdio.h>
#include <string.h>

int main() {

  int n,sum = 0;
  char arr[101];
  scanf("%d",&n);
  scanf("%s",arr);
  
  for(int i = 0; i < n; i++) sum = sum + arr[i] - '0';
  
  printf("%d\n", sum);
  return 0;
}