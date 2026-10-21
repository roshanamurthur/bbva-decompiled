package com.noknok.android.client.utils;

/* JADX INFO: loaded from: classes11.dex */
public abstract class TransactionUIFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static TransactionUIFactory f63483a = new TransactionUIFactory() { // from class: com.noknok.android.client.utils.TransactionUIFactory.1
        @Override // com.noknok.android.client.utils.TransactionUIFactory
        public ITransactionUI createTransactionUIInstance() {
            return new DefaultTransactionUI();
        }
    };

    public static TransactionUIFactory getInstance() {
        return f63483a;
    }

    public static void setInstance(TransactionUIFactory transactionUIFactory) {
        synchronized (TransactionUIFactory.class) {
            f63483a = transactionUIFactory;
        }
    }

    public abstract ITransactionUI createTransactionUIInstance();
}
