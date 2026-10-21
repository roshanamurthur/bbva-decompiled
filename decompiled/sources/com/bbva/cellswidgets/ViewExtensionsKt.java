package com.bbva.cellswidgets;

import android.content.Context;
import android.text.InputFilter;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;
import com.bbva.cells.component.kit.ui.helper.ContextHelper;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0007H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "getLifecycleOwner", "(Landroid/content/Context;)Landroidx/lifecycle/LifecycleOwner;", "configureMaxLength", "", "Landroid/widget/EditText;", "maxLength", "", "(Landroid/widget/EditText;Ljava/lang/Integer;)V", "removeMaxLength", "cells-widgets_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nViewExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewExtensions.kt\ncom/bbva/cellswidgets/ViewExtensionsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,30:1\n3792#2:31\n4307#2,2:32\n3792#2:36\n4307#2,2:37\n37#3,2:34\n37#3,2:39\n*S KotlinDebug\n*F\n+ 1 ViewExtensions.kt\ncom/bbva/cellswidgets/ViewExtensionsKt\n*L\n15#1:31\n15#1:32,2\n24#1:36\n24#1:37,2\n17#1:34,2\n26#1:39,2\n*E\n"})
public final class ViewExtensionsKt {
    public static final void configureMaxLength(@NotNull EditText editText, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        if (num != null) {
            int iIntValue = num.intValue();
            InputFilter[] filters = editText.getFilters();
            Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
            ArrayList arrayList = new ArrayList();
            for (InputFilter inputFilter : filters) {
                if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                    arrayList.add(inputFilter);
                }
            }
            editText.setFilters((InputFilter[]) ArraysKt___ArraysJvmKt.plus((InputFilter.LengthFilter[]) arrayList.toArray(new InputFilter[0]), new InputFilter.LengthFilter(iIntValue)));
        }
    }

    @Nullable
    public static final LifecycleOwner getLifecycleOwner(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ContextHelper.getOwner(context);
    }

    public static final void removeMaxLength(@NotNull EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        InputFilter[] filters = editText.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        ArrayList arrayList = new ArrayList();
        for (InputFilter inputFilter : filters) {
            if (!(inputFilter instanceof InputFilter.LengthFilter)) {
                arrayList.add(inputFilter);
            }
        }
        editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
    }
}
