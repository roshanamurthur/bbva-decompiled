package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class FocusMeteringResult {
    private boolean mIsFocusSuccessful;

    private FocusMeteringResult(boolean z10) {
        this.mIsFocusSuccessful = z10;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static FocusMeteringResult create(boolean z10) {
        return new FocusMeteringResult(z10);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static FocusMeteringResult emptyInstance() {
        return new FocusMeteringResult(false);
    }

    public boolean isFocusSuccessful() {
        return this.mIsFocusSuccessful;
    }
}
