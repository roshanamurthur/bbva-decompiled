package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.t;
import androidx.appcompat.app.u;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidPreloadedFont.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 26)
@SourceDebugExtension({"SMAP\nAndroidPreloadedFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,234:1\n151#2,3:235\n33#2,4:238\n154#2,2:242\n38#2:244\n156#2:245\n37#3,2:246\n*S KotlinDebug\n*F\n+ 1 AndroidPreloadedFont.kt\nandroidx/compose/ui/text/font/TypefaceBuilderCompat\n*L\n229#1:235,3\n229#1:238,4\n229#1:242,2\n229#1:244\n229#1:245\n231#1:246,2\n*E\n"})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f18043a = new h();

    @ExperimentalTextApi
    @RequiresApi(26)
    public static FontVariationAxis[] d(FontVariation.Settings settings, Context context) {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else {
            if (settings.getNeedsDensity()) {
                throw new IllegalStateException("Required density, but not provided");
            }
            Density = DensityKt.Density(1.0f, 1.0f);
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i10 = 0; i10 < size; i10++) {
            FontVariation.Setting setting = settings2.get(i10);
            arrayList.add(new FontVariationAxis(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final android.graphics.Typeface a(@NotNull AssetManager assetManager, @NotNull String path, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return androidx.camera.camera2.internal.compat.b.d(assetManager, path).setFontVariationSettings(d(variationSettings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final android.graphics.Typeface b(@NotNull File file, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        return androidx.camera.camera2.internal.compat.a.c(file).setFontVariationSettings(d(variationSettings, context)).build();
    }

    @ExperimentalTextApi
    @DoNotInline
    @Nullable
    public final android.graphics.Typeface c(@NotNull ParcelFileDescriptor fileDescriptor, @Nullable Context context, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        if (context == null) {
            return null;
        }
        u.j();
        return t.d(fileDescriptor.getFileDescriptor()).setFontVariationSettings(d(variationSettings, context)).build();
    }
}
