package com.noknok.android.uaf.framework.service;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class EligibleAuthenticators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Authenticator> f63582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f63583b;

    public EligibleAuthenticators(List<Authenticator> list, List<String> list2) {
        this.f63582a = list;
        this.f63583b = list2;
    }

    public List<Authenticator> getAuthenticators() {
        return this.f63582a;
    }

    public List<String> getDisallowedAAIDs() {
        return this.f63583b;
    }
}
