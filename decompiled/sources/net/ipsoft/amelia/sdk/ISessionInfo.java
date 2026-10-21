package net.ipsoft.amelia.sdk;

/* JADX INFO: loaded from: classes12.dex */
public interface ISessionInfo {
    String getSESSION();

    IAmeliaUser getUser();

    boolean isAnonymousAllowed();

    boolean isLoggedIn();
}
