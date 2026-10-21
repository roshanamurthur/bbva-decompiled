package com.mypinpad.tsdk.isolation;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import androidx.core.view.PointerIconCompat;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00072\u00020\u00012\u00020\u0002:\u0001\u0007J#\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u000f\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/oc;", "Lcom/mypinpad/tsdk/i/nu;", "Lcom/mypinpad/tsdk/i/sy;", "Lkotlin/Function1;", "Lcom/mypinpad/tsdk/i/ok;", "", "p0", "setOnFocusChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "setY", "()V", "Landroid/app/Activity;", "ai_", "(Landroid/app/Activity;)V", "ah_", "finalize"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidHostNfcListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidHostNfcListener.kt\ncom/mypinpad/tsdk/internal/host/android/AndroidHostNfcListener\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,157:1\n7#2,8:158\n7#2,8:166\n*S KotlinDebug\n*F\n+ 1 AndroidHostNfcListener.kt\ncom/mypinpad/tsdk/internal/host/android/AndroidHostNfcListener\n*L\n40#1:158,8\n55#1:166,8\n*E\n"})
public final class oc implements nu, sy {
    public static int E0;
    public static int F0;
    public static final byte[] G0 = null;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static char[] f57439s0;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static char f57440t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static long f57441u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static char f57442w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f57443x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f57444y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f57445p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public oj f57446q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public NfcAdapter f57447r0;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.oc$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/oc$setOnFocusChangeListener;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d();
        E0 = 0;
        F0 = 1;
        f57443x0 = 0;
        f57444y0 = 1;
        e();
        INSTANCE = new Companion(null);
        int i10 = f57444y0 + 61;
        f57443x0 = i10 % 128;
        int i11 = i10 % 2;
    }

    public oc(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this.f57445p0 = (i11 & 1) != 0 ? 387 : i10;
        this.f57446q0 = om.INSTANCE;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f57439s0;
        int i12 = 1;
        long j10 = 0;
        byte[] bArr = G0;
        int i13 = 290255894;
        int i14 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr2 = new Object[i12];
                    objArr2[i14] = Integer.valueOf(cArr[i15]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i13));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionType(j10), View.resolveSize(i14, i14) + 45, View.MeasureSpec.getMode(i14) + 1116);
                        byte b11 = (byte) (bArr[3] - 1);
                        Object[] objArr3 = new Object[1];
                        c((byte) (b11 | 20), b11, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i15++;
                    i12 = 1;
                    j10 = 0;
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
        Object[] objArr4 = {Integer.valueOf(f57440t0)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 46 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1116 - View.resolveSizeAndState(0, 0, 0));
            byte b12 = (byte) (bArr[3] - 1);
            Object[] objArr5 = new Object[1];
            c((byte) (b12 | 20), b12, b12, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        int i16 = 2;
        if (i10 % 2 != 0) {
            int i17 = E0 + 121;
            F0 = i17 % 128;
            if (i17 % 2 == 0) {
                i11 = i10 + 12;
                cArr3[i11] = (char) (charArray[i11] % b10);
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
                int i18 = setincludefontpadding.setDividerPadding;
                if (i18 >= i11) {
                    break;
                }
                char c10 = charArray[i18];
                setincludefontpadding.setY = c10;
                int i19 = i18 + 1;
                char c11 = charArray[i19];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    int i20 = F0 + 105;
                    E0 = i20 % 128;
                    if (i20 % i16 != 0) {
                        cArr3[i18] = (char) (c10 << b10);
                        cArr3[i18] = (char) (c11 * b10);
                    } else {
                        cArr3[i18] = (char) (c10 - b10);
                        cArr3[i19] = (char) (c11 - b10);
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
                        Class cls3 = (Class) setTextScaleX.setX((char) View.MeasureSpec.makeMeasureSpec(0, 0), 27 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 2311 - (ViewConfiguration.getTouchSlop() >> 8));
                        byte b13 = (byte) (bArr[3] - 1);
                        Object[] objArr7 = new Object[1];
                        c((byte) (b13 | 17), b13, b13, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i21 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i21) {
                        int i22 = E0 + 57;
                        F0 = i22 % 128;
                        int i23 = i22 % 2;
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49103), TextUtils.indexOf("", "", 0, 0) + 35, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2544);
                            byte b14 = (byte) (bArr[3] - 1);
                            Object[] objArr9 = new Object[1];
                            c((byte) (b14 | 13), b14, b14, objArr9);
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
                            int iA2 = a.a(i21, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i28 = (i27 * cCharValue) + iA2;
                            int i29 = setincludefontpadding.setDividerPadding;
                            cArr3[i29] = cArr[(i26 * cCharValue) + iA];
                            cArr3[i29 + 1] = cArr[i28];
                        } else {
                            int i30 = (i26 * cCharValue) + i21;
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
            int i34 = E0 + 1;
            F0 = i34 % 128;
            if (i34 % 2 == 0) {
                cArr3[i33] = (char) (cArr3[i33] ^ 7275);
                i33 += 92;
            } else {
                cArr3[i33] = (char) (cArr3[i33] ^ 13722);
                i33++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    public static void b(char c10, int i10, Object[] objArr) throws Throwable {
        int i11;
        char[] charArray = "뇲子䐕쥯⇞㢲\uebf2㼛蕢\ueb38㲍哰豧鹭㮖⒎﵇逵왖엘햒ၱ꼺鷉\ue741枣꩟蟼ᷜ\uefb6톙㍪䨉Ⴚ签\ue5db燍㪌㍡广\ued85㤞콕".toCharArray();
        int i12 = E0;
        int i13 = i12 + 35;
        F0 = i13 % 128;
        int i14 = 2;
        int i15 = i13 % 2;
        int i16 = i12 + 39;
        F0 = i16 % 128;
        int i17 = i16 % 2;
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        char[] charArray3 = "蛒Ⴡ쒐ⴗ".toCharArray();
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        char c11 = 0;
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            int i18 = F0 + 103;
            E0 = i18 % 128;
            int i19 = i18 % i14;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[c11] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                byte[] bArr = G0;
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 50679), 39 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1737);
                    byte b10 = (byte) (bArr[3] - 1);
                    Object[] objArr3 = new Object[1];
                    c((byte) (b10 | 6), b10, b10, objArr3);
                    String str = (String) objArr3[c11];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[c11] = Object.class;
                    method = cls.getMethod(str, clsArr);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[c11] = uiMessageCallbackKtWhenMappings;
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 8125), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 37, 647 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b11 = (byte) (bArr[3] - 1);
                    byte b12 = (byte) (b11 + 3);
                    Object[] objArr5 = new Object[1];
                    c(b12, b11, (byte) (b12 - 3), objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollBarSize() >> 8), 49 - View.resolveSize(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 433);
                    byte b13 = (byte) (bArr[3] - 1);
                    byte b14 = (byte) (b13 + 5);
                    Object[] objArr7 = new Object[1];
                    c(b14, b13, (byte) (b14 - 5), objArr7);
                    String str2 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str2, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    i11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) (Color.red(0) + 4449), 42 - (ViewConfiguration.getWindowTouchSlop() >> 8), View.combineMeasuredStates(0, 0) + PointerIconCompat.TYPE_GRABBING);
                    byte b15 = (byte) (bArr[3] - 1);
                    byte b16 = b15;
                    Object[] objArr9 = new Object[1];
                    c(b16, b15, b16, objArr9);
                    String str3 = (String) objArr9[0];
                    i11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str3, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c12 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c12;
                int i20 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i20] = (char) (((((long) (c12 ^ charArray[i20])) ^ (f57441u0 ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) v0) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f57442w0) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i20 + 1;
                i14 = i11;
                length3 = length3;
                c11 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 119 - r6
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.oc.G0
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L32
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L32:
            int r6 = r6 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.oc.c(byte, short, short, java.lang.Object[]):void");
    }

    public static void d() {
        G0 = new byte[]{DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, 71, 101, 1};
    }

    public static void e() {
        f57440t0 = (char) 53957;
        f57439s0 = new char[]{59183, 59194, 59189, 59192, 59188, 59199, 59176, 59198, 59184, 59179, 59185, 59196, 59259, 59191, 59186, 59182};
        f57442w0 = (char) 29775;
        f57441u0 = -2443367703579691432L;
        v0 = -461867432;
    }

    @Override // com.mypinpad.tsdk.isolation.sy
    public final synchronized void ah_(@NotNull Activity p4) {
        int i10 = f57444y0 + 43;
        f57443x0 = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        oj ojVar = this.f57446q0;
        if (ojVar instanceof of) {
            Intrinsics.checkNotNull(ojVar, "");
            of ofVar = (of) ojVar;
            Function1 function1 = (Function1) of.setX(new Object[]{ofVar}, -625985043, 625985043, System.identityHashCode(ofVar));
            setY();
            this.f57446q0 = new ol(function1);
            int i12 = f57443x0 + 111;
            f57444y0 = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.sy
    public final synchronized void ai_(@NotNull Activity p4) {
        try {
            int i10 = f57444y0 + 21;
            f57443x0 = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(p4, "");
            oj ojVar = this.f57446q0;
            if (ojVar instanceof ol) {
                Intrinsics.checkNotNull(ojVar, "");
                ol olVar = (ol) ojVar;
                setOnFocusChangeListener((Function1) ol.setY(new Object[]{olVar}, 1150190985, -1150190985, System.identityHashCode(olVar)));
            }
            int i12 = f57444y0 + 23;
            f57443x0 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void finalize() throws Throwable {
        int i10 = f57443x0 + 39;
        int i11 = i10 % 128;
        f57444y0 = i11;
        int i12 = i10 % 2;
        if (this.f57446q0 instanceof of) {
            int i13 = i11 + 21;
            f57443x0 = i13 % 128;
            if (i13 % 2 != 0) {
                setY();
                mr mrVar = mr.setOnFocusChangeListener;
                Object[] objArr = new Object[1];
                b((char) ((ViewConfiguration.getMinimumFlingVelocity() % 14) + 32704), (-1877950074) - View.getDefaultSize(1, 1), objArr);
                mt.setX(new Object[]{((String) objArr[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
            } else {
                setY();
                mr mrVar2 = mr.setOnFocusChangeListener;
                Object[] objArr2 = new Object[1];
                b((char) (6084 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), View.getDefaultSize(0, 0) - 1877950074, objArr2);
                mt.setX(new Object[]{((String) objArr2[0]).intern()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
            }
        }
        this.f57446q0 = om.INSTANCE;
        sx.INSTANCE.setCompoundDrawableTintBlendMode(this);
    }

    @Override // com.mypinpad.tsdk.isolation.nu
    public final synchronized void setOnFocusChangeListener(@NotNull final Function1<? super ok, Unit> p4) {
        int i10 = f57443x0 + 87;
        f57444y0 = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p4, "");
            boolean z10 = this.f57446q0 instanceof of;
            throw null;
        }
        Intrinsics.checkNotNullParameter(p4, "");
        if (this.f57446q0 instanceof of) {
            TerminalException terminalException = new TerminalException(11, Reflection.getOrCreateKotlinClass(oc.class).getQualifiedName(), null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        this.f57446q0 = new of(p4);
        mr mrVar = mr.setY;
        Object[] objArr = new Object[1];
        a(Color.blue(0) + 9, "\u000e\u000f\u0004\u0002\u0006\u0003\u0002\u0006㙆", (byte) (73 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), objArr);
        mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
        mu.setCompoundDrawableTintBlendMode(new Object[]{150000, getDisplayExponent.setDividerPadding(true), null, 4}, -1968587119, 1968587120, 150000);
        sx.INSTANCE.setOnFocusChangeListener(this);
        Activity activity = (Activity) sx.setDividerPadding(new Object[0], -850838153, 850838153, (int) System.currentTimeMillis());
        try {
            if (activity == null) {
                TerminalException terminalException2 = new TerminalException(18, null, null);
                mt.setX(new Object[]{terminalException2}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                throw terminalException2;
            }
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            NfcAdapter nfcAdapterP_ = ob.P_(applicationContext);
            nfcAdapterP_.enableReaderMode(activity, new NfcAdapter.ReaderCallback() { // from class: com.mypinpad.tsdk.i.l7
                @Override // android.nfc.NfcAdapter.ReaderCallback
                public final void onTagDiscovered(Tag tag) throws Throwable {
                    oc.Companion companion = oc.INSTANCE;
                    Function1 function1 = p4;
                    Intrinsics.checkNotNullParameter(function1, "");
                    mr mrVar2 = mr.setY;
                    Object[] objArr2 = new Object[1];
                    oc.a(11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), "\u0001\u0002\b\u000f\u0006\u0004\u0003\u0004\u0000\u0001\u0004\u0006", (byte) (Color.argb(0, 0, 0, 0) + 44), objArr2);
                    mt.setX(new Object[]{mrVar2, ((String) objArr2[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                    mu.setCompoundDrawableTintBlendMode(new Object[]{150001, null, null, 6}, -1968587119, 1968587120, 150001);
                    Intrinsics.checkNotNullExpressionValue(tag, "");
                    function1.invoke(new on(tag));
                    int i11 = oc.f57444y0 + 31;
                    oc.f57443x0 = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                }
            }, this.f57445p0, null);
            this.f57447r0 = nfcAdapterP_;
            int i11 = f57444y0 + 17;
            f57443x0 = i11 % 128;
            int i12 = i11 % 2;
        } catch (Exception e5) {
            p4.invoke(new og((Integer) nk.setY(new Object[]{e5}, -768558198, 768558198, (int) System.currentTimeMillis())));
            return;
        }
        throw th;
    }

    @Override // com.mypinpad.tsdk.isolation.nu
    public final synchronized void setY() {
        try {
            if (this.f57446q0 instanceof of) {
                mr mrVar = mr.setY;
                Object[] objArr = new Object[1];
                a(Drawable.resolveOpacity(0, 0) + 14, "\u0004\u0002\u0005\b\r\u000e\u0002\n\u0003\u0004\u0006\u0002\u0003\n", (byte) (94 - Color.blue(0)), objArr);
                mt.setX(new Object[]{mrVar, ((String) objArr[0]).intern()}, 135701020, -135701017, (int) System.currentTimeMillis());
                mu.setCompoundDrawableTintBlendMode(new Object[]{150000, getDisplayExponent.setDividerPadding(false), null, 4}, -1968587119, 1968587120, 150000);
                this.f57446q0 = om.INSTANCE;
                sx sxVar = sx.INSTANCE;
                Activity activity = (Activity) sx.setDividerPadding(new Object[0], -850838153, 850838153, (int) System.currentTimeMillis());
                if (activity != null) {
                    int i10 = f57443x0 + 67;
                    f57444y0 = i10 % 128;
                    int i11 = i10 % 2;
                    if (!activity.isDestroyed()) {
                        int i12 = f57443x0 + 55;
                        f57444y0 = i12 % 128;
                        int i13 = i12 % 2;
                        NfcAdapter nfcAdapter = this.f57447r0;
                        if (nfcAdapter != null) {
                            nfcAdapter.disableReaderMode(activity);
                        }
                    }
                }
                this.f57447r0 = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public oc() {
        this(0, 1, null);
    }

    @Override // com.mypinpad.tsdk.isolation.nu
    public final synchronized void setOnFocusChangeListener() {
        int i10 = f57444y0 + 73;
        f57443x0 = i10 % 128;
        if (i10 % 2 == 0) {
            setY();
            sx.INSTANCE.setCompoundDrawableTintBlendMode(this);
            int i11 = f57444y0 + 41;
            f57443x0 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            setY();
            sx.INSTANCE.setCompoundDrawableTintBlendMode(this);
            throw null;
        }
    }
}
