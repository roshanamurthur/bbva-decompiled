package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFe1cSDK extends AFe1fSDK {
    public AFe1cSDK() {
        this(null, null);
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afDebugLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afErrorLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFa1qSDK
    public final boolean afInfoLog() {
        return false;
    }

    public AFe1cSDK(@Nullable String str, @Nullable Boolean bool) {
        super(str, null, Boolean.FALSE, null, bool);
    }
}
