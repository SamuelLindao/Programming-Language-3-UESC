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
            else:
                break
        current.next = Node(data, current.next, self.last)
        self.last = current

class DeleteNode(Node):
    def __init__(self, first: Node, last:Node, data, prev:Node, next:Node):
        super().__init__(data, prev, next)
        self.first = first
        self.last = last
        last.next = first
        first.prev = last


    def delete(self):
        if self.last.prev:
            self.last.prev.next = self.last.next
        self.last = self.last.prev
        return self.last.prev

class PrintNode(Node):
    def __init__(self, first: Node, last:Node, data, prev:Node, next:Node):
        super().__init__(data, prev, next)
        self.first = first
        self.last = last
        last.next = first
        first.prev = last

    def print_list(self):
        current_node = self
        while current_node != self.last:
            print(current_node.data)
            current_node = current_node.next


class ComboNode(InsertNode, DeleteNode, PrintNode):
    def __init__(self, first, last, data, prev, next):
        super().__init__(data, prev, next)
        self.first = first
        self.last = last
        last.next = first
        first.prev = last

# Cria nó inicial com valor 1 (lista circular: 1 <-> 1)
node = ComboNode(1)

# Insere 2 após o nó 1 (lista: 1 <-> 2 <-> 1)
new_node = node.insert_after(2)

# Insere 3 após o nó 2 (lista: 1 <-> 2 <-> 3 <-> 1)
new_node.insert_after(3)

# Imprime a lista a partir do nó 1
node.print_list()
# Saída esperada: 1 <-> 2 <-> 3 <-> 1

# Deleta o nó 2 (lista: 1 <-> 3 <-> 1)
deleted_prev = new_node.delete()
deleted_prev.print_list()
