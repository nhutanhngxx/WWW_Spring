package vn.edu.iuh.fit.backend.entities;

import java.util.Date;

public class Candidate {
    private int candidateId;
    private String lastName;
    private String middleName;
    private String firstName;
    private Date dob;
    private String email;
    private String address;
    private String phone;
    public int getCandidateId() {
        return candidateId;
    }
    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Candidate(int candidateId, String lastName, String middleName, String firstName, Date dob, String email, String address, String phone) {
        this.candidateId = candidateId;
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }
    public Candidate(String lastName, String middleName, String firstName, Date dob, String email, String address, String phone) {
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }
    public Candidate(int candidateId) {
        this.candidateId = candidateId;
    }
    public Candidate() {
    }
    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId='" + candidateId + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
