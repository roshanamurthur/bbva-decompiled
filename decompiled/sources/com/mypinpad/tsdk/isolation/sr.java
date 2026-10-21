package com.mypinpad.tsdk.isolation;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\b"}, d2 = {"Lcom/mypinpad/tsdk/i/sr;", "Ljava/io/Serializable;", "", "p0", "Ljava/lang/String;", "setY", "()Ljava/lang/String;", "setDividerPadding", "Lcom/mypinpad/tsdk/i/st;"}, k = 1, mv = {1, 8, 0})
public abstract class sr implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setDividerPadding;

    public sr(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.setDividerPadding = str;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return ((sr) objArr[0]).setDividerPadding;
    }

    @JvmName(name = "setY")
    @NotNull
    public final String setY() {
        return (String) setY(new Object[]{this}, 213627831, -213627831, System.identityHashCode(this));
    }
}
