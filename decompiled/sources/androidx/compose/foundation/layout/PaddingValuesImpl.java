package androidx.compose.foundation.layout;

import androidx.camera.camera2.internal.compat.u;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Padding.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001B2\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010(\u001a\u00020\u0004ø\u0001\u0002¢\u0006\u0004\b)\u0010*J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\tJ\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016R)\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\tR)\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\tR)\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b!\u0010\u0018\u0012\u0004\b#\u0010\u001b\u001a\u0004\b\"\u0010\tR)\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b%\u0010\u0018\u0012\u0004\b'\u0010\u001b\u001a\u0004\b&\u0010\t\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesImpl;", "Landroidx/compose/foundation/layout/PaddingValues;", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Dp;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateLeftPadding", "calculateTopPadding-D9Ej5fM", "()F", "calculateTopPadding", "calculateRightPadding-u2uoSUM", "calculateRightPadding", "calculateBottomPadding-D9Ej5fM", "calculateBottomPadding", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "a", "F", "getStart-D9Ej5fM", "getStart-D9Ej5fM$annotations", "()V", EventDataKeys.Lifecycle.LIFECYCLE_START, "b", "getTop-D9Ej5fM", "getTop-D9Ej5fM$annotations", "top", "c", "getEnd-D9Ej5fM", "getEnd-D9Ej5fM$annotations", "end", "d", "getBottom-D9Ej5fM", "getBottom-D9Ej5fM$annotations", "bottom", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,467:1\n154#2:468\n154#2:469\n154#2:470\n154#2:471\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesImpl\n*L\n294#1:468\n296#1:469\n298#1:470\n300#1:471\n*E\n"})
public final class PaddingValuesImpl implements PaddingValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float end;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float bottom;

    public PaddingValuesImpl(float f6, float f10, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this.start = f6;
        this.top = f10;
        this.end = f11;
        this.bottom = f12;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateBottomPadding-D9Ej5fM, reason: from getter */
    public float getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateLeftPadding-u2uoSUM */
    public float mo302calculateLeftPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.start : this.end;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateRightPadding-u2uoSUM */
    public float mo303calculateRightPaddingu2uoSUM(@NotNull LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return layoutDirection == LayoutDirection.Ltr ? this.end : this.start;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* JADX INFO: renamed from: calculateTopPadding-D9Ej5fM, reason: from getter */
    public float getTop() {
        return this.top;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof PaddingValuesImpl)) {
            return false;
        }
        PaddingValuesImpl paddingValuesImpl = (PaddingValuesImpl) other;
        return Dp.m4394equalsimpl0(this.start, paddingValuesImpl.start) && Dp.m4394equalsimpl0(this.top, paddingValuesImpl.top) && Dp.m4394equalsimpl0(this.end, paddingValuesImpl.end) && Dp.m4394equalsimpl0(this.bottom, paddingValuesImpl.bottom);
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m309getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getEnd-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: getStart-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m312getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return Dp.m4395hashCodeimpl(this.bottom) + u.a(this.end, u.a(this.top, Dp.m4395hashCodeimpl(this.start) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "PaddingValues(start=" + ((Object) Dp.m4400toStringimpl(this.start)) + ", top=" + ((Object) Dp.m4400toStringimpl(this.top)) + ", end=" + ((Object) Dp.m4400toStringimpl(this.end)) + ", bottom=" + ((Object) Dp.m4400toStringimpl(this.bottom)) + RootService.CLOSE_BRACKET;
    }

    public /* synthetic */ PaddingValuesImpl(float f6, float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Dp.m4389constructorimpl(0) : f6, (i10 & 2) != 0 ? Dp.m4389constructorimpl(0) : f10, (i10 & 4) != 0 ? Dp.m4389constructorimpl(0) : f11, (i10 & 8) != 0 ? Dp.m4389constructorimpl(0) : f12, null);
    }

    @Stable
    /* JADX INFO: renamed from: getBottom-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m305getBottomD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getEnd-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m306getEndD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getStart-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m307getStartD9Ej5fM$annotations() {
    }

    @Stable
    /* JADX INFO: renamed from: getTop-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m308getTopD9Ej5fM$annotations() {
    }
}
