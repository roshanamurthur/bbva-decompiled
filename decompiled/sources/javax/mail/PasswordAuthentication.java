package javax.mail;

/* JADX INFO: loaded from: classes12.dex */
public final class PasswordAuthentication {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78897b;

    public PasswordAuthentication(String str, String str2) {
        this.f78896a = str;
        this.f78897b = str2;
    }

    public String getPassword() {
        return this.f78897b;
    }

    public String getUserName() {
        return this.f78896a;
    }
}
