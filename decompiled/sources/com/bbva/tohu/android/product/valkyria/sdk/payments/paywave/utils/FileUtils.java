package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils;

import ad.d;
import android.net.Uri;
import android.os.Environment;
import androidx.camera.core.impl.utils.c;
import com.bbva.tohu.android.core.utils.LogTohu;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo.VtsCardProfile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class FileUtils {
    public static final String MPB_ROOT_DIR;
    private final String TAG = "FileUtils";

    static {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        MPB_ROOT_DIR = d.f(sb2, File.separator, "visa-card-profiles");
    }

    private String readCardProfileAsJson(String str) throws IOException {
        return readJsonFromLocalStorage(MPB_ROOT_DIR, str);
    }

    private String readJsonFromLocalStorage(String str, String str2) throws Throwable {
        StringBuilder sbD = c.d(str);
        sbD.append(File.separator);
        sbD.append(str2);
        Uri uri = Uri.parse(sbD.toString());
        LogTohu.d("FileUtils", "tohu**************** file URI: %s", uri.getPath());
        File file = new File(uri.getPath());
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null) {
                        bufferedReader2.close();
                        return new String(sb2);
                    }
                    sb2.append(line);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public VtsCardProfile addCardAndSuk(String str) {
        try {
            String cardProfileAsJson = readCardProfileAsJson(str);
            System.out.println("CARDPROFILE:" + cardProfileAsJson);
            return VtsCardProfile.valueOf(cardProfileAsJson);
        } catch (FileNotFoundException e5) {
            LogTohu.d(this.TAG, "addCardAndSuk:", e5);
            return null;
        } catch (Exception e7) {
            LogTohu.d(this.TAG, "addCardAndSuk:", e7);
            return null;
        }
    }

    private void showToastMessage(String str) {
    }
}
