package z2;

import com.veridas.resource.zip.EndOfCentralDirectoryRecord;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: ZipUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: compiled from: ZipUtil.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f94945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f94946b;
    }

    public static a a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j10 = length - 22;
        if (j10 < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j11 = length - 65558;
        long j12 = j11 >= 0 ? j11 : 0L;
        int iReverseBytes = Integer.reverseBytes(EndOfCentralDirectoryRecord.EOCD_SIGNATURE);
        do {
            randomAccessFile.seek(j10);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f94946b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                aVar.f94945a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return aVar;
            }
            j10--;
        } while (j10 >= j12);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
