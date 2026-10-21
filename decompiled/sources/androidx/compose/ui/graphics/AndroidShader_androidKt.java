package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidShader.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\u001aO\u0010\u000e\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0013\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0016\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u001d\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0019\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0001\u001a!\u0010\"\u001a\u00020!2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\u001eH\u0001ø\u0001\u0001\u001a3\u0010%\u001a\u0004\u0018\u00010$2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\u001eH\u0001ø\u0001\u0001*\n\u0010&\"\u00020\n2\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "from", TypedValues.TransitionType.S_TO, "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualLinearGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ActualSweepGradientShader", "Landroidx/compose/ui/graphics/ImageBitmap;", AuthConstants.IMAGE, "tileModeX", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualImageShader", "", "countTransparentColors", "numTransparentColors", "", "makeTransparentColors", "stops", "", "makeTransparentStops", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,205:1\n69#2,6:206\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:206,6\n*E\n"})
public final class AndroidShader_androidKt {
    @NotNull
    /* JADX INFO: renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m2417ActualImageShaderF49vj9s(@NotNull ImageBitmap image, int i10, int i11) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(image), AndroidTileMode_androidKt.m2422toAndroidTileMode0vamqd0(i10), AndroidTileMode_androidKt.m2422toAndroidTileMode0vamqd0(i11));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m2418ActualLinearGradientShaderVjE6UOU(long j10, long j11, @NotNull List<Color> colors, @Nullable List<Float> list, int i10) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        a(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new android.graphics.LinearGradient(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10), Offset.m2275getXimpl(j11), Offset.m2276getYimpl(j11), makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors), AndroidTileMode_androidKt.m2422toAndroidTileMode0vamqd0(i10));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m2419ActualRadialGradientShader8uybcMk(long j10, float f6, @NotNull List<Color> colors, @Nullable List<Float> list, int i10) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        a(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new android.graphics.RadialGradient(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10), f6, makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors), AndroidTileMode_androidKt.m2422toAndroidTileMode0vamqd0(i10));
    }

    @NotNull
    /* JADX INFO: renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m2420ActualSweepGradientShader9KIMszo(long j10, @NotNull List<Color> colors, @Nullable List<Float> list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        a(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new android.graphics.SweepGradient(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10), makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors));
    }

    public static final void a(List<Color> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    @VisibleForTesting
    public static final int countTransparentColors(@NotNull List<Color> colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        for (int i11 = 1; i11 < lastIndex; i11++) {
            if (Color.m2510getAlphaimpl(colors.get(i11).m2518unboximpl()) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    @VisibleForTesting
    @NotNull
    public static final int[] makeTransparentColors(@NotNull List<Color> colors, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr = new int[size];
            while (i12 < size) {
                iArr[i12] = ColorKt.m2561toArgb8_81llA(colors.get(i12).m2518unboximpl());
                i12++;
            }
            return iArr;
        }
        int[] iArr2 = new int[colors.size() + i10];
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int size2 = colors.size();
        int i13 = 0;
        while (i12 < size2) {
            long jM2518unboximpl = colors.get(i12).m2518unboximpl();
            if (Color.m2510getAlphaimpl(jM2518unboximpl) == 0.0f) {
                if (i12 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = ColorKt.m2561toArgb8_81llA(Color.m2507copywmQWz5c$default(colors.get(1).m2518unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i12 == lastIndex) {
                    i11 = i13 + 1;
                    iArr2[i13] = ColorKt.m2561toArgb8_81llA(Color.m2507copywmQWz5c$default(colors.get(i12 - 1).m2518unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i14 = i13 + 1;
                    iArr2[i13] = ColorKt.m2561toArgb8_81llA(Color.m2507copywmQWz5c$default(colors.get(i12 - 1).m2518unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 += 2;
                    iArr2[i14] = ColorKt.m2561toArgb8_81llA(Color.m2507copywmQWz5c$default(colors.get(i12 + 1).m2518unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = ColorKt.m2561toArgb8_81llA(jM2518unboximpl);
                i13++;
            }
            i12++;
        }
        return iArr2;
    }

    @VisibleForTesting
    @Nullable
    public static final float[] makeTransparentStops(@Nullable List<Float> list, @NotNull List<Color> colors, int i10) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i10 == 0) {
            if (list != null) {
                return CollectionsKt___CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[colors.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int i11 = 1;
        for (int i12 = 1; i12 < lastIndex; i12++) {
            long jM2518unboximpl = colors.get(i12).m2518unboximpl();
            float fFloatValue = list != null ? list.get(i12).floatValue() : i12 / CollectionsKt__CollectionsKt.getLastIndex(colors);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (Color.m2510getAlphaimpl(jM2518unboximpl) == 0.0f) {
                i11 += 2;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(CollectionsKt__CollectionsKt.getLastIndex(colors)).floatValue() : 1.0f;
        return fArr;
    }
}
