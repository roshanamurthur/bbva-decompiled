package com.mypinpad.tsdk.isolation;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnGroupClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char f60226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char f60227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char f60228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f60229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f60232h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PackageManager f60233a;

    static {
        c();
        f60230f = 0;
        f60231g = 1;
        f60229e = (char) 37160;
        f60228d = (char) 36609;
        f60226b = (char) 24407;
        f60227c = (char) 4331;
    }

    public setOnGroupClickListener(@NotNull PackageManager packageManager) {
        Intrinsics.checkNotNullParameter(packageManager, "");
        this.f60233a = packageManager;
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        char c10;
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i11 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char c11 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i12 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i12 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[i11] = charArray[i12];
            cArr2[1] = charArray[i12 + 1];
            int i13 = 58224;
            int i14 = i11;
            while (i14 < 16) {
                char c12 = cArr2[1];
                char c13 = cArr2[i11];
                int i15 = (c13 + i13) ^ ((c13 << 4) + ((char) (((long) f60228d) ^ 4333817592127744003L)));
                int i16 = c13 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f60229e);
                    objArr2[c11] = Integer.valueOf(i16);
                    objArr2[1] = Integer.valueOf(i15);
                    objArr2[i11] = Integer.valueOf(c12);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48534 - TextUtils.getOffsetBefore("", i11)), 47 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2672 - (ViewConfiguration.getEdgeSlop() >> 16));
                        byte b10 = (byte) i11;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i13) ^ ((cCharValue << 4) + ((char) (((long) f60226b) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f60227c)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48534 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 46 - MotionEvent.axisFromString(""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2672);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, b13, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i13 -= 40503;
                    i14++;
                    i11 = 0;
                    c11 = 2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i17 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i17] = cArr2[0];
            cArr[i17 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 != null) {
                c10 = 2;
            } else {
                Class cls5 = (Class) setTextScaleX.setX((char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 38 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2144);
                byte b14 = (byte) 1;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr7 = new Object[1];
                b(b14, b15, b15, objArr7);
                c10 = 2;
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            c11 = c10;
            i11 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0039). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r9 = r9 * 4
            int r9 = 3 - r9
            int r7 = r7 * 2
            int r7 = r7 + 103
            byte[] r0 = new byte[r8]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.setOnGroupClickListener.f60232h
            if (r2 != 0) goto L1b
            r7 = r9
            r4 = r1
            r3 = r2
            r9 = r8
            r2 = r0
            r0 = r10
            r10 = r7
            goto L39
        L1b:
            r3 = r1
            r6 = r9
            r9 = r7
            r7 = r6
        L1f:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r8) goto L2e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2e:
            int r7 = r7 + 1
            r3 = r2[r7]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L39:
            int r8 = -r8
            int r8 = r8 + r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setOnGroupClickListener.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f60232h = new byte[]{4, 27, -82, 100};
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    @NotNull
    public final setOverScrollMode[] setCompoundDrawableTintBlendMode() throws Throwable {
        boolean z10;
        Object[] objArr = new Object[1];
        a("བྷꀗ\ued12\uaa3f웈쬦⸒\uea9f矢ꄡ\uf5fb䐮긼唯㼪ܥ\udb6b\ue9de밄鯘銇挀㒃\u2ef5໋\uf373", ExpandableListView.getPackedPositionType(0L) + 26, objArr);
        try {
            List<ResolveInfo> listQueryIntentActivities = this.f60233a.queryIntentActivities(new Intent(((String) objArr[0]).intern()), 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "");
            ArrayList<ResolveInfo> arrayList = new ArrayList();
            for (Object obj : listQueryIntentActivities) {
                int i10 = f60230f + 23;
                f60231g = i10 % 128;
                int i11 = i10 % 2;
                ActivityInfo activityInfo = ((ResolveInfo) obj).activityInfo;
                if (activityInfo != null) {
                    int i12 = f60231g + 99;
                    f60230f = i12 % 128;
                    int i13 = i12 % 2;
                    if (((ComponentInfo) activityInfo).exported && ((ComponentInfo) activityInfo).enabled) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (!(!z10)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (ResolveInfo resolveInfo : arrayList) {
                String str = ((PackageItemInfo) resolveInfo.activityInfo).name;
                Intrinsics.checkNotNullExpressionValue(str, "");
                String str2 = ((PackageItemInfo) resolveInfo.activityInfo).packageName;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                arrayList2.add(new setOverScrollMode(str, str2));
            }
            Object[] array = arrayList2.toArray(new setOverScrollMode[0]);
            if (array != null) {
                return (setOverScrollMode[]) array;
            }
            Object[] objArr2 = new Object[1];
            a("曾ꜚ䳮燤䞳⡻བྷꀗ\u0ad1ﯕ\uf3e0沢뵵ꗱ䞳⡻視▙\uf3e0沢\u2e77莞꾱լ끯仗\uf491畋䥴跺Ꜥ諮빴⋹卵ﺫ⟁唸㋿蠀\ueb59爻銇挀쭓ᶄ殺ꒌ褯簿阧䋱", 52 - View.MeasureSpec.getMode(0), objArr2);
            throw new NullPointerException(((String) objArr2[0]).intern());
        } catch (ActivityNotFoundException unused) {
            return new setOverScrollMode[0];
        }
    }
}
