package com.google.android.material.sidesheet;

import androidx.annotation.RestrictTo;
import com.google.android.material.motion.MaterialBackHandler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import ne.c;

/* JADX INFO: loaded from: classes10.dex */
public interface Sheet<C extends c> extends MaterialBackHandler {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SheetEdge {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface SheetState {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface StableSheetState {
    }

    void addCallback(C c10);

    int getState();

    void setState(int i10);
}
