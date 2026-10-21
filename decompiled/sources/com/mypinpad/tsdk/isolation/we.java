package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0007\b\t\n\u000b\f\r\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/we;", "Ljava/io/Serializable;", "Lcom/mypinpad/tsdk/i/wf;", "p0", "Lcom/mypinpad/tsdk/i/wf;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/wf;", "setX", "Lcom/mypinpad/tsdk/i/vw;", "Lcom/mypinpad/tsdk/i/wj;", "Lcom/mypinpad/tsdk/i/wt;", "Lcom/mypinpad/tsdk/i/wu;", "Lcom/mypinpad/tsdk/i/xg;", "Lcom/mypinpad/tsdk/i/xm;", "Lcom/mypinpad/tsdk/i/xj;"}, k = 1, mv = {1, 8, 0})
public abstract class we implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final wf setX;

    public we(wf wfVar, DefaultConstructorMarker defaultConstructorMarker) {
        this.setX = wfVar;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((we) objArr[0]).setX;
    }

    @JvmName(name = "setOnFocusChangeListener")
    @NotNull
    public final wf setOnFocusChangeListener() {
        return (wf) setDividerPadding(new Object[]{this}, -1987877541, 1987877541, System.identityHashCode(this));
    }
}
