package org.example;

import org.example.config.HibernateConfig;
import org.example.entity.Post;
import org.example.entity.Profile;
import org.example.entity.User;
import org.example.service.CommentService;
import org.example.service.Impl.CommentServiceImpl;
import org.example.service.Impl.PostServiceImpl;
import org.example.service.Impl.ProfileServiceImpl;
import org.example.service.Impl.UserServiceImpl;
import org.example.service.PostService;
import org.example.service.ProfileService;
import org.example.service.UserServic2;

import java.time.LocalDate;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        UserServic2 userServic2 = new UserServiceImpl();
        ProfileService profileService = new ProfileServiceImpl();
        PostService postService = new PostServiceImpl();
        CommentService commentService = new CommentServiceImpl();
        HibernateConfig.getEntityManager();
//        userServic2.saveUser(new User("email","password",new Profile("bio","date","fullname","gender"),"username"));
//        userServic2.saveUser(new User("email1","password1",new Profile("bio1","date1","fullname1","gender1"),"username1"));
//        userServic2.saveUser(new User("email2","password2",new Profile("bio2","date2","fullname2","gender2"),"username2"));
//        userServic2.saveUser(new User("email3","password3",new Profile("bio3","date3","fullname3","gender3"),"username3"));
//        System.out.println(userServic2.findUserById(10L));
//        userServic2.deleteUser(6L);
//        userServic2.updateUserProfile(8L,new Profile("checkingit","date1","fullname1","gender1"));

//        profileService.saveProfile(7L,new Profile("whatidf","vowoeevienvowenvoe","fullname1","gender1"));
//        System.out.println(profileService.findProfileByUserId(8L));
//        profileService.deleteProfileByUserId(7L);

//        postService.savePost(9L,new Post("created","desc","im"));
//        postService.deletePostById(2L); error
//        System.out.println(postService.getPostsByUserId(9L));
        System.out.println(postService.searchPost("desc"));

    }
}
