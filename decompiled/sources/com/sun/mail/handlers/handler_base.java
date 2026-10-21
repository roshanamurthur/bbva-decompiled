package com.sun.mail.handlers;

import java.awt.datatransfer.DataFlavor;
import java.io.IOException;
import javax.activation.ActivationDataFlavor;
import javax.activation.DataContentHandler;
import javax.activation.DataSource;

/* JADX INFO: loaded from: classes9.dex */
public abstract class handler_base implements DataContentHandler {
    public Object getData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) throws IOException {
        return getContent(dataSource);
    }

    public abstract ActivationDataFlavor[] getDataFlavors();

    @Override // javax.activation.DataContentHandler
    public Object getTransferData(ActivationDataFlavor activationDataFlavor, DataSource dataSource) throws IOException {
        ActivationDataFlavor[] dataFlavors = getDataFlavors();
        for (int i10 = 0; i10 < dataFlavors.length; i10++) {
            if (dataFlavors[i10].equals((DataFlavor) activationDataFlavor)) {
                return getData(dataFlavors[i10], dataSource);
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ DataFlavor[] getTransferDataFlavors() {
        throw null;
    }

    @Override // javax.activation.DataContentHandler
    /* JADX INFO: renamed from: getTransferDataFlavors, reason: collision with other method in class */
    public ActivationDataFlavor[] mo5511getTransferDataFlavors() {
        return (ActivationDataFlavor[]) getDataFlavors().clone();
    }
}
