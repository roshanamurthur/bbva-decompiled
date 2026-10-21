package rj;

import io.reactivex.rxjava3.annotations.NonNull;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: SubscriptionDisposable.java */
/* JADX INFO: loaded from: classes12.dex */
public final class h extends f<Subscription> {
    @Override // rj.f
    public final void a(@NonNull Subscription subscription) {
        subscription.cancel();
    }
}
