package androidx.compose.ui.layout;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicMinMax;", "", "Min", "Max", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class IntrinsicMinMax {
    private static final /* synthetic */ IntrinsicMinMax[] $VALUES;
    public static final IntrinsicMinMax Max;
    public static final IntrinsicMinMax Min;

    static {
        IntrinsicMinMax intrinsicMinMax = new IntrinsicMinMax("Min", 0);
        Min = intrinsicMinMax;
        IntrinsicMinMax intrinsicMinMax2 = new IntrinsicMinMax("Max", 1);
        Max = intrinsicMinMax2;
        $VALUES = new IntrinsicMinMax[]{intrinsicMinMax, intrinsicMinMax2};
    }

    public IntrinsicMinMax() {
        throw null;
    }

    public static IntrinsicMinMax valueOf(String str) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) $VALUES.clone();
    }
}
