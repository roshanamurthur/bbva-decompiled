package androidx.compose.foundation.layout;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/SizeMode;", "", "Wrap", "Expand", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
public final class SizeMode {
    private static final /* synthetic */ SizeMode[] $VALUES;
    public static final SizeMode Expand;
    public static final SizeMode Wrap;

    static {
        SizeMode sizeMode = new SizeMode("Wrap", 0);
        Wrap = sizeMode;
        SizeMode sizeMode2 = new SizeMode("Expand", 1);
        Expand = sizeMode2;
        $VALUES = new SizeMode[]{sizeMode, sizeMode2};
    }

    public SizeMode() {
        throw null;
    }

    public static SizeMode valueOf(String str) {
        return (SizeMode) Enum.valueOf(SizeMode.class, str);
    }

    public static SizeMode[] values() {
        return (SizeMode[]) $VALUES.clone();
    }
}
