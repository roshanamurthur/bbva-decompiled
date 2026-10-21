package com.facetec.sdk;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: loaded from: classes9.dex */
final class av {
    public static void c(Context context) {
        cx.b(new i1(context, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Context context) {
        au.c(EglobalUtils.CONNECTION_TYPE_BLUETOOTH);
        au.b(EglobalUtils.CONNECTION_TYPE_BLUETOOTH);
        au.c("RWT");
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("tmp_rw", 0);
            fileOutputStreamOpenFileOutput.write("abcdefghijklmnopqrstuvwxyz1234567890".getBytes());
            fileOutputStreamOpenFileOutput.flush();
            fileOutputStreamOpenFileOutput.close();
        } catch (Exception unused) {
        }
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput("tmp_rw");
            while (fileInputStreamOpenFileInput.read() != -1) {
            }
            fileInputStreamOpenFileInput.close();
        } catch (Exception unused2) {
        }
        au.b("RWT");
    }
}
