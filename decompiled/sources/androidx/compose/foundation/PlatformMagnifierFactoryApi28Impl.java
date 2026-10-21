package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlatformMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl;", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "Landroidx/compose/foundation/MagnifierStyle;", "style", "Landroid/view/View;", "view", "Landroidx/compose/ui/unit/Density;", "density", "", "initialZoom", "Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "create", "", "canUpdateZoom", "Z", "getCanUpdateZoom", "()Z", "<init>", "()V", "PlatformMagnifierImpl", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {

    @NotNull
    public static final PlatformMagnifierFactoryApi28Impl INSTANCE = new PlatformMagnifierFactoryApi28Impl();

    /* JADX INFO: compiled from: PlatformMagnifier.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl;", "Landroidx/compose/foundation/PlatformMagnifier;", "", "updateContent", "Landroidx/compose/ui/geometry/Offset;", "sourceCenter", "magnifierCenter", "", "zoom", "update-Wko1d7g", "(JJF)V", "update", "dismiss", "Landroid/widget/Magnifier;", "a", "Landroid/widget/Magnifier;", "getMagnifier", "()Landroid/widget/Magnifier;", "magnifier", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "<init>", "(Landroid/widget/Magnifier;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @RequiresApi(28)
    public static class PlatformMagnifierImpl implements PlatformMagnifier {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Magnifier magnifier;

        public PlatformMagnifierImpl(@NotNull Magnifier magnifier) {
            Intrinsics.checkNotNullParameter(magnifier, "magnifier");
            this.magnifier = magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void dismiss() {
            this.magnifier.dismiss();
        }

        @NotNull
        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: getSize-YbymL2g */
        public long mo174getSizeYbymL2g() {
            Magnifier magnifier = this.magnifier;
            return IntSizeKt.IntSize(magnifier.getWidth(), magnifier.getHeight());
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* JADX INFO: renamed from: update-Wko1d7g */
        public void mo175updateWko1d7g(long sourceCenter, long magnifierCenter, float zoom) {
            this.magnifier.show(Offset.m2275getXimpl(sourceCenter), Offset.m2276getYimpl(sourceCenter));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void updateContent() {
            this.magnifier.update();
        }
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return false;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    @NotNull
    public PlatformMagnifierImpl create(@NotNull MagnifierStyle style, @NotNull View view, @NotNull Density density, float initialZoom) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(density, "density");
        return new PlatformMagnifierImpl(new Magnifier(view));
    }
}
