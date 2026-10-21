package de;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: BottomSheetBehavior.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements AccessibilityViewCommand {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f68173p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f68174q0;

    public c(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f68174q0 = bottomSheetBehavior;
        this.f68173p0 = i10;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
        this.f68174q0.setState(this.f68173p0);
        return true;
    }
}
