package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnCreateContextMenuListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60204e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60205f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Lazy f60209d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "setX", "()[B"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<byte[]> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60210q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60211r0 = 1;

        public a() {
            super(0);
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            if ((((~(i10 | i12)) | i11) * 272) + (((~(i13 | i12)) | (~(i13 | i11))) * (-272)) + (((~((~i11) | i13 | (~i12))) | (~(i10 | i11 | i12))) * (-272)) + (i11 * (-271)) + (i10 * 273) == 1) {
                a aVar = (a) objArr[0];
                int i14 = f60210q0;
                int i15 = ((i14 & 2) + (i14 | 2)) - 1;
                f60211r0 = i15 % 128;
                int i16 = i15 % 2;
                byte[] bArr = (byte[]) a(new Object[]{aVar}, -1278816302, 1278816302, System.identityHashCode(aVar));
                int i17 = f60211r0;
                int i18 = (i17 & 20) + (i17 | 20);
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                f60210q0 = i19 % 128;
                if (i19 % 2 == 0) {
                    return bArr;
                }
                throw null;
            }
            a aVar2 = (a) objArr[0];
            int i20 = f60211r0;
            int i21 = i20 & 9;
            int i22 = ((i20 | 9) & (~i21)) + (i21 << 1);
            f60210q0 = i22 % 128;
            int i23 = i22 % 2;
            int iIntValue = ((Integer) setOnCreateContextMenuListener.setOnFocusChangeListener(new Object[]{setOnCreateContextMenuListener.this}, -310979174, 310979177, (int) System.currentTimeMillis())).intValue();
            Object[] objArr2 = {Integer.valueOf(iIntValue)};
            setOnCreateContextMenuListener setoncreatecontextmenulistener = setOnCreateContextMenuListener.this;
            int iIntValue2 = ((Integer) setOnCreateContextMenuListener.setOnFocusChangeListener(new Object[]{setoncreatecontextmenulistener}, -156624456, 156624458, (int) System.currentTimeMillis())).intValue();
            Object[] objArr3 = {Integer.valueOf(iIntValue2)};
            int iIntValue3 = ((Integer) setOnCreateContextMenuListener.setOnFocusChangeListener(new Object[]{setoncreatecontextmenulistener}, 441064411, -441064410, (int) System.currentTimeMillis())).intValue();
            byte[] bArr2 = {((Byte) setShowSoftInputOnFocus.setY(objArr2, 2139358410, -2139358410, iIntValue)).byteValue(), ((Byte) setShowSoftInputOnFocus.setY(objArr3, 2139358410, -2139358410, iIntValue2)).byteValue(), ((Byte) setShowSoftInputOnFocus.setY(new Object[]{Integer.valueOf(iIntValue3)}, 2139358410, -2139358410, iIntValue3)).byteValue()};
            int i24 = f60211r0 + 85;
            f60210q0 = i24 % 128;
            int i25 = i24 % 2;
            return bArr2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [byte[], java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ byte[] invoke() {
            return a(new Object[]{this}, 343761856, -343761855, System.identityHashCode(this));
        }
    }

    public setOnCreateContextMenuListener(int i10, int i11, int i12) throws IOException {
        this.f60206a = i10;
        this.f60207b = i11;
        this.f60208c = i12;
        copy copyVar = copy.INSTANCE;
        copy.setOnFocusChangeListener(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)}, -821968662, 821968664, i10);
        this.f60209d = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ((~(i11 | i13)) * 381) + (((~(i10 | i11)) | (~((~i12) | i11)) | (~((~i11) | i13))) * 381) + ((i11 | i12 | i13) * (-381)) + (i11 * 382) + (i10 * (-380));
        if (i14 == 1) {
            setOnCreateContextMenuListener setoncreatecontextmenulistener = (setOnCreateContextMenuListener) objArr[0];
            int i15 = f60205f;
            int i16 = ((i15 ^ 15) | (i15 & 15)) << 1;
            int i17 = -(((~i15) & 15) | (i15 & (-16)));
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            int i19 = i18 % 128;
            f60204e = i19;
            int i20 = i18 % 2;
            int i21 = setoncreatecontextmenulistener.f60208c;
            int i22 = i19 + 63;
            f60205f = i22 % 128;
            int i23 = i22 % 2;
            return Integer.valueOf(i21);
        }
        if (i14 == 2) {
            setOnCreateContextMenuListener setoncreatecontextmenulistener2 = (setOnCreateContextMenuListener) objArr[0];
            int i24 = f60204e;
            int i25 = i24 & 3;
            int i26 = -(-((i24 ^ 3) | i25));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            int i28 = i27 % 128;
            f60205f = i28;
            int i29 = i27 % 2;
            int i30 = setoncreatecontextmenulistener2.f60207b;
            int i31 = (((i28 | 56) << 1) - (i28 ^ 56)) - 1;
            f60204e = i31 % 128;
            int i32 = i31 % 2;
            return Integer.valueOf(i30);
        }
        if (i14 != 3) {
            setOnCreateContextMenuListener setoncreatecontextmenulistener3 = (setOnCreateContextMenuListener) objArr[0];
            int i33 = f60204e;
            int i34 = i33 ^ 79;
            int i35 = ((i33 & 79) | i34) << 1;
            int i36 = -i34;
            int i37 = (i35 & i36) + (i35 | i36);
            f60205f = i37 % 128;
            int i38 = i37 % 2;
            byte[] bArr = (byte[]) setoncreatecontextmenulistener3.f60209d.getValue();
            if (i38 != 0) {
                return bArr;
            }
            throw null;
        }
        setOnCreateContextMenuListener setoncreatecontextmenulistener4 = (setOnCreateContextMenuListener) objArr[0];
        int i39 = f60204e;
        int i40 = ((i39 ^ 25) | (i39 & 25)) << 1;
        int i41 = -(((~i39) & 25) | (i39 & (-26)));
        int i42 = (i40 & i41) + (i41 | i40);
        int i43 = i42 % 128;
        f60205f = i43;
        int i44 = i42 % 2;
        int i45 = setoncreatecontextmenulistener4.f60206a;
        if (i44 == 0) {
            throw null;
        }
        int i46 = i43 & 11;
        int i47 = ((i43 ^ 11) | i46) << 1;
        int i48 = -((i43 | 11) & (~i46));
        int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
        f60204e = i49 % 128;
        if (i49 % 2 != 0) {
            int i50 = 70 / 0;
        }
        return Integer.valueOf(i45);
    }

    @NotNull
    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setOnFocusChangeListener(new Object[]{this}, -1661580950, 1661580950, System.identityHashCode(this));
    }
}
