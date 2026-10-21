package com.bbva.showinfo.generator;

import com.bbva.showinfo.InfoSnackBarExtensionsKt;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SnackbarHolder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/bbva/showinfo/generator/SnackbarHolder;", "", "Lcom/google/android/material/snackbar/Snackbar;", "snackbar", "", "hold", "dismiss", "<init>", "()V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class SnackbarHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Snackbar f36479a;

    @NotNull
    public static final SnackbarHolder INSTANCE = new SnackbarHolder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SnackbarHolder$globalDismissCallback$1 f36480b = new Snackbar.Callback() { // from class: com.bbva.showinfo.generator.SnackbarHolder$globalDismissCallback$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.snackbar.Snackbar.Callback, com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onDismissed(@Nullable Snackbar transientBottomBar, int event) {
            super.onDismissed(transientBottomBar, event);
            SnackbarHolder.access$clearReferences(SnackbarHolder.INSTANCE);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.snackbar.Snackbar.Callback, com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
        public void onShown(@Nullable Snackbar sb2) {
            super.onShown(sb2);
            SnackbarHolder.f36479a = sb2;
        }
    };

    public static final void access$clearReferences(SnackbarHolder snackbarHolder) {
        snackbarHolder.getClass();
        f36479a = null;
    }

    public final void dismiss() {
        Snackbar snackbar = f36479a;
        if (snackbar != null) {
            snackbar.dismiss();
        }
    }

    public final void hold(@NotNull Snackbar snackbar) {
        Intrinsics.checkNotNullParameter(snackbar, "snackbar");
        InfoSnackBarExtensionsKt.dismissCallback(snackbar, f36480b);
    }
}
