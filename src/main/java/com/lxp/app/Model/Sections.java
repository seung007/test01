package com.lxp.app.Model;

public class Sections {
    private Long sectionID;
    private final Long courseID;
    private String sectionTitle;
    private String createdAt;
    private String updateAt;
    private String deletedAt;
    private boolean isPublic;
    private boolean isDeleted;

    public Sections(Long sectionID, Long courseID, String sectionTitle, String createdAt,
            String updateAt, String deletedAt, boolean isPublic, boolean isDeleted) {
        this.sectionID = sectionID;
        this.courseID = courseID;
        this.sectionTitle = sectionTitle;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.deletedAt = deletedAt;
        this.isPublic = isPublic;
        this.isDeleted = isDeleted;
    }

    public Long getSectionID() {
        return sectionID;
    }

    public void setSectionID(Long sectionID) {
        this.sectionID = sectionID;
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "Sections{" + "sectionID=" + sectionID + ", courseID=" + courseID
                + ", sectionTitle='" + sectionTitle + '\'' + ", createdAt='" + createdAt + '\''
                + ", updateAt='" + updateAt + '\'' + ", deletedAt='" + deletedAt + '\''
                + ", isPublic=" + isPublic + ", isDeleted=" + isDeleted + '}';
    }
}

