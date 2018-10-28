#include <stdio.h>
#include <stdlib.h>

typedef struct tNode
{
	struct tNode * left;
	struct tNode * right;
	int data;
}tNode;

tNode * nodeCreate(int value)
{
	tNode * new;
	new =  calloc(1, sizeof(tNode));
	new -> data = value;
	new -> left = NULL;
	new -> right = NULL;

	return new;
}

tNode * treeConstruct(tNode * root, int value)
{
	if(root == NULL)
	{
		return nodeCreate(value);
	}

	if(value < root -> data)
	{	
		root -> left = treeConstruct(root -> left, value);
	}
	else
	{
		root -> right = treeConstruct(root -> right, value);
	}

	return root;

}

void printPreOrder(tNode * root)
{
	if(root == NULL)
	{
		return;
	}

	printf("%d ", root -> data);

	printPreOrder(root -> left);
	
	printPreOrder(root -> right);
}

int main(int argc, char ** argv)
{
	int size = 0;
	int value = 0;

	if(argc < 2)
	{
		return EXIT_FAILURE;
	}

	char * filename = argv[1];

	FILE * fptr = fopen(filename, "r");

	while(fscanf(fptr,"%d", &value) == 1)
	{
		size++;
	}

	tNode * root = NULL;
	
	root = nodeCreate(10);
	root -> left = nodeCreate(8);
	root -> left -> left = nodeCreate(7);
	root -> left -> left -> left = nodeCreate(6);
	root -> left -> left -> left -> left = nodeCreate(3);


	printf("----Pre Order----\n");
	
	printPreOrder(root);
	
	printf("\n");

	return EXIT_SUCCESS;
}
