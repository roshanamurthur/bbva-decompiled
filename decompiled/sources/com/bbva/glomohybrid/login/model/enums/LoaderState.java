package com.bbva.glomohybrid.login.model.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LoaderState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/login/model/enums/LoaderState;", "", "SHOW", "NEXT", "HIDE", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class LoaderState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoaderState[] $VALUES;
    public static final LoaderState HIDE;
    public static final LoaderState NEXT;
    public static final LoaderState SHOW;

    static {
        LoaderState loaderState = new LoaderState("SHOW", 0);
        SHOW = loaderState;
        LoaderState loaderState2 = new LoaderState("NEXT", 1);
        NEXT = loaderState2;
        LoaderState loaderState3 = new LoaderState("HIDE", 2);
        HIDE = loaderState3;
        LoaderState[] loaderStateArr = {loaderState, loaderState2, loaderState3};
        $VALUES = loaderStateArr;
        $ENTRIES = EnumEntriesKt.enumEntries(loaderStateArr);
    }

    public LoaderState() {
        throw null;
    }

    @NotNull
    public static EnumEntries<LoaderState> getEntries() {
        return $ENTRIES;
    }

    public static LoaderState valueOf(String str) {
        return (LoaderState) Enum.valueOf(LoaderState.class, str);
    }

    public static LoaderState[] values() {
        return (LoaderState[]) $VALUES.clone();
    }
}
