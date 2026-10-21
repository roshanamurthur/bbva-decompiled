package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.UnsignedKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001AB/\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0005\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003¢\u0006\u0004\b?\u0010@J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005J \u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\rH\u0014R\"\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\"\u0010\"\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R+\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001a\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR+\u0010)\u001a\u00020%8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001c\"\u0004\b+\u0010\u001eR\"\u0010,\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010\u0013\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u0014\u0010/\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0013R\u0014\u00100\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00102\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001a\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\"\u00105\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u001a\u001a\u0004\b6\u0010\u001c\"\u0004\b7\u0010\u001eR\u001a\u00108\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b8\u0010\u0013\u001a\u0004\b9\u0010\u0015R\"\u0010:\u001a\u00020\u00038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b:\u0010\u0013\u001a\u0004\b;\u0010\u0015\"\u0004\b<\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Lcom/mypinpad/softpos/emv/terminal/kernel/common/security/cacertificate/model/IccPublicKeyCertificate;", "Lcom/mypinpad/softpos/emv/terminal/kernel/common/security/cacertificate/model/PublicKeyCertificate;", "Lcom/mypinpad/softpos/emv/terminal/common/utils/security/SensitiveData;", "", "raw", "", "startPosition", "deserialize", "Lcom/mypinpad/softpos/emv/terminal/common/utils/DateProviderInternal;", "dateProvider", "Lcom/mypinpad/softpos/emv/terminal/common/kernel/model/EmvDate;", "expiryDate", GoogleTapAndPay.KEY_PAN, "", ValidatePasswordQualityUseCase.KEY_PASSWORD_VALID, "", "junkifySensitiveData", "validateHash", "applicationPAN", "[B", "getApplicationPAN", "()[B", "setApplicationPAN", "([B)V", "", "certificateFormat", "B", "getCertificateFormat", "()B", "setCertificateFormat", "(B)V", "certificateSerialNumber", "getCertificateSerialNumber", "setCertificateSerialNumber", "hashResult", "getHashResult", "setHashResult", "Lkotlin/UByte;", "iccPublicKeyExponentLength", "getIccPublicKeyExponentLength-w2LRezQ", "setIccPublicKeyExponentLength-7apg3OU", "iccPublicKeyLength", "getIccPublicKeyLength-w2LRezQ", "setIccPublicKeyLength-7apg3OU", "iccPublicKeyOrLeftmostDigitsOfIssuerPublicKey", "getIccPublicKeyOrLeftmostDigitsOfIssuerPublicKey", "setIccPublicKeyOrLeftmostDigitsOfIssuerPublicKey", "iccPublicKeyRemainder", "issuerPublicKeyModulusLength", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "recoveredDataHeader", "getRecoveredDataHeader", "setRecoveredDataHeader", "recoveredDataTrailer", "getRecoveredDataTrailer", "setRecoveredDataTrailer", "staticDataToBeAuthenticated", "getStaticDataToBeAuthenticated", "unpaddedICCPublicKeyorLeftmostDigitsOfIssuerPublicKey", "getUnpaddedICCPublicKeyorLeftmostDigitsOfIssuerPublicKey", "setUnpaddedICCPublicKeyorLeftmostDigitsOfIssuerPublicKey", "iccCertData", "iccPublicKeyExponent", "<init>", "([BI[B[B[B)V", "Companion", "common"}, k = 1, mv = {1, 5, 1})
public class df extends dl implements getRrn {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f55164s = 0;

