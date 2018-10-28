#include "tree.h"
#include <stdlib.h>

#ifdef TREE

tNode * createNode()
{
    tNode * new = calloc(1, sizeof(tNode));
    new -> left = NULL;
    new -> right = NULL;

    return(new);
}

void construct(tNode ** root, int * arr)
{

}

#endif
