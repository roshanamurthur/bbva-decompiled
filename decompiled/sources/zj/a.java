package zj;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.activation.DataHandler;
import javax.activation.DataSource;

/* JADX INFO: compiled from: DataHandler.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a implements DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DataHandler f95077a;

    @Override // javax.activation.DataSource
    public final String getContentType() {
        return this.f95077a.getContentType();
    }

    @Override // javax.activation.DataSource
    public final InputStream getInputStream() throws IOException {
        return this.f95077a.getInputStream();
    }

    @Override // javax.activation.DataSource
    public final String getName() {
        return this.f95077a.getName();
    }

    @Override // javax.activation.DataSource
    public final OutputStream getOutputStream() throws IOException {
        return this.f95077a.getOutputStream();
    }
}
