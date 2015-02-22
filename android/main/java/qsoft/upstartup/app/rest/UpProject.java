package qsoft.upstartup.app.rest;

import java.util.ArrayList;

/**
 * Created by p_val on 21.02.15.
 */
public class UpProject {
    private String id;
    private String image;
    private String name;
    private String problem;
    private String idea;
    private String audience;
    private String descriptions;
    private String useCases;
    private String prodMark;
    private String benefits;
    private String competition;
    private String strategy;
    private String promotion;
    private String business;
    private String milestones;
    private String risks;
    private ArrayList<UpUser> team;
    private String management;
    private String technologies;
    private String jobs;
    private UpInvest investment;

    public UpProject(String id, String image, String name, String problem, String idea, String audience, String descriptions, String useCases, String prodMark, String benefits, String competition, String strategy, String promotion, String business, String milestones, String risks, ArrayList<UpUser> team, String management, String technologies, String jobs, UpInvest investment) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.problem = problem;
        this.idea = idea;
        this.audience = audience;
        this.descriptions = descriptions;
        this.useCases = useCases;
        this.prodMark = prodMark;
        this.benefits = benefits;
        this.competition = competition;
        this.strategy = strategy;
        this.promotion = promotion;
        this.business = business;
        this.milestones = milestones;
        this.risks = risks;
        this.team = team;
        this.management = management;
        this.technologies = technologies;
        this.jobs = jobs;
        this.investment = investment;
    }

    public UpProject() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getUseCases() {
        return useCases;
    }

    public void setUseCases(String useCases) {
        this.useCases = useCases;
    }

    public String getProdMark() {
        return prodMark;
    }

    public void setProdMark(String prodMark) {
        this.prodMark = prodMark;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getMilestones() {
        return milestones;
    }

    public void setMilestones(String milestones) {
        this.milestones = milestones;
    }

    public String getRisks() {
        return risks;
    }

    public void setRisks(String risks) {
        this.risks = risks;
    }

    public ArrayList<UpUser> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<UpUser> team) {
        this.team = team;
    }

    public String getManagement() {
        return management;
    }

    public void setManagement(String management) {
        this.management = management;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public UpInvest getInvestment() {
        return investment;
    }

    public void setInvestment(UpInvest investment) {
        this.investment = investment;
    }

    @Override
    public String toString() {
        return "UpProject{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", problem='" + problem + '\'' +
                ", idea='" + idea + '\'' +
                ", audience='" + audience + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", useCases='" + useCases + '\'' +
                ", prodMark='" + prodMark + '\'' +
                ", benefits='" + benefits + '\'' +
                ", competition='" + competition + '\'' +
                ", strategy='" + strategy + '\'' +
                ", promotion='" + promotion + '\'' +
                ", business='" + business + '\'' +
                ", milestones='" + milestones + '\'' +
                ", risks='" + risks + '\'' +
                ", team=" + team +
                ", management='" + management + '\'' +
                ", technologies='" + technologies + '\'' +
                ", jobs='" + jobs + '\'' +
                ", investment=" + investment +
                '}';
    }
}
