package xf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: NativeSessionFileGzipper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w {
    public static void a(@Nullable InputStream inputStream, @NonNull File file) throws Throwable {
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        gZIPOutputStream2.finish();
                        CommonUtils.closeQuietly(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream = gZIPOutputStream2;
                    CommonUtils.closeQuietly(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
