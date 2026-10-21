package com.bbva.cells.components.type;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface CellsComponent {
    void onError(@NonNull String str, @NonNull Throwable th2);

    void onMessage(@NonNull String str, @NonNull Bundle bundle);
}
