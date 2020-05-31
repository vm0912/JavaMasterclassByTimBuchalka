package JavaGenerics.GenericsChallenge;


import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

//        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn= new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle= new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));


        LeagueTable <Team<FootballPlayer>, FootballPlayer> footballLeagueTable = new LeagueTable<>();
//        below line has the same effect as above, but it gives a warning
//        LeagueTable<Team<FootballPlayer>> footballLeagueTable = new LeagueTable<>();
        footballLeagueTable.addTeamToLeague(hawthorn);
        footballLeagueTable.addTeamToLeague(fremantle);
        footballLeagueTable.addTeamToLeague(adelaideCrows);
        footballLeagueTable.addTeamToLeague(melbourne);

//      footballLeagueTable.addTeamToLeague(baseballTeam);   //not working
//      footballLeagueTable.addTeamToLeague(new Team("genericname"));  // would work despite the parametrized class
        footballLeagueTable.printTeamsInOrder();



        LeagueTable <Team<FootballPlayer>, FootballPlayer> newerLeagueTable = new LeagueTable<>(footballLeagueTable);


        Collections.reverse(newerLeagueTable.getLeagueTable());
        System.out.println("first table \n"+ footballLeagueTable.getLeagueTable().toString());

        System.out.println("=======================\nsecond table \n"+ newerLeagueTable.getLeagueTable().toString());


    }
}
