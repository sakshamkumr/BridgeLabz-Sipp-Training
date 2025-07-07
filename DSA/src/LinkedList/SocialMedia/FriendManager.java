package LinkedList.SocialMedia;

import java.util.ArrayList;
import java.util.List;

class FriendManager {
    private User head;

    // Add new user to the list
    public void addUser(User user) {
        if (head == null) {
            head = user;
        } else {
            User current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = user;
        }
    }

    // 1. Add friend connection between two users
    public void addFriend(int user1ID, int user2ID) {
        User user1 = findUserByID(user1ID);
        User user2 = findUserByID(user2ID);

        if (user1 != null && user2 != null && user1ID != user2ID) {
            if (!user1.friendIDs.contains(user2ID))
                user1.friendIDs.add(user2ID);
            if (!user2.friendIDs.contains(user1ID))
                user2.friendIDs.add(user1ID);
        }
    }

    // 2. Remove friend connection
    public void removeFriend(int user1ID, int user2ID) {
        User user1 = findUserByID(user1ID);
        User user2 = findUserByID(user2ID);

        if (user1 != null) user1.friendIDs.remove(Integer.valueOf(user2ID));
        if (user2 != null) user2.friendIDs.remove(Integer.valueOf(user1ID));
    }

    // 3. Find mutual friends
    public List<Integer> findMutualFriends(int user1ID, int user2ID) {
        User user1 = findUserByID(user1ID);
        User user2 = findUserByID(user2ID);

        List<Integer> mutual = new ArrayList<>();
        if (user1 != null && user2 != null) {
            for (int id : user1.friendIDs) {
                if (user2.friendIDs.contains(id)) {
                    mutual.add(id);
                }
            }
        }
        return mutual;
    }

    // 4. Display all friends of a user
    public void displayFriends(int userID) {
        User user = findUserByID(userID);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friendIDs);
        }
    }

    // 5. Search user by Name or ID
    public void searchUser(String query) {
        User current = head;
        while (current != null) {
            if (String.valueOf(current.userID).equals(query) || current.name.equalsIgnoreCase(query)) {
                displayUser(current);
            }
            current = current.next;
        }
    }

    // 6. Count number of friends per user
    public void countFriends() {
        User current = head;
        while (current != null) {
            System.out.println(current.name + " has " + current.friendIDs.size() + " friends.");
            current = current.next;
        }
    }

    // Helper methods
    private User findUserByID(int id) {
        User current = head;
        while (current != null) {
            if (current.userID == id) return current;
            current = current.next;
        }
        return null;
    }

    private void displayUser(User user) {
        System.out.println("User ID: " + user.userID + ", Name: " + user.name + ", Age: " + user.age + ", Friends: " + user.friendIDs);
    }

    public static void main(String[] args) {
        FriendManager manager = new FriendManager();

        manager.addUser(new User(1, "Alice", 22));
        manager.addUser(new User(2, "Bob", 24));
        manager.addUser(new User(3, "Charlie", 20));

        manager.addFriend(1, 2);
        manager.addFriend(1, 3);

        manager.displayFriends(1);
        manager.displayFriends(2);

        System.out.println("Mutual Friends between Alice and Bob: " + manager.findMutualFriends(1, 2));

        manager.searchUser("Charlie");
        manager.countFriends();

        manager.removeFriend(1, 2);
        manager.displayFriends(1);
    }
}
