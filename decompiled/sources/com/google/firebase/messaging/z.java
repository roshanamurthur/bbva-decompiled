package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: WithinAppServiceBinder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class z extends Binder {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f48734e;

    /* JADX INFO: compiled from: WithinAppServiceBinder.java */
    public interface a {
    }

    public z(EnhancedIntentService.a aVar) {
        this.f48734e = aVar;
    }

    public final void a(final b0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        EnhancedIntentService.this.processIntent(aVar.f48620a).addOnCompleteListener(new d(), new OnCompleteListener() { // from class: com.google.firebase.messaging.y
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                aVar.f48621b.trySetResult(null);
            }
        });
    }
}
