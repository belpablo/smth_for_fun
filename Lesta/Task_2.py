class CircularBuffer(object):


    def __init__(self, max_size = 10):
        
        """ ������������� ���������� ������� ������� max_size.
            �� ��������� max_size = 10
        """
        
        self.buffer = [None] * max_size
        self.head = 0
        self.tail = 0
        self.max_size = max_size


    def __str__(self):
        
        """ ������������ ������� � ���� ������ ��������� ����������� ������ str"""
        
        items = ['{!r}'.format(item) for item in self.buffer]
        
        return '[' + ', '.join(items) + ']'


    def size(self):
        
        """ ������ ������ """
        
        if self.tail >= self.head:
            return self.tail - self.head
        else:
            return self.max_size - self.head - self.tail

    def is_empty(self):
        
        """ �������� ������� ������ """
        
        return self.tail == self.head


    def is_full(self):
        
        """ �������� ������������� ������ """
        
        return self.tail == (self.head-1) % self.max_size


    def enqueue(self, item):
        
        """ ������� �������� � ����� """
        
        if self.is_full():
            raise OverflowError(
                "CircularBuffer is full, unable to enqueue item")

        self.buffer[self.tail] = item
        self.tail = (self.tail + 1) % self.max_size


    def dequeue(self):
        
        """ ����� ��������� �������� � ������ � ����������� ��� ��������� """
        
        if self.is_empty():
            raise IndexError("CircularBuffer is empty, unable to dequeue")
        
        item = self.buffer[self.head]
        self.buffer[self.head] = None
        self.head = (self.head + 1) % self.max_size
        
        return item


if __name__ == "__main__":
    
    cb = CircularBuffer(5)    
    cb.enqueue("one")
    cb.enqueue("two")
    cb.enqueue("three")
    cb.enqueue("four")
    print(str(cb))
    
    print(cb.dequeue())
    print(cb.dequeue())
    print(str(cb))
    
    cb.enqueue("five")
    cb.enqueue("six")
    print(str(cb))
