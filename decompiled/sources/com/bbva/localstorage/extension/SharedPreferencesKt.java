package com.bbva.localstorage.extension;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SharedPreferences.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH\u0081\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"edit", "", "Landroid/content/SharedPreferences;", "commit", "action", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "", "Lkotlin/ExtensionFunctionType;", "local-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final boolean edit(@NotNull SharedPreferences sharedPreferences, boolean z10, @NotNull Function1<? super SharedPreferences.Editor, Unit> action) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        action.invoke(editor);
        if (z10) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }

    public static /* synthetic */ boolean edit$default(SharedPreferences sharedPreferences, boolean z10, Function1 action, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editor, "editor");
        action.invoke(editor);
        if (z10) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }
}
