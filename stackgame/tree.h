#ifndef TREE_H
#define TREE_H

typedef struct tNode
{
	int data;
	struct tNode * left;
	struct tNode * right;
}tNode;

tNode * createNode(int value);
void constructTree(tNode ** root, int * arr, int * index, int size);
void destroyTree(tNode ** root);

#endif
