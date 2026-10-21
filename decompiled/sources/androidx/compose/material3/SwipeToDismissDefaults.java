package androidx.compose.material3;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SwipeToDismiss.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR=\u0010\r\u001a(\u0012\u0004\u0012\u00020\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/SwipeToDismissDefaults;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "Lkotlin/ExtensionFunctionType;", "a", "Lkotlin/jvm/functions/Function2;", "getFixedPositionalThreshold", "()Lkotlin/jvm/functions/Function2;", "FixedPositionalThreshold", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SwipeToDismissDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SwipeToDismissDefaults INSTANCE = new SwipeToDismissDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f11700a = a.f11701p0;

    /* JADX INFO: compiled from: SwipeToDismiss.kt */
    @SourceDebugExtension({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material3/SwipeToDismissDefaults$FixedPositionalThreshold$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,279:1\n154#2:280\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material3/SwipeToDismissDefaults$FixedPositionalThreshold$1\n*L\n276#1:280\n*E\n"})
    public static final class a extends Lambda implements Function2<Density, Float, Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f11701p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(Density density, Float f6) {
            Density density2 = density;
            f6.floatValue();
            Intrinsics.checkNotNullParameter(density2, "$this$null");
            return Float.valueOf(density2.mo415toPx0680j_4(Dp.m4389constructorimpl(56)));
        }
    }

    @NotNull
    public final Function2<Density, Float, Float> getFixedPositionalThreshold() {
        return f11700a;
    }
}
