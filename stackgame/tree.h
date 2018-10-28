#ifndef TREE_H
#define TREE_H

typedef struct tNode
{
	int data;
	struct tNode * left;
	struct tNode * right;
}tNode;

tNode * createNode();

#endif
