package sg.edu.rp.c346.id20003116.kpoporganiser;

import java.io.Serializable;

public class GroupMember implements Serializable {
    private String groupName;
    private String koreanName;
    private String englishName;
    private String chineseName;

    public GroupMember(String groupName, String koreanName, String englishName, String chineseName) {
        this.koreanName = koreanName;
        this.englishName = englishName;
        this.chineseName = chineseName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getKoreanName() {
        return koreanName;
    }

    public void setKoreanName(String koreanName) {
        this.koreanName = koreanName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }
}