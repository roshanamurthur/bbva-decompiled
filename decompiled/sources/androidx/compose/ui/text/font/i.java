package androidx.compose.ui.text.font;

import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PlatformTypefaces.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Lambda implements Function1<FontVariation.Setting, CharSequence> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Density f18044p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Density density) {
        super(1);
        this.f18044p0 = density;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(FontVariation.Setting setting) {
        FontVariation.Setting setting2 = setting;
        Intrinsics.checkNotNullParameter(setting2, "setting");
        return "'" + setting2.getAxisName() + "' " + setting2.toVariationValue(this.f18044p0);
    }
}
