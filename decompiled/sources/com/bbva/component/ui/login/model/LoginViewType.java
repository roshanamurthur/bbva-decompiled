package com.bbva.component.ui.login.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LoginState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/component/ui/login/model/LoginViewType;", "", "CREDENTIALS", "REMEMBERED_USER", "BIOMETRICS", "RESET_PASSWORD", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final class LoginViewType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoginViewType[] $VALUES;
    public static final LoginViewType BIOMETRICS;
    public static final LoginViewType CREDENTIALS;
    public static final LoginViewType REMEMBERED_USER;
    public static final LoginViewType RESET_PASSWORD;

    static {
        LoginViewType loginViewType = new LoginViewType("CREDENTIALS", 0);
        CREDENTIALS = loginViewType;
        LoginViewType loginViewType2 = new LoginViewType("REMEMBERED_USER", 1);
        REMEMBERED_USER = loginViewType2;
        LoginViewType loginViewType3 = new LoginViewType("BIOMETRICS", 2);
        BIOMETRICS = loginViewType3;
        LoginViewType loginViewType4 = new LoginViewType("RESET_PASSWORD", 3);
        RESET_PASSWORD = loginViewType4;
        LoginViewType[] loginViewTypeArr = {loginViewType, loginViewType2, loginViewType3, loginViewType4};
        $VALUES = loginViewTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(loginViewTypeArr);
    }

    public LoginViewType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<LoginViewType> getEntries() {
        return $ENTRIES;
    }

    public static LoginViewType valueOf(String str) {
        return (LoginViewType) Enum.valueOf(LoginViewType.class, str);
    }

    public static LoginViewType[] values() {
        return (LoginViewType[]) $VALUES.clone();
    }
}
