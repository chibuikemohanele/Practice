#include "game.h"
#include <stdlib.h>
#include <time.h>

#ifdef MAIN

int main(int argc, char ** argv)
{
    srand(time(NULL));

    //Variable declarations
    int size = 0;
    int randomSize = 0;
    tNode * root = NULL;
    Stack * stack = NULL;
    int * arr = NULL;
    int index = 0;
    int randomValue = 0;
    

    //Executable code
    size = strtol(argv[1], NULL, 10);
    randomSize = rand() % (size * 100);

    arr  = calloc(randomSize, sizeof(int));

    for(index = 0; index < randomSize; index++)
    {
        randomValue = rand() % randomSize;
        arr[index] = randomValue;
    }

    index = 0;
    constructTree(&root, arr, &index, randomSize);
    stack = createStack();

    return EXIT_SUCCESS;
}

#endif
