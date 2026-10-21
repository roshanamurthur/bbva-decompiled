package com.mypinpad.tsdk.isolation;

import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class mb implements me {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57067f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57068g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setTextLocales f57069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final component12 f57070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f57071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final md f57072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f57073e;

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setOnFocusChangeListener;
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[component14.values().length];
            iArr[component14.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            setOnFocusChangeListener = iArr;
            int[] iArr2 = new int[component13.values().length];
            iArr2[component13.setOnFocusChangeListener.ordinal()] = 1;
            iArr2[component13.setY.ordinal()] = 2;
            iArr2[component13.setCompoundDrawableTintBlendMode.ordinal()] = 3;
            iArr2[component13.setDividerPadding.ordinal()] = 4;
            iArr2[component13.setNavigationOnClickListener.ordinal()] = 5;
            iArr2[component13.setOnDragListener.ordinal()] = 6;
            iArr2[component13.getNavBarTitleString.ordinal()] = 7;
            iArr2[component13.setLayoutAnimation.ordinal()] = 8;
            iArr2[component13.setOnLongClickListener.ordinal()] = 9;
            iArr2[component13.setTextAlignment.ordinal()] = 10;
            iArr2[component13.setIncludeFontPadding.ordinal()] = 11;
            iArr2[component13.UiMessageCallbackKtWhenMappings.ordinal()] = 12;
            iArr2[component13.setZ.ordinal()] = 13;
            iArr2[component13.setAlwaysDrawnWithCacheEnabled.ordinal()] = 14;
            iArr2[component13.setOnEditorActionListener.ordinal()] = 15;
            setY = iArr2;
            int i10 = (1 | 37) << 1;
            int i11 = -((1 & (-38)) | ((~1) & 37));
            int i12 = (i10 ^ i11) + ((i10 & i11) << 1);
            int i13 = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
        }
    }

    public mb(@NotNull setTextLocales settextlocales, @NotNull component12 component12Var) {
        component14 component14Var;
        byte bByteValue;
        Intrinsics.checkNotNullParameter(settextlocales, "");
        Intrinsics.checkNotNullParameter(component12Var, "");
        this.f57069a = settextlocales;
        this.f57070b = component12Var;
        this.f57071c = ((Boolean) component12.setX(new Object[]{component12Var}, -1666503461, 1666503467, System.identityHashCode(component12Var))).booleanValue();
        Long l6 = (Long) component12.setX(new Object[]{component12Var}, 2015756496, -2015756496, System.identityHashCode(component12Var));
        if (l6 != null) {
            long jLongValue = l6.longValue();
            if (jLongValue < 0) {
                throw new fh(AuthApiStatusCodes.AUTH_URL_RESOLUTION, String.valueOf(jLongValue));
            }
            setAnimation setanimation = setAnimation.INSTANCE;
            TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis());
            String strValueOf = String.valueOf(jLongValue);
            TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis());
            int onFocusChangeListener = ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed2}, -570885530, 570885532, System.identityHashCode(transactionFailed2))).setOnFocusChangeListener();
            setX(new Object[]{transactionFailed, (byte[]) setInputExtras.setDividerPadding(new Object[]{strValueOf, Integer.valueOf(onFocusChangeListener)}, -689525923, 689525942, onFocusChangeListener)}, -2067167992, 2067167993, (int) System.currentTimeMillis());
        }
        Long l7 = (Long) component12.setX(new Object[]{component12Var}, -1804967839, 1804967844, System.identityHashCode(component12Var));
        if (l7 != null) {
            long jLongValue2 = l7.longValue();
            if (jLongValue2 < 0) {
                throw new fh(AuthApiStatusCodes.AUTH_URL_RESOLUTION, String.valueOf(jLongValue2));
            }
            setAnimation setanimation2 = setAnimation.INSTANCE;
            TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis());
            String strValueOf2 = String.valueOf(jLongValue2);
            TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis());
            int onFocusChangeListener2 = ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed4}, -570885530, 570885532, System.identityHashCode(transactionFailed4))).setOnFocusChangeListener();
            setX(new Object[]{transactionFailed3, (byte[]) setInputExtras.setDividerPadding(new Object[]{strValueOf2, Integer.valueOf(onFocusChangeListener2)}, -689525923, 689525942, onFocusChangeListener2)}, -2067167992, 2067167993, (int) System.currentTimeMillis());
        }
        setProgressDrawableTiled setprogressdrawabletiled = (setProgressDrawableTiled) component12.setX(new Object[]{component12Var}, 972931950, -972931947, System.identityHashCode(component12Var));
        if (setprogressdrawabletiled != null) {
            getInstallationPublicKey.Companion companion = getInstallationPublicKey.INSTANCE;
            if (((getInstallationPublicKey) getInstallationPublicKey.Companion.setDividerPadding(new Object[]{Byte.valueOf(((Byte) setProgressDrawableTiled.setY(new Object[]{setprogressdrawabletiled}, 1453588839, -1453588839, System.identityHashCode(setprogressdrawabletiled))).byteValue())}, 1422275723, -1422275723, (int) System.currentTimeMillis())) == null && ((bByteValue = ((Byte) setProgressDrawableTiled.setY(new Object[]{setprogressdrawabletiled}, 1453588839, -1453588839, System.identityHashCode(setprogressdrawabletiled))).byteValue()) < 0 || bByteValue > 7)) {
                throw new fh(3026, String.valueOf(setprogressdrawabletiled));
            }
        }
        setX(new Object[]{(Date) component12.setX(new Object[]{component12Var}, -1795922846, 1795922855, System.identityHashCode(component12Var))}, 1907303781, -1907303777, (int) System.currentTimeMillis());
        setAnimation setanimation3 = setAnimation.INSTANCE;
        setX(new Object[]{(TransactionFailed) setAnimation.setY(new Object[0], -200724044, 200724315, (int) System.currentTimeMillis()), (byte[]) component12.setX(new Object[]{component12Var}, -1770896091, 1770896104, System.identityHashCode(component12Var))}, -2067167992, 2067167993, (int) System.currentTimeMillis());
        setX(new Object[]{(TransactionFailed) setAnimation.setY(new Object[0], -889535337, 889535345, (int) System.currentTimeMillis()), (byte[]) component12.setX(new Object[]{component12Var}, 940527128, -940527124, System.identityHashCode(component12Var))}, -2067167992, 2067167993, (int) System.currentTimeMillis());
        setX(new Object[]{(TransactionFailed) setAnimation.setY(new Object[0], -547346090, 547346114, (int) System.currentTimeMillis()), (byte[]) component12.setX(new Object[]{component12Var}, -927483712, 927483724, System.identityHashCode(component12Var))}, -2067167992, 2067167993, (int) System.currentTimeMillis());
        setX(new Object[]{(TransactionFailed) setAnimation.setY(new Object[0], -1752917871, 1752918109, (int) System.currentTimeMillis()), (byte[]) component12.setX(new Object[]{component12Var}, 808531158, -808531150, System.identityHashCode(component12Var))}, -2067167992, 2067167993, (int) System.currentTimeMillis());
        setX(new Object[]{(TransactionFailed) setAnimation.setY(new Object[0], 1481077281, -1481077011, (int) System.currentTimeMillis()), (byte[]) component12.setX(new Object[]{component12Var}, 305043302, -305043300, System.identityHashCode(component12Var))}, -2067167992, 2067167993, (int) System.currentTimeMillis());
        this.f57072d = (md) setX(new Object[]{(component13) component12.setX(new Object[]{component12Var}, -1223512608, 1223512619, System.identityHashCode(component12Var))}, 1948932085, -1948932074, (int) System.currentTimeMillis());
        setProgressDrawableTiled setprogressdrawabletiled2 = (setProgressDrawableTiled) component12.setX(new Object[]{component12Var}, 972931950, -972931947, System.identityHashCode(component12Var));
        Integer numValueOf = null;
        if (setprogressdrawabletiled2 != null && (component14Var = (component14) setProgressDrawableTiled.setY(new Object[]{setprogressdrawabletiled2}, 953160250, -953160249, System.identityHashCode(setprogressdrawabletiled2))) != null) {
            numValueOf = Integer.valueOf(component14Var.setOnFocusChangeListener());
        }
        this.f57073e = numValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00bc  */
    public static /* synthetic */ setMaxWidth a(Object[] objArr) throws Exception {
        getBeepOnFailure getbeeponfailure;
        int i10;
        int i11;
        Object x4;
        Object x6;
        Object x7;
        Object x10;
        Object x11;
        mb mbVar = (mb) objArr[0];
        setMaxWidth setmaxwidth = new setMaxWidth();
        component12 component12Var = mbVar.f57070b;
        Long l6 = (Long) component12.setX(new Object[]{component12Var}, 2015756496, -2015756496, System.identityHashCode(component12Var));
        component12 component12Var2 = mbVar.f57070b;
        if (l6 == null) {
            int i12 = f57068g + 19;
            f57067f = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            if (((Long) component12.setX(new Object[]{component12Var2}, -1804967839, 1804967844, System.identityHashCode(component12Var2))) == null) {
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = getBeepOnFailure.setOnFocusChangeListener;
                setAnimation setanimation = setAnimation.INSTANCE;
                TransactionFailed transactionFailed = (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis());
                getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed}, 1914607362, -1914607356, System.identityHashCode(transactionFailed)), null, null, Boolean.FALSE, 30}, -976227287, 976227290, 30);
                int i13 = f57067f + 101;
                f57068g = i13 % 128;
                int i14 = i13 % 2;
                i10 = 2;
            } else {
                long jLongValue = ((Long) setX(new Object[]{mbVar}, -937014502, 937014502, System.identityHashCode(mbVar))).longValue();
                getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = getBeepOnFailure.setOnFocusChangeListener;
                setAnimation setanimation2 = setAnimation.INSTANCE;
                TransactionFailed transactionFailed2 = (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis());
                String str = (String) TransactionFailed.setX(new Object[]{transactionFailed2}, 1914607362, -1914607356, System.identityHashCode(transactionFailed2));
                String strValueOf = String.valueOf(jLongValue);
                TransactionFailed transactionFailed3 = (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis());
                int onFocusChangeListener = ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed3}, -570885530, 570885532, System.identityHashCode(transactionFailed3))).setOnFocusChangeListener();
                getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str, (byte[]) setInputExtras.setDividerPadding(new Object[]{strValueOf, Integer.valueOf(onFocusChangeListener)}, -689525923, 689525942, onFocusChangeListener), null, Boolean.FALSE, 28}, -976227287, 976227290, 28);
                int i15 = f57067f;
                int i16 = i15 | 91;
                int i17 = (i16 << 1) - ((~(i15 & 91)) & i16);
                f57068g = i17 % 128;
                i10 = 2;
                int i18 = i17 % 2;
            }
        } else {
            long jLongValue2 = ((Long) setX(new Object[]{mbVar}, -937014502, 937014502, System.identityHashCode(mbVar))).longValue();
            getBeepOnFailure.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = getBeepOnFailure.setOnFocusChangeListener;
            setAnimation setanimation3 = setAnimation.INSTANCE;
            TransactionFailed transactionFailed4 = (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis());
            String str2 = (String) TransactionFailed.setX(new Object[]{transactionFailed4}, 1914607362, -1914607356, System.identityHashCode(transactionFailed4));
            String strValueOf2 = String.valueOf(jLongValue2);
            TransactionFailed transactionFailed5 = (TransactionFailed) setAnimation.setY(new Object[0], 2083840602, -2083840519, (int) System.currentTimeMillis());
            int onFocusChangeListener2 = ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed5}, -570885530, 570885532, System.identityHashCode(transactionFailed5))).setOnFocusChangeListener();
            getbeeponfailure = (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str2, (byte[]) setInputExtras.setDividerPadding(new Object[]{strValueOf2, Integer.valueOf(onFocusChangeListener2)}, -689525923, 689525942, onFocusChangeListener2), null, Boolean.FALSE, 28}, -976227287, 976227290, 28);
            int i19 = f57067f;
            int i110 = i19 | 91;
            int i111 = (i110 << 1) - ((~(i19 & 91)) & i110);
            f57068g = i111 % 128;
            i10 = 2;
            int i112 = i111 % 2;
        }
        Object[] objArr2 = new Object[i10];
        objArr2[0] = setmaxwidth;
        objArr2[1] = getbeeponfailure;
        ((Boolean) setMaxWidth.setX(objArr2, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
        Long l7 = (Long) component12.setX(new Object[]{component12Var2}, -1804967839, 1804967844, System.identityHashCode(component12Var2));
        if (l7 != null) {
            int i20 = f57068g + 43;
            f57067f = i20 % 128;
            int i21 = i20 % 2;
            long jLongValue3 = l7.longValue();
            TransactionFailed transactionFailed6 = (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis());
            String str3 = (String) TransactionFailed.setX(new Object[]{transactionFailed6}, 1914607362, -1914607356, System.identityHashCode(transactionFailed6));
            String strValueOf3 = String.valueOf(jLongValue3);
            TransactionFailed transactionFailed7 = (TransactionFailed) setAnimation.setY(new Object[0], -1343436064, 1343436342, (int) System.currentTimeMillis());
            int onFocusChangeListener3 = ((setFindListener) TransactionFailed.setX(new Object[]{transactionFailed7}, -570885530, 570885532, System.identityHashCode(transactionFailed7))).setOnFocusChangeListener();
            ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str3, (byte[]) setInputExtras.setDividerPadding(new Object[]{strValueOf3, Integer.valueOf(onFocusChangeListener3)}, -689525923, 689525942, onFocusChangeListener3), null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
            int i22 = f57067f;
            int i23 = ((i22 & 118) + (i22 | 118)) - 1;
            f57068g = i23 % 128;
            int i24 = i23 % 2;
        }
        setProgressDrawableTiled setprogressdrawabletiled = (setProgressDrawableTiled) component12.setX(new Object[]{component12Var2}, 972931950, -972931947, System.identityHashCode(component12Var2));
        if (setprogressdrawabletiled != null) {
            System.identityHashCode(mbVar);
            System.identityHashCode(mbVar);
            if (setY.setOnFocusChangeListener[((component14) setProgressDrawableTiled.setY(new Object[]{setprogressdrawabletiled}, 953160250, -953160249, System.identityHashCode(setprogressdrawabletiled))).ordinal()] == 1) {
                int i25 = f57067f;
                int i26 = i25 & 11;
                int i27 = -(-((i25 ^ 11) | i26));
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                f57068g = i28 % 128;
                if (i28 % 2 == 0) {
                    TransactionFailed persistentDrawingCache = setAnimation.setPersistentDrawingCache();
                    x11 = setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{persistentDrawingCache}, 1914607362, -1914607356, System.identityHashCode(persistentDrawingCache)), new byte[0], null, Boolean.TRUE, 107}, -976227287, 976227290, 107)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth));
                } else {
                    TransactionFailed persistentDrawingCache2 = setAnimation.setPersistentDrawingCache();
                    x11 = setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{persistentDrawingCache2}, 1914607362, -1914607356, System.identityHashCode(persistentDrawingCache2)), new byte[0], null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth));
                }
                ((Boolean) x11).booleanValue();
            } else {
                TransactionFailed persistentDrawingCache3 = setAnimation.setPersistentDrawingCache();
                String str4 = (String) TransactionFailed.setX(new Object[]{persistentDrawingCache3}, 1914607362, -1914607356, System.identityHashCode(persistentDrawingCache3));
                String strValueOf4 = String.valueOf(((component14) setProgressDrawableTiled.setY(new Object[]{setprogressdrawabletiled}, 953160250, -953160249, System.identityHashCode(setprogressdrawabletiled))).setOnFocusChangeListener());
                TransactionFailed persistentDrawingCache4 = setAnimation.setPersistentDrawingCache();
                int onFocusChangeListener4 = ((setFindListener) TransactionFailed.setX(new Object[]{persistentDrawingCache4}, -570885530, 570885532, System.identityHashCode(persistentDrawingCache4))).setOnFocusChangeListener();
                ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str4, (byte[]) setInputExtras.setDividerPadding(new Object[]{strValueOf4, Integer.valueOf(onFocusChangeListener4)}, -689525923, 689525942, onFocusChangeListener4), null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                int i29 = f57067f;
                int i30 = i29 & 43;
                int i31 = (i29 ^ 43) | i30;
                int i32 = (i30 & i31) + (i31 | i30);
                f57068g = i32 % 128;
                int i33 = i32 % 2;
            }
            byte bByteValue = ((Byte) setProgressDrawableTiled.setY(new Object[]{setprogressdrawabletiled}, 1453588839, -1453588839, System.identityHashCode(setprogressdrawabletiled))).byteValue();
            if (bByteValue == getInstallationPublicKey.UNSPECIFIED.setCompoundDrawableTintBlendMode()) {
                int i34 = f57067f;
                int i35 = (i34 & 27) + (i34 | 27);
                f57068g = i35 % 128;
                int i36 = i35 % 2;
                TransactionFailed transactionFailed8 = (TransactionFailed) setAnimation.setY(new Object[0], -849873306, 849873398, (int) System.currentTimeMillis());
                ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed8}, 1914607362, -1914607356, System.identityHashCode(transactionFailed8)), new byte[0], null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
                int i37 = f57067f + 1;
                f57068g = i37 % 128;
                int i38 = i37 % 2;
            } else if (bByteValue != getInstallationPublicKey.MISSING.setCompoundDrawableTintBlendMode()) {
                int i39 = f57067f;
                int i40 = (i39 & 5) + (i39 | 5);
                f57068g = i40 % 128;
                if (i40 % 2 == 0) {
                    TransactionFailed transactionFailed9 = (TransactionFailed) setAnimation.setY(new Object[0], -849873306, 849873398, (int) System.currentTimeMillis());
                    String str5 = (String) TransactionFailed.setX(new Object[]{transactionFailed9}, 1914607362, -1914607356, System.identityHashCode(transactionFailed9));
                    byte[] bArr = new byte[1];
                    bArr[1] = ((Byte) setProgressDrawableTiled.setY(new Object[]{setprogressdrawabletiled}, 1453588839, -1453588839, System.identityHashCode(setprogressdrawabletiled))).byteValue();
                    x10 = setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str5, bArr, null, Boolean.TRUE, 82}, -976227287, 976227290, 82)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth));
                } else {
                    TransactionFailed transactionFailed10 = (TransactionFailed) setAnimation.setY(new Object[0], -849873306, 849873398, (int) System.currentTimeMillis());
                    x10 = setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed10}, 1914607362, -1914607356, System.identityHashCode(transactionFailed10)), new byte[]{((Byte) setProgressDrawableTiled.setY(new Object[]{setprogressdrawabletiled}, 1453588839, -1453588839, System.identityHashCode(setprogressdrawabletiled))).byteValue()}, null, Boolean.FALSE, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth));
                }
                ((Boolean) x10).booleanValue();
            }
        }
        TransactionFailed transactionFailed11 = (TransactionFailed) setAnimation.setY(new Object[0], 249426741, -249426566, (int) System.currentTimeMillis());
        String str6 = (String) TransactionFailed.setX(new Object[]{transactionFailed11}, 1914607362, -1914607356, System.identityHashCode(transactionFailed11));
        copy copyVar = copy.INSTANCE;
        TransactionCompleted transactionCompleted = (TransactionCompleted) copy.setOnFocusChangeListener(new Object[]{(Date) component12.setX(new Object[]{component12Var2}, -1795922846, 1795922855, System.identityHashCode(component12Var2))}, -1349205615, 1349205621, (int) System.currentTimeMillis());
        byte[] bArr2 = (byte[]) TransactionCompleted.setX(new Object[]{transactionCompleted}, 2110114174, -2110114169, System.identityHashCode(transactionCompleted));
        Boolean bool = Boolean.FALSE;
        ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str6, bArr2, null, bool, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
        TransactionFailed transactionFailed12 = (TransactionFailed) setAnimation.setY(new Object[0], 1746945990, -1746945775, (int) System.currentTimeMillis());
        String str7 = (String) TransactionFailed.setX(new Object[]{transactionFailed12}, 1914607362, -1914607356, System.identityHashCode(transactionFailed12));
        setOnCreateContextMenuListener setoncreatecontextmenulistener = (setOnCreateContextMenuListener) copy.setOnFocusChangeListener(new Object[]{(Date) component12.setX(new Object[]{component12Var2}, -1795922846, 1795922855, System.identityHashCode(component12Var2))}, -1928661311, 1928661312, (int) System.currentTimeMillis());
        ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{str7, (byte[]) setOnCreateContextMenuListener.setOnFocusChangeListener(new Object[]{setoncreatecontextmenulistener}, -1661580950, 1661580950, System.identityHashCode(setoncreatecontextmenulistener)), null, bool, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
        TransactionFailed transactionFailed13 = (TransactionFailed) setAnimation.setY(new Object[0], -705722506, 705722524, (int) System.currentTimeMillis());
        ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed13}, 1914607362, -1914607356, System.identityHashCode(transactionFailed13)), new byte[]{mbVar.f57072d.setDividerPadding()}, null, bool, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
        if (((byte[]) component12.setX(new Object[]{component12Var2}, 305043302, -305043300, System.identityHashCode(component12Var2))) != null) {
            int i41 = f57068g;
            int i42 = i41 ^ 81;
            int i43 = (i41 & 81) << 1;
            int i44 = (i42 & i43) + (i43 | i42);
            f57067f = i44 % 128;
            int i45 = i44 % 2;
            TransactionFailed transactionFailed14 = (TransactionFailed) setAnimation.setY(new Object[0], 1481077281, -1481077011, (int) System.currentTimeMillis());
            ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed14}, 1914607362, -1914607356, System.identityHashCode(transactionFailed14)), (byte[]) component12.setX(new Object[]{component12Var2}, 305043302, -305043300, System.identityHashCode(component12Var2)), Terminal.OTHER, bool, 24}, -976227287, 976227290, 24)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
            int i46 = f57068g;
            int i47 = (i46 & (-72)) | ((~i46) & 71);
            int i48 = (i46 & 71) << 1;
            int i49 = (i47 & i48) + (i48 | i47);
            f57067f = i49 % 128;
            int i50 = i49 % 2;
        }
        if (((byte[]) component12.setX(new Object[]{component12Var2}, 940527128, -940527124, System.identityHashCode(component12Var2))) != null) {
            int iIdentityHashCode = System.identityHashCode(mbVar);
            int i51 = ~iIdentityHashCode;
            int i52 = ~((792955072 ^ i51) | (792955072 & i51));
            int i53 = (i52 ^ (-1868279769)) | (i52 & (-1868279769));
            int i54 = i51 & (i51 | iIdentityHashCode);
            int i55 = (i54 & (-1851371353)) | (1851371352 & (~i54));
            int i56 = i54 & 1851371352;
            int i57 = (i55 ^ i56) | (i56 & i55);
            int i58 = ~i57;
            int i59 = (i57 | i58) & i58;
            int i60 = ((~i59) & i53) | ((~i53) & i59);
            int i61 = i59 & i53;
            int i62 = -(-(((i61 & i60) | (i60 ^ i61)) * (-397)));
            int i63 = (-767154222) ^ i62;
            int i64 = ((((i62 & (-767154222)) | i63) << 1) - (~(-i63))) - 1;
            int i65 = i64 & (-1322273915);
            int i66 = ((i64 | (-1322273915)) & (~i65)) + (i65 << 1);
            int i67 = iIdentityHashCode ^ (-1868279769);
            int i68 = iIdentityHashCode & (-1868279769);
            int i69 = (i68 & i67) | (i67 ^ i68);
            int i70 = ((-776046657) & i69) | ((~i69) & 776046656);
            int i71 = i69 & 776046656;
            int i72 = (i66 - (~(-(-(((i71 & i70) | (i70 ^ i71)) * 397))))) - 1;
            int iIdentityHashCode2 = System.identityHashCode(mbVar);
            int i73 = ~iIdentityHashCode2;
            int i74 = 853583513 & i73;
            int i75 = (~i74) & (853583513 | i73);
            int i76 = ((~((-1318825531) | iIdentityHashCode2)) | (~((i75 ^ i74) | (i74 & i75)))) * 333;
            int i77 = ((1815789579 & i76) - (~(i76 | 1815789579))) - 1;
            int i78 = ~((853583513 ^ iIdentityHashCode2) | (853583513 & iIdentityHashCode2));
            int i79 = (iIdentityHashCode2 | i73) & i73;
            int i80 = i79 & (-1318825531);
            int i81 = ((i79 | (-1318825531)) & (~i80)) | i80;
            int i82 = ~i81;
            int i83 = (i81 | i82) & i82;
            int i84 = -(~(-(-(((i83 & i78) | (i78 ^ i83)) * 333))));
            if (i72 > ((i77 ^ i84) + ((i77 & i84) << 1)) - 1) {
                TransactionFailed transactionFailed15 = (TransactionFailed) setAnimation.setY(new Object[0], -889535337, 889535345, (int) System.currentTimeMillis());
                x7 = setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed15}, 1914607362, -1914607356, System.identityHashCode(transactionFailed15)), (byte[]) component12.setX(new Object[]{component12Var2}, 940527128, -940527124, System.identityHashCode(component12Var2)), null, bool, 106}, -976227287, 976227290, 106)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth));
            } else {
                TransactionFailed transactionFailed16 = (TransactionFailed) setAnimation.setY(new Object[0], -889535337, 889535345, (int) System.currentTimeMillis());
                x7 = setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed16}, 1914607362, -1914607356, System.identityHashCode(transactionFailed16)), (byte[]) component12.setX(new Object[]{component12Var2}, 940527128, -940527124, System.identityHashCode(component12Var2)), null, bool, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth));
            }
            ((Boolean) x7).booleanValue();
            int i85 = f57068g;
            int i86 = ((i85 ^ 25) | (i85 & 25)) << 1;
            int i87 = -(((~i85) & 25) | (i85 & (-26)));
            int i88 = (i86 & i87) + (i87 | i86);
            f57067f = i88 % 128;
            int i89 = i88 % 2;
        }
        if (((byte[]) component12.setX(new Object[]{component12Var2}, -927483712, 927483724, System.identityHashCode(component12Var2))) != null) {
            int i90 = f57068g;
            int i91 = i90 & 81;
            int i92 = ((i90 | 81) & (~i91)) + (i91 << 1);
            f57067f = i92 % 128;
            if (i92 % 2 != 0) {
                TransactionFailed transactionFailed17 = (TransactionFailed) setAnimation.setY(new Object[0], -547346090, 547346114, (int) System.currentTimeMillis());
                x6 = setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed17}, 1914607362, -1914607356, System.identityHashCode(transactionFailed17)), (byte[]) component12.setX(new Object[]{component12Var2}, -927483712, 927483724, System.identityHashCode(component12Var2)), null, Boolean.TRUE, 12}, -976227287, 976227290, 12)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth));
            } else {
                TransactionFailed transactionFailed18 = (TransactionFailed) setAnimation.setY(new Object[0], -547346090, 547346114, (int) System.currentTimeMillis());
                x6 = setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed18}, 1914607362, -1914607356, System.identityHashCode(transactionFailed18)), (byte[]) component12.setX(new Object[]{component12Var2}, -927483712, 927483724, System.identityHashCode(component12Var2)), null, bool, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth));
            }
            ((Boolean) x6).booleanValue();
        }
        if (((byte[]) component12.setX(new Object[]{component12Var2}, 808531158, -808531150, System.identityHashCode(component12Var2))) != null) {
            int i93 = f57068g;
            int i94 = (((i93 & (-8)) | ((~i93) & 7)) - (~(-(-((i93 & 7) << 1))))) - 1;
            f57067f = i94 % 128;
            if (i94 % 2 != 0) {
                TransactionFailed transactionFailed19 = (TransactionFailed) setAnimation.setY(new Object[0], -1752917871, 1752918109, (int) System.currentTimeMillis());
                x4 = setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed19}, 1914607362, -1914607356, System.identityHashCode(transactionFailed19)), (byte[]) component12.setX(new Object[]{component12Var2}, 808531158, -808531150, System.identityHashCode(component12Var2)), null, Boolean.TRUE, 47}, -976227287, 976227290, 47)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth));
            } else {
                TransactionFailed transactionFailed20 = (TransactionFailed) setAnimation.setY(new Object[0], -1752917871, 1752918109, (int) System.currentTimeMillis());
                x4 = setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed20}, 1914607362, -1914607356, System.identityHashCode(transactionFailed20)), (byte[]) component12.setX(new Object[]{component12Var2}, 808531158, -808531150, System.identityHashCode(component12Var2)), null, bool, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth));
            }
            ((Boolean) x4).booleanValue();
        }
        if (((byte[]) component12.setX(new Object[]{component12Var2}, -1770896091, 1770896104, System.identityHashCode(component12Var2))) != null) {
            int i95 = f57067f;
            int i96 = (((i95 | 25) << 1) - (~(-(((~i95) & 25) | (i95 & (-26)))))) - 1;
            f57068g = i96 % 128;
            int i97 = i96 % 2;
            TransactionFailed transactionFailed21 = (TransactionFailed) setAnimation.setY(new Object[0], -200724044, 200724315, (int) System.currentTimeMillis());
            ((Boolean) setMaxWidth.setX(new Object[]{setmaxwidth, (getBeepOnFailure) getBeepOnFailure.setCompoundDrawableTintBlendMode.setDividerPadding(new Object[]{(String) TransactionFailed.setX(new Object[]{transactionFailed21}, 1914607362, -1914607356, System.identityHashCode(transactionFailed21)), (byte[]) component12.setX(new Object[]{component12Var2}, -1770896091, 1770896104, System.identityHashCode(component12Var2)), null, bool, 28}, -976227287, 976227290, 28)}, -1552965335, 1552965350, System.identityHashCode(setmaxwidth))).booleanValue();
            int i98 = f57067f + 81;
            f57068g = i98 % 128;
            i11 = 2;
            int i99 = i98 % 2;
        } else {
            i11 = 2;
        }
        int i100 = f57067f + 79;
        f57068g = i100 % 128;
        if (i100 % i11 != 0) {
            return setmaxwidth;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x05dc, code lost:
    
        if ((r3 % 2) == 0) goto L139;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setX(java.lang.Object[] r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.mb.setX(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @Override // com.mypinpad.tsdk.isolation.me
    @NotNull
    public final md setCompoundDrawableTintBlendMode() {
        return (md) setX(new Object[]{this}, -259100602, 259100610, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.me
    @NotNull
    public final setTextLocales setDividerPadding() {
        return (setTextLocales) setX(new Object[]{this}, 721438225, -721438216, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.me
    public final long setLayoutAnimation() {
        return ((Long) setX(new Object[]{this}, -937014502, 937014502, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.me
    @Nullable
    public final Byte setOnDragListener() {
        return (Byte) setX(new Object[]{this}, 1117581926, -1117581914, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.me
    @NotNull
    public final setMaxWidth setOnFocusChangeListener() {
        return (setMaxWidth) setX(new Object[]{this}, 651407796, -651407791, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.me
    @NotNull
    public final List<String> setOnLongClickListener() {
        return (List) setX(new Object[]{this}, 1839818456, -1839818450, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.me
    @Nullable
    public final Integer setY() {
        return (Integer) setX(new Object[]{this}, 1971499423, -1971499416, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, -1956564077, 1956564079, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.me
    public final boolean setX() {
        return ((Boolean) setX(new Object[]{this}, 1651601255, -1651601252, System.identityHashCode(this))).booleanValue();
    }
}
