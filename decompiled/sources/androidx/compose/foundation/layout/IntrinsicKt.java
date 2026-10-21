package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x.a1;
import x.b1;
import x.c1;
import x.j1;
import x.k1;
import x.l1;
import x.m1;
import x.z0;

/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0007"}, d2 = {"height", "Landroidx/compose/ui/Modifier;", "intrinsicSize", "Landroidx/compose/foundation/layout/IntrinsicSize;", "requiredHeight", "requiredWidth", "width", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntrinsicKt {

    /* JADX INFO: compiled from: Intrinsic.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IntrinsicSize.values().length];
            try {
                iArr[IntrinsicSize.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IntrinsicSize.Max.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Stable
    @NotNull
    public static final Modifier height(@NotNull Modifier modifier, @NotNull IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i10 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i10 == 1) {
            return modifier.then(b1.f94312a);
        }
        if (i10 == 2) {
            return modifier.then(z0.f94475a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Stable
    @NotNull
    public static final Modifier requiredHeight(@NotNull Modifier modifier, @NotNull IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i10 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i10 == 1) {
            return modifier.then(l1.f94365a);
        }
        if (i10 == 2) {
            return modifier.then(j1.f94359a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Stable
    @NotNull
    public static final Modifier requiredWidth(@NotNull Modifier modifier, @NotNull IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i10 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i10 == 1) {
            return modifier.then(m1.f94372a);
        }
        if (i10 == 2) {
            return modifier.then(k1.f94361a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Stable
    @NotNull
    public static final Modifier width(@NotNull Modifier modifier, @NotNull IntrinsicSize intrinsicSize) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicSize, "intrinsicSize");
        int i10 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i10 == 1) {
            return modifier.then(c1.f94314a);
        }
        if (i10 == 2) {
            return modifier.then(a1.f94304a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
