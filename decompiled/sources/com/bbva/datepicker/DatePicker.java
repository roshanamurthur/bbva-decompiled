package com.bbva.datepicker;

import android.content.Context;
import com.bbva.datepicker.model.DatePickerParams;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00030\tH&ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/datepicker/DatePicker;", "", "show", "", "context", "Landroid/content/Context;", "datePickerParams", "Lcom/bbva/datepicker/model/DatePickerParams;", "onDatePicked", "Lkotlin/Function1;", "Lkotlin/Result;", "Ljava/util/Date;", "datepicker_release"}, k = 1, mv = {1, 4, 2})
public interface DatePicker {
    void show(@NotNull Context context, @NotNull DatePickerParams datePickerParams, @NotNull Function1<? super Result<? extends Date>, Unit> onDatePicked);
}
