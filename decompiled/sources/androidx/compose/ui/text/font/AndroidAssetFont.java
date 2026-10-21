package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidPreloadedFont.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0010¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\bH\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "doLoad$ui_text_release", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "doLoad", "", "toString", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroid/content/res/AssetManager;", "h", "Landroid/content/res/AssetManager;", "getAssetManager", "()Landroid/content/res/AssetManager;", "assetManager", "i", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "path", "j", "getCacheKey", "cacheKey", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidAssetFont extends AndroidPreloadedFont {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AssetManager assetManager;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String path;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cacheKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidAssetFont(AssetManager assetManager, String path, FontWeight weight, int i10, FontVariation.Settings variationSettings, DefaultConstructorMarker defaultConstructorMarker) {
        super(weight, i10, variationSettings, null);
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        this.assetManager = assetManager;
        this.path = path;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
        this.cacheKey = "asset:" + path;
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @Nullable
    public android.graphics.Typeface doLoad$ui_text_release(@Nullable Context context) {
        int i10 = Build.VERSION.SDK_INT;
        String str = this.path;
        AssetManager assetManager = this.assetManager;
        return i10 >= 26 ? h.f18043a.a(assetManager, str, context, getVariationSettings()) : android.graphics.Typeface.createFromAsset(assetManager, str);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidAssetFont)) {
            return false;
        }
        AndroidAssetFont androidAssetFont = (AndroidAssetFont) other;
        return Intrinsics.areEqual(this.path, androidAssetFont.path) && Intrinsics.areEqual(getVariationSettings(), androidAssetFont.getVariationSettings());
    }

    @NotNull
    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @NotNull
    public String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return getVariationSettings().hashCode() + (this.path.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "Font(assetManager, path=" + this.path + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4064toStringimpl(getStyle())) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i10, FontVariation.Settings settings, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetManager, str, (i11 & 4) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight, (i11 & 8) != 0 ? FontStyle.INSTANCE.m4067getNormal_LCdwA() : i10, settings, null);
    }
}
