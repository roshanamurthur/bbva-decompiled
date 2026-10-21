package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002:\u0001)B'\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003¢\u0006\u0004\b'\u0010(J\u001a\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u001f\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0014\u0010 \u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0016R\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\u0016R\u0016\u0010\"\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0014R\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0014R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010\u0016\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/kernel/common/security/cacertificate/model/IssuerPublicKeyCertificate;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/security/cacertificate/model/PublicKeyCertificate;", "Lcom/mypinpad/softpos/emv/terminal/common/utils/security/SensitiveData;", "", "raw", "", "startPosition", "deserialize", "Lcom/mypinpad/softpos/emv/terminal/common/utils/DateProviderInternal;", "dateProvider", GoogleTapAndPay.KEY_PAN, "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "junkifySensitiveData", "validateHash", "certAuthPublicKeyModulusLength", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "", "certificateFormat", "B", "certificateSerialNumber", "[B", "getCertificateSerialNumber", "()[B", "setCertificateSerialNumber", "([B)V", "hashResult", "issuerIdentifier", "issuerPublicKeyExponentLength", "Lkotlin/UByte;", "issuerPublicKeyLength", "issuerPublicKeyRemainder", "issuerPublicKeyorLeftmostDigitsofIssuerPublicKey", "recoveredDataHeader", "recoveredDataTrailer", "unpaddedIssuerPublicKeyorLeftmostDigitsofIssuerPublicKey", "issuerCertData", "issuerPublicKeyExponent", "<init>", "([BI[B[B)V", "Companion", "common"}, k = 1, mv = {1, 5, 1})
public final class dj extends dl implements getRrn {

    @NotNull
    public static final setY setY = new setY(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f55201t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f55202u = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f55203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final byte[] f55204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f55205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f55206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f55207l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f55208n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f55209o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f55210p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f55211q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f55212r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte f55213s;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/dj$setY;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p0", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p1", "Lcom/mypinpad/tsdk/i/dg;", "p2", "Lcom/mypinpad/tsdk/i/dj;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setContentDescription;Lcom/mypinpad/tsdk/i/dg;)Lcom/mypinpad/tsdk/i/dj;", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class setY {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f55214a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55215b = 1;

        public setY() {
        }

        public /* synthetic */ setY(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public static dj setOnFocusChangeListener(@NotNull setScrollBarDefaultDelayBeforeFade p4, @NotNull setContentDescription p10, @NotNull dg p11) {
            return (dj) setX(new Object[]{p4, p10, p11}, 1210480347, -1210480347, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Code duplicated, block: B:39:0x023e  */
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            dj djVar;
            byte[] bArrPlus;
            byte[] bArr;
            byte[] bArr2;
            byte[] bArr3;
            byte[] bArr4;
            int i13 = ~((~i10) | i11);
            if ((((~(i10 | i12)) | (~((~i11) | i10)) | i13) * 70) + ((~(i10 | i11 | i12)) * 70) + (((~(i11 | i12)) | i13) * (-140)) + (i11 * (-69)) + (i10 * 71) == 1) {
                setContentDescription setcontentdescription = (setContentDescription) objArr[0];
                byte[] bArr5 = (byte[]) objArr[1];
                byte[] bArr6 = (byte[]) objArr[2];
                byte[] bArr7 = (byte[]) objArr[3];
                byte[] bArr8 = (byte[]) objArr[4];
                byte[] bArr9 = (byte[]) objArr[5];
                byte[] bArr10 = (byte[]) objArr[6];
                Intrinsics.checkNotNullParameter(setcontentdescription, "");
                if (bArr10 == null || bArr9 == null || bArr6 == null || bArr7 == null || bArr6.length != bArr9.length) {
                    djVar = null;
                } else {
                    dl.Companion companion = dl.INSTANCE;
                    dj djVar2 = new dj((byte[]) dl.Companion.setOnFocusChangeListener(new Object[]{bArr6, bArr9, bArr10}, -1375611456, 1375611456, (int) System.currentTimeMillis()), bArr9.length, bArr8 == null ? new byte[0] : bArr8, bArr7);
                    if (((Boolean) dj.setOnFocusChangeListener(new Object[]{djVar2, setcontentdescription, bArr5}, 1106449623, -1106449616, (int) System.currentTimeMillis())).booleanValue()) {
                        if (bArr8 != null) {
                            byte[] bArr11 = (byte[]) dj.setOnFocusChangeListener(new Object[]{djVar2}, -144062741, 144062742, (int) System.currentTimeMillis());
                            if (bArr11 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                bArr = null;
                            } else {
                                bArr = bArr11;
                            }
                            bArrPlus = ArraysKt___ArraysJvmKt.plus(bArr, bArr8);
                        } else {
                            byte[] bArr12 = (byte[]) dj.setOnFocusChangeListener(new Object[]{djVar2}, -144062741, 144062742, (int) System.currentTimeMillis());
                            if (bArr12 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                bArrPlus = null;
                            } else {
                                bArrPlus = bArr12;
                            }
                        }
                        dl.setCompoundDrawableTintBlendMode(new Object[]{djVar2, bArrPlus}, -2023844664, 2023844664, System.identityHashCode(djVar2));
                        djVar = djVar2;
                    } else {
                        djVar = null;
                    }
                }
                return djVar;
            }
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
            setContentDescription setcontentdescription2 = (setContentDescription) objArr[1];
            dg dgVar = (dg) objArr[2];
            int i14 = f55215b;
            int i15 = ((i14 ^ 85) | (i14 & 85)) << 1;
            int i16 = -(((~i14) & 85) | (i14 & (-86)));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            f55214a = i17 % 128;
            if (i17 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                Intrinsics.checkNotNullParameter(setcontentdescription2, "");
                Intrinsics.checkNotNullParameter(dgVar, "");
                setAnimation setanimation = setAnimation.INSTANCE;
                throw null;
            }
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(setcontentdescription2, "");
            Intrinsics.checkNotNullParameter(dgVar, "");
            setAnimation setanimation2 = setAnimation.INSTANCE;
            getBeepOnFailure getbeeponfailure = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], 727546065, -727545958, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            if (getbeeponfailure == null) {
                int i18 = f55215b;
                int i19 = ((i18 ^ 95) | (i18 & 95)) << 1;
                int i20 = -(((~i18) & 95) | (i18 & (-96)));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f55214a = i21 % 128;
                int i22 = i21 % 2;
                bArr2 = null;
            } else {
                bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                int i23 = f55214a;
                int i24 = i23 & 105;
                int i25 = ((((i23 ^ 105) | i24) << 1) - (~(-((i23 | 105) & (~i24))))) - 1;
                f55215b = i25 % 128;
                int i26 = i25 % 2;
            }
            getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, setAnimation.setAccessibilityTraversalAfter()}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            if (getbeeponfailure2 == null) {
                int i27 = f55214a + 111;
                f55215b = i27 % 128;
                if (i27 % 2 == 0) {
                    int i28 = 13 / 0;
                }
                bArr3 = null;
            } else {
                bArr3 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                int i29 = f55214a;
                int i30 = i29 & 111;
                int i31 = -(-((i29 ^ 111) | i30));
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f55215b = i32 % 128;
                int i33 = i32 % 2;
            }
            getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, (TransactionFailed) setAnimation.setY(new Object[0], 34771733, -34771475, (int) System.currentTimeMillis())}, -1593889019, 1593889062, System.identityHashCode(setscrollbardefaultdelaybeforefade));
            if (getbeeponfailure3 == null) {
                int i34 = f55214a;
                int i35 = (i34 & 99) + (i34 | 99);
                int i36 = i35 % 128;
                f55215b = i36;
                if (i35 % 2 == 0) {
                    int i37 = 84 / 0;
                }
                int i38 = (i36 ^ 123) + ((i36 & 123) << 1);
                f55214a = i38 % 128;
                int i39 = i38 % 2;
                bArr4 = null;
            } else {
                bArr4 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 252497730, -252497710, System.identityHashCode(getbeeponfailure3));
                int i40 = f55215b;
                int i41 = i40 & 123;
                int i42 = i40 | 123;
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f55214a = i43 % 128;
                int i44 = i43 % 2;
            }
            dj djVar3 = (dj) setX(new Object[]{setcontentdescription2, setscrollbardefaultdelaybeforefade.setImageResource(), bArr2, bArr3, bArr4, (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dgVar}, -2004011430, 2004011432, System.identityHashCode(dgVar)), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{dgVar}, -2055662065, 2055662076, System.identityHashCode(dgVar))}, 1414016093, -1414016092, (int) System.currentTimeMillis());
            int i45 = f55215b;
            int i46 = ((i45 & (-90)) | ((~i45) & 89)) + ((i45 & 89) << 1);
            f55214a = i46 % 128;
            if (i46 % 2 == 0) {
                return djVar3;
            }
            throw null;
        }
    }

    static {
        int i10 = f55201t;
        int i11 = i10 & 91;
        int i12 = (i10 | 91) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f55202u = i14 % 128;
        int i15 = i14 % 2;
    }

    public dj(@NotNull byte[] bArr, int i10, @NotNull byte[] bArr2, @NotNull byte[] bArr3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        this.f55203h = i10;
        this.f55204i = bArr2;
        dl.setCompoundDrawableTintBlendMode(new Object[]{this, bArr3}, 849699746, -849699741, System.identityHashCode(this));
        ((Integer) setOnFocusChangeListener(new Object[]{this, bArr}, 1694674453, -1694674448, (int) System.currentTimeMillis())).intValue();
        getRrn.Companion.setCompoundDrawableTintBlendMode(new Object[]{this}, 1708259647, -1708259646, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0067 A[PHI: r7 r10
      0x0067: PHI (r7v61 byte[]) = (r7v8 byte[]), (r7v66 byte[]) binds: [B:8:0x0053, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r10v26 int) = (r10v0 int), (r10v27 int) binds: [B:8:0x0053, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0055 A[PHI: r10
      0x0055: PHI (r10v1 int) = (r10v0 int), (r10v27 int) binds: [B:8:0x0053, B:5:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Integer a(Object[] objArr) {
        byte[] bArrSliceArray;
        int i10;
        byte[] bArrSliceArray2;
        dj djVar = (dj) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i11 = f55201t;
        int i12 = ((i11 ^ 72) + ((i11 & 72) << 1)) - 1;
        f55202u = i12 % 128;
        if (i12 % 2 == 0) {
            djVar.f55205j = bArr[0];
            djVar.f55206k = bArr[1];
            bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr, c.until(4, 13));
            djVar.f55207l = bArrSliceArray;
            i10 = 3;
            if (bArrSliceArray == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i13 = f55201t;
                int i14 = (i13 ^ 89) + ((i13 & 89) << 1);
                f55202u = i14 % 128;
                int i15 = i14 % 2;
                bArrSliceArray = null;
            } else {
                int i16 = f55202u;
                int i17 = i16 & 101;
                int i18 = i17 + ((i16 ^ 101) | i17);
                f55201t = i18 % 128;
                int i19 = i18 % 2;
            }
        } else {
            djVar.f55205j = bArr[0];
            djVar.f55206k = bArr[1];
            bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr, c.until(2, 6));
            djVar.f55207l = bArrSliceArray;
            i10 = 2;
            if (bArrSliceArray == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i110 = f55201t;
                int i111 = (i110 ^ 89) + ((i110 & 89) << 1);
                f55202u = i111 % 128;
                int i112 = i111 % 2;
                bArrSliceArray = null;
            } else {
                int i113 = f55202u;
                int i114 = i113 & 101;
                int i115 = i114 + ((i113 ^ 101) | i114);
                f55201t = i115 % 128;
                int i116 = i115 % 2;
            }
        }
        int length = bArrSliceArray.length;
        int i20 = ((((~length) & i10) | ((~i10) & length)) - (~(-(-((length & i10) << 1))))) - 1;
        int i21 = (i20 & (-3)) | ((~i20) & 2);
        int i22 = i20 & 2;
        int i23 = i22 << 1;
        dl.setCompoundDrawableTintBlendMode(new Object[]{djVar, ArraysKt___ArraysKt.sliceArray(bArr, c.until(i20, (i21 & i23) + (i21 | i23)))}, 454696279, -454696269, System.identityHashCode(djVar));
        int i24 = i20 ^ 2;
        int i25 = (i22 | i24) << 1;
        int i26 = -i24;
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        int i28 = i27 & 3;
        setOnFocusChangeListener(new Object[]{djVar, ArraysKt___ArraysKt.sliceArray(bArr, c.until(i27, (i28 - (~((i27 ^ 3) | i28))) - 1))}, 1401654641, -1401654633, System.identityHashCode(djVar));
        int length2 = ((byte[]) setOnFocusChangeListener(new Object[]{djVar}, -792361021, 792361021, System.identityHashCode(djVar))).length;
        int i29 = length2 * 615;
        int i30 = -(~(-(-(i27 * (-613)))));
        int i31 = ((i29 | i30) << 1) - (i29 ^ i30);
        int i32 = (i31 ^ (-1)) + (i31 << 1);
        int i33 = ~length2;
        int i34 = ~(i33 | i27);
        int i35 = (i34 & iIntValue) | (iIntValue ^ i34);
        int i36 = ~i27;
        int i37 = (i36 | i27) & i36;
        int i38 = ~((i37 ^ length2) | (i37 & length2));
        int i39 = i35 ^ i38;
        int i40 = i35 & i38;
        int i41 = -(-(((i39 & i40) | (i39 ^ i40)) * 614));
        int i42 = i32 & i41;
        int i43 = -(-((i32 ^ i41) | i42));
        int i44 = (i42 & i43) + (i43 | i42);
        int i45 = ~iIntValue;
        int i46 = ~i45;
        int i47 = (i33 & i46) | ((~i33) & i45);
        int i48 = i33 & i45;
        int i49 = ~((i47 ^ i48) | (i47 & i48));
        int i50 = i33 ^ i27;
        int i51 = i33 & i27;
        int i52 = ~((i50 ^ i51) | (i50 & i51));
        int i53 = (i49 ^ i52) | (i52 & i49);
        int i54 = (i45 | iIntValue) & i45;
        int i55 = i54 ^ i27;
        int i56 = i54 & i27;
        int i57 = ~((i55 ^ i56) | (i55 & i56));
        int i58 = -(-(((i53 ^ i57) | (i57 & i53)) * (-1228)));
        int i59 = i44 & i58;
        int i60 = i59 + ((i58 ^ i44) | i59);
        int i61 = (i33 | length2) & i33;
        int i62 = (i61 & i36) | (i61 ^ i36);
        int i63 = (i62 & i46) | ((~i62) & i45);
        int i64 = i62 & i45;
        int i65 = (i64 & i63) | (i63 ^ i64);
        int i66 = ~i65;
        int i67 = (i65 | i66) & i66;
        int i68 = length2 | i45;
        int i69 = (i68 & i36) | ((~i68) & i27);
        int i70 = i68 & i27;
        int i71 = ~((i70 & i69) | (i69 ^ i70));
        int i72 = -(-(((i67 & i71) | (i67 ^ i71)) * 614));
        int i73 = i60 & i72;
        int i74 = ((i60 ^ i72) | i73) << 1;
        int i75 = -((i72 | i60) & (~i73));
        int i76 = (i74 & i75) + (i75 | i74);
        dl.setCompoundDrawableTintBlendMode(new Object[]{djVar, Byte.valueOf(bArr[i76])}, -1763141630, 1763141638, System.identityHashCode(djVar));
        int i77 = i76 * 949;
        int i78 = ((-947) ^ i77) + ((i77 & (-947)) << 1);
        int i79 = ~i76;
        int i80 = (i79 ^ iIntValue) | (i79 & iIntValue);
        int i81 = ~i80;
        int i82 = ((((i80 | i81) & i81) | (-2)) * (-948)) + i78;
        int i83 = ((-2) ^ i79) | ((-2) & i79);
        int i84 = (i83 & i45) | (i83 ^ i45);
        int i85 = ~i84;
        int i86 = -(~(-(-(((i84 | i85) & i85) * (-948)))));
        int i87 = (-2) - (((i82 & i86) + (i82 | i86)) ^ (-1));
        int i88 = i79 ^ 1;
        int i89 = i79 & 1;
        int i90 = ((i89 & i88) | (i88 ^ i89)) * 948;
        int i91 = i87 & i90;
        int i92 = (i90 ^ i87) | i91;
        int i93 = (i91 & i92) + (i92 | i91);
        dl.setCompoundDrawableTintBlendMode(new Object[]{djVar, Byte.valueOf(bArr[i93])}, -1828525294, 1828525303, System.identityHashCode(djVar));
        int i94 = (i93 * (-68)) + 70;
        int i95 = ~i93;
        int i96 = ((-2) ^ i95) | ((-2) & i95);
        int i97 = i96 ^ iIntValue;
        int i98 = i96 & iIntValue;
        int i99 = (i98 & i97) | (i97 ^ i98);
        int i100 = ~i99;
        int i101 = (i99 | i100) & i100;
        int i102 = i93 & 1;
        int i103 = (~i102) & (i93 | 1);
        int i104 = (i102 & i103) | (i103 ^ i102);
        int i105 = (i104 & i45) | ((~i104) & iIntValue);
        int i106 = i104 & iIntValue;
        int i107 = ~((i106 & i105) | (i105 ^ i106));
        int i108 = i101 & i107;
        int i109 = (i101 | i107) & (~i108);
        int i117 = ((i109 & i108) | (i109 ^ i108)) * 69;
        int i118 = i94 & i117;
        int i119 = (i118 - (~((i94 ^ i117) | i118))) - 1;
        int i120 = (~(((-2) ^ i93) | ((-2) & i93))) | (~(((-2) ^ iIntValue) | ((-2) & iIntValue)));
        int i121 = (i93 & i45) | (iIntValue & i95);
        int i122 = i93 & iIntValue;
        int i123 = ~((i122 & i121) | (i121 ^ i122));
        int i124 = i120 & i123;
        int i125 = (i120 | i123) & (~i124);
        int i126 = -(~(-(-(((i125 & i124) | (i125 ^ i124)) * (-69)))));
        int i127 = (((i119 | i126) << 1) - (i126 ^ i119)) - 1;
        int i128 = (i95 ^ 1) | (i95 & 1);
        int i129 = ~i128;
        int i130 = -(-(((i128 | i129) & i129) * 69));
        int i131 = i127 & i130;
        int i132 = (i131 - (~(-(-((i130 ^ i127) | i131))))) - 1;
        djVar.f55208n = UByte.m5545constructorimpl(bArr[i132]);
        int i133 = (-2) - (((i132 ^ 2) + ((i132 & 2) << 1)) ^ (-1));
        djVar.f55209o = bArr[i133];
        int i134 = i133 & 1;
        int i135 = -(-((i133 ^ 1) | i134));
        int i136 = (i134 & i135) + (i135 | i134);
        int i137 = djVar.f55203h;
        int i138 = -(-(i137 * 111));
        int i139 = 3924 & i138;
        int i140 = ((i138 | 3924) & (~i139)) + (i139 << 1);
        int i141 = ~i137;
        int i142 = (i137 & i45) | (iIntValue & i141);
        int i143 = i137 & iIntValue;
        int i144 = ~((i142 & i143) | (i142 ^ i143));
        int i145 = 35 ^ i144;
        int i146 = i144 & 35;
        int i147 = ((i145 ^ i146) | (i145 & i146)) * (-220);
        int i148 = i140 & i147;
        int i149 = -(-((i140 ^ i147) | i148));
        int i150 = ((i148 | i149) << 1) - (i148 ^ i149);
        int i151 = (-36) & i137;
        int i152 = (~i151) & ((-36) | i137);
        int i153 = ~((i152 ^ i151) | (i152 & i151));
        int i154 = ~(((~i143) & (i137 | iIntValue)) | i143);
        int i155 = -(~(-(-(((i154 & i153) | (i153 ^ i154)) * 220))));
        int i156 = (-2) - ((((i150 | i155) << 1) - (i155 ^ i150)) ^ (-1));
        int i157 = 35 & i141;
        int i158 = i151 | i157;
        int i159 = i137 & 35;
        int i160 = ~((i159 & i158) | (i158 ^ i159));
        int i161 = ((~i141) & (-36)) | i157;
        int i162 = (-36) & i141;
        int i163 = ~((i161 & i162) | (i161 ^ i162));
        int i164 = ((i160 & i163) | (i160 ^ i163)) * 110;
        int i165 = ((((i156 ^ i164) | (i156 & i164)) << 1) - (~(-((i164 & (~i156)) | ((~i164) & i156))))) - 1;
        djVar.f55210p = ArraysKt___ArraysKt.sliceArray(bArr, c.until(i136, (i136 - (~i165)) - 1));
        int i166 = -(-i165);
        int i167 = i136 & i166;
        int i168 = (i166 ^ i136) | i167;
        int i169 = (i167 & i168) + (i168 | i167);
        if (Intrinsics.compare(djVar.f55208n & 255, UByte.m5545constructorimpl((byte) i165) & 255) <= 0) {
            int i170 = f55202u;
            int i171 = ((i170 | 123) << 1) - (i170 ^ 123);
            int i172 = i171 % 128;
            f55201t = i172;
            int i173 = i171 % 2;
            byte[] bArr2 = djVar.f55210p;
            if (bArr2 == null) {
                int i174 = i170 + 123;
                f55201t = i174 % 128;
                if (i174 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i175 = 27 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                bArr2 = null;
            } else {
                int i176 = ((i172 & 10) + (i172 | 10)) - 1;
                f55202u = i176 % 128;
                int i177 = i176 % 2;
            }
            bArrSliceArray2 = ArraysKt___ArraysKt.sliceArray(bArr2, c.until(0, djVar.f55208n & 255));
            int i178 = f55202u + 39;
            f55201t = i178 % 128;
            int i179 = i178 % 2;
        } else {
            bArrSliceArray2 = djVar.f55210p;
            if (bArrSliceArray2 == null) {
                int i180 = f55202u + 7;
                f55201t = i180 % 128;
                if (i180 % 2 != 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    int i181 = 86 / 0;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                bArrSliceArray2 = null;
            } else {
                int i182 = f55201t;
                int i183 = ((i182 | 87) << 1) - (i182 ^ 87);
                f55202u = i183 % 128;
                int i184 = i183 % 2;
            }
        }
        djVar.f55211q = bArrSliceArray2;
        int i185 = i169 ^ 20;
        int i186 = -(-((i169 & 20) << 1));
        byte[] bArrSliceArray3 = ArraysKt___ArraysKt.sliceArray(bArr, c.until(i169, (i185 ^ i186) + ((i185 & i186) << 1)));
        djVar.f55212r = bArrSliceArray3;
        if (bArrSliceArray3 == null) {
            int i187 = (-2) - ((f55202u + 44) ^ (-1));
            f55201t = i187 % 128;
            if (i187 % 2 != 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i188 = 4 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            bArrSliceArray3 = null;
        } else {
            int i189 = f55202u;
            int i190 = (i189 ^ 31) + ((i189 & 31) << 1);
            f55201t = i190 % 128;
            int i191 = i190 % 2;
        }
        int length3 = bArrSliceArray3.length;
        int i192 = length3 * (-419);
        int i193 = i169 * 421;
        int i194 = i192 & i193;
        int i195 = ((i192 ^ i193) | i194) << 1;
        int i196 = -((i192 | i193) & (~i194));
        int i197 = (i195 & i196) + (i196 | i195);
        int i198 = ~i169;
        int i199 = (i169 & i45) | (iIntValue & i198);
        int i200 = i169 & iIntValue;
        int i201 = (i199 & i200) | (i199 ^ i200);
        int i202 = ~i201;
        int i203 = (i197 - (~(((i201 | i202) & i202) * TypedValues.CycleType.TYPE_EASING))) - 1;
        int i204 = ~length3;
        int i205 = (i203 - (~(-(-((i169 | i204) * (-420)))))) - 1;
        int i206 = i204 & i198;
        int i207 = ~(((i204 | i198) & (~i206)) | i206);
        int i208 = ~((i54 ^ i169) | (i54 & i169));
        int i209 = i207 & i208;
        int i210 = (i207 | i208) & (~i209);
        int i211 = -(-(((i210 & i209) | (i210 ^ i209)) * TypedValues.CycleType.TYPE_EASING));
        int i212 = i205 & i211;
        int i213 = (i211 ^ i205) | i212;
        int i214 = (i212 & i213) + (i213 | i212);
        djVar.f55213s = bArr[i214];
        int i215 = i214 * (-1187);
        int i216 = 595 & i215;
        int i217 = i216 + ((i215 ^ 595) | i216);
        int i218 = ~i214;
        int i219 = ((-2) & i218) | (i214 & 1);
        int i220 = (-2) & i214;
        int i221 = ~((i219 & i220) | (i219 ^ i220));
        int i222 = i45 & i214;
        int i223 = (i45 | i214) & (~i222);
        int i224 = ~((i222 & i223) | (i223 ^ i222));
        int i225 = -(~(((i221 & i224) | (i221 ^ i224)) * (-1188)));
        int i226 = (-2) - (((i217 & i225) + (i225 | i217)) ^ (-1));
        int i227 = (-2) ^ i214;
        int i228 = ~((i227 & i220) | (i227 ^ i220));
        int i229 = i218 ^ iIntValue;
        int i230 = iIntValue & i218;
        int i231 = ~((i229 & i230) | (i229 ^ i230));
        int i232 = ((~i231) & i228) | ((~i228) & i231);
        int i233 = i228 & i231;
        int i234 = (i233 & i232) | (i232 ^ i233);
        int i235 = i54 & 1;
        int i236 = (~i235) & (i54 | 1);
        int i237 = ~((i236 & i235) | (i236 ^ i235));
        int i238 = i234 & i237;
        int i239 = (i234 | i237) & (~i238);
        int i240 = -(-(((i239 & i238) | (i239 ^ i238)) * 594));
        int i241 = (i226 ^ i240) + ((i226 & i240) << 1);
        int i242 = i218 & (i218 | i214);
        int i243 = i242 & i54;
        int i244 = (~i243) & (i242 | i54);
        int i245 = ~((i243 & i244) | (i244 ^ i243));
        int i246 = ~((i242 & 1) | (i242 ^ 1));
        int i247 = i245 & i246;
        int i248 = ((i246 | i245) & (~i247)) | i247;
        int i249 = ~((i54 & (-2)) | ((~i54) & 1) | i235);
        int i250 = i248 & i249;
        int i251 = (i248 | i249) & (~i250);
        int i252 = -(-(((i251 & i250) | (i251 ^ i250)) * 594));
        int i253 = (((~i252) & i241) | ((~i241) & i252)) + ((i252 & i241) << 1);
        int i254 = f55202u;
        int i255 = i254 & 69;
        int i256 = (((i254 ^ 69) | i255) << 1) - ((i254 | 69) & (~i255));
        f55201t = i256 % 128;
        int i257 = i256 % 2;
        return Integer.valueOf(i253);
    }

    public static final /* synthetic */ byte[] setCompoundDrawableTintBlendMode(dj djVar) {
        return (byte[]) setOnFocusChangeListener(new Object[]{djVar}, -144062741, 144062742, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0121 A[PHI: r0
      0x0121: PHI (r0v43 byte[]) = (r0v42 byte[]), (r0v67 byte[]) binds: [B:32:0x011f, B:29:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x012e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0135  */
    /* JADX WARN: Code duplicated, block: B:38:0x0140 A[PHI: r0 r1
      0x0140: PHI (r0v66 byte[]) = (r0v42 byte[]), (r0v67 byte[]) binds: [B:32:0x011f, B:29:0x0114] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r1v86 byte[]) = (r1v71 byte[]), (r1v88 byte[]) binds: [B:32:0x011f, B:29:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        r12 = ((r11 | 11) << 1) - (r11 ^ 11);
        com.mypinpad.tsdk.isolation.dj.f55201t = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        if ((r12 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r10 = com.mypinpad.tsdk.isolation.dj.f55202u;
        r11 = ((((r10 ^ 35) | (r10 & 35)) << 1) - (~(-(((~r10) & 35) | (r10 & (-36)))))) - 1;
        com.mypinpad.tsdk.isolation.dj.f55201t = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        if ((r11 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0042, code lost:
    
        if (r10 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
    
        if (r10 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 1664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.dj.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.getRrn
    public final void setLayoutAnimation() {
        setOnFocusChangeListener(new Object[]{this}, 392641961, -392641957, System.identityHashCode(this));
    }

    @JvmName(name = "getCertificateSerialNumber")
    @NotNull
    public final byte[] setY() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -792361021, 792361021, System.identityHashCode(this));
    }
}
