package JavaGenerics.GenericsChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LeagueTable<T extends Team<S>, S extends Player> {
  /* public class LeagueTable<T extends Team> {
     could have written like that,
     but it gives a warning that leagueTable is unchecked
     due to raw type of class Team

   */
    private List<T> leagueTable;

    public LeagueTable() {
        this.leagueTable = new ArrayList<>();
    }

    public LeagueTable(LeagueTable<T, S> footballLeagueTable) {
        this.leagueTable = new ArrayList<>(footballLeagueTable.leagueTable);
    }

    public List<T> getLeagueTable() {
        return leagueTable;
    }

    public void printTeamsInOrder(){
        Collections.sort(leagueTable);
        int i = 1;
        for( T team : leagueTable){
            System.out.println("#"+i+": Team: " + team.getName() + " -> Ranking: " +team.ranking());
            i++;
        }
    }

    public boolean addTeamToLeague(T teamToAdd){
        if(!this.leagueTable.contains(teamToAdd)){
            this.leagueTable.add(teamToAdd);
            return true;
        }else{
            return false;
        }

    }
}
