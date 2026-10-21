package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class j7 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0<Object> f56611p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(Function0<Object> function0) {
        super(0);
        this.f56611p0 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object[] objArr = {this};
        System.identityHashCode(this);
        return ((j7) objArr[0]).f56611p0.invoke();
    }
}
