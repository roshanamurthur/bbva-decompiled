package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class TsdkManualInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f51941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f51942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f51943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f51944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f51945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f51946f = null;

    static {
        c();
        f51944d = 0;
        f51945e = 1;
        f51942b = 0;
        f51943c = 1;
        f51941a = 1309911600129874134L;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ec  */
    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        Throwable cause;
        int i12 = f51945e + 53;
        f51944d = i12 % 128;
        int i13 = 2;
        if (i12 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i14 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            i11 = 3;
            if (i14 >= charArray.length) {
                break;
            }
            int i15 = f51945e + 29;
            f51944d = i15 % 128;
            int i16 = i15 % i13;
            char c10 = charArray[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[i13] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c10);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ('0' - AndroidCharacter.getMirror('0')), 33 - TextUtils.getCapsMode("", 0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1194);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, (byte) (b11 + 1), objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f51941a ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44, Drawable.resolveOpacity(0, 0) + 728);
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i13 = 2;
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
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i17 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i17 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i18 = f51944d + i11;
            f51945e = i18 % 128;
            if (i18 % 2 == 0) {
                cArr[i17] = (char) jArr[i17];
                Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 43 - Process.getGidForName(""), ExpandableListView.getPackedPositionGroup(0L) + 728);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                int i19 = 19 / 0;
            } else {
                cArr[i17] = (char) jArr[i17];
                Object[] objArr8 = {setlayoutanimation, setlayoutanimation};
                Map map3 = setTextScaleX.setMaxEms;
                Object method4 = map3.get(645183118);
                if (method4 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) View.getDefaultSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 728);
                    byte b16 = (byte) 0;
                    byte b17 = b16;
                    Object[] objArr9 = new Object[1];
                    b(b16, b17, b17, objArr9);
                    method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                    map3.put(645183118, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
            i11 = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r8 = r8 * 3
            int r8 = r8 + 107
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = new byte[r6]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.TsdkManualInitializer.f51946f
            if (r2 != 0) goto L17
            r8 = r6
            r4 = r7
            r3 = r1
            goto L30
        L17:
            r3 = r1
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L1c:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2b:
            r4 = r2[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r7 = r7 + 1
            int r6 = r6 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.TsdkManualInitializer.b(short, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        f51946f = new byte[]{91, -14, -6, UtilitiesSDKConstants.SRP_LABEL_MAC};
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x0048  */
    public static boolean d(String str) throws Throwable {
        Object[] objArr;
        int i10 = f51942b + 89;
        f51943c = i10 % 128;
        if (i10 % 2 == 0) {
            Object[] objArr2 = new Object[1];
            a("筼\u2e7e", Process.myPid() + 29392, objArr2);
            if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ((String) objArr2[0]).intern(), false, 4, (Object) null)) {
                int i11 = f51943c + 99;
                f51942b = i11 % 128;
                int i12 = i11 % 2;
                objArr = new Object[1];
                a("筼᷅똘", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26293, objArr);
                if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ((String) objArr[0]).intern(), false, 2, (Object) null)) {
                    return false;
                }
            }
        } else {
            Object[] objArr3 = new Object[1];
            a("筼\u2e7e", (Process.myPid() >> 22) + 21773, objArr3);
            if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ((String) objArr3[0]).intern(), false, 2, (Object) null)) {
                int i13 = f51943c + 99;
                f51942b = i13 % 128;
                int i14 = i13 % 2;
                objArr = new Object[1];
                a("筼᷅똘", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26293, objArr);
                if (!StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ((String) objArr[0]).intern(), false, 2, (Object) null)) {
                    return false;
                }
            }
        }
        int i15 = f51942b + 3;
        f51943c = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 89 / 0;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0119  */
    @NotNull
    public final setOnTouchListener[] setDividerPadding(@NotNull List<String> list) throws Throwable {
        Process processStart;
        String text;
        Intrinsics.checkNotNullParameter(list, "");
        Object[] objArr = new Object[1];
        a("笭ꯍ", 53503 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("筬ࢨ", 29573 - TextUtils.indexOf("", "", 0), objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a("筬乏", (ViewConfiguration.getTouchSlop() >> 8) + 13679, objArr3);
        String[] strArr = {strIntern, strIntern2, ((String) objArr3[0]).intern()};
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                Object[] array = arrayList.toArray(new setOnTouchListener[0]);
                if (array != null) {
                    return (setOnTouchListener[]) array;
                }
                Object[] objArr4 = new Object[1];
                a("笯숍य़傆龅\ue53fⱶ殠닧\uf82f䜏踒햏᳁婿ꅵ\ue8b0㟻紷쑚́䪃醇\udf30♶涾뒦\uf22c㤈聘쾃ᚆ尕魡\ue2a3⧯睥븗\u0558䲚诅턉ᡵ柼껌\uf436㌍穗솈\u0894嘷鴤", (KeyEvent.getMaxKeyCode() >> 16) + 47417, objArr4);
                throw new NullPointerException(((String) objArr4[0]).intern());
            }
            String str = (String) it.next();
            Process process = null;
            try {
                processStart = new ProcessBuilder((String[]) Arrays.copyOf(strArr, 3)).directory(new File(str)).start();
                try {
                    try {
                        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(processStart.getOutputStream()));
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
                        printWriter.flush();
                        try {
                            text = TextStreamsKt.readText(bufferedReader);
                            CloseableKt.closeFinally(bufferedReader, null);
                            processStart.destroy();
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(bufferedReader, th2);
                                throw th3;
                            }
                        }
                    } catch (IOException e5) {
                        e = e5;
                        String message = e.getMessage();
                        if (message != null && message.length() != 0) {
                            String message2 = e.getMessage();
                            Intrinsics.checkNotNull(message2);
                            if (!d(message2)) {
                                break;
                            }
                            int i10 = f51943c + 57;
                            f51942b = i10 % 128;
                            if (i10 % 2 != 0) {
                                throw null;
                            }
                            if (processStart != null) {
                                processStart.destroy();
                            }
                            int i11 = f51943c + 95;
                            f51942b = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 27 / 0;
                            }
                            text = "";
                        } else {
                            break;
                        }
                        throw new addSuppressed(e);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    process = processStart;
                    if (process != null) {
                        process.destroy();
                    }
                    throw th;
                }
            } catch (IOException e7) {
                e = e7;
                processStart = null;
            } catch (Throwable th5) {
                th = th5;
                if (process != null) {
                    process.destroy();
                }
                throw th;
            }
            arrayList.add(new setOnTouchListener(str, text));
            int i13 = f51943c + 81;
            f51942b = i13 % 128;
            int i14 = i13 % 2;
        }
        throw new addSuppressed(e);
    }
}
