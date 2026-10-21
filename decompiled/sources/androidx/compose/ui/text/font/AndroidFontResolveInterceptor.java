package androidx.compose.ui.text.font;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidFontResolveInterceptor.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "interceptFontWeight", "", "fontWeightAdjustment", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "<init>", "(I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17894a;

    public AndroidFontResolveInterceptor(int i10) {
        this.f17894a = i10;
    }

    public static /* synthetic */ AndroidFontResolveInterceptor copy$default(AndroidFontResolveInterceptor androidFontResolveInterceptor, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = androidFontResolveInterceptor.f17894a;
        }
        return androidFontResolveInterceptor.copy(i10);
    }

    @NotNull
    public final AndroidFontResolveInterceptor copy(int fontWeightAdjustment) {
        return new AndroidFontResolveInterceptor(fontWeightAdjustment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AndroidFontResolveInterceptor) && this.f17894a == ((AndroidFontResolveInterceptor) other).f17894a;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getF17894a() {
        return this.f17894a;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public final /* synthetic */ FontFamily interceptFontFamily(FontFamily fontFamily) {
        return p1.e.a(this, fontFamily);
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    /* JADX INFO: renamed from: interceptFontStyle-T2F_aPo, reason: not valid java name */
    public final /* synthetic */ int mo4016interceptFontStyleT2F_aPo(int i10) {
        return p1.e.b(this, i10);
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    /* JADX INFO: renamed from: interceptFontSynthesis-Mscr08Y, reason: not valid java name */
    public final /* synthetic */ int mo4017interceptFontSynthesisMscr08Y(int i10) {
        return p1.e.c(this, i10);
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    @NotNull
    public FontWeight interceptFontWeight(@NotNull FontWeight fontWeight) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int i10 = this.f17894a;
        return (i10 == 0 || i10 == Integer.MAX_VALUE) ? fontWeight : new FontWeight(kotlin.ranges.c.coerceIn(fontWeight.getWeight() + i10, 1, 1000));
    }

    @NotNull
    public String toString() {
        return androidx.activity.a.d(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f17894a, RootService.CLOSE_BRACKET);
    }
}
