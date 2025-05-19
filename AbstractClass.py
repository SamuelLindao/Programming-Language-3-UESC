from abc import ABC, abstractmethod


class AbstractClass(ABC):
    def __init__(self, value, valu1):
        self.value = value
        self.valu1 = valu1

    @abstractmethod
    def sum(self):
        pass


class Implemented(AbstractClass):

    def sum(self):
        return self.value + self.valu1


    