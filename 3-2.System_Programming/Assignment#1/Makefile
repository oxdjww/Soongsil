CC = gcc
CFLAGS = -Wall -Wextra -std=c99
TARGET = 20192944
SRCS = 20192944.c
OBJS = $(SRCS:.c=.o)
HEADERS = 20192944.h

$(TARGET): $(OBJS)
	$(CC) $(CFLAGS) -o $(TARGET) $(OBJS)

$(OBJS): $(SRCS) $(HEADERS)
	$(CC) $(CFLAGS) -c $(SRCS)

run:
	./$(TARGET)

clean:
	rm -f $(OBJS) $(TARGET)
