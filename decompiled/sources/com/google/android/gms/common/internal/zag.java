package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, @Nullable Intent intent, int i10) {
        return new zad(intent, activity, i10);
    }

    public static zag zac(@NonNull Fragment fragment, @Nullable Intent intent, int i10) {
        return new zae(intent, fragment, i10);
    }

    public static zag zad(@NonNull LifecycleFragment lifecycleFragment, @Nullable Intent intent, int i10) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                zaa();
            } catch (ActivityNotFoundException unused) {
                Build.FINGERPRINT.contains(EmulatorApi.GENERIC);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    public abstract void zaa();
}
