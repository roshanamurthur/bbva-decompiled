package com.mastercard.sonic.androidsvg;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NumberParser.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R$\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/mastercard/sonic/androidsvg/NumberParser;", "", "", "input", "", "startpos", "len", "", "parseNumber", "<set-?>", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getEndPos", "()I", "endPos", "<init>", "()V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class NumberParser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final float[] f51158b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final float[] f51159c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int endPos;

    public final int getEndPos() {
        return this.endPos;
    }

    public final float parseNumber(@Nullable String input, int startpos, int len) {
        boolean z10;
        float f6;
        char cCharAt;
        boolean z11;
        boolean z12;
        this.endPos = startpos;
        if (startpos >= len) {
            return Float.NaN;
        }
        Intrinsics.checkNotNull(input);
        char cCharAt2 = input.charAt(this.endPos);
        if (cCharAt2 == '-') {
            this.endPos++;
            z10 = true;
        } else {
            if (cCharAt2 == '+') {
                this.endPos++;
            }
            z10 = false;
        }
        int i10 = this.endPos;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z13 = false;
        int i14 = 0;
        long j10 = 0;
        while (true) {
            int i15 = this.endPos;
            if (i15 >= len) {
                break;
            }
            char cCharAt3 = input.charAt(i15);
            if (cCharAt3 == '0') {
                if (i11 == 0) {
                    i13++;
                } else {
                    i12++;
                }
            } else if (Intrinsics.compare((int) cCharAt3, 49) >= 0 && Intrinsics.compare((int) cCharAt3, 57) <= 0) {
                int i16 = i11 + i12;
                while (i12 > 0) {
                    if (j10 > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j10 *= (long) 10;
                    i12--;
                }
                if (j10 > 922337203685477580L) {
                    return Float.NaN;
                }
                j10 = (j10 * ((long) 10)) + ((long) (cCharAt3 - '0'));
                i11 = i16 + 1;
                if (j10 < 0) {
                    return Float.NaN;
                }
            } else {
                if (cCharAt3 != '.' || z13) {
                    break;
                }
                i14 = this.endPos - i10;
                z13 = true;
            }
            this.endPos++;
        }
        if (z13 && this.endPos == i14 + 1) {
            return Float.NaN;
        }
        if (i11 == 0) {
            if (i13 == 0) {
                return Float.NaN;
            }
            i11 = 1;
        }
        if (z13) {
            i12 = (i14 - i13) - i11;
        }
        int i17 = this.endPos;
        if (i17 < len && ((cCharAt = input.charAt(i17)) == 'E' || cCharAt == 'e')) {
            int i18 = this.endPos + 1;
            this.endPos = i18;
            if (i18 == len) {
                return Float.NaN;
            }
            char cCharAt4 = input.charAt(i18);
            if (cCharAt4 == '-') {
                this.endPos++;
                z12 = true;
                z11 = false;
            } else {
                if (cCharAt4 == '+') {
                    this.endPos++;
                } else {
                    if (cCharAt4 != '0' && cCharAt4 != '1' && cCharAt4 != '2' && cCharAt4 != '3' && cCharAt4 != '4' && cCharAt4 != '5' && cCharAt4 != '6' && cCharAt4 != '7' && cCharAt4 != '8' && cCharAt4 != '9') {
                        this.endPos--;
                        z11 = true;
                    }
                    z12 = false;
                }
                z11 = false;
                z12 = false;
            }
            if (!z11) {
                int i19 = this.endPos;
                int i20 = 0;
                while (true) {
                    int i21 = this.endPos;
                    if (i21 >= len) {
                        break;
                    }
                    char cCharAt5 = input.charAt(i21);
                    if (Intrinsics.compare((int) cCharAt5, 48) < 0 || Intrinsics.compare((int) cCharAt5, 57) > 0) {
                        break;
                    }
                    if (i20 > 922337203685477580L) {
                        return Float.NaN;
                    }
                    i20 = (i20 * 10) + (cCharAt5 - '0');
                    this.endPos++;
                }
                if (this.endPos == i19) {
                    return Float.NaN;
                }
                i12 = z12 ? i12 - i20 : i12 + i20;
            }
        }
        int i22 = i11 + i12;
        if (i22 > 39 || i22 < -44) {
            return Float.NaN;
        }
        long j11 = j10;
        float f10 = j11;
        if (j11 != 0) {
            if (i12 > 0) {
                f6 = f51158b[i12];
            } else if (i12 < 0) {
                if (i12 < -38) {
                    f10 *= 1.0E-20f;
                    i12 += 20;
                }
                f6 = f51159c[-i12];
            }
            f10 *= f6;
        }
        return z10 ? -f10 : f10;
    }
}
