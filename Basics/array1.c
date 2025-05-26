#include<stdio.h>
int main(){
    int A[5];
    A[0] = 12;
    A[1] = 15;
    A[2] = 25;

    int B[5] = {2,4,6,8,10};
    int i;
    for(i=0;i<5;i++)
        printf("%d\t",B[i]);

    printf("\nSize of array : %d",sizeof(A));
}