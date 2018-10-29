#include "stack.h"
#include <stdlib.h>

#ifdef STACK

Stack * createStack()
{
    Stack * stack = calloc(1, sizeof(Stack));

    if(stack == NULL)
    {
        return NULL;
    }

    stack -> numNodes = 0;
    stack -> top = NULL;

    return(stack);
}

void createStackNode(Stack ** stack, int * value)
{
    if((*stack) == NULL)
    {
        return;
    }

    StackNode * new = calloc(1, sizeof(StackNode));

    if(new == NULL)
    {
        return;
    }

    new -> data = *value;
    new -> link = (*stack) -> top;
    (*stack) -> top = new;
    
}

void pushStack(Stack * stack, int value)
{
    if(stack == NULL)
    {
        return;
    }

    StackNode * new = calloc(1, sizeof(StackNode));

    if(new == NULL)
    {
        return;
    }

    new -> data = value;
    new -> link = stack -> top;
    stack -> top = new;
    (stack -> numNodes)++;
}

int popStack(Stack * stack)
{
    if(stack == NULL)
    {
        return EXIT_FAILURE;
    }

    StackNode * dtop = NULL;

    if(stack -> numNodes != 0)
    {
        return -1;
    }

    int data = stack -> top -> data;
    dtop = stack -> top;
    stack -> top = stack -> top -> link;
    (stack -> numNodes)--;
    free(dtop);

    return(data);
}

void destroyStack(Stack * stack)
{
    if(stack == NULL)
    {
        return;
    }

    if(stack -> numNodes == 0)
    {
        free(stack);
        return;
    }

    StackNode * delete = NULL;

    while(stack -> top != NULL)
    {
        (stack -> numNodes)--;
        delete = stack -> top;
        stack -> top = stack -> top -> link;
        free(delete);
    }

    free(stack);
}

int retrieveTop(Stack * stack)
{
    if(stack == NULL)
    {
        return EXIT_FAILURE;
    }

    if(stack -> numNodes == 0)
    {
        return  EXIT_FAILURE;
    }

    return (stack -> top -> data);
}

int numNodes(Stack * stack)
{
    if(stack == NULL)
    {
        return EXIT_FAILURE;
    }

    return stack -> numNodes;
}

int isEmpty(Stack * stack)
{
    if(stack == NULL)
    {
        return EXIT_FAILURE;
    }

    return (stack -> numNodes == 0);
}

int isFull(Stack * stack)
{
    if(stack == NULL)
    {
        return EXIT_FAILURE;
    }

    StackNode * temp = NULL;

    if((temp = calloc(1, sizeof(StackNode))))
    {
        free(temp);
        return 0;
    }

    return 1;
}
#endif
