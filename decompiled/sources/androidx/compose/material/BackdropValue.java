package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/BackdropValue;", "", "Concealed", "Revealed", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
public final class BackdropValue {
    private static final /* synthetic */ BackdropValue[] $VALUES;
    public static final BackdropValue Concealed;
    public static final BackdropValue Revealed;

    static {
        BackdropValue backdropValue = new BackdropValue("Concealed", 0);
        Concealed = backdropValue;
        BackdropValue backdropValue2 = new BackdropValue("Revealed", 1);
        Revealed = backdropValue2;
        $VALUES = new BackdropValue[]{backdropValue, backdropValue2};
    }

    public BackdropValue() {
        throw null;
    }

    public static BackdropValue valueOf(String str) {
        return (BackdropValue) Enum.valueOf(BackdropValue.class, str);
    }

    public static BackdropValue[] values() {
        return (BackdropValue[]) $VALUES.clone();
    }
}