    @NotNull
    public static final setDividerPadding setDividerPadding = new setDividerPadding(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f55165t = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f55166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final byte[] f55167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final byte[] f55168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte f55169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f55170l;
    public byte[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f55171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte f55172o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f55173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f55174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f55175r;
    public byte setCompoundDrawableTintBlendMode;
    public byte setY;

    static {
        int i10 = f55165t;
        int i11 = i10 ^ 91;
        int i12 = ((i10 & 91) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        f55164s = i14 % 128;
        int i15 = i14 % 2;
    }

    public df(@NotNull byte[] bArr, int i10, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull byte[] bArr4) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(bArr4, "");
        this.f55166h = i10;
        this.f55167i = bArr2;
        this.f55168j = bArr4;
        dl.setCompoundDrawableTintBlendMode(new Object[]{this, bArr3}, 849699746, -849699741, System.identityHashCode(this));
        ((Integer) setOnFocusChangeListener(new Object[]{this, bArr}, -371511450, 371511451, (int) System.currentTimeMillis())).intValue();
        getRrn.Companion.setCompoundDrawableTintBlendMode(new Object[]{this}, 1708259647, -1708259646, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void a(Object[] objArr) {
        df dfVar = (df) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f55165t;
        int i11 = i10 & 85;
        int i12 = (i10 | 85) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f55164s = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            dfVar.f55173p = bArr;
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        dfVar.f55173p = bArr;
        int i15 = f55165t;
        int i16 = (((i15 | 40) << 1) - (i15 ^ 40)) - 1;
        f55164s = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object b(Object[] objArr) {
        df dfVar = (df) objArr[0];
        int i10 = f55164s + 99;
        int i11 = i10 % 128;
        f55165t = i11;
        int i12 = i10 % 2;
        byte[] bArr = dfVar.f55174q;
        if (bArr != null) {
            int i13 = i11 + 39;
            int i14 = i13 % 128;
            f55164s = i14;
            int i15 = i13 % 2;
            int i16 = (i14 ^ 37) + ((i14 & 37) << 1);
            f55165t = i16 % 128;
            int i17 = i16 % 2;
            return bArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i18 = f55164s;
        int i19 = ((i18 ^ 121) | (i18 & 121)) << 1;
        int i20 = -(((~i18) & 121) | (i18 & (-122)));
        int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
        f55165t = i21 % 128;
        if (i21 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r4 = com.mypinpad.tsdk.isolation.df.f55165t;
        r0 = (r4 ^ 51) + ((r4 & 51) << 1);
        com.mypinpad.tsdk.isolation.df.f55164s = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r4 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        r0 = ((r1 | 5) << 1) - (r1 ^ 5);
        com.mypinpad.tsdk.isolation.df.f55164s = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if ((r0 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object c(java.lang.Object[] r4) {
        /*
            r0 = 0
            r4 = r4[r0]
            com.mypinpad.tsdk.i.df r4 = (com.mypinpad.tsdk.isolation.df) r4
            int r1 = com.mypinpad.tsdk.isolation.df.f55165t
            int r2 = r1 + 69
            int r3 = r2 % 128
            com.mypinpad.tsdk.isolation.df.f55164s = r3
            int r2 = r2 % 2
            r3 = 0
            byte[] r4 = r4.f55170l
            if (r2 == 0) goto L1a
            r2 = 92
            int r2 = r2 / r0
            if (r4 == 0) goto L2d
            goto L1c
        L1a:
            if (r4 == 0) goto L2d
        L1c:
            r0 = r1 | 5
            int r0 = r0 << 1
            r1 = r1 ^ 5
            int r0 = r0 - r1
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.df.f55164s = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L2c
            return r4
        L2c:
            throw r3
        L2d:
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            int r4 = com.mypinpad.tsdk.isolation.df.f55165t
            r0 = r4 ^ 51
            r4 = r4 & 51
            int r4 = r4 << 1
            int r0 = r0 + r4
            int r4 = r0 % 128
            com.mypinpad.tsdk.isolation.df.f55164s = r4
            int r0 = r0 % 2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.df.c(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Byte d(Object[] objArr) {
        df dfVar = (df) objArr[0];
        int i10 = f55165t + 7;
        int i11 = i10 % 128;
        f55164s = i11;
        int i12 = i10 % 2;
        byte b10 = dfVar.f55171n;
        int i13 = (i11 & (-20)) | ((~i11) & 19);
        int i14 = (i11 & 19) << 1;
        int i15 = ((i13 | i14) << 1) - (i13 ^ i14);
        f55165t = i15 % 128;
        if (i15 % 2 != 0) {
            return Byte.valueOf(b10);
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x011e, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.dl.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r3, r5}, -2005943015, 2005943018, (int) java.lang.System.currentTimeMillis())).booleanValue() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0136, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.dl.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r3, r5}, -2005943015, 2005943018, (int) java.lang.System.currentTimeMillis())).booleanValue() != true) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0139, code lost:
    
        r10 = com.mypinpad.tsdk.isolation.df.f55165t;
        r0 = (-2) - ((r10 + 100) ^ (-1));
        com.mypinpad.tsdk.isolation.df.f55164s = r0 % 128;
        r0 = r0 % 2;
        r0 = (r10 & (-104)) | ((~r10) & 103);
        r10 = (r10 & 103) << 1;
        r1 = (r0 & r10) + (r10 | r0);
        com.mypinpad.tsdk.isolation.df.f55164s = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0158, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Boolean e(java.lang.Object[] r10) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.df.e(java.lang.Object[]):java.lang.Boolean");
    }

    public static /* synthetic */ void f(Object[] objArr) {
        df dfVar = (df) objArr[0];
        byte bByteValue = ((Byte) objArr[1]).byteValue();
        int i10 = f55164s;
        int i11 = i10 & 109;
        int i12 = i10 | 109;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f55165t = i13 % 128;
        int i14 = i13 % 2;
        dfVar.f55172o = bByteValue;
        int i15 = i10 + 67;
        f55165t = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        df dfVar = (df) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f55165t + 116;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f55164s = i11 % 128;
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            dfVar.f55175r = bArr;
            throw null;
        }
        Intrinsics.checkNotNullParameter(bArr, "");
        dfVar.f55175r = bArr;
        int i12 = f55165t;
        int i13 = i12 | 43;
        int i14 = (i13 << 1) - ((~(i12 & 43)) & i13);
        f55164s = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object h(Object[] objArr) {
        df dfVar = (df) objArr[0];
        int i10 = f55165t + 33;
        f55164s = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = dfVar.f55168j;
        if (i11 == 0) {
            return bArr;
        }
        throw null;
    }

    public static /* synthetic */ Object i(Object[] objArr) {
        df dfVar = (df) objArr[0];
        int i10 = f55165t;
        int i11 = ((i10 ^ 65) - (~(-(-((i10 & 65) << 1))))) - 1;
        int i12 = i11 % 128;
        f55164s = i12;
        int i13 = i11 % 2;
        byte[] bArr = dfVar.m;
        if (bArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i14 = f55165t;
            int i15 = ((i14 | 111) << 1) - (i14 ^ 111);
            f55164s = i15 % 128;
            int i16 = i15 % 2;
            return null;
        }
        int i17 = ((i12 & 97) - (~(-(-(i12 | 97))))) - 1;
        f55165t = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
        int i18 = i12 & 103;
        int i19 = (i12 ^ 103) | i18;
        int i20 = (i18 & i19) + (i19 | i18);
        f55165t = i20 % 128;
        int i21 = i20 % 2;
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        r5 = com.mypinpad.tsdk.isolation.df.f55164s;
        r0 = r5 & 107;
        r5 = (r5 ^ 107) | r0;
        r1 = ((r0 | r5) << 1) - (r5 ^ r0);
        com.mypinpad.tsdk.isolation.df.f55165t = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if ((r1 % 2) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r0 = ((r1 ^ 113) - (~((r1 & 113) << 1))) - 1;
        com.mypinpad.tsdk.isolation.df.f55164s = r0 % 128;
        r0 = r0 % 2;
        r0 = ((((r1 ^ 55) | (r1 & 55)) << 1) - (~(-(((~r1) & 55) | (r1 & (-56)))))) - 1;
        com.mypinpad.tsdk.isolation.df.f55164s = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if ((r0 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object j(java.lang.Object[] r5) {
        /*
            r0 = 0
            r5 = r5[r0]
            com.mypinpad.tsdk.i.df r5 = (com.mypinpad.tsdk.isolation.df) r5
            int r1 = com.mypinpad.tsdk.isolation.df.f55164s
            int r1 = r1 + 78
            r2 = -1
            int r2 = r2 << 1
            r1 = r1 ^ (-1)
            int r2 = r2 - r1
            int r1 = r2 % 128
            com.mypinpad.tsdk.isolation.df.f55165t = r1
            int r2 = r2 % 2
            r3 = 0
            byte[] r5 = r5.f55175r
            if (r2 != 0) goto L20
            r2 = 77
            int r2 = r2 / r0
            if (r5 == 0) goto L4f
            goto L22
        L20:
            if (r5 == 0) goto L4f
        L22:
            r0 = r1 ^ 113(0x71, float:1.58E-43)
            r2 = r1 & 113(0x71, float:1.58E-43)
            int r2 = r2 << 1
            int r2 = ~r2
            int r0 = r0 - r2
            int r0 = r0 + (-1)
            int r2 = r0 % 128
            com.mypinpad.tsdk.isolation.df.f55164s = r2
            int r0 = r0 % 2
            r0 = r1 ^ 55
            r2 = r1 & 55
            r0 = r0 | r2
            int r0 = r0 << 1
            r2 = r1 & (-56)
            int r1 = ~r1
            r4 = 55
            r1 = r1 & r4
            r1 = r1 | r2
            int r1 = -r1
            int r1 = ~r1
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.df.f55164s = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L4e
            return r5
        L4e:
            throw r3
        L4f:
            java.lang.String r5 = ""
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            int r5 = com.mypinpad.tsdk.isolation.df.f55164s
            r0 = r5 & 107(0x6b, float:1.5E-43)
            r5 = r5 ^ 107(0x6b, float:1.5E-43)
            r5 = r5 | r0
            r1 = r0 | r5
            int r1 = r1 << 1
            r5 = r5 ^ r0
            int r1 = r1 - r5
            int r5 = r1 % 128
            com.mypinpad.tsdk.isolation.df.f55165t = r5
            int r1 = r1 % 2
            if (r1 == 0) goto L6a
            return r3
        L6a:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.df.j(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ void k(Object[] objArr) {
        df dfVar = (df) objArr[0];
        byte bByteValue = ((Byte) objArr[1]).byteValue();
        int i10 = (-2) - ((f55165t + 28) ^ (-1));
        int i11 = i10 % 128;
        f55164s = i11;
        int i12 = i10 % 2;
        dfVar.f55171n = bByteValue;
        int i13 = (i11 & (-92)) | ((~i11) & 91);
        int i14 = (i11 & 91) << 1;
        int i15 = (i13 & i14) + (i13 | i14);
        f55165t = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 96 / 0;
        }
    }

    public static /* synthetic */ void l(Object[] objArr) {
        df dfVar = (df) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f55165t;
        int i11 = i10 & 81;
        int i12 = -(-((i10 ^ 81) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f55164s = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        dfVar.m = bArr;
        int i15 = f55164s;
        int i16 = ((i15 ^ 35) | (i15 & 35)) << 1;
        int i17 = -(((~i15) & 35) | (i15 & (-36)));
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f55165t = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Byte m(Object[] objArr) {
        df dfVar = (df) objArr[0];
        int i10 = f55165t;
        int i11 = ((i10 ^ 78) + ((i10 & 78) << 1)) - 1;
        f55164s = i11 % 128;
        int i12 = i11 % 2;
        byte b10 = dfVar.f55169k;
        int i13 = ((i10 | 113) << 1) - (i10 ^ 113);
        f55164s = i13 % 128;
        if (i13 % 2 == 0) {
            return Byte.valueOf(b10);
        }
        int i14 = 38 / 0;
        return Byte.valueOf(b10);
    }

    public static /* synthetic */ Byte n(Object[] objArr) {
        df dfVar = (df) objArr[0];
        int i10 = f55164s;
        int i11 = i10 & 101;
        int i12 = (((~i11) & (i10 | 101)) - (~(i11 << 1))) - 1;
        f55165t = i12 % 128;
        int i13 = i12 % 2;
        byte b10 = dfVar.f55172o;
        if (i13 == 0) {
            int i14 = 72 / 0;
        }
        int i15 = i10 & 35;
        int i16 = -(-((i10 ^ 35) | i15));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        f55165t = i17 % 128;
        int i18 = i17 % 2;
        return Byte.valueOf(b10);
    }

    public static /* synthetic */ void o(Object[] objArr) {
        df dfVar = (df) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int i10 = f55164s;
        int i11 = i10 ^ 33;
        int i12 = ((i10 & 33) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i12 | i13);
        f55165t = i14 % 128;
        if (i14 % 2 != 0) {
            Intrinsics.checkNotNullParameter(bArr, "");
            dfVar.f55174q = bArr;
        } else {
            Intrinsics.checkNotNullParameter(bArr, "");
            dfVar.f55174q = bArr;
            throw null;
        }
    }

    public static /* synthetic */ Object p(Object[] objArr) {
        df dfVar = (df) objArr[0];
        int i10 = f55164s;
        int i11 = (i10 & (-98)) | ((~i10) & 97);
        int i12 = -(-((i10 & 97) << 1));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f55165t = i13 % 128;
        int i14 = i13 % 2;
        byte[] bArr = dfVar.f55173p;
        if (bArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i15 = f55164s + 104;
            int i16 = (i15 ^ (-1)) + (i15 << 1);
            f55165t = i16 % 128;
            if (i16 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i17 = i10 & 47;
        int i18 = (i17 - (~(-(-((i10 ^ 47) | i17))))) - 1;
        int i19 = i18 % 128;
        f55165t = i19;
        int i20 = i18 % 2;
        int i21 = i19 & 73;
        int i22 = (i19 ^ 73) | i21;
        int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
        f55164s = i23 % 128;
        int i24 = i23 % 2;
        return bArr;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        byte[] bArrSliceArray;
        int i13;
        int i14 = ~i10;
        switch ((((~(i10 | (~i11))) | (~(i11 | i12))) * 302) + ((~(i14 | i11 | i12)) * (-604)) + (((~((~i12) | i14 | i11)) | (~(i10 | i11 | i12))) * (-302)) + (i11 * (-301)) + (i10 * 303)) {
            case 1:
                df dfVar = (df) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i15 = f55165t;
                int i16 = i15 & 87;
                int i17 = (i16 - (~((i15 ^ 87) | i16))) - 1;
                f55164s = i17 % 128;
                if (i17 % 2 == 0) {
                    onFocusChangeListener = setOnFocusChangeListener(new Object[]{dfVar, bArr, 0}, -657142028, 657142037, 0);
                    break;
                } else {
                    onFocusChangeListener = setOnFocusChangeListener(new Object[]{dfVar, bArr, 0}, -657142028, 657142037, 0);
                }
                return Integer.valueOf(((Integer) onFocusChangeListener).intValue());
            case 2:
                return e(objArr);
            case 3:
                k(objArr);
                return null;
            case 4:
                f(objArr);
                return null;
            case 5:
                return n(objArr);
            case 6:
                return j(objArr);
            case 7:
                df dfVar2 = (df) objArr[0];
                int i18 = f55165t;
                int i19 = i18 & 43;
                int i20 = ((i18 ^ 43) | i19) << 1;
                int i21 = -((i18 | 43) & (~i19));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f55164s = i22 % 128;
                int i23 = i22 % 2;
                setRemoteViewsAdapter.setX(new Object[]{(byte[]) setOnFocusChangeListener(new Object[]{dfVar2}, -890474758, 890474766, System.identityHashCode(dfVar2))}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                setRemoteViewsAdapter.setX(new Object[]{(byte[]) setOnFocusChangeListener(new Object[]{dfVar2}, 1343614962, -1343614950, System.identityHashCode(dfVar2))}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                setRemoteViewsAdapter.setX(new Object[]{(byte[]) setOnFocusChangeListener(new Object[]{dfVar2}, -1196380953, 1196380969, System.identityHashCode(dfVar2))}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                setRemoteViewsAdapter.setX(new Object[]{(byte[]) setOnFocusChangeListener(new Object[]{dfVar2}, -903326197, 903326216, System.identityHashCode(dfVar2))}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                setRemoteViewsAdapter.setX(new Object[]{dfVar2.f55167i}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                setRemoteViewsAdapter.setX(new Object[]{dfVar2.f55168j}, 1811924153, -1811924153, (int) System.currentTimeMillis());
                int i24 = f55165t + 43;
                f55164s = i24 % 128;
                int i25 = i24 % 2;
                return null;
            case 8:
                return c(objArr);
            case 9:
                df dfVar3 = (df) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i26 = f55164s;
                int i27 = ((i26 | 119) << 1) - (i26 ^ 119);
                f55165t = i27 % 128;
                int i28 = i27 % 2;
                Intrinsics.checkNotNullParameter(bArr2, "");
                dfVar3.setY = bArr2[0];
                dfVar3.f55169k = bArr2[1];
                setOnFocusChangeListener(new Object[]{dfVar3, ArraysKt___ArraysKt.sliceArray(bArr2, c.until(2, 12))}, -2094282313, 2094282331, System.identityHashCode(dfVar3));
                int length = ((byte[]) setOnFocusChangeListener(new Object[]{dfVar3}, -890474758, 890474766, System.identityHashCode(dfVar3))).length;
                int i29 = length * 367;
                int i30 = length & 2;
                int i31 = (((length ^ 2) | i30) * (-366)) + ((-2) - ((((i29 | 735) << 1) - (i29 ^ 735)) ^ (-1)));
                int i32 = ~iIntValue;
                int i33 = iIntValue & 2;
                int i34 = ((-3) & i32) | i33;
                int i35 = (-3) & iIntValue;
                int i36 = ~((i34 ^ i35) | (i34 & i35));
                int i37 = length ^ i36;
                int i38 = i36 & length;
                int i39 = -(-(((i37 ^ i38) | (i37 & i38)) * (-366)));
                int i40 = i31 & i39;
                int i41 = ((((i31 ^ i39) | i40) << 1) - (~(-((i31 | i39) & (~i40))))) - 1;
                int i42 = ~length;
                int i43 = ~(((i42 | length) & i42) | 2);
                int i44 = (length & (-3)) | (i42 & (-3)) | i30 | iIntValue;
                int i45 = ~i44;
                int i46 = (i44 | i45) & i45;
                int i47 = ((~i46) & i43) | ((~i43) & i46);
                int i48 = i46 & i43;
                int i49 = -(-(((i48 & i47) | (i47 ^ i48)) * 366));
                int i50 = i41 & i49;
                int i51 = ((i41 ^ i49) | i50) << 1;
                int i52 = -((i41 | i49) & (~i50));
                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                int i54 = (i53 * (-657)) + 1318;
                int i55 = ~(((-3) ^ i53) | ((-3) & i53));
                int i56 = ~i53;
                int i57 = i56 & 2;
                int i58 = ((~i57) & (i56 | 2)) | i57;
                int i59 = ~i58;
                int i60 = i59 & (i58 | i59);
                int i61 = i55 ^ i60;
                int i62 = i60 & i55;
                int i63 = (i62 & i61) | (i61 ^ i62);
                int i64 = iIntValue ^ 2;
                int i65 = ~((i64 ^ i33) | (i64 & i33));
                int i66 = -(-((((~i63) & i65) | ((~i65) & i63) | (i63 & i65)) * (-658)));
                int i67 = ((((i54 ^ i66) | (i54 & i66)) << 1) - (~(-((i66 & (~i54)) | ((~i66) & i54))))) - 1;
                int i68 = (i56 & (-3)) | ((~i56) & 2);
                int i69 = (~((i68 & i57) | (i68 ^ i57))) * 658;
                int i70 = i67 & i69;
                int i71 = -(-(i69 | i67));
                int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                int i73 = (i56 | i53) & i56;
                int i74 = i73 ^ 2;
                int i75 = i73 & 2;
                int i76 = (i75 & i74) | (i74 ^ i75);
                int i77 = ~i76;
                int i78 = (i76 | i77) & i77;
                int i79 = i64 | i33;
                int i80 = ~i79;
                int i81 = (i79 | i80) & i80;
                int i82 = i78 & i81;
                int i83 = (i78 | i81) & (~i82);
                int i84 = -(-(((i83 & i82) | (i83 ^ i82)) * 658));
                int i85 = i72 & i84;
                int i86 = -(-((i84 ^ i72) | i85));
                dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar3, ArraysKt___ArraysKt.sliceArray(bArr2, c.until(i53, (i85 ^ i86) + ((i86 & i85) << 1)))}, 454696279, -454696269, System.identityHashCode(dfVar3));
                int i87 = i53 - (-2);
                int i88 = 851 - (~(-(-(i87 * (-282)))));
                int i89 = ~(((-4) ^ i87) | ((-4) & i87));
                int i90 = (-4) & iIntValue;
                int i91 = ~(i90 | ((~i90) & ((-4) | iIntValue)));
                int i92 = i89 ^ i91;
                int i93 = i89 & i91;
                int i94 = -(-(((i93 & i92) | (i92 ^ i93)) * (-283)));
                int i95 = i88 & i94;
                int i96 = i95 + ((i88 ^ i94) | i95);
                int i97 = ~i87;
                int i98 = i97 & 3;
                int i99 = (~i98) & (i97 | 3);
                int i100 = (i96 - (~(-(-((~((i98 & i99) | (i99 ^ i98))) * 283))))) - 1;
                int i101 = (-4) ^ i97;
                int i102 = (-4) & i97;
                int i103 = (i102 & i101) | (i101 ^ i102);
                int i104 = (i103 & iIntValue) | (i103 ^ iIntValue);
                int i105 = ~i104;
                int i106 = -(-(((i104 | i105) & i105) * 283));
                int i107 = ((~i106) & i100) | ((~i100) & i106);
                int i108 = -(-((i106 & i100) << 1));
                setOnFocusChangeListener(new Object[]{dfVar3, ArraysKt___ArraysKt.sliceArray(bArr2, c.until(i87, (i107 ^ i108) + ((i108 & i107) << 1)))}, -1329916730, 1329916741, System.identityHashCode(dfVar3));
                int length2 = ((byte[]) setOnFocusChangeListener(new Object[]{dfVar3}, 1343614962, -1343614950, System.identityHashCode(dfVar3))).length;
                int i109 = length2 * 221;
                int i110 = i87 * (-219);
                int i111 = i109 & i110;
                int i112 = (i109 ^ i110) | i111;
                int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                int i114 = ~length2;
                int i115 = (i114 | length2) & i114;
                int i116 = (i97 | i87) & i97;
                int i117 = ((~i116) & i115) | ((~i115) & i116);
                int i118 = i115 & i116;
                int i119 = ~((i118 & i117) | (i117 ^ i118));
                int i120 = ~(i32 | length2 | i87);
                int i121 = i119 & i120;
                int i122 = (((i119 | i120) & (~i121)) | i121) * 220;
                int i123 = i113 & i122;
                int i124 = (i123 - (~((i113 ^ i122) | i123))) - 1;
                int i125 = i32 & i87;
                int i126 = i125 | ((~i125) & (i32 | i87));
                int i127 = ~i126;
                int i128 = (i126 | i127) & i127;
                int i129 = length2 & i128;
                int i130 = (((i128 | length2) & (~i129)) | i129) * (-440);
                int i131 = (((i124 ^ i130) | (i124 & i130)) << 1) - ((i130 & (~i124)) | ((~i130) & i124));
                int i132 = (i97 & length2) | (i114 & i87);
                int i133 = length2 & i87;
                int i134 = (i132 & i133) | (i132 ^ i133);
                int i135 = i134 & iIntValue;
                int i136 = (i134 | iIntValue) & (~i135);
                int i137 = -(-(((i136 & i135) | (i136 ^ i135)) * 220));
                int i138 = (i131 & i137) + (i137 | i131);
                dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar3, Byte.valueOf(bArr2[i138])}, -1763141630, 1763141638, System.identityHashCode(dfVar3));
                int i139 = i138 * 263;
                int i140 = ((-523) ^ i139) + ((i139 & (-523)) << 1);
                int i141 = ~i138;
                int i142 = (-2) & i141;
                int i143 = (i138 & 1) | i142;
                int i144 = (-2) & i138;
                int i145 = ~((i143 ^ i144) | (i143 & i144));
                int i146 = i142 | ((~i141) & 1);
                int i147 = i141 & 1;
                int i148 = ~((i146 & i147) | (i146 ^ i147));
                int i149 = i145 ^ i148;
                int i150 = i145 & i148;
                int i151 = (i150 & i149) | (i149 ^ i150);
                int i152 = ~(i141 | iIntValue);
                int i153 = ((i151 & i152) | (i151 ^ i152)) * 262;
                int i154 = ((~i153) & i140) | ((~i140) & i153);
                int i155 = -(-((i140 & i153) << 1));
                int i156 = (i154 ^ i155) + ((i155 & i154) << 1);
                int i157 = i141 ^ 1;
                int i158 = (i157 & i147) | (i157 ^ i147);
                int i159 = ~i158;
                int i160 = ((i158 | i159) & i159) * (-786);
                int i161 = i156 & i160;
                int i162 = ((i156 ^ i160) | i161) << 1;
                int i163 = -((i160 | i156) & (~i161));
                int i164 = (i162 & i163) + (i163 | i162);
                int i165 = (i141 | i138) & i141;
                int i166 = ~i32;
                int i167 = ((~i165) & i32) | (i165 & i166);
                int i168 = i165 & i32;
                int i169 = ~((i167 & i168) | (i167 ^ i168));
                int i170 = ~((i138 ^ (-2)) | i144);
                int i171 = (i170 & i169) | (i169 ^ i170);
                int i172 = (i141 | 1) & (~i147);
                int i173 = (i172 & i147) | (i172 ^ i147);
                int i174 = ~i173;
                int i175 = (i173 | i174) & i174;
                int i176 = i171 & i175;
                int i177 = (i175 | i171) & (~i176);
                int i178 = -(-(((i177 & i176) | (i177 ^ i176)) * 262));
                int i179 = i164 & i178;
                int i180 = i179 + ((i178 ^ i164) | i179);
                dl.setCompoundDrawableTintBlendMode(new Object[]{dfVar3, Byte.valueOf(bArr2[i180])}, -1828525294, 1828525303, System.identityHashCode(dfVar3));
                int i181 = (i180 ^ 1) + ((i180 & 1) << 1);
                setOnFocusChangeListener(new Object[]{dfVar3, Byte.valueOf(UByte.m5545constructorimpl(bArr2[i181]))}, 775187672, -775187669, System.identityHashCode(dfVar3));
                int i182 = -(-(i181 * (-903)));
                int i183 = 905 & i182;
                int i184 = i183 + ((i182 ^ 905) | i183);
                int i185 = (-2) & iIntValue;
                int i186 = (~i185) & ((-2) | iIntValue);
                int i187 = (i186 & i185) | (i186 ^ i185);
                int i188 = ~i187;
                int i189 = i188 & (i188 | i187);
                int i190 = i32 & i181;
                int i191 = (~i190) & (i32 | i181);
                int i192 = (i190 & i191) | (i191 ^ i190);
                int i193 = ~i192;
                int i194 = (i192 | i193) & i193;
                int i195 = i189 & i194;
                int i196 = (i184 - (~(-(-((((i189 | i194) & (~i195)) | i195) * (-1808)))))) - 1;
                int i197 = ~i181;
                int i198 = (-2) & i197;
                int i199 = (~i198) & ((-2) | i197);
                int i200 = (i199 & i198) | (i199 ^ i198);
                int i201 = ~((i200 & iIntValue) | (i200 & i32) | ((~i200) & iIntValue));
                int i202 = (i32 | iIntValue) & i32;
                int i203 = i202 | 1;
                int i204 = i203 & i181;
                int i205 = i204 | ((~i204) & (i203 | i181));
                int i206 = ~i205;
                int i207 = (i205 | i206) & i206;
                int i208 = ((i207 & i201) | ((~i207) & i201) | ((~i201) & i207)) * 904;
                int i209 = i196 & i208;
                int i210 = i208 | i196;
                int i211 = ((i209 | i210) << 1) - (i210 ^ i209);
                int i212 = (i181 & 1) | i198;
                int i213 = i181 & (-2);
                int i214 = ~((i212 & i213) | (i212 ^ i213));
                int i215 = (i197 ^ iIntValue) | (i197 & iIntValue);
                int i216 = ~i215;
                int i217 = (i215 | i216) & i216;
                int i218 = ((~i217) & i214) | ((~i214) & i217);
                int i219 = i214 & i217;
                int i220 = (i219 & i218) | (i218 ^ i219);
                int i221 = ~((i202 ^ 1) | (i202 & 1));
                int i222 = i220 ^ i221;
                int i223 = i220 & i221;
                int i224 = ((i223 & i222) | (i222 ^ i223)) * 904;
                int i225 = ((i211 ^ i224) | (i211 & i224)) << 1;
                int i226 = -((i224 & (~i211)) | ((~i224) & i211));
                int i227 = (i225 ^ i226) + ((i226 & i225) << 1);
                setOnFocusChangeListener(new Object[]{dfVar3, Byte.valueOf(UByte.m5545constructorimpl(bArr2[i227]))}, 215444401, -215444397, System.identityHashCode(dfVar3));
                int i228 = -(~(-(-(i227 * 263))));
                int i229 = ((-523) ^ i228) + ((i228 & (-523)) << 1);
                int i230 = (i229 ^ (-1)) + (i229 << 1);
                int i231 = (-2) & i227;
                int i232 = ~(((-2) ^ i227) | i231);
                int i233 = ~i227;
                int i234 = i233 & 1;
                int i235 = ~((i233 ^ 1) | i234);
                int i236 = i232 & i235;
                int i237 = (i232 | i235) & (~i236);
                int i238 = (i237 & i236) | (i237 ^ i236);
                int i239 = ~i233;
                int i240 = ~((i233 ^ iIntValue) | (i233 & iIntValue));
                int i241 = -(-(((i238 ^ i240) | (i238 & i240)) * 262));
                int i242 = i230 & i241;
                int i243 = (i230 ^ i241) | i242;
                int i244 = (i242 ^ i243) + ((i243 & i242) << 1);
                int i245 = i235 * (-786);
                int i246 = (i244 ^ i245) + ((i244 & i245) << 1);
                int i247 = (i233 & i166) | (i32 & i239);
                int i248 = i233 & i32;
                int i249 = (i247 & i248) | (i247 ^ i248);
                int i250 = ~i249;
                int i251 = (i249 | i250) & i250;
                int i252 = i233 & (-2);
                int i253 = (i227 & 1) | i252;
                int i254 = ~((i253 & i231) | (i253 ^ i231));
                int i255 = (i251 & i254) | (i251 ^ i254);
                int i256 = (i239 & 1) | i252;
                int i257 = ~((i256 & i234) | (i256 ^ i234));
                int i258 = ((~i257) & i255) | ((~i255) & i257);
                int i259 = i255 & i257;
                int i260 = ((i259 & i258) | (i258 ^ i259)) * 262;
                int i261 = ((i246 | i260) << 1) - (i246 ^ i260);
                int i262 = dfVar3.f55166h;
                int i263 = i262 & (-42);
                int i264 = (((i262 | (-42)) & (~i263)) - (~(i263 << 1))) - 1;
                int i265 = ~i264;
                int i266 = i261 & i264;
                int i267 = i261 | i264;
                setOnFocusChangeListener(new Object[]{dfVar3, ArraysKt___ArraysKt.sliceArray(bArr2, c.until(i261, (i266 ^ i267) + ((i267 & i266) << 1)))}, -1844287899, 1844287914, System.identityHashCode(dfVar3));
                int i268 = ((i265 & i261) | ((~i261) & i264)) + (i266 << 1);
                if (UnsignedKt.uintCompare(UInt.m5570constructorimpl(((Byte) setOnFocusChangeListener(new Object[]{dfVar3}, -1490640910, 1490640927, System.identityHashCode(dfVar3))).byteValue() & 255), UInt.m5570constructorimpl(i264)) <= 0) {
                    int i269 = f55164s;
                    int i270 = i269 & 17;
                    int i271 = ((i269 ^ 17) | i270) << 1;
                    int i272 = -((i269 | 17) & (~i270));
                    int i273 = (i271 & i272) + (i272 | i271);
                    f55165t = i273 % 128;
                    bArrSliceArray = i273 % 2 == 0 ? ArraysKt___ArraysKt.sliceArray((byte[]) setOnFocusChangeListener(new Object[]{dfVar3}, -1196380953, 1196380969, System.identityHashCode(dfVar3)), c.until(0, ((Byte) setOnFocusChangeListener(new Object[]{dfVar3}, -1490640910, 1490640927, System.identityHashCode(dfVar3))).byteValue() & 5139)) : ArraysKt___ArraysKt.sliceArray((byte[]) setOnFocusChangeListener(new Object[]{dfVar3}, -1196380953, 1196380969, System.identityHashCode(dfVar3)), c.until(0, ((Byte) setOnFocusChangeListener(new Object[]{dfVar3}, -1490640910, 1490640927, System.identityHashCode(dfVar3))).byteValue() & 255));
                    i13 = 2;
                } else {
                    bArrSliceArray = (byte[]) setOnFocusChangeListener(new Object[]{dfVar3}, -1196380953, 1196380969, System.identityHashCode(dfVar3));
                    int i274 = f55164s;
                    int i275 = i274 & 73;
                    int i276 = i274 | 73;
                    int i277 = (i275 ^ i276) + ((i276 & i275) << 1);
                    f55165t = i277 % 128;
                    i13 = 2;
                    int i278 = i277 % 2;
                }
                Object[] objArr2 = new Object[i13];
                objArr2[0] = dfVar3;
                objArr2[1] = bArrSliceArray;
                setOnFocusChangeListener(objArr2, -735445782, 735445782, System.identityHashCode(dfVar3));
                byte[] bArrSliceArray2 = ArraysKt___ArraysKt.sliceArray(bArr2, c.until(i268, i268 + 20));
                Object[] objArr3 = new Object[i13];
                objArr3[0] = dfVar3;
                objArr3[1] = bArrSliceArray2;
                setOnFocusChangeListener(objArr3, 624636778, -624636765, System.identityHashCode(dfVar3));
                int i279 = -(-((byte[]) setOnFocusChangeListener(new Object[]{dfVar3}, 1242920771, -1242920765, System.identityHashCode(dfVar3))).length);
                int i280 = (i268 & i279) + (i279 | i268);
                dfVar3.setCompoundDrawableTintBlendMode = bArr2[i280];
                int i281 = i280 * (-463);
                int i282 = 465 & i281;
                int i283 = (i282 - (~(-(-((i281 ^ 465) | i282))))) - 1;
                int i284 = ~i280;
                int i285 = (i284 | i280) & i284;
                int i286 = (i285 & i166) | ((~i285) & i32);
                int i287 = i285 & i32;
                int i288 = ~((i286 & i287) | (i286 ^ i287));
                int i289 = i285 & 1;
                int i290 = ~(((i285 | 1) & (~i289)) | i289);
                int i291 = ((~i290) & i288) | ((~i288) & i290);
                int i292 = i290 & i288;
                int i293 = (i292 & i291) | (i291 ^ i292);
                int i294 = ~((i32 ^ 1) | (i32 & 1));
                int i295 = ((~i294) & i293) | ((~i293) & i294);
                int i296 = i293 & i294;
                int i297 = (((i296 & i295) | (i295 ^ i296)) * 464) + i283;
                int i298 = i187 & i284;
                int i299 = (~i298) & (i187 | i284);
                int i300 = ((i298 & i299) | (i299 ^ i298)) * (-464);
                int i301 = ((i297 | i300) << 1) - (i297 ^ i300);
                int i302 = i284 | 1;
                int i303 = ~i302;
                int i304 = (i302 | i303) & i303;
                int i305 = ~((iIntValue ^ 1) | (iIntValue & 1));
                int i306 = i304 & i305;
                int i307 = (i304 | i305) & (~i306);
                int i308 = ((i307 & i306) | (i307 ^ i306)) * 464;
                int i309 = i301 & i308;
                int i310 = (i309 - (~((i308 ^ i301) | i309))) - 1;
                int i311 = f55165t + 37;
                f55164s = i311 % 128;
                int i312 = i311 % 2;
                return Integer.valueOf(i310);
            case 10:
                return h(objArr);
            case 11:
                l(objArr);
                return null;
            case 12:
                return i(objArr);
            case 13:
                g(objArr);
                return null;
            case 14:
                return m(objArr);
            case 15:
                a(objArr);
                return null;
            case 16:
                return p(objArr);
            case 17:
                return d(objArr);
            case 18:
                df dfVar4 = (df) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int i313 = f55165t;
                int i314 = (-2) - (((i313 ^ 30) + ((i313 & 30) << 1)) ^ (-1));
                f55164s = i314 % 128;
                int i315 = i314 % 2;
                Intrinsics.checkNotNullParameter(bArr3, "");
                dfVar4.f55170l = bArr3;
                int i316 = f55165t;
                int i317 = (i316 ^ 51) + ((i316 & 51) << 1);
                f55164s = i317 % 128;
                int i318 = i317 % 2;
                return null;
            case 19:
                return b(objArr);
            default:
                o(objArr);
                return null;
        }
    }

    @JvmName(name = "getIccPublicKeyExponentLength-w2LRezQ")
    public final byte getNavBarTitleString() {
        return ((Byte) setOnFocusChangeListener(new Object[]{this}, -1351252133, 1351252138, System.identityHashCode(this))).byteValue();
    }

    @JvmName(name = "getCertificateFormat")
    public final byte setCompoundDrawableTintBlendMode() {
        return ((Byte) setOnFocusChangeListener(new Object[]{this}, 1826913328, -1826913314, System.identityHashCode(this))).byteValue();
    }

    @JvmName(name = "getApplicationPAN")
    @NotNull
    public final byte[] setDividerPadding() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -890474758, 890474766, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getRrn
    public final void setLayoutAnimation() {
        setOnFocusChangeListener(new Object[]{this}, -1028522256, 1028522263, System.identityHashCode(this));
    }

    @JvmName(name = "getUnpaddedICCPublicKeyorLeftmostDigitsOfIssuerPublicKey")
    @NotNull
    public final byte[] setNavigationOnClickListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -903326197, 903326216, System.identityHashCode(this));
    }

    public boolean setOnDragListener() {
        int i10 = f55164s;
        int i11 = i10 ^ 103;
        int i12 = ((((i10 & 103) | i11) << 1) - (~(-i11))) - 1;
        f55165t = i12 % 128;
        int i13 = i12 % 2;
        byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{this.f55169k}, (byte[]) setOnFocusChangeListener(new Object[]{this}, -890474758, 890474766, System.identityHashCode(this)));
        byte[] bArr = (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{this}, 298274011, -298274005, System.identityHashCode(this));
        if (bArr == null) {
            int i14 = f55164s;
            int i15 = i14 + 27;
            f55165t = i15 % 128;
            byte[] bArr2 = i15 % 2 == 0 ? new byte[1] : new byte[0];
            int i16 = i14 + 107;
            f55165t = i16 % 128;
            int i17 = i16 % 2;
            bArr = bArr2;
        } else {
            int i18 = f55164s;
            int i19 = (i18 ^ 123) + ((i18 & 123) << 1);
            f55165t = i19 % 128;
            int i20 = i19 % 2;
        }
        boolean zBooleanValue = ((Boolean) dl.setCompoundDrawableTintBlendMode(new Object[]{ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(bArrPlus, bArr), (byte[]) setOnFocusChangeListener(new Object[]{this}, 1343614962, -1343614950, System.identityHashCode(this))), new byte[]{((Byte) dl.setCompoundDrawableTintBlendMode(new Object[]{this}, -1993710626, 1993710627, System.identityHashCode(this))).byteValue()}), new byte[]{((Byte) dl.setCompoundDrawableTintBlendMode(new Object[]{this}, 208355073, -208355069, System.identityHashCode(this))).byteValue()}), new byte[]{((Byte) setOnFocusChangeListener(new Object[]{this}, -1490640910, 1490640927, System.identityHashCode(this))).byteValue()}), new byte[]{((Byte) setOnFocusChangeListener(new Object[]{this}, -1351252133, 1351252138, System.identityHashCode(this))).byteValue()}), (byte[]) setOnFocusChangeListener(new Object[]{this}, -1196380953, 1196380969, System.identityHashCode(this))), this.f55167i), (byte[]) dl.setCompoundDrawableTintBlendMode(new Object[]{this}, -2055662065, 2055662076, System.identityHashCode(this))), this.f55168j), (byte[]) setOnFocusChangeListener(new Object[]{this}, 1242920771, -1242920765, System.identityHashCode(this))}, -2112094012, 2112094019, (int) System.currentTimeMillis())).booleanValue();
        int i21 = f55164s + 5;
        f55165t = i21 % 128;
        if (i21 % 2 == 0) {
            int i22 = 74 / 0;
        }
        return zBooleanValue;
    }

    @JvmName(name = "getHashResult")
    @NotNull
    public final byte[] setOnLongClickListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1242920771, -1242920765, System.identityHashCode(this));
    }

    public final boolean setX(@NotNull setContentDescription setcontentdescription, @NotNull TransactionCompleted transactionCompleted, @Nullable byte[] bArr) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, setcontentdescription, transactionCompleted, bArr}, 2095153754, -2095153752, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "getIccPublicKeyLength-w2LRezQ")
    public final byte setY() {
        return ((Byte) setOnFocusChangeListener(new Object[]{this}, -1490640910, 1490640927, System.identityHashCode(this))).byteValue();
    }

    @JvmName(name = "getCertificateSerialNumber")
    @NotNull
    public final byte[] setX() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1343614962, -1343614950, System.identityHashCode(this));
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ®\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062w\u0010\u0016\u001as\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\t0\fH\u0007¢\u0006\u0004\b\n\u0010\u0017"}, d2 = {"Lcom/mypinpad/tsdk/i/df$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", "p0", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p1", "", "p2", "p3", "Lcom/mypinpad/tsdk/i/df;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setContentDescription;[B[B)Lcom/mypinpad/tsdk/i/df;", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "certData", "", "modulusLength", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "remainder", "exponent", "staticData", "p4", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setContentDescription;[B[BLkotlin/jvm/functions/Function5;)Lcom/mypinpad/tsdk/i/df;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setDividerPadding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f55176a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55177b = 1;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "p0", "", "p1", "Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "p2", "p3", "p4", "Lcom/mypinpad/tsdk/i/df;", "setOnFocusChangeListener", "([BILcom/mypinpad/tsdk/i/getBeepOnFailure;Lcom/mypinpad/tsdk/i/getBeepOnFailure;[B)Lcom/mypinpad/tsdk/i/df;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a extends Lambda implements Function5<byte[], Integer, getBeepOnFailure, getBeepOnFailure, byte[], df> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f55178p0 = new a();

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public static int f55179q0 = 0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public static int f55180r0 = 1;

            static {
                int i10 = f55180r0 + 119;
                f55179q0 = i10 % 128;
                int i11 = i10 % 2;
            }

            public a() {
                super(5);
            }

            public static /* synthetic */ df a(Object[] objArr, int i10, int i11) {
                int i12 = ~i11;
                int i13 = (i12 * (-629)) + (i11 * (-628)) + (i10 * 630);
                int i14 = ~i10;
                if (((i14 | i11) * 629) + ((~(i12 | i14)) * (-629)) + i13 != 1) {
                    byte[] bArr = (byte[]) objArr[1];
                    int iIntValue = ((Number) objArr[2]).intValue();
                    getBeepOnFailure getbeeponfailure = (getBeepOnFailure) objArr[3];
                    getBeepOnFailure getbeeponfailure2 = (getBeepOnFailure) objArr[4];
                    byte[] bArr2 = (byte[]) objArr[5];
                    Intrinsics.checkNotNullParameter(bArr, "");
                    Intrinsics.checkNotNullParameter(getbeeponfailure2, "");
                    Intrinsics.checkNotNullParameter(bArr2, "");
                    byte[] onFocusChangeListener = getbeeponfailure == null ? null : getbeeponfailure.setOnFocusChangeListener();
                    if (onFocusChangeListener == null) {
                        onFocusChangeListener = new byte[0];
                    }
                    return new df(bArr, iIntValue, onFocusChangeListener, getbeeponfailure2.setOnFocusChangeListener(), bArr2);
                }
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                Object obj3 = objArr[3];
                Object obj4 = objArr[4];
                Object obj5 = objArr[5];
                int i15 = f55179q0;
                int i16 = i15 ^ 121;
                int i17 = (i15 & 121) << 1;
                int i18 = (i16 & i17) + (i17 | i16);
                f55180r0 = i18 % 128;
                int i19 = i18 % 2;
                df dfVarA = a(new Object[]{aVar, (byte[]) obj, Integer.valueOf(((Number) obj2).intValue()), (getBeepOnFailure) obj3, (getBeepOnFailure) obj4, (byte[]) obj5}, -596850884, 596850884);
                int i20 = f55180r0 + 73;
                f55179q0 = i20 % 128;
                int i21 = i20 % 2;
                return dfVarA;
            }

            @Override // kotlin.jvm.functions.Function5
            public final /* synthetic */ df invoke(byte[] bArr, Integer num, getBeepOnFailure getbeeponfailure, getBeepOnFailure getbeeponfailure2, byte[] bArr2) {
                Object[] objArr = {this, bArr, num, getbeeponfailure, getbeeponfailure2, bArr2};
                System.identityHashCode(this);
                return a(objArr, 1066986763, -1066986762);
            }
        }

        public setDividerPadding() {
        }

        public /* synthetic */ setDividerPadding(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x006f, code lost:
        
            if (r8 == null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
        
            if (r8 == null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
        
            r1 = com.mypinpad.tsdk.isolation.setAnimation.INSTANCE;
            r1 = (com.mypinpad.tsdk.isolation.getBeepOnFailure) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r0, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], -598265962, 598266002, (int) java.lang.System.currentTimeMillis())}, -1593889019, 1593889062, java.lang.System.identityHashCode(r0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a2, code lost:
        
            if (r1 != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00a4, code lost:
        
            r0 = com.mypinpad.tsdk.i.df.setDividerPadding.f55176a;
            r1 = r0 ^ 99;
            r2 = ((r0 & 99) | r1) << 1;
            r1 = -r1;
            r3 = (r2 & r1) + (r1 | r2);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55177b = r3 % 128;
            r3 = r3 % 2;
            r1 = (r0 & (-94)) | ((~r0) & 93);
            r0 = -(-((r0 & 93) << 1));
            r2 = (r1 ^ r0) + ((r0 & r1) << 1);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55177b = r2 % 128;
            r2 = r2 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00cd, code lost:
        
            r15 = (com.mypinpad.tsdk.isolation.getBeepOnFailure) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r0, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], -1550249147, 1550249160, (int) java.lang.System.currentTimeMillis())}, -1593889019, 1593889062, java.lang.System.identityHashCode(r0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00f1, code lost:
        
            if (r15 != null) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00f3, code lost:
        
            r0 = com.mypinpad.tsdk.i.df.setDividerPadding.f55177b;
            r1 = r0 ^ 13;
            r2 = ((r0 & 13) | r1) << 1;
            r1 = -r1;
            r3 = ((r2 | r1) << 1) - (r1 ^ r2);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55176a = r3 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0106, code lost:
        
            if ((r3 % 2) != 0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0108, code lost:
        
            r1 = r0 & 125;
            r1 = r1 + ((r0 ^ 125) | r1);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55176a = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0113, code lost:
        
            if ((r1 % 2) == 0) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0115, code lost:
        
            r0 = 89 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x011a, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x011b, code lost:
        
            r2 = (com.mypinpad.tsdk.isolation.getBeepOnFailure) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r0, (com.mypinpad.tsdk.isolation.TransactionFailed) com.mypinpad.tsdk.isolation.setAnimation.setY(new java.lang.Object[0], -49734503, 49734731, (int) java.lang.System.currentTimeMillis())}, -1593889019, 1593889062, java.lang.System.identityHashCode(r0));
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x015a, code lost:
        
            if (((byte[]) com.mypinpad.tsdk.isolation.getBeepOnFailure.setOnFocusChangeListener(new java.lang.Object[]{r1}, 252497730, -252497710, java.lang.System.identityHashCode(r1))).length == r8.length) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x015c, code lost:
        
            r0 = com.mypinpad.tsdk.i.df.setDividerPadding.f55176a;
            r1 = (r0 | 91) << 1;
            r0 = -(((~r0) & 91) | (r0 & (-92)));
            r2 = ((r1 | r0) << 1) - (r0 ^ r1);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55177b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0172, code lost:
        
            if ((r2 % 2) != 0) goto L67;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0174, code lost:
        
            r0 = 18 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0179, code lost:
        
            r10 = com.mypinpad.tsdk.isolation.dl.INSTANCE;
            r9 = (com.mypinpad.tsdk.isolation.df) r11.invoke((byte[]) com.mypinpad.tsdk.isolation.dl.Companion.setOnFocusChangeListener(new java.lang.Object[]{(byte[]) com.mypinpad.tsdk.isolation.getBeepOnFailure.setOnFocusChangeListener(new java.lang.Object[]{r1}, 252497730, -252497710, java.lang.System.identityHashCode(r1)), r8, r9}, -1375611456, 1375611456, (int) java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(r8.length), r2, r15, (byte[]) com.mypinpad.tsdk.isolation.setScrollBarDefaultDelayBeforeFade.setDividerPadding(new java.lang.Object[]{r0}, -854811249, 854811301, java.lang.System.identityHashCode(r0)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x01d1, code lost:
        
            if (r2 == null) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x01d3, code lost:
        
            r12 = com.mypinpad.tsdk.i.df.setDividerPadding.f55176a + 32;
            r13 = (r12 ^ (-1)) + (r12 << 1);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55177b = r13 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x01e0, code lost:
        
            if ((r13 % 2) != 0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x01e2, code lost:
        
            r1 = kotlin.collections.ArraysKt___ArraysJvmKt.plus((byte[]) com.mypinpad.tsdk.isolation.df.setOnFocusChangeListener(new java.lang.Object[]{r9}, -903326197, 903326216, java.lang.System.identityHashCode(r9)), (byte[]) com.mypinpad.tsdk.isolation.getBeepOnFailure.setOnFocusChangeListener(new java.lang.Object[]{r2}, 252497730, -252497710, java.lang.System.identityHashCode(r2)));
            r2 = 9 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0206, code lost:
        
            r1 = kotlin.collections.ArraysKt___ArraysJvmKt.plus((byte[]) com.mypinpad.tsdk.isolation.df.setOnFocusChangeListener(new java.lang.Object[]{r9}, -903326197, 903326216, java.lang.System.identityHashCode(r9)), (byte[]) com.mypinpad.tsdk.isolation.getBeepOnFailure.setOnFocusChangeListener(new java.lang.Object[]{r2}, 252497730, -252497710, java.lang.System.identityHashCode(r2)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0227, code lost:
        
            r1 = (byte[]) com.mypinpad.tsdk.isolation.df.setOnFocusChangeListener(new java.lang.Object[]{r9}, -903326197, 903326216, java.lang.System.identityHashCode(r9));
            r2 = com.mypinpad.tsdk.i.df.setDividerPadding.f55176a;
            r8 = (r2 ^ 51) + ((r2 & 51) << 1);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55177b = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0242, code lost:
        
            com.mypinpad.tsdk.isolation.dl.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r9, r1}, -2023844664, 2023844664, java.lang.System.identityHashCode(r9));
            r1 = (byte[]) com.mypinpad.tsdk.isolation.dl.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r9}, 298274011, -298274005, java.lang.System.identityHashCode(r9));
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0269, code lost:
        
            if (r1 != null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x026b, code lost:
        
            r1 = com.mypinpad.tsdk.i.df.setDividerPadding.f55176a;
            r2 = ((r1 | 123) << 1) - (r1 ^ 123);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55177b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0278, code lost:
        
            if ((r2 % 2) == 0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x027a, code lost:
        
            r2 = r1 ^ 39;
            r1 = -(-((r1 & 39) << 1));
            r8 = (r2 ^ r1) + ((r1 & r2) << 1);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55177b = r8 % 128;
            r8 = r8 % 2;
            r1 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x028e, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x028f, code lost:
        
            r2 = com.mypinpad.tsdk.isolation.copy.INSTANCE;
            r1 = (com.mypinpad.tsdk.isolation.TransactionCompleted) com.mypinpad.tsdk.isolation.copy.setOnFocusChangeListener(new java.lang.Object[]{r2, r1}, -1611367294, 1611367299, java.lang.System.identityHashCode(r2));
            r2 = com.mypinpad.tsdk.i.df.setDividerPadding.f55177b;
            r8 = (r2 & 105) + (r2 | 105);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55176a = r8 % 128;
            r8 = r8 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x02b3, code lost:
        
            if (r1 != null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x02b5, code lost:
        
            r0 = com.mypinpad.tsdk.i.df.setDividerPadding.f55177b;
            r2 = r0 & 55;
            r1 = ((r0 ^ 55) | r2) << 1;
            r2 = -((~r2) & (r0 | 55));
            r3 = ((r1 | r2) << 1) - (r1 ^ r2);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55176a = r3 % 128;
            r3 = r3 % 2;
            r1 = ((r0 ^ 19) | (r0 & 19)) << 1;
            r0 = -(((~r0) & 19) | (r0 & (-20)));
            r2 = ((r1 | r0) << 1) - (r0 ^ r1);
            com.mypinpad.tsdk.i.df.setDividerPadding.f55176a = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x02e4, code lost:
        
            if ((r2 % 2) != 0) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x02e8, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x030c, code lost:
        
            if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.df.setOnFocusChangeListener(new java.lang.Object[]{r9, r7, r1, r0.setImageResource()}, 2095153754, -2095153752, java.lang.System.identityHashCode(r9))).booleanValue() != false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x030e, code lost:
        
            r0 = com.mypinpad.tsdk.i.df.setDividerPadding.f55177b;
            r1 = r0 & 71;
            r0 = -(-((r0 ^ 71) | r1));
            r2 = (r1 ^ r0) + ((r0 & r1) << 1);
            r0 = r2 % 128;
            com.mypinpad.tsdk.i.df.setDividerPadding.f55176a = r0;
            r2 = r2 % 2;
            r1 = r0 & 107;
            r1 = (r1 - (~((r0 ^ 107) | r1))) - 1;
            com.mypinpad.tsdk.i.df.setDividerPadding.f55177b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0330, code lost:
        
            r0 = com.mypinpad.tsdk.i.df.setDividerPadding.f55176a;
            r1 = (((r0 & (-80)) | ((~r0) & 79)) - (~((r0 & 79) << 1))) - 1;
            com.mypinpad.tsdk.i.df.setDividerPadding.f55177b = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x04f2, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
        
            return null;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r18, int r19, int r20, int r21) {
            /*
                Method dump skipped, instruction units count: 1267
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.df.setDividerPadding.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
        }

        @Nullable
        public static df setOnFocusChangeListener(@NotNull setScrollBarDefaultDelayBeforeFade p4, @NotNull setContentDescription p10, @Nullable byte[] p11, @Nullable byte[] p12, @NotNull Function5<? super byte[], ? super Integer, ? super getBeepOnFailure, ? super getBeepOnFailure, ? super byte[], ? extends df> p13) {
            return (df) setOnFocusChangeListener(new Object[]{p4, p10, p11, p12, p13}, -1840351827, 1840351827, (int) System.currentTimeMillis());
        }

        @Nullable
        public static df setOnFocusChangeListener(@NotNull setScrollBarDefaultDelayBeforeFade p4, @NotNull setContentDescription p10, @Nullable byte[] p11, @Nullable byte[] p12) {
            return (df) setOnFocusChangeListener(new Object[]{p4, p10, p11, p12}, 969232069, -969232068, (int) System.currentTimeMillis());
        }
    }

    @JvmName(name = "getStaticDataToBeAuthenticated")
    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, 302992795, -302992785, System.identityHashCode(this));
    }
}
