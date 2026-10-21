package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.core.JsonPointer;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setTranscriptMode implements setScrollCaptureCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f60746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f60747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f60750g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setOnGroupClickListener f60751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final getTransactionPortrait f60752b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setOverScrollMode;", "p0", "", "setX", "(Lcom/mypinpad/tsdk/i/setOverScrollMode;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends Lambda implements Function1<setOverScrollMode, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f60753p0 = new a();

        static {
            int i10 = ((-1) << 1) - ((-1) ^ 124);
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }

        public a() {
            super(1);
        }

        public static /* synthetic */ CharSequence a(Object[] objArr, int i10, int i11, int i12) {
            CharSequence charSequenceA;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~i12;
            if ((((~(i14 | i15)) | i13) * 68) + ((~(i11 | i13 | i15)) * (-68)) + (((~(i10 | i11)) | (~(i13 | i14 | i15)) | (~(i12 | i11))) * (-68)) + (i11 * (-67)) + (i10 * 69) != 1) {
                setOverScrollMode setoverscrollmode = (setOverScrollMode) objArr[1];
                Intrinsics.checkNotNullParameter(setoverscrollmode, "");
                StringBuilder sb2 = new StringBuilder();
                sb2.append((String) setOverScrollMode.setY(new Object[]{setoverscrollmode}, -1826405260, 1826405260, System.identityHashCode(setoverscrollmode)));
                sb2.append(JsonPointer.SEPARATOR);
                sb2.append((String) setOverScrollMode.setY(new Object[]{setoverscrollmode}, -1032775005, 1032775006, System.identityHashCode(setoverscrollmode)));
                charSequenceA = sb2.toString();
            } else {
                a aVar = (a) objArr[0];
                charSequenceA = a(new Object[]{aVar, (setOverScrollMode) objArr[1]}, 2116841931, -2116841931, System.identityHashCode(aVar));
            }
            return charSequenceA;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ CharSequence invoke(setOverScrollMode setoverscrollmode) {
            return a(new Object[]{this, setoverscrollmode}, 608423663, -608423662, System.identityHashCode(this));
        }
    }

    static {
        c();
        f60748e = 0;
        f60749f = 1;
        f60747d = 1;
        f60746c = new char[]{58900, 59005, 59004, 59066};
    }

    public setTranscriptMode(@NotNull setOnGroupClickListener setongroupclicklistener) {
        Intrinsics.checkNotNullParameter(setongroupclicklistener, "");
        this.f60751a = setongroupclicklistener;
        this.f60752b = getTransactionPortrait.setNavigationOnClickListener;
    }

    public static void a(String str, boolean z10, int[] iArr, Object[] objArr) throws Throwable {
        int i10;
        int i11;
        int i12 = f60748e + 113;
        f60749f = i12 % 128;
        if (i12 % 2 == 0) {
            str.getBytes("ISO-8859-1");
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener();
        char c10 = 0;
        int i13 = iArr[0];
        int i14 = 1;
        int i15 = iArr[1];
        int i16 = iArr[2];
        int i17 = iArr[3];
        char[] cArr = f60746c;
        long j10 = 0;
        if (cArr != null) {
            int i18 = f60748e + 49;
            f60749f = i18 % 128;
            int i19 = i18 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i20 = 0;
            while (i20 < length) {
                try {
                    Object[] objArr2 = new Object[i14];
                    objArr2[c10] = Integer.valueOf(cArr[i20]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-637734149);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((Process.getElapsedCpuTime() > j10 ? 1 : (Process.getElapsedCpuTime() == j10 ? 0 : -1)) - 1), 37 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 609 - View.combineMeasuredStates(0, 0));
                        byte b10 = (byte) 0;
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr3 = new Object[1];
                        b(b10, (byte) (b11 - 1), b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(-637734149, method);
                    }
                    cArr2[i20] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i20++;
                    cArr = cArr;
                    length = length;
                    i16 = i16;
                    c10 = 0;
                    i14 = 1;
                    j10 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i10 = i16;
            cArr = cArr2;
        } else {
            i10 = i16;
        }
        char[] cArr3 = new char[i15];
        System.arraycopy(cArr, i13, cArr3, 0, i15);
        if (bytes != null) {
            char[] cArr4 = new char[i15];
            setnavigationonclicklistener.setX = 0;
            char c11 = 0;
            while (true) {
                int i21 = setnavigationonclicklistener.setX;
                if (i21 >= i15) {
                    break;
                }
                if (bytes[i21] == 1) {
                    int i22 = f60749f + 29;
                    f60748e = i22 % 128;
                    int i23 = i22 % 2;
                    Object[] objArr4 = {Integer.valueOf(cArr3[i21]), Integer.valueOf(c11)};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1737824323);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4449), 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1021 - Color.red(0));
                        byte length2 = (byte) f60750g.length;
                        Object[] objArr5 = new Object[1];
                        b((byte) 0, (byte) (length2 - 4), length2, objArr5);
                        String str2 = (String) objArr5[0];
                        Class<?> cls3 = Integer.TYPE;
                        method2 = cls2.getMethod(str2, cls3, cls3);
                        map2.put(1737824323, method2);
                    }
                    cArr4[i21] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i11 = 2;
                } else {
                    bytes = bytes;
                    Object[] objArr6 = {Integer.valueOf(cArr3[i21]), Integer.valueOf(c11)};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-504758789);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) View.resolveSize(0, 0), 45 - TextUtils.getOffsetBefore("", 0), 2627 - (ViewConfiguration.getTouchSlop() >> 8));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr7 = new Object[1];
                        b(b12, b13, b13, objArr7);
                        String str3 = (String) objArr7[0];
                        Class<?> cls5 = Integer.TYPE;
                        method3 = cls4.getMethod(str3, cls5, cls5);
                        map3.put(-504758789, method3);
                    }
                    cArr4[i21] = ((Character) ((Method) method3).invoke(null, objArr6)).charValue();
                    int i24 = f60748e + 113;
                    f60749f = i24 % 128;
                    i11 = 2;
                    int i25 = i24 % 2;
                }
                char c12 = cArr4[setnavigationonclicklistener.setX];
                Object[] objArr8 = new Object[i11];
                objArr8[1] = setnavigationonclicklistener;
                objArr8[0] = setnavigationonclicklistener;
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-265085633);
                if (method4 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) (31346 - TextUtils.lastIndexOf("", '0', 0, 0)), View.getDefaultSize(0, 0) + 48, 840 - TextUtils.indexOf("", "", 0, 0));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 3);
                    Object[] objArr9 = new Object[1];
                    b(b14, (byte) (b15 - 3), b15, objArr9);
                    method4 = cls6.getMethod((String) objArr9[0], Object.class, Object.class);
                    map4.put(-265085633, method4);
                }
                ((Method) method4).invoke(null, objArr8);
                c11 = c12;
                bytes = bytes;
            }
            cArr3 = cArr4;
        }
        if (i17 > 0) {
            char[] cArr5 = new char[i15];
            System.arraycopy(cArr3, 0, cArr5, 0, i15);
            int i26 = i15 - i17;
            System.arraycopy(cArr5, 0, cArr3, i26, i17);
            System.arraycopy(cArr5, i17, cArr3, 0, i26);
        }
        if (z10) {
            int i27 = f60748e + 85;
            f60749f = i27 % 128;
            int i28 = i27 % 2;
            char[] cArr6 = new char[i15];
            int i29 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i29;
                int i30 = setnavigationonclicklistener.setX;
                if (i30 >= i15) {
                    break;
                }
                cArr6[i30] = cArr3[(i15 - i30) - 1];
                i29 = i30 + 1;
            }
            cArr3 = cArr6;
        }
        if (i10 > 0) {
            int i31 = 0;
            while (true) {
                setnavigationonclicklistener.setX = i31;
                int i32 = setnavigationonclicklistener.setX;
                if (i32 >= i15) {
                    break;
                }
                cArr3[i32] = (char) (cArr3[i32] - iArr[2]);
                i31 = i32 + 1;
            }
        }
        String str4 = new String(cArr3);
        int i33 = f60749f + 17;
        f60748e = i33 % 128;
        int i34 = i33 % 2;
        objArr[0] = str4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r9 = r9 + 97
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r0 = new byte[r8]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.setTranscriptMode.f60750g
            if (r2 != 0) goto L15
            r3 = r9
            r5 = r1
            r9 = r8
            goto L2a
        L15:
            r3 = r1
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r0[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L25:
            r3 = r2[r7]
            r6 = r9
            r9 = r8
            r8 = r6
        L2a:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setTranscriptMode.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f60750g = new byte[]{83, -24, -71, 98};
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final getTransactionPortrait setDividerPadding() {
        int i10 = f60747d + 97;
        int i11 = i10 % 128;
        if (i10 % 2 == 0) {
            return this.f60752b;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.setScrollCaptureCallback
    @NotNull
    public final setAutoSizeTextTypeUniformWithPresetSizes setX() throws Throwable {
        setOverScrollMode[] compoundDrawableTintBlendMode = this.f60751a.setCompoundDrawableTintBlendMode();
        ArrayList arrayList = new ArrayList();
        for (setOverScrollMode setoverscrollmode : compoundDrawableTintBlendMode) {
            int i10 = f60747d;
            int i11 = i10 + 73;
            int i12 = i11 % 128;
            int i13 = i11 % 2;
            String str = (String) setOverScrollMode.setY(new Object[]{setoverscrollmode}, -1826405260, 1826405260, System.identityHashCode(setoverscrollmode));
            Object[] objArr = new Object[1];
            a("\u0000\u0001\u0001", false, new int[]{0, 3, 161, 0}, objArr);
            if (!(!Intrinsics.areEqual(str, ((String) objArr[0]).intern()))) {
                int i14 = i10 + 117;
                int i15 = i14 % 128;
                if (i14 % 2 != 0) {
                    arrayList.add(setoverscrollmode);
                    throw null;
                }
                arrayList.add(setoverscrollmode);
            }
        }
        if (arrayList.isEmpty()) {
            return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this}, -2060556907, 2060556908, (int) System.currentTimeMillis());
        }
        Object[] objArr2 = new Object[1];
        a("\u0001", true, new int[]{3, 1, 0, 0}, objArr2);
        return (setAutoSizeTextTypeUniformWithPresetSizes) setPersistentDrawingCache.setDividerPadding(new Object[]{this, CollectionsKt___CollectionsKt.joinToString$default(arrayList, ((String) objArr2[0]).intern(), null, null, 0, null, a.f60753p0, 30, null)}, 728146901, -728146899, (int) System.currentTimeMillis());
    }
}
