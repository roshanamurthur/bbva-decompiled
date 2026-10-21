package com.bbva.glomoconfig.login.type;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LoginType.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/glomoconfig/login/type/LoginType;", "", "JWT", "GLOBAL", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class LoginType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoginType[] $VALUES;
    public static final LoginType GLOBAL;
    public static final LoginType JWT;

    static {
        LoginType loginType = new LoginType("JWT", 0);
        JWT = loginType;
        LoginType loginType2 = new LoginType("GLOBAL", 1);
        GLOBAL = loginType2;
        LoginType[] loginTypeArr = {loginType, loginType2};
        $VALUES = loginTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(loginTypeArr);
    }

    public LoginType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<LoginType> getEntries() {
        return $ENTRIES;
    }

    public static LoginType valueOf(String str) {
        return (LoginType) Enum.valueOf(LoginType.class, str);
    }

    public static LoginType[] values() {
        return (LoginType[]) $VALUES.clone();
    }
}
