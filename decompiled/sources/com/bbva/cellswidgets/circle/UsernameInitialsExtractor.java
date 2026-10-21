package com.bbva.cellswidgets.circle;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UsernameInitialsExtractor.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/bbva/cellswidgets/circle/UsernameInitialsExtractor;", "", "extract", "", HintConstants.AUTOFILL_HINT_USERNAME, "cells-widgets_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface UsernameInitialsExtractor {
    @NotNull
    String extract(@Nullable String username);
}
