package Vote;

public interface IVoting {
    void registration(IVoting vote);
    void enter();
    void countVotes();
    void soutVoters(IVoting[] votes);
}
