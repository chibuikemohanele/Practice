TARGET = game
TESTFLAGS = -DTREE -DSTACK -DGAME -DMAIN
WARNING = -Wall -Wshadow --pedantic
ERROR = -Wvla -Werror
GCC = gcc -std=c99 -g $(WARNING) $(ERROR)

SRCS = tree.c game.c stack.c
OBJS = $(SRCS:%.c=%.o)

$(TARGET): $(OBJS)
	$(GCC) $(TESTFLAGS) $(OBJS) -o $(TARGET)
.c.o: 
	$(GCC) $(TESTFLAGS) -c $*.c 

clean: 
	rm -f $(OBJS) $(TARGET) 