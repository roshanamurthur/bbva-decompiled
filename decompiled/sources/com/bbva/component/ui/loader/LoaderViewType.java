package com.bbva.component.ui.loader;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LoaderViewType.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ui/loader/LoaderViewType;", "", "Loader", "Spinner", "component-ui-loader_release"}, k = 1, mv = {1, 9, 0})
public final class LoaderViewType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoaderViewType[] $VALUES;
    public static final LoaderViewType Loader;
    public static final LoaderViewType Spinner;

    static {
        LoaderViewType loaderViewType = new LoaderViewType("Loader", 0);
        Loader = loaderViewType;
        LoaderViewType loaderViewType2 = new LoaderViewType("Spinner", 1);
        Spinner = loaderViewType2;
        LoaderViewType[] loaderViewTypeArr = {loaderViewType, loaderViewType2};
        $VALUES = loaderViewTypeArr;
        $ENTRIES = EnumEntriesKt.enumEntries(loaderViewTypeArr);
    }

    public LoaderViewType() {
        throw null;
    }

    @NotNull
    public static EnumEntries<LoaderViewType> getEntries() {
        return $ENTRIES;
    }

    public static LoaderViewType valueOf(String str) {
        return (LoaderViewType) Enum.valueOf(LoaderViewType.class, str);
    }

    public static LoaderViewType[] values() {
        return (LoaderViewType[]) $VALUES.clone();
    }
}
