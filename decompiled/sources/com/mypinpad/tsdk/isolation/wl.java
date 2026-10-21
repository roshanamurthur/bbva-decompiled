package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000e\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014"}, d2 = {"Lcom/mypinpad/tsdk/i/wl;", "Ljava/io/Serializable;", "Lcom/mypinpad/tsdk/i/wm;", "p0", "Lcom/mypinpad/tsdk/i/wm;", "setY", "()Lcom/mypinpad/tsdk/i/wm;", "Lcom/mypinpad/tsdk/i/vn;", "Lcom/mypinpad/tsdk/i/vp;", "Lcom/mypinpad/tsdk/i/vt;", "Lcom/mypinpad/tsdk/i/vx;", "Lcom/mypinpad/tsdk/i/vz;", "Lcom/mypinpad/tsdk/i/wc;", "Lcom/mypinpad/tsdk/i/wb;", "Lcom/mypinpad/tsdk/i/wg;", "Lcom/mypinpad/tsdk/i/wr;", "Lcom/mypinpad/tsdk/i/wq;", "Lcom/mypinpad/tsdk/i/ws;", "Lcom/mypinpad/tsdk/i/wv;", "Lcom/mypinpad/tsdk/i/xb;", "Lcom/mypinpad/tsdk/i/wz;"}, k = 1, mv = {1, 8, 0})
public abstract class wl implements Serializable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61661q0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wm setY;

    public wl(wm wmVar, DefaultConstructorMarker defaultConstructorMarker) {
        this.setY = wmVar;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        wl wlVar = (wl) objArr[0];
        int i13 = f61661q0 + 121;
        int i14 = i13 % 128;
        int i15 = i13 % 2;
        wm wmVar = wlVar.setY;
        int i16 = ((i14 | 65) << 1) - (((~i14) & 65) | (i14 & (-66)));
        f61661q0 = i16 % 128;
        int i17 = i16 % 2;
        return wmVar;
    }

    @JvmName(name = "setY")
    @NotNull
    public final wm setY() {
        return (wm) setOnFocusChangeListener(new Object[]{this}, 450664847, -450664847, System.identityHashCode(this));
    }
}
