package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import androidx.annotation.ColorInt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001Bé\u0001\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\b\b\u0001\u0010F\u001a\u00020\u0005\u0012\b\b\u0001\u0010G\u001a\u00020\u0005\u0012\u0006\u0010H\u001a\u00020\u0002\u0012\b\b\u0001\u0010I\u001a\u00020\u0005\u0012\u0006\u0010J\u001a\u00020\u001d\u0012\b\b\u0001\u0010K\u001a\u00020\u0005\u0012\b\b\u0001\u0010L\u001a\u00020\u0005\u0012\u0006\u0010M\u001a\u00020\u0002\u0012\b\b\u0001\u0010N\u001a\u00020\u0005\u0012\b\b\u0001\u0010O\u001a\u00020\u0005\u0012\u0006\u0010P\u001a\u00020\u001d\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010R\u001a\u00020\u0005\u0012\b\b\u0001\u0010S\u001a\u00020\u0005\u0012\u0006\u0010T\u001a\u00020\u001d\u0012\u0006\u0010U\u001a\u00020\u0002\u0012\b\b\u0001\u0010V\u001a\u00020\u0005\u0012\u0006\u0010W\u001a\u00020\u0005\u0012\u0006\u0010X\u001a\u00020\u001d\u0012\b\b\u0001\u0010Y\u001a\u00020\u0005\u0012\b\b\u0002\u0010Z\u001a\u00020\t\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\\\u001a\u0004\u0018\u00010B¢\u0006\u0004\b]\u0010^J\u0010\u0010\u0003\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0007R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001c\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u0007R\u001a\u0010\"\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b$\u0010\u0007R\u001a\u0010(\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b'\u0010\u0007R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u0004R\u0017\u0010\u0018\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b+\u0010\r\u001a\u0004\b,\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\r\u001a\u0004\b.\u0010\u0007R\u001a\u0010\u001b\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b\u0015\u0010!R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0017\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010$\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\r\u001a\u0004\b2\u0010\u0007R\u001a\u0010*\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\r\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010.\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u00106\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0017\u001a\u0004\b\u0019\u0010\u0004R\u001a\u00108\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\r\u001a\u0004\b%\u0010\u0007R\u001a\u0010 \u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\r\u001a\u0004\b:\u0010\u0007R\u001a\u0010'\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u001f\u001a\u0004\b(\u0010!R\u001a\u0010\u0014\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\r\u001a\u0004\b6\u0010\u0007R\u001a\u00102\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u0017\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010:\u001a\u0004\u0018\u00010B8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b8\u0010E"}, d2 = {"Lcom/mypinpad/tsdk/i/component32;", "", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "p0", "", "equals", "(Ljava/lang/Object;)Z", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setX", "setImageResource", "b", "setY", "setZ", "c", "setCompoundDrawableTintBlendMode", "setTextAlignment", "d", "Ljava/lang/String;", "setDividerPadding", "setChildDivider", "e", "setOnFocusChangeListener", "setAlwaysDrawnWithCacheEnabled", "", "f", "F", "setLayoutAnimation", "()F", "setOnEditorActionListener", "g", "setOnLongClickListener", "setCompoundDrawablePadding", "h", "getNavBarTitleString", "getAmountFieldTextColor", "i", "setNavigationOnClickListener", "j", "setOnDragListener", "k", "setIncludeFontPadding", "l", "m", "n", "UiMessageCallbackKtWhenMappings", "o", "p", "q", "setLayoutDirection", "r", "getSuppressed", "s", "setTextScaleX", "t", "u", SharedPrefsStorage.VERSION_KEY, "Z", "setMaxEms", "()Z", "w", "Lcom/mypinpad/tsdk/i/setIndeterminateTintBlendMode;", "x", "Lcom/mypinpad/tsdk/i/setIndeterminateTintBlendMode;", "()Lcom/mypinpad/tsdk/i/setIndeterminateTintBlendMode;", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "<init>", "(IIILjava/lang/String;IFIILjava/lang/String;IIFLjava/lang/String;IIFLjava/lang/String;IIFIZLjava/lang/String;Lcom/mypinpad/tsdk/i/setIndeterminateTintBlendMode;)V"}, k = 1, mv = {1, 8, 0})
public final /* data */ class component32 {
    public static final char A;
    public static final char B;
    public static final char[] C;
    public static final char D;
    public static int E;
    public static int F;
    public static int G;
    public static int H;
    public static final byte[] I = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final char f54928y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final char f54929z;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int setImageResource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int setZ;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int setTextAlignment;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setChildDivider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int setAlwaysDrawnWithCacheEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final float setOnEditorActionListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int setCompoundDrawablePadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int getAmountFieldTextColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setY;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int setDividerPadding;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final int setX;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final float setOnFocusChangeListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final String setOnDragListener;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final int setOnLongClickListener;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int setNavigationOnClickListener;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final float setIncludeFontPadding;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setLayoutDirection;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final int getSuppressed;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final int setLayoutAnimation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final float getNavBarTitleString;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final int setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final boolean UiMessageCallbackKtWhenMappings;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String setMaxEms;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final setIndeterminateTintBlendMode setTextScaleX;

    static {
        d();
        G = 0;
        H = 1;
        E = 0;
        F = 1;
        B = (char) 18546;
        A = (char) 43055;
        f54928y = (char) 1784;
        f54929z = (char) 30126;
        D = (char) 53959;
        C = new char[]{53955, 59187, 53957, 59196, 59259, 53959, 59189, 59183, 59177, 59144, 59181, 59238, 59255, 59151, 59179, 59199, 59180, 59158, 59176, 59188, 59161, 59147, 59160, 59165, 59190, 53954, 59167, 59186, 59198, 59193, 59171, 53956, 53952, 59191, 59194, 59148};
    }

    public component32(@ColorInt int i10, @ColorInt int i11, @ColorInt int i12, @NotNull String str, @ColorInt int i13, float f6, @ColorInt int i14, @ColorInt int i15, @NotNull String str2, @ColorInt int i16, @ColorInt int i17, float f10, @Nullable String str3, @ColorInt int i18, @ColorInt int i19, float f11, @NotNull String str4, @ColorInt int i20, int i21, float f12, @ColorInt int i22, boolean z10, @Nullable String str5, @Nullable setIndeterminateTintBlendMode setindeterminatetintblendmode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.setImageResource = i10;
        this.setZ = i11;
        this.setTextAlignment = i12;
        this.setChildDivider = str;
        this.setAlwaysDrawnWithCacheEnabled = i13;
        this.setOnEditorActionListener = f6;
        this.setCompoundDrawablePadding = i14;
        this.getAmountFieldTextColor = i15;
        this.setY = str2;
        this.setDividerPadding = i16;
        this.setX = i17;
        this.setOnFocusChangeListener = f10;
        this.setOnDragListener = str3;
        this.setOnLongClickListener = i18;
        this.setNavigationOnClickListener = i19;
        this.setIncludeFontPadding = f11;
        this.setLayoutDirection = str4;
        this.getSuppressed = i20;
        this.setLayoutAnimation = i21;
        this.getNavBarTitleString = f12;
        this.setCompoundDrawableTintBlendMode = i22;
        this.UiMessageCallbackKtWhenMappings = z10;
        this.setMaxEms = str5;
        this.setTextScaleX = setindeterminatetintblendmode;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        byte[] bArr;
        int i11;
        int i12 = H + 93;
        int i13 = i12 % 128;
        G = i13;
        int i14 = 2;
        int i15 = i12 % 2;
        int i16 = i13 + 95;
        H = i16 % 128;
        int i17 = i16 % 2;
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i18 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i19 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i19 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            int i20 = H + 67;
            G = i20 % 128;
            int i21 = i20 % i14;
            cArr2[i18] = charArray[i19];
            char c10 = 1;
            cArr2[1] = charArray[i19 + 1];
            int i22 = 58224;
            int i23 = i18;
            while (true) {
                bArr = I;
                if (i23 >= 16) {
                    break;
                }
                char c11 = cArr2[c10];
                char c12 = cArr2[i18];
                char[] cArr3 = cArr2;
                int i24 = (c12 + i22) ^ ((c12 << 4) + ((char) (((long) A) ^ 4333817592127744003L)));
                int i25 = c12 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(B);
                    objArr2[i14] = Integer.valueOf(i25);
                    objArr2[1] = Integer.valueOf(i24);
                    objArr2[0] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (Process.getGidForName("") + 48535), 47 - View.getDefaultSize(0, 0), View.resolveSize(0, 0) + 2672);
                        byte length = (byte) bArr.length;
                        byte b10 = (byte) (length - 5);
                        Object[] objArr3 = new Object[1];
                        c(length, b10, (byte) (b10 + 1), objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i22) ^ ((cCharValue << 4) + ((char) (((long) f54928y) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f54929z)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 48533), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 47, TextUtils.lastIndexOf("", '0') + 2673);
                        byte length2 = (byte) bArr.length;
                        byte b11 = (byte) (length2 - 5);
                        Object[] objArr5 = new Object[1];
                        c(length2, b11, (byte) (b11 + 1), objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i22 -= 40503;
                    i23++;
                    cArr2 = cArr3;
                    i14 = 2;
                    i18 = 0;
                    c10 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr2;
            int i26 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i26] = cArr4[0];
            cArr[i26 + 1] = cArr4[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                i11 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) TextUtils.getTrimmedLength(""), 37 - (Process.myTid() >> 22), 2145 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                byte b12 = (byte) (-1);
                Object[] objArr7 = new Object[1];
                c((byte) (bArr[3] + 1), b12, (byte) (b12 + 1), objArr7);
                i11 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i11;
            cArr2 = cArr4;
            i18 = 0;
        }
    }

    public static void b(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = C;
        int i12 = -1;
        int i13 = 290255894;
        int i14 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i14] = Integer.valueOf(cArr[i15]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i13));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + i12), (-16777171) - Color.rgb(i14, i14, i14), TextUtils.indexOf("", "") + 1116);
                        byte b11 = (byte) i14;
                        byte b12 = (byte) (b11 - 1);
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, (byte) (b12 + 1), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i15++;
                    i12 = -1;
                    i13 = 290255894;
                    i14 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(D)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) Color.alpha(0), 44 - TextUtils.lastIndexOf("", '0', 0), 1116 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            byte b13 = (byte) 0;
            byte b14 = (byte) (b13 - 1);
            Object[] objArr5 = new Object[1];
            c(b13, b14, (byte) (b14 + 1), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        int i16 = 2;
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i17 = setincludefontpadding.setDividerPadding;
                if (i17 >= i11) {
                    break;
                }
                int i18 = H;
                int i19 = i18 + 71;
                G = i19 % 128;
                int i20 = i19 % i16;
                char c10 = charArray[i17];
                setincludefontpadding.setY = c10;
                int i21 = i17 + 1;
                char c11 = charArray[i21];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    int i22 = i18 + 75;
                    G = i22 % 128;
                    if (i22 % i16 != 0) {
                        cArr3[i17] = (char) (c10 >> b10);
                        cArr3[i17 % 1] = (char) (c11 << b10);
                    } else {
                        cArr3[i17] = (char) (c10 - b10);
                        cArr3[i21] = (char) (c11 - b10);
                    }
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = setincludefontpadding;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = setincludefontpadding;
                    objArr6[9] = setincludefontpadding;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = setincludefontpadding;
                    objArr6[6] = setincludefontpadding;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = setincludefontpadding;
                    objArr6[3] = setincludefontpadding;
                    objArr6[i16] = Integer.valueOf(cCharValue);
                    objArr6[1] = setincludefontpadding;
                    objArr6[0] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), ExpandableListView.getPackedPositionChild(0L) + 28, 2311 - TextUtils.getTrimmedLength(""));
                        byte b15 = (byte) 3;
                        byte b16 = (byte) (b15 - 4);
                        Object[] objArr7 = new Object[1];
                        c(b15, b16, (byte) (b16 + 1), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i23 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i23) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49103 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 35 - ExpandableListView.getPackedPositionGroup(0L), 2544 - Process.getGidForName(""));
                            byte b17 = (byte) (-1);
                            Object[] objArr9 = new Object[1];
                            c((byte) 7, b17, (byte) (b17 + 1), objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i24 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i25 = setincludefontpadding.setDividerPadding;
                        cArr3[i25] = cArr[iIntValue2];
                        cArr3[i25 + 1] = cArr[i24];
                    } else {
                        int i26 = setincludefontpadding.setX;
                        int i27 = setincludefontpadding.setOnFocusChangeListener;
                        if (i26 == i27) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i23, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i28 = (i27 * cCharValue) + iA2;
                            int i29 = setincludefontpadding.setDividerPadding;
                            cArr3[i29] = cArr[(i26 * cCharValue) + iA];
                            cArr3[i29 + 1] = cArr[i28];
                        } else {
                            int i30 = (i26 * cCharValue) + i23;
                            int i31 = (i27 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i32 = setincludefontpadding.setDividerPadding;
                            cArr3[i32] = cArr[i30];
                            cArr3[i32 + 1] = cArr[i31];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                i16 = 2;
            }
        }
        int i33 = 0;
        while (i33 < i10) {
            int i34 = G + 91;
            H = i34 % 128;
            if (i34 % 2 == 0) {
                cArr3[i33] = (char) (cArr3[i33] ^ 27217);
                i33 += 117;
            } else {
                cArr3[i33] = (char) (cArr3[i33] ^ 13722);
                i33++;
            }
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
    public static void c(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 99
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = new byte[r8]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.component32.I
            if (r2 != 0) goto L16
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L33
        L16:
            r3 = r1
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L26:
            int r7 = r7 + 1
            r4 = r2[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L33:
            int r6 = -r6
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.component32.c(byte, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        I = new byte[]{114, -10, 78, 5};
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a0  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x018d, code lost:
    
        if ((r5 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01a5, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.setTextScaleX, r5.setTextScaleX) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r5, int r6, int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.component32.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    @JvmName(name = "UiMessageCallbackKtWhenMappings")
    public final int UiMessageCallbackKtWhenMappings() {
        return ((Integer) setY(new Object[]{this}, -1008439229, 1008439231, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setY(new Object[]{this, p4}, -48994668, 48994671, System.identityHashCode(this))).booleanValue();
    }

    @JvmName(name = "getAmountFieldTextColor")
    public final float getAmountFieldTextColor() {
        int i10 = E + 5;
        int i11 = i10 % 128;
        F = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 117;
        E = i13 % 128;
        int i14 = i13 % 2;
        return this.getNavBarTitleString;
    }

    @JvmName(name = "getNavBarTitleString")
    public final int getNavBarTitleString() {
        int i10 = E;
        int i11 = i10 + 39;
        F = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 19;
        F = i12 % 128;
        int i13 = i12 % 2;
        int i14 = this.getAmountFieldTextColor;
        if (i13 == 0) {
            int i15 = 24 / 0;
        }
        return i14;
    }

    @JvmName(name = "getSuppressed")
    @Nullable
    public final setIndeterminateTintBlendMode getSuppressed() {
        int i10 = E;
        int i11 = i10 + 109;
        F = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 99;
        F = i13 % 128;
        int i14 = i13 % 2;
        return this.setTextScaleX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final int hashCode() {
        int iHashCode;
        int i10 = F + 97;
        E = i10 % 128;
        int i11 = i10 % 2;
        int iA = z1.a(this.setOnFocusChangeListener, (((((this.setY.hashCode() + ((((z1.a(this.setOnEditorActionListener, (((this.setChildDivider.hashCode() + (((((this.setImageResource * 31) + this.setZ) * 31) + this.setTextAlignment) * 31)) * 31) + this.setAlwaysDrawnWithCacheEnabled) * 31, 31) + this.setCompoundDrawablePadding) * 31) + this.getAmountFieldTextColor) * 31)) * 31) + this.setDividerPadding) * 31) + this.setX) * 31, 31);
        int iHashCode2 = 0;
        String str = this.setOnDragListener;
        int iA2 = (z1.a(this.getNavBarTitleString, (((((this.setLayoutDirection.hashCode() + z1.a(this.setIncludeFontPadding, (((((iA + (str == null ? 0 : str.hashCode())) * 31) + this.setOnLongClickListener) * 31) + this.setNavigationOnClickListener) * 31, 31)) * 31) + this.getSuppressed) * 31) + this.setLayoutAnimation) * 31, 31) + this.setCompoundDrawableTintBlendMode) * 31;
        boolean z10 = this.UiMessageCallbackKtWhenMappings;
        ?? r3 = z10;
        if (z10) {
            int i12 = E + 43;
            F = i12 % 128;
            int i13 = i12 % 2;
            r3 = 1;
        }
        int i14 = (iA2 + r3) * 31;
        String str2 = this.setMaxEms;
        if (str2 == null) {
            int i15 = F + 57;
            E = i15 % 128;
            int i16 = i15 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        int i17 = (i14 + iHashCode) * 31;
        setIndeterminateTintBlendMode setindeterminatetintblendmode = this.setTextScaleX;
        if (setindeterminatetintblendmode == null) {
            int i18 = F;
            int i19 = i18 + 107;
            E = i19 % 128;
            int i20 = i19 % 2;
            int i21 = i18 + 95;
            E = i21 % 128;
            int i22 = i21 % 2;
        } else {
            iHashCode2 = setindeterminatetintblendmode.hashCode();
        }
        return i17 + iHashCode2;
    }

    @JvmName(name = "setAlwaysDrawnWithCacheEnabled")
    @Nullable
    public final String setAlwaysDrawnWithCacheEnabled() {
        int i10 = F + 61;
        int i11 = i10 % 128;
        E = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 43;
        F = i13 % 128;
        int i14 = i13 % 2;
        return this.setOnDragListener;
    }

    @JvmName(name = "setChildDivider")
    @NotNull
    public final String setChildDivider() {
        int i10 = E;
        int i11 = i10 + 99;
        F = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 9;
        F = i13 % 128;
        int i14 = i13 % 2;
        String str = this.setLayoutDirection;
        if (i14 == 0) {
            int i15 = 40 / 0;
        }
        return str;
    }

    @JvmName(name = "setCompoundDrawablePadding")
    public final int setCompoundDrawablePadding() {
        int i10 = F + 21;
        E = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 85 / 0;
        }
        return this.getSuppressed;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final int setCompoundDrawableTintBlendMode() {
        int i10 = E + 107;
        F = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 27 / 0;
        }
        return this.setTextAlignment;
    }

    @JvmName(name = "setDividerPadding")
    @NotNull
    public final String setDividerPadding() {
        return (String) setY(new Object[]{this}, -158889338, 158889338, System.identityHashCode(this));
    }

    @JvmName(name = "setImageResource")
    @Nullable
    public final String setImageResource() {
        int i10 = F + 117;
        int i11 = i10 % 128;
        E = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i12 = i11 + 45;
        F = i12 % 128;
        int i13 = i12 % 2;
        String str = this.setMaxEms;
        if (i13 == 0) {
            int i14 = 9 / 0;
        }
        return str;
    }

    @JvmName(name = "setIncludeFontPadding")
    public final int setIncludeFontPadding() {
        int i10 = E + 79;
        int i11 = i10 % 128;
        F = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 29;
        E = i13 % 128;
        int i14 = i13 % 2;
        return this.setX;
    }

    @JvmName(name = "setLayoutAnimation")
    public final float setLayoutAnimation() {
        int i10 = F + 67;
        int i11 = i10 % 128;
        E = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 79;
        F = i13 % 128;
        int i14 = i13 % 2;
        float f6 = this.setOnEditorActionListener;
        if (i14 == 0) {
            int i15 = 12 / 0;
        }
        return f6;
    }

    @JvmName(name = "setLayoutDirection")
    public final int setLayoutDirection() {
        int i10 = E;
        int i11 = i10 + 1;
        F = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 99;
        F = i13 % 128;
        int i14 = i13 % 2;
        int i15 = this.setCompoundDrawableTintBlendMode;
        if (i14 == 0) {
            int i16 = 85 / 0;
        }
        return i15;
    }

    @JvmName(name = "setMaxEms")
    public final boolean setMaxEms() {
        int i10 = F;
        int i11 = i10 + 75;
        E = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 92 / 0;
        }
        int i13 = i10 + 123;
        E = i13 % 128;
        int i14 = i13 % 2;
        return this.UiMessageCallbackKtWhenMappings;
    }

    @JvmName(name = "setNavigationOnClickListener")
    @NotNull
    public final String setNavigationOnClickListener() {
        return (String) setY(new Object[]{this}, 144493983, -144493982, System.identityHashCode(this));
    }

    @JvmName(name = "setOnDragListener")
    public final int setOnDragListener() {
        int i10 = E;
        int i11 = i10 + 35;
        F = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 65;
        F = i13 % 128;
        int i14 = i13 % 2;
        return this.setDividerPadding;
    }

    @JvmName(name = "setOnEditorActionListener")
    public final float setOnEditorActionListener() {
        return ((Float) setY(new Object[]{this}, 48233972, -48233968, System.identityHashCode(this))).floatValue();
    }

    @JvmName(name = "setOnFocusChangeListener")
    public final int setOnFocusChangeListener() {
        int i10 = E;
        int i11 = i10 + 45;
        F = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 61;
        F = i13 % 128;
        int i14 = i13 % 2;
        return this.setAlwaysDrawnWithCacheEnabled;
    }

    @JvmName(name = "setOnLongClickListener")
    public final int setOnLongClickListener() {
        int i10 = F + 121;
        E = i10 % 128;
        if (i10 % 2 == 0) {
            return this.setCompoundDrawablePadding;
        }
        throw null;
    }

    @JvmName(name = "setTextAlignment")
    public final float setTextAlignment() {
        int i10 = F + 47;
        int i11 = i10 % 128;
        E = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i12 = i11 + 111;
        F = i12 % 128;
        if (i12 % 2 != 0) {
            return this.setOnFocusChangeListener;
        }
        throw null;
    }

    @JvmName(name = "setTextScaleX")
    public final int setTextScaleX() {
        int i10 = E + 9;
        F = i10 % 128;
        if (i10 % 2 != 0) {
            return this.setLayoutAnimation;
        }
        throw null;
    }

    @JvmName(name = "setX")
    public final int setX() {
        int i10 = E + 93;
        F = i10 % 128;
        if (i10 % 2 != 0) {
            return this.setImageResource;
        }
        throw null;
    }

    @JvmName(name = "setZ")
    public final int setZ() {
        int i10 = F + 91;
        int i11 = i10 % 128;
        E = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 17;
        F = i13 % 128;
        if (i13 % 2 != 0) {
            return this.setNavigationOnClickListener;
        }
        throw null;
    }

    @NotNull
    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("\ud849돢㖢ৌ\ue2fd疅쾒\ude9a蒬ጌ⩫\uf370躙싅턓ᖯ蒬ጌ긅㉧베噩\uea30쥎ﶇ飥䶊⋅稱竦", 29 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(this.setImageResource);
        Object[] objArr2 = new Object[1];
        b(TextUtils.getTrimmedLength("") + 17, "\u0010\u0000\u0004\u001b\n\u0018\n  \u0015\u0004\u0015\u0015\u001f\u0014\u0007㖺", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 20), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(this.setZ);
        Object[] objArr3 = new Object[1];
        a("릙橖꓅똩鐔\ue4b7䥓㶽㱪\uf834\ud849돢苚쬘蟽瑨", 16 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr3);
        sb2.append(((String) objArr3[0]).intern());
        sb2.append(this.setTextAlignment);
        Object[] objArr4 = new Object[1];
        b(19 - TextUtils.indexOf((CharSequence) "", '0'), "\u0010\u0000\n\u001e\b\u0016 \n\u000f\u0019\t\u001f\u001b\n\b\t\u0018\t\u0005\t", (byte) (71 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr4);
        sb2.append(((String) objArr4[0]).intern());
        sb2.append(this.setChildDivider);
        Object[] objArr5 = new Object[1];
        b(ExpandableListView.getPackedPositionChild(0L) + 19, "\u0010\u0000\n\u001e\b\u0016 \n\u0010\u0019\u001f\u0006\u0017\u0014\u001f\u0015\t\u0006", (byte) (74 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), objArr5);
        sb2.append(((String) objArr5[0]).intern());
        sb2.append(this.setAlwaysDrawnWithCacheEnabled);
        Object[] objArr6 = new Object[1];
        a("릙橖꓅똩鐔\ue4b7䥓㶽\ue038\udfe8壈进ꯙ捘㣯➇\u0c50䫦稱竦", (ViewConfiguration.getLongPressTimeout() >> 16) + 19, objArr6);
        sb2.append(((String) objArr6[0]).intern());
        sb2.append(this.setOnEditorActionListener);
        Object[] objArr7 = new Object[1];
        a("릙橖벎ߣ\ueef7砮\ue2fd疅汲䒞㝮ꚣ뀉\uf13e\ud849돢苚쬘蟽瑨", 20 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr7);
        sb2.append(((String) objArr7[0]).intern());
        sb2.append(this.setCompoundDrawablePadding);
        Object[] objArr8 = new Object[1];
        b((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 18, "\u0010\u0000\u000f\u001a\b\u0018!\t\u0019\t\u0015\u0002\u0017\u0014\u001f\u0015\t\u0006", (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 12), objArr8);
        sb2.append(((String) objArr8[0]).intern());
        sb2.append(this.getAmountFieldTextColor);
        Object[] objArr9 = new Object[1];
        a("릙橖럲\uf467\udce5\uf42d뀉\uf13e퉳ﰚ錼⏝㛊鯷偕韞纣띩", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 18, objArr9);
        sb2.append(((String) objArr9[0]).intern());
        sb2.append(this.setY);
        Object[] objArr10 = new Object[1];
        a("릙橖럲\uf467\udce5\uf42d뀉\uf13e퉳ﰚ錼⏝碭홑⥄\ued59ﶇ飥䶊⋅稱竦", ExpandableListView.getPackedPositionType(0L) + 21, objArr10);
        sb2.append(((String) objArr10[0]).intern());
        sb2.append(this.setDividerPadding);
        Object[] objArr11 = new Object[1];
        a("릙橖럲\uf467\udce5\uf42d뀉\uf13e퉳ﰚ錼⏝㛊鯷偕韞䒠漌ﶇ飥䶊⋅稱竦", Color.blue(0) + 23, objArr11);
        sb2.append(((String) objArr11[0]).intern());
        sb2.append(this.setX);
        Object[] objArr12 = new Object[1];
        a("릙橖럲\uf467\udce5\uf42d뀉\uf13e퉳ﰚ錼⏝㛊鯷偕韞㺖Ȧ먔样ꝩ붅廱匙", MotionEvent.axisFromString("") + 25, objArr12);
        sb2.append(((String) objArr12[0]).intern());
        sb2.append(this.setOnFocusChangeListener);
        Object[] objArr13 = new Object[1];
        b(19 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u0010\u0000\u0010\u001b\n\u001f!\u0003\u0013\u0012\u001c\u001d\u0003\u0015\u0010\u0019\u001f\u0006㘜", (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 118), objArr13);
        sb2.append(((String) objArr13[0]).intern());
        sb2.append(this.setOnDragListener);
        Object[] objArr14 = new Object[1];
        b(22 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0010\u0000\u0010\u001b\n\u001f!\u0003\u0013\u0012\u001c\u001d\u0003\u0015\u0015\u0002\u0017\u0014\u001f\u0015\t\u0006", (byte) (MotionEvent.axisFromString("") + 64), objArr14);
        sb2.append(((String) objArr14[0]).intern());
        sb2.append(this.setOnLongClickListener);
        Object[] objArr15 = new Object[1];
        a("릙橖胳옊臫㗼\udcd5\u0ca9㧈\ud95c匿ꀗ웳醪\ue038\udfe8壈进\ud849돢苚쬘蟽瑨", 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr15);
        sb2.append(((String) objArr15[0]).intern());
        sb2.append(this.setNavigationOnClickListener);
        Object[] objArr16 = new Object[1];
        a("릙橖胳옊臫㗼\udcd5\u0ca9㧈\ud95c匿ꀗ웳醪\ue038\udfe8壈进ꯙ捘㣯➇\u0c50䫦稱竦", (Process.myTid() >> 22) + 25, objArr16);
        sb2.append(((String) objArr16[0]).intern());
        sb2.append(this.setIncludeFontPadding);
        Object[] objArr17 = new Object[1];
        b(23 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0010\u0000\r\u0019\u0014\u0012\"\u0016\u001b\u001c\t!\u0006\u0013\u0010\u001d㗮㗮!\u0004\u001d\n", (byte) (Gravity.getAbsoluteGravity(0, 0) + 5), objArr17);
        sb2.append(((String) objArr17[0]).intern());
        sb2.append(this.setLayoutDirection);
        Object[] objArr18 = new Object[1];
        a("릙橖間䉷න퓽격㗘閙뻷베噩\uea30쥎ﶇ飥䶊⋅稱竦", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 18, objArr18);
        sb2.append(((String) objArr18[0]).intern());
        sb2.append(this.getSuppressed);
        Object[] objArr19 = new Object[1];
        b(16 - Gravity.getAbsoluteGravity(0, 0), "\u0010\u0000\u0019\u0017\t\u000e\u001a\n!\u001d\r\t\u0003\u0013#\u0006", (byte) (46 - (ViewConfiguration.getPressedStateDuration() >> 16)), objArr19);
        sb2.append(((String) objArr19[0]).intern());
        sb2.append(this.setLayoutAnimation);
        Object[] objArr20 = new Object[1];
        a("릙橖蘆䇹Ự剭䧉갬䵚讘乖㘝ᵃ鴉᱐㬵ᔎ糚ι먢", 20 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr20);
        sb2.append(((String) objArr20[0]).intern());
        sb2.append(this.getNavBarTitleString);
        Object[] objArr21 = new Object[1];
        a("릙橖蘆䇹Ự剭䧉갬\ud849돢苚쬘蟽瑨", 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr21);
        sb2.append(((String) objArr21[0]).intern());
        sb2.append(this.setCompoundDrawableTintBlendMode);
        Object[] objArr22 = new Object[1];
        b(16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0010\u0000\u001c\u0019\u0019\u001d\u0006\u0014\u001c\t\u001d\u0010\u0015\r\u001d\n", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 60), objArr22);
        sb2.append(((String) objArr22[0]).intern());
        sb2.append(this.UiMessageCallbackKtWhenMappings);
        Object[] objArr23 = new Object[1];
        a("릙橖격㗘\ue8f0\uec27蟩⮿펐봪턓ᖯΌꙂ베噩實楟蓳嶥턓ᖯ㸫\ue37b閙뻷␍욣瓕嬡", 30 - View.resolveSize(0, 0), objArr23);
        sb2.append(((String) objArr23[0]).intern());
        sb2.append(this.setMaxEms);
        Object[] objArr24 = new Object[1];
        a("릙橖벎ߣꊭꓜ뀉\uf13e⡨Ǵ魮Ⲕဏ咥\uf2f5쐅컁膝ι먢", 21 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr24);
        sb2.append(((String) objArr24[0]).intern());
        sb2.append(this.setTextScaleX);
        sb2.append(RootService.CLOSE_BRACKET);
        String string = sb2.toString();
        int i10 = E + 81;
        F = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 94 / 0;
        }
        return string;
    }

    @JvmName(name = "setY")
    public final int setY() {
        int i10 = E + 77;
        int i11 = i10 % 128;
        F = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 81;
        E = i13 % 128;
        int i14 = i13 % 2;
        return this.setZ;
    }
}
