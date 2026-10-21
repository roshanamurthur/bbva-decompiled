package zj;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataContentHandler;
import javax.activation.DataSource;
import javax.activation.UnsupportedDataTypeException;

/* JADX INFO: compiled from: DataHandler.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c implements DataContentHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActivationDataFlavor[] f95081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f95082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f95083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DataContentHandler f95084d;

    @Override // javax.activation.DataContentHandler
    public final Object getContent(DataSource dataSource) {
        return this.f95082b;
    }

    @Override // javax.activation.DataContentHandler
    public final Object getTransferData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) throws IOException {
        DataContentHandler dataContentHandler = this.f95084d;
        if (dataContentHandler != null) {
            return dataContentHandler.getTransferData(activationDataFlavor, dataSource);
        }
        if (activationDataFlavor.equals(mo5511getTransferDataFlavors()[0])) {
            return this.f95082b;
        }
        throw new IOException("Unsupported DataFlavor: " + activationDataFlavor);
    }

    @Override // javax.activation.DataContentHandler
    /* JADX INFO: renamed from: getTransferDataFlavors */
    public final synchronized ActivationDataFlavor[] mo5511getTransferDataFlavors() {
        try {
            if (this.f95081a == null) {
                DataContentHandler dataContentHandler = this.f95084d;
                if (dataContentHandler != null) {
                    this.f95081a = dataContentHandler.mo5511getTransferDataFlavors();
                } else {
                    this.f95081a = new ActivationDataFlavor[]{new ActivationDataFlavor(cls, str, str)};
                    Class<?> cls = this.f95082b.getClass();
                    String str = this.f95083c;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f95081a;
    }

    @Override // javax.activation.DataContentHandler
    public final void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        DataContentHandler dataContentHandler = this.f95084d;
        if (dataContentHandler != null) {
            dataContentHandler.writeTo(obj, str, outputStream);
            return;
        }
        if (obj instanceof byte[]) {
            outputStream.write((byte[]) obj);
            return;
        }
        if (!(obj instanceof String)) {
            throw new UnsupportedDataTypeException("no object DCH for MIME type " + this.f95083c);
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write((String) obj);
        outputStreamWriter.flush();
    }
}
