package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: compiled from: StorageTaskManager.java */
/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f49184c = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f49185a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f49186b = new Object();

    public final void a(StorageTask<?> storageTask) {
        synchronized (this.f49186b) {
            this.f49185a.put(storageTask.d().toString(), new WeakReference(storageTask));
        }
    }

    public final void b(StorageTask<?> storageTask) {
        synchronized (this.f49186b) {
            try {
                String string = storageTask.d().toString();
                WeakReference weakReference = (WeakReference) this.f49185a.get(string);
                StorageTask<?> storageTask2 = weakReference != null ? (StorageTask) weakReference.get() : null;
                if (storageTask2 == null || storageTask2 == storageTask) {
                    this.f49185a.remove(string);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
