package com.mypinpad.tsdk.isolation;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.ConnectivityManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setTransformationMethod {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f60754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f60755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f60758h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setColorFilter f60759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f60760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Context f60761c;

    public /* synthetic */ class setX {
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[getTransactionPortrait.values().length];
            iArr[getTransactionPortrait.setCompoundDrawableTintBlendMode.ordinal()] = 1;
            iArr[getTransactionPortrait.setOnFocusChangeListener.ordinal()] = 2;
            iArr[getTransactionPortrait.setIncludeFontPadding.ordinal()] = 3;
            iArr[getTransactionPortrait.setY.ordinal()] = 4;
            iArr[getTransactionPortrait.setDividerPadding.ordinal()] = 5;
            iArr[getTransactionPortrait.setOnLongClickListener.ordinal()] = 6;
            iArr[getTransactionPortrait.setNavigationOnClickListener.ordinal()] = 7;
            iArr[getTransactionPortrait.setLayoutAnimation.ordinal()] = 8;
            iArr[getTransactionPortrait.setOnDragListener.ordinal()] = 9;
            iArr[getTransactionPortrait.getNavBarTitleString.ordinal()] = 10;
            iArr[getTransactionPortrait.setTextAlignment.ordinal()] = 11;
            iArr[getTransactionPortrait.setZ.ordinal()] = 12;
            iArr[getTransactionPortrait.setAlwaysDrawnWithCacheEnabled.ordinal()] = 13;
            iArr[getTransactionPortrait.UiMessageCallbackKtWhenMappings.ordinal()] = 14;
            iArr[getTransactionPortrait.getAmountFieldTextColor.ordinal()] = 15;
            setY = iArr;
            int i10 = ((-1) << 1) - ((-1) ^ 96);
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }
    }

    static {
        c();
        f60756f = 0;
        f60757g = 1;
        f60755e = (char) 53956;
        f60754d = new char[]{59181, 59254, 59194, 59253, 59199, 59183, 59198, 59184, 59193, 59158, 59182, 59196, 59188, 59189, 59180, 59170, 59185, 59179, 59192, 59177, 59160, 59176, 59259, 59191, 59186};
    }

    public setTransformationMethod(@NotNull setColorFilter setcolorfilter, int i10, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.f60759a = setcolorfilter;
        this.f60760b = 28;
        this.f60761c = context;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int length;
        char[] cArr;
        int i12;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr2 = f60754d;
        int i13 = 2;
        int i14 = 290255894;
        int i15 = 0;
        if (cArr2 != null) {
            int i16 = f60757g + 31;
            f60756f = i16 % 128;
            if (i16 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i12 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i12 = 0;
            }
            while (i12 < length) {
                int i17 = f60756f + 59;
                f60757g = i17 % 128;
                int i18 = i17 % i13;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i15] = Integer.valueOf(cArr2[i12]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i14));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), 44 - MotionEvent.axisFromString(""), 1115 - ImageFormat.getBitsPerPixel(i15));
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr[i12] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i12++;
                    i13 = 2;
                    i14 = 290255894;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        Object[] objArr4 = {Integer.valueOf(f60755e)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), View.MeasureSpec.makeMeasureSpec(0, 0) + 45, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1117);
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            b(b13, b14, b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i19 = f60756f + 73;
            f60757g = i19 % 128;
            if (i19 % 2 == 0) {
                i11 = i10 + 127;
                cArr3[i11] = (char) (charArray[i11] << b10);
            } else {
                i11 = i10 - 1;
                cArr3[i11] = (char) (charArray[i11] - b10);
            }
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i20 = setincludefontpadding.setDividerPadding;
                if (i20 >= i11) {
                    break;
                }
                char c10 = charArray[i20];
                setincludefontpadding.setY = c10;
                int i21 = i20 + 1;
                char c11 = charArray[i21];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    int i22 = f60757g + 47;
                    f60756f = i22 % 128;
                    if (i22 % 2 != 0) {
                        cArr3[i20] = (char) (c10 >>> b10);
                        cArr3[i20] = (char) (c11 % b10);
                    } else {
                        cArr3[i20] = (char) (c10 - b10);
                        cArr3[i21] = (char) (c11 - b10);
                    }
                } else {
                    Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ('0' - AndroidCharacter.getMirror('0')), 26 - TextUtils.lastIndexOf("", '0', 0), View.getDefaultSize(0, 0) + 2311);
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 3);
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, (byte) (b16 - 3), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i23 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i23) {
                        int i24 = f60756f + 81;
                        f60757g = i24 % 128;
                        int i25 = i24 % 2;
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49103 - TextUtils.getOffsetAfter("", 0)), (KeyEvent.getMaxKeyCode() >> 16) + 35, TextUtils.getOffsetAfter("", 0) + 2545);
                            byte b17 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            b(b17, (byte) (b17 | 7), b17, objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i26 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i27 = setincludefontpadding.setDividerPadding;
                        cArr3[i27] = cArr2[iIntValue2];
                        cArr3[i27 + 1] = cArr2[i26];
                    } else {
                        int i28 = setincludefontpadding.setX;
                        int i29 = setincludefontpadding.setOnFocusChangeListener;
                        if (i28 == i29) {
                            int i30 = f60757g + 97;
                            f60756f = i30 % 128;
                            int i31 = i30 % 2;
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i23, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i32 = (i29 * cCharValue) + iA2;
                            int i33 = setincludefontpadding.setDividerPadding;
                            cArr3[i33] = cArr2[(i28 * cCharValue) + iA];
                            cArr3[i33 + 1] = cArr2[i32];
                        } else {
                            int i34 = (i28 * cCharValue) + i23;
                            int i35 = (i29 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i36 = setincludefontpadding.setDividerPadding;
                            cArr3[i36] = cArr2[i34];
                            cArr3[i36 + 1] = cArr2[i35];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
            }
        }
        for (int i37 = 0; i37 < i10; i37++) {
            cArr3[i37] = (char) (cArr3[i37] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r7 = r7 + 99
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.setTransformationMethod.f60758h
            r2 = 0
            if (r1 != 0) goto L18
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L33:
            int r6 = r6 + r8
            int r8 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setTransformationMethod.b(int, short, int, java.lang.Object[]):void");
    }

    public static void c() {
        f60758h = new byte[]{59, 2, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 31};
    }

    @NotNull
    public final setScrollCaptureCallback setOnFocusChangeListener(@NotNull getTransactionPortrait gettransactionportrait) throws Throwable {
        Intrinsics.checkNotNullParameter(gettransactionportrait, "");
        int i10 = setX.setY[gettransactionportrait.ordinal()];
        setColorFilter setcolorfilter = this.f60759a;
        Context context = this.f60761c;
        switch (i10) {
            case 1:
                ContentResolver contentResolver = context.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver, "");
                return new TransactionApproved(new deactivate(contentResolver));
            case 2:
                return new getDetails(new UiMessage(context, setcolorfilter));
            case 3:
                return new setTitle(context);
            case 4:
                return new setAlpha(new setHttpAuthUsernamePassword());
            case 5:
                setSecondaryProgressTintMode setsecondaryprogresstintmode = new setSecondaryProgressTintMode();
                getNumericCode getnumericcode = new getNumericCode(setcolorfilter);
                setSelected setselected = new setSelected();
                Object[] objArr = new Object[1];
                a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, "\u0011\r㙥㙥\b\u0010\t\u0014\u0004\u0014\n\u0014", (byte) (Color.blue(0) + 113), objArr);
                Object systemService = context.getSystemService(((String) objArr[0]).intern());
                if (systemService != null) {
                    return new TransactionNotAuthorised(setsecondaryprogresstintmode, getnumericcode, setselected, new setProgressDrawable((ConnectivityManager) systemService, setcolorfilter, new setOnGroupCollapseListener(setcolorfilter)));
                }
                Object[] objArr2 = new Object[1];
                a((ViewConfiguration.getPressedStateDuration() >> 16) + 68, "\u000e\u000b㘹㘹\u0017\u0011\u0003\f\u000e\r\u0007\u0014\t\u0007\u0017\u0011\u0001\u0016\u0007\u0014\u0007\n\u0017\f\r\u000e\u0003\u000b\r\u0014\u0018\u0017\n\u0014\u0010\u0007\u0002\u0007\u000e\u0003\u0011\u000e\u0004\t\b\u0012\u0007\u0006\u0000\u0017\r\u000e\u000b\b\u000f\b\u0014\u0004\u0014\t\u0013\u0005\u0003\f\u0001\f\t\u0010", (byte) (67 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr2);
                throw new NullPointerException(((String) objArr2[0]).intern());
            case 6:
                return new setStackTrace(new getDisplaySymbol(context));
            case 7:
                PackageManager packageManager = context.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "");
                return new setTranscriptMode(new setOnGroupClickListener(packageManager));
            case 8:
                return new setAccessibilityTraversalBefore(this.f60760b);
            case 9:
                return new setLineSpacing(context, null, 2, null);
            case 10:
                return new getTransactionLandscape();
            case 11:
                return new setImportantForContentCapture(context);
            case 12:
                return new getGeneralBgColor(context);
            case 13:
                return new setChoiceMode(context);
            case 14:
                return new getNavBarTextColor(context);
            case 15:
                return new setDuplicateParentStateEnabled(TransactionType.INSTANCE);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
