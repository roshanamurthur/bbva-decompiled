package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ColorVectorConverter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Lambda implements Function1<Color, AnimationVector4D> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final h f3232p0 = new h(1);

    @Override // kotlin.jvm.functions.Function1
    public final AnimationVector4D invoke(Color color) {
        long jM2505convertvNxB06k = Color.m2505convertvNxB06k(color.m2518unboximpl(), ColorSpaces.INSTANCE.getOklab());
        return new AnimationVector4D(Color.m2502component4impl(jM2505convertvNxB06k), Color.m2499component1impl(jM2505convertvNxB06k), Color.m2500component2impl(jM2505convertvNxB06k), Color.m2501component3impl(jM2505convertvNxB06k));
    }
}
