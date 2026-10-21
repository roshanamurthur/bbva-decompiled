package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\r\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014"}, d2 = {"Lcom/mypinpad/tsdk/i/wi;", "Ljava/io/Serializable;", "Lcom/mypinpad/tsdk/i/wm;", "p0", "Lcom/mypinpad/tsdk/i/wm;", "getNavBarTitleString", "()Lcom/mypinpad/tsdk/i/wm;", "setY", "Lcom/mypinpad/tsdk/i/vg;", "Lcom/mypinpad/tsdk/i/vs;", "Lcom/mypinpad/tsdk/i/vq;", "Lcom/mypinpad/tsdk/i/vu;", "Lcom/mypinpad/tsdk/i/vv;", "Lcom/mypinpad/tsdk/i/wa;", "Lcom/mypinpad/tsdk/i/vy;", "Lcom/mypinpad/tsdk/i/wn;", "Lcom/mypinpad/tsdk/i/wo;", "Lcom/mypinpad/tsdk/i/wp;", "Lcom/mypinpad/tsdk/i/ww;", "Lcom/mypinpad/tsdk/i/xa;", "Lcom/mypinpad/tsdk/i/wx;"}, k = 1, mv = {1, 8, 0})
public abstract class wi implements Serializable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f61656q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wm setY;

    public wi(wm wmVar, DefaultConstructorMarker defaultConstructorMarker) {
        this.setY = wmVar;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        wi wiVar = (wi) objArr[0];
        int i13 = f61656q0;
        int i14 = i13 & 19;
        int i15 = ((i13 | 19) & (~i14)) + (i14 << 1);
        int i16 = i15 % 128;
        int i17 = i15 % 2;
        wm wmVar = wiVar.setY;
        int i18 = (-2) - ((i16 + 40) ^ (-1));
        f61656q0 = i18 % 128;
        if (i18 % 2 == 0) {
            return wmVar;
        }
        throw null;
    }

    @JvmName(name = "getNavBarTitleString")
    @NotNull
    public final wm getNavBarTitleString() {
        return (wm) setCompoundDrawableTintBlendMode(new Object[]{this}, 1332936684, -1332936684, System.identityHashCode(this));
    }
}
