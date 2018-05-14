package com.company;

public class Team {
        private String teamName;
        private chuvak [] chuvaks;
        private String trener;

        public Team(String teamName, chuvak [] chuvaks, String trener) {
                this.teamName = teamName;
                this.chuvaks = chuvaks;
                this.trener = trener;
        }

        public void showTeam(){
                System.out.println("Дикая дичь"+ teamName + chuvaks + trener);
        }

}
