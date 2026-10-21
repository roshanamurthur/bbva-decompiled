package javax.activation;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public interface DataContentHandler {
    Object getContent(DataSource dataSource) throws IOException;

    Object getTransferData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) throws IOException;

    /* JADX INFO: renamed from: getTransferDataFlavors */
    ActivationDataFlavor[] mo5511getTransferDataFlavors();

    void writeTo(Object obj, String str, OutputStream outputStream) throws IOException;
}
