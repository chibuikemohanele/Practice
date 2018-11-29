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
void constructTree(tNode ** root, int value)
{
   if((*root) == NULL)
   {
       root = createNode(value);
   }

   if(value < (*root) -> data)
   {
       constructTree((*root) -> left);
   }
   else
   {
       constructTree((*root) -> right);
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
