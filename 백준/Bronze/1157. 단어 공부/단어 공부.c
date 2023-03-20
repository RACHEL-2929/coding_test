#include <stdio.h>
#include <string.h>

int main() {

  char arr[1000000],ans;
  int a[26], max = 0;
  scanf("%s", arr);
  int len = strlen(arr);
  
  for(int i = 0; i<len; i++)
    {
      if(arr[i] >= 'a') a[arr[i]-'a']++;
      else a[arr[i]-'A']++;
    }

  for(int i = 0; i<26; i++)
    {
      if(a[i] == max) ans = '?';
      else if(a[i] > max)
      {
        max = a[i];
        ans = 'A' + i;
      }
    }
    printf("%c", ans);
    return 0;
}
  