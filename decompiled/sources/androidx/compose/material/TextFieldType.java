package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/TextFieldType;", "", "Filled", "Outlined", "material_release"}, k = 1, mv = {1, 8, 0})
public final class TextFieldType {
    private static final /* synthetic */ TextFieldType[] $VALUES;
    public static final TextFieldType Filled;
    public static final TextFieldType Outlined;

    static {
        TextFieldType textFieldType = new TextFieldType("Filled", 0);
        Filled = textFieldType;
        TextFieldType textFieldType2 = new TextFieldType("Outlined", 1);
        Outlined = textFieldType2;
        $VALUES = new TextFieldType[]{textFieldType, textFieldType2};
    }

    public TextFieldType() {
        throw null;
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) $VALUES.clone();
    }
}
