package aa;

import com.bancomer.mbanking.R;
import com.bbva.ethermobilesdk.pinning.model.configuration.PinningGlobalEnvironment;
import com.bbva.network.model.pinning.PinningCatalog;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NetworkModule.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function2<Scope, ParametersHolder, PinningCatalog> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f213p0 = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final PinningCatalog invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new PinningCatalog(R.raw.sslpinning, "sslpinning.xml", PinningGlobalEnvironment.LIVE, null, Boolean.FALSE, 8, null);
    }
}
