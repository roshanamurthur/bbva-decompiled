package u1;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.style.TextForegroundStyle;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextForegroundStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,148:1\n646#2:149\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n94#1:149\n*E\n"})
public final class b implements TextForegroundStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93717a;

    public b(long j10) {
        this.f93717a = j10;
        if (j10 == Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Color.m2509equalsimpl0(this.f93717a, ((b) obj).f93717a);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    public final float getAlpha() {
        return Color.m2510getAlphaimpl(this.f93717a);
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    @Nullable
    public final Brush getBrush() {
        return null;
    }

    @Override // androidx.compose.ui.text.style.TextForegroundStyle
    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public final long mo4315getColor0d7_KjU() {
        return this.f93717a;
    }

    public final int hashCode() {
        return Color.m2515hashCodeimpl(this.f93717a);
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
        return "ColorStyle(value=" + ((Object) Color.m2516toStringimpl(this.f93717a)) + RootService.CLOSE_BRACKET;
    }
}
