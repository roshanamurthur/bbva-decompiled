package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.mypinpad.tsdk.api.models.PinPadType;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0007\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b&\b\u0080\b\u0018\u00002\u00020\u0001B\u0081\u0003\u0012\u0006\u0010\t\u001a\u00020\r\u0012\n\b\u0001\u0010\\\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010]\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010^\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010`\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010a\u001a\u0004\u0018\u00010$\u0012\n\b\u0001\u0010b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010c\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010f\u001a\u0004\u0018\u00010$\u0012\n\b\u0001\u0010g\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010h\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010i\u001a\u0004\u0018\u00010$\u0012\n\b\u0001\u0010j\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010l\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010m\u001a\u0004\u0018\u00010$\u0012\n\b\u0001\u0010n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010o\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010p\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010q\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010s\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010u\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010v\u001a\u0004\u0018\u00010$\u0012\b\u0010w\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010x\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010y\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010z\u001a\u00020\n\u0012\b\u0010{\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010|\u001a\u0004\u0018\u00010X¢\u0006\u0004\b}\u0010~J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u0015R\u001c\u0010)\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010,\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0013\u001a\u0004\b+\u0010\u0015R\u001c\u0010/\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0013\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u0013\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010\u0013\u001a\u0004\b3\u0010\u0015R\u001c\u0010\u0014\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010&\u001a\u0004\b5\u0010(R\u001c\u0010+\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0013\u001a\u0004\b7\u0010\u0015R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u0013\u001a\u0004\b9\u0010\u0015R\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010&\u001a\u0004\b;\u0010(R\u001c\u0010=\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010@\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u0013\u001a\u0004\b?\u0010\u0015R\u001c\u0010B\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010E\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010&\u001a\u0004\bD\u0010(R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u0013\u001a\u0004\b#\u0010\u0015R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010\u001e\u001a\u0004\b=\u0010\u0004R\u001c\u0010.\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001c\u00101\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u001e\u001a\u0004\b,\u0010\u0004R\u001c\u00103\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010\u0013\u001a\u0004\b/\u0010\u0015R\u001c\u0010D\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\u001e\u001a\u0004\b)\u0010\u0004R\u0013\u00109\u001a\u0004\u0018\u00010\u0005X\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0013\u0010;\u001a\u0004\u0018\u00010\u0005X\u0007¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u001c\u00107\u001a\u0004\u0018\u00010$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010&\u001a\u0004\bE\u0010(R\u001c\u00105\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\u0013\u001a\u0004\bB\u0010\u0015R\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010\u001e\u001a\u0004\bO\u0010\u0004R\u001c\u0010R\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010\u0013\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010?\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\b@\u0010UR\u001c\u0010W\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010\u001e\u001a\u0004\bP\u0010\u0004R\u001c\u0010O\u001a\u0004\u0018\u00010X8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\bW\u0010["}, d2 = {"Lcom/mypinpad/tsdk/i/sk;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "", GenerateActivationFormCommand.HASH_CODE, "()I", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/mypinpad/tsdk/api/models/PinPadType;", "Lcom/mypinpad/tsdk/api/models/PinPadType;", "setY", "()Lcom/mypinpad/tsdk/api/models/PinPadType;", "setCursorVisible", "q0", "Ljava/lang/Integer;", "setDividerPadding", "()Ljava/lang/Integer;", "setAdapter", "r0", "setCompoundDrawableTintBlendMode", "setChildDivider", "s0", "setX", "setCompoundDrawablePadding", "t0", "Ljava/lang/String;", "setOnFocusChangeListener", "setMaxEms", "u0", "setNavigationOnClickListener", "getAmountFieldTextColor", "", "v0", "Ljava/lang/Float;", "setOnLongClickListener", "()Ljava/lang/Float;", "setMinHeight", "w0", "setOnDragListener", "setImageResource", "x0", "getNavBarTitleString", "setLayoutDirection", "y0", "setLayoutAnimation", "E0", "setZ", "F0", "setIncludeFontPadding", "G0", "setAlwaysDrawnWithCacheEnabled", "H0", "UiMessageCallbackKtWhenMappings", "I0", "setTextAlignment", "J0", "getSuppressed", "K0", "setOnEditorActionListener", "setTextSelectHandleRight", "L0", "TransactionResult", "M0", "setTextScaleX", "printStackTrace", "N0", "O0", "P0", "Q0", "R0", "S0", "T0", "U0", "V0", "setViewTranslationCallback", "setCacheColorHint", "W0", "setEllipsize", "X0", "Z", "()Z", "Y0", "setScroller", "Lcom/mypinpad/tsdk/i/sp;", "Z0", "Lcom/mypinpad/tsdk/i/sp;", "()Lcom/mypinpad/tsdk/i/sp;", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "p30", "p31", "p32", "p33", "<init>", "(Lcom/mypinpad/tsdk/api/models/PinPadType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;Lcom/mypinpad/tsdk/i/sp;)V"}, k = 1, mv = {1, 8, 0})
public final /* data */ class sk implements Serializable {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final char[] f60875a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final char f60876b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static int f60877c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static int f60878d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static int f60879e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static int f60880f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final byte[] f60881g1 = null;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final int f60882h1 = 0;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @Nullable
    public final Integer setX;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @Nullable
    public final Float setDividerPadding;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @Nullable
    public final Integer setOnDragListener;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @Nullable
    public final Integer setNavigationOnClickListener;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @Nullable
    public final Float setOnLongClickListener;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @Nullable
    public final Integer getSuppressed;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @Nullable
    public final Integer setTextSelectHandleRight;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @Nullable
    public final Integer TransactionResult;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @Nullable
    public final Float printStackTrace;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @Nullable
    public final Integer setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @Nullable
    public final String setOnFocusChangeListener;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @Nullable
    public final Integer getNavBarTitleString;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @Nullable
    public final String setLayoutAnimation;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @Nullable
    public final Integer setZ;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @Nullable
    public final String setTextScaleX;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @Nullable
    public final Float setAlwaysDrawnWithCacheEnabled;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @Nullable
    public final Integer setIncludeFontPadding;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @Nullable
    public final String setCacheColorHint;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @Nullable
    public final Integer setEllipsize;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    public final boolean setOnEditorActionListener;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    @Nullable
    public final String setScroller;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @Nullable
    public final sp setViewTranslationCallback;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PinPadType setCursorVisible;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setAdapter;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setChildDivider;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setCompoundDrawablePadding;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @Nullable
    public Integer UiMessageCallbackKtWhenMappings;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @Nullable
    public Integer setTextAlignment;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String setMaxEms;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer getAmountFieldTextColor;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @Nullable
    public final Float setMinHeight;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setImageResource;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setLayoutDirection;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setY;

    static {
        b();
        f60879e1 = 0;
        f60880f1 = 1;
        f60877c1 = 0;
        f60878d1 = 1;
        f60876b1 = (char) 53955;
        f60875a1 = new char[]{59179, 59178, 59192, 59181};
    }

    public sk(@NotNull PinPadType pinPadType, @ColorInt @Nullable Integer num, @ColorInt @Nullable Integer num2, @ColorInt @Nullable Integer num3, @Nullable String str, @ColorInt @Nullable Integer num4, @Nullable Float f6, @ColorInt @Nullable Integer num5, @ColorInt @Nullable Integer num6, @ColorInt @Nullable Integer num7, @ColorInt @Nullable Integer num8, @Nullable Float f10, @ColorInt @Nullable Integer num9, @ColorInt @Nullable Integer num10, @Nullable Float f11, @ColorInt @Nullable Integer num11, @ColorInt @Nullable Integer num12, @ColorInt @Nullable Integer num13, @Nullable Float f12, @DrawableRes @Nullable Integer num14, @Nullable String str2, @DrawableRes @Nullable Integer num15, @Nullable String str3, @DrawableRes @Nullable Integer num16, @Nullable String str4, @ColorInt @Nullable Integer num17, @ColorInt @Nullable Integer num18, @Nullable Float f13, @Nullable Integer num19, @Nullable String str5, @ColorInt @Nullable Integer num20, boolean z10, @Nullable String str6, @Nullable sp spVar) {
        Intrinsics.checkNotNullParameter(pinPadType, "");
        this.setCursorVisible = pinPadType;
        this.setAdapter = num;
        this.setChildDivider = num2;
        this.setCompoundDrawablePadding = num3;
        this.setMaxEms = str;
        this.getAmountFieldTextColor = num4;
        this.setMinHeight = f6;
        this.setImageResource = num5;
        this.setLayoutDirection = num6;
        this.setY = num7;
        this.setX = num8;
        this.setDividerPadding = f10;
        this.setOnDragListener = num9;
        this.setNavigationOnClickListener = num10;
        this.setOnLongClickListener = f11;
        this.getSuppressed = num11;
        this.setTextSelectHandleRight = num12;
        this.TransactionResult = num13;
        this.printStackTrace = f12;
        this.setCompoundDrawableTintBlendMode = num14;
        this.setOnFocusChangeListener = str2;
        this.getNavBarTitleString = num15;
        this.setLayoutAnimation = str3;
        this.setZ = num16;
        this.setTextScaleX = str4;
        this.UiMessageCallbackKtWhenMappings = num17;
        this.setTextAlignment = num18;
        this.setAlwaysDrawnWithCacheEnabled = f13;
        this.setIncludeFontPadding = num19;
        this.setCacheColorHint = str5;
        this.setEllipsize = num20;
        this.setOnEditorActionListener = z10;
        this.setScroller = str6;
        this.setViewTranslationCallback = spVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = 1 - r9
            int r7 = 106 - r7
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = new byte[r9]
            byte[] r1 = com.mypinpad.tsdk.isolation.sk.f60881g1
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L33
        L18:
            r3 = r2
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r5
            if (r4 != r9) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L2a:
            r3 = r1[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L33:
            int r7 = r7 + r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.sk.a(int, int, short, java.lang.Object[]):void");
    }

    public static void b() {
        f60881g1 = new byte[]{120, 57, -32, 115};
        f60882h1 = 231;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
        int i14 = ~i12;
        int i15 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i14 | i11)) | i10) * (-1042)) + i13;
        int i16 = ~i10;
        switch ((((~(i10 | i14 | i11)) | (~(i12 | i16)) | (~((~i11) | i16))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i15) {
            case 1:
                sk skVar = (sk) objArr[0];
                int i17 = f60878d1 + 15;
                f60877c1 = i17 % 128;
                int i18 = i17 % 2;
                obj = skVar.setOnDragListener;
                if (i18 != 0) {
                    throw null;
                }
                return obj;
            case 2:
                sk skVar2 = (sk) objArr[0];
                int i19 = f60877c1 + 81;
                int i20 = i19 % 128;
                f60878d1 = i20;
                int i21 = i19 % 2;
                obj = skVar2.setMaxEms;
                if (i21 == 0) {
                    throw null;
                }
                int i22 = i20 + 27;
                f60877c1 = i22 % 128;
                int i23 = i22 % 2;
                return obj;
            case 3:
                sk skVar3 = (sk) objArr[0];
                int i24 = f60878d1;
                int i25 = i24 + 95;
                f60877c1 = i25 % 128;
                int i26 = i25 % 2;
                obj = skVar3.setScroller;
                if (i26 != 0) {
                    throw null;
                }
                int i27 = i24 + 37;
                f60877c1 = i27 % 128;
                int i28 = i27 % 2;
                return obj;
            case 4:
                sk skVar4 = (sk) objArr[0];
                int i29 = f60877c1;
                int i30 = i29 + 95;
                f60878d1 = i30 % 128;
                int i31 = i30 % 2;
                obj = skVar4.setAdapter;
                if (i31 == 0) {
                    int i32 = 47 / 0;
                }
                int i33 = i29 + 47;
                f60878d1 = i33 % 128;
                int i34 = i33 % 2;
                return obj;
            case 5:
                sk skVar5 = (sk) objArr[0];
                int i35 = f60877c1;
                int i36 = i35 + 9;
                f60878d1 = i36 % 128;
                int i37 = i36 % 2;
                obj = skVar5.setZ;
                if (i37 == 0) {
                    int i38 = 69 / 0;
                }
                int i39 = i35 + 93;
                f60878d1 = i39 % 128;
                int i40 = i39 % 2;
                return obj;
            case 6:
                sk skVar6 = (sk) objArr[0];
                int i41 = f60878d1;
                int i42 = i41 + 119;
                f60877c1 = i42 % 128;
                int i43 = i42 % 2;
                obj = skVar6.getSuppressed;
                if (i43 != 0) {
                    int i44 = 23 / 0;
                }
                int i45 = i41 + 101;
                f60877c1 = i45 % 128;
                if (i45 % 2 != 0) {
                    throw null;
                }
                return obj;
            default:
                sk skVar7 = (sk) objArr[0];
                int i46 = f60878d1;
                int i47 = i46 + 27;
                f60877c1 = i47 % 128;
                int i48 = i47 % 2;
                obj = skVar7.setCacheColorHint;
                int i49 = i46 + 85;
                f60877c1 = i49 % 128;
                if (i49 % 2 != 0) {
                    throw null;
                }
                return obj;
        }
    }

    @JvmName(name = "TransactionResult")
    @Nullable
    public final Integer TransactionResult() {
        int i10 = f60878d1;
        int i11 = i10 + 63;
        f60877c1 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 87;
        f60877c1 = i13 % 128;
        int i14 = i13 % 2;
        Integer num = this.setIncludeFontPadding;
        if (i14 != 0) {
            int i15 = 3 / 0;
        }
        return num;
    }

    @JvmName(name = "UiMessageCallbackKtWhenMappings")
    @Nullable
    public final Integer UiMessageCallbackKtWhenMappings() {
        int i10 = f60877c1;
        int i11 = i10 + 27;
        f60878d1 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 121;
        f60878d1 = i12 % 128;
        int i13 = i12 % 2;
        return this.setNavigationOnClickListener;
    }

    public final boolean equals(@Nullable Object p4) {
        if (this == p4) {
            return true;
        }
        if (!(p4 instanceof sk)) {
            return false;
        }
        sk skVar = (sk) p4;
        if (this.setCursorVisible != skVar.setCursorVisible || !Intrinsics.areEqual(this.setAdapter, skVar.setAdapter) || !Intrinsics.areEqual(this.setChildDivider, skVar.setChildDivider) || !Intrinsics.areEqual(this.setCompoundDrawablePadding, skVar.setCompoundDrawablePadding) || !Intrinsics.areEqual(this.setMaxEms, skVar.setMaxEms) || !Intrinsics.areEqual(this.getAmountFieldTextColor, skVar.getAmountFieldTextColor) || (!Intrinsics.areEqual((Object) this.setMinHeight, (Object) skVar.setMinHeight)) || !Intrinsics.areEqual(this.setImageResource, skVar.setImageResource)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.setLayoutDirection, skVar.setLayoutDirection)) {
            int i10 = f60877c1 + 3;
            f60878d1 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.setY, skVar.setY)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.setX, skVar.setX)) {
            int i12 = f60878d1 + 117;
            f60877c1 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.setDividerPadding, (Object) skVar.setDividerPadding)) {
            int i14 = f60878d1 + 97;
            f60877c1 = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.setOnDragListener, skVar.setOnDragListener)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.setNavigationOnClickListener, skVar.setNavigationOnClickListener)) {
            int i16 = f60877c1 + 105;
            f60878d1 = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.setOnLongClickListener, (Object) skVar.setOnLongClickListener)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getSuppressed, skVar.getSuppressed)) {
            int i18 = f60877c1 + 95;
            f60878d1 = i18 % 128;
            int i19 = i18 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.setTextSelectHandleRight, skVar.setTextSelectHandleRight)) {
            int i20 = f60878d1 + 15;
            f60877c1 = i20 % 128;
            int i21 = i20 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.TransactionResult, skVar.TransactionResult) || !Intrinsics.areEqual((Object) this.printStackTrace, (Object) skVar.printStackTrace) || !Intrinsics.areEqual(this.setCompoundDrawableTintBlendMode, skVar.setCompoundDrawableTintBlendMode)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.setOnFocusChangeListener, skVar.setOnFocusChangeListener)) {
            int i22 = f60877c1 + 11;
            f60878d1 = i22 % 128;
            return i22 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.getNavBarTitleString, skVar.getNavBarTitleString)) {
            int i23 = f60877c1 + 13;
            f60878d1 = i23 % 128;
            int i24 = i23 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.setLayoutAnimation, skVar.setLayoutAnimation) || !Intrinsics.areEqual(this.setZ, skVar.setZ)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.setTextScaleX, skVar.setTextScaleX)) {
            int i25 = f60877c1 + 77;
            f60878d1 = i25 % 128;
            int i26 = i25 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.UiMessageCallbackKtWhenMappings, skVar.UiMessageCallbackKtWhenMappings)) {
            return false;
        }
        if (Intrinsics.areEqual(this.setTextAlignment, skVar.setTextAlignment)) {
            return Intrinsics.areEqual((Object) this.setAlwaysDrawnWithCacheEnabled, (Object) skVar.setAlwaysDrawnWithCacheEnabled) && Intrinsics.areEqual(this.setIncludeFontPadding, skVar.setIncludeFontPadding) && Intrinsics.areEqual(this.setCacheColorHint, skVar.setCacheColorHint) && Intrinsics.areEqual(this.setEllipsize, skVar.setEllipsize) && this.setOnEditorActionListener == skVar.setOnEditorActionListener && Intrinsics.areEqual(this.setScroller, skVar.setScroller) && Intrinsics.areEqual(this.setViewTranslationCallback, skVar.setViewTranslationCallback);
        }
        int i27 = f60878d1 + 73;
        f60877c1 = i27 % 128;
        int i28 = i27 % 2;
        return false;
    }

    @JvmName(name = "getAmountFieldTextColor")
    @Nullable
    public final Integer getAmountFieldTextColor() {
        int i10 = f60878d1 + 11;
        f60877c1 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.setCompoundDrawableTintBlendMode;
        }
        throw null;
    }

    @JvmName(name = "getNavBarTitleString")
    @Nullable
    public final Integer getNavBarTitleString() {
        int i10 = f60878d1;
        int i11 = i10 + 63;
        f60877c1 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 35;
        f60877c1 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.setLayoutDirection;
        }
        throw null;
    }

    @JvmName(name = "getSuppressed")
    @Nullable
    public final String getSuppressed() {
        int i10 = f60878d1 + 45;
        int i11 = i10 % 128;
        f60877c1 = i11;
        if (i10 % 2 != 0) {
            int i12 = 6 / 0;
        }
        int i13 = i11 + 113;
        f60878d1 = i13 % 128;
        int i14 = i13 % 2;
        String str = this.setOnFocusChangeListener;
        if (i14 == 0) {
            int i15 = 74 / 0;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v63, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int iHashCode8;
        int iHashCode9 = this.setCursorVisible.hashCode() * 31;
        int iHashCode10 = 0;
        Integer num = this.setAdapter;
        int iHashCode11 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.setChildDivider;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.setCompoundDrawablePadding;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.setMaxEms;
        int iHashCode14 = (iHashCode13 + (str == null ? 0 : str.hashCode())) * 31;
        ?? r3 = 1;
        Integer num4 = this.getAmountFieldTextColor;
        if (num4 == null) {
            int i10 = f60877c1 + 81;
            f60878d1 = i10 % 128;
            iHashCode = i10 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = num4.hashCode();
        }
        int i11 = (iHashCode14 + iHashCode) * 31;
        Float f6 = this.setMinHeight;
        if (f6 == null) {
            int i12 = f60878d1 + 29;
            f60877c1 = i12 % 128;
            int i13 = i12 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = f6.hashCode();
        }
        int i14 = (i11 + iHashCode2) * 31;
        Integer num5 = this.setImageResource;
        int iHashCode15 = (i14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.setLayoutDirection;
        int iHashCode16 = (iHashCode15 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.setY;
        int iHashCode17 = (iHashCode16 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.setX;
        int iHashCode18 = (iHashCode17 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Float f10 = this.setDividerPadding;
        int iHashCode19 = (iHashCode18 + (f10 == null ? 0 : f10.hashCode())) * 31;
        Integer num9 = this.setOnDragListener;
        int iHashCode20 = (iHashCode19 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.setNavigationOnClickListener;
        int iHashCode21 = (iHashCode20 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Float f11 = this.setOnLongClickListener;
        int iHashCode22 = (iHashCode21 + (f11 == null ? 0 : f11.hashCode())) * 31;
        Integer num11 = this.getSuppressed;
        if (num11 == null) {
            int i15 = f60877c1 + 29;
            f60878d1 = i15 % 128;
            iHashCode3 = i15 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode3 = num11.hashCode();
        }
        int i16 = (iHashCode22 + iHashCode3) * 31;
        Integer num12 = this.setTextSelectHandleRight;
        int iHashCode23 = (i16 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.TransactionResult;
        int iHashCode24 = (iHashCode23 + (num13 == null ? 0 : num13.hashCode())) * 31;
        Float f12 = this.printStackTrace;
        int iHashCode25 = (iHashCode24 + (f12 == null ? 0 : f12.hashCode())) * 31;
        Integer num14 = this.setCompoundDrawableTintBlendMode;
        if (num14 == null) {
            int i17 = f60877c1 + 47;
            f60878d1 = i17 % 128;
            int i18 = i17 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = num14.hashCode();
        }
        int i19 = (iHashCode25 + iHashCode4) * 31;
        String str2 = this.setOnFocusChangeListener;
        if (str2 == null) {
            int i20 = f60878d1 + 117;
            f60877c1 = i20 % 128;
            int i21 = i20 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str2.hashCode();
        }
        int i22 = (i19 + iHashCode5) * 31;
        Integer num15 = this.getNavBarTitleString;
        if (num15 == null) {
            int i23 = f60877c1 + 39;
            f60878d1 = i23 % 128;
            int i24 = i23 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = num15.hashCode();
        }
        int i25 = (i22 + iHashCode6) * 31;
        String str3 = this.setLayoutAnimation;
        int iHashCode26 = (i25 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num16 = this.setZ;
        int iHashCode27 = (iHashCode26 + (num16 == null ? 0 : num16.hashCode())) * 31;
        String str4 = this.setTextScaleX;
        if (str4 == null) {
            int i26 = f60877c1 + 85;
            f60878d1 = i26 % 128;
            int i27 = i26 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = str4.hashCode();
        }
        int i28 = (iHashCode27 + iHashCode7) * 31;
        Integer num17 = this.UiMessageCallbackKtWhenMappings;
        int iHashCode28 = (i28 + (num17 == null ? 0 : num17.hashCode())) * 31;
        Integer num18 = this.setTextAlignment;
        if (num18 == null) {
            int i29 = f60878d1 + 93;
            f60877c1 = i29 % 128;
            int i30 = i29 % 2;
            iHashCode8 = 0;
        } else {
            iHashCode8 = num18.hashCode();
        }
        int i31 = (iHashCode28 + iHashCode8) * 31;
        Float f13 = this.setAlwaysDrawnWithCacheEnabled;
        int iHashCode29 = (i31 + (f13 == null ? 0 : f13.hashCode())) * 31;
        Integer num19 = this.setIncludeFontPadding;
        int iHashCode30 = (iHashCode29 + (num19 == null ? 0 : num19.hashCode())) * 31;
        String str5 = this.setCacheColorHint;
        int iHashCode31 = (iHashCode30 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num20 = this.setEllipsize;
        int iHashCode32 = (iHashCode31 + (num20 == null ? 0 : num20.hashCode())) * 31;
        boolean z10 = this.setOnEditorActionListener;
        if (z10) {
            int i32 = f60878d1 + 23;
            f60877c1 = i32 % 128;
            int i33 = i32 % 2;
        } else {
            r3 = z10;
        }
        int i34 = (iHashCode32 + r3) * 31;
        String str6 = this.setScroller;
        int iHashCode33 = (i34 + (str6 == null ? 0 : str6.hashCode())) * 31;
        sp spVar = this.setViewTranslationCallback;
        if (spVar == null) {
            int i35 = f60877c1 + 55;
            f60878d1 = i35 % 128;
            int i36 = i35 % 2;
        } else {
            iHashCode10 = spVar.hashCode();
        }
        return iHashCode33 + iHashCode10;
    }

    @JvmName(name = "printStackTrace")
    @Nullable
    public final Float printStackTrace() {
        int i10 = f60878d1;
        int i11 = i10 + 41;
        f60877c1 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 27;
        f60877c1 = i13 % 128;
        int i14 = i13 % 2;
        return this.setAlwaysDrawnWithCacheEnabled;
    }

    @JvmName(name = "setAlwaysDrawnWithCacheEnabled")
    @Nullable
    public final Integer setAlwaysDrawnWithCacheEnabled() {
        return (Integer) setX(new Object[]{this}, -693921023, 693921024, System.identityHashCode(this));
    }

    @JvmName(name = "setCacheColorHint")
    @Nullable
    public final String setCacheColorHint() {
        return (String) setX(new Object[]{this}, -1769210335, 1769210338, System.identityHashCode(this));
    }

    @JvmName(name = "setChildDivider")
    @Nullable
    public final Integer setChildDivider() {
        int i10 = f60878d1;
        int i11 = i10 + 7;
        f60877c1 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 17;
        f60877c1 = i13 % 128;
        int i14 = i13 % 2;
        return this.TransactionResult;
    }

    @JvmName(name = "setCompoundDrawablePadding")
    @Nullable
    public final Integer setCompoundDrawablePadding() {
        return (Integer) setX(new Object[]{this}, 486778990, -486778984, System.identityHashCode(this));
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    @Nullable
    public final Integer setCompoundDrawableTintBlendMode() {
        int i10 = f60878d1 + 109;
        int i11 = i10 % 128;
        f60877c1 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 117;
        f60878d1 = i13 % 128;
        if (i13 % 2 != 0) {
            return this.setChildDivider;
        }
        throw null;
    }

    @JvmName(name = "setCursorVisible")
    @Nullable
    public final Integer setCursorVisible() {
        int i10 = f60877c1 + 125;
        int i11 = i10 % 128;
        f60878d1 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 117;
        f60877c1 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.setEllipsize;
        }
        throw null;
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final Integer setDividerPadding() {
        return (Integer) setX(new Object[]{this}, -559917236, 559917240, System.identityHashCode(this));
    }

    @JvmName(name = "setImageResource")
    @Nullable
    public final String setImageResource() {
        int i10 = f60878d1 + 65;
        int i11 = i10 % 128;
        f60877c1 = i11;
        if (i10 % 2 != 0) {
            int i12 = 32 / 0;
        }
        int i13 = i11 + 61;
        f60878d1 = i13 % 128;
        int i14 = i13 % 2;
        return this.setLayoutAnimation;
    }

    @JvmName(name = "setIncludeFontPadding")
    @Nullable
    public final Float setIncludeFontPadding() {
        int i10 = f60878d1 + 103;
        f60877c1 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.setDividerPadding;
        }
        throw null;
    }

    @JvmName(name = "setLayoutAnimation")
    @Nullable
    public final Integer setLayoutAnimation() {
        int i10 = f60878d1 + 21;
        int i11 = i10 % 128;
        f60877c1 = i11;
        if (i10 % 2 != 0) {
            int i12 = 69 / 0;
        }
        int i13 = i11 + 37;
        f60878d1 = i13 % 128;
        int i14 = i13 % 2;
        return this.setY;
    }

    @JvmName(name = "setLayoutDirection")
    @Nullable
    public final Integer setLayoutDirection() {
        return (Integer) setX(new Object[]{this}, 1391405127, -1391405122, System.identityHashCode(this));
    }

    @JvmName(name = "setMaxEms")
    @Nullable
    public final Integer setMaxEms() {
        int i10 = f60878d1 + 69;
        int i11 = i10 % 128;
        f60877c1 = i11;
        if (i10 % 2 != 0) {
            int i12 = 42 / 0;
        }
        int i13 = i11 + 65;
        f60878d1 = i13 % 128;
        if (i13 % 2 != 0) {
            return this.getNavBarTitleString;
        }
        throw null;
    }

    @JvmName(name = "setMinHeight")
    @Nullable
    public final String setMinHeight() {
        int i10 = f60877c1 + 75;
        int i11 = i10 % 128;
        f60878d1 = i11;
        if (i10 % 2 == 0) {
            int i12 = 87 / 0;
        }
        int i13 = i11 + 23;
        f60877c1 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.setTextScaleX;
        }
        throw null;
    }

    @JvmName(name = "setNavigationOnClickListener")
    @Nullable
    public final Integer setNavigationOnClickListener() {
        int i10 = f60878d1 + 61;
        f60877c1 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.getAmountFieldTextColor;
        }
        throw null;
    }

    @JvmName(name = "setOnDragListener")
    @Nullable
    public final Integer setOnDragListener() {
        int i10 = f60877c1 + 63;
        int i11 = i10 % 128;
        f60878d1 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 79;
        f60877c1 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.setImageResource;
        }
        throw null;
    }

    @JvmName(name = "setOnEditorActionListener")
    @Nullable
    public final Integer setOnEditorActionListener() {
        int i10 = f60878d1;
        int i11 = i10 + 115;
        f60877c1 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 113;
        f60877c1 = i13 % 128;
        int i14 = i13 % 2;
        return this.setTextSelectHandleRight;
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final String setOnFocusChangeListener() {
        return (String) setX(new Object[]{this}, -2139927297, 2139927299, System.identityHashCode(this));
    }

    @JvmName(name = "setOnLongClickListener")
    @Nullable
    public final Float setOnLongClickListener() {
        int i10 = f60877c1 + 71;
        int i11 = i10 % 128;
        f60878d1 = i11;
        if (i10 % 2 == 0) {
            int i12 = 69 / 0;
        }
        int i13 = i11 + 57;
        f60877c1 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.setMinHeight;
        }
        throw null;
    }

    @JvmName(name = "setScroller")
    @Nullable
    public final sp setScroller() {
        int i10 = f60878d1;
        int i11 = i10 + 45;
        f60877c1 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 115;
        f60877c1 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.setViewTranslationCallback;
        }
        throw null;
    }

    @JvmName(name = "setTextAlignment")
    @Nullable
    public final Float setTextAlignment() {
        int i10 = f60878d1 + 111;
        f60877c1 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 62 / 0;
        }
        return this.setOnLongClickListener;
    }

    @JvmName(name = "setTextScaleX")
    @Nullable
    public final Float setTextScaleX() {
        int i10 = f60878d1 + 81;
        int i11 = i10 % 128;
        f60877c1 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 105;
        f60878d1 = i13 % 128;
        int i14 = i13 % 2;
        return this.printStackTrace;
    }

    @JvmName(name = "setTextSelectHandleRight")
    public final boolean setTextSelectHandleRight() {
        int i10 = f60877c1 + 43;
        int i11 = i10 % 128;
        f60878d1 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 87;
        f60877c1 = i13 % 128;
        if (i13 % 2 == 0) {
            return this.setOnEditorActionListener;
        }
        throw null;
    }

    @JvmName(name = "setViewTranslationCallback")
    @Nullable
    public final String setViewTranslationCallback() {
        return (String) setX(new Object[]{this}, -1938578016, 1938578016, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @NotNull
    public final PinPadType setY() {
        int i10 = f60878d1 + 7;
        int i11 = i10 % 128;
        f60877c1 = i11;
        if (i10 % 2 != 0) {
            throw null;
        }
        int i12 = i11 + 25;
        f60878d1 = i12 % 128;
        if (i12 % 2 != 0) {
            return this.setCursorVisible;
        }
        throw null;
    }

    @JvmName(name = "setZ")
    @Nullable
    public final Integer setZ() {
        int i10 = f60878d1;
        int i11 = i10 + 41;
        f60877c1 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 119;
        f60877c1 = i13 % 128;
        int i14 = i13 % 2;
        return this.setX;
    }

    @NotNull
    public final String toString() throws Throwable {
        setIncludeFontPadding setincludefontpadding;
        int i10;
        int i11;
        int i12 = f60877c1 + 99;
        f60878d1 = i12 % 128;
        int i13 = i12 % 2;
        int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
        int i14 = keyRepeatTimeout + 3;
        char scrollDefaultDelay = (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 55);
        char[] charArray = "㘡㘡㘰".toCharArray();
        setIncludeFontPadding setincludefontpadding2 = new setIncludeFontPadding();
        int i15 = 0;
        int i16 = 1;
        int i17 = f60882h1;
        int i18 = 290255894;
        char[] cArr = f60875a1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i19 = f60879e1 + 33;
            f60880f1 = i19 % 128;
            int i20 = i19 % 2;
            int i21 = 0;
            while (i21 < length) {
                try {
                    Object[] objArr = new Object[i16];
                    objArr[i15] = Integer.valueOf(cArr[i21]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i18));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) TextUtils.getOffsetBefore("", i15), 45 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1116 - TextUtils.getOffsetAfter("", i15));
                        byte b10 = (byte) i15;
                        Object[] objArr2 = new Object[1];
                        a((byte) (i17 & 31), b10, b10, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i21] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i21++;
                    cArr = cArr;
                    length = length;
                    setincludefontpadding2 = setincludefontpadding2;
                    i15 = 0;
                    i16 = 1;
                    i18 = 290255894;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            setincludefontpadding = setincludefontpadding2;
            cArr = cArr2;
        } else {
            setincludefontpadding = setincludefontpadding2;
        }
        Object[] objArr3 = {Integer.valueOf(f60876b1)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        float f6 = 0.0f;
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) KeyEvent.keyCodeFromString(""), 45 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1116 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
            byte b11 = (byte) 0;
            Object[] objArr4 = new Object[1];
            a((byte) (i17 & 31), b11, b11, objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i14];
        if (i14 % 2 != 0) {
            i11 = keyRepeatTimeout + 2;
            cArr3[i11] = (char) (charArray[i11] - scrollDefaultDelay);
            int i22 = f60879e1 + 65;
            f60880f1 = i22 % 128;
            i10 = 2;
            int i23 = i22 % 2;
        } else {
            i10 = 2;
            i11 = i14;
        }
        if (i11 > 1) {
            int i24 = f60880f1 + 121;
            f60879e1 = i24 % 128;
            int i25 = i24 % i10;
            setIncludeFontPadding setincludefontpadding3 = setincludefontpadding;
            setincludefontpadding3.setDividerPadding = 0;
            while (true) {
                int i26 = setincludefontpadding3.setDividerPadding;
                if (i26 >= i11) {
                    break;
                }
                char c10 = charArray[i26];
                setincludefontpadding3.setY = c10;
                int i27 = i26 + 1;
                char c11 = charArray[i27];
                setincludefontpadding3.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    cArr3[i26] = (char) (c10 - scrollDefaultDelay);
                    cArr3[i27] = (char) (c11 - scrollDefaultDelay);
                    i11 = i11;
                } else {
                    Object[] objArr5 = {setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), setincludefontpadding3};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, f6, f6) > f6 ? 1 : (TypedValue.complexToFraction(0, f6, f6) == f6 ? 0 : -1)), 26 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 2311 - TextUtils.indexOf("", "", 0));
                        byte length2 = (byte) f60881g1.length;
                        byte b12 = (byte) (length2 - 4);
                        Object[] objArr6 = new Object[1];
                        a(length2, b12, b12, objArr6);
                        String str = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                    int i28 = setincludefontpadding3.setNavigationOnClickListener;
                    if (iIntValue == i28) {
                        Object[] objArr7 = {setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding3, setincludefontpadding3, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding3, Integer.valueOf(cCharValue), setincludefontpadding3};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49103 - (Process.myTid() >> 22)), 35 - TextUtils.getOffsetAfter("", 0), 2545 - Color.red(0));
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            Object[] objArr8 = new Object[1];
                            a(b13, b14, b14, objArr8);
                            String str2 = (String) objArr8[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str2, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                        int i29 = (setincludefontpadding3.setOnFocusChangeListener * cCharValue) + setincludefontpadding3.setNavigationOnClickListener;
                        int i30 = setincludefontpadding3.setDividerPadding;
                        cArr3[i30] = cArr[iIntValue2];
                        cArr3[i30 + 1] = cArr[i29];
                    } else {
                        int i31 = setincludefontpadding3.setX;
                        int i32 = setincludefontpadding3.setOnFocusChangeListener;
                        if (i31 == i32) {
                            int i33 = f60879e1 + 85;
                            f60880f1 = i33 % 128;
                            int i34 = i33 % 2;
                            int iA = a.a(setincludefontpadding3.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding3.setOnLongClickListener = iA;
                            int iA2 = a.a(i28, cCharValue, 1, cCharValue);
                            setincludefontpadding3.setNavigationOnClickListener = iA2;
                            int i35 = (i32 * cCharValue) + iA2;
                            int i36 = setincludefontpadding3.setDividerPadding;
                            cArr3[i36] = cArr[(i31 * cCharValue) + iA];
                            cArr3[i36 + 1] = cArr[i35];
                        } else {
                            int i37 = (i31 * cCharValue) + i28;
                            int i38 = (i32 * cCharValue) + setincludefontpadding3.setOnLongClickListener;
                            int i39 = setincludefontpadding3.setDividerPadding;
                            cArr3[i39] = cArr[i37];
                            cArr3[i39 + 1] = cArr[i38];
                        }
                        setincludefontpadding3.setDividerPadding += 2;
                        i11 = i11;
                        f6 = 0.0f;
                    }
                }
                setincludefontpadding3.setDividerPadding += 2;
                i11 = i11;
                f6 = 0.0f;
            }
        }
        for (int i40 = 0; i40 < i14; i40++) {
            cArr3[i40] = (char) (cArr3[i40] ^ 13722);
        }
        String strF = n1.f(cArr3);
        int i41 = f60878d1 + 113;
        f60877c1 = i41 % 128;
        if (i41 % 2 != 0) {
            int i42 = 77 / 0;
        }
        return strF;
    }

    @JvmName(name = "setX")
    @Nullable
    public final Integer setX() {
        int i10 = f60877c1 + 41;
        int i11 = i10 % 128;
        f60878d1 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 125;
        f60877c1 = i13 % 128;
        int i14 = i13 % 2;
        Integer num = this.setCompoundDrawablePadding;
        if (i14 != 0) {
            int i15 = 92 / 0;
        }
        return num;
    }
}
