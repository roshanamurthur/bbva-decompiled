package com.viergegroup.sdk.taptophone.vierge.models;

import java.time.LocalDateTime;

/* JADX INFO: loaded from: classes7.dex */
public class TokenInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f67976b;

    public TokenInfo(String str, LocalDateTime localDateTime) {
        this.f67975a = str;
        this.f67976b = localDateTime;
    }

    public String getToken() {
        return this.f67975a;
    }

    public LocalDateTime getTokenExpiryTime() {
        return this.f67976b;
    }
}
