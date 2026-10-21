package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PainterResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/painter/Painter;", "painterResource", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,116:1\n76#2:117\n76#2:135\n25#3:118\n67#3,3:125\n66#3:128\n1097#4,6:119\n1097#4,6:129\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n58#1:117\n88#1:135\n60#1:118\n69#1:125,3\n69#1:128\n60#1:119,6\n69#1:129,6\n*E\n"})
public final class PainterResources_androidKt {
    public static final ImageBitmap access$loadImageBitmapResource(Resources resources, int i10) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.INSTANCE, resources, i10);
        } catch (Throwable unused) {
            throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
        }
    }

    @Composable
    @NotNull
    public static final Painter painterResource(@DrawableRes int i10, @Nullable Composer composer, int i11) throws XmlPullParserException {
        Painter bitmapPainter;
        composer.startReplaceableGroup(473971343);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(473971343, i11, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = Resources_androidKt.resources(composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new TypedValue();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        TypedValue typedValue = (TypedValue) objRememberedValue;
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !StringsKt__StringsKt.endsWith$default(charSequence, (CharSequence) ".xml", false, 2, (Object) null)) {
            composer.startReplaceableGroup(-738265172);
            Object objValueOf = Integer.valueOf(i10);
            Object theme = context.getTheme();
            composer.startReplaceableGroup(1618982084);
            boolean zChanged = composer.changed(objValueOf) | composer.changed(charSequence) | composer.changed(theme);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = access$loadImageBitmapResource(resources, i10);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            bitmapPainter = new BitmapPainter((ImageBitmap) objRememberedValue2, 0L, 0L, 6, null);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-738265327);
            Resources.Theme theme2 = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme2, "context.theme");
            int i12 = typedValue.changingConfigurations;
            int i13 = ((i11 << 6) & 896) | 72;
            composer.startReplaceableGroup(21855625);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(21855625, i13, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:81)");
            }
            ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
            ImageVectorCache.Key key = new ImageVectorCache.Key(theme2, i10);
            ImageVectorCache.ImageVectorEntry imageVectorEntryLoadVectorResourceInner = imageVectorCache.get(key);
            if (imageVectorEntryLoadVectorResourceInner == null) {
                XmlResourceParser xml = resources.getXml(i10);
                Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(id)");
                if (!Intrinsics.areEqual(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                    throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                }
                imageVectorEntryLoadVectorResourceInner = VectorResources_androidKt.loadVectorResourceInner(theme2, resources, xml, i12);
                imageVectorCache.set(key, imageVectorEntryLoadVectorResourceInner);
            }
            ImageVector imageVector = imageVectorEntryLoadVectorResourceInner.getImageVector();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            bitmapPainter = VectorPainterKt.rememberVectorPainter(imageVector, composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bitmapPainter;
    }
}
