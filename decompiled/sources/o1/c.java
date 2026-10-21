package o1;

import androidx.compose.ui.text.android.LayoutCompatKt;
import androidx.compose.ui.text.android.TextLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TextLayout f85242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f85243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f85244c;

    public c(@NotNull TextLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f85242a = layout;
        this.f85243b = -1;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public final float a(boolean z10, boolean z11, boolean z12, int i10) {
        boolean z13;
        int i11 = 1;
        TextLayout textLayout = this.f85242a;
        if (z10) {
            int lineForOffset = LayoutCompatKt.getLineForOffset(textLayout.getCom.bbva.androidtoolkit.utils.PluginUtils.IDENTIFIER_LAYOUT java.lang.String(), i10, z10);
            int lineStart = textLayout.getLineStart(lineForOffset);
            int lineEnd = textLayout.getLineEnd(lineForOffset);
            if (i10 == lineStart || i10 == lineEnd) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        int i12 = i10 * 4;
        if (!z12) {
            i11 = z13 ? 2 : 3;
        } else if (z13) {
            i11 = 0;
        }
        int i13 = i12 + i11;
        if (this.f85243b == i13) {
            return this.f85244c;
        }
        float primaryHorizontal = z12 ? textLayout.getPrimaryHorizontal(i10, z10) : textLayout.getSecondaryHorizontal(i10, z10);
        if (z11) {
            this.f85243b = i13;
            this.f85244c = primaryHorizontal;
        }
        return primaryHorizontal;
    }
}
