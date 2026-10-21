package d5;

import com.bbva.plugin.naturalauthentication.injection.Injector;
import com.google.gson.Gson;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f68125p0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f68125p0) {
            case 0:
                return new Gson();
            default:
                return Injector.INSTANCE.getNaturalAuthentication();
        }
    }
}
