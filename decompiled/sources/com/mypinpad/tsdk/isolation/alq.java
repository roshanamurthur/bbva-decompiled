package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class alq implements akv, beu {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long[] f53066g = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f53067h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f53068i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f53069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f53071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f53072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f53073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53074f;
    protected long getNavBarTitleString;
    protected long setCompoundDrawableTintBlendMode;
    protected long setDividerPadding;
    protected long setNavigationOnClickListener;
    protected long setOnDragListener;
    protected long setOnFocusChangeListener;
    protected long setOnLongClickListener;
    protected long setX;
    protected final akp setY;

    static {
        int i10 = ((1 | 123) << 1) - (1 ^ 123);
        f53067h = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public alq(alq alqVar) {
        this.f53069a = new byte[8];
        this.f53073e = new long[80];
        this.setY = alqVar.setY;
        setX(new Object[]{this, alqVar}, 1376062985, -1376062983, System.identityHashCode(this));
    }

    public static /* synthetic */ void a(Object[] objArr) {
        alq alqVar = (alq) objArr[0];
        int i10 = f53068i;
        int i11 = (((i10 & (-84)) | ((~i10) & 83)) - (~(-(-((i10 & 83) << 1))))) - 1;
        f53067h = i11 % 128;
        int i12 = i11 % 2;
        setX(new Object[]{alqVar}, 1420682364, -1420682364, System.identityHashCode(alqVar));
        long j10 = alqVar.f53071c << 3;
        long j11 = alqVar.f53072d;
        setX(new Object[]{alqVar, (byte) -128}, 928955688, -928955680, System.identityHashCode(alqVar));
        int i13 = f53067h;
        int i14 = (((i13 | 12) << 1) - (i13 ^ 12)) - 1;
        f53068i = i14 % 128;
        int i15 = i14 % 2;
        while (alqVar.f53070b != 0) {
            int i16 = f53067h;
            int i17 = (i16 ^ 95) + ((i16 & 95) << 1);
            f53068i = i17 % 128;
            int i18 = i17 % 2;
            setX(new Object[]{alqVar, (byte) 0}, 928955688, -928955680, System.identityHashCode(alqVar));
            int i19 = f53067h;
            int i20 = i19 & 101;
            int i21 = (i19 ^ 101) | i20;
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            f53068i = i22 % 128;
            int i23 = i22 % 2;
        }
        setX(new Object[]{alqVar, Long.valueOf(j10), Long.valueOf(j11)}, -1090477981, 1090477986, System.identityHashCode(alqVar));
        setX(new Object[]{alqVar}, 405495758, -405495745, System.identityHashCode(alqVar));
        int i24 = f53068i;
        int i25 = (i24 & 69) + (i24 | 69);
        f53067h = i25 % 128;
        if (i25 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        alq alqVar = (alq) objArr[0];
        alq alqVar2 = (alq) objArr[1];
        int i10 = f53068i;
        int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
        f53067h = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = alqVar2.f53069a;
        System.arraycopy(bArr, 0, alqVar.f53069a, 0, bArr.length);
        alqVar.f53070b = alqVar2.f53070b;
        alqVar.f53071c = alqVar2.f53071c;
        alqVar.f53072d = alqVar2.f53072d;
        alqVar.setCompoundDrawableTintBlendMode = alqVar2.setCompoundDrawableTintBlendMode;
        alqVar.setOnFocusChangeListener = alqVar2.setOnFocusChangeListener;
        alqVar.setDividerPadding = alqVar2.setDividerPadding;
        alqVar.setX = alqVar2.setX;
        alqVar.getNavBarTitleString = alqVar2.getNavBarTitleString;
        alqVar.setOnDragListener = alqVar2.setOnDragListener;
        alqVar.setNavigationOnClickListener = alqVar2.setNavigationOnClickListener;
        alqVar.setOnLongClickListener = alqVar2.setOnLongClickListener;
        long[] jArr = alqVar.f53073e;
        long[] jArr2 = alqVar2.f53073e;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        alqVar.f53074f = alqVar2.f53074f;
        int i13 = f53067h;
        int i14 = ((i13 ^ 33) | (i13 & 33)) << 1;
        int i15 = -(((~i13) & 33) | (i13 & (-34)));
        int i16 = (i14 & i15) + (i15 | i14);
        f53068i = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 67 / 0;
        }
    }

    public static /* synthetic */ Long c(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        int i10 = f53068i;
        int i11 = (i10 & (-108)) | ((~i10) & 107);
        int i12 = (i10 & 107) << 1;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f53067h = i13 % 128;
        int i14 = i13 % 2;
        long j10 = (jLongValue >>> 7) ^ (((jLongValue << 63) | (jLongValue >>> 1)) ^ ((jLongValue << 56) | (jLongValue >>> 8)));
        int i15 = i10 + 27;
        f53067h = i15 % 128;
        if (i15 % 2 == 0) {
            return Long.valueOf(j10);
        }
        throw null;
    }

    public static /* synthetic */ Integer d(Object[] objArr) {
        int i10 = f53067h;
        int i11 = ((i10 ^ 33) | (i10 & 33)) << 1;
        int i12 = -(((~i10) & 33) | (i10 & (-34)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        f53068i = i14;
        int i15 = i13 % 2 == 0 ? 13217 : 128;
        int i16 = i14 + 5;
        f53067h = i16 % 128;
        if (i16 % 2 == 0) {
            return Integer.valueOf(i15);
        }
        throw null;
    }

    public static /* synthetic */ void e(Object[] objArr) {
        long[] jArr;
        alq alqVar = (alq) objArr[0];
        int i10 = f53067h;
        int i11 = (i10 & 27) + (i10 | 27);
        f53068i = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        setX(new Object[]{alqVar}, 1420682364, -1420682364, System.identityHashCode(alqVar));
        int i14 = f53068i + 47;
        f53067h = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 16;
        while (i16 <= 79) {
            int i17 = f53068i;
            int i18 = (i17 & 113) + (i17 | 113);
            f53067h = i18 % 128;
            int i19 = i18 % i12;
            long[] jArr2 = alqVar.f53073e;
            int iIdentityHashCode = System.identityHashCode(alqVar);
            int i20 = i16 * 246;
            int i21 = (488 ^ i20) + ((i20 & 488) << 1);
            int i22 = ~i16;
            int i23 = ~iIdentityHashCode;
            int i24 = i23 & (i23 | iIdentityHashCode);
            int i25 = ~((i24 & i22) | (i22 ^ i24));
            int i26 = (i22 | i16) & i22;
            int i27 = i26 ^ (-2);
            int i28 = i26 & (-2);
            int i29 = (i27 ^ i28) | (i27 & i28);
            int i30 = ~i29;
            int i31 = (i29 | i30) & i30;
            int i32 = i25 & i31;
            int i33 = (~i32) & (i25 | i31);
            int i34 = -(-(((i33 & i32) | (i33 ^ i32)) * (-245)));
            int i35 = i21 ^ i34;
            int i36 = (i34 & i21) << 1;
            int i37 = ((i35 | i36) << 1) - (i36 ^ i35);
            int i38 = i22 ^ iIdentityHashCode;
            int i39 = i22 & iIdentityHashCode;
            int i40 = -(-((~((i38 & i39) | (i38 ^ i39))) * (-245)));
            int i41 = i37 & i40;
            int i42 = -(-((i40 ^ i37) | i41));
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            int i44 = i26 & iIdentityHashCode;
            int i45 = ~(i44 | ((iIdentityHashCode | i26) & (~i44)));
            int i46 = -(-(((i45 & (-2)) | ((-2) ^ i45)) * 245));
            long[] jArr3 = alqVar.f53073e;
            long jLongValue = ((Long) setX(new Object[]{Long.valueOf(jArr2[((i43 | i46) << 1) - (i46 ^ i43)])}, 1010342435, -1010342434, (int) System.currentTimeMillis())).longValue() + jArr3[((i16 | (-7)) << 1) - (i16 ^ (-7))];
            int iIdentityHashCode2 = System.identityHashCode(alqVar);
            int i47 = -(-(i16 * (-55)));
            int i48 = ((825 & i47) - (~(-(-(i47 | 825))))) - 1;
            int i49 = ~(((-15) ^ iIdentityHashCode2) | ((-15) & iIdentityHashCode2));
            int i50 = i16 & i49;
            int i51 = (~i50) & (i49 | i16);
            int i52 = ((i51 & i50) | (i51 ^ i50)) * 56;
            int i53 = ((i48 | i52) << 1) - (i52 ^ i48);
            int i54 = -(-((~(((-15) ^ i16) | ((-15) & i16))) * (-56)));
            int i55 = (i53 & i54) + (i54 | i53);
            int i56 = ~((~iIdentityHashCode2) | i16);
            int i57 = ((~i56) & (-15)) | (i56 & 14);
            int i58 = i56 & (-15);
            int i59 = -(-(((i58 & i57) | (i57 ^ i58)) * 56));
            int i60 = i55 & i59;
            int i61 = (i59 ^ i55) | i60;
            long jLongValue2 = ((Long) setX(new Object[]{Long.valueOf(jArr3[(i60 ^ i61) + ((i61 & i60) << 1)])}, 2106759952, -2106759940, (int) System.currentTimeMillis())).longValue() + jLongValue;
            int i62 = i16 & (-16);
            int i63 = i16 | (-16);
            jArr2[i16] = jLongValue2 + jArr3[(i62 ^ i63) + ((i62 & i63) << 1)];
            int i64 = (i16 & (-2)) | (i22 & 1);
            int i65 = (i16 & 1) << 1;
            i16 = ((i64 | i65) << 1) - (i64 ^ i65);
            int i66 = f53068i;
            int i67 = i66 ^ 89;
            int i68 = (i66 & 89) << 1;
            int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
            f53067h = i69 % 128;
            int i70 = i69 % 2;
            i12 = 2;
        }
        long jLongValue3 = alqVar.setCompoundDrawableTintBlendMode;
        long j10 = alqVar.setOnFocusChangeListener;
        long j11 = alqVar.setDividerPadding;
        long j12 = alqVar.setX;
        long j13 = alqVar.getNavBarTitleString;
        long j14 = alqVar.setOnDragListener;
        long j15 = alqVar.setNavigationOnClickListener;
        long j16 = j10;
        long j17 = alqVar.setOnLongClickListener;
        int i71 = f53067h;
        int i72 = ((i71 & 106) + (i71 | 106)) - 1;
        f53068i = i72 % 128;
        int i73 = i72 % 2;
        int i74 = 0;
        int i75 = 0;
        long j18 = j17;
        while (true) {
            jArr = alqVar.f53073e;
            if (i74 >= 10) {
                break;
            }
            int i76 = f53067h;
            int i77 = i76 & 99;
            int i78 = (i77 - (~(-(-((i76 ^ 99) | i77))))) - 1;
            f53068i = i78 % 128;
            int i79 = i78 % 2;
            long j19 = j11;
            alq alqVar2 = alqVar;
            long jLongValue4 = ((Long) setX(new Object[]{Long.valueOf(j13), Long.valueOf(j14), Long.valueOf(j15)}, -2028640005, 2028640015, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(j13)}, 1354641328, -1354641314, (int) System.currentTimeMillis())).longValue();
            long[] jArr4 = f53066g;
            int i80 = i75 & 1;
            int i81 = (i75 ^ 1) | i80;
            int i82 = (i80 & i81) + (i80 | i81);
            long j20 = jLongValue4 + jArr4[i75] + jArr[i75] + j18;
            long j21 = j12 + j20;
            long jLongValue5 = ((Long) setX(new Object[]{Long.valueOf(jLongValue3), Long.valueOf(j16), Long.valueOf(j19)}, -1074242033, 1074242044, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(jLongValue3)}, -1143420964, 1143420973, (int) System.currentTimeMillis())).longValue() + j20;
            long jLongValue6 = ((Long) setX(new Object[]{Long.valueOf(j21), Long.valueOf(j13), Long.valueOf(j14)}, -2028640005, 2028640015, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(j21)}, 1354641328, -1354641314, (int) System.currentTimeMillis())).longValue() + jArr4[i82];
            int i83 = (((i82 & 77) | ((~i82) & (-78))) - (~(-(-((i82 & (-78)) << 1))))) - 1;
            int i84 = (i83 & 80) + (i83 | 80);
            int i85 = (i84 ^ (-1)) + (i84 << 1);
            long j22 = jLongValue6 + jArr[i82] + j15;
            long j23 = j19 + j22;
            long jLongValue7 = ((Long) setX(new Object[]{Long.valueOf(jLongValue5), Long.valueOf(jLongValue3), Long.valueOf(j16)}, -1074242033, 1074242044, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(jLongValue5)}, -1143420964, 1143420973, (int) System.currentTimeMillis())).longValue() + j22;
            int i86 = ((i85 | 1) << 1) - (i85 ^ 1);
            long jLongValue8 = j14 + ((Long) setX(new Object[]{Long.valueOf(j23), Long.valueOf(j21), Long.valueOf(j13)}, -2028640005, 2028640015, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(j23)}, 1354641328, -1354641314, (int) System.currentTimeMillis())).longValue() + jArr4[i85] + jArr[i85];
            long j24 = j16 + jLongValue8;
            long jLongValue9 = ((Long) setX(new Object[]{Long.valueOf(jLongValue7), Long.valueOf(jLongValue5), Long.valueOf(jLongValue3)}, -1074242033, 1074242044, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(jLongValue7)}, -1143420964, 1143420973, (int) System.currentTimeMillis())).longValue() + jLongValue8;
            long jLongValue10 = ((Long) setX(new Object[]{Long.valueOf(j24), Long.valueOf(j23), Long.valueOf(j21)}, -2028640005, 2028640015, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(j24)}, 1354641328, -1354641314, (int) System.currentTimeMillis())).longValue() + jArr4[i86];
            int i87 = (-2) - ((i86 + 60) ^ (-1));
            int i88 = i87 ^ (-58);
            int i89 = (((i87 & (-58)) | i88) << 1) - (~(-i88));
            int i90 = i89 - 1;
            long j25 = jLongValue10 + jArr[i86] + j13;
            long j26 = jLongValue3 + j25;
            int i91 = i74;
            long jLongValue11 = ((Long) setX(new Object[]{Long.valueOf(jLongValue9), Long.valueOf(jLongValue7), Long.valueOf(jLongValue5)}, -1074242033, 1074242044, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(jLongValue9)}, -1143420964, 1143420973, (int) System.currentTimeMillis())).longValue() + j25;
            long jLongValue12 = ((Long) setX(new Object[]{Long.valueOf(j26), Long.valueOf(j24), Long.valueOf(j23)}, -2028640005, 2028640015, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(j26)}, 1354641328, -1354641314, (int) System.currentTimeMillis())).longValue() + jArr4[i90] + jArr[i90] + j21;
            long j27 = jLongValue5 + jLongValue12;
            long jLongValue13 = ((Long) setX(new Object[]{Long.valueOf(jLongValue11), Long.valueOf(jLongValue9), Long.valueOf(jLongValue7)}, -1074242033, 1074242044, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(jLongValue11)}, -1143420964, 1143420973, (int) System.currentTimeMillis())).longValue() + jLongValue12;
            long jLongValue14 = ((Long) setX(new Object[]{Long.valueOf(j27), Long.valueOf(j26), Long.valueOf(j24)}, -2028640005, 2028640015, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(j27)}, 1354641328, -1354641314, (int) System.currentTimeMillis())).longValue() + jArr4[i89];
            int i92 = i89 & 42;
            int i93 = (i92 - (~(-(-((i89 ^ 42) | i92))))) - 1;
            int i94 = i93 & (-41);
            int i95 = (((i93 | (-41)) & (~i94)) - (~(i94 << 1))) - 1;
            long j28 = jLongValue14 + jArr[i89] + j23;
            long j29 = jLongValue7 + j28;
            long jLongValue15 = ((Long) setX(new Object[]{Long.valueOf(jLongValue13), Long.valueOf(jLongValue11), Long.valueOf(jLongValue9)}, -1074242033, 1074242044, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(jLongValue13)}, -1143420964, 1143420973, (int) System.currentTimeMillis())).longValue() + j28;
            long jLongValue16 = ((Long) setX(new Object[]{Long.valueOf(j29), Long.valueOf(j27), Long.valueOf(j26)}, -2028640005, 2028640015, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(j29)}, 1354641328, -1354641314, (int) System.currentTimeMillis())).longValue() + jArr4[i95];
            int i96 = (i95 & (-42)) | ((~i95) & 41);
            int i97 = -(-((i95 & 41) << 1));
            int i98 = (i96 & i97) + (i96 | i97);
            int i99 = ((((i98 ^ (-40)) | (i98 & (-40))) << 1) - (~(-((i98 & 39) | ((-40) & (~i98)))))) - 1;
            long j30 = jLongValue16 + jArr[i95] + j24;
            long j31 = jLongValue9 + j30;
            long jLongValue17 = j30 + ((Long) setX(new Object[]{Long.valueOf(jLongValue15), Long.valueOf(jLongValue13), Long.valueOf(jLongValue11)}, -1074242033, 1074242044, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(jLongValue15)}, -1143420964, 1143420973, (int) System.currentTimeMillis())).longValue();
            i75 = (i99 ^ 1) + ((i99 & 1) << 1);
            long jLongValue18 = ((Long) setX(new Object[]{Long.valueOf(j31), Long.valueOf(j29), Long.valueOf(j27)}, -2028640005, 2028640015, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(j31)}, 1354641328, -1354641314, (int) System.currentTimeMillis())).longValue() + jArr4[i99] + jArr[i99] + j26;
            long j32 = jLongValue11 + jLongValue18;
            jLongValue3 = ((Long) setX(new Object[]{Long.valueOf(jLongValue17), Long.valueOf(jLongValue15), Long.valueOf(jLongValue13)}, -1074242033, 1074242044, (int) System.currentTimeMillis())).longValue() + ((Long) setX(new Object[]{Long.valueOf(jLongValue17)}, -1143420964, 1143420973, (int) System.currentTimeMillis())).longValue() + jLongValue18;
            int i100 = i91 ^ 66;
            int i101 = ((i91 & 66) | i100) << 1;
            int i102 = -i100;
            int i103 = (i101 & i102) + (i102 | i101);
            i74 = (((i103 | (-64)) << 1) - (i103 ^ (-64))) - 1;
            int i104 = f53067h;
            int i105 = ((i104 | 89) << 1) - (((~i104) & 89) | (i104 & (-90)));
            f53068i = i105 % 128;
            int i106 = i105 % 2;
            j11 = jLongValue15;
            j15 = j29;
            j18 = j27;
            j12 = jLongValue13;
            j13 = j32;
            alqVar = alqVar2;
            j14 = j31;
            j16 = jLongValue17;
        }
        alqVar.setCompoundDrawableTintBlendMode += jLongValue3;
        alqVar.setOnFocusChangeListener += j16;
        alqVar.setDividerPadding += j11;
        alqVar.setX += j12;
        alqVar.getNavBarTitleString += j13;
        alqVar.setOnDragListener += j14;
        alqVar.setNavigationOnClickListener += j15;
        alqVar.setOnLongClickListener += j18;
        int i107 = 0;
        alqVar.f53074f = 0;
        System.identityHashCode(alqVar);
        System.identityHashCode(alqVar);
        while (i107 < 16) {
            int i108 = f53068i;
            int i109 = (i108 & 41) + (i108 | 41);
            f53067h = i109 % 128;
            if (i109 % 2 != 0) {
                jArr[i107] = 1;
                int i110 = i107 & 48;
                i107 = ((i107 | 48) & (~i110)) + (i110 << 1);
            } else {
                jArr[i107] = 0;
                i107 = (i107 ^ 1) + ((i107 & 1) << 1);
            }
            int i111 = (i108 & 97) + (i108 | 97);
            f53067h = i111 % 128;
            int i112 = i111 % 2;
        }
        int i113 = f53068i;
        int i114 = i113 & 121;
        int i115 = ((i113 | 121) & (~i114)) + (i114 << 1);
        f53067h = i115 % 128;
        if (i115 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Long f(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        long jLongValue2 = ((Number) objArr[1]).longValue();
        long jLongValue3 = ((Number) objArr[2]).longValue();
        int i10 = f53067h;
        int i11 = ~i10;
        int i12 = (i10 & (-96)) | (i11 & 95);
        int i13 = (i10 & 95) << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f53068i = i14 % 128;
        int i15 = i14 % 2;
        long j10 = ((~jLongValue) & jLongValue3) ^ (jLongValue2 & jLongValue);
        int i16 = ((i10 | 45) << 1) - ((i10 & (-46)) | (i11 & 45));
        f53068i = i16 % 128;
        if (i16 % 2 != 0) {
            return Long.valueOf(j10);
        }
        throw null;
    }

    public static /* synthetic */ Long g(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        long jLongValue2 = ((Number) objArr[1]).longValue();
        long jLongValue3 = ((Number) objArr[2]).longValue();
        int i10 = f53068i;
        int i11 = (i10 & (-92)) | ((~i10) & 91);
        int i12 = (i10 & 91) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f53067h = i14;
        int i15 = i13 % 2;
        long j10 = ((jLongValue & jLongValue3) ^ (jLongValue & jLongValue2)) ^ (jLongValue2 & jLongValue3);
        int i16 = (((i14 ^ 9) | (i14 & 9)) << 1) - (((~i14) & 9) | (i14 & (-10)));
        f53068i = i16 % 128;
        if (i16 % 2 != 0) {
            return Long.valueOf(j10);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0288 A[LOOP:1: B:41:0x0283->B:43:0x0288, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x031c A[LOOP:2: B:44:0x031a->B:45:0x031c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0451  */
    /* JADX WARN: Code duplicated, block: B:79:0x031a A[SYNTHETIC] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        long j10;
        int i13 = ~i11;
        int i14 = i13 | i10;
        int i15 = (((~(i10 | i12)) | (~(i13 | i12)) | (~i14)) * 623) + (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i14 | i12)) * 623) + (i11 * (-622)) + (i10 * 624);
        int i16 = -2024710357;
        int i17 = 2024710360;
        int i18 = 3;
        switch (i15) {
            case 1:
                long jLongValue = ((Number) objArr[0]).longValue();
                int i19 = f53068i;
                int i20 = i19 & 19;
                int i21 = i20 + ((i19 ^ 19) | i20);
                f53067h = i21 % 128;
                int i22 = i21 % 2;
                long j11 = (jLongValue >>> 6) ^ (((jLongValue << 45) | (jLongValue >>> 19)) ^ ((jLongValue << 3) | (jLongValue >>> 61)));
                int i23 = ((i19 ^ 93) - (~((i19 & 93) << 1))) - 1;
                f53067h = i23 % 128;
                int i24 = i23 % 2;
                return Long.valueOf(j11);
            case 2:
                b(objArr);
                return null;
            case 3:
                alq alqVar = (alq) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i25 = f53068i;
                int i26 = i25 & 39;
                int i27 = (i26 - (~((i25 ^ 39) | i26))) - 1;
                f53067h = i27 % 128;
                int i28 = i27 % 2;
                long[] jArr = alqVar.f53073e;
                if (i28 != 0) {
                    jArr[alqVar.f53074f] = ((Long) ber.setDividerPadding(new Object[]{bArr2, Integer.valueOf(iIntValue)}, -1086518195, 1086518209, iIntValue)).longValue();
                    int i29 = alqVar.f53074f >>> 1;
                    alqVar.f53074f = i29;
                    if (i29 == 39) {
                        setX(new Object[]{alqVar}, 405495758, -405495745, System.identityHashCode(alqVar));
                        int i30 = f53068i;
                        int i31 = (i30 & (-30)) | ((~i30) & 29);
                        int i32 = (i30 & 29) << 1;
                        int i33 = (i31 & i32) + (i32 | i31);
                        f53067h = i33 % 128;
                        int i34 = i33 % 2;
                    }
                } else {
                    jArr[alqVar.f53074f] = ((Long) ber.setDividerPadding(new Object[]{bArr2, Integer.valueOf(iIntValue)}, -1086518195, 1086518209, iIntValue)).longValue();
                    int i35 = alqVar.f53074f;
                    int i36 = i35 & 1;
                    int i37 = (((i35 ^ 1) | i36) << 1) - ((i35 | 1) & (~i36));
                    alqVar.f53074f = i37;
                    if (i37 == 16) {
                        setX(new Object[]{alqVar}, 405495758, -405495745, System.identityHashCode(alqVar));
                        int i38 = f53068i;
                        int i39 = (i38 & (-30)) | ((~i38) & 29);
                        int i310 = (i38 & 29) << 1;
                        int i311 = (i39 & i310) + (i310 | i39);
                        f53067h = i311 % 128;
                        int i312 = i311 % 2;
                    }
                }
                int i40 = f53067h;
                int i41 = (i40 ^ 23) + ((i40 & 23) << 1);
                f53068i = i41 % 128;
                int i42 = i41 % 2;
                return null;
            case 4:
                return d(objArr);
            case 5:
                alq alqVar2 = (alq) objArr[0];
                long jLongValue2 = ((Number) objArr[1]).longValue();
                long jLongValue3 = ((Number) objArr[2]).longValue();
                int i43 = f53067h;
                int i44 = (i43 & (-22)) | ((~i43) & 21);
                int i45 = -(-((i43 & 21) << 1));
                int i46 = (i44 & i45) + (i45 | i44);
                f53068i = i46 % 128;
                int i47 = i46 % 2;
                int i48 = alqVar2.f53074f;
                if (i47 != 0 ? i48 > 14 : i48 > 38) {
                    setX(new Object[]{alqVar2}, 405495758, -405495745, System.identityHashCode(alqVar2));
                    int i49 = f53067h;
                    int i50 = i49 & 93;
                    int i51 = i49 | 93;
                    int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                    f53068i = i52 % 128;
                    int i53 = i52 % 2;
                }
                long[] jArr2 = alqVar2.f53073e;
                jArr2[14] = jLongValue3;
                jArr2[15] = jLongValue2;
                int i54 = f53067h;
                int i55 = ((i54 & (-88)) | ((~i54) & 87)) + ((i54 & 87) << 1);
                f53068i = i55 % 128;
                int i56 = i55 % 2;
                return null;
            case 6:
                alq alqVar3 = (alq) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                int iIntValue3 = ((Number) objArr[3]).intValue();
                int i57 = f53067h;
                int i58 = i57 + 103;
                f53068i = i58 % 128;
                int i59 = i58 % 2;
                int i60 = (i57 & 33) + (i57 | 33);
                f53068i = i60 % 128;
                int i61 = i60 % 2;
                int i62 = iIntValue2;
                while (alqVar3.f53070b != 0) {
                    int i63 = f53068i;
                    int i64 = i63 & 119;
                    int i65 = -(-((i63 ^ 119) | i64));
                    int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                    int i67 = i66 % 128;
                    f53067h = i67;
                    int i68 = i66 % 2;
                    if (iIntValue3 > 0) {
                        int i69 = i67 & 105;
                        int i70 = ((i67 ^ 105) | i69) << 1;
                        int i71 = -((~i69) & (i67 | 105));
                        int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
                        f53068i = i72 % 128;
                        if (i72 % 2 == 0) {
                            setX(new Object[]{alqVar3, Byte.valueOf(bArr3[i62])}, 928955688, -928955680, System.identityHashCode(alqVar3));
                            int i73 = i62 ^ (-36);
                            int i74 = -(-((i62 & (-36)) << 1));
                            int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                            i62 = ((i75 & (-90)) | ((~i75) & 89)) + ((i75 & 89) << 1);
                            iIntValue3 = (((iIntValue3 | 112) << 1) - (iIntValue3 ^ 112)) - 1;
                        } else {
                            setX(new Object[]{alqVar3, Byte.valueOf(bArr3[i62])}, 928955688, -928955680, System.identityHashCode(alqVar3));
                            i62++;
                            int i76 = ~iIntValue3;
                            int i77 = (iIntValue3 | i76) << 1;
                            int i78 = -i76;
                            iIntValue3 = (i77 ^ i78) + ((i77 & i78) << 1);
                        }
                        int i79 = f53067h;
                        int i80 = i79 & 77;
                        int i81 = i80 + ((i79 ^ 77) | i80);
                        f53068i = i81 % 128;
                        int i82 = i81 % 2;
                    } else {
                        while (true) {
                            bArr = alqVar3.f53069a;
                            if (iIntValue3 >= bArr.length) {
                                while (iIntValue3 > 0) {
                                    int i83 = f53067h + 119;
                                    f53068i = i83 % 128;
                                    int i84 = i83 % 2;
                                    setX(new Object[]{alqVar3, Byte.valueOf(bArr3[i62])}, 928955688, -928955680, System.identityHashCode(alqVar3));
                                    i62 = (-2) - ((((i62 | 2) << 1) - (i62 ^ 2)) ^ (-1));
                                    iIntValue3 = (((iIntValue3 | (-14)) << 1) - (iIntValue3 ^ (-14))) + 13;
                                    int i85 = f53067h;
                                    int i86 = (i85 & 9) + (i85 | 9);
                                    f53068i = i86 % 128;
                                    int i87 = i86 % 2;
                                }
                                int i88 = f53067h + 121;
                                f53068i = i88 % 128;
                                int i89 = i88 % 2;
                                return null;
                            }
                            int i90 = f53068i;
                            int i91 = (((i90 | 10) << 1) - (i90 ^ 10)) - 1;
                            f53067h = i91 % 128;
                            int i92 = i91 % 2;
                            Object[] objArr2 = new Object[i18];
                            objArr2[0] = alqVar3;
                            objArr2[1] = bArr3;
                            objArr2[2] = Integer.valueOf(i62);
                            setX(objArr2, i17, i16, i62);
                            int length = bArr.length;
                            int i93 = length * 960;
                            int i94 = -(~(i62 * (-1917)));
                            int i95 = ((i93 & i94) + (i94 | i93)) - 1;
                            int i96 = ~i62;
                            int i97 = (i62 | i96) & i96;
                            int i98 = ~iIntValue2;
                            int i99 = i97 & i98;
                            int i100 = ~(i99 | ((~i99) & (i97 | i98)));
                            int i101 = length ^ iIntValue2;
                            int i102 = length & iIntValue2;
                            int i103 = ~((i101 ^ i102) | (i101 & i102));
                            int i104 = -(~(-(-(((i100 ^ i103) | (i100 & i103)) * 959))));
                            int i105 = ((((i95 & i104) + (i95 | i104)) - 1) - (~(-(-(i96 * (-959)))))) - 1;
                            int i106 = ~((i97 ^ iIntValue2) | (i97 & iIntValue2));
                            int i107 = ~(((~length) & i98) | ((~i98) & length) | (i98 & length));
                            int i108 = -(-(((i106 & i107) | (i106 ^ i107)) * 959));
                            i62 = (((~i108) & i105) | ((~i105) & i108)) + ((i108 & i105) << 1);
                            int i109 = -bArr.length;
                            iIntValue3 = (iIntValue3 & i109) + (i109 | iIntValue3);
                            alqVar3.f53071c += (long) bArr.length;
                            i16 = -2024710357;
                            i17 = 2024710360;
                            i18 = 3;
                        }
                    }
                }
                while (true) {
                    bArr = alqVar3.f53069a;
                    if (iIntValue3 >= bArr.length) {
                        while (iIntValue3 > 0) {
                            int i810 = f53067h + 119;
                            f53068i = i810 % 128;
                            int i811 = i810 % 2;
                            setX(new Object[]{alqVar3, Byte.valueOf(bArr3[i62])}, 928955688, -928955680, System.identityHashCode(alqVar3));
                            i62 = (-2) - ((((i62 | 2) << 1) - (i62 ^ 2)) ^ (-1));
                            iIntValue3 = (((iIntValue3 | (-14)) << 1) - (iIntValue3 ^ (-14))) + 13;
                            int i812 = f53067h;
                            int i813 = (i812 & 9) + (i812 | 9);
                            f53068i = i813 % 128;
                            int i814 = i813 % 2;
                        }
                        int i815 = f53067h + 121;
                        f53068i = i815 % 128;
                        int i816 = i815 % 2;
                        return null;
                    }
                    int i910 = f53068i;
                    int i911 = (((i910 | 10) << 1) - (i910 ^ 10)) - 1;
                    f53067h = i911 % 128;
                    int i912 = i911 % 2;
                    Object[] objArr3 = new Object[i18];
                    objArr3[0] = alqVar3;
                    objArr3[1] = bArr3;
                    objArr3[2] = Integer.valueOf(i62);
                    setX(objArr3, i17, i16, i62);
                    int length2 = bArr.length;
                    int i913 = length2 * 960;
                    int i914 = -(~(i62 * (-1917)));
                    int i915 = ((i913 & i914) + (i914 | i913)) - 1;
                    int i916 = ~i62;
                    int i917 = (i62 | i916) & i916;
                    int i918 = ~iIntValue2;
                    int i919 = i917 & i918;
                    int i1010 = ~(i919 | ((~i919) & (i917 | i918)));
                    int i1011 = length2 ^ iIntValue2;
                    int i1012 = length2 & iIntValue2;
                    int i1013 = ~((i1011 ^ i1012) | (i1011 & i1012));
                    int i1014 = -(~(-(-(((i1010 ^ i1013) | (i1010 & i1013)) * 959))));
                    int i1015 = ((((i915 & i1014) + (i915 | i1014)) - 1) - (~(-(-(i916 * (-959)))))) - 1;
                    int i1016 = ~((i917 ^ iIntValue2) | (i917 & iIntValue2));
                    int i1017 = ~(((~length2) & i918) | ((~i918) & length2) | (i918 & length2));
                    int i1018 = -(-(((i1016 & i1017) | (i1016 ^ i1017)) * 959));
                    i62 = (((~i1018) & i1015) | ((~i1015) & i1018)) + ((i1018 & i1015) << 1);
                    int i1019 = -bArr.length;
                    iIntValue3 = (iIntValue3 & i1019) + (i1019 | iIntValue3);
                    alqVar3.f53071c += (long) bArr.length;
                    i16 = -2024710357;
                    i17 = 2024710360;
                    i18 = 3;
                }
                break;
            case 7:
                a(objArr);
                return null;
            case 8:
                alq alqVar4 = (alq) objArr[0];
                byte bByteValue = ((Byte) objArr[1]).byteValue();
                int i110 = f53067h;
                int i111 = ((i110 | 59) << 1) - (59 ^ i110);
                int i112 = i111 % 128;
                f53068i = i112;
                int i113 = i111 % 2;
                byte[] bArr4 = alqVar4.f53069a;
                int i114 = alqVar4.f53070b;
                int i115 = i114 & 1;
                int i116 = ((~i115) & (i114 | 1)) + (i115 << 1);
                alqVar4.f53070b = i116;
                bArr4[i114] = bByteValue;
                if (i116 == bArr4.length) {
                    int i117 = (i112 ^ 93) + ((i112 & 93) << 1);
                    f53067h = i117 % 128;
                    Object[] objArr4 = new Object[3];
                    if (i117 % 2 != 0) {
                        objArr4[0] = alqVar4;
                        objArr4[1] = bArr4;
                        objArr4[2] = 0;
                        setX(objArr4, 2024710360, -2024710357, 0);
                        alqVar4.f53070b = 1;
                    } else {
                        objArr4[0] = alqVar4;
                        objArr4[1] = bArr4;
                        objArr4[2] = 0;
                        setX(objArr4, 2024710360, -2024710357, 0);
                        alqVar4.f53070b = 0;
                    }
                }
                alqVar4.f53071c++;
                int i118 = f53068i;
                int i119 = i118 & 61;
                int i120 = (i118 ^ 61) | i119;
                int i121 = (i119 ^ i120) + ((i120 & i119) << 1);
                f53067h = i121 % 128;
                int i122 = i121 % 2;
                return null;
            case 9:
                long jLongValue4 = ((Number) objArr[0]).longValue();
                int i123 = f53068i;
                int i124 = i123 & 21;
                int i125 = -(-((i123 ^ 21) | i124));
                int i126 = (i124 & i125) + (i125 | i124);
                int i127 = i126 % 128;
                f53067h = i127;
                int i128 = i126 % 2;
                long j12 = ((jLongValue4 >>> 39) | (jLongValue4 << 25)) ^ (((jLongValue4 << 36) | (jLongValue4 >>> 28)) ^ ((jLongValue4 << 30) | (jLongValue4 >>> 34)));
                int i129 = i127 & 113;
                int i130 = ((i127 ^ 113) | i129) << 1;
                int i131 = -((i127 | 113) & (~i129));
                int i132 = (i130 ^ i131) + ((i131 & i130) << 1);
                f53068i = i132 % 128;
                int i133 = i132 % 2;
                return Long.valueOf(j12);
            case 10:
                return f(objArr);
            case 11:
                return g(objArr);
            case 12:
                return c(objArr);
            case 13:
                e(objArr);
                return null;
            case 14:
                long jLongValue5 = ((Number) objArr[0]).longValue();
                int i134 = f53068i;
                int i135 = i134 ^ 23;
                int i136 = -(-((i134 & 23) << 1));
                int i137 = ((i135 | i136) << 1) - (i136 ^ i135);
                f53067h = i137 % 128;
                return Long.valueOf(i137 % 2 != 0 ? (((jLongValue5 >> 58) * (jLongValue5 >>> 23)) - ((jLongValue5 >>> 41) - jLongValue5)) * ((jLongValue5 << 50) & (jLongValue5 << 61)) : (((jLongValue5 << 50) | (jLongValue5 >>> 14)) ^ ((jLongValue5 << 46) | (jLongValue5 >>> 18))) ^ ((jLongValue5 >>> 41) | (jLongValue5 << 23)));
            default:
                alq alqVar5 = (alq) objArr[0];
                int i138 = f53067h;
                int i139 = ((i138 & 125) - (~(i138 | 125))) - 1;
                f53068i = i139 % 128;
                int i140 = i139 % 2;
                long j13 = alqVar5.f53071c;
                if (j13 > 2305843009213693951L) {
                    int i141 = i138 & 59;
                    int i142 = ((i138 ^ 59) | i141) << 1;
                    int i143 = -((~i141) & (i138 | 59));
                    int i144 = (i142 ^ i143) + ((i142 & i143) << 1);
                    f53068i = i144 % 128;
                    if (i144 % 2 == 0) {
                        alqVar5.f53072d -= j13 >>> 17;
                        j10 = j13 + 2305843009213693951L;
                    } else {
                        alqVar5.f53072d += j13 >>> 61;
                        j10 = j13 & 2305843009213693951L;
                    }
                    alqVar5.f53071c = j10;
                }
                int i145 = (i138 & (-60)) | ((~i138) & 59);
                int i146 = (i138 & 59) << 1;
                int i147 = (i145 ^ i146) + ((i145 & i146) << 1);
                f53068i = i147 % 128;
                int i148 = i147 % 2;
                return null;
        }
    }

    public abstract akl getNavBarTitleString();

    public final void setCompoundDrawableTintBlendMode() {
        setX(new Object[]{this}, -1036153146, 1036153153, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.akv
    public final int setDividerPadding() {
        return ((Integer) setX(new Object[]{this}, 1852785968, -1852785964, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public void setOnFocusChangeListener() {
        int i10;
        int i11 = f53068i;
        int i12 = i11 & 101;
        int i13 = (i11 ^ 101) | i12;
        int i14 = (i12 & i13) + (i12 | i13);
        f53067h = i14 % 128;
        int i15 = i14 % 2;
        this.f53071c = 0L;
        this.f53072d = 0L;
        int i16 = 0;
        this.f53070b = 0;
        int i17 = ((-1) << 1) - (((i11 ^ 116) + ((i11 & 116) << 1)) ^ (-1));
        f53067h = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (true) {
            byte[] bArr = this.f53069a;
            if (i19 >= bArr.length) {
                break;
            }
            int i20 = f53067h + 33;
            int i21 = i20 % 128;
            f53068i = i21;
            if (i20 % 2 == 0) {
                bArr[i19] = 1;
                int i22 = i19 ^ (-89);
                int i23 = ((i19 & (-89)) | i22) << 1;
                int i24 = -i22;
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                int i26 = i25 & 91;
                i10 = (((i25 ^ 91) | i26) << 1) - (~(-((~i26) & (i25 | 91))));
            } else {
                bArr[i19] = 0;
                int i27 = i19 & 1;
                int i28 = (i27 - (~((i19 ^ 1) | i27))) - 1;
                i10 = (i28 ^ 1) + ((i28 & 1) << 1);
            }
            i19 = i10 - 1;
            int i29 = (i21 ^ 45) + ((i21 & 45) << 1);
            f53067h = i29 % 128;
            int i30 = i29 % 2;
        }
        this.f53074f = 0;
        int i31 = f53067h;
        int i32 = (((i31 ^ 45) | (i31 & 45)) << 1) - (((~i31) & 45) | (i31 & (-46)));
        f53068i = i32 % 128;
        int i33 = i32 % 2;
        while (true) {
            long[] jArr = this.f53073e;
            if (i16 == jArr.length) {
                break;
            }
            int i34 = f53068i + 103;
            int i35 = i34 % 128;
            f53067h = i35;
            int i36 = i34 % 2;
            jArr[i16] = 0;
            int i37 = i16 | 1;
            i16 = (i37 << 1) - (i37 & (~(i16 & 1)));
            int i38 = ((((i35 ^ 97) | (i35 & 97)) << 1) - (~(-((i35 & (-98)) | ((~i35) & 97))))) - 1;
            f53068i = i38 % 128;
            int i39 = i38 % 2;
        }
        int i40 = f53067h;
        int i41 = (i40 & (-72)) | ((~i40) & 71);
        int i42 = (i40 & 71) << 1;
        int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
        f53068i = i43 % 128;
        if (i43 % 2 == 0) {
            throw null;
        }
    }

    public final void setY(alq alqVar) {
        setX(new Object[]{this, alqVar}, 1376062985, -1376062983, System.identityHashCode(this));
    }

    public alq(akp akpVar) {
        this.f53069a = new byte[8];
        this.f53073e = new long[80];
        this.setY = akpVar;
        this.f53070b = 0;
        setOnFocusChangeListener();
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final void setCompoundDrawableTintBlendMode(byte[] bArr, int i10, int i11) {
        setX(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, -2121668411, 2121668417, i10);
    }

    public alq() {
        this(akp.getNavBarTitleString);
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final void setX(byte b10) {
        setX(new Object[]{this, Byte.valueOf(b10)}, 928955688, -928955680, System.identityHashCode(this));
    }
}
