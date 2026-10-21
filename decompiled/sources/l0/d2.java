package l0;

import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TouchExplorationStateProvider.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTouchExplorationStateProvider.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/Listener\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,107:1\n76#2:108\n102#2,2:109\n76#2:111\n102#2,2:112\n*S KotlinDebug\n*F\n+ 1 TouchExplorationStateProvider.android.kt\nandroidx/compose/material3/Listener\n*L\n81#1:108\n81#1:109,2\n82#1:111\n82#1:112,2\n*E\n"})
public final class d2 implements AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final MutableState f82488p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final MutableState f82489q0;

    public d2() {
        Boolean bool = Boolean.FALSE;
        this.f82488p0 = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.f82489q0 = SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z10) {
        this.f82488p0.setValue(Boolean.valueOf(z10));
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z10) {
        this.f82489q0.setValue(Boolean.valueOf(z10));
    }
}
