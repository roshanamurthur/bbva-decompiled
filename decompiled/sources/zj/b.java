package zj;

import java.io.IOException;
import java.io.OutputStream;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataContentHandler;
import javax.activation.DataSource;
import javax.activation.UnsupportedDataTypeException;

/* JADX INFO: compiled from: DataHandler.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements DataContentHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DataSource f95078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActivationDataFlavor[] f95079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DataContentHandler f95080c;

    @Override // javax.activation.DataContentHandler
    public final Object getContent(DataSource dataSource) throws IOException {
        DataContentHandler dataContentHandler = this.f95080c;
        return dataContentHandler != null ? dataContentHandler.getContent(dataSource) : dataSource.getInputStream();
    }

    @Override // javax.activation.DataContentHandler
    public final Object getTransferData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) throws IOException {
        DataContentHandler dataContentHandler = this.f95080c;
        if (dataContentHandler != null) {
            return dataContentHandler.getTransferData(activationDataFlavor, dataSource);
        }
        if (activationDataFlavor.equals(mo5511getTransferDataFlavors()[0])) {
            return dataSource.getInputStream();
        }
        throw new IOException("Unsupported DataFlavor: " + activationDataFlavor);
    }

    @Override // javax.activation.DataContentHandler
    /* JADX INFO: renamed from: getTransferDataFlavors */
    public final ActivationDataFlavor[] mo5511getTransferDataFlavors() {
        if (this.f95079b == null) {
            DataContentHandler dataContentHandler = this.f95080c;
            if (dataContentHandler != null) {
                this.f95079b = dataContentHandler.mo5511getTransferDataFlavors();
            } else {
                this.f95079b = new ActivationDataFlavor[]{new ActivationDataFlavor(dataSource.getContentType(), dataSource.getContentType())};
                DataSource dataSource = this.f95078a;
            }
        }
        return this.f95079b;
    }

    @Override // javax.activation.DataContentHandler
    public final void writeTo(Object obj, String str, OutputStream outputStream) throws IOException {
        DataContentHandler dataContentHandler = this.f95080c;
        if (dataContentHandler != null) {
            dataContentHandler.writeTo(obj, str, outputStream);
        } else {
            throw new UnsupportedDataTypeException("no DCH for content type " + this.f95078a.getContentType());
        }
    }
}
