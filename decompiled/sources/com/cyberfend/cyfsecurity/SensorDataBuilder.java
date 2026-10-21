package com.cyberfend.cyfsecurity;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class SensorDataBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f39252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SensorDataBuilder f39253b = new SensorDataBuilder();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (SensorDataBuilder.f39252a) {
                return;
            }
            SensorDataBuilder.this.initializeKeyN();
        }
    }

    static {
        f39252a = false;
        try {
            System.loadLibrary("akamaibmp");
        } catch (Exception unused) {
            f39252a = true;
        } catch (UnsatisfiedLinkError unused2) {
            f39252a = true;
        }
    }

    public static SensorDataBuilder a() {
        return f39253b;
    }

    public final native synchronized String buildN(ArrayList<Pair<String, String>> arrayList);

    public final native synchronized void initializeKeyN();
}
