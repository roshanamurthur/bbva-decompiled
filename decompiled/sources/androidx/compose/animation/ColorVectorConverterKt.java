package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorVectorConverter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"?\u0010\u000b\u001a)\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0001*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Lkotlin/ParameterName;", "name", "colorSpace", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "getVectorConverter", "(Landroidx/compose/ui/graphics/Color$Companion;)Lkotlin/jvm/functions/Function1;", "VectorConverter", "animation_release"}, k = 2, mv = {1, 8, 0})
public final class ColorVectorConverterKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f2706a = a.f2707p0;

    /* JADX INFO: compiled from: ColorVectorConverter.kt */
    public static final class a extends Lambda implements Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f2707p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final TwoWayConverter<Color, AnimationVector4D> invoke(ColorSpace colorSpace) {
            ColorSpace colorSpace2 = colorSpace;
            Intrinsics.checkNotNullParameter(colorSpace2, "colorSpace");
            return VectorConvertersKt.TwoWayConverter(h.f3232p0, new i(colorSpace2));
        }
    }

    @NotNull
    public static final Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> getVectorConverter(@NotNull Color.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        return f2706a;
    }
}
