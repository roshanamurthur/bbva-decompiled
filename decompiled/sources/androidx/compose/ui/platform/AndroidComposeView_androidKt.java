package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/content/res/Configuration;", "Landroidx/compose/ui/unit/LayoutDirection;", "getLocaleLayoutDirection", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", "localeLayoutDirection", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,2051:1\n42#2,2:2052\n42#2,2:2054\n42#2,2:2056\n42#2,2:2058\n42#2,2:2060\n42#2,2:2062\n42#2,2:2064\n42#2,2:2066\n42#2,2:2068\n42#2,2:2070\n42#2,2:2072\n42#2,2:2074\n42#2,2:2076\n42#2,2:2078\n42#2,2:2080\n42#2,2:2082\n39#2:2084\n39#2:2085\n39#2:2086\n39#2:2087\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n1940#1:2052,2\n1941#1:2054,2\n1942#1:2056,2\n1943#1:2058,2\n1944#1:2060,2\n1945#1:2062,2\n1946#1:2064,2\n1947#1:2066,2\n1948#1:2068,2\n1949#1:2070,2\n1950#1:2072,2\n1951#1:2074,2\n1952#1:2076,2\n1953#1:2078,2\n1954#1:2080,2\n1955#1:2082,2\n1960#1:2084\n1961#1:2085\n1962#1:2086\n1963#1:2087\n*E\n"})
public final class AndroidComposeView_androidKt {
    public static final float a(float[] fArr, int i10, float[] fArr2, int i11) {
        int i12 = i10 * 4;
        return (fArr[i12 + 3] * fArr2[12 + i11]) + (fArr[i12 + 2] * fArr2[8 + i11]) + (fArr[i12 + 1] * fArr2[4 + i11]) + (fArr[i12] * fArr2[i11]);
    }

    public static final LayoutDirection access$layoutDirectionFromInt(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? LayoutDirection.Ltr : LayoutDirection.Rtl;
        }
        return LayoutDirection.Ltr;
    }

    /* JADX INFO: renamed from: access$preTransform-JiSxe2E, reason: not valid java name */
    public static final void m3785access$preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fA = a(fArr2, 0, fArr, 0);
        float fA2 = a(fArr2, 0, fArr, 1);
        float fA3 = a(fArr2, 0, fArr, 2);
        float fA4 = a(fArr2, 0, fArr, 3);
        float fA5 = a(fArr2, 1, fArr, 0);
        float fA6 = a(fArr2, 1, fArr, 1);
        float fA7 = a(fArr2, 1, fArr, 2);
        float fA8 = a(fArr2, 1, fArr, 3);
        float fA9 = a(fArr2, 2, fArr, 0);
        float fA10 = a(fArr2, 2, fArr, 1);
        float fA11 = a(fArr2, 2, fArr, 2);
        float fA12 = a(fArr2, 2, fArr, 3);
        float fA13 = a(fArr2, 3, fArr, 0);
        float fA14 = a(fArr2, 3, fArr, 1);
        float fA15 = a(fArr2, 3, fArr, 2);
        float fA16 = a(fArr2, 3, fArr, 3);
        fArr[0] = fA;
        fArr[1] = fA2;
        fArr[2] = fA3;
        fArr[3] = fA4;
        fArr[4] = fA5;
        fArr[5] = fA6;
        fArr[6] = fA7;
        fArr[7] = fA8;
        fArr[8] = fA9;
        fArr[9] = fA10;
        fArr[10] = fA11;
        fArr[11] = fA12;
        fArr[12] = fA13;
        fArr[13] = fA14;
        fArr[14] = fA15;
        fArr[15] = fA16;
    }

    @NotNull
    public static final LayoutDirection getLocaleLayoutDirection(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        int layoutDirection = configuration.getLayoutDirection();
        if (layoutDirection != 0) {
            return layoutDirection != 1 ? LayoutDirection.Ltr : LayoutDirection.Rtl;
        }
        return LayoutDirection.Ltr;
    }
}
