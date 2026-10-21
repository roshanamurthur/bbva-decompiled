package com.sun.mail.imap.protocol;

import com.sun.mail.iap.ParsingException;
import javax.mail.FetchProfile;

/* JADX INFO: loaded from: classes9.dex */
public abstract class FetchItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FetchProfile.Item f65424b;

    public FetchItem(String str, FetchProfile.Item item) {
        this.f65423a = str;
        this.f65424b = item;
    }

    public FetchProfile.Item getFetchProfileItem() {
        return this.f65424b;
    }

    public String getName() {
        return this.f65423a;
    }

    public abstract Object parseItem(FetchResponse fetchResponse) throws ParsingException;
}
