package com.sun.mail.imap;

/* JADX INFO: loaded from: classes9.dex */
public class ACL implements Cloneable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String f65263p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Rights f65264q0;

    public ACL(String str) {
        this.f65263p0 = str;
        this.f65264q0 = new Rights();
    }

    public Object clone() throws CloneNotSupportedException {
        ACL acl = (ACL) super.clone();
        acl.f65264q0 = (Rights) this.f65264q0.clone();
        return acl;
    }

    public String getName() {
        return this.f65263p0;
    }

    public Rights getRights() {
        return this.f65264q0;
    }

    public void setRights(Rights rights) {
        this.f65264q0 = rights;
    }

    public ACL(String str, Rights rights) {
        this.f65263p0 = str;
        this.f65264q0 = rights;
    }
}
