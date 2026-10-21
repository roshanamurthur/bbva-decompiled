package qc;

import com.veridas.Veridas;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f92812a = Charset.forName(Veridas.US_ASCII);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f92813b = Charset.forName("UTF-8");

    public static void a(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
