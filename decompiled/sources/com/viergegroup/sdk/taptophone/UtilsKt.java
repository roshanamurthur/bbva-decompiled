package com.viergegroup.sdk.taptophone;

import android.content.Context;
import android.nfc.NfcAdapter;
import java.util.Base64;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u001a\n\u0010\b\u001a\u00020\u0006*\u00020\u0005¨\u0006\t"}, d2 = {"deviceNfcStatus", "Lcom/viergegroup/sdk/taptophone/DeviceNfcStatus;", "context", "Landroid/content/Context;", "decodeBase64", "", "", "toBase64", "toHexString", "PinPadSdk1032_1.0.32E_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UtilsKt {

    public static final class a extends Lambda implements Function1<Byte, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f67600p0 = new a(1);

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(Byte b10) {
            return ai.a.i(new Object[]{Byte.valueOf(b10.byteValue())}, 1, "%02x", "");
        }
    }

    @NotNull
    public static final byte[] decodeBase64(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArrDecode = Base64.getDecoder().decode(str);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        return bArrDecode;
    }

    @NotNull
    public static final DeviceNfcStatus deviceNfcStatus(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (!context.getPackageManager().hasSystemFeature("android.hardware.nfc") || defaultAdapter == null) {
            return DeviceNfcStatus.NO_NFC;
        }
        return !defaultAdapter.isEnabled() ? DeviceNfcStatus.NFC_DISABLED : DeviceNfcStatus.NFC_ENABLED;
    }

    @NotNull
    public static final String toBase64(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        String strEncodeToString = Base64.getEncoder().encodeToString(bArr);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }

    @NotNull
    public static final String toHexString(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return ArraysKt___ArraysKt.joinToString$default(bArr, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) a.f67600p0, 30, (Object) null);
    }
}
