class user:

    def __init__(self, name, email, pssw):
        self.name = name
        self.email = email
        self.pssw = pssw

        self.follow_list = []
        self.follower = []

    def follow(self, another_user):
        a = self.follow_list = []

    def following(self):
        self.follower = []

    def num_followers(self):
        pass


user1 = user("Young", "young@codeit.kr", "1111")
user2 = user("Sam", "sam@codeit.kr", "1234")
user3 = user("Gol", "gol@codeit.kr", "1122")
user4 = user("Jim", "jim@codeit.kr", "1233")

user1.follow_list.append(user2)
user1.follow_list.append(user3)
user2.follow_list.append(user1)
user2.follow_list.append(user3)
user3.follow_list.append(user1)
user3.follow_list.append(user2)

print(user1.follow_list.append(user2))
