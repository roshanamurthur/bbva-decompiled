package androidx.compose.material;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/material/BottomSheetScaffoldState;", "", "Landroidx/compose/material/DrawerState;", "a", "Landroidx/compose/material/DrawerState;", "getDrawerState", "()Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/BottomSheetState;", "b", "Landroidx/compose/material/BottomSheetState;", "getBottomSheetState", "()Landroidx/compose/material/BottomSheetState;", "bottomSheetState", "Landroidx/compose/material/SnackbarHostState;", "c", "Landroidx/compose/material/SnackbarHostState;", "getSnackbarHostState", "()Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "<init>", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/BottomSheetState;Landroidx/compose/material/SnackbarHostState;)V", "material_release"}, k = 1, mv = {1, 8, 0})
@ExperimentalMaterialApi
public final class BottomSheetScaffoldState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DrawerState drawerState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final BottomSheetState bottomSheetState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SnackbarHostState snackbarHostState;

    public BottomSheetScaffoldState(@NotNull DrawerState drawerState, @NotNull BottomSheetState bottomSheetState, @NotNull SnackbarHostState snackbarHostState) {
        Intrinsics.checkNotNullParameter(drawerState, "drawerState");
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.drawerState = drawerState;
        this.bottomSheetState = bottomSheetState;
        this.snackbarHostState = snackbarHostState;
    }

    @NotNull
    public final BottomSheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    @NotNull
    public final DrawerState getDrawerState() {
        return this.drawerState;
    }

    @NotNull
    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
