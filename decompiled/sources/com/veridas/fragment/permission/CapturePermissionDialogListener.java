package com.veridas.fragment.permission;

import androidx.appcompat.app.AlertDialog;

/* JADX INFO: loaded from: classes11.dex */
public interface CapturePermissionDialogListener {
    void onCapturePermissionsShow(AlertDialog alertDialog);

    void onClickCapturePermissionsAccepted(AlertDialog alertDialog);

    void onClickCapturePermissionsDenied(AlertDialog alertDialog);
}
