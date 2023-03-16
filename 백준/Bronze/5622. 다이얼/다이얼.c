#include <stdio.h>
#include <string.h>

int main() {

  char arr[15];
  scanf("%s",arr);
  int sum = 0;
  int len = strlen(arr);

  for(int i = 0; i < len; i++)
    {
      if(arr[i] >= 65 && arr[i] <= 67)//ABC
        sum = sum + 3;
      else if(arr[i] >= 68 && arr[i] <= 70)//DEF
        sum = sum + 4;
      else if(arr[i] >= 71 && arr[i] <= 73)//GHI
        sum = sum + 5;
      else if(arr[i] >= 74 && arr[i] <= 76)//JKL
        sum = sum + 6;
      else if(arr[i] >= 77 && arr[i] <= 79)//MNO
        sum = sum + 7;
      else if(arr[i] >= 80 && arr[i] <= 83)//PQRS
        sum = sum + 8;
      else if(arr[i] >= 84 && arr[i] <= 86)//TUV
        sum = sum + 9;
      else if(arr[i] >= 87 && arr[i] <= 90)//WXYZ
        sum = sum + 10;
      else if(arr[i] == 48)//0
        sum = sum + 11;
      else if(arr[i] == 49)//1
        sum = sum + 2;
    }
  printf("%d",sum);
  
  return 0;
}
  