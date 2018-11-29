#include<stdio.h>
#include<stdlib.h>

int static i = 0;

int f1(int n, int m)
{
	i++;
	printf("%d\n", i);
	if((n <= 0) || (m <= 0))
	{
		return 0;
	}
	int a = f1(n - 1, m - 1);
	int b = f1(n - 2, m - 1);
	return(a + b + n);
}

int f2(int n, int m)
{
	i++;
	printf("%d\n", i);
	if((n <= 0) || (m <= 0))
	{
		return 0;
	}
	int a = f2(n --, m - 1);
	int b = f2(n --, m - 1);
	return(a + b + n);
}

int f3(int n, int m)
{
	i++;
	printf("%d\n", i);
	if((n <= 0) || (m <= 0))
	{
		return 0;
	}
	int a = f3( --n, m - 1);
	int b = f3( --n, m - 1);
	return(a + b + n);
}

int main(int argc, char ** argv)
{
	//printf("answer: %d\n", f1(1, 10));
	printf("answer: %d\n", f2(1, 1));
	//printf("f3(5,10) = %d\n", f3(5, 10));
	
	return 1;
}
