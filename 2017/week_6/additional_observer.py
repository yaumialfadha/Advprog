class SubscriberOne:

    def __init__(self, name):
        self.name = name

    def update(self, message):
        print('{} got message "{}"'.format(self.name, message))


class SubscriberTwo:

    def __init__(self, name):
        self.name = name

    def receive(self, message):
        print('{} got message "{}"'.format(self.name, message))


class Publisher:

    def __init__(self):
        self.subscribers = dict()

    def register(self, who, callback=None):
        # TODO Complete Me
        pass

    def unregister(self, who):
        # TODO Complete Me
        pass

    def notify(self, message):
        # TODO Complete Me
        pass
