package c5;

import com.bbva.component.ic.security.SecurityDataManager;
import com.bbva.component.ic.security.factory.InterceptorsFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SecurityDataManager.Companion companion = SecurityDataManager.INSTANCE;
        return new InterceptorsFactory();
    }
}
