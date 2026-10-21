package com.veridas.util;

import com.veridas.Veridas;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ByteArrayUtil.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00020\u0006\"\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/veridas/util/ByteArrayUtil;", "", "()V", "byteArrayOfInts", "", "ints", "", "", "toByteArray", "data", "", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ByteArrayUtil {

    @NotNull
    public static final ByteArrayUtil INSTANCE = new ByteArrayUtil();

    @JvmStatic
    @NotNull
    public static final byte[] byteArrayOfInts(@NotNull int... ints) {
        Intrinsics.checkNotNullParameter(ints, "ints");
        int length = ints.length;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) ints[i10];
        }
        return bArr;
    }

    @JvmStatic
    @NotNull
    public static final byte[] toByteArray(@Nullable String data) {
        byte[] bArrArray = Charset.forName(Veridas.US_ASCII).encode(data).array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }
}
