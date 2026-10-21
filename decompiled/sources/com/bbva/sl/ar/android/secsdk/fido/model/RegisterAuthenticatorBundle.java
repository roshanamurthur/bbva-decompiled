package com.bbva.sl.ar.android.secsdk.fido.model;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class RegisterAuthenticatorBundle {

    @NonNull
    private WeakReference<Activity> activityWeakReference;
    private boolean confirmationRequired;

    @Nullable
    private FidoSession fidoSession;

    @Nullable
    private String oobData;

    @Nullable
    private FidoSdk.FidoRegisterCallback registerCallback;

    public RegisterAuthenticatorBundle(@NonNull Activity activity, @NonNull FidoSession fidoSession, boolean z10, @Nullable String str, @NonNull FidoSdk.FidoRegisterCallback fidoRegisterCallback) {
        this.activityWeakReference = new WeakReference<>(activity);
        this.fidoSession = fidoSession;
        this.confirmationRequired = z10;
        this.oobData = str;
        this.registerCallback = fidoRegisterCallback;
    }

    public void clear() {
        this.activityWeakReference.clear();
        this.fidoSession = null;
        this.oobData = null;
        this.registerCallback = null;
    }

    @NonNull
    public WeakReference<Activity> getActivityWeakReference() {
        return this.activityWeakReference;
    }

    @Nullable
    public FidoSession getFidoSession() {
        return this.fidoSession;
    }

    @Nullable
    public String getOobData() {
        return this.oobData;
    }

    @Nullable
    public FidoSdk.FidoRegisterCallback getRegisterCallback() {
        return this.registerCallback;
    }

    public boolean isConfirmationRequired() {
        return this.confirmationRequired;
    }

    public boolean isInitialized() {
        return (this.fidoSession == null || this.registerCallback == null) ? false : true;
    }

    public void setActivityWeakReference(@NonNull WeakReference<Activity> weakReference) {
        this.activityWeakReference = weakReference;
    }

    public void setConfirmationRequired(boolean z10) {
        this.confirmationRequired = z10;
    }

    public void setFidoSession(@NonNull FidoSession fidoSession) {
        this.fidoSession = fidoSession;
    }

    public void setOobData(@Nullable String str) {
        this.oobData = str;
    }

    public void setRegisterCallback(@NonNull FidoSdk.FidoRegisterCallback fidoRegisterCallback) {
        this.registerCallback = fidoRegisterCallback;
    }
}
