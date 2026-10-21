package ig;

import android.content.Context;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* JADX INFO: compiled from: CrossProcessLock.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileChannel f69670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileLock f69671b;

    public a(FileChannel fileChannel, FileLock fileLock) {
        this.f69670a = fileChannel;
        this.f69671b = fileLock;
    }

    public static a a(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), RootService.RW).getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new a(channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    public final void b() {
        try {
            this.f69671b.release();
            this.f69670a.close();
        } catch (IOException unused) {
        }
    }
}
