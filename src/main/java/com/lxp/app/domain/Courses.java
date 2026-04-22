package com.lxp.app.domain;

public class Courses {
    private Long coursesId;
    private String courseTitle;
    private String description;
    private String createdAt;
    private String updatedAt;
    private String deletedAt;
    private boolean isPublic;
    private boolean isDeleted;

    public Courses(Long coursesId, String courseTitle, String description, String createdAt,
            String updatedAt, String deletedAt, boolean isPublic, boolean isDeleted) {
        this.coursesId = coursesId;
        this.courseTitle = courseTitle;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.isPublic = isPublic;
        this.isDeleted = isDeleted;
    }

    public Long getCoursesId() {
        return coursesId;
    }

    public void setCoursesId(Long coursesId) {
        this.coursesId = coursesId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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
        return "Courses{" + "coursesId=" + coursesId + ", courseTitle='" + courseTitle + '\''
                + ", description='" + description + '\'' + ", createdAt='" + createdAt + '\''
                + ", updatedAt='" + updatedAt + '\'' + ", deletedAt='" + deletedAt + '\''
                + ", isPublic=" + isPublic + ", isDeleted=" + isDeleted + '}';
    }
}