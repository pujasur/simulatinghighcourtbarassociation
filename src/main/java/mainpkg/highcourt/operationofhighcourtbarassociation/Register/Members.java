package mainpkg.highcourt.operationofhighcourtbarassociation.Register;

import java.io.Serializable;

public class Members implements Serializable {
    int memberid;
    String name,contactinfo,membershipstatus;

    public Members(int memberid, String name, String contactinfo, String membershipstatus) {
        this.memberid = memberid;
        this.name = name;
        this.contactinfo = contactinfo;
        this.membershipstatus = membershipstatus;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }

    public String getMembershipstatus() {
        return membershipstatus;
    }

    public void setMembershipstatus(String membershipstatus) {
        this.membershipstatus = membershipstatus;
    }

    @Override
    public String toString() {
        return "Members{" +
                "memberid=" + memberid +
                ", name='" + name + '\'' +
                ", contactinfo='" + contactinfo + '\'' +
                ", membershipstatus='" + membershipstatus + '\'' +
                '}';
    }
}
