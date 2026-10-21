package nj;

import io.reactivex.annotations.NonNull;
import org.reactivestreams.Subscription;

/* JADX INFO: compiled from: SubscriptionDisposable.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e extends c<Subscription> {
    @Override // nj.c
    public final void a(@NonNull Subscription subscription) {
        subscription.cancel();
    }
}
