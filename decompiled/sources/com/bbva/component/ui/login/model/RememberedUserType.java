package com.bbva.component.ui.login.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: RememberedUserState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/login/model/RememberedUserType;", "", "CREDENTIALS", "BIOMETRICS", "ACCESSING_BIOMETRIC", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final class RememberedUserType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RememberedUserType[] $VALUES;
    public static final RememberedUserType ACCESSING_BIOMETRIC;
    public static final RememberedUserType BIOMETRICS;
    public static final RememberedUserType CREDENTIALS;

    static {
        RememberedUserType rememberedUserType = new RememberedUserType("CREDENTIALS", 0);
        CREDENTIALS = rememberedUserType;
        RememberedUserType rememberedUserType2 = new RememberedUserType("BIOMETRICS", 1);
        BIOMETRICS = rememberedUserType2;
        RememberedUserType rememberedUserType3 = new RememberedUserType("ACCESSING_BIOMETRIC", 2);
        ACCESSING_BIOMETRIC = rememberedUserType3;
        RememberedUserType[] rememberedUserTypeArr = {rememberedUserType, rememberedUserType2, rememberedUserType3};
        $VALUES = rememberedUserTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(rememberedUserTypeArr);
    }

    public RememberedUserType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<RememberedUserType> getEntries() {
        return $ENTRIES;
    }

    public static RememberedUserType valueOf(String str) {
        return (RememberedUserType) Enum.valueOf(RememberedUserType.class, str);
    }

    public static RememberedUserType[] values() {
        return (RememberedUserType[]) $VALUES.clone();
    }
}
