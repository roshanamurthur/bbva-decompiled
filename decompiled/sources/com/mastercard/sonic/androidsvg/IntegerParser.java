package com.mastercard.sonic.androidsvg;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntegerParser.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\t\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/mastercard/sonic/androidsvg/IntegerParser;", "", "", "value", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getEndPos", "()I", "endPos", "", "<init>", "(JI)V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class IntegerParser {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f51156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int endPos;

    /* JADX INFO: compiled from: IntegerParser.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ(\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/mastercard/sonic/androidsvg/IntegerParser$Companion;", "", "()V", "parseHex", "Lcom/mastercard/sonic/androidsvg/IntegerParser;", "input", "", "startpos", "", "len", "parseInt", "includeSign", "", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final IntegerParser parseHex(@NotNull String input, int startpos, int len) {
            long j10;
            int i10;
            long j11;
            long j12;
            Intrinsics.checkNotNullParameter(input, "input");
            if (startpos >= len) {
                return null;
            }
            long j13 = 0;
            int i11 = startpos;
            while (i11 < len) {
                char cCharAt = input.charAt(i11);
                if (Intrinsics.compare((int) cCharAt, 48) < 0 || Intrinsics.compare((int) cCharAt, 57) > 0) {
                    if (Intrinsics.compare((int) cCharAt, 65) >= 0 && Intrinsics.compare((int) cCharAt, 70) <= 0) {
                        j10 = j13 * ((long) 16);
                        i10 = cCharAt - 'A';
                    } else {
                        if (Intrinsics.compare((int) cCharAt, 97) < 0 || Intrinsics.compare((int) cCharAt, 102) > 0) {
                            break;
                        }
                        j10 = j13 * ((long) 16);
                        i10 = cCharAt - 'a';
                    }
                    j11 = j10 + ((long) i10);
                    j12 = 10;
                } else {
                    j11 = j13 * ((long) 16);
                    j12 = cCharAt - '0';
                }
                j13 = j11 + j12;
                if (j13 > 4294967295L) {
                    return null;
                }
                i11++;
            }
            if (i11 == startpos) {
                return null;
            }
            return new IntegerParser(j13, i11);
        }

        @Nullable
        public final IntegerParser parseInt(@NotNull String input, int startpos, int len, boolean includeSign) {
            Intrinsics.checkNotNullParameter(input, "input");
            if (startpos >= len) {
                return null;
            }
            boolean z10 = false;
            if (includeSign) {
                char cCharAt = input.charAt(startpos);
                if (cCharAt == '-') {
                    startpos++;
                    z10 = true;
                } else if (cCharAt == '+') {
                    startpos++;
                }
            }
            long j10 = 0;
            int i10 = startpos;
            while (i10 < len) {
                char cCharAt2 = input.charAt(i10);
                if (Intrinsics.compare((int) cCharAt2, 48) < 0 || Intrinsics.compare((int) cCharAt2, 57) > 0) {
                    break;
                }
                if (z10) {
                    j10 = (j10 * ((long) 10)) - ((long) (cCharAt2 - '0'));
                    if (j10 < -2147483648L) {
                        return null;
                    }
                } else {
                    j10 = (j10 * ((long) 10)) + ((long) (cCharAt2 - '0'));
                    if (j10 > 2147483647L) {
                        return null;
                    }
                }
                i10++;
            }
            if (i10 == startpos) {
                return null;
            }
            return new IntegerParser(j10, i10);
        }
    }

    public IntegerParser(long j10, int i10) {
        this.f51156a = j10;
        this.endPos = i10;
    }

    public final int getEndPos() {
        return this.endPos;
    }

    public final int value() {
        return (int) this.f51156a;
    }
}
