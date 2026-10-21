package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import java.util.LinkedHashMap;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/Typeface;", "fontResource", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/Typeface;", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFontResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,77:1\n76#2:78\n361#3,7:79\n*S KotlinDebug\n*F\n+ 1 FontResources.android.kt\nandroidx/compose/ui/res/FontResources_androidKt\n*L\n55#1:78\n69#1:79,7\n*E\n"})
public final class FontResources_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f17458a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("cacheLock")
    @NotNull
    public static final LinkedHashMap f17459b = new LinkedHashMap();

    @NotNull
    @Deprecated(level = DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    @Composable
    @ReadOnlyComposable
    public static final Typeface fontResource(@NotNull FontFamily fontFamily, @Nullable Composer composer, int i10) {
        Typeface typefaceTypeface$default;
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-190831095, i10, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        if ((fontFamily instanceof SystemFontFamily) || (fontFamily instanceof LoadedFontFamily)) {
            synchronized (f17458a) {
                try {
                    LinkedHashMap linkedHashMap = f17459b;
                    Object objTypeface$default = linkedHashMap.get(fontFamily);
                    if (objTypeface$default == null) {
                        objTypeface$default = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                        linkedHashMap.put(fontFamily, objTypeface$default);
                    }
                    typefaceTypeface$default = (Typeface) objTypeface$default;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            typefaceTypeface$default = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typefaceTypeface$default;
    }
}
