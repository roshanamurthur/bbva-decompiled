package net.ipsoft.amelia.sdk.internal.common;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public class j {
    public static void a(InputStream inputStream, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                fileOutputStream.close();
                inputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i10);
        }
    }
}
