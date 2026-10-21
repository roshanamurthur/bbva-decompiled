package net.ipsoft.amelia.sdk;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public interface IAmeliaUser {
    String getDefaultConversationDomainId();

    ArrayList<String> getDomainAuthorities();

    ArrayList<String> getDomainCodes();

    ArrayList<BaseDomain> getDomains();

    String getEmail();

    ArrayList<String> getGlobalAuthorities();

    String getName();

    String getUserId();

    boolean isAgent();

    boolean isAnonymous();
}
