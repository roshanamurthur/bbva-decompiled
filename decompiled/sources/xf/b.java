package xf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: BytesBackedNativeSessionFile.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final byte[] f94606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final String f94607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final String f94608c;

    public b(@NonNull String str, @NonNull String str2, @Nullable byte[] bArr) {
        this.f94607b = str;
        this.f94608c = str2;
        this.f94606a = bArr;
    }

    @Override // xf.v
    @Nullable
    public final CrashlyticsReport.FilesPayload.File a() {
        byte[] byteArray;
        byte[] bArr = this.f94606a;
        if (bArr == null || bArr.length == 0) {
            byteArray = null;
        } else {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (IOException unused) {
            }
        }
        if (byteArray == null) {
            return null;
        }
        return CrashlyticsReport.FilesPayload.File.builder().setContents(byteArray).setFilename(this.f94607b).build();
    }

    @Override // xf.v
    @NonNull
    public final String b() {
        return this.f94608c;
    }

    @Override // xf.v
    @Nullable
    public final InputStream c() {
        byte[] bArr = this.f94606a;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }
}
