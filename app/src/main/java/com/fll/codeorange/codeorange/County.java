package com.fll.codeorange.codeorange;

import java.io.Serializable;

/**
 * Created by rjf5742 on 15-10-02.
 */
public class County implements Serializable{
    private String name;
    private String facility;
    private String isSingleStream;
    private String canRecycleBrownGlass;
    private String canRecycleGreenGlass;
    private String canRecycleClearGlass;
    private String canRecyclePaper;
    private String canRecycleCardboard;
    private String canRecycleCans;
    private String plasticRecyclingTypes;
    private String teamMember;
    private String websiteLink;

    public County(String name)
    {
        this.name = name;
    }

    public County(String name, String facility, String isSingleStream, String canRecycleBrownGlass, String canRecycleGreenGlass, String canRecycleClearGlass, String canRecyclePaper, String canRecycleCardboard, String canRecycleCans, String plasticRecyclingTypes, String websiteLink) {
        this.name = name;
        this.facility = facility;
        this.isSingleStream = isSingleStream;
        this.canRecycleBrownGlass = canRecycleBrownGlass;
        this.canRecycleGreenGlass = canRecycleGreenGlass;
        this.canRecycleClearGlass = canRecycleClearGlass;
        this.canRecyclePaper = canRecyclePaper;
        this.canRecycleCardboard = canRecycleCardboard;
        this.canRecycleCans = canRecycleCans;
        this.plasticRecyclingTypes = plasticRecyclingTypes;
        this.websiteLink = websiteLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public String getIsSingleStream() {
        return isSingleStream;
    }

    public void setIsSingleStream(String isSingleStream) {
        this.isSingleStream = isSingleStream;
    }

    public String getCanRecycleBrownGlass() {
        return canRecycleBrownGlass;
    }

    public void setCanRecycleBrownGlass(String canRecycleBrownGlass) {
        this.canRecycleBrownGlass = canRecycleBrownGlass;
    }

    public String getCanRecycleGreenGlass() {
        return canRecycleGreenGlass;
    }

    public void setCanRecycleGreenGlass(String canRecycleGreenGlass) {
        this.canRecycleGreenGlass = canRecycleGreenGlass;
    }

    public String getCanRecycleClearGlass() {
        return canRecycleClearGlass;
    }

    public void setCanRecycleClearGlass(String canRecycleClearGlass) {
        this.canRecycleClearGlass = canRecycleClearGlass;
    }

    public String getCanRecyclePaper() {
        return canRecyclePaper;
    }

    public void setCanRecyclePaper(String canRecyclePaper) {
        this.canRecyclePaper = canRecyclePaper;
    }

    public String getCanRecycleCardboard() {
        return canRecycleCardboard;
    }

    public void setCanRecycleCardboard(String canRecycleCardboard) {
        this.canRecycleCardboard = canRecycleCardboard;
    }

    public String getCanRecycleCans() {
        return canRecycleCans;
    }

    public void setCanRecycleCans(String canRecycleCans) {
        this.canRecycleCans = canRecycleCans;
    }

    public String getPlasticRecyclingTypes() {
        return plasticRecyclingTypes;
    }

    public void setPlasticRecyclingTypes(String plasticRecyclingTypes) {
        this.plasticRecyclingTypes = plasticRecyclingTypes;
    }

    public String getTeamMember() {
        return teamMember;
    }

    public void setTeamMember(String teamMember) {
        this.teamMember = teamMember;
    }

    public String getWebsiteLink() {
        return websiteLink;
    }

    public void setWebsiteLink(String websiteLink) {
        this.websiteLink = websiteLink;
    }
}
