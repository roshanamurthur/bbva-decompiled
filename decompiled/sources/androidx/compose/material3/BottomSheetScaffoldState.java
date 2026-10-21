package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/BottomSheetScaffoldState;", "", "Landroidx/compose/material3/SheetState;", "a", "Landroidx/compose/material3/SheetState;", "getBottomSheetState", "()Landroidx/compose/material3/SheetState;", "bottomSheetState", "Landroidx/compose/material3/SnackbarHostState;", "b", "Landroidx/compose/material3/SnackbarHostState;", "getSnackbarHostState", "()Landroidx/compose/material3/SnackbarHostState;", "snackbarHostState", "<init>", "(Landroidx/compose/material3/SheetState;Landroidx/compose/material3/SnackbarHostState;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class BottomSheetScaffoldState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SheetState bottomSheetState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SnackbarHostState snackbarHostState;

    public BottomSheetScaffoldState(@NotNull SheetState bottomSheetState, @NotNull SnackbarHostState snackbarHostState) {
        Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        this.bottomSheetState = bottomSheetState;
        this.snackbarHostState = snackbarHostState;
    }

    @NotNull
    public final SheetState getBottomSheetState() {
        return this.bottomSheetState;
    }

    @NotNull
    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }
}
