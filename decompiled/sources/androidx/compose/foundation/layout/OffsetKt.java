package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006ø\u0001\u0000\u001a-\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a&\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006ø\u0001\u0000\u001a-\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"absoluteOffset", "Landroidx/compose/ui/Modifier;", TypedValues.CycleType.S_WAVE_OFFSET, "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "Lkotlin/ExtensionFunctionType;", "x", "Landroidx/compose/ui/unit/Dp;", "y", "absoluteOffset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "offset-VpY3zN4", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOffset.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,256:1\n154#2:257\n154#2:258\n*S KotlinDebug\n*F\n+ 1 Offset.kt\nandroidx/compose/foundation/layout/OffsetKt\n*L\n49#1:257\n75#1:258\n*E\n"})
public final class OffsetKt {

    /* JADX INFO: compiled from: Offset.kt */
    public static final class a extends Lambda implements Function1<InspectorInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f4292p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f4293q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6, float f10) {
            super(1);
            this.f4292p0 = f6;
            this.f4293q0 = f10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InspectorInfo inspectorInfo) {
            InspectorInfo inspectorInfo2 = inspectorInfo;
            androidx.activity.a.b(this.f4292p0, androidx.activity.a.c(inspectorInfo2, "$this$$receiver", "absoluteOffset"), "x", inspectorInfo2).set("y", Dp.m4387boximpl(this.f4293q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Offset.kt */
    public static final class b extends Lambda implements Function1<InspectorInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Density, IntOffset> f4294p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Density, IntOffset> function1) {
            super(1);
            this.f4294p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InspectorInfo inspectorInfo) {
            androidx.activity.a.c(inspectorInfo, "$this$$receiver", "absoluteOffset").set(TypedValues.CycleType.S_WAVE_OFFSET, this.f4294p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Offset.kt */
    public static final class c extends Lambda implements Function1<InspectorInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f4295p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f4296q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f6, float f10) {
            super(1);
            this.f4295p0 = f6;
            this.f4296q0 = f10;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InspectorInfo inspectorInfo) {
            InspectorInfo inspectorInfo2 = inspectorInfo;
            androidx.activity.a.b(this.f4295p0, androidx.activity.a.c(inspectorInfo2, "$this$$receiver", TypedValues.CycleType.S_WAVE_OFFSET), "x", inspectorInfo2).set("y", Dp.m4387boximpl(this.f4296q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Offset.kt */
    public static final class d extends Lambda implements Function1<InspectorInfo, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Density, IntOffset> f4297p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super Density, IntOffset> function1) {
            super(1);
            this.f4297p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InspectorInfo inspectorInfo) {
            androidx.activity.a.c(inspectorInfo, "$this$$receiver", TypedValues.CycleType.S_WAVE_OFFSET).set(TypedValues.CycleType.S_WAVE_OFFSET, this.f4297p0);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Modifier absoluteOffset(@NotNull Modifier modifier, @NotNull Function1<? super Density, IntOffset> offset) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        return modifier.then(new OffsetPxElement(offset, new b(offset), false));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: absoluteOffset-VpY3zN4, reason: not valid java name */
    public static final Modifier m267absoluteOffsetVpY3zN4(@NotNull Modifier absoluteOffset, float f6, float f10) {
        Intrinsics.checkNotNullParameter(absoluteOffset, "$this$absoluteOffset");
        return absoluteOffset.then(new OffsetElement(f6, f10, false, new a(f6, f10)));
    }

    /* JADX INFO: renamed from: absoluteOffset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m268absoluteOffsetVpY3zN4$default(Modifier modifier, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.m4389constructorimpl(0);
        }
        return m267absoluteOffsetVpY3zN4(modifier, f6, f10);
    }

    @NotNull
    public static final Modifier offset(@NotNull Modifier modifier, @NotNull Function1<? super Density, IntOffset> offset) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(offset, "offset");
        return modifier.then(new OffsetPxElement(offset, new d(offset), true));
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m269offsetVpY3zN4(@NotNull Modifier offset, float f6, float f10) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return offset.then(new OffsetElement(f6, f10, true, new c(f6, f10)));
    }

    /* JADX INFO: renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m270offsetVpY3zN4$default(Modifier modifier, float f6, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = Dp.m4389constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f10 = Dp.m4389constructorimpl(0);
        }
        return m269offsetVpY3zN4(modifier, f6, f10);
    }
}
