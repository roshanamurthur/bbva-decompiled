package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/BottomSheetValue;", "", "Collapsed", "Expanded", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
public final class BottomSheetValue {
    private static final /* synthetic */ BottomSheetValue[] $VALUES;
    public static final BottomSheetValue Collapsed;
    public static final BottomSheetValue Expanded;

    static {
        BottomSheetValue bottomSheetValue = new BottomSheetValue("Collapsed", 0);
        Collapsed = bottomSheetValue;
        BottomSheetValue bottomSheetValue2 = new BottomSheetValue("Expanded", 1);
        Expanded = bottomSheetValue2;
        $VALUES = new BottomSheetValue[]{bottomSheetValue, bottomSheetValue2};
    }

    public BottomSheetValue() {
        throw null;
    }

    public static BottomSheetValue valueOf(String str) {
        return (BottomSheetValue) Enum.valueOf(BottomSheetValue.class, str);
    }

    public static BottomSheetValue[] values() {
        return (BottomSheetValue[]) $VALUES.clone();
    }
}
