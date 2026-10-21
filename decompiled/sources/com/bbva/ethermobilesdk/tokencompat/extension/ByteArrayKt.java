package com.bbva.ethermobilesdk.tokencompat.extension;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ByteArray.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¨\u0006\u0007"}, d2 = {"resized", "", "newSize", "", "fillByte", "Lkotlin/Function1;", "", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ByteArrayKt {

    /* JADX INFO: compiled from: ByteArray.kt */
    public static final class a extends Lambda implements Function1<Integer, Byte> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f30464p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Byte invoke(Integer num) {
            num.intValue();
            return (byte) 0;
        }
    }

    @NotNull
    public static final byte[] resized(@NotNull byte[] bArr, int i10, @NotNull Function1<? super Integer, Byte> fillByte) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(fillByte, "fillByte");
        if (i10 == bArr.length) {
            return bArr;
        }
        if (i10 < bArr.length) {
            return CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(bArr, new IntRange(0, i10 - 1)));
        }
        byte[] bArr2 = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr2[i11] = fillByte.invoke(Integer.valueOf(i11)).byteValue();
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static /* synthetic */ byte[] resized$default(byte[] bArr, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            function1 = a.f30464p0;
        }
        return resized(bArr, i10, function1);
    }
}
