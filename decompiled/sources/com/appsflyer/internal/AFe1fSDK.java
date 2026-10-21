package com.appsflyer.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AFe1fSDK extends AFa1qSDK {
    private final boolean AFLogger$LogLevel;
    public boolean afWarnLog;
    private final boolean getLevel;

    public AFe1fSDK() {
        this(null, null, null, null, null);
    }

    public final boolean AFVersionDeclaration() {
        return this.getLevel;
    }

    public final boolean afWarnLog() {
        return this.afWarnLog;
    }

    public final boolean getLevel() {
        return this.AFLogger$LogLevel;
    }

    public AFe1fSDK(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false));
        this.getLevel = bool != null ? bool.booleanValue() : true;
        this.AFLogger$LogLevel = bool2 != null ? bool2.booleanValue() : true;
    }
}
