package androidx.camera.core;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2291p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2292q0;

    public /* synthetic */ z(Object obj, int i10) {
        this.f2291p0 = i10;
        this.f2292q0 = obj;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0076 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f2291p0
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r8.f2292q0
            switch(r0) {
                case 0: goto L97;
                case 1: goto L3f;
                case 2: goto L39;
                case 3: goto L2c;
                case 4: goto L24;
                case 5: goto Lf;
                default: goto L9;
            }
        L9:
            com.google.android.material.textfield.e r3 = (com.google.android.material.textfield.e) r3
            r3.t(r2)
            return
        Lf:
            com.google.android.material.search.SearchView r3 = (com.google.android.material.search.SearchView) r3
            android.widget.EditText r0 = r3.f45142y0
            boolean r1 = r0.requestFocus()
            if (r1 == 0) goto L1e
            r1 = 8
            r0.sendAccessibilityEvent(r1)
        L1e:
            boolean r1 = r3.T0
            com.google.android.material.internal.ViewUtils.showKeyboard(r0, r1)
            return
        L24:
            com.dasnano.vddocumentcapture.managers.UserVisualHelpManager r3 = (com.dasnano.vddocumentcapture.managers.UserVisualHelpManager) r3
            android.widget.TextView r0 = r3.f39410a
            r0.setVisibility(r1)
            return
        L2c:
            com.bbva.androidtoolkit.plugin.command.callback.CommandCallback r3 = (com.bbva.androidtoolkit.plugin.command.callback.CommandCallback) r3
            java.lang.String r0 = "$callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.bbva.androidtoolkit.plugin.response.Errors r0 = com.bbva.androidtoolkit.plugin.response.Errors.ErrorDefault
            r3.sendError(r0)
            return
        L39:
            com.appsflyer.internal.AFc1wSDK r3 = (com.appsflyer.internal.AFc1wSDK) r3
            com.appsflyer.internal.AFc1wSDK.b(r3)
            return
        L3f:
            androidx.room.RoomTrackingLiveData r3 = (androidx.room.RoomTrackingLiveData) r3
            int r0 = androidx.room.RoomTrackingLiveData.f23331k
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f23339h
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L5c
            androidx.room.RoomDatabase r0 = r3.f23332a
            androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
            androidx.room.RoomTrackingLiveData$observer$1 r4 = r3.f23336e
            r0.addWeakObserver(r4)
        L5c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f23338g
            boolean r4 = r0.compareAndSet(r1, r2)
            if (r4 == 0) goto L96
            r4 = 0
            r5 = r1
        L66:
            java.util.concurrent.atomic.AtomicBoolean r6 = r3.f23337f
            boolean r7 = r6.compareAndSet(r2, r1)     // Catch: java.lang.Throwable -> L76
            if (r7 == 0) goto L81
            java.util.concurrent.Callable<T> r4 = r3.f23335d     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            java.lang.Object r4 = r4.call()     // Catch: java.lang.Throwable -> L76 java.lang.Exception -> L78
            r5 = r2
            goto L66
        L76:
            r2 = move-exception
            goto L92
        L78:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L76
            java.lang.String r4 = "Exception while computing database live data."
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L76
            throw r3     // Catch: java.lang.Throwable -> L76
        L81:
            if (r5 == 0) goto L86
            r3.postValue(r4)     // Catch: java.lang.Throwable -> L76
        L86:
            r0.set(r1)
            if (r5 == 0) goto L96
            boolean r0 = r6.get()
            if (r0 != 0) goto L5c
            goto L96
        L92:
            r0.set(r1)
            throw r2
        L96:
            return
        L97:
            java.util.concurrent.ExecutorService r3 = (java.util.concurrent.ExecutorService) r3
            r3.shutdown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.z.run():void");
    }
}
