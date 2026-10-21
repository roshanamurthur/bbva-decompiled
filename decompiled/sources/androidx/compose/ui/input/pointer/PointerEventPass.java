package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventPass;", "", "Initial", "Main", "Final", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class PointerEventPass {
    private static final /* synthetic */ PointerEventPass[] $VALUES;
    public static final PointerEventPass Final;
    public static final PointerEventPass Initial;
    public static final PointerEventPass Main;

    static {
        PointerEventPass pointerEventPass = new PointerEventPass("Initial", 0);
        Initial = pointerEventPass;
        PointerEventPass pointerEventPass2 = new PointerEventPass("Main", 1);
        Main = pointerEventPass2;
        PointerEventPass pointerEventPass3 = new PointerEventPass("Final", 2);
        Final = pointerEventPass3;
        $VALUES = new PointerEventPass[]{pointerEventPass, pointerEventPass2, pointerEventPass3};
    }

    public PointerEventPass() {
        throw null;
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) $VALUES.clone();
    }
}
