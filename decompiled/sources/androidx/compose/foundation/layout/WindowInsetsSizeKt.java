package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import x.m;
import x.n;

/* JADX INFO: compiled from: WindowInsetsSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"windowInsetsBottomHeight", "Landroidx/compose/ui/Modifier;", "insets", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsetsEndWidth", "windowInsetsStartWidth", "windowInsetsTopHeight", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWindowInsetsSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,213:1\n135#2:214\n135#2:215\n135#2:216\n135#2:217\n*S KotlinDebug\n*F\n+ 1 WindowInsetsSize.kt\nandroidx/compose/foundation/layout/WindowInsetsSizeKt\n*L\n50#1:214\n75#1:215\n98#1:216\n117#1:217\n*E\n"})
public final class WindowInsetsSizeKt {

    /* JADX INFO: compiled from: WindowInsetsSize.kt */
    public static final class a extends Lambda implements Function2<WindowInsets, Density, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f4464p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(WindowInsets windowInsets, Density density) {
            WindowInsets $receiver = windowInsets;
            Density it = density;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf($receiver.getBottom(it));
        }
    }

    /* JADX INFO: compiled from: WindowInsetsSize.kt */
    public static final class b extends Lambda implements Function3<WindowInsets, LayoutDirection, Density, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f4465p0 = new b(3);

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
            WindowInsets $receiver = windowInsets;
            LayoutDirection layoutDirection2 = layoutDirection;
            Density density2 = density;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            Intrinsics.checkNotNullParameter(density2, "density");
            return Integer.valueOf(layoutDirection2 == LayoutDirection.Rtl ? $receiver.getLeft(density2, layoutDirection2) : $receiver.getRight(density2, layoutDirection2));
        }
    }

    /* JADX INFO: compiled from: WindowInsetsSize.kt */
    public static final class c extends Lambda implements Function3<WindowInsets, LayoutDirection, Density, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f4466p0 = new c(3);

        @Override // kotlin.jvm.functions.Function3
        public final Integer invoke(WindowInsets windowInsets, LayoutDirection layoutDirection, Density density) {
            WindowInsets $receiver = windowInsets;
            LayoutDirection layoutDirection2 = layoutDirection;
            Density density2 = density;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
            Intrinsics.checkNotNullParameter(density2, "density");
            return Integer.valueOf(layoutDirection2 == LayoutDirection.Ltr ? $receiver.getLeft(density2, layoutDirection2) : $receiver.getRight(density2, layoutDirection2));
        }
    }

    /* JADX INFO: compiled from: WindowInsetsSize.kt */
    public static final class d extends Lambda implements Function2<WindowInsets, Density, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f4467p0 = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(WindowInsets windowInsets, Density density) {
            WindowInsets $receiver = windowInsets;
            Density it = density;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf($receiver.getTop(it));
        }
    }

    @Stable
    @NotNull
    public static final Modifier windowInsetsBottomHeight(@NotNull Modifier modifier, @NotNull final WindowInsets insets) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return modifier.then(new m(insets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "insetsBottomHeight").set("insets", insets);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), a.f4464p0));
    }

    @Stable
    @NotNull
    public static final Modifier windowInsetsEndWidth(@NotNull Modifier modifier, @NotNull final WindowInsets insets) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return modifier.then(new n(insets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "insetsEndWidth").set("insets", insets);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), b.f4465p0));
    }

    @Stable
    @NotNull
    public static final Modifier windowInsetsStartWidth(@NotNull Modifier modifier, @NotNull final WindowInsets insets) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return modifier.then(new n(insets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "insetsStartWidth").set("insets", insets);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), c.f4466p0));
    }

    @Stable
    @NotNull
    public static final Modifier windowInsetsTopHeight(@NotNull Modifier modifier, @NotNull final WindowInsets insets) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        return modifier.then(new m(insets, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.layout.WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "insetsTopHeight").set("insets", insets);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), d.f4467p0));
    }
}
