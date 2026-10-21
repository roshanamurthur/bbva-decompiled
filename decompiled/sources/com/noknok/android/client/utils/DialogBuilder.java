package com.noknok.android.client.utils;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import com.noknok.android.common.R;

/* JADX INFO: loaded from: classes11.dex */
public class DialogBuilder extends AlertDialog.Builder {
    private DialogBuilder(Context context) {
        super(context);
    }

    public static DialogBuilder getInstance(Context context) {
        if (context != null) {
            return new DialogBuilder(new ContextThemeWrapper(context, R.style.Theme_AppCompat_Dialog));
        }
        throw new IllegalStateException("Context should not be null");
    }

    public AlertDialog create(View view) {
        AlertDialog alertDialogCreate = create();
        alertDialogCreate.setView(view, 0, 0, 0, 0);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        }
        alertDialogCreate.setCanceledOnTouchOutside(false);
        return alertDialogCreate;
    }
}
