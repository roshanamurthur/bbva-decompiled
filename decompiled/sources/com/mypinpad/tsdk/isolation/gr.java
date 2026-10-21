package com.mypinpad.tsdk.isolation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0014B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u0011\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0019\u0010\u0016"}, d2 = {"Lcom/mypinpad/tsdk/i/gr;", "Lcom/mypinpad/tsdk/i/ez;", "Lcom/mypinpad/tsdk/i/fb;", "Lcom/mypinpad/tsdk/i/fi;", "Lcom/mypinpad/tsdk/i/ew;", "p0", "Lcom/mypinpad/tsdk/i/setTextKeepState;", "p1", "Lcom/mypinpad/tsdk/i/activateSession;", "p2", "Lcom/mypinpad/tsdk/i/fd;", "p3", "", "p4", "Lcom/mypinpad/tsdk/i/setTransitionVisibility;", "p5", "Lcom/mypinpad/tsdk/i/fk;", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/fi;Lcom/mypinpad/tsdk/i/setTextKeepState;Lcom/mypinpad/tsdk/i/activateSession;Lcom/mypinpad/tsdk/i/fd;Lcom/mypinpad/tsdk/i/setTransitionVisibility;)Lcom/mypinpad/tsdk/i/fk;", "", "setX", "(Lcom/mypinpad/tsdk/i/fi;Lcom/mypinpad/tsdk/i/setTextKeepState;)V", "(Lcom/mypinpad/tsdk/i/fi;Lcom/mypinpad/tsdk/i/setTextKeepState;)Lcom/mypinpad/tsdk/i/fk;", "", "(Lcom/mypinpad/tsdk/i/fi;Lcom/mypinpad/tsdk/i/setTextKeepState;[B)Lcom/mypinpad/tsdk/i/fk;", "setCompoundDrawableTintBlendMode", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
public final class gr extends ez implements ew<fi>, fb<fi> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f56071k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f56072l = 1;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    static {
        int i10 = f56071k;
        int i11 = (i10 & 27) + (i10 | 27);
        f56072l = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Exception {
        fk onFocusChangeListener;
        fk fkVar;
        fk fkVar2;
        int i13 = ~i11;
        int i14 = (((~((~i12) | i13)) | (~(i13 | i10))) * (-245)) + (i11 * 246) + (i10 * (-244));
        int i15 = ~(i13 | i12);
        switch (((i10 | i15) * 245) + (i15 * (-245)) + i14) {
            case 1:
                fi fiVar = (fi) objArr[1];
                setTextKeepState settextkeepstate = (setTextKeepState) objArr[2];
                int i16 = f56072l;
                int i17 = ((i16 ^ 33) - (~((i16 & 33) << 1))) - 1;
                f56071k = i17 % 128;
                if (i17 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fiVar, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate, "");
                    ez.setX(fiVar, settextkeepstate, activateSession.CLEAR_DISPLAY, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) Companion.setY(new Object[0], -1308901199, 1308901199, (int) System.currentTimeMillis()), null);
                    int i18 = 78 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(fiVar, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate, "");
                    ez.setX(fiVar, settextkeepstate, activateSession.CLEAR_DISPLAY, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) Companion.setY(new Object[0], -1308901199, 1308901199, (int) System.currentTimeMillis()), null);
                }
                int i19 = f56072l + 17;
                f56071k = i19 % 128;
                if (i19 % 2 == 0) {
                    return null;
                }
                throw null;
            case 2:
                gr grVar = (gr) objArr[0];
                fi fiVar2 = (fi) objArr[1];
                setTextKeepState settextkeepstate2 = (setTextKeepState) objArr[2];
                Intrinsics.checkNotNullParameter(fiVar2, "");
                Intrinsics.checkNotNullParameter(settextkeepstate2, "");
                onFocusChangeListener = ez.setOnFocusChangeListener(grVar, fiVar2, settextkeepstate2, null, ez.setY(fd.END_APPLICATION, getY.setNavigationOnClickListener, Boolean.TRUE, null, null, null, null, null, 192), null, new f(activateSession.N_A, ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), setDrawSelectorOnTop.setOnFocusChangeListener, ez.setY.setOnFocusChangeListener()));
                int i20 = f56071k;
                int i21 = i20 ^ 53;
                int i22 = (i20 & 53) << 1;
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                f56072l = i23 % 128;
                if (i23 % 2 == 0) {
                    throw null;
                }
                break;
            case 3:
                gr grVar2 = (gr) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate3 = (setTextKeepState) objArr[2];
                byte[] bArr = (byte[]) objArr[3];
                int i24 = f56071k;
                int i25 = (i24 ^ 63) + ((i24 & 63) << 1);
                f56072l = i25 % 128;
                fi fiVar3 = (fi) setscrollbardefaultdelaybeforefade;
                if (i25 % 2 == 0) {
                    throw null;
                }
                fk fkVar3 = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar2, fiVar3, settextkeepstate3, bArr}, -618713615, 618713615, System.identityHashCode(grVar2));
                int i26 = f56072l + 16;
                int i27 = (i26 ^ (-1)) + (i26 << 1);
                f56071k = i27 % 128;
                if (i27 % 2 == 0) {
                    return fkVar3;
                }
                int i28 = 34 / 0;
                return fkVar3;
            case 4:
                gr grVar3 = (gr) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade2 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate4 = (setTextKeepState) objArr[2];
                byte[] bArr2 = (byte[]) objArr[3];
                int i29 = f56072l;
                int i30 = (i29 & 27) + (i29 | 27);
                f56071k = i30 % 128;
                int i31 = i30 % 2;
                onFocusChangeListener = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar3, (fi) setscrollbardefaultdelaybeforefade2, settextkeepstate4, bArr2}, 868110359, -868110347, System.identityHashCode(grVar3));
                int i32 = f56071k;
                int i33 = i32 | 7;
                int i34 = (i33 << 1) - ((~(i32 & 7)) & i33);
                f56072l = i34 % 128;
                if (i34 % 2 == 0) {
                    throw null;
                }
                break;
            case 5:
                gr grVar4 = (gr) objArr[0];
                fi fiVar4 = (fi) objArr[1];
                setTextKeepState settextkeepstate5 = (setTextKeepState) objArr[2];
                int i35 = f56072l;
                int i36 = i35 ^ 29;
                int i37 = ((i35 & 29) | i36) << 1;
                int i38 = -i36;
                int i39 = (i37 & i38) + (i37 | i38);
                f56071k = i39 % 128;
                if (i39 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(fiVar4, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate5, "");
                    return (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar4, fiVar4, settextkeepstate5, ValueQualifier.setY, setContentCaptureSession.setOnLongClickListener}, -1598862597, 1598862606, System.identityHashCode(grVar4));
                }
                Intrinsics.checkNotNullParameter(fiVar4, "");
                Intrinsics.checkNotNullParameter(settextkeepstate5, "");
                throw null;
            case 6:
                gr grVar5 = (gr) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade3 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate6 = (setTextKeepState) objArr[2];
                int i40 = f56071k;
                int i41 = i40 & 87;
                int i42 = i41 + ((i40 ^ 87) | i41);
                f56072l = i42 % 128;
                int i43 = i42 % 2;
                fk fkVar4 = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar5, (fi) setscrollbardefaultdelaybeforefade3, settextkeepstate6}, 1239397712, -1239397695, System.identityHashCode(grVar5));
                int i44 = f56072l;
                int i45 = i44 & 3;
                int i46 = (((i44 | 3) & (~i45)) - (~(i45 << 1))) - 1;
                f56071k = i46 % 128;
                int i47 = i46 % 2;
                return fkVar4;
            case 7:
                gr grVar6 = (gr) objArr[0];
                activateSession activatesession = (activateSession) objArr[1];
                fd fdVar = (fd) objArr[2];
                fi fiVar5 = (fi) objArr[3];
                setTextKeepState settextkeepstate7 = (setTextKeepState) objArr[4];
                ValueQualifier valueQualifier = (ValueQualifier) objArr[5];
                byte[] bArr3 = (byte[]) objArr[6];
                fk onFocusChangeListener2 = ez.setOnFocusChangeListener(grVar6, fiVar5, settextkeepstate7, null, ez.setY(fdVar, (getY) objArr[7], Boolean.TRUE, null, null, null, null, null, 192), ez.setY(fiVar5, activatesession, valueQualifier, (byte[]) Companion.setY(new Object[0], 2130815858, -2130815856, (int) System.currentTimeMillis())), new f(activatesession, ez.setY.setNavigationOnClickListener(), (setContentCaptureSession) objArr[8], ez.setY.setLayoutAnimation(), bArr3));
                int i48 = f56071k + 7;
                f56072l = i48 % 128;
                int i49 = i48 % 2;
                return onFocusChangeListener2;
            case 8:
                gr grVar7 = (gr) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade4 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate8 = (setTextKeepState) objArr[2];
                int i50 = f56072l;
                int i51 = (i50 & 65) + (i50 | 65);
                f56071k = i51 % 128;
                fi fiVar6 = (fi) setscrollbardefaultdelaybeforefade4;
                if (i51 % 2 != 0) {
                    fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar7, fiVar6, settextkeepstate8}, -1776704712, 1776704723, System.identityHashCode(grVar7));
                    int i52 = 7 / 0;
                } else {
                    fkVar = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar7, fiVar6, settextkeepstate8}, -1776704712, 1776704723, System.identityHashCode(grVar7));
                }
                fk fkVar5 = fkVar;
                int i53 = f56071k;
                int i54 = (i53 & 19) + (i53 | 19);
                f56072l = i54 % 128;
                if (i54 % 2 != 0) {
                    return fkVar5;
                }
                int i55 = 35 / 0;
                return fkVar5;
            case 9:
                gr grVar8 = (gr) objArr[0];
                fi fiVar7 = (fi) objArr[1];
                setTextKeepState settextkeepstate9 = (setTextKeepState) objArr[2];
                ValueQualifier valueQualifier2 = (ValueQualifier) objArr[3];
                setContentCaptureSession setcontentcapturesession = (setContentCaptureSession) objArr[4];
                int i56 = f56072l;
                int i57 = i56 & 93;
                int i58 = -(-((i56 ^ 93) | i57));
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                f56071k = i59 % 128;
                int i60 = i59 % 2;
                Intrinsics.checkNotNullParameter(fiVar7, "");
                Intrinsics.checkNotNullParameter(settextkeepstate9, "");
                Intrinsics.checkNotNullParameter(valueQualifier2, "");
                Intrinsics.checkNotNullParameter(setcontentcapturesession, "");
                onFocusChangeListener = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar8, activateSession.ERROR_OTHER_CARD, fd.END_APPLICATION, fiVar7, settextkeepstate9, valueQualifier2, (byte[]) ez.setY.setX(new Object[0], 1517968692, -1517968681, (int) System.currentTimeMillis()), (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), setcontentcapturesession}, -1920824664, 1920824671, System.identityHashCode(grVar8));
                int i61 = f56072l;
                int i62 = (i61 & 79) + (i61 | 79);
                f56071k = i62 % 128;
                if (i62 % 2 != 0) {
                    throw null;
                }
                break;
            case 10:
                gr grVar9 = (gr) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade5 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate10 = (setTextKeepState) objArr[2];
                int i63 = f56072l;
                int i64 = ((i63 | 51) << 1) - (i63 ^ 51);
                f56071k = i64 % 128;
                int i65 = i64 % 2;
                fk fkVar6 = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar9, (fi) setscrollbardefaultdelaybeforefade5, settextkeepstate10}, 532812653, -532812648, System.identityHashCode(grVar9));
                int i66 = f56071k;
                int i67 = i66 & 115;
                int i68 = -(-((i66 ^ 115) | i67));
                int i69 = (i67 & i68) + (i68 | i67);
                f56072l = i69 % 128;
                int i70 = i69 % 2;
                return fkVar6;
            case 11:
                gr grVar10 = (gr) objArr[0];
                fi fiVar8 = (fi) objArr[1];
                setTextKeepState settextkeepstate11 = (setTextKeepState) objArr[2];
                Intrinsics.checkNotNullParameter(fiVar8, "");
                Intrinsics.checkNotNullParameter(settextkeepstate11, "");
                fk onFocusChangeListener3 = ez.setOnFocusChangeListener(grVar10, fiVar8, settextkeepstate11, null, ez.setY(fd.END_APPLICATION, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), Boolean.TRUE, null, null, null, null, null, 192), ez.setY(fiVar8, activateSession.PRESENT_CARD_AGAIN, ValueQualifier.setY, (byte[]) Companion.setY(new Object[0], 2130815858, -2130815856, (int) System.currentTimeMillis())), new f(activateSession.ERROR_OTHER_CARD, setItemChecked.setX, ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener()));
                int i71 = f56071k;
                int i72 = (i71 ^ 53) + ((i71 & 53) << 1);
                f56072l = i72 % 128;
                if (i72 % 2 != 0) {
                    return onFocusChangeListener3;
                }
                int i73 = 59 / 0;
                return onFocusChangeListener3;
            case 12:
                gr grVar11 = (gr) objArr[0];
                fi fiVar9 = (fi) objArr[1];
                setTextKeepState settextkeepstate12 = (setTextKeepState) objArr[2];
                byte[] bArr4 = (byte[]) objArr[3];
                int i74 = f56071k;
                int i75 = i74 & 19;
                int i76 = (i74 ^ 19) | i75;
                int i77 = (i75 & i76) + (i76 | i75);
                f56072l = i77 % 128;
                int i78 = i77 % 2;
                Intrinsics.checkNotNullParameter(fiVar9, "");
                Intrinsics.checkNotNullParameter(settextkeepstate12, "");
                Intrinsics.checkNotNullParameter(bArr4, "");
                fk fkVar7 = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar11, fiVar9, settextkeepstate12, ValueQualifier.setY, setContentCaptureSession.setLayoutAnimation}, -1598862597, 1598862606, System.identityHashCode(grVar11));
                int i79 = f56072l;
                int i80 = (((i79 ^ 91) | (i79 & 91)) << 1) - (((~i79) & 91) | (i79 & (-92)));
                f56071k = i80 % 128;
                int i81 = i80 % 2;
                return fkVar7;
            case 13:
                gr grVar12 = (gr) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade6 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate13 = (setTextKeepState) objArr[2];
                int i82 = f56072l;
                int i83 = i82 & 111;
                int i84 = i83 + ((i82 ^ 111) | i83);
                f56071k = i84 % 128;
                fi fiVar10 = (fi) setscrollbardefaultdelaybeforefade6;
                if (i84 % 2 == 0) {
                    return (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar12, fiVar10, settextkeepstate13}, 1375391584, -1375391568, System.identityHashCode(grVar12));
                }
                throw null;
            case 14:
                gr grVar13 = (gr) objArr[0];
                fi fiVar11 = (fi) objArr[1];
                setTextKeepState settextkeepstate14 = (setTextKeepState) objArr[2];
                activateSession activatesession2 = (activateSession) objArr[3];
                fd fdVar2 = (fd) objArr[4];
                setTransitionVisibility settransitionvisibility = (setTransitionVisibility) objArr[5];
                Intrinsics.checkNotNullParameter(fiVar11, "");
                Intrinsics.checkNotNullParameter(settextkeepstate14, "");
                Intrinsics.checkNotNullParameter(activatesession2, "");
                Intrinsics.checkNotNullParameter(fdVar2, "");
                Intrinsics.checkNotNullParameter(settransitionvisibility, "");
                f fVar = new f(ez.setY.setOnDragListener(), ez.setY.setNavigationOnClickListener(), ez.setY.setOnLongClickListener(), ez.setY.setLayoutAnimation(), ez.setY.setOnFocusChangeListener());
                l y7 = ez.setY(fiVar11, activatesession2, ValueQualifier.setCompoundDrawableTintBlendMode, (byte[]) Companion.setY(new Object[0], 2130815858, -2130815856, (int) System.currentTimeMillis()));
                j y10 = ez.setY(fdVar2, (getY) ez.setY.setX(new Object[0], 368505141, -368505137, (int) System.currentTimeMillis()), Boolean.TRUE, Boolean.FALSE, null, settransitionvisibility, null, null, 192);
                ey eyVar = ey.INSTANCE;
                fk onFocusChangeListener4 = ez.setOnFocusChangeListener(grVar13, fiVar11, settextkeepstate14, (getBeepOnFailure) ey.setY(new Object[]{fiVar11}, 1660534021, -1660534020, (int) System.currentTimeMillis()), y10, y7, fVar);
                int i85 = f56071k;
                int i86 = ((i85 | 23) << 1) - (i85 ^ 23);
                f56072l = i86 % 128;
                int i87 = i86 % 2;
                return onFocusChangeListener4;
            case 15:
                gr grVar14 = (gr) objArr[0];
                setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade7 = (setScrollBarDefaultDelayBeforeFade) objArr[1];
                setTextKeepState settextkeepstate15 = (setTextKeepState) objArr[2];
                int i88 = f56071k;
                int i89 = (((i88 | 30) << 1) - (i88 ^ 30)) - 1;
                f56072l = i89 % 128;
                fi fiVar12 = (fi) setscrollbardefaultdelaybeforefade7;
                if (i89 % 2 == 0) {
                    throw null;
                }
                onFocusChangeListener = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar14, fiVar12, settextkeepstate15}, 1218343338, -1218343336, System.identityHashCode(grVar14));
                int i90 = f56072l;
                int i91 = i90 & 85;
                int i92 = (i90 ^ 85) | i91;
                int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
                f56071k = i93 % 128;
                if (i93 % 2 != 0) {
                    throw null;
                }
                break;
            case 16:
                gr grVar15 = (gr) objArr[0];
                fi fiVar13 = (fi) objArr[1];
                setTextKeepState settextkeepstate16 = (setTextKeepState) objArr[2];
                int i94 = f56072l;
                int i95 = (-2) - ((((i94 | 88) << 1) - (i94 ^ 88)) ^ (-1));
                f56071k = i95 % 128;
                if (i95 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fiVar13, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate16, "");
                    fkVar2 = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar15, fiVar13, settextkeepstate16, ValueQualifier.setY, setContentCaptureSession.setOnFocusChangeListener}, -1598862597, 1598862606, System.identityHashCode(grVar15));
                    int i96 = 42 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(fiVar13, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate16, "");
                    fkVar2 = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar15, fiVar13, settextkeepstate16, ValueQualifier.setY, setContentCaptureSession.setOnFocusChangeListener}, -1598862597, 1598862606, System.identityHashCode(grVar15));
                }
                fk fkVar8 = fkVar2;
                int i97 = f56072l;
                int i98 = (((i97 ^ 125) | (i97 & 125)) << 1) - (((~i97) & 125) | (i97 & (-126)));
                f56071k = i98 % 128;
                int i99 = i98 % 2;
                return fkVar8;
            case 17:
                gr grVar16 = (gr) objArr[0];
                fi fiVar14 = (fi) objArr[1];
                setTextKeepState settextkeepstate17 = (setTextKeepState) objArr[2];
                int i100 = f56071k;
                int i101 = i100 & 29;
                int i102 = -(-(i100 | 29));
                int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                f56072l = i103 % 128;
                int i104 = i103 % 2;
                Intrinsics.checkNotNullParameter(fiVar14, "");
                Intrinsics.checkNotNullParameter(settextkeepstate17, "");
                fk fkVar9 = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar16, fiVar14, settextkeepstate17, ValueQualifier.setY, setContentCaptureSession.setNavigationOnClickListener}, -1598862597, 1598862606, System.identityHashCode(grVar16));
                int i105 = f56072l;
                int i106 = ((i105 ^ 85) | (i105 & 85)) << 1;
                int i107 = -(((~i105) & 85) | (i105 & (-86)));
                int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
                f56071k = i108 % 128;
                int i109 = i108 % 2;
                return fkVar9;
            default:
                gr grVar17 = (gr) objArr[0];
                fi fiVar15 = (fi) objArr[1];
                setTextKeepState settextkeepstate18 = (setTextKeepState) objArr[2];
                byte[] bArr5 = (byte[]) objArr[3];
                int i110 = f56071k;
                int i111 = i110 & 61;
                int i112 = -(-((i110 ^ 61) | i111));
                int i113 = (i111 & i112) + (i112 | i111);
                f56072l = i113 % 128;
                if (i113 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fiVar15, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate18, "");
                    Intrinsics.checkNotNullParameter(bArr5, "");
                    onFocusChangeListener = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar17, (activateSession) ez.setY.setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis()), fd.SELECT_NEXT, fiVar15, settextkeepstate18, (ValueQualifier) ez.setY.setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis()), bArr5, getY.setCompoundDrawableTintBlendMode, setContentCaptureSession.setLayoutAnimation}, -1920824664, 1920824671, System.identityHashCode(grVar17));
                } else {
                    Intrinsics.checkNotNullParameter(fiVar15, "");
                    Intrinsics.checkNotNullParameter(settextkeepstate18, "");
                    Intrinsics.checkNotNullParameter(bArr5, "");
                    onFocusChangeListener = (fk) setCompoundDrawableTintBlendMode(new Object[]{grVar17, (activateSession) ez.setY.setX(new Object[0], -750761700, 750761703, (int) System.currentTimeMillis()), fd.SELECT_NEXT, fiVar15, settextkeepstate18, (ValueQualifier) ez.setY.setX(new Object[0], -160680657, 160680667, (int) System.currentTimeMillis()), bArr5, getY.setCompoundDrawableTintBlendMode, setContentCaptureSession.setLayoutAnimation}, -1920824664, 1920824671, System.identityHashCode(grVar17));
                    int i114 = 13 / 0;
                }
                break;
        }
        return onFocusChangeListener;
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk a_(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1817308137, 1817308150, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk b_(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -2010354768, 2010354778, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setDividerPadding(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, 1330121189, -1330121183, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setOnFocusChangeListener(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -1295412196, 1295412211, System.identityHashCode(this));
    }

    public final void setX(@NotNull fi p4, @NotNull setTextKeepState p10) throws Exception {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10}, 575703855, -575703854, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setY(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, byte[] bArr) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, bArr}, 1700611680, -1700611676, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ew
    public final /* synthetic */ fk setDividerPadding(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate, byte[] bArr) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate, bArr}, -337220713, 337220716, System.identityHashCode(this));
    }

    @NotNull
    public final fk setDividerPadding(@NotNull fi p4, @NotNull setTextKeepState p10, @NotNull byte[] p11) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10, p11}, -618713615, 618713615, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.gr$setX, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/gr$setX;", "", "<init>", "()V"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f56073a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f56074b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final /* synthetic */ byte[] setOnFocusChangeListener() {
            return (byte[]) setY(new Object[0], -1308901199, 1308901199, (int) System.currentTimeMillis());
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            byte[] bArr;
            int i13 = (i11 * (-1917)) + (i10 * 960);
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = (((~(i14 | i12)) | (~(i10 | i15))) * 959) + (i14 * (-959)) + (((~(i14 | i15)) | (~(i10 | i12))) * 959) + i13;
            if (i16 == 1) {
                int i17 = f56073a;
                int i18 = i17 & 59;
                int i19 = i18 + ((i17 ^ 59) | i18);
                int i20 = i19 % 128;
                f56074b = i20;
                if (i19 % 2 == 0) {
                    byte[] bArr2 = new byte[4];
                    bArr2[1] = 0;
                    bArr2[1] = 1;
                    bArr2[2] = 4;
                    bArr = bArr2;
                } else {
                    bArr = new byte[]{0, 0, 3};
                }
                int i21 = ((i20 | 45) << 1) - (i20 ^ 45);
                f56073a = i21 % 128;
                int i22 = i21 % 2;
            } else {
                if (i16 == 2) {
                    int i23 = f56073a;
                    int i24 = i23 | 77;
                    int i25 = i24 << 1;
                    int i26 = -((~(i23 & 77)) & i24);
                    int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                    f56074b = i27 % 128;
                    int i28 = i27 % 2;
                    byte[] bArr3 = (byte[]) setY(new Object[0], -161221919, 161221922, (int) System.currentTimeMillis());
                    int i29 = f56074b;
                    int i30 = (i29 ^ 17) + ((i29 & 17) << 1);
                    f56073a = i30 % 128;
                    int i31 = i30 % 2;
                    return bArr3;
                }
                if (i16 != 3) {
                    int i32 = f56073a;
                    int i33 = i32 & 15;
                    int i34 = ((i32 ^ 15) | i33) << 1;
                    int i35 = -((i32 | 15) & (~i33));
                    int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                    f56074b = i36 % 128;
                    int i37 = i36 % 2;
                    byte[] bArr4 = (byte[]) setY(new Object[0], 1498368359, -1498368358, (int) System.currentTimeMillis());
                    int i38 = f56074b;
                    int i39 = (i38 ^ 57) + ((i38 & 57) << 1);
                    f56073a = i39 % 128;
                    if (i39 % 2 == 0) {
                        return bArr4;
                    }
                    throw null;
                }
                int i40 = f56074b;
                int i41 = i40 & 85;
                int i42 = (i40 ^ 85) | i41;
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                int i44 = i43 % 128;
                f56073a = i44;
                int i45 = i43 % 2;
                bArr = new byte[]{0, 0, 0};
                int i46 = (i44 | 113) << 1;
                int i47 = -(i44 ^ 113);
                int i48 = (i46 & i47) + (i47 | i46);
                f56074b = i48 % 128;
                if (i48 % 2 == 0) {
                    throw null;
                }
            }
            return bArr;
        }

        public static final /* synthetic */ byte[] setY() {
            return (byte[]) setY(new Object[0], 2130815858, -2130815856, (int) System.currentTimeMillis());
        }
    }

    @NotNull
    public final fk setDividerPadding(@NotNull fi p4, @NotNull setTextKeepState p10) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10}, 532812653, -532812648, System.identityHashCode(this));
    }

    @NotNull
    public final fk setDividerPadding(@NotNull fi fiVar, @NotNull setTextKeepState settextkeepstate, @NotNull activateSession activatesession, @NotNull fd fdVar, @NotNull setTransitionVisibility settransitionvisibility) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, fiVar, settextkeepstate, activatesession, fdVar, settransitionvisibility}, -1887279096, 1887279110, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.fb
    public final /* synthetic */ fk setCompoundDrawableTintBlendMode(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, setTextKeepState settextkeepstate) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, setscrollbardefaultdelaybeforefade, settextkeepstate}, -371921401, 371921409, System.identityHashCode(this));
    }

    @NotNull
    public final fk setCompoundDrawableTintBlendMode(@NotNull fi p4, @NotNull setTextKeepState p10) {
        return (fk) setCompoundDrawableTintBlendMode(new Object[]{this, p4, p10}, 1239397712, -1239397695, System.identityHashCode(this));
    }
}
