package com.bbva.ui.widget;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultTextWatcher.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/bbva/ui/widget/DefaultTextWatcher;", "Landroid/text/TextWatcher;", "()V", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "sequence", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "count", "after", "onTextChanged", "before", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class DefaultTextWatcher implements TextWatcher {
    public static final int $stable = 0;

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "editable");
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@NotNull CharSequence sequence, int start, int count, int after) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NotNull CharSequence sequence, int start, int before, int count) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
    }
}
