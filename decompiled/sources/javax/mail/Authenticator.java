package javax.mail;

import java.net.InetAddress;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InetAddress f78876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f78877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f78878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f78879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f78880e;

    public final String getDefaultUserName() {
        return this.f78880e;
    }

    public PasswordAuthentication getPasswordAuthentication() {
        return null;
    }

    public final int getRequestingPort() {
        return this.f78877b;
    }

    public final String getRequestingPrompt() {
        return this.f78879d;
    }

    public final String getRequestingProtocol() {
        return this.f78878c;
    }

    public final InetAddress getRequestingSite() {
        return this.f78876a;
    }
}
