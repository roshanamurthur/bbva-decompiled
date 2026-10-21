package androidx.compose.ui.text.font;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceFontFamilyNameFont.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AndroidFont {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f18037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final FontWeight f18038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f18039f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String familyName, FontWeight weight, int i10, FontVariation.Settings variationSettings) {
        super(FontLoadingStrategy.INSTANCE.m4055getOptionalLocalPKNRLFQ(), e.f18042a, variationSettings, null);
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        Intrinsics.checkNotNullParameter(weight, "weight");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        this.f18037d = familyName;
        this.f18038e = weight;
        this.f18039f = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!DeviceFontFamilyName.m4032equalsimpl0(this.f18037d, bVar.f18037d)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f18038e, bVar.f18038e)) {
            return FontStyle.m4062equalsimpl0(this.f18039f, bVar.f18039f) && Intrinsics.areEqual(getVariationSettings(), bVar.getVariationSettings());
        }
        return false;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA */
    public final int getStyle() {
        return this.f18039f;
    }

    @Override // androidx.compose.ui.text.font.Font
    @NotNull
    public final FontWeight getWeight() {
        return this.f18038e;
    }

    public final int hashCode() {
        return getVariationSettings().hashCode() + ((FontStyle.m4063hashCodeimpl(this.f18039f) + ((this.f18038e.hashCode() + (DeviceFontFamilyName.m4033hashCodeimpl(this.f18037d) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Font(familyName=\"" + ((Object) DeviceFontFamilyName.m4034toStringimpl(this.f18037d)) + "\", weight=" + this.f18038e + ", style=" + ((Object) FontStyle.m4064toStringimpl(this.f18039f)) + RootService.CLOSE_BRACKET;
    }
}
