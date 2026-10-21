package androidx.compose.material;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/ScaffoldState;", "", "Landroidx/compose/material/DrawerState;", "a", "Landroidx/compose/material/DrawerState;", "getDrawerState", "()Landroidx/compose/material/DrawerState;", "drawerState", "Landroidx/compose/material/SnackbarHostState;", "b", "Landroidx/compose/material/SnackbarHostState;", "getSnackbarHostState", "()Landroidx/compose/material/SnackbarHostState;", "snackbarHostState", "<init>", "(Landroidx/compose/material/DrawerState;Landroidx/compose/material/SnackbarHostState;)V", "material_release"}, k = 1, mv = {1, 8, 0})
public final class ScaffoldState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DrawerState drawerState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SnackbarHostState snackbarHostState;

    public ScaffoldState(@NotNull DrawerState drawerState, @NotNull SnackbarHostState snackbarHostState) {
        Intrinsics.checkNotNullParameter(drawerState, "drawerState");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.drawerState = drawerState;
        this.snackbarHostState = snackbarHostState;
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
