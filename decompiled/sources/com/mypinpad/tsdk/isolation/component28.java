package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.ColorInt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.esotericsoftware.asm.Opcodes;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B\u0099\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010K\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010L\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010N\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0003\u0010P\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010Q\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010R\u001a\u00020\u0002\u0012\n\b\u0003\u0010S\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010T\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010W\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010X\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010[\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\\\u001a\u00020\u0005\u0012\u0006\u0010]\u001a\u00020\u001e\u0012\n\b\u0003\u0010^\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010_\u001a\u00020\t\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010G¢\u0006\u0004\bb\u0010cJ\u0010\u0010\u0003\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010&\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\r\u001a\u0004\b%\u0010\u000fR\u001c\u0010)\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b-\u0010\u000fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\r\u001a\u0004\b/\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b\u001d\u0010\"R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0018\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010(\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\r\u001a\u0004\b4\u0010\u000fR\u001c\u00104\u001a\u0004\u0018\u00010\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010 \u001a\u0004\b6\u0010\"R\u001c\u00108\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0018\u001a\u0004\b)\u0010\u0004R\u001c\u0010:\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\r\u001a\u0004\b&\u0010\u000fR\u001a\u0010+\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b#\u0010\u0007R\u001a\u0010%\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b\u001a\u0010?R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\r\u001a\u0004\b:\u0010\u000fR\u001a\u0010/\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b8\u0010CR\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u0018\u001a\u0004\bE\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010G8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b\u0010\u0010J"}, d2 = {"Lcom/mypinpad/tsdk/i/component28;", "", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "p0", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "setOnFocusChangeListener", "()Ljava/lang/Integer;", "setImageResource", "b", "setX", "setZ", "c", "setY", "setAlwaysDrawnWithCacheEnabled", "d", "Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "setOnEditorActionListener", "e", "setDividerPadding", "setTextAlignment", "", "f", "Ljava/lang/Float;", "setOnLongClickListener", "()Ljava/lang/Float;", "getAmountFieldTextColor", "g", "setLayoutAnimation", "setChildDivider", "h", "setOnDragListener", "setTextScaleX", "i", "getNavBarTitleString", "j", "setNavigationOnClickListener", "k", "UiMessageCallbackKtWhenMappings", "l", "m", "n", "o", "setIncludeFontPadding", "p", "setCompoundDrawablePadding", "q", "setMinHeight", "r", "setMaxEms", "s", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "t", "F", "()F", "u", SharedPrefsStorage.VERSION_KEY, "Z", "()Z", "w", "setLayoutDirection", "getSuppressed", "Lcom/mypinpad/tsdk/i/setIndeterminateTintBlendMode;", "x", "Lcom/mypinpad/tsdk/i/setIndeterminateTintBlendMode;", "()Lcom/mypinpad/tsdk/i/setIndeterminateTintBlendMode;", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Integer;IFLjava/lang/Integer;ZLjava/lang/String;Lcom/mypinpad/tsdk/i/setIndeterminateTintBlendMode;)V"}, k = 1, mv = {1, 8, 0})
public final /* data */ class component28 {
    public static final int A;
    public static final boolean B;
    public static final boolean C;
    public static int D;
    public static int E;
    public static int F;
    public static int G;
    public static final byte[] H = null;
    public static final int I = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f54872y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final char[] f54873z;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setImageResource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setZ;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setAlwaysDrawnWithCacheEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String setOnEditorActionListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setTextAlignment;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Float getAmountFieldTextColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setChildDivider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setTextScaleX;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setX;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setOnFocusChangeListener;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Float setDividerPadding;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final String setNavigationOnClickListener;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setOnLongClickListener;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setOnDragListener;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Float setIncludeFontPadding;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String setMinHeight;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setMaxEms;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final int getNavBarTitleString;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final float setLayoutAnimation;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setY;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final boolean UiMessageCallbackKtWhenMappings;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String getSuppressed;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final setIndeterminateTintBlendMode setCompoundDrawablePadding;

    static {
        d();
        F = 0;
        G = 1;
        D = 0;
        E = 1;
        f54872y = -7073277358176292102L;
        B = true;
        C = true;
        A = 1794962239;
        f54873z = new char[]{62283, 62303, 62093, 62110, 62133, 62305, 62129, 62084, 62304, 62092, 62091, 62330, 62099, 62086, 62131, 62082, 62096, 62135, 62137, 62095, 62307, 62090, 62130, 62309, 62083, 62128, 62081, 62100, 62087, 62319, 62097, 62314, 62306, 62134, 62101, 62132};
    }

    public component28(@ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @NotNull String str2, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @Nullable String str3, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @Nullable String str4, @ColorInt @Nullable Integer num11, int i10, float f12, @ColorInt @Nullable Integer num12, boolean z10, @Nullable String str5, @Nullable setIndeterminateTintBlendMode setindeterminatetintblendmode) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.setImageResource = num;
        this.setZ = num2;
        this.setAlwaysDrawnWithCacheEnabled = num3;
        this.setOnEditorActionListener = str;
        this.setTextAlignment = num4;
        this.getAmountFieldTextColor = f6;
        this.setChildDivider = num5;
        this.setTextScaleX = num6;
        this.setCompoundDrawableTintBlendMode = str2;
        this.setX = num7;
        this.setOnFocusChangeListener = num8;
        this.setDividerPadding = f10;
        this.setNavigationOnClickListener = str3;
        this.setOnLongClickListener = num9;
        this.setOnDragListener = num10;
        this.setIncludeFontPadding = f11;
        this.setMinHeight = str4;
        this.setMaxEms = num11;
        this.getNavBarTitleString = i10;
        this.setLayoutAnimation = f12;
        this.setY = num12;
        this.UiMessageCallbackKtWhenMappings = z10;
        this.getSuppressed = str5;
        this.setCompoundDrawablePadding = setindeterminatetintblendmode;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11 = F + 35;
        G = i11 % 128;
        int i12 = i11 % 2;
        char[] charArray = str.toCharArray();
        setOnDragListener setondraglistener = new setOnDragListener();
        long j10 = f54872y;
        char[] y7 = setOnDragListener.setY(2122665171656649951L ^ j10, charArray, i10);
        setondraglistener.setDividerPadding = 4;
        while (true) {
            int i13 = setondraglistener.setDividerPadding;
            if (i13 >= y7.length) {
                objArr[0] = new String(y7, 4, y7.length - 4);
                return;
            }
            int i14 = i13 - 4;
            setondraglistener.setX = i14;
            try {
                Object[] objArr2 = {Long.valueOf(y7[i13] ^ y7[i13 % 4]), Long.valueOf(i14), Long.valueOf(j10)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(2144228148);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (9779 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0) + 44, 3186 - TextUtils.lastIndexOf("", '0', 0));
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod("y", cls2, cls2, cls2);
                    map.put(2144228148, method);
                }
                y7[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setondraglistener, setondraglistener};
                Object method2 = map.get(-62642757);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 51, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3029);
                    byte b10 = (byte) 0;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr4 = new Object[1];
                    c(b10, b11, (byte) (b11 + 1), objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-62642757, method2);
                }
                ((Method) method2).invoke(null, objArr3);
                int i15 = F + 83;
                G = i15 % 128;
                int i16 = i15 % 2;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void b(int i10, String str, Object[] objArr) throws Throwable {
        int i11 = G;
        int i12 = i11 + 85;
        F = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        int i15 = i11 + 61;
        F = i15 % 128;
        int i16 = i15 % 2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        setZ setz = new setZ();
        char[] cArr = f54873z;
        int i17 = I;
        int i18 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = 0;
            while (i19 < length) {
                int i20 = F + 65;
                G = i20 % 128;
                int i21 = i20 % i13;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i19])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1129500232);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (((Process.getThreadPriority(0) + 20) >> 6) + 26288), 64 - (ViewConfiguration.getEdgeSlop() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 1596);
                        byte b10 = (byte) (i17 & 3);
                        byte b11 = (byte) (-b10);
                        Object[] objArr3 = new Object[1];
                        c(b10, b11, (byte) (b11 + 1), objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1129500232, method);
                    }
                    cArr2[i19] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i19++;
                    i13 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i22 = G + 87;
            F = i22 % 128;
            int i23 = i22 % 2;
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(A)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(1019674483);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.getOffsetBefore("", 0) + 10744), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 43, 566 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)));
            byte b12 = (byte) 3;
            byte b13 = (byte) (b12 - 4);
            Object[] objArr5 = new Object[1];
            c(b12, b13, (byte) (b13 + 1), objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(1019674483, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
        if (!C) {
            if (!B) {
                throw null;
            }
            throw null;
        }
        int length2 = bytes.length;
        setz.setOnFocusChangeListener = length2;
        char[] cArr3 = new char[length2];
        setz.setDividerPadding = 0;
        while (true) {
            int i24 = setz.setDividerPadding;
            int i25 = setz.setOnFocusChangeListener;
            if (i24 >= i25) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i24] = (char) (cArr[bytes[(i25 - 1) - i24] + i10] - iIntValue);
            Object[] objArr6 = new Object[2];
            objArr6[1] = setz;
            objArr6[i18] = setz;
            Map map3 = setTextScaleX.setMaxEms;
            Object method3 = map3.get(-1539766653);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 50 - TextUtils.indexOf((CharSequence) "", '0', i18, i18), 2880 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                byte b14 = (byte) (-1);
                Object[] objArr7 = new Object[1];
                c((byte) (i17 & 31), b14, (byte) (b14 + 1), objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map3.put(-1539766653, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i18 = 0;
        }
    }

    public static void c(int i10, int i11, short s4, Object[] objArr) {
        int i12 = i11 + 4;
        int i13 = s4 * 3;
        int i14 = i10 + 117;
        byte[] bArr = new byte[1 - i13];
        int i15 = 0 - i13;
        byte[] bArr2 = H;
        int i16 = -1;
        if (bArr2 == null) {
            i14 += i15;
            i15 = i15;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            bArr[i17] = (byte) i14;
            if (i17 == i15) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i12++;
            i14 = bArr2[i12] + i14;
            i15 = i15;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i16 = i17;
        }
    }

    public static void d() {
        H = new byte[]{115, MessageUtils.MESSAGE_30_RS, -113, MessageUtils.MESSAGE_21_NAK};
        I = Opcodes.MULTIANEWARRAY;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * 702) + (i10 * (-700));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = ((~(i14 | i15)) * 701) + i13;
        int i17 = (i15 * 701) + ((i14 | i11) * (-701)) + i16;
        if (i17 == 1) {
            component28 component28Var = (component28) objArr[0];
            int i18 = E + 65;
            D = i18 % 128;
            int i19 = i18 % 2;
            Integer num = component28Var.setOnFocusChangeListener;
            if (i19 == 0) {
                return num;
            }
            int i20 = 18 / 0;
            return num;
        }
        if (i17 == 2) {
            component28 component28Var2 = (component28) objArr[0];
            int i21 = D + 91;
            E = i21 % 128;
            int i22 = i21 % 2;
            String str = component28Var2.setNavigationOnClickListener;
            if (i22 != 0) {
                return str;
            }
            int i23 = 23 / 0;
            return str;
        }
        if (i17 == 3) {
            component28 component28Var3 = (component28) objArr[0];
            int i24 = D;
            int i25 = i24 + 53;
            E = i25 % 128;
            int i26 = i25 % 2;
            String str2 = component28Var3.setOnEditorActionListener;
            if (i26 == 0) {
                throw null;
            }
            int i27 = i24 + 51;
            E = i27 % 128;
            if (i27 % 2 != 0) {
                return str2;
            }
            int i28 = 66 / 0;
            return str2;
        }
        if (i17 == 4) {
            component28 component28Var4 = (component28) objArr[0];
            int i29 = D;
            int i30 = i29 + 37;
            E = i30 % 128;
            int i31 = i30 % 2;
            Integer num2 = component28Var4.setX;
            int i32 = i29 + 79;
            E = i32 % 128;
            int i33 = i32 % 2;
            return num2;
        }
        component28 component28Var5 = (component28) objArr[0];
        int i34 = D;
        int i35 = i34 + 109;
        E = i35 % 128;
        int i36 = i35 % 2;
        Integer num3 = component28Var5.setTextAlignment;
        if (i36 == 0) {
            throw null;
        }
        int i37 = i34 + 19;
        E = i37 % 128;
        int i38 = i37 % 2;
        return num3;
    }

    @JvmName(name = "UiMessageCallbackKtWhenMappings")
    @Nullable
    public final Integer UiMessageCallbackKtWhenMappings() {
        return (Integer) setY(new Object[]{this}, -1783073287, 1783073288, System.identityHashCode(this));
    }

    public final boolean equals(@Nullable Object p4) {
        if (this == p4) {
            return true;
        }
        if (!(p4 instanceof component28)) {
            return false;
        }
        component28 component28Var = (component28) p4;
        if (!Intrinsics.areEqual(this.setImageResource, component28Var.setImageResource) || !Intrinsics.areEqual(this.setZ, component28Var.setZ) || !Intrinsics.areEqual(this.setAlwaysDrawnWithCacheEnabled, component28Var.setAlwaysDrawnWithCacheEnabled)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.setOnEditorActionListener, component28Var.setOnEditorActionListener)) {
            int i10 = D + 19;
            E = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.setTextAlignment, component28Var.setTextAlignment)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.getAmountFieldTextColor, (Object) component28Var.getAmountFieldTextColor)) {
            int i11 = E + 53;
            D = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.setChildDivider, component28Var.setChildDivider)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.setTextScaleX, component28Var.setTextScaleX)) {
            int i13 = E + 27;
            D = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.setCompoundDrawableTintBlendMode, component28Var.setCompoundDrawableTintBlendMode) || !Intrinsics.areEqual(this.setX, component28Var.setX) || !Intrinsics.areEqual(this.setOnFocusChangeListener, component28Var.setOnFocusChangeListener) || !Intrinsics.areEqual((Object) this.setDividerPadding, (Object) component28Var.setDividerPadding) || !Intrinsics.areEqual(this.setNavigationOnClickListener, component28Var.setNavigationOnClickListener) || !Intrinsics.areEqual(this.setOnLongClickListener, component28Var.setOnLongClickListener)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.setOnDragListener, component28Var.setOnDragListener)) {
            int i15 = D + 23;
            E = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.setIncludeFontPadding, (Object) component28Var.setIncludeFontPadding) || !Intrinsics.areEqual(this.setMinHeight, component28Var.setMinHeight)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.setMaxEms, component28Var.setMaxEms)) {
            int i17 = D + 83;
            E = i17 % 128;
            int i18 = i17 % 2;
            return false;
        }
        if (this.getNavBarTitleString != component28Var.getNavBarTitleString || Float.compare(this.setLayoutAnimation, component28Var.setLayoutAnimation) != 0) {
            return false;
        }
        if (!Intrinsics.areEqual(this.setY, component28Var.setY)) {
            int i19 = E + 85;
            D = i19 % 128;
            int i20 = i19 % 2;
            return false;
        }
        if (this.UiMessageCallbackKtWhenMappings != component28Var.UiMessageCallbackKtWhenMappings) {
            return false;
        }
        if (Intrinsics.areEqual(this.getSuppressed, component28Var.getSuppressed)) {
            return Intrinsics.areEqual(this.setCompoundDrawablePadding, component28Var.setCompoundDrawablePadding);
        }
        int i21 = D + 23;
        E = i21 % 128;
        int i22 = i21 % 2;
        return false;
    }

    @JvmName(name = "getAmountFieldTextColor")
    public final int getAmountFieldTextColor() {
        int i10 = D + 97;
        int i11 = i10 % 128;
        E = i11;
        if (i10 % 2 == 0) {
            int i12 = 87 / 0;
        }
        int i13 = i11 + 17;
        D = i13 % 128;
        int i14 = i13 % 2;
        return this.getNavBarTitleString;
    }

    @JvmName(name = "getNavBarTitleString")
    @NotNull
    public final String getNavBarTitleString() {
        int i10 = E + 59;
        int i11 = i10 % 128;
        D = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i12 = i11 + 27;
        E = i12 % 128;
        int i13 = i12 % 2;
        return this.setCompoundDrawableTintBlendMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39, types: [int] */
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i10 = E + 123;
        D = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        Integer num = this.setImageResource;
        int iHashCode6 = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.setZ;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.setAlwaysDrawnWithCacheEnabled;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.setOnEditorActionListener;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.setTextAlignment;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f6 = this.getAmountFieldTextColor;
        if (f6 == null) {
            int i11 = E + 105;
            D = i11 % 128;
            int i12 = i11 % 2;
            iHashCode = 0;
        } else {
            iHashCode = f6.hashCode();
        }
        int i13 = (iHashCode10 + iHashCode) * 31;
        Integer num5 = this.setChildDivider;
        int iHashCode11 = (i13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.setTextScaleX;
        int iHashCode12 = (this.setCompoundDrawableTintBlendMode.hashCode() + ((iHashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31)) * 31;
        Integer num7 = this.setX;
        int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.setOnFocusChangeListener;
        int iHashCode14 = (iHashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Float f10 = this.setDividerPadding;
        if (f10 == null) {
            int i14 = E + 105;
            D = i14 % 128;
            int i15 = i14 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = f10.hashCode();
        }
        int i16 = (iHashCode14 + iHashCode2) * 31;
        String str2 = this.setNavigationOnClickListener;
        if (str2 == null) {
            int i17 = D + 31;
            E = i17 % 128;
            int i18 = i17 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str2.hashCode();
        }
        int i19 = (i16 + iHashCode3) * 31;
        Integer num9 = this.setOnLongClickListener;
        int iHashCode15 = (i19 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.setOnDragListener;
        if (num10 == null) {
            int i20 = E;
            int i21 = i20 + 101;
            D = i21 % 128;
            int i22 = i21 % 2;
            int i23 = i20 + 113;
            D = i23 % 128;
            int i24 = i23 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = num10.hashCode();
        }
        int i25 = (iHashCode15 + iHashCode4) * 31;
        ?? r1 = 1;
        Float f11 = this.setIncludeFontPadding;
        if (f11 == null) {
            int i26 = E + 121;
            D = i26 % 128;
            iHashCode5 = i26 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode5 = f11.hashCode();
        }
        int i27 = (i25 + iHashCode5) * 31;
        String str3 = this.setMinHeight;
        int iHashCode16 = (i27 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num11 = this.setMaxEms;
        int iA = z1.a(this.setLayoutAnimation, (((iHashCode16 + (num11 == null ? 0 : num11.hashCode())) * 31) + this.getNavBarTitleString) * 31, 31);
        Integer num12 = this.setY;
        int iHashCode17 = (iA + (num12 == null ? 0 : num12.hashCode())) * 31;
        boolean z10 = this.UiMessageCallbackKtWhenMappings;
        if (z10) {
            int i28 = E + 83;
            D = i28 % 128;
            int i29 = i28 % 2;
        } else {
            r1 = z10;
        }
        int i30 = (iHashCode17 + r1) * 31;
        String str4 = this.getSuppressed;
        int iHashCode18 = (i30 + (str4 == null ? 0 : str4.hashCode())) * 31;
        setIndeterminateTintBlendMode setindeterminatetintblendmode = this.setCompoundDrawablePadding;
        return iHashCode18 + (setindeterminatetintblendmode != null ? setindeterminatetintblendmode.hashCode() : 0);
    }

    @JvmName(name = "setAlwaysDrawnWithCacheEnabled")
    @Nullable
    public final Integer setAlwaysDrawnWithCacheEnabled() {
        int i10 = D + 49;
        int i11 = i10 % 128;
        E = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 113;
        D = i13 % 128;
        int i14 = i13 % 2;
        return this.setOnLongClickListener;
    }

    @JvmName(name = "setChildDivider")
    @Nullable
    public final Integer setChildDivider() {
        int i10 = D;
        int i11 = i10 + 95;
        E = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 97;
        E = i13 % 128;
        if (i13 % 2 != 0) {
            return this.setMaxEms;
        }
        throw null;
    }

    @JvmName(name = "setCompoundDrawablePadding")
    @Nullable
    public final Float setCompoundDrawablePadding() {
        int i10 = E;
        int i11 = i10 + 107;
        D = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 35;
        D = i13 % 128;
        if (i13 % 2 == 0) {
            return this.setIncludeFontPadding;
        }
        throw null;
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @Nullable
    public final String setCompoundDrawableTintBlendMode() {
        return (String) setY(new Object[]{this}, 437400864, -437400861, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final Integer setDividerPadding() {
        return (Integer) setY(new Object[]{this}, 195057493, -195057493, System.identityHashCode(this));
    }

    @JvmName(name = "setImageResource")
    @Nullable
    public final setIndeterminateTintBlendMode setImageResource() {
        int i10 = D;
        int i11 = i10 + 37;
        E = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 35;
        E = i13 % 128;
        if (i13 % 2 != 0) {
            return this.setCompoundDrawablePadding;
        }
        throw null;
    }

    @JvmName(name = "setIncludeFontPadding")
    @Nullable
    public final Integer setIncludeFontPadding() {
        int i10 = E + 13;
        int i11 = i10 % 128;
        D = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 47;
        E = i13 % 128;
        if (i13 % 2 != 0) {
            return this.setOnDragListener;
        }
        throw null;
    }

    @JvmName(name = "setLayoutAnimation")
    @Nullable
    public final Integer setLayoutAnimation() {
        int i10 = D + 97;
        int i11 = i10 % 128;
        E = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 59;
        D = i13 % 128;
        int i14 = i13 % 2;
        Integer num = this.setChildDivider;
        if (i14 != 0) {
            int i15 = 31 / 0;
        }
        return num;
    }

    @JvmName(name = "setLayoutDirection")
    @Nullable
    public final String setLayoutDirection() {
        int i10 = D + 3;
        int i11 = i10 % 128;
        E = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 69;
        D = i13 % 128;
        if (i13 % 2 == 0) {
            return this.getSuppressed;
        }
        throw null;
    }

    @JvmName(name = "setMaxEms")
    @Nullable
    public final Integer setMaxEms() {
        int i10 = E + 47;
        int i11 = i10 % 128;
        D = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 13;
        E = i13 % 128;
        int i14 = i13 % 2;
        return this.setY;
    }

    @JvmName(name = "setMinHeight")
    public final boolean setMinHeight() {
        int i10 = D + 19;
        E = i10 % 128;
        if (i10 % 2 != 0) {
            return this.UiMessageCallbackKtWhenMappings;
        }
        throw null;
    }

    @JvmName(name = "setNavigationOnClickListener")
    @Nullable
    public final Integer setNavigationOnClickListener() {
        return (Integer) setY(new Object[]{this}, 1625124627, -1625124623, System.identityHashCode(this));
    }

    @JvmName(name = "setOnDragListener")
    @Nullable
    public final Integer setOnDragListener() {
        int i10 = D + 79;
        int i11 = i10 % 128;
        E = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        int i12 = i11 + 103;
        D = i12 % 128;
        if (i12 % 2 == 0) {
            return this.setTextScaleX;
        }
        throw null;
    }

    @JvmName(name = "setOnEditorActionListener")
    public final float setOnEditorActionListener() {
        int i10 = D;
        int i11 = i10 + 105;
        E = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 105;
        E = i12 % 128;
        int i13 = i12 % 2;
        return this.setLayoutAnimation;
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final Integer setOnFocusChangeListener() {
        int i10 = D;
        int i11 = i10 + 17;
        E = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 121;
        E = i13 % 128;
        if (i13 % 2 != 0) {
            return this.setImageResource;
        }
        throw null;
    }

    @JvmName(name = "setOnLongClickListener")
    @Nullable
    public final Float setOnLongClickListener() {
        int i10 = D + 95;
        int i11 = i10 % 128;
        E = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 59;
        D = i13 % 128;
        if (i13 % 2 == 0) {
            return this.getAmountFieldTextColor;
        }
        throw null;
    }

    @JvmName(name = "setTextAlignment")
    @Nullable
    public final Float setTextAlignment() {
        int i10 = D + 73;
        E = i10 % 128;
        if (i10 % 2 != 0) {
            return this.setDividerPadding;
        }
        throw null;
    }

    @JvmName(name = "setTextScaleX")
    @Nullable
    public final String setTextScaleX() {
        int i10 = D;
        int i11 = i10 + 25;
        E = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 123;
        E = i13 % 128;
        if (i13 % 2 != 0) {
            return this.setMinHeight;
        }
        throw null;
    }

    @JvmName(name = "setX")
    @Nullable
    public final Integer setX() {
        int i10 = E + 79;
        D = i10 % 128;
        if (i10 % 2 == 0) {
            return this.setZ;
        }
        throw null;
    }

    @JvmName(name = "setZ")
    @Nullable
    public final String setZ() {
        return (String) setY(new Object[]{this}, -1134961482, 1134961484, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("ˡʱ魱Խ튰\uee94䵟稚趬靽娿쐒\uf3acᑿ쎉岄欻鳹䣵팣\ue0c3᭥\uf07a⮫塪或禒ꉝ퇭\uea8d\ue122㫯亞焂暣녴옂率\uee12ࠝ㾧䀕", 1 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(this.setImageResource);
        Object[] objArr2 = new Object[1];
        a("ĮĂᦕ螐蛈뫥夗秔ཉ茝้큿\uf06a隚韰䣉棽Ḙ\u1c8c을\ue343", Color.blue(0) + 1, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(this.setZ);
        Object[] objArr3 = new Object[1];
        b(Color.green(0) + 127, "\u008c\u0087\u008a\u008b\u008a\u0089\u0088\u0086\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0081", objArr3);
        sb2.append(((String) objArr3[0]).intern());
        sb2.append(this.setAlwaysDrawnWithCacheEnabled);
        Object[] objArr4 = new Object[1];
        b(View.MeasureSpec.getMode(0) + 127, "\u008c\u0088\u0083\u008e\u0087\u008f\u0091\u0090\u008b\u008f\u008e\u008d\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0081", objArr4);
        sb2.append(((String) objArr4[0]).intern());
        sb2.append(this.setOnEditorActionListener);
        Object[] objArr5 = new Object[1];
        b(126 - ImageFormat.getBitsPerPixel(0), "\u008c\u0087\u008a\u008b\u008a\u0089\u008f\u0092\u0090\u008d\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
        sb2.append(((String) objArr5[0]).intern());
        sb2.append(this.setTextAlignment);
        Object[] objArr6 = new Object[1];
        b((ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u008c\u0094\u0091\u0090\u0093\u008e\u0091\u008f\u0092\u0090\u008d\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0081", objArr6);
        sb2.append(((String) objArr6[0]).intern());
        sb2.append(this.getAmountFieldTextColor);
        Object[] objArr7 = new Object[1];
        a("讁训茚ᴟ瘅䨿ႉ\uf37b闧쪏ﺈ駫竀ణ朙ű\ue253蒏\uec7a軋榽̀哗瘍", View.MeasureSpec.makeMeasureSpec(0, 0) + 1, objArr7);
        sb2.append(((String) objArr7[0]).intern());
        sb2.append(this.setChildDivider);
        Object[] objArr8 = new Object[1];
        b(127 - (KeyEvent.getMaxKeyCode() >> 16), "\u008c\u0087\u008a\u008b\u008a\u0089\u0088\u0086\u008f\u008e\u0088\u008e\u0095\u0083\u008e\u0094\u0082\u0081", objArr8);
        sb2.append(((String) objArr8[0]).intern());
        sb2.append(this.setTextScaleX);
        Object[] objArr9 = new Object[1];
        b(127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "\u008c\u008f\u0092\u0090\u008d\u0099\u008b\u0090\u008e\u0098\u008f\u0083\u0097\u008a\u0096\u0084\u0082\u0081", objArr9);
        sb2.append(((String) objArr9[0]).intern());
        sb2.append(this.setCompoundDrawableTintBlendMode);
        Object[] objArr10 = new Object[1];
        a("蛚蛶鸶3샆ﳭ㫗︡裺\ue0d5䡝뎢瞴ᄒ퇺⬮\uef02馕媌꒽擥ḯ\ue218尘\udc03", 1 - Color.argb(0, 0, 0, 0), objArr10);
        sb2.append(((String) objArr10[0]).intern());
        sb2.append(this.setX);
        Object[] objArr11 = new Object[1];
        a("솃솯섩弬ὰ⍛撍른ퟥ뺏韫\uedf8ロ不์畴ꡛ욜蔸\ufadc⎧䄟㶮ɜ鬈㡒둈", -ImageFormat.getBitsPerPixel(0), objArr11);
        sb2.append(((String) objArr11[0]).intern());
        sb2.append(this.setOnFocusChangeListener);
        Object[] objArr12 = new Object[1];
        a("褘褴홝䡘晉婢繥\uf1e3삑ꑧ\ueed2\uf710硶她睵澜\ue0c0퇨ﰁ\ue034欼噻䒑ᢢ펙⼇촼鄉", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1, objArr12);
        sb2.append(((String) objArr12[0]).intern());
        sb2.append(this.setDividerPadding);
        Object[] objArr13 = new Object[1];
        b((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, "\u008c\u008f\u0092\u0090\u008d\u0099\u008b\u0090\u008e\u0098\u009a\u008b\u008e\u0084\u008f\u0090\u0099\u0082\u0081", objArr13);
        sb2.append(((String) objArr13[0]).intern());
        sb2.append(this.setNavigationOnClickListener);
        Object[] objArr14 = new Object[1];
        a("\uf2c5\uf2e9汚\uf25f쪪\uf684ဤ訥窂쨮䈳饁Ξ\ue351\udb9fǜ鬕毟僀蹢ზ\uec40\ue872盾ꡓ镮", Drawable.resolveOpacity(0, 0) + 1, objArr14);
        sb2.append(((String) objArr14[0]).intern());
        sb2.append(this.setOnLongClickListener);
        Object[] objArr15 = new Object[1];
        b(127 - ExpandableListView.getPackedPositionGroup(0L), "\u008c\u0087\u008a\u008b\u008a\u0089\u008f\u0092\u0090\u008d\u0099\u008b\u0090\u008e\u0098\u009a\u008b\u008e\u0084\u008f\u0090\u0099\u0082\u0081", objArr15);
        sb2.append(((String) objArr15[0]).intern());
        sb2.append(this.setOnDragListener);
        Object[] objArr16 = new Object[1];
        a("\uf117\uf13b쥲坷鎔꾺绥觷\udfaaꓯᬍ\uf780L䙹芡漝飇컷২\ue0a1ጿ䥳녳ᠹꮉ〞㣇里≒", TextUtils.getOffsetBefore("", 0) + 1, objArr16);
        sb2.append(((String) objArr16[0]).intern());
        sb2.append(this.setIncludeFontPadding);
        Object[] objArr17 = new Object[1];
        a("㍯㍃⺏낊涱冏捫䮔㡰륫\ue534\uea1f숃ꆫ粚犕媧⤝\uf7c4ﴥ테꺉佴ֳ槮ힻ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, objArr17);
        sb2.append(((String) objArr17[0]).intern());
        sb2.append(this.setMinHeight);
        Object[] objArr18 = new Object[1];
        b(127 - ExpandableListView.getPackedPositionType(0L), "\u008c\u0087\u008a\u008b\u008a\u0089\u0087\u0084\u0086\u009a\u009a\u0090\u0087\u0088\u008a\u0087\u0094\u0082\u0081", objArr18);
        sb2.append(((String) objArr18[0]).intern());
        sb2.append(this.setMaxEms);
        Object[] objArr19 = new Object[1];
        b(127 - View.resolveSize(0, 0), "\u008c\u0092\u009e\u009d\u008f\u0099\u008e\u009c\u0087\u0090\u0099\u0087\u008a\u009b\u0082\u0081", objArr19);
        sb2.append(((String) objArr19[0]).intern());
        sb2.append(this.getNavBarTitleString);
        Object[] objArr20 = new Object[1];
        b(View.MeasureSpec.getSize(0) + 127, "\u008c\u009a\u0097\u008e\u0099\u0084\u009f\u0099\u0083\u0097\u008a\u009f\u0087\u0090\u0099\u0087\u008a\u009b\u0082\u0081", objArr20);
        sb2.append(((String) objArr20[0]).intern());
        sb2.append(this.setLayoutAnimation);
        Object[] objArr21 = new Object[1];
        a("䢚䢶\ueb5f畚乛牳Ūぼﶂ\udb6a웈蠛맱摽彭႒⅔\uec83", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr21);
        sb2.append(((String) objArr21[0]).intern());
        sb2.append(this.setY);
        Object[] objArr22 = new Object[1];
        b(127 - (ViewConfiguration.getScrollBarSize() >> 8), "\u008c\u0090\u0099\u008a \u0090\u0085\u008e\u009a\u0087\u0090\u0096\u0096\u008e\u0082\u0081", objArr22);
        sb2.append(((String) objArr22[0]).intern());
        sb2.append(this.UiMessageCallbackKtWhenMappings);
        Object[] objArr23 = new Object[1];
        a("䣅䣩ᥗ蝒怾将\uf605〧ྋⰏ\ue8b9罠릾陣焇\ue7ecℜớ既桅ꫧ饶䋳郑ቒ\ue02a쭥᤹鯎梹厥膏Ҭ\uf35b", Color.green(0) + 1, objArr23);
        sb2.append(((String) objArr23[0]).intern());
        sb2.append(this.getSuppressed);
        Object[] objArr24 = new Object[1];
        b(TextUtils.lastIndexOf("", '0', 0) + 128, "\u008c\u009a\u008f\u0087\u008a\u0094¤\u0090\u008e£¢\u0087\u008f\u0083¡\u0083\u008e\u0094\u0082\u0081", objArr24);
        sb2.append(((String) objArr24[0]).intern());
        sb2.append(this.setCompoundDrawablePadding);
        sb2.append(RootService.CLOSE_BRACKET);
        String string = sb2.toString();
        int i10 = D + 71;
        E = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    @JvmName(name = "setY")
    @Nullable
    public final Integer setY() {
        int i10 = E + 23;
        D = i10 % 128;
        if (i10 % 2 == 0) {
            return this.setAlwaysDrawnWithCacheEnabled;
        }
        throw null;
    }
}
