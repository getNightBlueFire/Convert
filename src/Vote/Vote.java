package Vote;

public class Vote extends VoteMath {

    public Vote() {
    }

    public Vote(String user, String password) {
        this.setUserName(user);
        this.setPassword(password);
    }

    public Vote(String user, String password, String name, String surname, int vot) {
        this.setUserName(user);
        this.setPassword(password);
        this.setName(name);
        this.setSurname(surname);
        this.setVot(vot);
    }


    public IVoting[] getiVotings() {
        return iVotings;
    }

    public void setiVotings(IVoting[] iVotings) {
        this.iVotings = iVotings;
    }

    IVoting[] iVotings = new IVoting[10];

    @Override
    public void registration(IVoting v) {
        for (int i = 0; i < iVotings.length; i++) {
            if (iVotings[i] == null){
                iVotings[i] = v;
                break;
            }
        }

   }

    @Override
    public void enter() {

    }

    @Override
    public void countVotes() {

    }

    @Override
    public void soutVoters(IVoting[] v) {
        if (v != null) {
            System.out.print("{ ");
            for (int i = 0; i < v.length; i++) {
                System.out.print("{ ");
                System.out.print(v[i].toString());
            }

        }
    }
}
