package androidx.compose.ui.text.android;

import android.text.Layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/android/TextAlignmentAdapter;", "", "", "value", "Landroid/text/Layout$Alignment;", "get", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class TextAlignmentAdapter {

    @NotNull
    public static final TextAlignmentAdapter INSTANCE = new TextAlignmentAdapter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Layout.Alignment f17801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Layout.Alignment f17802b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (Intrinsics.areEqual(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (Intrinsics.areEqual(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f17801a = alignment;
        f17802b = alignment2;
    }

    @NotNull
    public final Layout.Alignment get(int value) {
        if (value == 0) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (value == 1) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (value == 2) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (value != 3) {
            return value != 4 ? Layout.Alignment.ALIGN_NORMAL : f17802b;
        }
        return f17801a;
    }
}
