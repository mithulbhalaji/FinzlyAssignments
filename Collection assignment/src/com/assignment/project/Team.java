package com.assignment.project;


import java.util.Set;

public class Team {
    private Set<String> teamMembers;
    private String projectDetails;

    public Team(Set<String> teamName, String projectDetails) {
        this.teamMembers = teamName;
        this.projectDetails = projectDetails;
    }

    public Set<String> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamName(Set<String> teamMembers) {
        this.teamMembers = teamMembers;
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
                "teamMembers=" + teamMembers +
                ", projectDetails='" + projectDetails + '\'' +
                '}';
    }
}
