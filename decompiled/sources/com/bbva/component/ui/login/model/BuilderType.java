package com.bbva.component.ui.login.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LoginCredentialsState.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ui/login/model/BuilderType;", "", "CREATE", "UPDATE", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
public final class BuilderType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BuilderType[] $VALUES;
    public static final BuilderType CREATE;
    public static final BuilderType UPDATE;

    static {
        BuilderType builderType = new BuilderType("CREATE", 0);
        CREATE = builderType;
        BuilderType builderType2 = new BuilderType("UPDATE", 1);
        UPDATE = builderType2;
        BuilderType[] builderTypeArr = {builderType, builderType2};
        $VALUES = builderTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(builderTypeArr);
    }

    public BuilderType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<BuilderType> getEntries() {
        return $ENTRIES;
    }

    public static BuilderType valueOf(String str) {
        return (BuilderType) Enum.valueOf(BuilderType.class, str);
    }

    public static BuilderType[] values() {
        return (BuilderType[]) $VALUES.clone();
    }
}
