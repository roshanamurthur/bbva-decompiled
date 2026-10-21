package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\b\t"}, d2 = {"Lcom/mypinpad/tsdk/i/getMetadata;", "", "Lcom/mypinpad/tsdk/i/mv;", "a", "Lcom/mypinpad/tsdk/i/mv;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/mv;", "setY", "Lcom/mypinpad/tsdk/i/setContentInsetsRelative;", "Lcom/mypinpad/tsdk/i/setImeOptions;"}, k = 1, mv = {1, 5, 1})
public abstract class getMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final mv setY;

    public getMetadata(mv mvVar, DefaultConstructorMarker defaultConstructorMarker) {
        this.setY = mvVar;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return ((getMetadata) objArr[0]).setY;
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final mv setDividerPadding() {
        return (mv) setDividerPadding(new Object[]{this}, -815815505, 815815505, System.identityHashCode(this));
    }
}
