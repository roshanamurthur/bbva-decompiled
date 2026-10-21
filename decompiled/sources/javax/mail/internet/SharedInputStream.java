package javax.mail.internet;

import java.io.InputStream;

/* JADX INFO: loaded from: classes12.dex */
public interface SharedInputStream {
    long getPosition();

    InputStream newStream(long j10, long j11);
}
