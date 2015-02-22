package qsoft.upstartup.app.utils;

import qsoft.upstartup.app.rest.UpListProject;
import qsoft.upstartup.app.rest.UpProject;
import qsoft.upstartup.app.rest.UpUser;

import java.util.ArrayList;

/**
 * Created by andrii on 22.02.15.
 */
public class Utils {
    private static ArrayList<UpProject> upProjects = new ArrayList<>();
    private static ArrayList<UpUser> users = new ArrayList<>();

    public static ArrayList<UpProject> getUpProjects() {
        return upProjects;
    }

    public static ArrayList<UpListProject> getUpListProjects() {
        ArrayList<UpListProject> projects = new ArrayList<>();
        for (int i = 0; i < upProjects.size(); i++) {
            projects.add(new UpListProject(
                    upProjects.get(i).getId(),
                    upProjects.get(i).getName(),
                    "",
                    upProjects.get(i).getImage(),
                    "" + (i + 2)
            ));
        }
        return projects;
    }

    public static void addUsers() {
        UpUser upUser0 = new UpUser();
        upUser0.setId("0");
        upUser0.setName("Kevin Hong");
        upUser0.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/153276-medium_jpg?1405502432");
        upUser0.setPosition("Founder");

        UpUser upUser = new UpUser();
        upUser.setId("1");
        upUser.setName("Ngoc Trung Nguyen");
        upUser.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/218784-medium_jpg?1405534326");
        upUser.setPosition("Software Engineer");

        UpUser upUser1 = new UpUser();
        upUser1.setId("2");
        upUser1.setName("Daniela Pimentel");
        upUser1.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/535361-medium_jpg?1409962300");
        upUser1.setPosition("Community Manager");

        UpUser upUser2 = new UpUser();
        upUser2.setId("3");
        upUser2.setName("Talya Ercag");
        upUser2.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/348350-medium_jpg?1405590081");
        upUser2.setPosition("Director of Operations");


        users.add(upUser0);
        users.add(upUser);
        users.add(upUser1);
        users.add(upUser2);

        UpUser upUser3 = new UpUser();
        upUser3.setId("4");
        upUser3.setName("Jonathan Bruck");
        upUser3.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/27494-medium_jpg?1405457383");
        upUser3.setPosition("Juggler");

        UpUser upUser4 = new UpUser();
        upUser4.setId("5");
        upUser4.setName("Kenny Long");
        upUser4.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/94156-medium_jpg?1405522759");
        upUser4.setPosition("Analytics");

        UpUser upUser5 = new UpUser();
        upUser5.setId("6");
        upUser5.setName("Matt Koidin");
        upUser5.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/90757-medium_jpg?1405521597");
        upUser5.setPosition("CTO");

        UpUser upUser6 = new UpUser();
        upUser6.setId("7");
        upUser6.setName("Nate Weiner");
        upUser6.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/92470-medium_jpg?1405522194");
        upUser6.setPosition("Founder/CEO of Pocket");

        users.add(upUser3);
        users.add(upUser4);
        users.add(upUser5);
        users.add(upUser6);

        UpUser upUser7 = new UpUser();
        upUser7.setId("8");
        upUser7.setName("Koen Bok");
        upUser7.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/90777-medium_jpg?1405485465");
        upUser7.setPosition("Founder");

        UpUser upUser8 = new UpUser();
        upUser8.setId("9");
        upUser8.setName("Jorn van Dijk");
        upUser8.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/876197-medium_jpg?1416844905");
        upUser8.setPosition("Founder");

        UpUser upUser9 = new UpUser();
        upUser9.setId("10");
        upUser9.setName("Oskar van Eeden");
        upUser9.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/966461-medium_jpg?1421673726");
        upUser9.setPosition("CFO");

        UpUser upUser10 = new UpUser();
        upUser10.setId("11");
        upUser10.setName("Peter Werner");
        upUser10.setImage("https://d1qb2nb5cznatu.cloudfront.net/users/33955-medium_jpg?1406308830");
        upUser10.setPosition("Partner at @Cooley");

        users.add(upUser7);
        users.add(upUser8);
        users.add(upUser9);
        users.add(upUser10);

    }

    public static void addProjects() {
        UpProject upProject = new UpProject();
        upProject.setId("1");
        upProject.setName("Dealflicks");
        upProject.setIdea("Priceline for movie tickets");
        upProject.setImage("https://d1qb2nb5cznatu.cloudfront.net/startups/i/104489-5c33c1bd720e824325829cdfae3d7a0a-medium_jpg.jpg?buster=1364498133");
        upProject.setDescriptions("Dealflicks is Priceline for movie tickets.");
        upProject.setAudience("We're currently partnered with 500+ US theater locations including 13 of the top 50 US theater chains. Our annual revenue run rate has now surpassed $2M on 950%+ YoY growth.");
        upProject.setProblem("$40 billion dollars are spent every year on movie tickets, popcorn, and soda, but 88% of movie theater seats are empty. Dealflicks partners with theaters to fill these empty seats by selling movie tickets and concessions for up to 60% off.");
        upProject.setTeam(new ArrayList<UpUser>(users.subList(0, 3)));
        upProject.setJobs("Backend Engineer, " +
                "Frontend Javascript Engineer, " +
                "Junior Engineer, " +
                "Senior Engineer, " +
                "Internship, " +
                "Brand Ambassador, " +
                "Customer & Social Media Support Specialist");


        UpProject upProject1 = new UpProject();
        upProject1.setId("2");
        upProject1.setName("Pocket");
        upProject1.setIdea("When you find something you want to view later, put it in Pocket.");
        upProject1.setImage("https://d1qb2nb5cznatu.cloudfront.net/startups/i/52769-f3eb73829486a009abeeead5c94270c4-medium_jpg.jpg?buster=1342716002");
        upProject1.setDescriptions("Pocket is the world’s leading platform to catch and consume the most interesting and important content that is flowing through their day across any advice.");
        upProject1.setProblem("You're gathering great content all day long. The problem is you don't always have time to enjoy it right there");
        upProject1.setAudience("Pocket currently has more than 15M registered users with over 1.5 billion items saved. Pocket is integrated into more than 1500 apps including Flipboard, Twitter and Zite and is available for major devices and platforms including iOS, Android, Mac, Windows and Kobo.");
        upProject1.setTeam(new ArrayList<UpUser>(users.subList(4, 7)));
        upProject1.setJobs("Pocket hasn't added any jobs yet.");

        UpProject upProject2 = new UpProject();
        upProject2.setId("3");
        upProject2.setName("Framer");
        upProject2.setIdea("Framer is a new design tool to build interaction and animation prototypes.");
        upProject2.setImage("https://d1qb2nb5cznatu.cloudfront.net/startups/i/541088-b3ed8646e3012ca208318f5bacc1c6b7-medium_jpg.jpg?buster=1421850819");
        upProject2.setDescriptions("Framer is a new kind of design tool. One that redefines what it means to shape digital products. Unobstructed by the traditional distinction between designers and developers. It’s the best way to explore and discover what you want to create.");
        upProject2.setProblem("Images and words have dominated how we communicate ideas. With them, we’ve explained how products work. But they’re inadequate to define how products feel. To understand the potential of our ideas, we need to be able to interact with them.");
        upProject2.setTeam(new ArrayList<UpUser>(users.subList(8, 11)));
        upProject2.setJobs("Framer hasn't added any jobs yet.");


        upProjects.add(upProject);
        upProjects.add(upProject1);
        upProjects.add(upProject2);
    }
}
