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

test1: $(TARGET)
	./game 100
	
clean: 
	rm -f $(OBJS) $(TARGET) 