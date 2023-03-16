#include <stdio.h>
#include <string.h>

int main() {

  int arr[10];
  scanf("%d %d %d %d %d %d",&arr[0],&arr[1],&arr[2],&arr[3],&arr[4],&arr[5]);
  printf("%d ", 1 - arr[0]);
  printf("%d ", 1 - arr[1]);
  printf("%d ", 2 - arr[2]);
  printf("%d ", 2 - arr[3]);
  printf("%d ", 2 - arr[4]);
  printf("%d", 8 - arr[5]);
 
  return 0;
}
  