package xf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: FileBackedNativeSessionFile.java */
/* JADX INFO: loaded from: classes10.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final File f94636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final String f94637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final String f94638c;

    public t(@NonNull File file, @NonNull String str, @NonNull String str2) {
        this.f94637b = str;
        this.f94638c = str2;
        this.f94636a = file;
    }

    @Override // xf.v
    @Nullable
    public final CrashlyticsReport.FilesPayload.File a() {
        byte[] byteArray;
        byte[] bArr = new byte[8192];
        try {
            InputStream inputStreamC = c();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    if (inputStreamC == null) {
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (inputStreamC != null) {
                            inputStreamC.close();
                        }
                        byteArray = null;
                    } else {
                        while (true) {
                            try {
                                int i10 = inputStreamC.read(bArr);
                                if (i10 <= 0) {
                                    break;
                                }
                                gZIPOutputStream.write(bArr, 0, i10);
                            } catch (Throwable th2) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th4) {
                                th.addSuppressed(th4);
                            }
                            throw th;
                        }
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        inputStreamC.close();
                    }
                } catch (Throwable th5) {
                    byteArrayOutputStream.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                if (inputStreamC != null) {
                    try {
                        inputStreamC.close();
                    } catch (Throwable th7) {
                        th6.addSuppressed(th7);
                    }
                }
                throw th6;
            }
        } catch (IOException unused) {
        }
        if (byteArray != null) {
            return CrashlyticsReport.FilesPayload.File.builder().setContents(byteArray).setFilename(this.f94637b).build();
        }
        return null;
    }

    @Override // xf.v
    @NonNull
    public final String b() {
        return this.f94638c;
    }

    @Override // xf.v
    @Nullable
    public final InputStream c() {
        File file = this.f94636a;
        if (file.exists() && file.isFile()) {
            try {
                return new FileInputStream(file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}
