package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class getWidth {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char[] f55992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f55993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f55994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f55995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f55996l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f55997n = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setColorFilter f55998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setProgressBackgroundTintBlendMode f55999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setImageLevel f56000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final setWindowInsetsAnimationCallback f56001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final setCollapseContentDescription f56002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final setMinWidth f56003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final setProgressTintBlendMode f56004g;

    static {
        b();
        f55996l = 0;
        m = 1;
        f55994j = 0;
        f55995k = 1;
        f55993i = (char) 53954;
        f55992h = new char[]{59192, 59179, 59195, 59186, 59189, 59171, 59198, 59183, 59188};
    }

    public getWidth(@NotNull Context context, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f55998a = setcolorfilter;
        initialise initialiseVar = new initialise();
        setTextSelectHandleLeft settextselecthandleleft = new setTextSelectHandleLeft(initialiseVar, context);
        AsiaPacificEndpoint asiaPacificEndpoint = new AsiaPacificEndpoint(setcolorfilter);
        setPaddingRelative setpaddingrelative = new setPaddingRelative(context);
        dispose disposeVar = new dispose(setcolorfilter);
        setMinimumWidth setminimumwidth = new setMinimumWidth(disposeVar, setpaddingrelative, null, 4, null);
        startTransactiondefault starttransactiondefault = new startTransactiondefault(disposeVar, setpaddingrelative);
        setSubtitle setsubtitle = new setSubtitle(settextselecthandleleft, new getApplicationFilteringSelectors(new setMultiChoiceModeListener(), asiaPacificEndpoint, setcolorfilter), setcolorfilter);
        setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode = new setProgressBackgroundTintBlendMode(new setScaleX(setsubtitle, setcolorfilter), settextselecthandleleft, context, setcolorfilter);
        this.f55999b = setprogressbackgroundtintblendmode;
        this.f56000c = new setImageLevel(initialiseVar);
        this.f56001d = new setWindowInsetsAnimationCallback(settextselecthandleleft);
        this.f56002e = new setCollapseContentDescription(setpaddingrelative, setprogressbackgroundtintblendmode, settextselecthandleleft, context, setcolorfilter);
        this.f56003f = new setMinWidth(setpaddingrelative, setminimumwidth, starttransactiondefault, setprogressbackgroundtintblendmode, setsubtitle, asiaPacificEndpoint, setcolorfilter);
        this.f56004g = new setProgressTintBlendMode(setprogressbackgroundtintblendmode);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 4
            int r8 = r8 + 99
            int r7 = r7 * 3
            int r7 = 1 - r7
            byte[] r0 = new byte[r7]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.getWidth.f55997n
            if (r2 != 0) goto L17
            r5 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            goto L32
        L17:
            r3 = r1
            r6 = r9
            r9 = r8
            r8 = r6
        L1b:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r0[r3] = r4
            if (r5 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2a:
            r3 = r2[r8]
            r6 = r10
            r10 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r6
        L32:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r10 + 1
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getWidth.a(int, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        f55997n = new byte[]{76, 17, -23, -60};
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = (((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058;
        if (i13 == 1) {
            ((getWidth) objArr[0]).c(new PinViewports(TerminalErrorCodesInvocation.INSTANCE));
            int i14 = f55995k + 101;
            f55994j = i14 % 128;
            int i15 = i14 % 2;
            return null;
        }
        if (i13 != 2) {
            getWidth getwidth = (getWidth) objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (setOnApplyWindowInsetsListener) getwidth.c(new PinViewports(new ProceedPinPadLaunchRequest(str, str2)));
            setItemsCanFocus setitemscanfocus = (setItemsCanFocus) ((setForeground) setOnApplyWindowInsetsListener.setDividerPadding(new Object[]{setonapplywindowinsetslistener}, -2053129835, 2053129835, System.identityHashCode(setonapplywindowinsetslistener)));
            int i16 = f55995k + 59;
            f55994j = i16 % 128;
            int i17 = i16 % 2;
            return setitemscanfocus;
        }
        getWidth getwidth2 = (getWidth) objArr[0];
        setContentView setcontentview = (setContentView) objArr[1];
        int i18 = f55994j + 73;
        f55995k = i18 % 128;
        if (i18 % 2 != 0) {
            Intrinsics.checkNotNullParameter(setcontentview, "");
            return (setEditableFactory) getwidth2.c(setcontentview);
        }
        Intrinsics.checkNotNullParameter(setcontentview, "");
        setEditableFactory seteditablefactory = (setEditableFactory) getwidth2.c(setcontentview);
        int i19 = 37 / 0;
        return seteditablefactory;
    }

    public final Endpoint c(setStateListAnimator setstatelistanimator) throws Throwable {
        Exception exc;
        int i10;
        char c10;
        int i11 = f55994j;
        int i12 = i11 + 17;
        int i13 = i12 % 128;
        f55995k = i13;
        int i14 = 2;
        int i15 = i12 % 2;
        int i16 = 1;
        try {
            if (setstatelistanimator instanceof getPinDigitTintColor) {
                int i17 = i11 + 25;
                f55995k = i17 % 128;
                int i18 = i17 % 2;
                setImageLevel setimagelevel = this.f56000c;
                if (i18 != 0) {
                    return (Endpoint) setImageLevel.setCompoundDrawableTintBlendMode(new Object[]{setimagelevel, setstatelistanimator}, -890222760, 890222760, System.identityHashCode(setimagelevel));
                }
                try {
                    throw null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (setstatelistanimator instanceof setCustomSelectionActionModeCallback) {
                setProgressTintBlendMode setprogresstintblendmode = this.f56004g;
                return (Endpoint) setProgressTintBlendMode.setDividerPadding(new Object[]{setprogresstintblendmode, setstatelistanimator}, 1718379916, -1718379916, System.identityHashCode(setprogresstintblendmode));
            }
            if (setstatelistanimator instanceof getDynamicButtonTextColor) {
                getDynamicButtonTextColor getdynamicbuttontextcolor = (getDynamicButtonTextColor) setstatelistanimator;
                return this.f55999b.setOnFocusChangeListener((getAmountFieldBgColor) getDynamicButtonTextColor.setX(new Object[]{getdynamicbuttontextcolor}, 1209620396, -1209620396, System.identityHashCode(getdynamicbuttontextcolor)));
            }
            if (setstatelistanimator instanceof PinViewports) {
                return this.f56003f.setX(setstatelistanimator);
            }
            if (setstatelistanimator instanceof setContentView) {
                return this.f56002e.setY(setstatelistanimator);
            }
            if (!(setstatelistanimator instanceof TransactionCancelReason)) {
                throw new NoWhenBranchMatchedException();
            }
            int i19 = i13 + 53;
            f55994j = i19 % 128;
            int i20 = i19 % 2;
            setWindowInsetsAnimationCallback setwindowinsetsanimationcallback = this.f56001d;
            return (Endpoint) setWindowInsetsAnimationCallback.setDividerPadding(new Object[]{setwindowinsetsanimationcallback, setstatelistanimator}, -1337034765, 1337034765, System.identityHashCode(setwindowinsetsanimationcallback));
        } catch (Exception e5) {
            e = e5;
            int deadChar = KeyEvent.getDeadChar(0, 0);
            int i21 = 9 - deadChar;
            char c11 = (byte) (107 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
            int i22 = m + 3;
            f55996l = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 23 / 0;
            }
            char[] charArray = "\b\u0003\u0003\u0000\u0004\u0001\u0005\u0006㙞".toCharArray();
            setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
            char[] cArr = f55992h;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i24 = 0;
                while (i24 < length) {
                    int i25 = f55996l + 49;
                    m = i25 % 128;
                    int i26 = i25 % i14;
                    try {
                        Object[] objArr = new Object[i16];
                        objArr[0] = Integer.valueOf(cArr[i24]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(290255894);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 45 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1115 - TextUtils.lastIndexOf("", '0', 0));
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            Object[] objArr2 = new Object[1];
                            a(b10, b11, b11, objArr2);
                            method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                            map.put(290255894, method);
                        }
                        cArr2[i24] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                        i24++;
                        length = length;
                        cArr = cArr;
                        e = e;
                        i16 = 1;
                        i14 = 2;
                    } catch (Throwable th3) {
                        Throwable cause = th3.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th3;
                    }
                }
                exc = e;
                cArr = cArr2;
            } else {
                exc = e;
            }
            Object[] objArr3 = {Integer.valueOf(f55993i)};
            Map map2 = setTextScaleX.setMaxEms;
            Object method2 = map2.get(290255894);
            if (method2 == null) {
                Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getEdgeSlop() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 44, AndroidCharacter.getMirror('0') + 1068);
                byte b12 = (byte) 0;
                byte b13 = b12;
                Object[] objArr4 = new Object[1];
                a(b12, b13, b13, objArr4);
                method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                map2.put(290255894, method2);
            }
            char cCharValue = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i21];
            char c12 = '\b';
            if (i21 % 2 != 0) {
                i10 = 8 - deadChar;
                cArr3[i10] = (char) (charArray[i10] - c11);
            } else {
                i10 = i21;
            }
            if (i10 > 1) {
                int i27 = f55996l + 91;
                m = i27 % 128;
                int i28 = i27 % 2;
                setincludefontpadding.setDividerPadding = 0;
                while (true) {
                    int i29 = setincludefontpadding.setDividerPadding;
                    if (i29 >= i10) {
                        break;
                    }
                    char c13 = charArray[i29];
                    setincludefontpadding.setY = c13;
                    int i30 = i29 + 1;
                    char c14 = charArray[i30];
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c14;
                    if (c13 == c14) {
                        int i31 = f55996l + 25;
                        m = i31 % 128;
                        int i32 = i31 % 2;
                        cArr3[i29] = (char) (c13 - c11);
                        cArr3[i30] = (char) (c14 - c11);
                        i10 = i10;
                        c10 = c12;
                    } else {
                        Object[] objArr5 = new Object[13];
                        objArr5[12] = setincludefontpadding;
                        objArr5[11] = Integer.valueOf(cCharValue);
                        objArr5[10] = setincludefontpadding;
                        objArr5[9] = setincludefontpadding;
                        objArr5[c12] = Integer.valueOf(cCharValue);
                        objArr5[7] = setincludefontpadding;
                        objArr5[6] = setincludefontpadding;
                        objArr5[5] = Integer.valueOf(cCharValue);
                        objArr5[4] = setincludefontpadding;
                        objArr5[3] = setincludefontpadding;
                        objArr5[2] = Integer.valueOf(cCharValue);
                        objArr5[1] = setincludefontpadding;
                        objArr5[0] = setincludefontpadding;
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method3 = map3.get(180437302);
                        if (method3 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(0, 0), 26 - Process.getGidForName(""), TextUtils.getOffsetBefore("", 0) + 2311);
                            byte b14 = (byte) 0;
                            byte b15 = (byte) (b14 + 3);
                            Object[] objArr6 = new Object[1];
                            a(b14, b15, (byte) (b15 - 3), objArr6);
                            String str = (String) objArr6[0];
                            Class<?> cls4 = Integer.TYPE;
                            method3 = cls3.getMethod(str, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                            map3.put(180437302, method3);
                        }
                        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                        int i33 = setincludefontpadding.setNavigationOnClickListener;
                        if (iIntValue == i33) {
                            Object[] objArr7 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                            Object method4 = map3.get(1989802713);
                            if (method4 != null) {
                                c10 = '\b';
                            } else {
                                Class cls5 = (Class) setTextScaleX.setX((char) (49103 - ExpandableListView.getPackedPositionType(0L)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35, 2545 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)));
                                byte b16 = (byte) 0;
                                Object[] objArr8 = new Object[1];
                                a(b16, (byte) (b16 | 7), b16, objArr8);
                                String str2 = (String) objArr8[0];
                                Class<?> cls6 = Integer.TYPE;
                                c10 = '\b';
                                method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                                map3.put(1989802713, method4);
                            }
                            int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                            int i34 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                            int i35 = setincludefontpadding.setDividerPadding;
                            cArr3[i35] = cArr[iIntValue2];
                            cArr3[i35 + 1] = cArr[i34];
                            int i36 = f55996l + 85;
                            m = i36 % 128;
                            int i37 = i36 % 2;
                        } else {
                            c10 = '\b';
                            int i38 = setincludefontpadding.setX;
                            int i39 = setincludefontpadding.setOnFocusChangeListener;
                            if (i38 == i39) {
                                int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                                setincludefontpadding.setOnLongClickListener = iA;
                                int iA2 = a.a(i33, cCharValue, 1, cCharValue);
                                setincludefontpadding.setNavigationOnClickListener = iA2;
                                int i40 = (i39 * cCharValue) + iA2;
                                int i41 = setincludefontpadding.setDividerPadding;
                                cArr3[i41] = cArr[(i38 * cCharValue) + iA];
                                cArr3[i41 + 1] = cArr[i40];
                            } else {
                                int i42 = (i38 * cCharValue) + i33;
                                int i43 = (i39 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                                int i44 = setincludefontpadding.setDividerPadding;
                                cArr3[i44] = cArr[i42];
                                cArr3[i44 + 1] = cArr[i43];
                            }
                        }
                    }
                    setincludefontpadding.setDividerPadding += 2;
                    c12 = c10;
                    i10 = i10;
                }
            }
            for (int i45 = 0; i45 < i21; i45++) {
                cArr3[i45] = (char) (cArr3[i45] ^ 13722);
            }
            String str3 = new String(cArr3);
            int i46 = m + 23;
            f55996l = i46 % 128;
            int i47 = i46 % 2;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{str3.intern()}, -821746216, 821746227, (int) System.currentTimeMillis());
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{this.f55998a, 41, null, exc, 2}, 1173867142, -1173867141, 41);
            throw new setLogger(exc);
        }
    }

    @NotNull
    public final setKeyboardNavigationCluster setDividerPadding(int i10) {
        setKeyboardNavigationCluster setkeyboardnavigationcluster = (setKeyboardNavigationCluster) c(new TransactionCancelReason(i10));
        int i11 = f55994j + 11;
        f55995k = i11 % 128;
        int i12 = i11 % 2;
        return setkeyboardnavigationcluster;
    }

    @NotNull
    public final setMarqueeRepeatLimit setOnFocusChangeListener(@NotNull getDynamicButtonTextColor getdynamicbuttontextcolor) {
        int i10 = f55995k + 59;
        f55994j = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(getdynamicbuttontextcolor, "");
            return (setMarqueeRepeatLimit) c(getdynamicbuttontextcolor);
        }
        Intrinsics.checkNotNullParameter(getdynamicbuttontextcolor, "");
        int i11 = 27 / 0;
        return (setMarqueeRepeatLimit) c(getdynamicbuttontextcolor);
    }

    @NotNull
    public final setHorizontallyScrolling setX() {
        setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (setOnApplyWindowInsetsListener) c(new PinViewports(getHOSTAPP_ERROR_ON_AUTH_REQUESTannotations.INSTANCE));
        setHorizontallyScrolling sethorizontallyscrolling = (setHorizontallyScrolling) ((setForeground) setOnApplyWindowInsetsListener.setDividerPadding(new Object[]{setonapplywindowinsetslistener}, -2053129835, 2053129835, System.identityHashCode(setonapplywindowinsetslistener)));
        int i10 = f55994j + 19;
        f55995k = i10 % 128;
        if (i10 % 2 != 0) {
            return sethorizontallyscrolling;
        }
        throw null;
    }

    public final void setY() throws Throwable {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -979666599, 979666600, System.identityHashCode(this));
    }

    @NotNull
    public final setTag setDividerPadding() {
        setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (setOnApplyWindowInsetsListener) c(new PinViewports(setOnContextClickListener.INSTANCE));
        setTag settag = (setTag) ((setForeground) setOnApplyWindowInsetsListener.setDividerPadding(new Object[]{setonapplywindowinsetslistener}, -2053129835, 2053129835, System.identityHashCode(setonapplywindowinsetslistener)));
        int i10 = f55995k + 93;
        f55994j = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 57 / 0;
        }
        return settag;
    }

    @NotNull
    public final setEditableFactory setY(@NotNull setContentView setcontentview) {
        return (setEditableFactory) setCompoundDrawableTintBlendMode(new Object[]{this, setcontentview}, -1193195770, 1193195772, System.identityHashCode(this));
    }

    @NotNull
    public final getPinPadPortrait setDividerPadding(@NotNull setInterpolator setinterpolator) {
        Intrinsics.checkNotNullParameter(setinterpolator, "");
        setVerticalFadingEdgeEnabled setverticalfadingedgeenabled = (setVerticalFadingEdgeEnabled) c(new setCustomSelectionActionModeCallback(setinterpolator));
        getPinPadPortrait getpinpadportrait = (getPinPadPortrait) setVerticalFadingEdgeEnabled.setDividerPadding(new Object[]{setverticalfadingedgeenabled}, -1284781652, 1284781652, System.identityHashCode(setverticalfadingedgeenabled));
        int i10 = f55994j + 45;
        f55995k = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 55 / 0;
        }
        return getpinpadportrait;
    }

    @NotNull
    public final setAutoSizeTextTypeWithDefaults setOnFocusChangeListener(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, boolean z10) {
        Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
        setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (setOnApplyWindowInsetsListener) c(new PinViewports(new getCancelButtonText(setverticalscrollbarposition, z10)));
        setAutoSizeTextTypeWithDefaults setautosizetexttypewithdefaults = (setAutoSizeTextTypeWithDefaults) ((setForeground) setOnApplyWindowInsetsListener.setDividerPadding(new Object[]{setonapplywindowinsetslistener}, -2053129835, 2053129835, System.identityHashCode(setonapplywindowinsetslistener)));
        int i10 = f55995k + 5;
        f55994j = i10 % 128;
        int i11 = i10 % 2;
        return setautosizetexttypewithdefaults;
    }

    @NotNull
    public final setTopEdgeEffectColor setOnFocusChangeListener() {
        setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (setOnApplyWindowInsetsListener) c(new PinViewports(registerForContextMenu.INSTANCE));
        setTopEdgeEffectColor settopedgeeffectcolor = (setTopEdgeEffectColor) ((setForeground) setOnApplyWindowInsetsListener.setDividerPadding(new Object[]{setonapplywindowinsetslistener}, -2053129835, 2053129835, System.identityHashCode(setonapplywindowinsetslistener)));
        int i10 = f55994j + 1;
        f55995k = i10 % 128;
        int i11 = i10 % 2;
        return settopedgeeffectcolor;
    }

    @NotNull
    public final setProgressBackgroundTintList setOnFocusChangeListener(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (setOnApplyWindowInsetsListener) c(new PinViewports(new getDescription(bArr)));
        setProgressBackgroundTintList setprogressbackgroundtintlist = (setProgressBackgroundTintList) ((setForeground) setOnApplyWindowInsetsListener.setDividerPadding(new Object[]{setonapplywindowinsetslistener}, -2053129835, 2053129835, System.identityHashCode(setonapplywindowinsetslistener)));
        int i10 = f55995k + 31;
        f55994j = i10 % 128;
        int i11 = i10 % 2;
        return setprogressbackgroundtintlist;
    }

    @NotNull
    public final setItemsCanFocus setOnFocusChangeListener(@NotNull String str, @NotNull String str2) {
        return (setItemsCanFocus) setCompoundDrawableTintBlendMode(new Object[]{this, str, str2}, 813737319, -813737319, System.identityHashCode(this));
    }

    @NotNull
    public final getProgressBarColor setCompoundDrawableTintBlendMode(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        getProgressBarColor getprogressbarcolor = (getProgressBarColor) c(new getPinDigitTintColor(bArr, bArr2));
        int i10 = f55995k + 27;
        f55994j = i10 % 128;
        if (i10 % 2 == 0) {
            return getprogressbarcolor;
        }
        throw null;
    }

    @NotNull
    public final getDecimalSeparator setCompoundDrawableTintBlendMode() {
        setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (setOnApplyWindowInsetsListener) c(new PinViewports(setBackgroundColor.INSTANCE));
        getDecimalSeparator getdecimalseparator = (getDecimalSeparator) ((setForeground) setOnApplyWindowInsetsListener.setDividerPadding(new Object[]{setonapplywindowinsetslistener}, -2053129835, 2053129835, System.identityHashCode(setonapplywindowinsetslistener)));
        int i10 = f55994j + 39;
        f55995k = i10 % 128;
        if (i10 % 2 != 0) {
            return getdecimalseparator;
        }
        throw null;
    }

    @NotNull
    public final setVerticalScrollbarThumbDrawable setCompoundDrawableTintBlendMode(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        setOnApplyWindowInsetsListener setonapplywindowinsetslistener = (setOnApplyWindowInsetsListener) c(new PinViewports(new setIgnoreGravity(bArr)));
        setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable = (setVerticalScrollbarThumbDrawable) ((setForeground) setOnApplyWindowInsetsListener.setDividerPadding(new Object[]{setonapplywindowinsetslistener}, -2053129835, 2053129835, System.identityHashCode(setonapplywindowinsetslistener)));
        int i10 = f55994j + 55;
        f55995k = i10 % 128;
        int i11 = i10 % 2;
        return setverticalscrollbarthumbdrawable;
    }
}
