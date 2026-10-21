package h3;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: GhostViewPlatform.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class e implements d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static Class<?> f69306q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static boolean f69307r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static Method f69308s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static boolean f69309t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static Method f69310u0;
    public static boolean v0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final View f69311p0;

    public e(@NonNull View view) {
        this.f69311p0 = view;
    }

    @Override // h3.d
    public final void setVisibility(int i10) {
        this.f69311p0.setVisibility(i10);
    }

    @Override // h3.d
    public final void a(ViewGroup viewGroup, View view) {
    }
}
