package com.bbva.androidtoolkit.plugin.command;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.permission.PermissionManager;
import com.bbva.androidtoolkit.plugin.permission.PermissionReport;
import com.bbva.androidtoolkit.plugin.permission.PermissionResultListener;
import com.bbva.androidtoolkit.plugin.response.Errors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PermissionCommand<T> extends AbstractCommand<T> implements PermissionResultListener {
    protected CommandCallback mCommandCallback;
    protected T mParams;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final String[] f26514p0;

    public PermissionCommand(@NonNull Class<T> cls, String... strArr) {
        super(cls);
        this.f26514p0 = strArr;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(T t10, CommandCallback commandCallback) {
        this.mParams = t10;
        this.mCommandCallback = commandCallback;
        Optional<Activity> optional = this.mActivityContainer.get();
        if (optional.isPresent()) {
            PermissionManager.request(optional.get(), this.f26514p0, this);
        }
    }

    public abstract void executeWithPermissionsGranted();

    @Override // com.bbva.androidtoolkit.plugin.permission.PermissionResultListener
    public void onRequestPermissionFinish(PermissionReport permissionReport) {
        if (permissionReport.areAllGranted()) {
            executeWithPermissionsGranted();
        } else if (permissionReport.hasPermanentlyDeniedAnyPermission()) {
            this.mCommandCallback.sendError(Errors.ErrorPermissionPermanentlyDenied);
        } else {
            this.mCommandCallback.sendError(Errors.ErrorPermissionDenied);
        }
    }

    public PermissionCommand(@NonNull Class<T> cls, int i10, String... strArr) {
        super(cls, i10);
        this.f26514p0 = strArr;
    }
}
