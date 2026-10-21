package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayInputStream;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setImageIcon implements setTypeface {
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr = (byte[]) objArr[1];
        byte[] bArr2 = (byte[]) objArr[2];
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr2);
        amc amcVar = new amc();
        amc.setDividerPadding(new Object[]{amcVar, new ann(bArr)}, -2118815591, 2118815595, System.identityHashCode(amcVar));
        Unit unit = Unit.INSTANCE;
        amm ammVar = new amm(byteArrayInputStream, new akh(amcVar));
        try {
            byte[] bytes = ByteStreamsKt.readBytes(ammVar);
            CloseableKt.closeFinally(ammVar, null);
            return bytes;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(ammVar, th2);
                throw th3;
            }
        }
    }

    @Override // com.mypinpad.tsdk.isolation.setTypeface
    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        return (byte[]) setOnFocusChangeListener(new Object[]{this, bArr, bArr2}, 233007759, -233007759, System.identityHashCode(this));
    }
}
