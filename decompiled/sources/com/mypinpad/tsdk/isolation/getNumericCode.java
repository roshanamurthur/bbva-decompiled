package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/getNumericCode;", "", "", "", "setX", "()Ljava/util/List;", "Lcom/mypinpad/tsdk/i/setColorFilter;", "p0", "<init>", "(Lcom/mypinpad/tsdk/i/setColorFilter;)V", "setY"}, k = 1, mv = {1, 5, 1})
public final class getNumericCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char f55929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char f55930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static char f55931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static char f55932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f55937i = null;

    static {
        c();
        f55935g = 0;
        f55936h = 1;
        f55933e = 0;
        f55934f = 1;
        d();
        KeyEvent.getModifierMetaStateMask();
        TextUtils.indexOf("", "", 0);
        INSTANCE = new Companion(null);
        int i10 = f55934f + 57;
        f55933e = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public getNumericCode(@NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
    }

    public static void a(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = f55936h + 33;
        f55935g = i12 % 128;
        int i13 = 2;
        int i14 = i12 % 2;
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i15 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i16 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i16 >= charArray.length) {
                break;
            }
            int i17 = f55935g + 51;
            f55936h = i17 % 128;
            int i18 = 58224;
            if (i17 % i13 == 0) {
                cArr2[1] = charArray[i16];
                cArr2[i15] = charArray[i16 >>> 1];
                i11 = 1;
            } else {
                cArr2[i15] = charArray[i16];
                cArr2[1] = charArray[i16 + 1];
                i11 = i15;
            }
            while (i11 < 16) {
                char c10 = cArr2[1];
                char c11 = cArr2[i15];
                int i19 = (c11 + i18) ^ ((c11 << 4) + ((char) (((long) f55931c) ^ 4333817592127744003L)));
                int i20 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f55932d);
                    objArr2[i13] = Integer.valueOf(i20);
                    objArr2[1] = Integer.valueOf(i19);
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48534 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 47, TextUtils.indexOf("", "", 0, 0) + 2672);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        b(b10, (byte) (b11 + 1), b11, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i18) ^ ((cCharValue << 4) + ((char) (((long) f55929a) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f55930b)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48534 - (ViewConfiguration.getLongPressTimeout() >> 16)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46, 2720 - AndroidCharacter.getMirror('0'));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b12, (byte) (b13 + 1), b13, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i18 -= 40503;
                    i11++;
                    i13 = 2;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i21 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i21] = cArr2[0];
            cArr[i21 + 1] = cArr2[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) Color.green(0), 37 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2145 - KeyEvent.normalizeMetaState(0));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr7 = new Object[1];
                b(b14, b15, b15, objArr7);
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i13 = 2;
            i15 = 0;
        }
        String str4 = new String(cArr, 0, i10);
        int i22 = f55936h + 75;
        f55935g = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
        objArr[0] = str4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r7 = r7 * 2
            int r7 = 105 - r7
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.getNumericCode.f55937i
            if (r2 != 0) goto L1b
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L35
        L1b:
            r3 = r1
        L1c:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2b:
            r3 = r2[r8]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L35:
            int r9 = r9 + 1
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getNumericCode.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f55937i = new byte[]{25, -30, -107, -39};
    }

    public static void d() {
        f55932d = (char) 46938;
        f55931c = (char) 3169;
        f55929a = (char) 39743;
        f55930b = (char) 57785;
    }

    @NotNull
    public final List<String> setX() throws Throwable {
        List arrayList;
        Object next;
        boolean zIsFile;
        String line;
        Object[] objArr = new Object[1];
        a("ý椴\u07ba돏䜿䍙份\ue01a秊跣詯䛨⯎麏縧琝", 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        File[] fileArrListFiles = new File(((String) objArr[0]).intern()).listFiles();
        if (fileArrListFiles == null) {
            int i10 = f55933e + 113;
            f55934f = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 39 / 0;
            }
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(fileArrListFiles.length);
            for (File file : fileArrListFiles) {
                Object[] objArr2 = new Object[1];
                a("늵壢孽윔৩獔", 6 - Drawable.resolveOpacity(0, 0), objArr2);
                arrayList2.add(new File(file, ((String) objArr2[0]).intern()));
            }
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                int i12 = f55933e + 29;
                f55934f = i12 % 128;
                if (i12 % 2 == 0) {
                    next = it.next();
                    File file2 = (File) next;
                    try {
                        zIsFile = file2.isFile();
                        int i13 = 93 / 0;
                    } catch (IOException e5) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr3 = new Object[1];
                        a("쇶끦묃焓\u0081컰歂엩象쀎䖂䫈쯸良\uf203햂쳪칤\uf660哈", 20 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr3);
                        sb2.append(((String) objArr3[0]).intern());
                        sb2.append((Object) file2.getCanonicalPath());
                        Object[] objArr4 = new Object[1];
                        a("瞇庆", Color.rgb(0, 0, 0) + 16777218, objArr4);
                        sb2.append(((String) objArr4[0]).intern());
                        sb2.append((Object) e5.getMessage());
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb2.toString()}, 1673747418, -1673747410, (int) System.currentTimeMillis());
                        zIsFile = false;
                    } catch (SecurityException e7) {
                        StringBuilder sb3 = new StringBuilder();
                        Object[] objArr5 = new Object[1];
                        a("쇶끦묃焓\u0081컰歂엩象쀎䖂䫈쯸良\uf203햂쳪칤\uf660哈", 20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
                        sb3.append(((String) objArr5[0]).intern());
                        sb3.append((Object) file2.getCanonicalPath());
                        Object[] objArr6 = new Object[1];
                        a("瞇庆", 2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr6);
                        sb3.append(((String) objArr6[0]).intern());
                        sb3.append((Object) e7.getMessage());
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb3.toString()}, 1673747418, -1673747410, (int) System.currentTimeMillis());
                        zIsFile = false;
                    }
                } else {
                    next = it.next();
                    zIsFile = ((File) next).isFile();
                }
                int i14 = f55933e + 53;
                f55934f = i14 % 128;
                int i15 = i14 % 2;
                if (zIsFile) {
                    int i16 = f55934f + 75;
                    f55933e = i16 % 128;
                    if (i16 % 2 != 0) {
                        arrayList.add(next);
                        int i17 = 48 / 0;
                    } else {
                        arrayList.add(next);
                    }
                }
            }
        }
        if (arrayList == null) {
            int i18 = f55933e + 99;
            f55934f = i18 % 128;
            int i19 = i18 % 2;
            arrayList = CollectionsKt__CollectionsKt.emptyList();
        } else {
            int i20 = f55933e + 33;
            f55934f = i20 % 128;
            int i21 = i20 % 2;
        }
        List<File> list = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (File file3 : list) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file3), Charsets.UTF_8), 8192);
                try {
                    line = bufferedReader.readLine();
                    CloseableKt.closeFinally(bufferedReader, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (IOException e10) {
                StringBuilder sb4 = new StringBuilder();
                Object[] objArr7 = new Object[1];
                a("쇶끦묃焓\u0081컰歂엩象쀎䖂䫈쯸良\uf203햂쳪칤\uf660哈", 19 - TextUtils.lastIndexOf("", '0', 0, 0), objArr7);
                sb4.append(((String) objArr7[0]).intern());
                sb4.append((Object) file3.getCanonicalPath());
                Object[] objArr8 = new Object[1];
                a("瞇庆", 2 - TextUtils.getCapsMode("", 0, 0), objArr8);
                sb4.append(((String) objArr8[0]).intern());
                sb4.append((Object) e10.getMessage());
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{sb4.toString()}, 1673747418, -1673747410, (int) System.currentTimeMillis());
                line = "";
            }
            arrayList3.add(line);
        }
        return arrayList3;
    }
}
