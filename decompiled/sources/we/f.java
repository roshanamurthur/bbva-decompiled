package we;

import com.google.android.play.core.splitcompat.zze;
import com.google.android.play.core.splitcompat.zzm;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f94231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f94232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZipFile f94233c;

    public f(HashSet hashSet, l lVar, ZipFile zipFile) {
        this.f94231a = hashSet;
        this.f94232b = lVar;
        this.f94233c = zipFile;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // we.h
    public final void a(zzm zzmVar, File file, boolean z10) throws IllegalAccessException, IOException, InvocationTargetException {
        this.f94231a.add(file);
        if (z10) {
            return;
        }
        l lVar = this.f94232b;
        String.format("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", lVar.b(), zzmVar.zza, lVar.a().getAbsolutePath(), zzmVar.zzb.getName(), file.getAbsolutePath());
        ZipEntry zipEntry = zzmVar.zzb;
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = this.f94233c.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                zze.zzm(file);
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th5;
        }
    }
}
