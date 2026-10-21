package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.core.feature.TransactionControllerImpl;
import mx.openpay.library.di.DependenciesProvider;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f131a = new r();

    public r() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependenciesProvider.TransactionModule transactionModule = DependenciesProvider.TransactionModule.INSTANCE;
        return new TransactionControllerImpl(transactionModule.provideGetTransactionsUseCase(), transactionModule.provideSendVoucherUseCase());
    }
}
