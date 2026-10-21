package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class OnSelectionChangedListener<S> {
    public abstract void onSelectionChanged(@NonNull S s4);

    public void onIncompleteSelectionChanged() {
    }
}
