package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/AppBarDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getTopAppBarElevation-D9Ej5fM", "()F", "TopAppBarElevation", "b", "getBottomAppBarElevation-D9Ej5fM", "BottomAppBarElevation", "Landroidx/compose/foundation/layout/PaddingValues;", "c", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ContentPadding", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,547:1\n154#2:548\n154#2:549\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n*L\n250#1:548\n255#1:549\n*E\n"})
public final class AppBarDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final AppBarDefaults INSTANCE = new AppBarDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float TopAppBarElevation = Dp.m4389constructorimpl(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float BottomAppBarElevation = Dp.m4389constructorimpl(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PaddingValues ContentPadding = PaddingKt.m293PaddingValuesa9UjIt4$default(AppBarKt.f6674b, 0.0f, AppBarKt.f6674b, 0.0f, 10, null);

    /* JADX INFO: renamed from: getBottomAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m657getBottomAppBarElevationD9Ej5fM() {
        return BottomAppBarElevation;
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* JADX INFO: renamed from: getTopAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m658getTopAppBarElevationD9Ej5fM() {
        return TopAppBarElevation;
    }
}
