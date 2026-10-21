package com.afollestad.materialdialogs;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: LayoutMode.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/afollestad/materialdialogs/LayoutMode;", "", "MATCH_PARENT", "WRAP_CONTENT", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class LayoutMode {
    private static final /* synthetic */ LayoutMode[] $VALUES;
    public static final LayoutMode MATCH_PARENT;
    public static final LayoutMode WRAP_CONTENT;

    static {
        LayoutMode layoutMode = new LayoutMode("MATCH_PARENT", 0);
        MATCH_PARENT = layoutMode;
        LayoutMode layoutMode2 = new LayoutMode("WRAP_CONTENT", 1);
        WRAP_CONTENT = layoutMode2;
        $VALUES = new LayoutMode[]{layoutMode, layoutMode2};
    }

    public LayoutMode() {
        throw null;
    }

    public static LayoutMode valueOf(String str) {
        return (LayoutMode) Enum.valueOf(LayoutMode.class, str);
    }

    public static LayoutMode[] values() {
        return (LayoutMode[]) $VALUES.clone();
    }
}
