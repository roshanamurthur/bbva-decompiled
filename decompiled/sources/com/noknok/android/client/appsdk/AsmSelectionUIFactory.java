package com.noknok.android.client.appsdk;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AsmSelectionUIFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AsmSelectionUIFactory f62866a;

    public static AsmSelectionUIFactory getInstance() {
        return f62866a;
    }

    public static void setInstance(AsmSelectionUIFactory asmSelectionUIFactory) {
        synchronized (AsmSelectionUIFactory.class) {
            f62866a = asmSelectionUIFactory;
        }
    }

    public abstract AsmSelectionUI createAsmSelectionUIInstance();
}
