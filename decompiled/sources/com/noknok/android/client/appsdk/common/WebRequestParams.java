package com.noknok.android.client.appsdk.common;

import android.content.Context;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.noknok.android.client.utils.Charsets;
import com.noknok.android.client.utils.Logger;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public class WebRequestParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62899a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62900b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f62901c = false;

    public static String getFidoJS(Context context) throws Throwable {
        String rawFile = readRawFile(context, "mfacsdk");
        String strConcat = rawFile != null ? rawFile.concat(RootService.LINE_BREAK) : null;
        String rawFile2 = readRawFile(context, "injectedfido");
        return rawFile2 != null ? u.f(strConcat, rawFile2) : strConcat;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String readRawFile(Context context, String str) throws Throwable {
        Throwable th2;
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = context.getResources().openRawResource(context.getResources().getIdentifier(str, "raw", context.getPackageName()));
            try {
                try {
                    byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                    inputStreamOpenRawResource.read(bArr);
                    String str2 = new String(bArr, Charsets.utf8Charset);
                    try {
                        inputStreamOpenRawResource.close();
                        return str2;
                    } catch (IOException e5) {
                        Logger.e("WebRequestParams", "Error reading " + str + " file", e5);
                        return null;
                    }
                } catch (IOException e7) {
                    e = e7;
                    Logger.e("WebRequestParams", "Error reading " + str + " file", e);
                    if (inputStreamOpenRawResource == null) {
                        return null;
                    }
                    try {
                        inputStreamOpenRawResource.close();
                        return null;
                    } catch (IOException e10) {
                        Logger.e("WebRequestParams", "Error reading " + str + " file", e10);
                        return null;
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException e11) {
                        Logger.e("WebRequestParams", "Error reading " + str + " file", e11);
                    }
                }
                throw th2;
            }
        } catch (IOException e12) {
            e = e12;
            inputStreamOpenRawResource = null;
        } catch (Throwable th4) {
            th2 = th4;
            inputStreamOpenRawResource = null;
            if (inputStreamOpenRawResource != null) {
                inputStreamOpenRawResource.close();
            }
            throw th2;
        }
    }

    public boolean getCheckPolicyOnly() {
        return this.f62901c;
    }

    public String getOrigin() {
        return this.f62899a;
    }

    public String getTlsData() {
        return this.f62900b;
    }

    public void setCheckPolicyOnly(boolean z10) {
        this.f62901c = z10;
    }

    public void setOrigin(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf != -1) {
            str = str.substring(0, iLastIndexOf + 1);
        }
        this.f62899a = str;
    }

    public void setTlsData(String str) {
        this.f62900b = str;
    }
}
