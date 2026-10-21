package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ExperimentalTextApi;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B<\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\f\u001a\u00020\u000bø\u0001\u0001¢\u0006\u0004\b*\u0010+J1\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJG\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R)\u0010\f\u001a\u00020\u000b8WX\u0097\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b&\u0010\u0019\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "", "resId", "Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "style", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "copy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "copy-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/ResourceFont;", "", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getResId", "()I", "b", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "c", "getStyle-_-LCdwA", "d", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "e", "getLoadingStrategy-PKNRLFQ", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "<init>", "(ILandroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class ResourceFont implements Font {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int resId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontWeight weight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int style;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontVariation.Settings variationSettings;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int loadingStrategy;

    public ResourceFont(int i10, FontWeight weight, int i11, @ExperimentalTextApi FontVariation.Settings variationSettings, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        this.resId = i10;
        this.weight = weight;
        this.style = i11;
        this.variationSettings = variationSettings;
        this.loadingStrategy = i12;
    }

    /* JADX INFO: renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m4087copyF3nL8kk$default(ResourceFont resourceFont, int i10, FontWeight fontWeight, int i11, int i12, FontVariation.Settings settings, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = resourceFont.resId;
        }
        if ((i13 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i13 & 4) != 0) {
            i11 = resourceFont.getStyle();
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = resourceFont.getLoadingStrategy();
        }
        int i15 = i12;
        if ((i13 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        return resourceFont.m4090copyF3nL8kk(i10, fontWeight2, i14, i15, settings);
    }

    /* JADX INFO: renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m4088copyRetOiIg$default(ResourceFont resourceFont, int i10, FontWeight fontWeight, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = resourceFont.resId;
        }
        if ((i12 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i12 & 4) != 0) {
            i11 = resourceFont.getStyle();
        }
        return resourceFont.m4091copyRetOiIg(i10, fontWeight, i11);
    }

    @ExperimentalTextApi
    @NotNull
    /* JADX INFO: renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m4090copyF3nL8kk(int resId, @NotNull FontWeight weight, int style, int loadingStrategy, @NotNull FontVariation.Settings variationSettings) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        return new ResourceFont(resId, weight, style, variationSettings, loadingStrategy, null);
    }

    @NotNull
    /* JADX INFO: renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m4091copyRetOiIg(int resId, @NotNull FontWeight weight, int style) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        return m4087copyF3nL8kk$default(this, resId, weight, style, getLoadingStrategy(), null, 16, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) other;
        return this.resId == resourceFont.resId && Intrinsics.areEqual(getWeight(), resourceFont.getWeight()) && FontStyle.m4062equalsimpl0(getStyle(), resourceFont.getStyle()) && Intrinsics.areEqual(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m4049equalsimpl0(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    @Override // androidx.compose.ui.text.font.Font
    @ExperimentalTextApi
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    @ExperimentalTextApi
    @NotNull
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.variationSettings.hashCode() + ((FontLoadingStrategy.m4050hashCodeimpl(getLoadingStrategy()) + ((FontStyle.m4063hashCodeimpl(getStyle()) + ((getWeight().hashCode() + (this.resId * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4064toStringimpl(getStyle())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m4051toStringimpl(getLoadingStrategy())) + RootService.CLOSE_BRACKET;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResourceFont(int i10, FontWeight fontWeight, int i11, FontVariation.Settings settings, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        FontWeight normal = (i13 & 2) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight;
        int iM4067getNormal_LCdwA = (i13 & 4) != 0 ? FontStyle.INSTANCE.m4067getNormal_LCdwA() : i11;
        this(i10, normal, iM4067getNormal_LCdwA, (i13 & 8) != 0 ? FontVariation.INSTANCE.m4082Settings6EWAqTQ(normal, iM4067getNormal_LCdwA, new FontVariation.Setting[0]) : settings, (i13 & 16) != 0 ? FontLoadingStrategy.INSTANCE.m4053getAsyncPKNRLFQ() : i12, null);
    }

    @ExperimentalTextApi
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m4089getLoadingStrategyPKNRLFQ$annotations() {
    }
}
