package com.veridas.fragment.permission;

/* JADX INFO: loaded from: classes11.dex */
public interface CapturePermissionListener {
    void onCapturePermissionDenied(Object obj, String str);

    void onCapturePermissionGranted(Object obj, String str);

    void onCapturePermissionsDenied(Object obj);

    void onCapturePermissionsGranted(Object obj);

    void onCapturePermissionsIncomplete(Object obj);
}
