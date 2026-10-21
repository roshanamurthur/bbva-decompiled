package com.bbva.cells.component.kit.ui.helper;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes2.dex */
public class ContextHelper {
    public static FragmentActivity getActivity(Context context) {
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        }
        if (context instanceof ContextWrapper) {
            return getActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LifecycleOwner getOwner(Context context) {
        if (context instanceof LifecycleOwner) {
            return (LifecycleOwner) context;
        }
        if (context instanceof ContextWrapper) {
            return getOwner(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }
}
