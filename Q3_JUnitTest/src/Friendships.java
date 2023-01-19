import java.util.ArrayList;
import java.util.List;

public class Friendships {
    private List<Friend> friends;

    public Friendships() {
        this.friends = new ArrayList<>();
    }

    public void makeFriends(String person1, String person2) {
        Friend friend1 = new Friend(person1);
        Friend friend2 = new Friend(person2);

        //check if friends already exist
        Friend existingFriend1 = findFriend(person1);
        Friend existingFriend2 = findFriend(person2);

        if (existingFriend1 != null) {
            friend1 = existingFriend1;
        }

        if (existingFriend2 != null) {
            friend2 = existingFriend2;
        }

        //add friends to each other's list
        friend1.getFriends().add(friend2);
        friend2.getFriends().add(friend1);

        //add to the list of all friends
        if (!friends.contains(friend1)) {
            friends.add(friend1);
        }

        if (!friends.contains(friend2)) {
            friends.add(friend2);
        }
    }

    public List<String> getFriendsList(String person) {
        Friend friend = findFriend(person);
        List<String> friendsList = new ArrayList<>();

        if (friend != null) {
            for (Friend f : friend.getFriends()) {
                friendsList.add(f.getName());
            }
        }

        return friendsList;
    }

    public boolean areFriends(String person1, String person2) {
        Friend friend1 = findFriend(person1);
        if (friend1 != null) {
            return friend1.getFriends().contains(new Friend(person2));
        }
        return false;
    }

    private Friend findFriend(String name) {
        for (Friend friend : friends) {
            if (friend.getName().equals(name)) {
                return friend;
            }
        }
        return null;
    }
}

class Friend {
    private String name;
    private List<Friend> friends;

    public Friend(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Friend) {
            return this.name.equals(((Friend) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
