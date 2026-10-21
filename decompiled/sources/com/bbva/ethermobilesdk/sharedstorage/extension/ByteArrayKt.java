package com.bbva.ethermobilesdk.sharedstorage.extension;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ByteArray.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"", "", "toHex", "toHexStringToByteArray", "shared-storage_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteArray.kt\ncom/bbva/ethermobilesdk/sharedstorage/extension/ByteArrayKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n13316#2,2:38\n*S KotlinDebug\n*F\n+ 1 ByteArray.kt\ncom/bbva/ethermobilesdk/sharedstorage/extension/ByteArrayKt\n*L\n12#1:38,2\n*E\n"})
public final class ByteArrayKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final char[] f29998a;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        f29998a = charArray;
    }

    @NotNull
    public static final String toHex(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            int i10 = (b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) >>> 4;
            char[] cArr = f29998a;
            sb2.append(cArr[i10]);
            sb2.append(cArr[b10 & 15]);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final byte[] toHexStringToByteArray(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() / 2];
        IntProgression intProgressionStep = c.step(c.until(0, str.length()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                char cCharAt = str.charAt(first);
                char[] cArr = f29998a;
                bArr[first >> 1] = (byte) ((ArraysKt___ArraysKt.indexOf(cArr, cCharAt) << 4) | ArraysKt___ArraysKt.indexOf(cArr, str.charAt(first + 1)));
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        return bArr;
    }
}
