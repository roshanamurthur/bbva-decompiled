package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setTitleTextColor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60731c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60732d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Lazy f60733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f60734b;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/setMaxWidth;", "setCompoundDrawableTintBlendMode", "()Lcom/mypinpad/tsdk/i/setMaxWidth;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function0<setMaxWidth> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60735q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60736r0 = 1;

        public a() {
            super(0);
        }

        public static /* synthetic */ setMaxWidth a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i12;
            if ((((~(i10 | i12)) | (~((~i10) | i14)) | (~(i11 | i12))) * 831) + ((~(i13 | i10 | i12)) * (-1662)) + (((~(i13 | i14)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830)) != 1) {
                a aVar = (a) objArr[0];
                int i15 = f60735q0;
                int i16 = i15 & 71;
                int i17 = (i15 | 71) & (~i16);
                int i18 = i16 << 1;
                int i19 = (i17 & i18) + (i17 | i18);
                f60736r0 = i19 % 128;
                int i20 = i19 % 2;
                setTitleTextColor settitletextcolor = setTitleTextColor.this;
                if (i20 != 0) {
                    return (setMaxWidth) setTitleTextColor.setY(new Object[]{settitletextcolor}, -809858159, 809858159, (int) System.currentTimeMillis());
                }
                throw null;
            }
            a aVar2 = (a) objArr[0];
            int i21 = f60735q0;
            int i22 = (i21 & (-88)) | ((~i21) & 87);
            int i23 = (i21 & 87) << 1;
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            f60736r0 = i24 % 128;
            int i25 = i24 % 2;
            setMaxWidth setmaxwidthA = a(new Object[]{aVar2}, 200941890, -200941890, System.identityHashCode(aVar2));
            int i26 = f60736r0;
            int i27 = i26 & 57;
            int i28 = i26 | 57;
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            f60735q0 = i29 % 128;
            if (i29 % 2 == 0) {
                return setmaxwidthA;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ setMaxWidth invoke() {
            return a(new Object[]{this}, 2065599262, -2065599261, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/getBeepOnFailure;", "setY", "()Lcom/mypinpad/tsdk/i/getBeepOnFailure;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b extends Lambda implements Function0<getBeepOnFailure> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60738r0 = 0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f60739s0 = 1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ byte[] f60741q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte[] bArr) {
            super(0);
            this.f60741q0 = bArr;
        }

        public static /* synthetic */ getBeepOnFailure a(Object[] objArr, int i10, int i11, int i12) {
            getBeepOnFailure getbeeponfailureA;
            int i13 = (i11 * 246) + (i10 * (-244));
            int i14 = ~i11;
            int i15 = (((~((~i12) | i14)) | (~(i14 | i10))) * (-245)) + i13;
            int i16 = ~(i14 | i12);
            if (((i10 | i16) * 245) + (i16 * (-245)) + i15 != 1) {
                b bVar = (b) objArr[0];
                int i17 = f60738r0;
                int i18 = (i17 & 109) + (i17 | 109);
                f60739s0 = i18 % 128;
                if (i18 % 2 != 0) {
                    setTitleTextColor settitletextcolor = setTitleTextColor.this;
                    return (getBeepOnFailure) setTitleTextColor.setY(new Object[]{bVar.f60741q0}, -232461687, 232461688, (int) System.currentTimeMillis());
                }
                setTitleTextColor settitletextcolor2 = setTitleTextColor.this;
                throw null;
            }
            b bVar2 = (b) objArr[0];
            int i19 = f60739s0;
            int i20 = i19 ^ 43;
            int i21 = (((i19 & 43) | i20) << 1) - i20;
            f60738r0 = i21 % 128;
            if (i21 % 2 != 0) {
                getbeeponfailureA = a(new Object[]{bVar2}, -1432952409, 1432952409, System.identityHashCode(bVar2));
                int i22 = 14 / 0;
            } else {
                getbeeponfailureA = a(new Object[]{bVar2}, -1432952409, 1432952409, System.identityHashCode(bVar2));
            }
            int i23 = f60739s0;
            int i24 = i23 & 113;
            int i25 = i24 + ((i23 ^ 113) | i24);
            f60738r0 = i25 % 128;
            if (i25 % 2 == 0) {
                return getbeeponfailureA;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ getBeepOnFailure invoke() {
            return a(new Object[]{this}, -501511112, 501511113, System.identityHashCode(this));
        }
    }

    public setTitleTextColor(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.f60733a = LazyKt__LazyJVMKt.lazy(new b(bArr));
        this.f60734b = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final /* synthetic */ setMaxWidth setCompoundDrawableTintBlendMode(setTitleTextColor settitletextcolor) {
        return (setMaxWidth) setY(new Object[]{settitletextcolor}, -809858159, 809858159, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ getBeepOnFailure setX(byte[] bArr) {
        return (getBeepOnFailure) setY(new Object[]{bArr}, -232461687, 232461688, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0785  */
    /* JADX WARN: Code duplicated, block: B:28:0x018a  */
    /* JADX WARN: Code duplicated, block: B:30:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:31:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:33:0x021b  */
    /* JADX WARN: Code duplicated, block: B:35:0x022e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0232  */
    /* JADX WARN: Code duplicated, block: B:39:0x023b  */
    /* JADX WARN: Code duplicated, block: B:40:0x023f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0240  */
    /* JADX WARN: Code duplicated, block: B:46:0x025d  */
    /* JADX WARN: Code duplicated, block: B:47:0x025e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0285  */
    /* JADX WARN: Code duplicated, block: B:50:0x028f  */
    /* JADX WARN: Code duplicated, block: B:52:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x050a  */
    /* JADX WARN: Code duplicated, block: B:83:0x055f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0566  */
    /* JADX WARN: Code duplicated, block: B:87:0x0592  */
    /* JADX WARN: Code duplicated, block: B:89:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:91:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:92:0x05db  */
    /* JADX WARN: Code duplicated, block: B:93:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:95:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:97:0x060f  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        String str;
        TransactionFailed transactionFailed;
        int i13;
        byte[] bArr;
        getBeepOnFailure getbeeponfailure;
        byte[] bArr2;
        int i14;
        TransactionFailed transactionFailed2;
        Object setmaxwidth;
        String str2;
        TransactionFailed transactionFailed3;
        TransactionFailed transactionFailed4;
        int i15;
        Object x4;
        byte[] bArr3;
        getBeepOnFailure getbeeponfailure2;
        byte[] bArr4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
        int i21 = ~i11;
        int i22 = ~(i21 | i10);
        int i23 = ~(i10 | i12);
        int i24 = ((i22 | i23) * (-814)) + i20;
        int i25 = ~(i21 | (~i12));
        int i26 = ~i10;
        int i27 = ~(i26 | i11);
        switch ((((~(i26 | i12)) | i27 | (~(i11 | i12))) * 407) + ((i25 | i27 | i23) * 407) + i24) {
            case 1:
                byte[] bArr5 = (byte[]) objArr[0];
                int i28 = f60731c;
                int i29 = ((i28 ^ 7) | (i28 & 7)) << 1;
                int i30 = -(((~i28) & 7) | (i28 & (-8)));
                int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
                f60732d = i31 % 128;
                if (i31 % 2 != 0) {
                    return (getBeepOnFailure) setY(new Object[]{bArr5}, -1847085082, 1847085085, (int) System.currentTimeMillis());
                }
                throw null;
            case 2:
                setTitleTextColor settitletextcolor = (setTitleTextColor) objArr[0];
                int i32 = f60731c + 45;
                f60732d = i32 % 128;
                int i33 = i32 % 2;
                getBeepOnFailure getbeeponfailure3 = (getBeepOnFailure) setY(new Object[]{settitletextcolor}, 429378437, -429378432, System.identityHashCode(settitletextcolor));
                if (getbeeponfailure3 == null) {
                    int i34 = f60731c;
                    int i35 = i34 & 91;
                    int i36 = -(-(i34 | 91));
                    int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                    f60732d = i37 % 128;
                    if (i37 % 2 == 0) {
                        throw null;
                    }
                } else {
                    setScrollContainer setscrollcontainer = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure3}, 865402441, -865402437, System.identityHashCode(getbeeponfailure3));
                    if (setscrollcontainer == null) {
                        int i38 = f60731c;
                        int i39 = (i38 & (-116)) | ((~i38) & 115);
                        int i40 = -(-((i38 & 115) << 1));
                        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                        f60732d = i41 % 128;
                        if (i41 % 2 == 0) {
                            int i42 = 36 / 0;
                        }
                    } else {
                        str = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer}, -888877733, 888877739, System.identityHashCode(setscrollcontainer));
                        int i43 = f60732d;
                        int i44 = i43 & 15;
                        int i45 = (i43 ^ 15) | i44;
                        int i46 = (i44 & i45) + (i45 | i44);
                        f60731c = i46 % 128;
                        int i47 = i46 % 2;
                    }
                    setAnimation setanimation = setAnimation.INSTANCE;
                    transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 394772330, -394772131, (int) System.currentTimeMillis());
                    if (!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                        int i48 = f60732d;
                        int i49 = i48 & 23;
                        int i50 = ((i48 ^ 23) | i49) << 1;
                        int i51 = -((i48 | 23) & (~i49));
                        i13 = ((i50 | i51) << 1) - (i51 ^ i50);
                        f60731c = i13 % 128;
                        if (i13 % 2 == 0) {
                            TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                            setFindListener setfindlistener = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed5}, -570885530, 570885532, System.identityHashCode(transactionFailed5));
                            throw null;
                        }
                        TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                        setFindListener setfindlistener2 = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed6}, -570885530, 570885532, System.identityHashCode(transactionFailed6));
                        bArr = (byte[]) setFindListener.setY(new Object[]{setfindlistener2}, -333856840, 333856841, System.identityHashCode(setfindlistener2));
                        getbeeponfailure = (getBeepOnFailure) setY(new Object[]{settitletextcolor}, 429378437, -429378432, System.identityHashCode(settitletextcolor));
                        if (getbeeponfailure == null) {
                            i14 = f60732d + 119;
                            f60731c = i14 % 128;
                            if (i14 % 2 == 0) {
                                throw null;
                            }
                            bArr2 = null;
                        } else {
                            bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                            int i52 = f60732d;
                            int i53 = (i52 & 33) + (i52 | 33);
                            f60731c = i53 % 128;
                            int i54 = i53 % 2;
                        }
                        if (bArr2 != null) {
                            int i55 = f60732d;
                            int i56 = i55 & 39;
                            int i57 = i56 + ((i55 ^ 39) | i56);
                            f60731c = i57 % 128;
                            int i58 = i57 % 2;
                            if (bArr2.length >= bArr.length) {
                                int length = bArr2.length;
                                int i59 = -bArr.length;
                                int iIdentityHashCode = System.identityHashCode(settitletextcolor);
                                int i60 = i59 * (-183);
                                int i61 = length * 185;
                                int i62 = (i60 & i61) + (i60 | i61);
                                int i63 = ~i59;
                                int i64 = (i63 | i59) & i63;
                                int i65 = length & i64;
                                int i66 = (i64 | length) & (~i65);
                                int i67 = -(-(((i66 & i65) | (i66 ^ i65)) * (-368)));
                                int i68 = i62 & i67;
                                int i69 = ((i62 ^ i67) | i68) << 1;
                                int i70 = -((i67 | i62) & (~i68));
                                int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                                int i72 = ~length;
                                int i73 = i59 ^ i72;
                                int i74 = i59 & i72;
                                int i75 = (i73 ^ i74) | (i73 & i74);
                                int i76 = ~iIdentityHashCode;
                                int i77 = ~i76;
                                int i78 = (i75 & i77) | ((~i75) & i76);
                                int i79 = i75 & i76;
                                int i80 = -(-(((i78 ^ i79) | (i79 & i78)) * 184));
                                int i81 = ((((~i71) & i80) | ((~i80) & i71)) - (~((i71 & i80) << 1))) - 1;
                                int i82 = i63 & i72;
                                int i83 = (i72 | i63) & (~i82);
                                int i84 = ~((i83 & i82) | (i83 ^ i82));
                                int i85 = (i76 & i63) | (i59 & i77);
                                int i86 = i76 & i59;
                                int i87 = (i86 & i85) | (i85 ^ i86);
                                int i88 = ~i87;
                                int i89 = (i87 | i88) & i88;
                                int i90 = i84 & i89;
                                int i91 = (i89 | i84) & (~i90);
                                int i92 = (i91 & i90) | (i91 ^ i90);
                                int i93 = (i63 & length) | i74;
                                int i94 = length & i59;
                                int i95 = ~((i94 & i93) | (i93 ^ i94));
                                int i96 = i92 & i95;
                                int i97 = (i92 | i95) & (~i96);
                                int i98 = -(-(((i97 & i96) | (i97 ^ i96)) * 184));
                                int i99 = (i81 ^ i98) + ((i98 & i81) << 1);
                                byte[] bArr6 = new byte[i99];
                                System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
                                System.arraycopy(bArr2, bArr.length, bArr6, 0, i99);
                                setMaxWidth setmaxwidth2 = new setMaxWidth();
                                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                                TransactionFailed transactionFailed7 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                                Boolean bool = Boolean.FALSE;
                                ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth2, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed7}, 1914607362, -1914607356, System.identityHashCode(transactionFailed7)), bArr, null, bool, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth2))).booleanValue();
                                TransactionFailed transactionFailed8 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                                ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth2, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed8}, 1914607362, -1914607356, System.identityHashCode(transactionFailed8)), bArr6, null, bool, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth2))).booleanValue();
                                int i100 = f60732d;
                                int i101 = (-2) - (((i100 & 54) + (i100 | 54)) ^ (-1));
                                f60731c = i101 % 128;
                                int i102 = i101 % 2;
                                return setmaxwidth2;
                            }
                        }
                        throw new fh(42, null, 2, null);
                    }
                    transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 2070377797, -2070377719, (int) System.currentTimeMillis());
                    if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                        throw new fh(7, null, 2, null);
                    }
                    setmaxwidth = new setMaxWidth();
                    getBeepOnFailure getbeeponfailure4 = (getBeepOnFailure) setY(new Object[]{settitletextcolor}, 429378437, -429378432, System.identityHashCode(settitletextcolor));
                    Intrinsics.checkNotNull(getbeeponfailure4);
                    setMaxWidth.setX(new Object[]{setmaxwidth, (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure4}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure4))}, -855777080, 855777092, System.identityHashCode(setmaxwidth));
                    int i103 = f60732d;
                    int i104 = ((i103 & (-40)) | ((~i103) & 39)) + ((i103 & 39) << 1);
                    f60731c = i104 % 128;
                    int i105 = i104 % 2;
                }
                str = null;
                setAnimation setanimation2 = setAnimation.INSTANCE;
                transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 394772330, -394772131, (int) System.currentTimeMillis());
                if (!Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)))) {
                    int i410 = f60732d;
                    int i411 = i410 & 23;
                    int i510 = ((i410 ^ 23) | i411) << 1;
                    int i511 = -((i410 | 23) & (~i411));
                    i13 = ((i510 | i511) << 1) - (i511 ^ i510);
                    f60731c = i13 % 128;
                    if (i13 % 2 == 0) {
                        TransactionFailed transactionFailed9 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                        setFindListener setfindlistener3 = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed9}, -570885530, 570885532, System.identityHashCode(transactionFailed9));
                        throw null;
                    }
                    TransactionFailed transactionFailed10 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                    setFindListener setfindlistener4 = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed10}, -570885530, 570885532, System.identityHashCode(transactionFailed10));
                    bArr = (byte[]) setFindListener.setY(new Object[]{setfindlistener4}, -333856840, 333856841, System.identityHashCode(setfindlistener4));
                    getbeeponfailure = (getBeepOnFailure) setY(new Object[]{settitletextcolor}, 429378437, -429378432, System.identityHashCode(settitletextcolor));
                    if (getbeeponfailure == null) {
                        i14 = f60732d + 119;
                        f60731c = i14 % 128;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                        bArr2 = null;
                    } else {
                        bArr2 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure}, 252497730, -252497710, System.identityHashCode(getbeeponfailure));
                        int i512 = f60732d;
                        int i513 = (i512 & 33) + (i512 | 33);
                        f60731c = i513 % 128;
                        int i514 = i513 % 2;
                    }
                    if (bArr2 != null) {
                        int i515 = f60732d;
                        int i516 = i515 & 39;
                        int i517 = i516 + ((i515 ^ 39) | i516);
                        f60731c = i517 % 128;
                        int i518 = i517 % 2;
                        if (bArr2.length >= bArr.length) {
                            int length2 = bArr2.length;
                            int i519 = -bArr.length;
                            int iIdentityHashCode2 = System.identityHashCode(settitletextcolor);
                            int i610 = i519 * (-183);
                            int i611 = length2 * 185;
                            int i612 = (i610 & i611) + (i610 | i611);
                            int i613 = ~i519;
                            int i614 = (i613 | i519) & i613;
                            int i615 = length2 & i614;
                            int i616 = (i614 | length2) & (~i615);
                            int i617 = -(-(((i616 & i615) | (i616 ^ i615)) * (-368)));
                            int i618 = i612 & i617;
                            int i619 = ((i612 ^ i617) | i618) << 1;
                            int i710 = -((i617 | i612) & (~i618));
                            int i711 = ((i619 | i710) << 1) - (i710 ^ i619);
                            int i712 = ~length2;
                            int i713 = i519 ^ i712;
                            int i714 = i519 & i712;
                            int i715 = (i713 ^ i714) | (i713 & i714);
                            int i716 = ~iIdentityHashCode2;
                            int i717 = ~i716;
                            int i718 = (i715 & i717) | ((~i715) & i716);
                            int i719 = i715 & i716;
                            int i810 = -(-(((i718 ^ i719) | (i719 & i718)) * 184));
                            int i811 = ((((~i711) & i810) | ((~i810) & i711)) - (~((i711 & i810) << 1))) - 1;
                            int i812 = i613 & i712;
                            int i813 = (i712 | i613) & (~i812);
                            int i814 = ~((i813 & i812) | (i813 ^ i812));
                            int i815 = (i716 & i613) | (i519 & i717);
                            int i816 = i716 & i519;
                            int i817 = (i816 & i815) | (i815 ^ i816);
                            int i818 = ~i817;
                            int i819 = (i817 | i818) & i818;
                            int i910 = i814 & i819;
                            int i911 = (i819 | i814) & (~i910);
                            int i912 = (i911 & i910) | (i911 ^ i910);
                            int i913 = (i613 & length2) | i714;
                            int i914 = length2 & i519;
                            int i915 = ~((i914 & i913) | (i913 ^ i914));
                            int i916 = i912 & i915;
                            int i917 = (i912 | i915) & (~i916);
                            int i918 = -(-(((i917 & i916) | (i917 ^ i916)) * 184));
                            int i919 = (i811 ^ i918) + ((i918 & i811) << 1);
                            byte[] bArr7 = new byte[i919];
                            System.arraycopy(bArr2, 0, bArr, 0, bArr.length);
                            System.arraycopy(bArr2, bArr.length, bArr7, 0, i919);
                            setMaxWidth setmaxwidth3 = new setMaxWidth();
                            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
                            TransactionFailed transactionFailed11 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                            Boolean bool2 = Boolean.FALSE;
                            ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth3, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed11}, 1914607362, -1914607356, System.identityHashCode(transactionFailed11)), bArr, null, bool2, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth3))).booleanValue();
                            TransactionFailed transactionFailed12 = (TransactionFailed) setAnimation.setY(new Object[0], 1434076523, -1434076328, (int) System.currentTimeMillis());
                            ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth3, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed12}, 1914607362, -1914607356, System.identityHashCode(transactionFailed12)), bArr7, null, bool2, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth3))).booleanValue();
                            int i106 = f60732d;
                            int i107 = (-2) - (((i106 & 54) + (i106 | 54)) ^ (-1));
                            f60731c = i107 % 128;
                            int i108 = i107 % 2;
                            return setmaxwidth3;
                        }
                    }
                    throw new fh(42, null, 2, null);
                }
                transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 2070377797, -2070377719, (int) System.currentTimeMillis());
                if (Intrinsics.areEqual(str, (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2)))) {
                    throw new fh(7, null, 2, null);
                }
                setmaxwidth = new setMaxWidth();
                getBeepOnFailure getbeeponfailure5 = (getBeepOnFailure) setY(new Object[]{settitletextcolor}, 429378437, -429378432, System.identityHashCode(settitletextcolor));
                Intrinsics.checkNotNull(getbeeponfailure5);
                setMaxWidth.setX(new Object[]{setmaxwidth, (List) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure5}, -1797741519, 1797741532, System.identityHashCode(getbeeponfailure5))}, -855777080, 855777092, System.identityHashCode(setmaxwidth));
                int i109 = f60732d;
                int i1010 = ((i109 & (-40)) | ((~i109) & 39)) + ((i109 & 39) << 1);
                f60731c = i1010 % 128;
                int i1011 = i1010 % 2;
                break;
                break;
            case 3:
                byte[] bArr8 = (byte[]) objArr[0];
                int i110 = f60732d;
                int i111 = ((i110 ^ 19) | (i110 & 19)) << 1;
                int i112 = -(((~i110) & 19) | (i110 & (-20)));
                int i113 = (i111 & i112) + (i112 | i111);
                f60731c = i113 % 128;
                int i114 = i113 % 2;
                if (((Boolean) setLogo.setY(new Object[]{Byte.valueOf(bArr8[0]), 7}, 1812344530, -1812344522, 7)).booleanValue()) {
                    int i115 = f60732d;
                    int i116 = i115 & 39;
                    int i117 = i115 | 39;
                    int i118 = ((i116 | i117) << 1) - (i117 ^ i116);
                    f60731c = i118 % 128;
                    int i119 = i118 % 2;
                    getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = getBeepOnFailure.setOnFocusChangeListener;
                    setAnimation setanimation3 = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed13 = (TransactionFailed) setAnimation.setY(new Object[0], 394772330, -394772131, (int) System.currentTimeMillis());
                    setmaxwidth = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed13}, 1914607362, -1914607356, System.identityHashCode(transactionFailed13)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
                    int i120 = f60732d + 119;
                    f60731c = i120 % 128;
                    int i121 = i120 % 2;
                } else {
                    getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = getBeepOnFailure.setOnFocusChangeListener;
                    setAnimation setanimation4 = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed14 = (TransactionFailed) setAnimation.setY(new Object[0], 2070377797, -2070377719, (int) System.currentTimeMillis());
                    setmaxwidth = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed14}, 1914607362, -1914607356, System.identityHashCode(transactionFailed14)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
                    int i122 = f60732d;
                    int i123 = ((i122 & 45) - (~(i122 | 45))) - 1;
                    f60731c = i123 % 128;
                    int i124 = i123 % 2;
                }
                ((Integer) setLeftTopRightBottom.setCompoundDrawableTintBlendMode(new Object[]{setmaxwidth, bArr8}, -1162888331, 1162888331, (int) System.currentTimeMillis())).intValue();
                int i125 = f60732d + 113;
                f60731c = i125 % 128;
                if (i125 % 2 != 0) {
                    int i126 = 5 / 0;
                }
                break;
            case 4:
                setTitleTextColor settitletextcolor2 = (setTitleTextColor) objArr[0];
                Terminal terminal = (Terminal) objArr[1];
                int i127 = f60732d;
                int i128 = (i127 ^ 29) + ((i127 & 29) << 1);
                f60731c = i128 % 128;
                if (i128 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(terminal, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(terminal, "");
                getBeepOnFailure getbeeponfailure6 = (getBeepOnFailure) setY(new Object[]{settitletextcolor2}, 429378437, -429378432, System.identityHashCode(settitletextcolor2));
                if (getbeeponfailure6 != null) {
                    setScrollContainer setscrollcontainer2 = (setScrollContainer) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure6}, 865402441, -865402437, System.identityHashCode(getbeeponfailure6));
                    if (setscrollcontainer2 == null) {
                        int i129 = f60732d;
                        int i130 = (i129 ^ 35) + ((i129 & 35) << 1);
                        f60731c = i130 % 128;
                        if (i130 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        str2 = (String) setScrollContainer.setOnFocusChangeListener(new Object[]{setscrollcontainer2}, -888877733, 888877739, System.identityHashCode(setscrollcontainer2));
                        int i131 = f60732d;
                        int i132 = i131 & 29;
                        int i133 = -(-((i131 ^ 29) | i132));
                        int i134 = ((i132 | i133) << 1) - (i133 ^ i132);
                        f60731c = i134 % 128;
                        int i135 = i134 % 2;
                    }
                    setAnimation setanimation5 = setAnimation.INSTANCE;
                    transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 394772330, -394772131, (int) System.currentTimeMillis());
                    if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)))) {
                        System.identityHashCode(settitletextcolor2);
                        System.identityHashCode(settitletextcolor2);
                        TransactionFailed transactionFailed15 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                        setFindListener setfindlistener5 = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed15}, -570885530, 570885532, System.identityHashCode(transactionFailed15));
                        bArr3 = (byte[]) setFindListener.setY(new Object[]{setfindlistener5}, -333856840, 333856841, System.identityHashCode(setfindlistener5));
                        getbeeponfailure2 = (getBeepOnFailure) setY(new Object[]{settitletextcolor2}, 429378437, -429378432, System.identityHashCode(settitletextcolor2));
                        if (getbeeponfailure2 == null) {
                            int i136 = f60731c + 37;
                            int i137 = i136 % 128;
                            f60732d = i137;
                            int i138 = i136 % 2;
                            int i139 = i137 & 11;
                            int i140 = i139 + ((i137 ^ 11) | i139);
                            f60731c = i140 % 128;
                            int i141 = i140 % 2;
                            bArr4 = null;
                        } else {
                            bArr4 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                            int i142 = f60732d;
                            int i143 = ((i142 ^ 74) + ((i142 & 74) << 1)) - 1;
                            f60731c = i143 % 128;
                            int i144 = i143 % 2;
                        }
                        if (bArr4 != null) {
                            int i145 = f60732d;
                            i17 = (-2) - ((((i145 | 38) << 1) - (i145 ^ 38)) ^ (-1));
                            i18 = i17 % 128;
                            f60731c = i18;
                            if (i17 % 2 == 0) {
                                int length3 = bArr3.length;
                                throw null;
                            }
                            if (bArr4.length >= bArr3.length) {
                                i19 = i18 + 125;
                                f60732d = i19 % 128;
                                if (i19 % 2 != 0) {
                                    return Boolean.TRUE;
                                }
                                throw null;
                            }
                        }
                        int i146 = f60732d;
                        int i147 = i146 | 61;
                        int i148 = i147 << 1;
                        int i149 = -((~(i146 & 61)) & i147);
                        i16 = (i148 ^ i149) + ((i149 & i148) << 1);
                        f60731c = i16 % 128;
                        if (i16 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 2070377797, -2070377719, (int) System.currentTimeMillis());
                        if (!Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4)))) {
                            i15 = f60731c + 103;
                            f60732d = i15 % 128;
                            if (i15 % 2 == 0) {
                                setMaxWidth setmaxwidth4 = (setMaxWidth) setY(new Object[]{settitletextcolor2}, -1049767002, 1049767008, System.identityHashCode(settitletextcolor2));
                                x4 = setMaxWidth.setX(new Object[]{setmaxwidth4, terminal, new setTextSize[]{setTextSize.setCompoundDrawableTintBlendMode}}, 114360989, -114360961, System.identityHashCode(setmaxwidth4));
                            } else {
                                setMaxWidth setmaxwidth5 = (setMaxWidth) setY(new Object[]{settitletextcolor2}, -1049767002, 1049767008, System.identityHashCode(settitletextcolor2));
                                x4 = setMaxWidth.setX(new Object[]{setmaxwidth5, terminal, new setTextSize[]{setTextSize.setCompoundDrawableTintBlendMode}}, 114360989, -114360961, System.identityHashCode(setmaxwidth5));
                            }
                            return Boolean.valueOf(((Boolean) x4).booleanValue());
                        }
                        int i150 = f60732d + 21;
                        f60731c = i150 % 128;
                        int i151 = i150 % 2;
                    }
                    return Boolean.FALSE;
                }
                int i152 = f60731c;
                int i153 = ((i152 & 77) - (~(i152 | 77))) - 1;
                int i154 = i153 % 128;
                f60732d = i154;
                int i155 = i153 % 2;
                int i156 = (i154 & 69) + (i154 | 69);
                f60731c = i156 % 128;
                int i157 = i156 % 2;
                str2 = null;
                setAnimation setanimation6 = setAnimation.INSTANCE;
                transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 394772330, -394772131, (int) System.currentTimeMillis());
                if (Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed3}, 1914607362, -1914607356, System.identityHashCode(transactionFailed3)))) {
                    System.identityHashCode(settitletextcolor2);
                    System.identityHashCode(settitletextcolor2);
                    TransactionFailed transactionFailed16 = (TransactionFailed) setAnimation.setY(new Object[0], 2002669863, -2002669628, (int) System.currentTimeMillis());
                    setFindListener setfindlistener6 = (setFindListener) TransactionFailed.setX(new Object[]{transactionFailed16}, -570885530, 570885532, System.identityHashCode(transactionFailed16));
                    bArr3 = (byte[]) setFindListener.setY(new Object[]{setfindlistener6}, -333856840, 333856841, System.identityHashCode(setfindlistener6));
                    getbeeponfailure2 = (getBeepOnFailure) setY(new Object[]{settitletextcolor2}, 429378437, -429378432, System.identityHashCode(settitletextcolor2));
                    if (getbeeponfailure2 == null) {
                        int i1310 = f60731c + 37;
                        int i1311 = i1310 % 128;
                        f60732d = i1311;
                        int i1312 = i1310 % 2;
                        int i1313 = i1311 & 11;
                        int i1410 = i1313 + ((i1311 ^ 11) | i1313);
                        f60731c = i1410 % 128;
                        int i1411 = i1410 % 2;
                        bArr4 = null;
                    } else {
                        bArr4 = (byte[]) getBeepOnFailure.setOnFocusChangeListener(new Object[]{getbeeponfailure2}, 252497730, -252497710, System.identityHashCode(getbeeponfailure2));
                        int i1412 = f60732d;
                        int i1413 = ((i1412 ^ 74) + ((i1412 & 74) << 1)) - 1;
                        f60731c = i1413 % 128;
                        int i1414 = i1413 % 2;
                    }
                    if (bArr4 != null) {
                        int i1415 = f60732d;
                        i17 = (-2) - ((((i1415 | 38) << 1) - (i1415 ^ 38)) ^ (-1));
                        i18 = i17 % 128;
                        f60731c = i18;
                        if (i17 % 2 == 0) {
                            int length4 = bArr3.length;
                            throw null;
                        }
                        if (bArr4.length >= bArr3.length) {
                            i19 = i18 + 125;
                            f60732d = i19 % 128;
                            if (i19 % 2 != 0) {
                                return Boolean.TRUE;
                            }
                            throw null;
                        }
                    }
                    int i1416 = f60732d;
                    int i1417 = i1416 | 61;
                    int i1418 = i1417 << 1;
                    int i1419 = -((~(i1416 & 61)) & i1417);
                    i16 = (i1418 ^ i1419) + ((i1419 & i1418) << 1);
                    f60731c = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                } else {
                    transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 2070377797, -2070377719, (int) System.currentTimeMillis());
                    if (!Intrinsics.areEqual(str2, (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4)))) {
                        i15 = f60731c + 103;
                        f60732d = i15 % 128;
                        if (i15 % 2 == 0) {
                            setMaxWidth setmaxwidth6 = (setMaxWidth) setY(new Object[]{settitletextcolor2}, -1049767002, 1049767008, System.identityHashCode(settitletextcolor2));
                            x4 = setMaxWidth.setX(new Object[]{setmaxwidth6, terminal, new setTextSize[]{setTextSize.setCompoundDrawableTintBlendMode}}, 114360989, -114360961, System.identityHashCode(setmaxwidth6));
                        } else {
                            setMaxWidth setmaxwidth7 = (setMaxWidth) setY(new Object[]{settitletextcolor2}, -1049767002, 1049767008, System.identityHashCode(settitletextcolor2));
                            x4 = setMaxWidth.setX(new Object[]{setmaxwidth7, terminal, new setTextSize[]{setTextSize.setCompoundDrawableTintBlendMode}}, 114360989, -114360961, System.identityHashCode(setmaxwidth7));
                        }
                        return Boolean.valueOf(((Boolean) x4).booleanValue());
                    }
                    int i158 = f60732d + 21;
                    f60731c = i158 % 128;
                    int i159 = i158 % 2;
                }
                return Boolean.FALSE;
            case 5:
                setTitleTextColor settitletextcolor3 = (setTitleTextColor) objArr[0];
                int i160 = f60732d;
                int i161 = i160 & 91;
                int i162 = ((i160 ^ 91) | i161) << 1;
                int i163 = -((i160 | 91) & (~i161));
                int i164 = (i162 & i163) + (i163 | i162);
                f60731c = i164 % 128;
                int i165 = i164 % 2;
                getBeepOnFailure getbeeponfailure7 = (getBeepOnFailure) settitletextcolor3.f60733a.getValue();
                if (i165 == 0) {
                    return getbeeponfailure7;
                }
                throw null;
            case 6:
                setTitleTextColor settitletextcolor4 = (setTitleTextColor) objArr[0];
                int i166 = f60731c;
                int i167 = i166 ^ 37;
                int i168 = (i166 & 37) << 1;
                int i169 = (i167 & i168) + (i168 | i167);
                f60732d = i169 % 128;
                int i170 = i169 % 2;
                setMaxWidth setmaxwidth8 = (setMaxWidth) settitletextcolor4.f60734b.getValue();
                int i171 = f60732d;
                int i172 = (i171 & 117) + (i171 | 117);
                f60731c = i172 % 128;
                int i173 = i172 % 2;
                return setmaxwidth8;
            default:
                setTitleTextColor settitletextcolor5 = (setTitleTextColor) objArr[0];
                int i174 = f60731c;
                int i175 = (((i174 | 88) << 1) - (i174 ^ 88)) - 1;
                f60732d = i175 % 128;
                if (i175 % 2 != 0) {
                    return (setMaxWidth) setY(new Object[]{settitletextcolor5}, 956745594, -956745592, System.identityHashCode(settitletextcolor5));
                }
                int i176 = 23 / 0;
                return (setMaxWidth) setY(new Object[]{settitletextcolor5}, 956745594, -956745592, System.identityHashCode(settitletextcolor5));
        }
        return setmaxwidth;
    }

    public final boolean setDividerPadding(@NotNull Terminal terminal) {
        return ((Boolean) setY(new Object[]{this, terminal}, 1081850552, -1081850548, System.identityHashCode(this))).booleanValue();
    }

    @NotNull
    public final setMaxWidth setDividerPadding() {
        return (setMaxWidth) setY(new Object[]{this}, -1049767002, 1049767008, System.identityHashCode(this));
    }
}
