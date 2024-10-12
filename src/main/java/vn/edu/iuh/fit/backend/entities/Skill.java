package vn.edu.iuh.fit.backend.entities;

public class Skill {
    private int skillId;
    private String skill_name;
    private String description;
    private String field;
    public int getSkillId() {
        return skillId;
    }
    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }
    public String getSkill_name() {
        return skill_name;
    }
    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public Skill() {
    }
    public Skill(int skillId) {
        this.skillId = skillId;
    }
    public Skill(int skillId, String skill_name, String description, String field) {
        this.skillId = skillId;
        this.skill_name = skill_name;
        this.description = description;
        this.field = field;
    }
    @Override
    public String toString() {
        return "Skill{" +
                "skillId='" + skillId + '\'' +
                ", skill_name='" + skill_name + '\'' +
                ", description='" + description + '\'' +
                ", field='" + field + '\'' +
                '}';
    }
}
