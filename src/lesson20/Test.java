package lesson20;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException {

//        List<User> users = new ArrayList<>();
//
//        for(int i = 0; i < 5; i++) {
//            users.add(new User("User"+(i+1),20+i));
//        }
//
//        try (Writer writer1 = new FileWriter("src/resources/users.csv",true);
//            Writer writer2 = new FileWriter("src/resources/posts.csv",true)) {
//            writer1.write("user_id,user_name,age,posts_count\n");
//            writer2.write("post_id,user_id,title,posted_at\n");
//            for(User user : users) {
//                for(int j = 0; j < 5; j++) {
//                    Post post = new Post("Post"+(j+1) + " " + user.getName());
//                    user.addPost(post);
//                    writer2.write(post.getId()+","+user.getId()+","+post.getTitle()+","
//                            +dateTimeConverter(post.getPostedAt())+"\n");
//                }
//                writer1.write(user.getId() + "," + user.getName() + ","
//                        + user.getAge() + "," + user.getPosts().size() + "\n");
//            }
//        }

        try(BufferedReader reader1 = new BufferedReader(new FileReader("src/resources/users.csv"));
            BufferedReader reader2 = new BufferedReader(new FileReader("src/resources/posts.csv"))) {
            Map<Integer,User> mappedUsers = new HashMap<>();
            List<Post> mappedPosts = new ArrayList<>();

            reader1.readLine();
            reader2.readLine();
            while(reader1.ready() || reader2.ready()) {
                if(reader1.ready()) {
                    User mappedUser = userMapper(reader1.readLine());
                    mappedUsers.put(mappedUser.getId(), mappedUser);
                }
                if(reader2.ready()) {
                    Post mappedPost = postMapper(reader2.readLine());
                    mappedPosts.add(mappedPost);

                    User foundUser = mappedUsers.get(mappedPost.getUserId());
                    if (foundUser != null) {
                        foundUser.addPost(mappedPost);
                    }
                }
            }

            printUsers(mappedUsers);
        }
    }

    private static void printUsers(Map<Integer,User> users) {
        for(User user : users.values()) {
            System.out.println("----------------------");
            System.out.println("User:");
            System.out.println("Name: " + user.getName());
            System.out.println("Id: " + user.getId());
            System.out.println("Age: " + user.getAge());
            for(Post post : user.getPosts()) {
                System.out.println("********************");
                System.out.println("Post");
                System.out.println("Id: " + post.getId());
                System.out.println("User id: " + post.getUserId());
                System.out.println("Title: " + post.getTitle());
                System.out.println("Posted at: " + dateTimeConverter(post.getPostedAt()));
            }
        }
    }

    private static String dateTimeConverter(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return formatter.format(dateTime);
    }

    private static LocalDateTime stringDateTimeConverter(String dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return LocalDateTime.parse(dateTime,formatter);
    }

    private static User userMapper(String userLine) {
        String[] userParts = userLine.split(",");
        User user = new User();
        user.setId(Integer.parseInt(userParts[0]));
        user.setName(userParts[1]);
        user.setAge(Integer.parseInt(userParts[2]));

        return user;
    }

    private static Post postMapper(String postLine) {
        String[] postParts = postLine.split(",");
        Post post = new Post();
        post.setId(Integer.parseInt(postParts[0]));
        post.setUserId(Integer.parseInt(postParts[1]));
        post.setTitle(postParts[2]);
        post.setPostedAt(stringDateTimeConverter(postParts[3]));

        return post;
    }
}

class User {
    private int id;
    private String name;
    private int age;
    private final List<Post> posts;

    private static int uniqueId = 1;

    public User() {
        posts = new ArrayList<>();
    }

    public User(String name, int age) {
        id = uniqueId++;
        this.name = name;
        this.age = age;
        posts = new ArrayList<>();
    }

    public void addPost(Post post) {
        posts.add(post);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Post> getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", posts=" + posts +
                '}';
    }
}

class Post {
    private int id;
    private String title;
    private LocalDateTime postedAt;
    private int userId;

    private static int uniqueId = 1;

    public Post() {}

    public Post (String title) {
        id = uniqueId++;
        this.title = title;
        this.postedAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(LocalDateTime postedAt) {
        this.postedAt = postedAt;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", postedAt=" + postedAt +
                ", userId=" + userId +
                '}';
    }
}
