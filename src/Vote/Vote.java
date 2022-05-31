package Vote;

import java.util.Arrays;

public class Vote extends VoteMath {

    public Vote() {
        super();
    }

    public Vote(String user, String password, String name, String surname, int vot) {
        super();
        super.setUserName(user);
        super.setPassword(password);
        super.setName(name);
        super.setSurname(surname);
        super.setVot(vot);
    }

    IVoting[] iVotings = new IVoting[10];

    @Override
    public void registration(IVoting v) {
        for (int i = 0; i < iVotings.length; i++) {
            if (iVotings[i] == null) {
                iVotings[i] = v;
                break;
            }
        }

    }

    @Override
    public void soutVoters() {
        for (IVoting iVoting : iVotings) {
            if (iVoting == null)
                continue;
            System.out.println(iVoting);
        }
    }

    @Override
    public String toString() {
        return "Vote{" +
                "iVotings=" + Arrays.toString(iVotings) +
                "} " + super.toString();
    }
}
