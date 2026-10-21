package com.mypinpad.tsdk.isolation;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJA\u0010\u0010\u001a\u0004\u0018\u00010\t\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/ef;", "", "Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "p0", "Lcom/mypinpad/tsdk/i/setContentDescription;", "p1", "Lcom/mypinpad/tsdk/i/getValue;", "p2", "Lcom/mypinpad/tsdk/i/fk;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setContentDescription;Lcom/mypinpad/tsdk/i/getValue;)Lcom/mypinpad/tsdk/i/fk;", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "Lcom/mypinpad/tsdk/i/ew;", "Lcom/mypinpad/tsdk/i/setRotationX;", "p3", "setX", "(Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/ew;Lcom/mypinpad/tsdk/i/setRotationX;)Lcom/mypinpad/tsdk/i/fk;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ef {

    @NotNull
    public static final ef INSTANCE = new ef();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f55371a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f55372b = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/setScrollBarDefaultDelayBeforeFade;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/mypinpad/tsdk/i/cv;", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/cv;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<cv, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f55373p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55374q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55375r0 = 1;

        static {
            int i10 = f55374q0;
            int i11 = i10 & 71;
            int i12 = (i10 ^ 71) | i11;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f55375r0 = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 72 / 0;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Unit a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = i13 | i11;
            int i15 = (((~i14) | (~(i13 | i12)) | (~(i11 | i12))) * (-754)) + (i11 * (-753)) + (i10 * 755);
            int i16 = ~(i14 | i12);
            int i17 = ~i12;
            if (((i13 | i17) * 754) + (((~(i10 | i17 | i11)) | i16) * (-754)) + i15 == 1) {
                cv cvVar = (cv) objArr[1];
                int i18 = f55375r0;
                int i19 = i18 & 81;
                int i20 = ((i18 | 81) & (~i19)) + (i19 << 1);
                f55374q0 = i20 % 128;
                int i21 = i20 % 2;
                Intrinsics.checkNotNullParameter(cvVar, "");
                cv.setDividerPadding(new Object[]{cvVar, Boolean.TRUE}, -243948838, 243948846, System.identityHashCode(cvVar));
                int i22 = f55374q0;
                int i23 = (i22 & (-26)) | ((~i22) & 25);
                int i24 = (i22 & 25) << 1;
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f55375r0 = i25 % 128;
                if (i25 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i26 = f55375r0;
            int i27 = ((i26 ^ 45) | (i26 & 45)) << 1;
            int i28 = -(((~i26) & 45) | (i26 & (-46)));
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            f55374q0 = i29 % 128;
            cv cvVar2 = (cv) obj;
            Object[] objArr2 = new Object[2];
            if (i29 % 2 == 0) {
                objArr2[0] = aVar;
                objArr2[1] = cvVar2;
                a(objArr2, -937653459, 937653460, System.identityHashCode(aVar));
                return Unit.INSTANCE;
            }
            objArr2[0] = aVar;
            objArr2[1] = cvVar2;
            a(objArr2, -937653459, 937653460, System.identityHashCode(aVar));
            int i30 = 63 / 0;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(cv cvVar) {
            return a(new Object[]{this, cvVar}, -1725059381, 1725059381, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f55371a + 33;
        f55372b = i10 % 128;
        int i11 = i10 % 2;
    }

    @NotNull
    public static <T extends setScrollBarDefaultDelayBeforeFade> fk setCompoundDrawableTintBlendMode(@NotNull T p4, @NotNull setContentDescription p10, @NotNull getValue p11) {
        return (fk) setY(new Object[]{p4, p10, p11}, 327425298, -327425297, (int) System.currentTimeMillis());
    }

    @Nullable
    public static <T extends setScrollBarDefaultDelayBeforeFade> fk setX(@NotNull T p4, @NotNull setTextKeepState p10, @NotNull ew<T> p11, @NotNull setRotationX p12) {
        return (fk) setY(new Object[]{p4, p10, p11, p12}, -1790973370, 1790973370, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:50:0x0303  */
    /* JADX WARN: Code duplicated, block: B:53:0x0378  */
    /* JADX WARN: Code duplicated, block: B:55:0x037a  */
    /* JADX WARN: Code duplicated, block: B:57:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x0406  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Exception {
        List<av> navigationOnClickListener;
        List<av> list;
        fk fkVarB_;
        int i13;
        int i14;
        int i15;
        int i16 = ~i11;
        int i17 = ~i12;
        if ((((~(i10 | i17)) | (~(i12 | (~i10))) | i16) * 45) + (((~(i11 | i10)) | (~(i16 | i12))) * (-45)) + (((~(i16 | i17)) | i10) * (-90)) + (i11 * 46) + (i10 * 46) != 1) {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[0];
            setTextKeepState settextkeepstate = (setTextKeepState) objArr[1];
            ew ewVar = (ew) objArr[2];
            setRotationX setrotationx = (setRotationX) objArr[3];
            int i18 = f55372b;
            int i19 = i18 & 45;
            int i20 = (i19 - (~((i18 ^ 45) | i19))) - 1;
            f55371a = i20 % 128;
            if (i20 % 2 != 0) {
                Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
                Intrinsics.checkNotNullParameter(settextkeepstate, "");
                Intrinsics.checkNotNullParameter(ewVar, "");
                Intrinsics.checkNotNullParameter(setrotationx, "");
                ((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue();
                throw null;
            }
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade, "");
            Intrinsics.checkNotNullParameter(settextkeepstate, "");
            Intrinsics.checkNotNullParameter(ewVar, "");
            Intrinsics.checkNotNullParameter(setrotationx, "");
            if (!((Boolean) setRotationX.setX(new Object[]{setrotationx}, -268504199, 268504206, System.identityHashCode(setrotationx))).booleanValue()) {
                fk y7 = ewVar.setY(setscrollbardefaultdelaybeforefade, settextkeepstate, (byte[]) setRotationX.setX(new Object[]{setrotationx}, 1043258083, -1043258081, System.identityHashCode(setrotationx)));
                int i21 = f55372b;
                int i22 = ((i21 & 119) - (~(-(-(i21 | 119))))) - 1;
                f55371a = i22 % 128;
                int i23 = i22 % 2;
                return y7;
            }
            byte[] bArr = (byte[]) setRotationX.setX(new Object[]{setrotationx}, -1008183286, 1008183296, System.identityHashCode(setrotationx));
            if (bArr.length == 0) {
                int i24 = f55372b;
                int i25 = i24 & 47;
                int i26 = (((i24 ^ 47) | i25) << 1) - ((i24 | 47) & (~i25));
                int i27 = i26 % 128;
                f55371a = i27;
                int i28 = i26 % 2;
                int i29 = ((i27 | 65) << 1) - (i27 ^ 65);
                f55372b = i29 % 128;
                int i30 = i29 % 2;
            } else {
                int i31 = f55372b;
                int i32 = i31 | 111;
                int i33 = i32 << 1;
                int i34 = -(i32 & (~(i31 & 111)));
                int i35 = (i33 & i34) + (i34 | i33);
                f55371a = i35 % 128;
                int i36 = i35 % 2;
                int i37 = i31 & 73;
                int i38 = i37 + ((i31 ^ 73) | i37);
                f55371a = i38 % 128;
                if (i38 % 2 != 0) {
                    setAnimation setanimation = setAnimation.INSTANCE;
                    TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 399313363, -399313217, (int) System.currentTimeMillis());
                    ((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr, (byte[]) TransactionFailed.setX(new Object[]{transactionFailed}, 2029048574, -2029048570, System.identityHashCode(transactionFailed))}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 399313363, -399313217, (int) System.currentTimeMillis());
                if (((Boolean) setInputExtras.setDividerPadding(new Object[]{bArr, (byte[]) TransactionFailed.setX(new Object[]{transactionFailed2}, 2029048574, -2029048570, System.identityHashCode(transactionFailed2))}, -481646848, 481646868, (int) System.currentTimeMillis())).booleanValue() && ((Boolean) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade, bArr, TerminalCreationFailure.setY}, 1799308265, -1799308256, System.identityHashCode(setscrollbardefaultdelaybeforefade))).booleanValue()) {
                    av avVar = (av) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade}, 1774718002, -1774717938, System.identityHashCode(setscrollbardefaultdelaybeforefade));
                    if (avVar != null) {
                        int i39 = f55371a + 103;
                        f55372b = i39 % 128;
                        int i40 = i39 % 2;
                        du duVar = du.INSTANCE;
                        du.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade, setrotationx, avVar}, 1164874386, -1164874374, (int) System.currentTimeMillis());
                        int i41 = f55371a;
                        int i42 = i41 & 113;
                        int i43 = ((i41 | 113) & (~i42)) + (i42 << 1);
                        f55372b = i43 % 128;
                        int i44 = i43 % 2;
                    }
                    int i45 = f55371a;
                    int i46 = (i45 & 17) + (i45 | 17);
                    f55372b = i46 % 128;
                    int i47 = i46 % 2;
                    return null;
                }
            }
            fkVarB_ = ewVar.b_(setscrollbardefaultdelaybeforefade, settextkeepstate);
            int i48 = f55371a;
            int i49 = (i48 ^ 59) + ((i48 & 59) << 1);
            f55372b = i49 % 128;
            if (i49 % 2 == 0) {
                throw null;
            }
        } else {
            setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[0];
            setContentDescription setcontentdescription = (setContentDescription) objArr[1];
            getValue getvalue = (getValue) objArr[2];
            int i50 = f55372b;
            int i51 = ((i50 & (-78)) | ((~i50) & 77)) + ((i50 & 77) << 1);
            f55371a = i51 % 128;
            int i52 = i51 % 2;
            Intrinsics.checkNotNullParameter(setscrollbardefaultdelaybeforefade2, "");
            Intrinsics.checkNotNullParameter(setcontentdescription, "");
            Intrinsics.checkNotNullParameter(getvalue, "");
            ah ahVar = (ah) setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2}, 1437547358, -1437547304, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
            if (ahVar == null) {
                int i53 = f55372b + 35;
                int i54 = i53 % 128;
                f55371a = i54;
                int i55 = i53 % 2;
                int i56 = (-2) - ((((i54 | 54) << 1) - (i54 ^ 54)) ^ (-1));
                f55372b = i56 % 128;
                int i57 = i56 % 2;
            } else {
                an anVar = (an) ((setImageTintList) w.setX(new Object[]{ahVar}, 1693919772, -1693919769, System.identityHashCode(ahVar)));
                if (anVar == null) {
                    int i58 = f55372b;
                    int i59 = i58 & 55;
                    int i60 = ((i58 ^ 55) | i59) << 1;
                    int i61 = -((i58 | 55) & (~i59));
                    int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
                    int i63 = i62 % 128;
                    f55371a = i63;
                    int i64 = i62 % 2;
                    int i65 = i63 & 13;
                    int i66 = ((i63 ^ 13) | i65) << 1;
                    int i67 = -((i63 | 13) & (~i65));
                    int i68 = (i66 & i67) + (i67 | i66);
                    f55372b = i68 % 128;
                    int i69 = i68 % 2;
                } else {
                    navigationOnClickListener = anVar.setNavigationOnClickListener();
                    int i70 = f55371a;
                    int i71 = i70 & 3;
                    int i72 = ((i70 ^ 3) | i71) << 1;
                    int i73 = -((3 | i70) & (~i71));
                    int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                    f55372b = i74 % 128;
                    int i75 = i74 % 2;
                }
                list = navigationOnClickListener;
                if (list != null) {
                    int i76 = f55372b;
                    int i77 = i76 & 95;
                    int i78 = -(-((i76 ^ 95) | i77));
                    i14 = ((i77 | i78) << 1) - (i78 ^ i77);
                    f55371a = i14 % 128;
                    if (i14 % 2 != 0) {
                        int i79 = 93 / 0;
                        if (!list.isEmpty()) {
                            int i80 = f55371a;
                            int i81 = ((i80 ^ 31) - (~(-(-((i80 & 31) << 1))))) - 1;
                            f55372b = i81 % 128;
                            int i82 = i81 % 2;
                            av avVarRemove = navigationOnClickListener.remove(0);
                            setText settext = new setText(((Byte) av.setY(new Object[]{avVarRemove}, -888174800, 888174800, System.identityHashCode(avVarRemove))).byteValue(), ((Byte) av.setY(new Object[]{avVarRemove}, 1262930435, -1262930433, System.identityHashCode(avVarRemove))).byteValue());
                            setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, avVarRemove}, -1576428727, 1576428728, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                            getvalue.setOnFocusChangeListener(settext);
                            fkVarB_ = fk.setOnDragListener;
                            int i83 = f55372b;
                            i15 = (i83 ^ 101) + ((i83 & 101) << 1);
                            f55371a = i15 % 128;
                            if (i15 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            int i84 = f55372b;
                            int i85 = ((i84 ^ 7) | (i84 & 7)) << 1;
                            int i86 = -(((~i84) & 7) | (i84 & (-8)));
                            int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                            int i88 = i87 % 128;
                            f55371a = i88;
                            int i89 = i87 % 2;
                            int i90 = (-2) - (((i88 ^ 34) + ((i88 & 34) << 1)) ^ (-1));
                            f55372b = i90 % 128;
                            int i91 = i90 % 2;
                            setHorizontalGravity sethorizontalgravity = setHorizontalGravity.INSTANCE;
                            if (!((Boolean) setHorizontalGravity.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade2, setcontentdescription}, -1542310944, 1542310944, (int) System.currentTimeMillis())).booleanValue()) {
                                cz czVar = new cz(setscrollbardefaultdelaybeforefade2);
                                int i92 = f55371a;
                                int i93 = i92 & 9;
                                int i94 = (i92 | 9) & (~i93);
                                int i95 = i93 << 1;
                                int i96 = (i94 & i95) + (i94 | i95);
                                f55372b = i96 % 128;
                                int i97 = i96 % 2;
                            }
                            fkVarB_ = fk.setTextAlignment;
                            int i98 = f55371a;
                            int i99 = i98 & 53;
                            int i100 = i98 | 53;
                            i13 = (i99 & i100) + (i100 | i99);
                            f55372b = i13 % 128;
                            if (i13 % 2 == 0) {
                                throw null;
                            }
                        }
                    } else if (list.isEmpty()) {
                        int i810 = f55372b;
                        int i811 = ((i810 ^ 7) | (i810 & 7)) << 1;
                        int i812 = -(((~i810) & 7) | (i810 & (-8)));
                        int i813 = ((i811 | i812) << 1) - (i812 ^ i811);
                        int i814 = i813 % 128;
                        f55371a = i814;
                        int i815 = i813 % 2;
                        int i910 = (-2) - (((i814 ^ 34) + ((i814 & 34) << 1)) ^ (-1));
                        f55372b = i910 % 128;
                        int i911 = i910 % 2;
                        setHorizontalGravity sethorizontalgravity2 = setHorizontalGravity.INSTANCE;
                        if (!((Boolean) setHorizontalGravity.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade2, setcontentdescription}, -1542310944, 1542310944, (int) System.currentTimeMillis())).booleanValue()) {
                            cz czVar2 = new cz(setscrollbardefaultdelaybeforefade2);
                            int i912 = f55371a;
                            int i913 = i912 & 9;
                            int i914 = (i912 | 9) & (~i913);
                            int i915 = i913 << 1;
                            int i916 = (i914 & i915) + (i914 | i915);
                            f55372b = i916 % 128;
                            int i917 = i916 % 2;
                        }
                        fkVarB_ = fk.setTextAlignment;
                        int i918 = f55371a;
                        int i919 = i918 & 53;
                        int i101 = i918 | 53;
                        i13 = (i919 & i101) + (i101 | i919);
                        f55372b = i13 % 128;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        int i816 = f55371a;
                        int i817 = ((i816 ^ 31) - (~(-(-((i816 & 31) << 1))))) - 1;
                        f55372b = i817 % 128;
                        int i818 = i817 % 2;
                        av avVarRemove2 = navigationOnClickListener.remove(0);
                        setText settext2 = new setText(((Byte) av.setY(new Object[]{avVarRemove2}, -888174800, 888174800, System.identityHashCode(avVarRemove2))).byteValue(), ((Byte) av.setY(new Object[]{avVarRemove2}, 1262930435, -1262930433, System.identityHashCode(avVarRemove2))).byteValue());
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, avVarRemove2}, -1576428727, 1576428728, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                        getvalue.setOnFocusChangeListener(settext2);
                        fkVarB_ = fk.setOnDragListener;
                        int i819 = f55372b;
                        i15 = (i819 ^ 101) + ((i819 & 101) << 1);
                        f55371a = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                    }
                } else {
                    int i8110 = f55372b;
                    int i8111 = ((i8110 ^ 7) | (i8110 & 7)) << 1;
                    int i8112 = -(((~i8110) & 7) | (i8110 & (-8)));
                    int i8113 = ((i8111 | i8112) << 1) - (i8112 ^ i8111);
                    int i8114 = i8113 % 128;
                    f55371a = i8114;
                    int i8115 = i8113 % 2;
                    int i9110 = (-2) - (((i8114 ^ 34) + ((i8114 & 34) << 1)) ^ (-1));
                    f55372b = i9110 % 128;
                    int i9111 = i9110 % 2;
                    setHorizontalGravity sethorizontalgravity3 = setHorizontalGravity.INSTANCE;
                    if (!((Boolean) setHorizontalGravity.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade2, setcontentdescription}, -1542310944, 1542310944, (int) System.currentTimeMillis())).booleanValue()) {
                        cz czVar3 = new cz(setscrollbardefaultdelaybeforefade2);
                        int i9112 = f55371a;
                        int i9113 = i9112 & 9;
                        int i9114 = (i9112 | 9) & (~i9113);
                        int i9115 = i9113 << 1;
                        int i9116 = (i9114 & i9115) + (i9114 | i9115);
                        f55372b = i9116 % 128;
                        int i9117 = i9116 % 2;
                    }
                    fkVarB_ = fk.setTextAlignment;
                    int i9118 = f55371a;
                    int i9119 = i9118 & 53;
                    int i102 = i9118 | 53;
                    i13 = (i9119 & i102) + (i102 | i9119);
                    f55372b = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                }
            }
            navigationOnClickListener = null;
            list = navigationOnClickListener;
            if (list != null) {
                int i710 = f55372b;
                int i711 = i710 & 95;
                int i712 = -(-((i710 ^ 95) | i711));
                i14 = ((i711 | i712) << 1) - (i712 ^ i711);
                f55371a = i14 % 128;
                if (i14 % 2 != 0) {
                    int i713 = 93 / 0;
                    if (!list.isEmpty()) {
                        int i8116 = f55371a;
                        int i8117 = ((i8116 ^ 31) - (~(-(-((i8116 & 31) << 1))))) - 1;
                        f55372b = i8117 % 128;
                        int i8118 = i8117 % 2;
                        av avVarRemove3 = navigationOnClickListener.remove(0);
                        setText settext3 = new setText(((Byte) av.setY(new Object[]{avVarRemove3}, -888174800, 888174800, System.identityHashCode(avVarRemove3))).byteValue(), ((Byte) av.setY(new Object[]{avVarRemove3}, 1262930435, -1262930433, System.identityHashCode(avVarRemove3))).byteValue());
                        setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, avVarRemove3}, -1576428727, 1576428728, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                        getvalue.setOnFocusChangeListener(settext3);
                        fkVarB_ = fk.setOnDragListener;
                        int i8119 = f55372b;
                        i15 = (i8119 ^ 101) + ((i8119 & 101) << 1);
                        f55371a = i15 % 128;
                        if (i15 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        int i81110 = f55372b;
                        int i81111 = ((i81110 ^ 7) | (i81110 & 7)) << 1;
                        int i81112 = -(((~i81110) & 7) | (i81110 & (-8)));
                        int i81113 = ((i81111 | i81112) << 1) - (i81112 ^ i81111);
                        int i81114 = i81113 % 128;
                        f55371a = i81114;
                        int i81115 = i81113 % 2;
                        int i91110 = (-2) - (((i81114 ^ 34) + ((i81114 & 34) << 1)) ^ (-1));
                        f55372b = i91110 % 128;
                        int i91111 = i91110 % 2;
                        setHorizontalGravity sethorizontalgravity4 = setHorizontalGravity.INSTANCE;
                        if (!((Boolean) setHorizontalGravity.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade2, setcontentdescription}, -1542310944, 1542310944, (int) System.currentTimeMillis())).booleanValue()) {
                            cz czVar4 = new cz(setscrollbardefaultdelaybeforefade2);
                            int i91112 = f55371a;
                            int i91113 = i91112 & 9;
                            int i91114 = (i91112 | 9) & (~i91113);
                            int i91115 = i91113 << 1;
                            int i91116 = (i91114 & i91115) + (i91114 | i91115);
                            f55372b = i91116 % 128;
                            int i91117 = i91116 % 2;
                        }
                        fkVarB_ = fk.setTextAlignment;
                        int i91118 = f55371a;
                        int i91119 = i91118 & 53;
                        int i103 = i91118 | 53;
                        i13 = (i91119 & i103) + (i103 | i91119);
                        f55372b = i13 % 128;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                    }
                } else if (list.isEmpty()) {
                    int i81116 = f55372b;
                    int i81117 = ((i81116 ^ 7) | (i81116 & 7)) << 1;
                    int i81118 = -(((~i81116) & 7) | (i81116 & (-8)));
                    int i81119 = ((i81117 | i81118) << 1) - (i81118 ^ i81117);
                    int i811110 = i81119 % 128;
                    f55371a = i811110;
                    int i811111 = i81119 % 2;
                    int i911110 = (-2) - (((i811110 ^ 34) + ((i811110 & 34) << 1)) ^ (-1));
                    f55372b = i911110 % 128;
                    int i911111 = i911110 % 2;
                    setHorizontalGravity sethorizontalgravity5 = setHorizontalGravity.INSTANCE;
                    if (!((Boolean) setHorizontalGravity.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade2, setcontentdescription}, -1542310944, 1542310944, (int) System.currentTimeMillis())).booleanValue()) {
                        cz czVar5 = new cz(setscrollbardefaultdelaybeforefade2);
                        int i911112 = f55371a;
                        int i911113 = i911112 & 9;
                        int i911114 = (i911112 | 9) & (~i911113);
                        int i911115 = i911113 << 1;
                        int i911116 = (i911114 & i911115) + (i911114 | i911115);
                        f55372b = i911116 % 128;
                        int i911117 = i911116 % 2;
                    }
                    fkVarB_ = fk.setTextAlignment;
                    int i911118 = f55371a;
                    int i911119 = i911118 & 53;
                    int i104 = i911118 | 53;
                    i13 = (i911119 & i104) + (i104 | i911119);
                    f55372b = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                } else {
                    int i81120 = f55371a;
                    int i81121 = ((i81120 ^ 31) - (~(-(-((i81120 & 31) << 1))))) - 1;
                    f55372b = i81121 % 128;
                    int i81122 = i81121 % 2;
                    av avVarRemove4 = navigationOnClickListener.remove(0);
                    setText settext4 = new setText(((Byte) av.setY(new Object[]{avVarRemove4}, -888174800, 888174800, System.identityHashCode(avVarRemove4))).byteValue(), ((Byte) av.setY(new Object[]{avVarRemove4}, 1262930435, -1262930433, System.identityHashCode(avVarRemove4))).byteValue());
                    setScrollBarDefaultDelayBeforeFade.setDividerPadding(new Object[]{setscrollbardefaultdelaybeforefade2, avVarRemove4}, -1576428727, 1576428728, System.identityHashCode(setscrollbardefaultdelaybeforefade2));
                    getvalue.setOnFocusChangeListener(settext4);
                    fkVarB_ = fk.setOnDragListener;
                    int i81123 = f55372b;
                    i15 = (i81123 ^ 101) + ((i81123 & 101) << 1);
                    f55371a = i15 % 128;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                }
            } else {
                int i811112 = f55372b;
                int i811113 = ((i811112 ^ 7) | (i811112 & 7)) << 1;
                int i811114 = -(((~i811112) & 7) | (i811112 & (-8)));
                int i811115 = ((i811113 | i811114) << 1) - (i811114 ^ i811113);
                int i811116 = i811115 % 128;
                f55371a = i811116;
                int i811117 = i811115 % 2;
                int i9111110 = (-2) - (((i811116 ^ 34) + ((i811116 & 34) << 1)) ^ (-1));
                f55372b = i9111110 % 128;
                int i9111111 = i9111110 % 2;
                setHorizontalGravity sethorizontalgravity6 = setHorizontalGravity.INSTANCE;
                if (!((Boolean) setHorizontalGravity.setOnFocusChangeListener(new Object[]{setscrollbardefaultdelaybeforefade2, setcontentdescription}, -1542310944, 1542310944, (int) System.currentTimeMillis())).booleanValue()) {
                    cz czVar6 = new cz(setscrollbardefaultdelaybeforefade2);
                    int i9111112 = f55371a;
                    int i9111113 = i9111112 & 9;
                    int i9111114 = (i9111112 | 9) & (~i9111113);
                    int i9111115 = i9111113 << 1;
                    int i9111116 = (i9111114 & i9111115) + (i9111114 | i9111115);
                    f55372b = i9111116 % 128;
                    int i9111117 = i9111116 % 2;
                }
                fkVarB_ = fk.setTextAlignment;
                int i9111118 = f55371a;
                int i9111119 = i9111118 & 53;
                int i105 = i9111118 | 53;
                i13 = (i9111119 & i105) + (i105 | i9111119);
                f55372b = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
            }
        }
        return fkVarB_;
    }
}
