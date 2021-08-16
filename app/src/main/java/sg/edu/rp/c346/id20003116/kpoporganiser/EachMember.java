package sg.edu.rp.c346.id20003116.kpoporganiser;

import java.io.Serializable;

public class EachMember implements Serializable {
    private String stageName;
    private String koreanName;
    private String role;
    private String stats;
    private String nationality;
    private String SNS;

    public EachMember(String stageName, String koreanName, String role, String stats, String nationality, String SNS) {
        this.stageName = stageName;
        this.koreanName = koreanName;
        this.role = role;
        this.stats = stats;
        this.nationality = nationality;
        this.SNS = SNS;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getKoreanName() {
        return koreanName;
    }

    public void setKoreanName(String koreanName) {
        this.koreanName = koreanName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getSNS() {
        return SNS;
    }

    public void setSNS(String SNS) {
        this.SNS = SNS;
    }
}
