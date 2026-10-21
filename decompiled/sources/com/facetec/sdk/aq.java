package com.facetec.sdk;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes9.dex */
abstract class aq extends Fragment {

    public class b implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f40374c;

        public b(Runnable runnable) {
            this.f40374c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Activity activity;
            aq aqVar = aq.this;
            if (aqVar == null || !aqVar.isAdded() || (activity = aqVar.getActivity()) == null || activity.isFinishing()) {
                return;
            }
            this.f40374c.run();
        }
    }

    public static void a(b bVar, long j10) {
        new Handler(Looper.getMainLooper()).postDelayed(bVar, j10);
    }

    public final void b(Runnable runnable) {
        if (getActivity() == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new b(runnable));
    }

    public final void d(Runnable runnable, long j10) {
        a(new b(runnable), j10);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void b(Runnable runnable, long j10) {
        new Handler().postDelayed(new b(runnable), j10);
    }
}
