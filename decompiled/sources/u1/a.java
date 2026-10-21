package u1;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.style.TextForegroundStyle;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a implements TextForegroundStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ShaderBrush f93715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f93716b;

    public a(@NotNull ShaderBrush value, float f6) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f93715a = value;
        this.f93716b = f6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f93715a, aVar.f93715a) && Float.compare(this.f93716b, aVar.f93716b) == 0;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final float getAlpha() {
        return this.f93716b;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    @NotNull
    public final Brush getBrush() {
        return this.f93715a;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public final long mo4315getColor0d7_KjU() {
        return Color.INSTANCE.m2544getUnspecified0d7_KjU();
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f93716b) + (this.f93715a.hashCode() * 31);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final /* synthetic */ TextForegroundStyle merge(TextForegroundStyle textForegroundStyle) {
        return androidx.compose.ui.text.style.a.a(this, textForegroundStyle);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final /* synthetic */ TextForegroundStyle takeOrElse(Function0 function0) {
        return androidx.compose.ui.text.style.a.b(this, function0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f93715a);
        sb2.append(", alpha=");
        return u.i(sb2, this.f93716b, RootService.CLOSE_BRACKET);
    }
}
