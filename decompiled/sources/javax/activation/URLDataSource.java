package javax.activation;

import com.bbva.network.constant.ConstantsKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes12.dex */
public class URLDataSource implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final URL f78874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public URLConnection f78875b = null;

    public URLDataSource(URL url) {
        this.f78874a = url;
    }

    @Override // javax.activation.DataSource
    public String getContentType() {
        try {
            if (this.f78875b == null) {
                this.f78875b = this.f78874a.openConnection();
            }
        } catch (IOException unused) {
        }
        URLConnection uRLConnection = this.f78875b;
        String contentType = uRLConnection != null ? uRLConnection.getContentType() : null;
        return contentType == null ? ConstantsKt.DEFAULT_MEDIATYPE : contentType;
    }

    @Override // javax.activation.DataSource
    public InputStream getInputStream() throws IOException {
        return this.f78874a.openStream();
    }

    @Override // javax.activation.DataSource
    public String getName() {
        return this.f78874a.getFile();
    }

    @Override // javax.activation.DataSource
    public OutputStream getOutputStream() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f78874a.openConnection();
        this.f78875b = uRLConnectionOpenConnection;
        if (uRLConnectionOpenConnection == null) {
            return null;
        }
        uRLConnectionOpenConnection.setDoOutput(true);
        return this.f78875b.getOutputStream();
    }

    public URL getURL() {
        return this.f78874a;
    }
}
