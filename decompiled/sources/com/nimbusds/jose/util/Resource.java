package com.nimbusds.jose.util;

import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class Resource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62830b;

    public Resource(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("The resource content must not be null");
        }
        this.f62829a = str;
        this.f62830b = str2;
    }

    public String getContent() {
        return this.f62829a;
    }

    public String getContentType() {
        return this.f62830b;
    }
}
