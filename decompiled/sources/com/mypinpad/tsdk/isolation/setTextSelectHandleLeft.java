package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\bJ\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/setTextSelectHandleLeft;", "Lcom/mypinpad/tsdk/i/setRecyclerListener;", "", "p0", "", "setX", "(I)[B", "", "([B)V", "setY", "Lcom/mypinpad/tsdk/i/setDrawingCacheEnabled;", "Landroid/content/Context;", "p1", "<init>", "(Lcom/mypinpad/tsdk/i/setDrawingCacheEnabled;Landroid/content/Context;)V", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1})
public final class setTextSelectHandleLeft implements setRecyclerListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f60697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static char f60699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f60702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f60703j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setDrawingCacheEnabled f60704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public volatile w8 f60705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setRight f60706c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "setDividerPadding", "(I)[B"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<Integer, byte[]> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f60707p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f60708q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f60709r0 = 1;

        static {
            int i10 = f60708q0;
            int i11 = (i10 ^ 70) + ((i10 & 70) << 1);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            f60709r0 = i12 % 128;
            int i13 = i12 % 2;
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i12;
            int i15 = i13 | i14;
            int i16 = ~(i15 | i11);
            int i17 = ~i11;
            int i18 = i14 | i17;
            if (((i10 | i11) * 184) + (((~i18) | (~(i13 | i17)) | (~i15)) * 184) + ((i16 | (~(i18 | i10))) * (-184)) + (i11 * (-183)) + (i10 * (-183)) == 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                int i19 = f60709r0;
                int i20 = ((i19 & (-18)) | ((~i19) & 17)) + ((i19 & 17) << 1);
                f60708q0 = i20 % 128;
                int i21 = i20 % 2;
                int iIntValue = ((Number) obj).intValue();
                if (i21 == 0) {
                    return (byte[]) a(new Object[]{aVar, Integer.valueOf(iIntValue)}, -2068167115, 2068167115, iIntValue);
                }
                a(new Object[]{aVar, Integer.valueOf(iIntValue)}, -2068167115, 2068167115, iIntValue);
                throw null;
            }
            int iIntValue2 = ((Number) objArr[1]).intValue();
            int i22 = f60708q0;
            int i23 = (((i22 & (-42)) | ((~i22) & 41)) - (~((i22 & 41) << 1))) - 1;
            f60709r0 = i23 % 128;
            int i24 = i23 % 2;
            byte[] bArr = new byte[iIntValue2];
            SecureRandom.getInstanceStrong().nextBytes(bArr);
            int i25 = f60709r0;
            int i26 = i25 & 67;
            int i27 = -(-(i25 | 67));
            int i28 = (i26 & i27) + (i27 | i26);
            f60708q0 = i28 % 128;
            if (i28 % 2 == 0) {
                return bArr;
            }
            throw null;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [byte[], java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ byte[] invoke(Integer num) {
            return a(new Object[]{this, num}, 1486320049, -1486320048, System.identityHashCode(this));
        }
    }

    static {
        c();
        f60702i = 1;
        f60700g = 0;
        f60701h = 1;
        d();
        INSTANCE = new Companion(null);
        int i10 = f60700g + 27;
        f60701h = i10 % 128;
        int i11 = i10 % 2;
    }

    public setTextSelectHandleLeft(@NotNull setDrawingCacheEnabled setdrawingcacheenabled, @NotNull Context context) throws Throwable {
        Intrinsics.checkNotNullParameter(setdrawingcacheenabled, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.f60704a = setdrawingcacheenabled;
        setRight setright = new setRight(setdrawingcacheenabled);
        this.f60706c = setright;
        a aVar = a.f60707p0;
        Object[] objArr = new Object[1];
        a((char) (20124 - View.MeasureSpec.getSize(0)), "䪲骢鲡荎", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, "뭰텠늡䓈㩀酼", objArr);
        Object systemService = context.getSystemService(((String) objArr[0]).intern());
        if (systemService == null) {
            Object[] objArr2 = new Object[1];
            a((char) (ExpandableListView.getPackedPositionType(0L) + 24993), "\udde6㭩ꆂ偡", (-2110035491) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), "உꄤꥈ炇砕竩ק랑\uf2da맻\u0a7b\uf810ⵢﶙಁ暴g쳔\uf1a6萐0彪汙盁守㌡ܷ削ⶉ⻓蛧앇ῖ濴礯\u18fc䥝쫰钶㬅䒠敂䔐ᢌ鷪쑴ߎ쀣㤨⽳䎀鏆㶥쇛儿퉀퓗\ue615鱊ꯥ㬽棦㍙띑땹u韁", objArr2);
            throw new NullPointerException(((String) objArr2[0]).intern());
        }
        getNavBarTextSizeSp getnavbartextsizesp = new getNavBarTextSizeSp(aVar, new setLinkTextColor((SensorManager) systemService));
        getClientId getclientid = (getClientId) getNavBarTextSizeSp.setX(new Object[]{getnavbartextsizesp}, 9532177, -9532177, System.identityHashCode(getnavbartextsizesp));
        try {
            setRight.setOnFocusChangeListener(setright, new setNextFocusUpId(ArraysKt___ArraysJvmKt.copyOfRange((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getclientid}, -1034568962, 1034568962, System.identityHashCode(getclientid)), 0, 64), setdrawingcacheenabled), new getAmountFieldTextSizeSp(ArraysKt___ArraysJvmKt.copyOfRange((byte[]) setLayerType.setCompoundDrawableTintBlendMode(new Object[]{getclientid}, -1034568962, 1034568962, System.identityHashCode(getclientid)), 64, 80), setdrawingcacheenabled));
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(getclientid, null);
            this.f60705b = w8.setY;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(getclientid, th2);
                throw th3;
            }
        }
    }

    public static void a(char c10, String str, int i10, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        char c11;
        int i11 = f60702i;
        int i12 = i11 + 17;
        int i13 = i12 % 128;
        int i14 = 0;
        if (i12 % 2 != 0) {
            charArray = str2.toCharArray();
            int i15 = 93 / 0;
        } else {
            charArray = str2.toCharArray();
        }
        char[] charArray2 = "\u0000\u0000\u0000\u0000".toCharArray();
        char[] charArray3 = str.toCharArray();
        int i16 = i11 + 77;
        int i17 = i16 % 128;
        int i18 = i16 % 2;
        UiMessageCallbackKtWhenMappings uiMessageCallbackKtWhenMappings = new UiMessageCallbackKtWhenMappings();
        int length = charArray3.length;
        char[] cArr = new char[length];
        int length2 = charArray2.length;
        char[] cArr2 = new char[length2];
        System.arraycopy(charArray3, 0, cArr, 0, length);
        System.arraycopy(charArray2, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        uiMessageCallbackKtWhenMappings.setX = 0;
        while (uiMessageCallbackKtWhenMappings.setX < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i14] = uiMessageCallbackKtWhenMappings;
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(20564334);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (50678 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 38, View.MeasureSpec.makeMeasureSpec(i14, i14) + 1737);
                    byte b10 = (byte) i14;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b10, (byte) (b11 & 6), b11, objArr3);
                    String str3 = (String) objArr3[i14];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i14] = Object.class;
                    method = cls.getMethod(str3, clsArr);
                    map.put(20564334, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i14] = uiMessageCallbackKtWhenMappings;
                Object method2 = map.get(-68974155);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (8125 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 37 - KeyEvent.keyCodeFromString(""), 646 - ((Process.getThreadPriority(i14) + 20) >> 6));
                    byte b12 = (byte) i14;
                    byte b13 = (byte) (b12 - 1);
                    Object[] objArr5 = new Object[1];
                    b(b12, (byte) (b13 + 4), b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class);
                    map.put(-68974155, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr6 = {uiMessageCallbackKtWhenMappings, Integer.valueOf(cArr[uiMessageCallbackKtWhenMappings.setX % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(-1108711559);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 48, 433 - TextUtils.lastIndexOf("", '0'));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    b(b14, (byte) (b15 & 5), b15, objArr7);
                    String str4 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str4, Object.class, cls4, cls4);
                    map.put(-1108711559, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                Object[] objArr8 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(533021397);
                if (method4 != null) {
                    c11 = 2;
                } else {
                    Class cls5 = (Class) setTextScaleX.setX((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4449), TextUtils.lastIndexOf("", '0', 0) + 43, 1022 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    byte b16 = (byte) 0;
                    byte b17 = (byte) (b16 - 1);
                    Object[] objArr9 = new Object[1];
                    b(b16, (byte) (b17 + 1), b17, objArr9);
                    String str5 = (String) objArr9[0];
                    c11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str5, cls6, cls6);
                    map.put(533021397, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr8)).charValue();
                char c12 = uiMessageCallbackKtWhenMappings.setDividerPadding;
                cArr[iIntValue2] = c12;
                int i19 = uiMessageCallbackKtWhenMappings.setX;
                cArr3[i19] = (char) (((((long) (c12 ^ charArray[i19])) ^ (f60697d ^ (-2443367703579691432L))) ^ ((long) ((int) (((long) f60698e) ^ (-2443367703579691432L))))) ^ ((long) ((char) (((long) f60699f) ^ (-2443367703579691432L)))));
                uiMessageCallbackKtWhenMappings.setX = i19 + 1;
                length3 = length3;
                cArr3 = cArr3;
                i14 = 0;
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

    public static void b(int i10, byte b10, int i11, Object[] objArr) {
        int i12 = 119 - b10;
        int i13 = i10 * 4;
        int i14 = i11 + 4;
        byte[] bArr = new byte[i13 + 1];
        int i15 = -1;
        byte[] bArr2 = f60703j;
        if (bArr2 == null) {
            i14 = i14;
            objArr = objArr;
            bArr = bArr;
            i15 = -1;
            bArr2 = bArr2;
            i12 = i13 + i12;
            i13 = i13;
        }
        while (true) {
            int i16 = i15 + 1;
            int i17 = i14 + 1;
            bArr[i16] = (byte) i12;
            if (i16 == i13) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            int i18 = i12;
            int i19 = i13;
            i14 = i17;
            objArr = objArr;
            bArr = bArr;
            i15 = i16;
            bArr2 = bArr2;
            i12 = bArr2[i17] + i18;
            i13 = i19;
        }
    }

    public static void c() {
        f60703j = new byte[]{73, 126, -52, 98};
    }

    public static void d() {
        f60699f = (char) 30296;
        f60697d = -2443367703579691432L;
        f60698e = 984874049;
    }

    @Override // com.mypinpad.tsdk.isolation.setRecyclerListener
    @NotNull
    public final synchronized byte[] setX(int p4) {
        byte[] y7;
        try {
            int i10 = f60700g + 89;
            f60701h = i10 % 128;
            if (i10 % 2 == 0) {
                y7 = setRight.setY(this.f60706c, p4);
                int i11 = 27 / 0;
            } else {
                y7 = setRight.setY(this.f60706c, p4);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return y7;
    }

    public final synchronized void setY(@NotNull byte[] p4) {
        Intrinsics.checkNotNullParameter(p4, "");
        setRight.setDividerPadding(this.f60706c, new setNextFocusUpId(p4, this.f60704a));
        this.f60705b = w8.setCompoundDrawableTintBlendMode;
        int i10 = f60700g + 27;
        f60701h = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public final synchronized void setX(@NotNull byte[] p4) {
        try {
            Intrinsics.checkNotNullParameter(p4, "");
            setRight.setDividerPadding(this.f60706c, new setNextFocusUpId(p4, this.f60704a));
            if (this.f60705b == w8.setY) {
                int i10 = f60700g + 81;
                f60701h = i10 % 128;
                int i11 = i10 % 2;
                this.f60705b = w8.setX;
            }
            int i12 = f60701h + 17;
            f60700g = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
