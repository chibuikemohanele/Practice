#ifndef STACK_H
#define STACK_H

typedef struct StackNode
{
    int data;
    struct StackNode * link;
}StackNode;

typedef struct Stack
{
    int numNodes;
    StackNode * top;
}Stack;


Stack * createStack();
void createStackNode(Stack ** stack, int * value);
void pushStack(Stack * stack, int value);
int pop(Stack * stack);
void destroyStack(Stack * stack);
int retrieveTop(Stack * stack);
int numNodes(Stack * stack);
int isEmpty(Stack * stack);
int isFull(Stack * stack);

#endif
