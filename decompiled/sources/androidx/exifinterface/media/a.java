package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: ExifInterfaceUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExifInterfaceUtils.java */
    @RequiresApi(21)
    public static class C0083a {
        @DoNotInline
        public static void a(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        @DoNotInline
        public static FileDescriptor b(FileDescriptor fileDescriptor) throws ErrnoException {
            return Os.dup(fileDescriptor);
        }

        @DoNotInline
        public static long c(FileDescriptor fileDescriptor, long j10, int i10) throws ErrnoException {
            return Os.lseek(fileDescriptor, j10, i10);
        }
    }

    /* JADX INFO: compiled from: ExifInterfaceUtils.java */
    @RequiresApi(23)
    public static class b {
        @DoNotInline
        public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] b(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static void c(ExifInterface.b bVar, OutputStream outputStream, int i10) throws IOException {
        byte[] bArr = new byte[8192];
        while (i10 > 0) {
            int iMin = Math.min(i10, 8192);
            int i11 = bVar.read(bArr, 0, iMin);
            if (i11 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i10 -= i11;
            outputStream.write(bArr, 0, i11);
        }
    }

    public static void d(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }
}
