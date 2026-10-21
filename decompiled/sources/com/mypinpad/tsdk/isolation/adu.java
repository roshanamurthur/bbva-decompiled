package com.mypinpad.tsdk.isolation;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public class adu extends ady {
    public static final a v0 = new a(adu.class, 6);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final ConcurrentHashMap f52507w0 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52508x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52509y0 = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f52510t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public byte[] f52511u0;

    public static class a extends j0 {
        @Override // com.mypinpad.tsdk.isolation.j0
        public final ady b(aft aftVar) {
            Object[] objArr = {this, aftVar};
            System.identityHashCode(this);
            aft aftVar2 = (aft) objArr[1];
            return (adu) adu.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) ads.setDividerPadding(new Object[]{aftVar2}, -952512304, 952512305, System.identityHashCode(aftVar2)), Boolean.FALSE}, -1730542045, 1730542054, (int) System.currentTimeMillis());
        }
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f52512c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f52513d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f52514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f52515b;

        public b(byte[] bArr) {
            this.f52514a = ((Integer) bek.setOnFocusChangeListener(new Object[]{bArr}, -642573231, 642573231, (int) System.currentTimeMillis())).intValue();
            this.f52515b = bArr;
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = i10 | i11;
            int i14 = (i13 * (-502)) + (i11 * 503) + (i10 * 503);
            int i15 = ~i10;
            int i16 = ~((~i11) | i15);
            int i17 = i15 | (~i12);
            int i18 = i16 | (~i17);
            int i19 = ~(i12 | i13);
            if ((((~(i17 | i11)) | i19) * 502) + ((i18 | i19) * (-502)) + i14 != 1) {
                b bVar = (b) objArr[0];
                int i20 = f52512c;
                int i21 = i20 & 63;
                int i22 = (i20 ^ 63) | i21;
                int i23 = (i21 & i22) + (i21 | i22);
                f52513d = i23 % 128;
                int i24 = i23 % 2;
                int i25 = bVar.f52514a;
                int i26 = i20 & 33;
                int i27 = i26 + ((i20 ^ 33) | i26);
                f52513d = i27 % 128;
                int i28 = i27 % 2;
                return Integer.valueOf(i25);
            }
            b bVar2 = (b) objArr[0];
            Object obj = objArr[1];
            int i29 = f52512c;
            int i30 = ((i29 | 33) << 1) - (i29 ^ 33);
            f52513d = i30 % 128;
            int i31 = i30 % 2;
            if (!(obj instanceof b)) {
                int i32 = i29 & 121;
                int i33 = i29 | 121;
                int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
                f52513d = i34 % 128;
                int i35 = i34 % 2;
                return Boolean.FALSE;
            }
            int i36 = i29 & 81;
            int i37 = (i36 - (~((i29 ^ 81) | i36))) - 1;
            f52513d = i37 % 128;
            int i38 = i37 % 2;
            boolean zBooleanValue = ((Boolean) bek.setOnFocusChangeListener(new Object[]{bVar2.f52515b, ((b) obj).f52515b}, -576846525, 576846546, (int) System.currentTimeMillis())).booleanValue();
            int i39 = f52513d + 1;
            f52512c = i39 % 128;
            int i40 = i39 % 2;
            return Boolean.valueOf(zBooleanValue);
        }

        public final boolean equals(Object obj) {
            return ((Boolean) a(new Object[]{this, obj}, 73219968, -73219967, System.identityHashCode(this))).booleanValue();
        }

        public final int hashCode() {
            return ((Integer) a(new Object[]{this}, 631034573, -631034573, System.identityHashCode(this))).intValue();
        }
    }

    static {
        int i10 = f52508x0;
        int i11 = i10 & 47;
        int i12 = ((i10 | 47) & (~i11)) + (i11 << 1);
        f52509y0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public adu(adu aduVar, String str) {
        if (!((Boolean) aeg.setX(new Object[]{str, 0}, 1505150610, -1505150610, 0)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder("string ");
            sb2.append(str);
            sb2.append(" not a valid OID branch");
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((String) setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar)));
        sb3.append(Constant.DOT_STRING);
        sb3.append(str);
        this.f52510t0 = sb3.toString();
    }

    public static /* synthetic */ Integer f(Object[] objArr) {
        adu aduVar = (adu) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = f52508x0;
        int i11 = (i10 ^ 73) + ((i10 & 73) << 1);
        f52509y0 = i11 % 128;
        int i12 = i11 % 2;
        int length = aduVar.i().length;
        int iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(length)}, 1150803379, -1150803367, length)).intValue();
        int i13 = f52508x0;
        int i14 = (i13 & (-50)) | ((~i13) & 49);
        int i15 = -(-((i13 & 49) << 1));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f52509y0 = i16 % 128;
        if (i16 % 2 != 0) {
            return Integer.valueOf(iIntValue);
        }
        int i17 = 51 / 0;
        return Integer.valueOf(iIntValue);
    }

    public static /* synthetic */ Boolean g(Object[] objArr) {
        adu aduVar = (adu) objArr[0];
        adu aduVar2 = (adu) objArr[1];
        int i10 = f52508x0;
        int i11 = (((i10 | 94) << 1) - (i10 ^ 94)) - 1;
        f52509y0 = i11 % 128;
        int i12 = i11 % 2;
        String str = (String) setCompoundDrawableTintBlendMode(new Object[]{aduVar}, 412071809, -412071801, System.identityHashCode(aduVar));
        String str2 = (String) setCompoundDrawableTintBlendMode(new Object[]{aduVar2}, 412071809, -412071801, System.identityHashCode(aduVar2));
        if (str.length() > str2.length()) {
            int i13 = f52509y0;
            int i14 = (i13 & (-66)) | ((~i13) & 65);
            int i15 = (i13 & 65) << 1;
            int i16 = (i14 & i15) + (i15 | i14);
            f52508x0 = i16 % 128;
            int i17 = i16 % 2;
            if (str.charAt(str2.length()) == '.') {
                int i18 = f52508x0;
                int i19 = i18 & 119;
                int i20 = -(-((i18 ^ 119) | i19));
                int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
                f52509y0 = i21 % 128;
                if (i21 % 2 == 0) {
                    str.startsWith(str2);
                    throw null;
                }
                if (str.startsWith(str2)) {
                    int i22 = f52509y0;
                    int i23 = i22 & 113;
                    int i24 = ((i22 | 113) & (~i23)) + (i23 << 1);
                    int i25 = i24 % 128;
                    f52508x0 = i25;
                    boolean z10 = i24 % 2 == 0;
                    int i26 = i25 + 17;
                    f52509y0 = i26 % 128;
                    int i27 = i26 % 2;
                    return Boolean.valueOf(z10);
                }
            }
        }
        int i28 = f52509y0;
        int i29 = ((i28 & 112) + (i28 | 112)) - 1;
        f52508x0 = i29 % 128;
        if (i29 % 2 == 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ adu h(Object[] objArr) {
        adu aduVar = new adu((adu) objArr[0], (String) objArr[1]);
        int i10 = f52509y0;
        int i11 = ((i10 | 84) << 1) - (i10 ^ 84);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f52508x0 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 43 / 0;
        }
        return aduVar;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x036e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0395  */
    /* JADX WARN: Code duplicated, block: B:79:0x03d2  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.adu.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static adu setX(aeh aehVar) {
        return (adu) setCompoundDrawableTintBlendMode(new Object[]{aehVar}, 671070552, -671070540, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10)}, 338260097, -338260095, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -1780538654, 1780538657, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean d(ady adyVar) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, adyVar}, 1393041007, -1393041000, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adw
    public int hashCode() {
        int i10 = f52509y0;
        int i11 = i10 & 35;
        int i12 = ((i10 ^ 35) | i11) << 1;
        int i13 = -((i10 | 35) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        f52508x0 = i14 % 128;
        int i15 = i14 % 2;
        int iHashCode = this.f52510t0.hashCode();
        int i16 = f52508x0;
        int i17 = i16 & 61;
        int i18 = (((i16 | 61) & (~i17)) - (~(-(-(i17 << 1))))) - 1;
        f52509y0 = i18 % 128;
        if (i18 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final synchronized byte[] i() {
        try {
            int i10 = f52508x0;
            int i11 = ((i10 | 98) << 1) - (i10 ^ 98);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            f52509y0 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            if (this.f52511u0 == null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                setCompoundDrawableTintBlendMode(new Object[]{this, byteArrayOutputStream}, 1503290986, -1503290976, System.identityHashCode(this));
                this.f52511u0 = byteArrayOutputStream.toByteArray();
                int i13 = f52508x0 + 123;
                f52509y0 = i13 % 128;
                int i14 = i13 % 2;
            }
            byte[] bArr = this.f52511u0;
            int i15 = f52509y0;
            int i16 = (i15 ^ 73) + ((i15 & 73) << 1);
            f52508x0 = i16 % 128;
            if (i16 % 2 == 0) {
                return bArr;
            }
            int i17 = 63 / 0;
            return bArr;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    public final adu setDividerPadding() {
        return (adu) setCompoundDrawableTintBlendMode(new Object[]{this}, -1820332135, 1820332146, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1904013416, -1904013410, System.identityHashCode(this))).booleanValue();
    }

    public String toString() {
        int i10 = f52509y0;
        int i11 = i10 & 107;
        int i12 = (i11 - (~((i10 ^ 107) | i11))) - 1;
        f52508x0 = i12 % 128;
        Object[] objArr = new Object[1];
        if (i12 % 2 == 0) {
            objArr[0] = this;
            return (String) setCompoundDrawableTintBlendMode(objArr, 412071809, -412071801, System.identityHashCode(this));
        }
        objArr[0] = this;
        throw null;
    }

    public adu(String str) {
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        if (((Boolean) setCompoundDrawableTintBlendMode(new Object[]{str}, -1891381743, 1891381743, (int) System.currentTimeMillis())).booleanValue()) {
            this.f52510t0 = str;
            return;
        }
        StringBuilder sb2 = new StringBuilder("string ");
        sb2.append(str);
        sb2.append(" not an OID");
        throw new IllegalArgumentException(sb2.toString());
    }

    public static adu setY(Object obj) {
        return (adu) setCompoundDrawableTintBlendMode(new Object[]{obj}, -892573455, 892573460, (int) System.currentTimeMillis());
    }

    public final adu setDividerPadding(String str) {
        return (adu) setCompoundDrawableTintBlendMode(new Object[]{this, str}, 750869770, -750869769, System.identityHashCode(this));
    }

    public adu(byte[] bArr, boolean z10) {
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        int i10 = 0;
        long j10 = 0;
        BigInteger bigIntegerShiftLeft = null;
        boolean z11 = true;
        while (i10 != bArr2.length) {
            byte b10 = bArr2[i10];
            if (j10 <= 72057594037927808L) {
                long j11 = j10 + ((long) (b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z11) {
                        if (j11 < 40) {
                            stringBuffer.append('0');
                        } else if (j11 < 80) {
                            stringBuffer.append('1');
                            j11 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j11 -= 80;
                        }
                        z11 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j11);
                    j10 = 0;
                } else {
                    j10 = j11 << 7;
                }
            } else {
                BigInteger bigIntegerOr = (bigIntegerShiftLeft == null ? BigInteger.valueOf(j10) : bigIntegerShiftLeft).or(BigInteger.valueOf(b10 & 127));
                if ((b10 & 128) == 0) {
                    if (z11) {
                        stringBuffer.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z11 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(bigIntegerOr);
                    j10 = 0;
                    bigIntegerShiftLeft = null;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
            int i11 = i10 ^ 50;
            int i12 = -(-((i10 & 50) << 1));
            int i13 = (i11 & i12) + (i11 | i12);
            i10 = ((-1) << 1) - ((((i13 | (-48)) << 1) - (i13 ^ (-48))) ^ (-1));
        }
        this.f52510t0 = stringBuffer.toString();
        this.f52511u0 = z10 ? (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis()) : bArr2;
    }

    public final boolean setCompoundDrawableTintBlendMode(adu aduVar) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, aduVar}, 304857301, -304857297, System.identityHashCode(this))).booleanValue();
    }

    public final String setCompoundDrawableTintBlendMode() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, 412071809, -412071801, System.identityHashCode(this));
    }
}
