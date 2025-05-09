class Node():
    def __init__(self, data, prev, next):
        self.data = data
        self.prev = prev
        self.next = next

    def insert_after(self, data):
        current = self
        while current:
            current = current.next
        current = Node(data, current.prev, current.next)
        current.prev.next = current
        return current

    def delete(self):
        if self.prev:
            self.prev.next = self.next
        return self.prev

    def print_list(self):
        current_node = self
        while current_node:
            print(current_node.data)
            current_node = current_node.next

class InsertNode(Node):
    def __init__(self, first, last, data, prev, next):
        super().__init__(data, prev, next)
        self.first = first
        self.last = last
        last.next = first
        first.prev = last

    def insert_after(self, data):
        current = self
        while current:
            if current != self.last:
                current = current.next
        current.next = Node(data, current.next, self.last)
        self.last = current

class DeleteNode(Node):
    def __init__(self, first, last, data, prev, next):
        super().__init__(data, prev, next)
        self.first = first
        self.last = last
        last.next = first
        first.prev = last

        
    def delete(self):