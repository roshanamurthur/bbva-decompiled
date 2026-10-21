package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "", "TopLeft", "TopRight", "TopMiddle", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class HandleReferencePoint {
    private static final /* synthetic */ HandleReferencePoint[] $VALUES;
    public static final HandleReferencePoint TopLeft;
    public static final HandleReferencePoint TopMiddle;
    public static final HandleReferencePoint TopRight;

    static {
        HandleReferencePoint handleReferencePoint = new HandleReferencePoint("TopLeft", 0);
        TopLeft = handleReferencePoint;
        HandleReferencePoint handleReferencePoint2 = new HandleReferencePoint("TopRight", 1);
        TopRight = handleReferencePoint2;
        HandleReferencePoint handleReferencePoint3 = new HandleReferencePoint("TopMiddle", 2);
        TopMiddle = handleReferencePoint3;
        $VALUES = new HandleReferencePoint[]{handleReferencePoint, handleReferencePoint2, handleReferencePoint3};
    }

    public HandleReferencePoint() {
        throw null;
    }

    public static HandleReferencePoint valueOf(String str) {
        return (HandleReferencePoint) Enum.valueOf(HandleReferencePoint.class, str);
    }

    public static HandleReferencePoint[] values() {
        return (HandleReferencePoint[]) $VALUES.clone();
    }
}
