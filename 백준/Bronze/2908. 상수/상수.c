#include <stdio.h>
#include <string.h>

int main() {

  char fir[4],sec[4];
  scanf("%s %s",fir, sec);
  int save;

 
  save = fir[0];
  fir[0] = fir[2];
  fir[2] = save;

  save = sec[0];
  sec[0] = sec[2];
  sec[2] = save;

  if(strcmp(fir,sec) > 0)
    printf("%s",fir);
  else
    printf("%s",sec);

  return 0;
}
  