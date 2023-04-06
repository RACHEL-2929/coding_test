#include <stdio.h>

int main() {
  int n, m;
  scanf("%d %d", &n, &m);
  int arr[n][m];
  int arr2[n][m];
  int arr3[n][m];
  for(int i = 0; i < n; i++)
    {
      for(int j = 0; j < m; j++)
        {
          scanf("%d", &arr[i][j]);
        }
    }
  for(int k = 0; k < n; k++)
    {
      for(int l = 0; l < m; l++)
        {
          scanf("%d", &arr2[k][l]);
          arr[k][l] += arr2[k][l];
        }
    }

 
  for(int o = 0; o < n; o++)
    {
      if(o > 0) printf("\n");
      for(int p = 0; p < m; p++)
        {
           printf("%d ", arr[o][p]);
        }
    }
  
}
  