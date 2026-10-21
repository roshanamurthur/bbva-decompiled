package h2;

import android.location.Location;
import com.google.gson.JsonElement;
import com.mypinpad.tsdk.isolation.tj;
import com.noknok.android.client.appsdk_plus.pending_auth.PendingAuth;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69263p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f69264q0;

    public /* synthetic */ e(Object obj, int i10) {
        this.f69263p0 = i10;
        this.f69264q0 = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f69263p0) {
            case 0:
                ((androidx.core.util.Consumer) this.f69264q0).accept((Location) obj);
                return;
            case 1:
                Function1 function1 = (Function1) this.f69264q0;
                int i10 = tj.f61093j + 95;
                tj.f61092i = i10 % 128;
                if (i10 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(function1, "");
                    function1.invoke(obj);
                    return;
                } else {
                    Intrinsics.checkNotNullParameter(function1, "");
                    function1.invoke(obj);
                    throw null;
                }
            default:
                PendingAuth.a((List) this.f69264q0, (JsonElement) obj);
                return;
        }
    }
}
