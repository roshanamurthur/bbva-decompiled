package com.noknok.android.client.appsdk.common;

/* JADX INFO: loaded from: classes11.dex */
public abstract class TryFidoUiFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TryFidoUiFactory f62898a = new TryFidoUiFactory() { // from class: com.noknok.android.client.appsdk.common.TryFidoUiFactory.1
        @Override // com.noknok.android.client.appsdk.common.TryFidoUiFactory
        public ITryFidoUi createTryFidoUiInstance() {
            return new DefaultTryFidoUi();
        }
    };

    public static TryFidoUiFactory getInstance() {
        return f62898a;
    }

    public static void setInstance(TryFidoUiFactory tryFidoUiFactory) {
        synchronized (TryFidoUiFactory.class) {
            f62898a = tryFidoUiFactory;
        }
    }

    public abstract ITryFidoUi createTryFidoUiInstance();
}
