package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import com.mypinpad.tsdk.R;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mk.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setBottomEdgeEffectColor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char[] f59503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f59504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f59505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f59506l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f59507n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f59508o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f59509p = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f59510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setGravity f59511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Canvas f59512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final getProcessingResult f59513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final setFadingEdgeLength f59514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Paint f59515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Paint f59516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Paint f59517h;

    static {
        c();
        f59507n = 0;
        f59508o = 1;
        f59506l = 0;
        m = 1;
        f59504j = 947150630331236735L;
        f59503i = new char[]{41818, 9250, 44446, 13681, 48792, 1976, 36615, 4335, 38978, 24864, 60062, 29269, 64498, 17238, 50302, 19866, 54629, 24276, 10166, 44877, 12540, 47172, 406, 35519, 4627, 39921, 25367, 58411, 28053, 62831, 32450, 51177, 20256, 53390, 22626, 8664, 43768, 12816, 48105, 853, 33824, 3462, 38244, 7867, 58993, 28449, 61580, 30840, 49629, 19195, 53814, 23475};
        f59505k = -443080096;
    }

    public setBottomEdgeEffectColor(@NotNull Context context, @NotNull setGravity setgravity, @NotNull Canvas canvas, @NotNull getProcessingResult getprocessingresult, @Nullable setFadingEdgeLength setfadingedgelength) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(setgravity, "");
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(getprocessingresult, "");
        this.f59510a = context;
        this.f59511b = setgravity;
        this.f59512c = canvas;
        this.f59513d = getprocessingresult;
        this.f59514e = setfadingedgelength;
        Paint paint = new Paint();
        this.f59515f = paint;
        Paint paint2 = new Paint();
        this.f59516g = paint2;
        Paint paint3 = new Paint();
        this.f59517h = paint3;
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setAntiAlias(true);
        paint.setColor(setgravity.setCompoundDrawableTintBlendMode());
        paint.setAlpha(Color.alpha(setgravity.setCompoundDrawableTintBlendMode()));
        paint3.setColor(setgravity.setY());
        paint3.setAlpha(Color.alpha(setgravity.setY()));
    }

    public static void a(int i10, int i11, int i12, Object[] objArr) throws Throwable {
        char c10;
        char[] charArray = "\u0005\u0011\t\u000f�\n\u000f\uffc9\u000f\u0001\u000e\u0005\u0002\uffc9\t\u0001\u0000".toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        int i13 = 0;
        getnavbartitlestring.setY = 0;
        while (true) {
            int i14 = getnavbartitlestring.setY;
            if (i14 >= i10) {
                break;
            }
            int i15 = f59507n + 21;
            f59508o = i15 % 128;
            int i16 = i15 % 2;
            char c11 = charArray[i14];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c11;
            char c12 = (char) (i11 + c11);
            cArr[i14] = c12;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(f59505k);
                objArr2[i13] = Integer.valueOf(c12);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) Color.alpha(i13), 40 - TextUtils.indexOf((CharSequence) "", '0', i13, i13), 482 - TextUtils.lastIndexOf("", '0', i13));
                    byte b10 = (byte) i13;
                    Object[] objArr3 = new Object[1];
                    b((byte) (-1), b10, (byte) (b10 | 6), objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55967 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 43 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2268);
                    byte b11 = (byte) 0;
                    Object[] objArr5 = new Object[1];
                    b((byte) (-1), b11, (byte) (b11 | 7), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i13 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        if (i12 > 0) {
            int i17 = f59507n + 11;
            f59508o = i17 % 128;
            int i18 = i17 % 2;
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            c10 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i19 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i19, i19);
            int i20 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i20, cArr, 0, i10 - i20);
        } else {
            c10 = 0;
        }
        objArr[c10] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 4
            int r9 = 72 - r9
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = new byte[r8]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.setBottomEdgeEffectColor.f59509p
            if (r2 != 0) goto L16
            r9 = r7
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r8
            goto L35
        L16:
            r3 = r1
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1b:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r5
            if (r4 != r9) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2c:
            r3 = r2[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L35:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setBottomEdgeEffectColor.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f59509p = new byte[]{125, -24, -123, 69};
    }

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Rect rectE_;
        k j3Var;
        k i9Var;
        String str;
        float fCenterX;
        float fCenterY;
        float fFloatValue;
        if ((((~(i10 | (~i12))) | (~i11)) * 305) + (((~(i10 | i11)) | (~(i10 | i12))) * 305) + (i11 * 306) + (i10 * 306) + TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS != 1) {
            setBottomEdgeEffectColor setbottomedgeeffectcolor = (setBottomEdgeEffectColor) objArr[0];
            k kVar = (k) objArr[1];
            int i13 = f59506l + 81;
            m = i13 % 128;
            if (i13 % 2 != 0) {
                Paint paint = setbottomedgeeffectcolor.f59516g;
                paint.setTypeface((Typeface) k.a(new Object[]{kVar}, 1388193849, -1388193848, System.identityHashCode(kVar)));
                paint.setColor(setbottomedgeeffectcolor.f59511b.setDividerPadding());
                paint.setTextSize(((Float) k.a(new Object[]{kVar}, -1808853454, 1808853456, System.identityHashCode(kVar))).floatValue());
                return null;
            }
            Paint paint2 = setbottomedgeeffectcolor.f59516g;
            paint2.setTypeface((Typeface) k.a(new Object[]{kVar}, 1388193849, -1388193848, System.identityHashCode(kVar)));
            paint2.setColor(setbottomedgeeffectcolor.f59511b.setDividerPadding());
            paint2.setTextSize(((Float) k.a(new Object[]{kVar}, -1808853454, 1808853456, System.identityHashCode(kVar))).floatValue());
            throw null;
        }
        setBottomEdgeEffectColor setbottomedgeeffectcolor2 = (setBottomEdgeEffectColor) objArr[0];
        getMetadata getmetadata = (getMetadata) objArr[1];
        setContentInsetsRelative setcontentinsetsrelative = getmetadata instanceof setContentInsetsRelative ? (setContentInsetsRelative) getmetadata : null;
        if (setcontentinsetsrelative == null || !((Boolean) setContentInsetsRelative.setOnFocusChangeListener(new Object[]{setcontentinsetsrelative}, -142823274, 142823274, System.identityHashCode(setcontentinsetsrelative))).booleanValue()) {
            getProcessingResult getprocessingresult = setbottomedgeeffectcolor2.f59513d;
            mv mvVar = (mv) getMetadata.setDividerPadding(new Object[]{getmetadata}, -815815505, 815815505, System.identityHashCode(getmetadata));
            int iIntValue = ((Integer) mv.setDividerPadding(new Object[]{mvVar}, 509932451, -509932450, System.identityHashCode(mvVar))).intValue();
            mv mvVar2 = (mv) getMetadata.setDividerPadding(new Object[]{getmetadata}, -815815505, 815815505, System.identityHashCode(getmetadata));
            rectE_ = getprocessingresult.E_(iIntValue, ((Integer) mv.setDividerPadding(new Object[]{mvVar2}, 94375366, -94375366, System.identityHashCode(mvVar2))).intValue());
        } else {
            getProcessingResult getprocessingresult2 = setbottomedgeeffectcolor2.f59513d;
            mv mvVar3 = (mv) getMetadata.setDividerPadding(new Object[]{getmetadata}, -815815505, 815815505, System.identityHashCode(getmetadata));
            int iIntValue2 = ((Integer) mv.setDividerPadding(new Object[]{mvVar3}, 509932451, -509932450, System.identityHashCode(mvVar3))).intValue();
            mv mvVar4 = (mv) getMetadata.setDividerPadding(new Object[]{getmetadata}, -815815505, 815815505, System.identityHashCode(getmetadata));
            rectE_ = getprocessingresult2.F_(iIntValue2, ((Integer) mv.setDividerPadding(new Object[]{mvVar4}, 94375366, -94375366, System.identityHashCode(mvVar4))).intValue());
        }
        setImageMatrix setimagematrix = new setImageMatrix(rectE_, (setCollapseIcon.setY) TsdkInitializer.setDividerPadding(new Object[]{getmetadata}, 1323446622, -1323446622, (int) System.currentTimeMillis()), setbottomedgeeffectcolor2.f59513d.setX(), false, 8, null);
        int i14 = R.font.mpp_security_dm_sans;
        Context context = setbottomedgeeffectcolor2.f59510a;
        Typeface font = ResourcesCompat.getFont(context, i14);
        if (font == null) {
            Object[] objArr2 = new Object[1];
            a(Process.getGidForName("") + 18, 284 - View.MeasureSpec.getMode(0), 2 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
            font = Typeface.create(((String) objArr2[0]).intern(), 0);
        }
        Typeface font2 = ResourcesCompat.getFont(context, R.font.mpp_security_dm_sans_medium);
        if (font2 == null) {
            Object[] objArr3 = new Object[1];
            a(17 - Color.alpha(0), 285 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 4, objArr3);
            font2 = Typeface.create(((String) objArr3[0]).intern(), 0);
        }
        boolean z10 = getmetadata instanceof setImeOptions;
        setGravity setgravity = setbottomedgeeffectcolor2.f59511b;
        if (z10) {
            setImeOptions setimeoptions = (setImeOptions) getmetadata;
            String strValueOf = String.valueOf(((Character) setImeOptions.setY(new Object[]{setimeoptions}, -1113749997, 1113749997, System.identityHashCode(setimeoptions))).charValue());
            float x4 = setgravity.setX();
            Intrinsics.checkNotNullExpressionValue(font, "");
            Intrinsics.checkNotNullParameter(strValueOf, "");
            Intrinsics.checkNotNullParameter(font, "");
            i9Var = new i9(strValueOf, x4, font, null);
        } else {
            if (getmetadata instanceof setTextMetricsParams) {
                String onDragListener = setgravity.setOnDragListener();
                float fFloatValue2 = ((Float) setGravity.setOnFocusChangeListener(new Object[]{setgravity}, 1296442730, -1296442729, System.identityHashCode(setgravity))).floatValue();
                Intrinsics.checkNotNullExpressionValue(font2, "");
                byte[] bArrUiMessageCallbackKtWhenMappings = setgravity.UiMessageCallbackKtWhenMappings();
                j3Var = new j3(onDragListener, fFloatValue2, font2, bArrUiMessageCallbackKtWhenMappings == null ? null : (Bitmap) setPreferKeepClearRects.setOnFocusChangeListener(new Object[]{bArrUiMessageCallbackKtWhenMappings}, -547310384, 547310384, (int) System.currentTimeMillis()), ((Integer) setGravity.setOnFocusChangeListener(new Object[]{setgravity}, -1593987793, 1593987795, System.identityHashCode(setgravity))).intValue());
            } else if (getmetadata instanceof setImageDrawable) {
                String navBarTitleString = setgravity.getNavBarTitleString();
                float fFloatValue3 = ((Float) setGravity.setOnFocusChangeListener(new Object[]{setgravity}, 1296442730, -1296442729, System.identityHashCode(setgravity))).floatValue();
                Intrinsics.checkNotNullExpressionValue(font2, "");
                byte[] bArr = (byte[]) setGravity.setOnFocusChangeListener(new Object[]{setgravity}, 1362835856, -1362835856, System.identityHashCode(setgravity));
                j3Var = new j3(navBarTitleString, fFloatValue3, font2, bArr == null ? null : (Bitmap) setPreferKeepClearRects.setOnFocusChangeListener(new Object[]{bArr}, -547310384, 547310384, (int) System.currentTimeMillis()), ((Integer) setGravity.setOnFocusChangeListener(new Object[]{setgravity}, -1593987793, 1593987795, System.identityHashCode(setgravity))).intValue());
            } else {
                if (!(getmetadata instanceof setNestedScrollingEnabled)) {
                    throw new NoWhenBranchMatchedException();
                }
                String layoutAnimation = setgravity.setLayoutAnimation();
                float fFloatValue4 = ((Float) setGravity.setOnFocusChangeListener(new Object[]{setgravity}, 1296442730, -1296442729, System.identityHashCode(setgravity))).floatValue();
                Intrinsics.checkNotNullExpressionValue(font2, "");
                byte[] textAlignment = setgravity.setTextAlignment();
                j3Var = new j3(layoutAnimation, fFloatValue4, font2, textAlignment == null ? null : (Bitmap) setPreferKeepClearRects.setOnFocusChangeListener(new Object[]{textAlignment}, -547310384, 547310384, (int) System.currentTimeMillis()), ((Integer) setGravity.setOnFocusChangeListener(new Object[]{setgravity}, -1593987793, 1593987795, System.identityHashCode(setgravity))).intValue());
            }
            i9Var = j3Var;
        }
        float[] fArrD = setbottomedgeeffectcolor2.d((mv) getMetadata.setDividerPadding(new Object[]{getmetadata}, -815815505, 815815505, System.identityHashCode(getmetadata)));
        Paint paint3 = setbottomedgeeffectcolor2.f59515f;
        Canvas canvas = setbottomedgeeffectcolor2.f59512c;
        if (fArrD == null) {
            int i15 = m + 3;
            f59506l = i15 % 128;
            int i16 = i15 % 2;
            fArrD = null;
        } else {
            Path path = new Path();
            path.addRoundRect((RectF) TsdkInitializer.setDividerPadding(new Object[]{(Rect) setImageMatrix.setCompoundDrawableTintBlendMode(new Object[]{setimagematrix}, 178076079, -178076074, System.identityHashCode(setimagematrix))}, 1432924026, -1432924024, (int) System.currentTimeMillis()), fArrD, Path.Direction.CW);
            canvas.drawPath(path, paint3);
        }
        if (fArrD == null) {
            canvas.drawRect((Rect) setImageMatrix.setCompoundDrawableTintBlendMode(new Object[]{setimagematrix}, 178076079, -178076074, System.identityHashCode(setimagematrix)), paint3);
        }
        int i17 = f59506l + 93;
        int i18 = i17 % 128;
        m = i18;
        if (i17 % 2 == 0) {
            int i19 = 18 / 0;
        }
        boolean z11 = i9Var instanceof i9;
        Paint paint4 = setbottomedgeeffectcolor2.f59516g;
        if (z11) {
            i9 i9Var2 = (i9) i9Var;
            int i20 = i18 + 11;
            f59506l = i20 % 128;
            if (i20 % 2 != 0) {
                setCompoundDrawableTintBlendMode(new Object[]{setbottomedgeeffectcolor2, i9Var2}, 1077225583, -1077225583, System.identityHashCode(setbottomedgeeffectcolor2));
                str = (String) k.a(new Object[]{i9Var2}, 1621575851, -1621575851, System.identityHashCode(i9Var2));
                fCenterX = ((Rect) setImageMatrix.setCompoundDrawableTintBlendMode(new Object[]{setimagematrix}, 178076079, -178076074, System.identityHashCode(setimagematrix))).centerX();
                fCenterY = ((Rect) setImageMatrix.setCompoundDrawableTintBlendMode(new Object[]{setimagematrix}, 178076079, -178076074, System.identityHashCode(setimagematrix))).centerY();
                fFloatValue = ((Float) k.a(new Object[]{i9Var2}, -1808853454, 1808853456, System.identityHashCode(i9Var2))).floatValue() - 3.0f;
            } else {
                setCompoundDrawableTintBlendMode(new Object[]{setbottomedgeeffectcolor2, i9Var2}, 1077225583, -1077225583, System.identityHashCode(setbottomedgeeffectcolor2));
                str = (String) k.a(new Object[]{i9Var2}, 1621575851, -1621575851, System.identityHashCode(i9Var2));
                fCenterX = ((Rect) setImageMatrix.setCompoundDrawableTintBlendMode(new Object[]{setimagematrix}, 178076079, -178076074, System.identityHashCode(setimagematrix))).centerX();
                fCenterY = ((Rect) setImageMatrix.setCompoundDrawableTintBlendMode(new Object[]{setimagematrix}, 178076079, -178076074, System.identityHashCode(setimagematrix))).centerY();
                fFloatValue = ((Float) k.a(new Object[]{i9Var2}, -1808853454, 1808853456, System.identityHashCode(i9Var2))).floatValue() / 3.0f;
            }
            canvas.drawText(str, fCenterX, fFloatValue + fCenterY, paint4);
            int i21 = m + 107;
            f59506l = i21 % 128;
            if (i21 % 2 != 0) {
                throw null;
            }
        } else if (i9Var instanceof j3) {
            j3 j3Var2 = (j3) i9Var;
            setCompoundDrawableTintBlendMode(new Object[]{setbottomedgeeffectcolor2, j3Var2}, 1077225583, -1077225583, System.identityHashCode(setbottomedgeeffectcolor2));
            float f6 = paint4.getFontMetrics().bottom - paint4.getFontMetrics().top;
            Bitmap bitmap = (Bitmap) j3.b(new Object[]{j3Var2}, -133256746, 133256746, System.identityHashCode(j3Var2));
            int height = bitmap == null ? 0 : bitmap.getHeight();
            Integer numValueOf = Integer.valueOf(((Integer) j3.b(new Object[]{j3Var2}, 1861586573, -1861586572, System.identityHashCode(j3Var2))).intValue());
            if (height <= 0) {
                numValueOf = null;
            }
            float fIntValue = height + f6 + (numValueOf == null ? 0 : numValueOf.intValue());
            Bitmap bitmap2 = (Bitmap) j3.b(new Object[]{j3Var2}, -133256746, 133256746, System.identityHashCode(j3Var2));
            if (bitmap2 != null) {
                int i22 = f59506l + 31;
                m = i22 % 128;
                int i23 = i22 % 2;
                canvas.drawBitmap(bitmap2, ((Rect) setImageMatrix.setCompoundDrawableTintBlendMode(new Object[]{setimagematrix}, 178076079, -178076074, System.identityHashCode(setimagematrix))).centerX() - (bitmap2.getWidth() / 2), ((Rect) setImageMatrix.setCompoundDrawableTintBlendMode(new Object[]{setimagematrix}, 178076079, -178076074, System.identityHashCode(setimagematrix))).centerY() - (fIntValue / 2.0f), (Paint) null);
            }
            canvas.drawText((String) k.a(new Object[]{j3Var2}, 1621575851, -1621575851, System.identityHashCode(j3Var2)), ((Rect) setImageMatrix.setCompoundDrawableTintBlendMode(new Object[]{setimagematrix}, 178076079, -178076074, System.identityHashCode(setimagematrix))).centerX(), (fIntValue / 2.0f) + ((Rect) setImageMatrix.setCompoundDrawableTintBlendMode(new Object[]{setimagematrix}, 178076079, -178076074, System.identityHashCode(setimagematrix))).centerY(), paint4);
            int i24 = m + 19;
            f59506l = i24 % 128;
            int i25 = i24 % 2;
        }
        return setimagematrix;
    }

    public final float[] d(mv mvVar) {
        setFadingEdgeLength setfadingedgelength = this.f59514e;
        if (setfadingedgelength == null) {
            return null;
        }
        int iIntValue = ((Integer) mv.setDividerPadding(new Object[]{mvVar}, 509932451, -509932450, System.identityHashCode(mvVar))).intValue();
        mv mvVar2 = (mv) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1692182872, 1692182873, System.identityHashCode(setfadingedgelength));
        if (iIntValue == ((Integer) mv.setDividerPadding(new Object[]{mvVar2}, 509932451, -509932450, System.identityHashCode(mvVar2))).intValue()) {
            int i10 = m + 87;
            f59506l = i10 % 128;
            int i11 = i10 % 2;
            int iIntValue2 = ((Integer) mv.setDividerPadding(new Object[]{mvVar}, 94375366, -94375366, System.identityHashCode(mvVar))).intValue();
            mv mvVar3 = (mv) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1692182872, 1692182873, System.identityHashCode(setfadingedgelength));
            if (iIntValue2 == ((Integer) mv.setDividerPadding(new Object[]{mvVar3}, 94375366, -94375366, System.identityHashCode(mvVar3))).intValue()) {
                return new float[]{((Float) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1840230925, 1840230928, System.identityHashCode(setfadingedgelength))).floatValue(), ((Float) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1840230925, 1840230928, System.identityHashCode(setfadingedgelength))).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            }
        }
        int iIntValue3 = ((Integer) mv.setDividerPadding(new Object[]{mvVar}, 509932451, -509932450, System.identityHashCode(mvVar))).intValue();
        mv mvVar4 = (mv) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, 1433135746, -1433135742, System.identityHashCode(setfadingedgelength));
        if (iIntValue3 == ((Integer) mv.setDividerPadding(new Object[]{mvVar4}, 509932451, -509932450, System.identityHashCode(mvVar4))).intValue()) {
            int iIntValue4 = ((Integer) mv.setDividerPadding(new Object[]{mvVar}, 94375366, -94375366, System.identityHashCode(mvVar))).intValue();
            mv mvVar5 = (mv) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, 1433135746, -1433135742, System.identityHashCode(setfadingedgelength));
            if (iIntValue4 == ((Integer) mv.setDividerPadding(new Object[]{mvVar5}, 94375366, -94375366, System.identityHashCode(mvVar5))).intValue()) {
                int i12 = m + 67;
                f59506l = i12 % 128;
                int i13 = i12 % 2;
                return new float[]{0.0f, 0.0f, ((Float) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1840230925, 1840230928, System.identityHashCode(setfadingedgelength))).floatValue(), ((Float) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1840230925, 1840230928, System.identityHashCode(setfadingedgelength))).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f};
            }
        }
        int iIntValue5 = ((Integer) mv.setDividerPadding(new Object[]{mvVar}, 509932451, -509932450, System.identityHashCode(mvVar))).intValue();
        mv mvVar6 = (mv) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, 877070512, -877070512, System.identityHashCode(setfadingedgelength));
        if (iIntValue5 == ((Integer) mv.setDividerPadding(new Object[]{mvVar6}, 509932451, -509932450, System.identityHashCode(mvVar6))).intValue()) {
            int iIntValue6 = ((Integer) mv.setDividerPadding(new Object[]{mvVar}, 94375366, -94375366, System.identityHashCode(mvVar))).intValue();
            mv mvVar7 = (mv) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, 877070512, -877070512, System.identityHashCode(setfadingedgelength));
            if (iIntValue6 == ((Integer) mv.setDividerPadding(new Object[]{mvVar7}, 94375366, -94375366, System.identityHashCode(mvVar7))).intValue()) {
                return new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, ((Float) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1840230925, 1840230928, System.identityHashCode(setfadingedgelength))).floatValue(), ((Float) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1840230925, 1840230928, System.identityHashCode(setfadingedgelength))).floatValue()};
            }
        }
        int iIntValue7 = ((Integer) mv.setDividerPadding(new Object[]{mvVar}, 509932451, -509932450, System.identityHashCode(mvVar))).intValue();
        mv mvVar8 = (mv) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, 561997970, -561997968, System.identityHashCode(setfadingedgelength));
        if (iIntValue7 != ((Integer) mv.setDividerPadding(new Object[]{mvVar8}, 509932451, -509932450, System.identityHashCode(mvVar8))).intValue()) {
            return null;
        }
        int i14 = m + 47;
        f59506l = i14 % 128;
        if (i14 % 2 != 0) {
            ((Integer) mv.setDividerPadding(new Object[]{mvVar}, 94375366, -94375366, System.identityHashCode(mvVar))).intValue();
            mv mvVar9 = (mv) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, 561997970, -561997968, System.identityHashCode(setfadingedgelength));
            ((Integer) mv.setDividerPadding(new Object[]{mvVar9}, 94375366, -94375366, System.identityHashCode(mvVar9))).intValue();
            throw null;
        }
        int iIntValue8 = ((Integer) mv.setDividerPadding(new Object[]{mvVar}, 94375366, -94375366, System.identityHashCode(mvVar))).intValue();
        mv mvVar10 = (mv) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, 561997970, -561997968, System.identityHashCode(setfadingedgelength));
        if (iIntValue8 != ((Integer) mv.setDividerPadding(new Object[]{mvVar10}, 94375366, -94375366, System.identityHashCode(mvVar10))).intValue()) {
            return null;
        }
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, ((Float) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1840230925, 1840230928, System.identityHashCode(setfadingedgelength))).floatValue(), ((Float) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1840230925, 1840230928, System.identityHashCode(setfadingedgelength))).floatValue(), 0.0f, 0.0f};
        int i15 = m + 41;
        f59506l = i15 % 128;
        if (i15 % 2 == 0) {
            return fArr;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:26:0x0108  */
    /* JADX WARN: Code duplicated, block: B:27:0x0119  */
    /* JADX WARN: Code duplicated, block: B:30:0x014c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0152  */
    /* JADX WARN: Code duplicated, block: B:33:0x017a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0186  */
    /* JADX WARN: Code duplicated, block: B:46:0x018a A[SYNTHETIC] */
    public final void setDividerPadding(@NotNull List<mv> list, float f6) {
        int i10;
        Rect rect;
        int iRoundToInt;
        float[] fArrD;
        Paint paint;
        Canvas canvas;
        int i11;
        int i12;
        int i13 = f59506l + 101;
        m = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        getProcessingResult getprocessingresult = this.f59513d;
        setSupportImageTintList layoutAnimation = getprocessingresult.setLayoutAnimation();
        int i15 = 1;
        int i16 = 0;
        int iIntValue = ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(new Object[]{layoutAnimation}, -425827594, 425827594, System.identityHashCode(layoutAnimation))).intValue();
        if (iIntValue <= 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            int i18 = i17 + 1;
            setSupportImageTintList layoutAnimation2 = getprocessingresult.setLayoutAnimation();
            Object[] objArr = new Object[i15];
            objArr[i16] = layoutAnimation2;
            int iIntValue2 = ((Integer) setSupportImageTintList.setCompoundDrawableTintBlendMode(objArr, 1397292818, -1397292817, System.identityHashCode(layoutAnimation2))).intValue();
            if (iIntValue2 > 0) {
                int i19 = i16;
                while (true) {
                    int i20 = i19 + 1;
                    List<mv> list2 = list;
                    if (((list2.isEmpty() ? 1 : 0) ^ i15) != i15) {
                        rect = new Rect();
                        int iRoundToInt2 = c.roundToInt(((getprocessingresult.setDividerPadding() + getprocessingresult.setX()) * i19) + getprocessingresult.setX());
                        rect.top = iRoundToInt2;
                        rect.bottom = c.roundToInt(getprocessingresult.setDividerPadding() + iRoundToInt2);
                        if (f6 == 0.0f) {
                            iRoundToInt = c.roundToInt((getprocessingresult.setOnFocusChangeListener() + getprocessingresult.setX()) * i17);
                        } else {
                            iRoundToInt = c.roundToInt(((getprocessingresult.setOnFocusChangeListener() + getprocessingresult.setX()) * i17) + getprocessingresult.setX());
                        }
                        rect.left = iRoundToInt;
                        rect.right = c.roundToInt(getprocessingresult.setOnFocusChangeListener() + iRoundToInt);
                        fArrD = d(new mv(i17, i19));
                        paint = this.f59515f;
                        canvas = this.f59512c;
                        if (fArrD == null) {
                            fArrD = null;
                            i10 = 0;
                        } else {
                            Path path = new Path();
                            Object[] objArr2 = new Object[i15];
                            i10 = 0;
                            objArr2[0] = rect;
                            path.addRoundRect((RectF) TsdkInitializer.setDividerPadding(objArr2, 1432924026, -1432924024, (int) System.currentTimeMillis()), fArrD, Path.Direction.CW);
                            canvas.drawPath(path, paint);
                        }
                        if (fArrD == null) {
                            i11 = f59506l + 27;
                            m = i11 % 128;
                            if (i11 % 2 != 0) {
                                canvas.drawRect(rect, paint);
                                throw null;
                            }
                            canvas.drawRect(rect, paint);
                        }
                    } else {
                        Iterator<T> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                int i21 = f59506l + 123;
                                m = i21 % 128;
                                int i22 = i21 % 2;
                                mv mvVar = (mv) it.next();
                                Object[] objArr3 = new Object[i15];
                                objArr3[i16] = mvVar;
                                if (((Integer) mv.setDividerPadding(objArr3, 509932451, -509932450, System.identityHashCode(mvVar))).intValue() == i17) {
                                    Object[] objArr4 = new Object[i15];
                                    objArr4[0] = mvVar;
                                    if (((Integer) mv.setDividerPadding(objArr4, 94375366, -94375366, System.identityHashCode(mvVar))).intValue() == i19) {
                                        int i23 = m + 61;
                                        f59506l = i23 % 128;
                                        int i24 = i23 % 2;
                                        i12 = i15;
                                    } else {
                                        i12 = 0;
                                    }
                                } else {
                                    i12 = 0;
                                }
                                if ((i12 ^ 1) != i15) {
                                    int i25 = f59506l + 121;
                                    m = i25 % 128;
                                    int i26 = i25 % 2;
                                    i17 = i17;
                                    i10 = 0;
                                } else {
                                    i16 = 0;
                                }
                            } else {
                                rect = new Rect();
                                int iRoundToInt3 = c.roundToInt(((getprocessingresult.setDividerPadding() + getprocessingresult.setX()) * i19) + getprocessingresult.setX());
                                rect.top = iRoundToInt3;
                                rect.bottom = c.roundToInt(getprocessingresult.setDividerPadding() + iRoundToInt3);
                                if (f6 == 0.0f) {
                                    iRoundToInt = c.roundToInt((getprocessingresult.setOnFocusChangeListener() + getprocessingresult.setX()) * i17);
                                } else {
                                    iRoundToInt = c.roundToInt(((getprocessingresult.setOnFocusChangeListener() + getprocessingresult.setX()) * i17) + getprocessingresult.setX());
                                }
                                rect.left = iRoundToInt;
                                rect.right = c.roundToInt(getprocessingresult.setOnFocusChangeListener() + iRoundToInt);
                                fArrD = d(new mv(i17, i19));
                                paint = this.f59515f;
                                canvas = this.f59512c;
                                if (fArrD == null) {
                                    fArrD = null;
                                    i10 = 0;
                                } else {
                                    Path path2 = new Path();
                                    Object[] objArr5 = new Object[i15];
                                    i10 = 0;
                                    objArr5[0] = rect;
                                    path2.addRoundRect((RectF) TsdkInitializer.setDividerPadding(objArr5, 1432924026, -1432924024, (int) System.currentTimeMillis()), fArrD, Path.Direction.CW);
                                    canvas.drawPath(path2, paint);
                                }
                                if (fArrD == null) {
                                    i11 = f59506l + 27;
                                    m = i11 % 128;
                                    if (i11 % 2 != 0) {
                                        canvas.drawRect(rect, paint);
                                        throw null;
                                    }
                                    canvas.drawRect(rect, paint);
                                }
                            }
                        }
                    }
                    if (i20 >= iIntValue2) {
                        break;
                    }
                    i19 = i20;
                    i16 = i10;
                    i17 = i17;
                    i15 = 1;
                }
            } else {
                i10 = i16;
            }
            if (i18 >= iIntValue) {
                return;
            }
            i17 = i18;
            i16 = i10;
            i15 = 1;
        }
    }

    public final void setY() {
        int i10 = m + 69;
        f59506l = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        Paint paint = this.f59517h;
        Canvas canvas = this.f59512c;
        setFadingEdgeLength setfadingedgelength = this.f59514e;
        getProcessingResult getprocessingresult = this.f59513d;
        if (setfadingedgelength == null) {
            canvas.drawRect((RectF) TsdkInitializer.setDividerPadding(new Object[]{new Rect(getprocessingresult.setCompoundDrawableTintBlendMode(), getprocessingresult.setY(), getprocessingresult.setNavigationOnClickListener(), getprocessingresult.setOnLongClickListener())}, 1432924026, -1432924024, (int) System.currentTimeMillis()), paint);
            return;
        }
        canvas.drawRoundRect((RectF) TsdkInitializer.setDividerPadding(new Object[]{new Rect(getprocessingresult.setX() + getprocessingresult.setCompoundDrawableTintBlendMode(), getprocessingresult.setX() + getprocessingresult.setY(), getprocessingresult.setNavigationOnClickListener() - getprocessingresult.setX(), getprocessingresult.setOnLongClickListener() - getprocessingresult.setX())}, 1432924026, -1432924024, (int) System.currentTimeMillis()), ((Float) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1840230925, 1840230928, System.identityHashCode(setfadingedgelength))).floatValue() + getprocessingresult.setX(), ((Float) setFadingEdgeLength.setX(new Object[]{setfadingedgelength}, -1840230925, 1840230928, System.identityHashCode(setfadingedgelength))).floatValue() + getprocessingresult.setX(), paint);
        int i11 = f59506l + 39;
        m = i11 % 128;
        int i12 = i11 % 2;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @org.jetbrains.annotations.NotNull
    public final com.mypinpad.tsdk.isolation.setCollapseIcon[] setCompoundDrawableTintBlendMode(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r27v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public final void setCompoundDrawableTintBlendMode() {
        int i10 = f59506l + 27;
        m = i10 % 128;
        int i11 = i10 % 2;
        getProcessingResult getprocessingresult = this.f59513d;
        Rect rectF_ = getprocessingresult.F_(1, 0);
        int x4 = ((rectF_.bottom - rectF_.top) - (getprocessingresult.setX() * 10)) / 2;
        if (x4 <= 0) {
            return;
        }
        Rect rect = new Rect();
        rect.top = rectF_.top;
        rect.bottom = rectF_.top + x4;
        rect.left = rectF_.left - getprocessingresult.setX();
        rect.right = rectF_.left;
        Paint paint = this.f59515f;
        Canvas canvas = this.f59512c;
        canvas.drawRect(rect, paint);
        Rect rect2 = new Rect();
        int i12 = rectF_.bottom;
        rect2.top = i12 - x4;
        rect2.bottom = i12;
        rect2.left = rectF_.left - getprocessingresult.setX();
        rect2.right = rectF_.left;
        canvas.drawRect(rect2, paint);
        Rect rect3 = new Rect();
        rect3.top = rectF_.top;
        rect3.bottom = rectF_.top + x4;
        int i13 = rectF_.right;
        rect3.left = i13;
        rect3.right = getprocessingresult.setX() + i13;
        canvas.drawRect(rect3, paint);
        Rect rect4 = new Rect();
        int i14 = rectF_.bottom;
        rect4.top = i14 - x4;
        rect4.bottom = i14;
        int i15 = rectF_.right;
        rect4.left = i15;
        rect4.right = getprocessingresult.setX() + i15;
        canvas.drawRect(rect4, paint);
        int i16 = m + 77;
        f59506l = i16 % 128;
        if (i16 % 2 != 0) {
            throw null;
        }
    }
}
