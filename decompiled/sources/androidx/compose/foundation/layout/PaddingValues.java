package androidx.compose.foundation.layout;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0018\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\r\u001a\u00020\u0003H&ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u0005ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues;", "", "calculateBottomPadding", "Landroidx/compose/ui/unit/Dp;", "calculateBottomPadding-D9Ej5fM", "()F", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "Absolute", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PaddingValues {
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM, reason: not valid java name */
    float getF4323d();

    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM, reason: not valid java name */
    float mo302calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection);

    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM, reason: not valid java name */
    float mo303calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection);

    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM, reason: not valid java name */
    float getF4321b();

    /* JADX INFO: compiled from: Padding.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\tJ\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValues$Absolute;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Dp;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateTopPadding-D9Ej5fM", "()F", "calculateTopPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateBottomPadding-D9Ej5fM", "calculateBottomPadding", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
    @Immutable
    @SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n*L\n207#1:468\n209#1:469\n211#1:470\n213#1:471\n*E\n"})
    public static final class Absolute implements PaddingValues {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f4320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f4321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f4322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f4323d;

        public Absolute(float f6, float f10, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
            this.f4320a = f6;
            this.f4321b = f10;
            this.f4322c = f11;
            this.f4323d = f12;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM, reason: from getter */
        public float getF4323d() {
            return this.f4323d;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
        public float mo302calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            return this.f4320a;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
        public float mo303calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            return this.f4322c;
        }

        @Override // androidx.compose.foundation.layout.PaddingValues
        /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM, reason: from getter */
        public float getF4321b() {
            return this.f4321b;
        }

        public boolean equals(@Nullable Object other) {
            if (!(other instanceof Absolute)) {
                return false;
            }
            Absolute absolute = (Absolute) other;
            return Dp.m4394equalsimpl0(this.f4320a, absolute.f4320a) && Dp.m4394equalsimpl0(this.f4321b, absolute.f4321b) && Dp.m4394equalsimpl0(this.f4322c, absolute.f4322c) && Dp.m4394equalsimpl0(this.f4323d, absolute.f4323d);
        }

        public int hashCode() {
            return Dp.m4395hashCodeimpl(this.f4323d) + u.a(this.f4322c, u.a(this.f4321b, Dp.m4395hashCodeimpl(this.f4320a) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) Dp.m4400toStringimpl(this.f4320a)) + ", top=" + ((Object) Dp.m4400toStringimpl(this.f4321b)) + ", right=" + ((Object) Dp.m4400toStringimpl(this.f4322c)) + ", bottom=" + ((Object) Dp.m4400toStringimpl(this.f4323d)) + RootService.CLOSE_BRACKET;
        }

        public /* synthetic */ Absolute(float f6, float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Dp.m4389constructorimpl(0) : f6, (i10 & 2) != 0 ? Dp.m4389constructorimpl(0) : f10, (i10 & 4) != 0 ? Dp.m4389constructorimpl(0) : f11, (i10 & 8) != 0 ? Dp.m4389constructorimpl(0) : f12, null);
        }
    }
}
