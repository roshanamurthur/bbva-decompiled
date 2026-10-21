package com.bbva.document.scanner.presentation.view;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BoxProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bbva/document/scanner/presentation/view/BoxProvider;", "", "bounds", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "document-scanner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BoxProvider {
    @NotNull
    Rect bounds();

    @NotNull
    View view();
}
