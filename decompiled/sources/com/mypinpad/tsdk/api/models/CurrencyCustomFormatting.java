package com.mypinpad.tsdk.api.models;

import c2.b;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.esotericsoftware.asm.Opcodes;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\r\u0010\u0004JF\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007R\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/api/models/CurrencyCustomFormatting;", "", "", "toString", "()Ljava/lang/String;", "", "component1", "()Z", "component2", "", "component3", "()I", "component4", "component5", "displaySymbol", "designatorAfterValue", "displayExponent", "amountGroupSeparator", "decimalSeparator", "copy", "(ZZILjava/lang/String;Ljava/lang/String;)Lcom/mypinpad/tsdk/api/models/CurrencyCustomFormatting;", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getDisplaySymbol", "b", "getDesignatorAfterValue", "c", com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDisplayExponent", "d", "Ljava/lang/String;", "getAmountGroupSeparator", "e", "getDecimalSeparator", "<init>", "(ZZILjava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CurrencyCustomFormatting {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51669f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f51670g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean displaySymbol;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean designatorAfterValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int displayExponent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String amountGroupSeparator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String decimalSeparator;

    public CurrencyCustomFormatting(boolean z10, boolean z11, int i10, @Nullable String str, @Nullable String str2) {
        this.displaySymbol = z10;
        this.designatorAfterValue = z11;
        this.displayExponent = i10;
        this.amountGroupSeparator = str;
        this.decimalSeparator = str2;
    }

    public static /* synthetic */ CurrencyCustomFormatting copy$default(CurrencyCustomFormatting currencyCustomFormatting, boolean z10, boolean z11, int i10, String str, String str2, int i11, Object obj) {
        boolean z12;
        int i12 = f51669f;
        int i13 = i12 & 51;
        int i14 = (i12 | 51) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        int i17 = i16 % 128;
        f51670g = i17;
        int i18 = i16 % 2;
        if ((i11 & 1) != 0) {
            int i19 = i17 & 3;
            int i20 = (i17 ^ 3) | i19;
            int i21 = (i19 & i20) + (i19 | i20);
            int i22 = i21 % 128;
            f51669f = i22;
            int i23 = i21 % 2;
            boolean z13 = currencyCustomFormatting.displaySymbol;
            int i24 = i22 + 45;
            f51670g = i24 % 128;
            int i25 = i24 % 2;
            z12 = z13;
        } else {
            z12 = z10;
        }
        if ((i11 & 2) != 0) {
            int i26 = f51669f;
            int i27 = (i26 ^ 59) + ((i26 & 59) << 1);
            int i28 = i27 % 128;
            f51670g = i28;
            int i29 = i27 % 2;
            z11 = currencyCustomFormatting.designatorAfterValue;
            int i30 = i28 & 101;
            int i31 = (((i28 ^ 101) | i30) << 1) - ((i28 | 101) & (~i30));
            f51669f = i31 % 128;
            int i32 = i31 % 2;
        }
        boolean z14 = z11;
        if ((i11 & 4) != 0) {
            int i33 = f51669f;
            int i34 = i33 ^ 101;
            int i35 = (i33 & 101) << 1;
            int i36 = (i34 & i35) + (i34 | i35);
            f51670g = i36 % 128;
            int i37 = i36 % 2;
            i10 = currencyCustomFormatting.displayExponent;
            int i38 = i33 & 55;
            int i39 = ((((i33 ^ 55) | i38) << 1) - (~(-((i33 | 55) & (~i38))))) - 1;
            f51670g = i39 % 128;
            int i40 = i39 % 2;
        }
        int i41 = i10;
        if ((i11 & 8) != 0) {
            int i42 = f51669f;
            int i43 = i42 & 95;
            int i44 = (~i43) & (i42 | 95);
            int i45 = i43 << 1;
            int i46 = (i44 ^ i45) + ((i45 & i44) << 1);
            f51670g = i46 % 128;
            if (i46 % 2 == 0) {
                String str3 = currencyCustomFormatting.amountGroupSeparator;
                throw null;
            }
            str = currencyCustomFormatting.amountGroupSeparator;
            int i47 = i42 + 121;
            f51670g = i47 % 128;
            int i48 = i47 % 2;
        }
        String str4 = str;
        if ((i11 & 16) != 0) {
            int i49 = f51669f;
            int i50 = (i49 & (-82)) | ((~i49) & 81);
            int i51 = -(-((i49 & 81) << 1));
            int i52 = ((i50 | i51) << 1) - (i50 ^ i51);
            f51670g = i52 % 128;
            int i53 = i52 % 2;
            str2 = currencyCustomFormatting.decimalSeparator;
            int i54 = i49 + 109;
            f51670g = i54 % 128;
            int i55 = i54 % 2;
        }
        CurrencyCustomFormatting currencyCustomFormattingCopy = currencyCustomFormatting.copy(z12, z14, i41, str4, str2);
        int i56 = f51670g;
        int i57 = ((i56 & 52) + (i56 | 52)) - 1;
        f51669f = i57 % 128;
        if (i57 % 2 == 0) {
            return currencyCustomFormattingCopy;
        }
        throw null;
    }

    public final boolean component1() {
        int i10 = f51669f;
        int i11 = i10 + 113;
        f51670g = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 & 57;
        int i14 = (((i10 ^ 57) | i13) << 1) - ((i10 | 57) & (~i13));
        f51670g = i14 % 128;
        if (i14 % 2 != 0) {
            return this.displaySymbol;
        }
        throw null;
    }

    public final boolean component2() {
        int i10 = f51669f;
        int i11 = i10 & 35;
        int i12 = -(-((i10 ^ 35) | i11));
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f51670g = i14;
        int i15 = i13 % 2;
        int i16 = i14 ^ 19;
        int i17 = (((i14 & 19) | i16) << 1) - i16;
        f51669f = i17 % 128;
        if (i17 % 2 == 0) {
            return this.designatorAfterValue;
        }
        throw null;
    }

    public final int component3() {
        int i10 = f51670g;
        int i11 = ((i10 ^ 82) + ((i10 & 82) << 1)) - 1;
        f51669f = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        int i12 = (i10 ^ 67) + ((i10 & 67) << 1);
        f51669f = i12 % 128;
        int i13 = i12 % 2;
        int i14 = this.displayExponent;
        if (i13 != 0) {
            int i15 = 96 / 0;
        }
        return i14;
    }

    @Nullable
    public final String component4() {
        int i10 = f51670g;
        int i11 = (i10 ^ 31) + ((i10 & 31) << 1);
        f51669f = i11 % 128;
        if (i11 % 2 == 0) {
            return this.amountGroupSeparator;
        }
        throw null;
    }

    @Nullable
    public final String component5() {
        int i10 = f51669f;
        int i11 = ((i10 | 43) << 1) - (i10 ^ 43);
        f51670g = i11 % 128;
        if (i11 % 2 != 0) {
            return this.decimalSeparator;
        }
        throw null;
    }

    @NotNull
    public final CurrencyCustomFormatting copy(boolean displaySymbol, boolean designatorAfterValue, int displayExponent, @Nullable String amountGroupSeparator, @Nullable String decimalSeparator) {
        CurrencyCustomFormatting currencyCustomFormatting = new CurrencyCustomFormatting(displaySymbol, designatorAfterValue, displayExponent, amountGroupSeparator, decimalSeparator);
        int i10 = f51670g;
        int i11 = ((((i10 ^ 119) | (i10 & 119)) << 1) - (~(-(((~i10) & 119) | (i10 & (-120)))))) - 1;
        f51669f = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 41 / 0;
        }
        return currencyCustomFormatting;
    }

    public final boolean equals(@Nullable Object other) {
        int i10 = f51670g;
        int i11 = ((i10 ^ 89) | (i10 & 89)) << 1;
        int i12 = -((i10 & (-90)) | ((~i10) & 89));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        int i14 = i13 % 128;
        f51669f = i14;
        int i15 = i13 % 2;
        if (this == other) {
            int i16 = i10 + 119;
            int i17 = i16 % 128;
            f51669f = i17;
            int i18 = i16 % 2;
            int i19 = (i17 ^ 105) + ((i17 & 105) << 1);
            f51670g = i19 % 128;
            if (i19 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof CurrencyCustomFormatting)) {
            int i20 = i14 & 33;
            int i21 = ((i14 ^ 33) | i20) << 1;
            int i22 = -((~i20) & (i14 | 33));
            int i23 = (i21 & i22) + (i21 | i22);
            int i24 = i23 % 128;
            f51670g = i24;
            int i25 = i23 % 2;
            int i26 = i24 & 73;
            int i27 = i26 + ((i24 ^ 73) | i26);
            f51669f = i27 % 128;
            int i28 = i27 % 2;
            return false;
        }
        CurrencyCustomFormatting currencyCustomFormatting = (CurrencyCustomFormatting) other;
        if (this.displaySymbol != currencyCustomFormatting.displaySymbol) {
            int i29 = (((i10 ^ 93) | (i10 & 93)) << 1) - (((~i10) & 93) | (i10 & (-94)));
            int i30 = i29 % 128;
            f51669f = i30;
            int i31 = i29 % 2;
            int i32 = i30 ^ 113;
            int i33 = (i30 & 113) << 1;
            int i34 = ((i32 | i33) << 1) - (i32 ^ i33);
            f51670g = i34 % 128;
            if (i34 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (this.designatorAfterValue != currencyCustomFormatting.designatorAfterValue) {
            int i35 = (i14 ^ 105) + ((i14 & 105) << 1);
            int i36 = i35 % 128;
            f51670g = i36;
            boolean z10 = i35 % 2 == 0;
            int i37 = (((i36 ^ 69) | (i36 & 69)) << 1) - (((~i36) & 69) | (i36 & (-70)));
            f51669f = i37 % 128;
            int i38 = i37 % 2;
            return z10;
        }
        if (this.displayExponent != currencyCustomFormatting.displayExponent) {
            int i39 = ((i14 | 89) << 1) - (i14 ^ 89);
            f51670g = i39 % 128;
            int i40 = i39 % 2;
            int i41 = i14 + 70;
            int i42 = (i41 ^ (-1)) + (i41 << 1);
            f51670g = i42 % 128;
            int i43 = i42 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.amountGroupSeparator, currencyCustomFormatting.amountGroupSeparator)) {
            int i44 = f51670g;
            int i45 = (i44 & (-98)) | ((~i44) & 97);
            int i46 = -(-((i44 & 97) << 1));
            int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
            f51669f = i47 % 128;
            return i47 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.decimalSeparator, currencyCustomFormatting.decimalSeparator)) {
            int i48 = f51669f + 71;
            f51670g = i48 % 128;
            if (i48 % 2 == 0) {
                int i49 = 80 / 0;
            }
            return true;
        }
        int i50 = f51669f;
        int i51 = (i50 & 57) + (i50 | 57);
        f51670g = i51 % 128;
        int i52 = i51 % 2;
        int i53 = i50 & 43;
        int i54 = (i50 | 43) & (~i53);
        int i55 = -(-(i53 << 1));
        int i56 = (i54 & i55) + (i54 | i55);
        f51670g = i56 % 128;
        if (i56 % 2 == 0) {
            int i57 = 91 / 0;
        }
        return false;
    }

    @JvmName(name = "getAmountGroupSeparator")
    @Nullable
    public final String getAmountGroupSeparator() {
        int i10 = f51670g;
        int i11 = ((-1) << 1) - (((i10 & 84) + (i10 | 84)) ^ (-1));
        int i12 = i11 % 128;
        f51669f = i12;
        int i13 = i11 % 2;
        int i14 = i12 | 83;
        int i15 = (i14 << 1) - (i14 & (~(i12 & 83)));
        f51670g = i15 % 128;
        int i16 = i15 % 2;
        String str = this.amountGroupSeparator;
        if (i16 == 0) {
            int i17 = 74 / 0;
        }
        return str;
    }

    @JvmName(name = "getDecimalSeparator")
    @Nullable
    public final String getDecimalSeparator() {
        int i10 = f51669f;
        int i11 = i10 ^ 91;
        int i12 = ((i10 & 91) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f51670g = i14 % 128;
        int i15 = i14 % 2;
        int i16 = (i10 & (-46)) | ((~i10) & 45);
        int i17 = -(-((i10 & 45) << 1));
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        f51670g = i18 % 128;
        int i19 = i18 % 2;
        return this.decimalSeparator;
    }

    @JvmName(name = "getDesignatorAfterValue")
    public final boolean getDesignatorAfterValue() {
        int i10 = f51669f;
        int i11 = (i10 ^ 30) + ((i10 & 30) << 1);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f51670g = i12 % 128;
        if (i12 % 2 != 0) {
            return this.designatorAfterValue;
        }
        throw null;
    }

    @JvmName(name = "getDisplayExponent")
    public final int getDisplayExponent() {
        int i10 = f51670g;
        int i11 = ((i10 ^ 3) | (i10 & 3)) << 1;
        int i12 = -(((~i10) & 3) | (i10 & (-4)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f51669f = i13 % 128;
        if (i13 % 2 == 0) {
            return this.displayExponent;
        }
        throw null;
    }

    @JvmName(name = "getDisplaySymbol")
    public final boolean getDisplaySymbol() {
        int i10 = f51670g;
        int i11 = i10 & 93;
        int i12 = (((i10 ^ 93) | i11) << 1) - ((i10 | 93) & (~i11));
        int i13 = i12 % 128;
        f51669f = i13;
        if (i12 % 2 != 0) {
            int i14 = 48 / 0;
        }
        int i15 = ((i13 ^ 119) | (i13 & 119)) << 1;
        int i16 = -(((~i13) & 119) | (i13 & (-120)));
        int i17 = (i15 & i16) + (i16 | i15);
        f51670g = i17 % 128;
        int i18 = i17 % 2;
        return this.displaySymbol;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v61 */
    public final int hashCode() {
        ?? r1;
        int iHashCode;
        int i10 = f51669f;
        int i11 = (i10 & (-30)) | ((~i10) & 29);
        int i12 = (i10 & 29) << 1;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f51670g = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        boolean z10 = this.displaySymbol;
        if ((!z10 ? 1 : 0) == 0) {
            r1 = z10;
            int i14 = i10 & 99;
            int i15 = i10 | 99;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            f51670g = i16 % 128;
            int i17 = i16 % 2;
            r1 = 1;
        }
        r1 = z10;
        int i18 = r1 * 31;
        boolean z11 = this.designatorAfterValue;
        ?? r4 = z11;
        if (z11) {
            int i19 = i10 & 7;
            int i20 = (i10 | 7) & (~i19);
            int i21 = i19 << 1;
            int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
            int i23 = i22 % 128;
            f51670g = i23;
            int i24 = i22 % 2;
            int i25 = i23 & 85;
            int i26 = -(-((i23 ^ 85) | i25));
            int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
            f51669f = i27 % 128;
            int i28 = i27 % 2;
            r4 = 1;
        }
        int iIdentityHashCode = System.identityHashCode(this);
        int i29 = ((r4 * (-919)) - (~(-(-(r1 * (-28489)))))) - 1;
        int i30 = ~r4;
        int i31 = ~i18;
        int i32 = i30 & i31;
        int i33 = (~i32) & (i30 | i31);
        int i34 = (i32 & i33) | (i33 ^ i32);
        int i35 = ~iIdentityHashCode;
        int i36 = (i34 & i35) | ((~i34) & iIdentityHashCode);
        int i37 = i34 & iIdentityHashCode;
        int i38 = ~((i37 & i36) | (i36 ^ i37));
        int i39 = i31 | i18;
        int i40 = (~i18) & i39;
        int i41 = ~iIdentityHashCode;
        int i42 = i40 & i41;
        int i43 = (i40 | i41) & (~i42);
        int i44 = (i43 & i42) | (i43 ^ i42);
        int i45 = (i44 & r4) | ((i44 ^ r4) == true ? 1 : 0);
        int i46 = (i45 | (~i45)) & (~i45);
        int i47 = i38 & i46;
        int i48 = (((i38 | i46) & (~i47)) | i47) * 920;
        int i49 = i29 ^ i48;
        int i50 = (((i29 & i48) | i49) << 1) - i49;
        int i51 = ~r4;
        int i52 = ~r4;
        int i53 = i52 | r4;
        int i54 = i51 & i53;
        int i55 = i54 & i31;
        int i56 = (i54 | i31) & (~i55);
        int i57 = (i56 & i55) | (i56 ^ i55);
        int i58 = (i57 | (~i57)) & (~i57);
        int i59 = ((~i35) & i52) | ((~i52) & i35);
        int i60 = i35 & i52;
        int i61 = (i60 & i59) | (i59 ^ i60);
        int i62 = (i61 | (~i61)) & (~i61);
        int i63 = -(-(((i58 & i62) | (i58 ^ i62)) * 920));
        int i64 = (i50 & i63) + (i50 | i63);
        int i65 = i30 & i53;
        int i66 = (~i18) & i39;
        int i67 = (i65 & i66) | (i65 ^ i66);
        int i68 = i67 & i41;
        int i69 = (i67 | i41) & (~i68);
        int i70 = ~((i69 & i68) | (i69 ^ i68));
        int i71 = i30 & i53;
        int i72 = i71 ^ i18;
        int i73 = i71 & i18;
        int i74 = (i73 & i72) | (i72 ^ i73);
        int i75 = i74 & iIdentityHashCode;
        int i76 = (i74 | iIdentityHashCode) & (~i75);
        int i77 = ~((i76 & i75) | (i76 ^ i75));
        int i78 = ((~i77) & i70) | ((~i70) & i77);
        int i79 = i77 & i70;
        int i80 = (i79 & i78) | (i78 ^ i79);
        ?? r3 = i31 ^ r4;
        int i81 = r4 & i31;
        int i82 = ((r3 == true ? 1 : 0) & i81) | ((r3 == true ? 1 : 0) ^ i81);
        int i83 = ~((iIdentityHashCode & i82) | (i82 ^ iIdentityHashCode));
        int i84 = i80 ^ i83;
        int i85 = i83 & i80;
        int i86 = (i64 - (~(-(-(((i85 & i84) | (i84 ^ i85)) * 920))))) - 1;
        int i87 = i86 * 31;
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i88 = this.displayExponent;
        int i89 = i88 * 370;
        int i90 = i86 * 11470;
        int i91 = i89 & i90;
        int i92 = (i89 | i90) & (~i91);
        int i93 = i91 << 1;
        int i94 = (i92 & i93) + (i92 | i93);
        int i95 = ~i87;
        int i96 = (i88 ^ i87) | (i88 & i87);
        int i97 = ~iIdentityHashCode2;
        int i98 = ~iIdentityHashCode2;
        int i99 = i97 & (i98 | iIdentityHashCode2);
        int i100 = i96 & i99;
        int i101 = (i96 | i99) & (~i100);
        int i102 = ((i101 & i100) | (i101 ^ i100)) * (-369);
        int i103 = ((i94 | i102) << 1) - (i102 ^ i94);
        int i104 = ~i88;
        int i105 = ~iIdentityHashCode2;
        int i106 = ~((i105 & i104) | (i104 ^ i105));
        int i107 = -(-(((i106 & i87) | (i87 ^ i106)) * (-369)));
        int i108 = (((~i107) & i103) | ((~i103) & i107)) + ((i107 & i103) << 1);
        int i109 = (i95 | i87) & (~i87);
        int i110 = ((~i88) & i109) | ((~i109) & i88);
        int i111 = i109 & i88;
        int i112 = ~((i111 & i110) | (i110 ^ i111));
        int i113 = i88 & iIdentityHashCode2;
        int i114 = (iIdentityHashCode2 | i88) & (~i113);
        int i115 = ~((i114 & i113) | (i114 ^ i113));
        int i116 = (i115 & i112) | ((~i115) & i112) | ((~i112) & i115);
        int i117 = i104 | i98;
        int i118 = i117 & i87;
        int i119 = (i87 | i117) & (~i118);
        int i120 = (i119 & i118) | (i119 ^ i118);
        int i121 = (i120 | (~i120)) & (~i120);
        int i122 = i116 & i121;
        int i123 = (i121 | i116) & (~i122);
        int i124 = -(-(((i123 & i122) | (i123 ^ i122)) * 369));
        int i125 = i108 & i124;
        int iE = b.e(i125, ~(-(-((i124 ^ i108) | i125))), 1, 31);
        int iHashCode2 = 0;
        String str = this.amountGroupSeparator;
        if (str == null) {
            int i126 = f51669f;
            int i127 = (i126 & 103) + (i126 | 103);
            f51670g = i127 % 128;
            int i128 = i127 % 2;
            int i129 = (i126 & 73) + (i126 | 73);
            f51670g = i129 % 128;
            int i130 = i129 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i131 = f51670g;
            int i132 = (i131 & (-106)) | ((~i131) & 105);
            int i133 = -(-((i131 & 105) << 1));
            int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
            f51669f = i134 % 128;
            int i135 = i134 % 2;
        }
        int i136 = -(~(-(-iHashCode)));
        int i137 = ((iE & i136) + (iE | i136)) - 1;
        int i138 = i137 * 31;
        String str2 = this.decimalSeparator;
        if (str2 == null) {
            int i139 = f51669f + 35;
            f51670g = i139 % 128;
            if (i139 % 2 == 0) {
                iHashCode2 = 1;
            }
        } else {
            iHashCode2 = str2.hashCode();
            int i140 = f51670g;
            int i141 = ((-1) << 1) - ((((i140 | 100) << 1) - (i140 ^ 100)) ^ (-1));
            f51669f = i141 % 128;
            int i142 = i141 % 2;
        }
        int iIdentityHashCode3 = System.identityHashCode(this);
        int i143 = iHashCode2 * (-381);
        int i144 = -(-(i137 * 5952));
        int i145 = i143 & i144;
        int i146 = (i144 | i143) & (~i145);
        int i147 = -(-(i145 << 1));
        int i148 = ((i146 | i147) << 1) - (i146 ^ i147);
        int i149 = ~iHashCode2;
        int i150 = -(~(-(-((((~iHashCode2) | iHashCode2) & i149) * (-191)))));
        int i151 = ((i148 & i150) + (i150 | i148)) - 1;
        int i152 = (~iIdentityHashCode3) & i138;
        int i153 = ~i138;
        int i154 = (i151 - (~(-(~(-(-((iHashCode2 | (~((i152 | (iIdentityHashCode3 & i153)) | (i138 & iIdentityHashCode3)))) * Opcodes.ATHROW))))))) - 2;
        int i155 = (i149 & i153) | ((~i149) & i138);
        int i156 = i149 & i138;
        int i157 = ~((i155 & i156) | (i155 ^ i156));
        int i158 = ~iIdentityHashCode3;
        int i159 = (i158 & i153) | ((~i158) & i138);
        int i160 = i138 & i158;
        int i161 = ~((i160 & i159) | (i159 ^ i160));
        int i162 = ((~i161) & i157) | ((~i157) & i161);
        int i163 = i161 & i157;
        int i164 = -(~(-(-(((i163 & i162) | (i162 ^ i163)) * Opcodes.ATHROW))));
        int i165 = ((i154 ^ i164) + ((i164 & i154) << 1)) - 1;
        int i166 = f51669f + 76;
        int i167 = (i166 ^ (-1)) + (i166 << 1);
        f51670g = i167 % 128;
        int i168 = i167 % 2;
        return i165;
    }

    @NotNull
    public final String toString() {
        int i10 = f51670g;
        int i11 = ((i10 ^ 105) | (i10 & 105)) << 1;
        int i12 = -(((~i10) & 105) | (i10 & (-106)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f51669f = i13 % 128;
        if (i13 % 2 == 0) {
            return "ccf";
        }
        throw null;
    }

    public /* synthetic */ CurrencyCustomFormatting(boolean z10, boolean z11, int i10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, z11, i10, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : str2);
    }
}
