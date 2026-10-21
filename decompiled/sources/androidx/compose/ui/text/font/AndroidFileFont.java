package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidPreloadedFont.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B.\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "doLoad$ui_text_release", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "doLoad", "", "toString", "Ljava/io/File;", "h", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "file", "cacheKey", "Ljava/lang/String;", "getCacheKey", "()Ljava/lang/String;", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidFileFont extends AndroidPreloadedFont {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFileFont(File file, FontWeight weight, int i10, FontVariation.Settings variationSettings, DefaultConstructorMarker defaultConstructorMarker) {
        super(weight, i10, variationSettings, null);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        this.file = file;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @Nullable
    public android.graphics.Typeface doLoad$ui_text_release(@Nullable Context context) {
        int i10 = Build.VERSION.SDK_INT;
        File file = this.file;
        return i10 >= 26 ? h.f18043a.b(file, context, getVariationSettings()) : android.graphics.Typeface.createFromFile(file);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @Nullable
    public String getCacheKey() {
        return null;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public String toString() {
        return "Font(file=" + this.file + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4064toStringimpl(getStyle())) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i11 & 2) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight, (i11 & 4) != 0 ? FontStyle.INSTANCE.m4067getNormal_LCdwA() : i10, settings, null);
    }
}
