#include "tree.h"
#include <stdlib.h>

#ifdef TREE

tNode * createNode(int value)
{
    tNode * new = calloc(1, sizeof(tNode));
    new -> left = NULL;
    new -> right = NULL;
    new -> data = value;

    return(new);
}


//Function is wrong!!
void constructTree(tNode ** root, int * arr, int * index, int size)
{
    //Base case, when there are no more elements to put in the tree
    if(*index == size)
    {
        return;
    }

    *root = createNode(arr[*index]);
    tNode * temp = *root;

    if(arr[*index] < temp -> data)
    {
        //temp -> left = createNode(arr[*index]);
        (*index)++;
        constructTree(&(temp -> left), arr, index, size);
    }
    else
    {
        //temp -> right = createNode(arr[*index]);
        (*index)++;
        constructTree(&(temp -> right), arr, index, size);
    }

}

void destroyTree(tNode ** root)
{
    if(*root == NULL)
    {
        return;
    }

    if((*root) -> left != NULL)
    {
        tNode * left = (*root) -> left;
        destroyTree(&left);
        free(left);
    }
    
    if((*root) -> right != NULL)
    {
        tNode * right = (*root) -> right;
        destroyTree(&right);
        free(right);
    }
  
    free(*root);

}

#endif
