package com.sun.mail.handlers;

import javax.activation.ActivationDataFlavor;

/* JADX INFO: loaded from: classes9.dex */
public class text_html extends text_plain {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ActivationDataFlavor[] f65240b = {new ActivationDataFlavor(String.class, "text/html", "HTML String")};

    @Override // com.sun.mail.handlers.text_plain, com.sun.mail.handlers.handler_base
    public ActivationDataFlavor[] getDataFlavors() {
        return f65240b;
    }
}
