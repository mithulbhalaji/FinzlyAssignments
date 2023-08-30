package com.assignment.project;


import java.util.Set;

public class Team {
    private Set<String> teamName;
    private String projectDetails;

    public Team(Set<String> teamName, String projectDetails) {
        this.teamName = teamName;
        this.projectDetails = projectDetails;
    }

    public Set<String> getTeamName() {
        return teamName;
    }

    public void setTeamName(Set<String> teamName) {
        this.teamName = teamName;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName=" + teamName +
                ", projectDetails='" + projectDetails + '\'' +
                '}';
    }
}
