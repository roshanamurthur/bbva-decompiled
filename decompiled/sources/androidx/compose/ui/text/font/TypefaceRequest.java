package androidx.compose.ui.text.font;

import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FontFamilyResolver.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001B6\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001ø\u0001\u0002¢\u0006\u0004\b.\u0010/J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0019\u0010\t\u001a\u00020\u0006HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\nHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0001HÆ\u0003JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u0010\u001a\u00020\u00068\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\bR \u0010\u0011\u001a\u00020\n8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00060"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequest;", "", "Landroidx/compose/ui/text/font/FontFamily;", "component1", "Landroidx/compose/ui/text/font/FontWeight;", "component2", "Landroidx/compose/ui/text/font/FontStyle;", "component3-_-LCdwA", "()I", "component3", "Landroidx/compose/ui/text/font/FontSynthesis;", "component4-GVVA2EU", "component4", "component5", "fontFamily", "fontWeight", "fontStyle", "fontSynthesis", "resourceLoaderCacheKey", "copy-e1PVR60", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILjava/lang/Object;)Landroidx/compose/ui/text/font/TypefaceRequest;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "b", "Landroidx/compose/ui/text/font/FontWeight;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFontStyle-_-LCdwA", "d", "getFontSynthesis-GVVA2EU", "e", "Ljava/lang/Object;", "getResourceLoaderCacheKey", "()Ljava/lang/Object;", "<init>", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TypefaceRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final FontFamily fontFamily;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontWeight fontWeight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int fontStyle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int fontSynthesis;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object resourceLoaderCacheKey;

    public TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i10, int i11, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.fontFamily = fontFamily;
        this.fontWeight = fontWeight;
        this.fontStyle = i10;
        this.fontSynthesis = i11;
        this.resourceLoaderCacheKey = obj;
    }

    /* JADX INFO: renamed from: copy-e1PVR60$default, reason: not valid java name */
    public static /* synthetic */ TypefaceRequest m4092copye1PVR60$default(TypefaceRequest typefaceRequest, FontFamily fontFamily, FontWeight fontWeight, int i10, int i11, Object obj, int i12, Object obj2) {
        if ((i12 & 1) != 0) {
            fontFamily = typefaceRequest.fontFamily;
        }
        if ((i12 & 2) != 0) {
            fontWeight = typefaceRequest.fontWeight;
        }
        FontWeight fontWeight2 = fontWeight;
        if ((i12 & 4) != 0) {
            i10 = typefaceRequest.fontStyle;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = typefaceRequest.fontSynthesis;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            obj = typefaceRequest.resourceLoaderCacheKey;
        }
        return typefaceRequest.m4095copye1PVR60(fontFamily, fontWeight2, i13, i14, obj);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: component3-_-LCdwA, reason: not valid java name and from getter */
    public final int getFontStyle() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: component4-GVVA2EU, reason: not valid java name and from getter */
    public final int getFontSynthesis() {
        return this.fontSynthesis;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-e1PVR60, reason: not valid java name */
    public final TypefaceRequest m4095copye1PVR60(@Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int fontStyle, int fontSynthesis, @Nullable Object resourceLoaderCacheKey) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return new TypefaceRequest(fontFamily, fontWeight, fontStyle, fontSynthesis, resourceLoaderCacheKey, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) other;
        return Intrinsics.areEqual(this.fontFamily, typefaceRequest.fontFamily) && Intrinsics.areEqual(this.fontWeight, typefaceRequest.fontWeight) && FontStyle.m4062equalsimpl0(this.fontStyle, typefaceRequest.fontStyle) && FontSynthesis.m4071equalsimpl0(this.fontSynthesis, typefaceRequest.fontSynthesis) && Intrinsics.areEqual(this.resourceLoaderCacheKey, typefaceRequest.resourceLoaderCacheKey);
    }

    @Nullable
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: getFontStyle-_-LCdwA, reason: not valid java name */
    public final int m4096getFontStyle_LCdwA() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: getFontSynthesis-GVVA2EU, reason: not valid java name */
    public final int m4097getFontSynthesisGVVA2EU() {
        return this.fontSynthesis;
    }

    @NotNull
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    public final Object getResourceLoaderCacheKey() {
        return this.resourceLoaderCacheKey;
    }

    public int hashCode() {
        FontFamily fontFamily = this.fontFamily;
        int iM4072hashCodeimpl = (FontSynthesis.m4072hashCodeimpl(this.fontSynthesis) + ((FontStyle.m4063hashCodeimpl(this.fontStyle) + ((this.fontWeight.hashCode() + ((fontFamily == null ? 0 : fontFamily.hashCode()) * 31)) * 31)) * 31)) * 31;
        Object obj = this.resourceLoaderCacheKey;
        return iM4072hashCodeimpl + (obj != null ? obj.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.fontFamily);
        sb2.append(", fontWeight=");
        sb2.append(this.fontWeight);
        sb2.append(", fontStyle=");
        sb2.append((Object) FontStyle.m4064toStringimpl(this.fontStyle));
        sb2.append(", fontSynthesis=");
        sb2.append((Object) FontSynthesis.m4075toStringimpl(this.fontSynthesis));
        sb2.append(", resourceLoaderCacheKey=");
        return v.d(sb2, this.resourceLoaderCacheKey, RootService.CLOSE_BRACKET);
    }
}
