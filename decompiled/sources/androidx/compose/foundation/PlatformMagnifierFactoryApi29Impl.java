package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlatformMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "Landroidx/compose/foundation/MagnifierStyle;", "style", "Landroid/view/View;", "view", "Landroidx/compose/ui/unit/Density;", "density", "", "initialZoom", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "create", "", "a", "Z", "getCanUpdateZoom", "()Z", "canUpdateZoom", "<init>", "()V", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlatformMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,184:1\n152#2:185\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n152#1:185\n*E\n"})
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {

    @NotNull
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final boolean canUpdateZoom = true;

    /* JADX INFO: compiled from: PlatformMagnifier.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "magnifier", "Landroid/widget/Magnifier;", "(Landroid/widget/Magnifier;)V", "update", "", "sourceCenter", "Landroidx/compose/ui/geometry/Offset;", "magnifierCenter", "zoom", "", "update-Wko1d7g", "(JJF)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi(29)
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlatformMagnifierImpl(@NotNull Magnifier magnifier) {
            super(magnifier);
            Intrinsics.checkNotNullParameter(magnifier, "magnifier");
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: update-Wko1d7g */
        public void mo175updateWko1d7g(long sourceCenter, long magnifierCenter, float zoom) {
            if (!Float.isNaN(zoom)) {
                getMagnifier().setZoom(zoom);
            }
            if (OffsetKt.m2294isSpecifiedk4lQ0M(magnifierCenter)) {
                getMagnifier().show(Offset.m2275getXimpl(sourceCenter), Offset.m2276getYimpl(sourceCenter), Offset.m2275getXimpl(magnifierCenter), Offset.m2276getYimpl(magnifierCenter));
            } else {
                getMagnifier().show(Offset.m2275getXimpl(sourceCenter), Offset.m2276getYimpl(sourceCenter));
            }
        }
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    @NotNull
    public PlatformMagnifierImpl create(@NotNull MagnifierStyle style, @NotNull View view, @NotNull Density density, float initialZoom) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(density, "density");
        if (Intrinsics.areEqual(style, MagnifierStyle.INSTANCE.getTextDefault())) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long jMo408toSizeXkaWNTQ = density.mo408toSizeXkaWNTQ(style.getSize());
        float fMo415toPx0680j_4 = density.mo415toPx0680j_4(style.getCornerRadius());
        float fMo415toPx0680j_5 = density.mo415toPx0680j_4(style.getElevation());
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jMo408toSizeXkaWNTQ != Size.INSTANCE.m2352getUnspecifiedNHjbRc()) {
            builder.setSize(mk.c.roundToInt(Size.m2344getWidthimpl(jMo408toSizeXkaWNTQ)), mk.c.roundToInt(Size.m2341getHeightimpl(jMo408toSizeXkaWNTQ)));
        }
        if (!Float.isNaN(fMo415toPx0680j_4)) {
            builder.setCornerRadius(fMo415toPx0680j_4);
        }
        if (!Float.isNaN(fMo415toPx0680j_5)) {
            builder.setElevation(fMo415toPx0680j_5);
        }
        if (!Float.isNaN(initialZoom)) {
            builder.setInitialZoom(initialZoom);
        }
        builder.setClippingEnabled(style.getClippingEnabled());
        Magnifier magnifierBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(magnifierBuild, "Builder(view).run {\n    …    build()\n            }");
        return new PlatformMagnifierImpl(magnifierBuild);
    }
}
