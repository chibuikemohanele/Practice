#include<stdio.h>

void enterData(int *num)
{
    printf("Input the first num: ");
	scanf("%d", num);
}

int main()
{
    int firstNum;
    enterData(&firstNum);
    printf("The number entered was: %d\n", firstNum);

    return (0);
}
