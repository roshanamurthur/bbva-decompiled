package com.dasnano.vdphotoselfiecapture.other;

import androidx.lifecycle.k;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.appcheck.internal.DefaultTokenRefresher;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39718b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f39717a = i10;
        this.f39718b = obj;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception it) {
        long j10;
        switch (this.f39717a) {
            case 0:
                Runnable failure = (Runnable) this.f39718b;
                Intrinsics.checkNotNullParameter(failure, "$failure");
                Intrinsics.checkNotNullParameter(it, "it");
                failure.run();
                break;
            case 1:
                DefaultTokenRefresher defaultTokenRefresher = (DefaultTokenRefresher) this.f39718b;
                defaultTokenRefresher.cancel();
                if (defaultTokenRefresher.f47617e == -1) {
                    j10 = 30;
                } else {
                    j10 = defaultTokenRefresher.f47617e * 2 < 960 ? defaultTokenRefresher.f47617e * 2 : 960L;
                }
                defaultTokenRefresher.f47617e = j10;
                defaultTokenRefresher.f47616d = defaultTokenRefresher.f47615c.schedule(new k(defaultTokenRefresher, 5), defaultTokenRefresher.f47617e, TimeUnit.SECONDS);
                break;
            default:
                ((TaskCompletionSource) this.f39718b).setException(it);
                break;
        }
    }
}
