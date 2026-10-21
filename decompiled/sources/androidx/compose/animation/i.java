package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ColorVectorConverter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Lambda implements Function1<AnimationVector4D, Color> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ColorSpace f3233p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ColorSpace colorSpace) {
        super(1);
        this.f3233p0 = colorSpace;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Color invoke(AnimationVector4D animationVector4D) {
        AnimationVector4D vector = animationVector4D;
        Intrinsics.checkNotNullParameter(vector, "vector");
        return Color.m2498boximpl(Color.m2505convertvNxB06k(ColorKt.Color(kotlin.ranges.c.coerceIn(vector.getV2(), 0.0f, 1.0f), kotlin.ranges.c.coerceIn(vector.getV3(), -0.5f, 0.5f), kotlin.ranges.c.coerceIn(vector.getV4(), -0.5f, 0.5f), kotlin.ranges.c.coerceIn(vector.getCom.bbva.glomoconfig.constants.ConfigConstantsKt.CUSTOMERS_API_VERSION java.lang.String(), 0.0f, 1.0f), ColorSpaces.INSTANCE.getOklab()), this.f3233p0));
    }
}
