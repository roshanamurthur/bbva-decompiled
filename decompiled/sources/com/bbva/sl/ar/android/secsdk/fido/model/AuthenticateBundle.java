package com.bbva.sl.ar.android.secsdk.fido.model;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public class AuthenticateBundle {

    @NonNull
    private WeakReference<Activity> activityWeakReference;

    @Nullable
    private FidoSdk.FidoAuthenticateCallback authenticateCallback;
    private boolean confirmationRequired;

    @Nullable
    private FidoSession fidoSession;

    @Nullable
    private String oobData;

    public AuthenticateBundle(@NonNull Activity activity, @NonNull FidoSession fidoSession, boolean z10, @Nullable String str, @NonNull FidoSdk.FidoAuthenticateCallback fidoAuthenticateCallback) {
        this.activityWeakReference = new WeakReference<>(activity);
        this.fidoSession = fidoSession;
        this.confirmationRequired = z10;
        this.oobData = str;
        this.authenticateCallback = fidoAuthenticateCallback;
    }

    public void clear() {
        this.activityWeakReference.clear();
        this.fidoSession = null;
        this.oobData = null;
        this.authenticateCallback = null;
    }

    @NonNull
    public WeakReference<Activity> getActivityWeakReference() {
        return this.activityWeakReference;
    }

    @Nullable
    public FidoSdk.FidoAuthenticateCallback getAuthenticateCallback() {
        return this.authenticateCallback;
    }

    @Nullable
    public FidoSession getFidoSession() {
        return this.fidoSession;
    }

    @Nullable
    public String getOobData() {
        return this.oobData;
    }

    public boolean isConfirmationRequired() {
        return this.confirmationRequired;
    }

    public boolean isInitialized() {
        return (this.fidoSession == null || this.authenticateCallback == null) ? false : true;
    }

    public void setActivityWeakReference(@NonNull WeakReference<Activity> weakReference) {
        this.activityWeakReference = weakReference;
    }

    public void setAuthenticateCallback(@NonNull FidoSdk.FidoAuthenticateCallback fidoAuthenticateCallback) {
        this.authenticateCallback = fidoAuthenticateCallback;
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
}
