package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ModalBottomSheet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "", "Hidden", "Expanded", "HalfExpanded", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
public final class ModalBottomSheetValue {
    private static final /* synthetic */ ModalBottomSheetValue[] $VALUES;
    public static final ModalBottomSheetValue Expanded;
    public static final ModalBottomSheetValue HalfExpanded;
    public static final ModalBottomSheetValue Hidden;

    static {
        ModalBottomSheetValue modalBottomSheetValue = new ModalBottomSheetValue("Hidden", 0);
        Hidden = modalBottomSheetValue;
        ModalBottomSheetValue modalBottomSheetValue2 = new ModalBottomSheetValue("Expanded", 1);
        Expanded = modalBottomSheetValue2;
        ModalBottomSheetValue modalBottomSheetValue3 = new ModalBottomSheetValue("HalfExpanded", 2);
        HalfExpanded = modalBottomSheetValue3;
        $VALUES = new ModalBottomSheetValue[]{modalBottomSheetValue, modalBottomSheetValue2, modalBottomSheetValue3};
    }

    public ModalBottomSheetValue() {
        throw null;
    }

    public static ModalBottomSheetValue valueOf(String str) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, str);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) $VALUES.clone();
    }
}
