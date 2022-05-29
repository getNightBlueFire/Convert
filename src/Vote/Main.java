package Vote;

public class Main {
    public static void main(String[] args) {
        IVoting[] votes = new Vote[10];

        String user = "I user";
        String pass = "132468";
        IVoting vote1 = new Vote(user, pass);
        IVoting iVoting = new Vote();
        iVoting.registration(vote1);


        iVoting.soutVoters(votes);
    }
}
