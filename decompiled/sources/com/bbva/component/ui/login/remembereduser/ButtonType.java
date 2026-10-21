package com.bbva.component.ui.login.remembereduser;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: RememberedUserViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/login/remembereduser/ButtonType;", "", "LOGIN", "BIOMETRIC", "PASSWORD", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final class ButtonType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ButtonType[] $VALUES;
    public static final ButtonType BIOMETRIC;
    public static final ButtonType LOGIN;
    public static final ButtonType PASSWORD;

    static {
        ButtonType buttonType = new ButtonType("LOGIN", 0);
        LOGIN = buttonType;
        ButtonType buttonType2 = new ButtonType("BIOMETRIC", 1);
        BIOMETRIC = buttonType2;
        ButtonType buttonType3 = new ButtonType("PASSWORD", 2);
        PASSWORD = buttonType3;
        ButtonType[] buttonTypeArr = {buttonType, buttonType2, buttonType3};
        $VALUES = buttonTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(buttonTypeArr);
    }

    public ButtonType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<ButtonType> getEntries() {
        return $ENTRIES;
    }

    public static ButtonType valueOf(String str) {
        return (ButtonType) Enum.valueOf(ButtonType.class, str);
    }

    public static ButtonType[] values() {
        return (ButtonType[]) $VALUES.clone();
    }
}
