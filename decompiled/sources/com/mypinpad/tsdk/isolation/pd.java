package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\tJ\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\rJ)\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014\"\u0004\b\u000f\u0010\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/pd;", "", "", "p0", "p1", "", "setX", "(Ljava/lang/String;Ljava/lang/String;)V", "setOnFocusChangeListener", "()V", "Lcom/mypinpad/tsdk/i/setHorizontalScrollbarOverlay;", "", "p2", "(Lcom/mypinpad/tsdk/i/setHorizontalScrollbarOverlay;Ljava/lang/String;Ljava/lang/Throwable;)V", "", "setY", "(ILjava/lang/String;Ljava/lang/Throwable;)V", "Lorg/json/JSONObject;", "a", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "setCompoundDrawableTintBlendMode", "<init>"}, k = 1, mv = {1, 8, 0})
public final class pd {

    @NotNull
    public static final pd INSTANCE = new pd();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static JSONObject setCompoundDrawableTintBlendMode = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57662b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57663c = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/mypinpad/tsdk/i/getCode;", "p0", "", "d", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMonitoring.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Monitoring.kt\ncom/mypinpad/tsdk/internal/monitoring/Monitoring$setup$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1603#2,9:81\n1855#2:90\n1856#2:92\n1612#2:93\n1#3:91\n*S KotlinDebug\n*F\n+ 1 Monitoring.kt\ncom/mypinpad/tsdk/internal/monitoring/Monitoring$setup$1\n*L\n35#1:81,9\n35#1:90\n35#1:92\n35#1:93\n35#1:91\n*E\n"})
    public static final class a extends Lambda implements Function1<List<? extends getCode>, Unit> {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f57664r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f57665s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static int f57666t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f57667u0;
        public static int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static final byte[] f57668w0 = null;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f57669p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f57670q0;

        static {
            c();
            f57667u0 = 0;
            v0 = 1;
            f57665s0 = 0;
            f57666t0 = 1;
            f57664r0 = -443080112;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(1);
            this.f57669p0 = str;
            this.f57670q0 = str2;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x01ab  */
        /* JADX WARN: Code duplicated, block: B:39:0x01ac  */
        public static void a(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
            long j10;
            char[] cArr;
            Throwable cause;
            int i13 = v0 + 103;
            int i14 = i13 % 128;
            f57667u0 = i14;
            int i15 = 2;
            int i16 = i13 % 2;
            int i17 = i14 + 23;
            v0 = i17 % 128;
            int i18 = i17 % 2;
            char[] charArray = str.toCharArray();
            getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
            char[] cArr2 = new char[i10];
            int i19 = 0;
            getnavbartitlestring.setY = 0;
            while (true) {
                int i20 = getnavbartitlestring.setY;
                j10 = 0;
                if (i20 >= i10) {
                    break;
                }
                char c10 = charArray[i20];
                getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
                char c11 = (char) (i11 + c10);
                cArr2[i20] = c11;
                try {
                    Object[] objArr2 = new Object[i15];
                    objArr2[1] = Integer.valueOf(f57664r0);
                    objArr2[i19] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(133002375);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 41 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 484 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        byte b10 = (byte) i19;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, (byte) (b11 + 1), objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2);
                        map.put(133002375, method);
                    }
                    cArr2[i20] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                    Object method2 = map.get(1860518195);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (KeyEvent.getDeadChar(0, 0) + 55966), 43 - TextUtils.indexOf("", "", 0), 2268 - (ViewConfiguration.getTapTimeout() >> 16));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, b13, objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                        map.put(1860518195, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    i15 = 2;
                    i19 = 0;
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            if (i12 > 0) {
                getnavbartitlestring.setOnFocusChangeListener = i12;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i21 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr3, 0, cArr2, i10 - i21, i21);
                int i22 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr3, i22, cArr2, 0, i10 - i22);
            }
            if (z10) {
                int i23 = f57667u0 + 21;
                v0 = i23 % 128;
                if (i23 % 2 == 0) {
                    cArr = new char[i10];
                    getnavbartitlestring.setY = 1;
                } else {
                    cArr = new char[i10];
                    getnavbartitlestring.setY = 0;
                }
                while (true) {
                    int i24 = getnavbartitlestring.setY;
                    if (i24 >= i10) {
                        break;
                    }
                    cArr[i24] = cArr2[(i10 - i24) - 1];
                    Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method3 = map2.get(1860518195);
                    if (method3 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (TextUtils.getOffsetAfter("", 0) + 55966), 42 - ExpandableListView.getPackedPositionChild(j10), 2267 - ((byte) KeyEvent.getModifierMetaStateMask()));
                        byte b14 = (byte) 0;
                        byte b15 = b14;
                        Object[] objArr7 = new Object[1];
                        b(b14, b15, b15, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(1860518195, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                    j10 = 0;
                }
                int i25 = v0 + 69;
                f57667u0 = i25 % 128;
                int i26 = i25 % 2;
                cArr2 = cArr;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 + 65
                int r7 = r7 * 3
                int r0 = 1 - r7
                int r6 = r6 * 3
                int r6 = 3 - r6
                byte[] r0 = new byte[r0]
                r1 = 0
                int r7 = 0 - r7
                byte[] r2 = com.mypinpad.tsdk.i.pd.a.f57668w0
                if (r2 != 0) goto L17
                r4 = r8
                r3 = r1
                r8 = r7
                goto L2e
            L17:
                r3 = r1
            L18:
                byte r4 = (byte) r8
                int r6 = r6 + 1
                r0[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r1)
                r9[r1] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r2[r6]
                r5 = r8
                r8 = r7
                r7 = r5
            L2e:
                int r4 = -r4
                int r7 = r7 + r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.pd.a.b(byte, byte, short, java.lang.Object[]):void");
        }

        public static void c() {
            f57668w0 = new byte[]{76, 17, -23, -60};
        }

        public final void d(@NotNull List<? extends getCode> list) throws Exception {
            String str;
            JSONObject dividerPadding;
            Intrinsics.checkNotNullParameter(list, "");
            try {
                JSONObject jSONObject = new JSONObject();
                Object[] objArr = new Object[1];
                a(6 - (ViewConfiguration.getLongPressTimeout() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 245, TextUtils.indexOf("", "", 0) + 1, "\ufff7\u0005\u0006\u0000\ufff7\b", true, objArr);
                String strIntern = ((String) objArr[0]).intern();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    str = this.f57669p0;
                    if (!zHasNext) {
                        break;
                    }
                    getCode getcode = (getCode) it.next();
                    if (getcode instanceof pf) {
                        dividerPadding = oz.setDividerPadding((pf) getcode, str);
                        int i10 = f57666t0 + 33;
                        f57665s0 = i10 % 128;
                        int i11 = i10 % 2;
                    } else {
                        dividerPadding = null;
                    }
                    if (dividerPadding != null) {
                        arrayList.add(dividerPadding);
                    } else {
                        int i12 = f57665s0 + 111;
                        f57666t0 = i12 % 128;
                        int i13 = i12 % 2;
                    }
                }
                String string = jSONObject.put(strIntern, new JSONArray((Collection) arrayList)).toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                yk.setDividerPadding setdividerpadding = new yk.setDividerPadding();
                String str2 = this.f57670q0;
                Object[] objArr2 = new Object[1];
                a(View.resolveSizeAndState(0, 0, 0) + 10, 235 - KeyEvent.getDeadChar(0, 0), 5 - Process.getGidForName(""), "\ufffe\u000b\u0000\u0002￦\u0001￦\u000b\u0010\u0011", false, objArr2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                Object[] objArr3 = new Object[1];
                a(KeyEvent.keyCodeFromString("") + 13, 234 - TextUtils.indexOf("", "", 0), KeyEvent.keyCodeFromString("") + 4, "\u0014\u0003\f\u0012ￍ\u0001\n\u0007\u0003\f\u0012ￍ\u0003", false, objArr3);
                sb2.append(((String) objArr3[0]).intern());
                yo.Companion companion = yo.INSTANCE;
                yj.setX setx = yj.setOnFocusChangeListener;
                Object[] objArr4 = new Object[1];
                a(Color.blue(0) + 16, 239 - (ViewConfiguration.getTapTimeout() >> 16), 11 - View.MeasureSpec.makeMeasureSpec(0, 0), "\u0007\b\u0002\r\ufffa￼\u0002\u0005\t\t\ufffa\u0007\b\f\u0003\uffc8", true, objArr4);
                yk ykVar = (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 721744858, -721744846, System.identityHashCode(setdividerpadding));
                ss ssVar = ss.setCompoundDrawableTintBlendMode;
                getPinPadPortrait getpinpadportrait = (getPinPadPortrait) ss.setX(new Object[]{qj.setY(ykVar, TransactionNotAuthorisedReason.setOnFocusChangeListener)}, -1384554940, 1384554946, (int) System.currentTimeMillis());
                if (((Integer) getPinPadPortrait.setCompoundDrawableTintBlendMode(new Object[]{getpinpadportrait}, -717849782, 717849786, System.identityHashCode(getpinpadportrait))).intValue() < 300) {
                    int i14 = f57665s0 + 45;
                    f57666t0 = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    Object[] objArr5 = new Object[1];
                    a((Process.myTid() >> 22) + 44, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 232, 20 - ImageFormat.getBitsPerPixel(0), "\u0012\u0012\u0005\uffc0\u0005\u0003\t\u0016\u0012\u0005\u0013\uffc0\u0007\u000e\t\u0014\u0012\u000f\u0010\u0005\ufff2\uffc0ￚ\u0005\u0004\u000f\u0003\uffc0\u0005\u0013\u000e\u000f\u0010\u0013\u0005\u0012\uffc0\b\u0014\t\u0017\uffc0\u0012\u000f", true, objArr5);
                    sb3.append(((String) objArr5[0]).intern());
                    sb3.append(getpinpadportrait.setCompoundDrawableTintBlendMode());
                    throw new Exception(sb3.toString());
                }
            } catch (Exception e5) {
                nf.setX().setOnFocusChangeListener();
                throw e5;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(List<? extends getCode> list) throws Exception {
            int i10 = f57666t0 + 21;
            f57665s0 = i10 % 128;
            int i11 = i10 % 2;
            d(list);
            Unit unit = Unit.INSTANCE;
            int i12 = f57665s0 + 27;
            f57666t0 = i12 % 128;
            int i13 = i12 % 2;
            return unit;
        }
    }

    static {
        int i10 = f57662b + 3;
        f57663c = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((~(i10 | i11)) * 933) + (((~(i15 | i13)) | (~(i13 | i10))) * 933) + (((~(i14 | i15)) | i13) * (-933)) + (i11 * (-932)) + (i10 * 934);
        if (i16 == 1) {
            JSONObject jSONObject = (JSONObject) objArr[0];
            int i17 = f57663c;
            int i18 = i17 ^ 69;
            int i19 = (i17 & 69) << 1;
            int i20 = (i18 & i19) + (i18 | i19);
            f57662b = i20 % 128;
            int i21 = i20 % 2;
            setCompoundDrawableTintBlendMode = jSONObject;
            if (i21 != 0) {
                throw null;
            }
            int i22 = (i17 & (-36)) | ((~i17) & 35);
            int i23 = -(-((i17 & 35) << 1));
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f57662b = i24 % 128;
            int i25 = i24 % 2;
            return null;
        }
        if (i16 == 2) {
            setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay = (setHorizontalScrollbarOverlay) objArr[1];
            String str = (String) objArr[2];
            int i26 = f57663c;
            int i27 = (i26 ^ 101) + ((i26 & 101) << 1);
            f57662b = i27 % 128;
            if (i27 % 2 == 0) {
                Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay, "");
                Intrinsics.checkNotNullParameter(str, "");
                ms msVar = ms.INSTANCE;
                mr mrVar = mr.setOnFocusChangeListener;
                msVar.setCompoundDrawableTintBlendMode(sethorizontalscrollbaroverlay, str);
                return null;
            }
            Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay, "");
            Intrinsics.checkNotNullParameter(str, "");
            ms msVar2 = ms.INSTANCE;
            mr mrVar2 = mr.setOnFocusChangeListener;
            msVar2.setCompoundDrawableTintBlendMode(sethorizontalscrollbaroverlay, str);
            int i28 = 68 / 0;
            return null;
        }
        if (i16 == 3) {
            int iIntValue = ((Number) objArr[1]).intValue();
            String str2 = (String) objArr[2];
            Throwable th2 = (Throwable) objArr[3];
            int i29 = f57663c;
            int i30 = (-2) - (((i29 & 68) + (i29 | 68)) ^ (-1));
            f57662b = i30 % 128;
            int i31 = i30 % 2;
            int i32 = (iIntValue & 210001) + (iIntValue | 210001);
            mq.INSTANCE.setY((i32 ^ (-1)) + (i32 << 1), str2, th2);
            int i33 = f57662b;
            int i34 = ((i33 ^ 29) | (i33 & 29)) << 1;
            int i35 = -(((~i33) & 29) | (i33 & (-30)));
            int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
            f57663c = i36 % 128;
            if (i36 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i16 == 4) {
            int i37 = f57663c;
            int i38 = ((-1) << 1) - ((i37 + 32) ^ (-1));
            f57662b = i38 % 128;
            int i39 = i38 % 2;
            JSONObject jSONObject2 = setCompoundDrawableTintBlendMode;
            int i40 = (i37 & (-60)) | ((~i37) & 59);
            int i41 = -(-((i37 & 59) << 1));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            f57662b = i42 % 128;
            int i43 = i42 % 2;
            return jSONObject2;
        }
        if (i16 != 5) {
            int i44 = f57663c + 37;
            f57662b = i44 % 128;
            int i45 = i44 % 2;
            nf.setX().setOnFocusChangeListener();
            int i46 = f57662b;
            int i47 = i46 ^ 43;
            int i48 = ((i46 & 43) | i47) << 1;
            int i49 = -i47;
            int i50 = (i48 ^ i49) + ((i48 & i49) << 1);
            f57663c = i50 % 128;
            int i51 = i50 % 2;
            return null;
        }
        String str3 = (String) objArr[0];
        String str4 = (String) objArr[1];
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        nf.setX().setDividerPadding("", 20, 2000L, 100L, new a(str4, str3));
        int i52 = f57663c;
        int i53 = i52 & 83;
        int i54 = -(-((i52 ^ 83) | i53));
        int i55 = (i53 & i54) + (i54 | i53);
        f57662b = i55 % 128;
        if (i55 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static void setX(@NotNull String p4, @NotNull String p10) {
        setOnFocusChangeListener(new Object[]{p4, p10}, 475568212, -475568207, (int) System.currentTimeMillis());
    }

    public final void setY(int p4, @Nullable String p10, @Nullable Throwable p11) {
        setOnFocusChangeListener(new Object[]{this, Integer.valueOf(p4), p10, p11}, 691581619, -691581616, p4);
    }

    @JvmName(name = "setY")
    public static void setY(@Nullable JSONObject jSONObject) {
        setOnFocusChangeListener(new Object[]{jSONObject}, 34418482, -34418481, (int) System.currentTimeMillis());
    }

    public final void setX(@NotNull setHorizontalScrollbarOverlay p4, @NotNull String p10, @Nullable Throwable p11) {
        setOnFocusChangeListener(new Object[]{this, p4, p10, p11}, 1784152055, -1784152053, System.identityHashCode(this));
    }

    @JvmName(name = "setY")
    @Nullable
    public static JSONObject setY() {
        return (JSONObject) setOnFocusChangeListener(new Object[0], 408377454, -408377450, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener() {
        setOnFocusChangeListener(new Object[0], 1017746671, -1017746671, (int) System.currentTimeMillis());
    }
}
