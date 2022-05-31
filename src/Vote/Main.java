package Vote;

public class Main {
    public static void main(String[] args) {

        String user = "I user";
        String pass = "132468";
        IVoting vote1 = new Vote(user, pass, "1","2",1);
        IVoting vote2 = new Vote(user, pass, "2","2",1);
        IVoting vote3 = new Vote(user, pass, "3","2",1);
        IVoting iVoting = new Vote();
        iVoting.registration(vote1);
        iVoting.registration(vote2);
        iVoting.registration(vote3);

        iVoting.soutVoters();

        Single test = Single.getInstance("a");
        Single test1 = Single.getInstance("b");

        System.out.println(test.getA());
        System.out.println(test1.getA());
    }
}
