package com.mypinpad.tsdk.api.models;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/api/models/PinViewports;", "", "Lcom/mypinpad/tsdk/api/models/PinViewportDp;", "a", "Lcom/mypinpad/tsdk/api/models/PinViewportDp;", "getTransactionPortrait", "()Lcom/mypinpad/tsdk/api/models/PinViewportDp;", "transactionPortrait", "b", "getPinPadPortrait", "pinPadPortrait", "c", "getTransactionLandscape", "transactionLandscape", "d", "getPinPadLandscape", "pinPadLandscape", "<init>", "(Lcom/mypinpad/tsdk/api/models/PinViewportDp;Lcom/mypinpad/tsdk/api/models/PinViewportDp;Lcom/mypinpad/tsdk/api/models/PinViewportDp;Lcom/mypinpad/tsdk/api/models/PinViewportDp;)V"}, k = 1, mv = {1, 8, 0})
public final class PinViewports {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f51708e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51709f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PinViewportDp transactionPortrait;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PinViewportDp pinPadPortrait;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PinViewportDp transactionLandscape;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PinViewportDp pinPadLandscape;

    public PinViewports(@NotNull PinViewportDp pinViewportDp, @NotNull PinViewportDp pinViewportDp2, @NotNull PinViewportDp pinViewportDp3, @NotNull PinViewportDp pinViewportDp4) {
        Intrinsics.checkNotNullParameter(pinViewportDp, "");
        Intrinsics.checkNotNullParameter(pinViewportDp2, "");
        Intrinsics.checkNotNullParameter(pinViewportDp3, "");
        Intrinsics.checkNotNullParameter(pinViewportDp4, "");
        this.transactionPortrait = pinViewportDp;
        this.pinPadPortrait = pinViewportDp2;
        this.transactionLandscape = pinViewportDp3;
        this.pinPadLandscape = pinViewportDp4;
    }

    @JvmName(name = "getPinPadLandscape")
    @NotNull
    public final PinViewportDp getPinPadLandscape() {
        int i10 = f51708e;
        int i11 = (i10 ^ 99) + ((i10 & 99) << 1);
        f51709f = i11 % 128;
        if (i11 % 2 != 0) {
            return this.pinPadLandscape;
        }
        throw null;
    }

    @JvmName(name = "getPinPadPortrait")
    @NotNull
    public final PinViewportDp getPinPadPortrait() {
        int i10 = f51709f;
        int i11 = i10 & 77;
        int i12 = (((i10 | 77) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
        f51708e = i12 % 128;
        if (i12 % 2 == 0) {
            return this.pinPadPortrait;
        }
        throw null;
    }

    @JvmName(name = "getTransactionLandscape")
    @NotNull
    public final PinViewportDp getTransactionLandscape() {
        int i10 = f51709f;
        int i11 = i10 ^ 37;
        int i12 = ((i10 & 37) | i11) << 1;
        int i13 = -i11;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f51708e = i14 % 128;
        if (i14 % 2 == 0) {
            return this.transactionLandscape;
        }
        throw null;
    }

    @JvmName(name = "getTransactionPortrait")
    @NotNull
    public final PinViewportDp getTransactionPortrait() {
        int i10 = f51709f;
        int i11 = ((i10 & 87) - (~(-(-(i10 | 87))))) - 1;
        int i12 = i11 % 128;
        f51708e = i12;
        int i13 = i11 % 2;
        int i14 = i12 ^ 101;
        int i15 = ((i12 & 101) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 & i16) + (i15 | i16);
        f51709f = i17 % 128;
        int i18 = i17 % 2;
        return this.transactionPortrait;
    }
}
