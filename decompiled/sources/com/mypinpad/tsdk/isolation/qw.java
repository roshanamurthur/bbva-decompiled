package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/mypinpad/tsdk/i/qw;", "Ljava/io/Serializable;", "", "p0", "Ljava/lang/String;", "setDividerPadding", "()Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/ra;", "Lcom/mypinpad/tsdk/i/rc;", "Lcom/mypinpad/tsdk/i/qy;"}, k = 1, mv = {1, 8, 0})
public abstract class qw implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String setDividerPadding;

    public qw(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.setDividerPadding = str;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((qw) objArr[0]).setDividerPadding;
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final String setDividerPadding() {
        return (String) setDividerPadding(new Object[]{this}, 1687366083, -1687366083, System.identityHashCode(this));
    }
}
