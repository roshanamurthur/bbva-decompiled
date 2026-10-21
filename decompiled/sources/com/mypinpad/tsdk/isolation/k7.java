package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class k7 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f56756q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56757r0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0<Object> f56758p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(Function0<Object> function0) {
        super(0);
        this.f56758p0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        System.identityHashCode(this);
        k7 k7Var = (k7) new Object[]{this}[0];
        int i10 = f56757r0;
        int i11 = i10 ^ 123;
        int i12 = ((((i10 & 123) | i11) << 1) - (~(-i11))) - 1;
        f56756q0 = i12 % 128;
        int i13 = i12 % 2;
        Function0<Object> function0 = k7Var.f56758p0;
        if (i13 != 0) {
            function0.invoke();
            throw null;
        }
        Object objInvoke = function0.invoke();
        int i14 = f56756q0 + 29;
        f56757r0 = i14 % 128;
        int i15 = i14 % 2;
        return objInvoke;
    }
}
