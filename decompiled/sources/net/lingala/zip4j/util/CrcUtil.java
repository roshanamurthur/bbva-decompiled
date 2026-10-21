package net.lingala.zip4j.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.progress.ProgressMonitor;

/* JADX INFO: loaded from: classes12.dex */
public class CrcUtil {
    public static long computeFileCrc(File file, ProgressMonitor progressMonitor) throws IOException {
        if (file == null || !file.exists() || !file.canRead()) {
            throw new ZipException("input file is null or does not exist or cannot read. Cannot calculate CRC for the file");
        }
        byte[] bArr = new byte[16384];
        CRC32 crc32 = new CRC32();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 == -1) {
                    long value = crc32.getValue();
                    fileInputStream.close();
                    return value;
                }
                crc32.update(bArr, 0, i10);
                if (progressMonitor != null) {
                    progressMonitor.updateWorkCompleted(i10);
                    if (progressMonitor.isCancelAllTasks()) {
                        progressMonitor.setResult(ProgressMonitor.Result.CANCELLED);
                        progressMonitor.setState(ProgressMonitor.State.READY);
                        fileInputStream.close();
                        return 0L;
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
    }
}
