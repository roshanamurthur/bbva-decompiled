package com.veridas.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AlertDialogBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0000H&J\b\u0010\n\u001a\u00020\u0000H&J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0013H&J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000eH&¨\u0006\u001d"}, d2 = {"Lcom/veridas/dialog/AlertDialogBuilder;", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Landroid/app/Dialog;", "cancelable", "value", "", "context", "Landroid/content/Context;", "createAlertDialog", "createProgressDialog", "fallbackThemeId", "", "fallbackThemeName", "", "indeterminate", "indeterminateDrawableName", "message", "negativeButtonClickButtonListener", "Landroid/content/DialogInterface$OnClickListener;", "negativeButtonText", "negativeButtonTextColor", "positiveButtonClickButtonListener", "positiveButtonText", "positiveButtonTextColor", "style", "themeId", "themeName", "title", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface AlertDialogBuilder {
    @NotNull
    Dialog build();

    @NotNull
    AlertDialogBuilder cancelable(boolean value);

    @NotNull
    AlertDialogBuilder context(@NotNull Context value);

    @NotNull
    AlertDialogBuilder createAlertDialog();

    @NotNull
    AlertDialogBuilder createProgressDialog();

    @NotNull
    AlertDialogBuilder fallbackThemeId(int value);

    @NotNull
    AlertDialogBuilder fallbackThemeName(@NotNull String value);

    @NotNull
    AlertDialogBuilder indeterminate(boolean value);

    @NotNull
    AlertDialogBuilder indeterminateDrawableName(@NotNull String value);

    @NotNull
    AlertDialogBuilder message(@NotNull String value);

    @NotNull
    AlertDialogBuilder negativeButtonClickButtonListener(@NotNull DialogInterface.OnClickListener value);

    @NotNull
    AlertDialogBuilder negativeButtonText(@NotNull String value);

    @NotNull
    AlertDialogBuilder negativeButtonTextColor(int value);

    @NotNull
    AlertDialogBuilder positiveButtonClickButtonListener(@NotNull DialogInterface.OnClickListener value);

    @NotNull
    AlertDialogBuilder positiveButtonText(@NotNull String value);

    @NotNull
    AlertDialogBuilder positiveButtonTextColor(int value);

    @NotNull
    AlertDialogBuilder style(@NotNull String value);

    @NotNull
    AlertDialogBuilder themeId(int value);

    @NotNull
    AlertDialogBuilder themeName(@NotNull String value);

    @NotNull
    AlertDialogBuilder title(@NotNull String value);
}
