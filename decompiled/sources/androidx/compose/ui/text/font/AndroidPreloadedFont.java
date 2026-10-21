package androidx.compose.ui.text.font;

import android.content.Context;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidPreloadedFont.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H ¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0015\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0001\u0003!\"#\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "Landroidx/compose/ui/text/font/AndroidFont;", "Landroid/content/Context;", "context", "Landroid/graphics/Typeface;", "doLoad$ui_text_release", "(Landroid/content/Context;)Landroid/graphics/Typeface;", "doLoad", "loadCached$ui_text_release", "loadCached", "Landroidx/compose/ui/text/font/FontWeight;", "d", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "e", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getStyle-_-LCdwA", "()I", "style", "g", "Landroid/graphics/Typeface;", "getTypeface$ui_text_release", "()Landroid/graphics/Typeface;", "setTypeface$ui_text_release", "(Landroid/graphics/Typeface;)V", "typeface", "", "getCacheKey", "()Ljava/lang/String;", "cacheKey", "Landroidx/compose/ui/text/font/AndroidAssetFont;", "Landroidx/compose/ui/text/font/AndroidFileDescriptorFont;", "Landroidx/compose/ui/text/font/AndroidFileFont;", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public abstract class AndroidPreloadedFont extends AndroidFont {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontWeight weight;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int style;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public android.graphics.Typeface typeface;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPreloadedFont(FontWeight weight, int i10, FontVariation.Settings variationSettings, DefaultConstructorMarker defaultConstructorMarker) {
        super(FontLoadingStrategy.INSTANCE.m4054getBlockingPKNRLFQ(), a.f18036a, variationSettings, null);
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        this.weight = weight;
        this.style = i10;
    }

    @Nullable
    public abstract android.graphics.Typeface doLoad$ui_text_release(@Nullable Context context);

    @Nullable
    public abstract String getCacheKey();

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: not valid java name and from getter */
    public final int getStyle() {
        return this.style;
    }

    @Nullable
    /* JADX INFO: renamed from: getTypeface$ui_text_release, reason: from getter */
    public final android.graphics.Typeface getTypeface() {
        return this.typeface;
    }

    @Override // androidx.compose.ui.text.font.Font
    @NotNull
    public final FontWeight getWeight() {
        return this.weight;
    }

    @Nullable
    public final android.graphics.Typeface loadCached$ui_text_release(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f17897f && this.typeface == null) {
            this.typeface = doLoad$ui_text_release(context);
        }
        this.f17897f = true;
        return this.typeface;
    }

    public final void setTypeface$ui_text_release(@Nullable android.graphics.Typeface typeface) {
        this.typeface = typeface;
    }
}
