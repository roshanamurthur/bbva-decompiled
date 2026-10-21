package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0013\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/getCurrencyCustomFormatting;", "", "", "Lcom/mypinpad/tsdk/i/getTotalElapsedTimeout;", "setDividerPadding", "()[Lcom/mypinpad/tsdk/i/getTotalElapsedTimeout;", "", "p0", "<init>", "(Ljava/lang/String;)V", "setCompoundDrawableTintBlendMode"}, k = 1, mv = {1, 5, 1})
public final class getCurrencyCustomFormatting {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f55744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f55745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f55746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f55751i = null;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f55752a;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.getCurrencyCustomFormatting$setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/getCurrencyCustomFormatting$setCompoundDrawableTintBlendMode;", "", "", "setY", "Ljava/lang/String;", "setDividerPadding", "setX", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b();
        f55749g = 0;
        f55750h = 1;
        f55747e = 0;
        f55748f = 1;
        c();
        Process.getGidForName("");
        INSTANCE = new Companion(null);
        Object[] objArr = new Object[1];
        a("짇즙֟囊࣎䲋쪛\ufddd\ued94䓵\u18ad뚒ꆕ炶퐻扇唀갞\ue052\u2e7d\u193e\ud81f밄", 1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
        f55744b = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a("鴔鵹邛璛鷦滱ᐽ\ua954㌴톩㪱栄\uf552\ue59d\uf67d볐Ʀ㥄쉈\uf085䶷䴯鸞쒭", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr2);
        f55745c = ((String) objArr2[0]).intern();
        int i10 = f55748f + 35;
        f55747e = i10 % 128;
        int i11 = i10 % 2;
    }

    public getCurrencyCustomFormatting(@Nullable String str) {
        this.f55752a = str;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0109 A[Catch: all -> 0x0134, TryCatch #0 {all -> 0x0134, blocks: (B:8:0x0048, B:12:0x006f, B:13:0x00a5, B:15:0x00b3, B:25:0x012a, B:18:0x00c7, B:22:0x0104, B:24:0x0109, B:28:0x0136), top: B:43:0x0048 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0136 A[Catch: all -> 0x0134, TRY_LEAVE, TryCatch #0 {all -> 0x0134, blocks: (B:8:0x0048, B:12:0x006f, B:13:0x00a5, B:15:0x00b3, B:25:0x012a, B:18:0x00c7, B:22:0x0104, B:24:0x0109, B:28:0x0136), top: B:43:0x0048 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x013d -> B:30:0x014a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getCurrencyCustomFormatting.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void b() {
        f55751i = new byte[]{65, -110, 43, 49};
    }

    public static void c() {
        f55746d = 107436058600874450L;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.mypinpad.tsdk.i.l4] */
    @NotNull
    public final getTotalElapsedTimeout[] d(@NotNull Stream<String> stream) throws Throwable {
        Intrinsics.checkNotNullParameter(stream, "");
        final ArrayList arrayList = new ArrayList();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Pattern patternCompile = Pattern.compile(f55744b);
        stream.map(new Function() { // from class: com.mypinpad.tsdk.i.getCurrencyCustomFormatting.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f55757b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static int f55758c = 1;

            static {
                int i10 = f55757b;
                int i11 = (i10 & (-18)) | ((~i10) & 17);
                int i12 = (i10 & 17) << 1;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                f55758c = i13 % 128;
                int i14 = i13 % 2;
            }

            public static /* synthetic */ String a(Object[] objArr, int i10, int i11, int i12) {
                String string;
                int i13 = ~i11;
                int i14 = ~i12;
                if ((((~(i10 | i12)) | (~(i11 | i14))) * 950) + (((~(i14 | i10)) | (~(i11 | i12))) * (-950)) + (((~(i13 | i14)) | (~((~i10) | i12))) * ReturnCode.ERR_REPOSITORY) + (i11 * (-949)) + (i10 * (-949)) != 1) {
                    Object obj = objArr[1];
                    int i15 = f55757b;
                    int i16 = i15 ^ 113;
                    int i17 = ((((i15 & 113) | i16) << 1) - (~(-i16))) - 1;
                    f55758c = i17 % 128;
                    int i18 = i17 % 2;
                    string = a(new Object[]{(String) obj}, 2045771065, -2045771064, (int) System.currentTimeMillis());
                    int i19 = f55757b + 50;
                    int i20 = (i19 ^ (-1)) + (i19 << 1);
                    f55758c = i20 % 128;
                    if (i20 % 2 == 0) {
                        throw null;
                    }
                } else {
                    String str = (String) objArr[0];
                    int i21 = f55758c;
                    int i22 = (-2) - ((((i21 | 64) << 1) - (i21 ^ 64)) ^ (-1));
                    f55757b = i22 % 128;
                    int i23 = i22 % 2;
                    Intrinsics.checkNotNullParameter(str, "");
                    string = StringsKt__StringsKt.trim((CharSequence) str).toString();
                    int i24 = f55757b;
                    int i25 = (i24 & 113) + (i24 | 113);
                    f55758c = i25 % 128;
                    if (i25 % 2 == 0) {
                        throw null;
                    }
                }
                return string;
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return a(new Object[]{this, obj}, 1111344068, -1111344068, System.identityHashCode(this));
            }
        }).filter(new Predicate() { // from class: com.mypinpad.tsdk.i.getCurrencyCustomFormatting.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f55754b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static int f55755c = 1;

            static {
                int i10 = f55755c;
                int i11 = i10 & 19;
                int i12 = ((i10 ^ 19) | i11) << 1;
                int i13 = -((i10 | 19) & (~i11));
                int i14 = (i12 & i13) + (i13 | i12);
                f55754b = i14 % 128;
                int i15 = i14 % 2;
            }

            public static /* synthetic */ Boolean a(Object[] objArr, int i10, int i11, int i12) {
                boolean zBooleanValue;
                int i13 = ((i10 | i12) * (-859)) + (i11 * (-858)) + (i10 * 860);
                int i14 = ~i12;
                int i15 = ~(i14 | i10);
                int i16 = ~i10;
                int i17 = ~i11;
                if ((((~(i10 | i17)) | (~(i17 | i14))) * 859) + (((~(i12 | i16 | i17)) | i15) * 859) + i13 != 1) {
                    Object obj = objArr[1];
                    int i18 = f55755c;
                    int i19 = ((i18 & 25) - (~(-(-(i18 | 25))))) - 1;
                    f55754b = i19 % 128;
                    String str = (String) obj;
                    Object[] objArr2 = new Object[1];
                    if (i19 % 2 != 0) {
                        objArr2[0] = str;
                        zBooleanValue = a(objArr2, 1301482694, -1301482693, (int) System.currentTimeMillis()).booleanValue();
                        int i20 = 54 / 0;
                    } else {
                        objArr2[0] = str;
                        zBooleanValue = a(objArr2, 1301482694, -1301482693, (int) System.currentTimeMillis()).booleanValue();
                    }
                    return Boolean.valueOf(zBooleanValue);
                }
                String str2 = (String) objArr[0];
                int i21 = f55754b;
                int i22 = (i21 & 95) + (i21 | 95);
                f55755c = i22 % 128;
                int i23 = i22 % 2;
                Intrinsics.checkNotNullParameter(str2, "");
                if (str2.length() > 0) {
                    int i24 = f55755c;
                    int i25 = i24 & 73;
                    int i26 = i25 + ((i24 ^ 73) | i25);
                    f55754b = i26 % 128;
                    return Boolean.valueOf(i26 % 2 == 0);
                }
                int i27 = f55754b;
                int i28 = ((i27 ^ 93) | (i27 & 93)) << 1;
                int i29 = -(((~i27) & 93) | (i27 & (-94)));
                int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
                f55755c = i30 % 128;
                if (i30 % 2 == 0) {
                    int i31 = 35 / 0;
                }
                return Boolean.FALSE;
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ boolean test(Object obj) {
                return a(new Object[]{this, obj}, 1691075890, -1691075890, System.identityHashCode(this)).booleanValue();
            }
        }).forEach(new Consumer() { // from class: com.mypinpad.tsdk.i.l4
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.String] */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Pattern pattern = patternCompile;
                Ref.ObjectRef objectRef2 = objectRef;
                List list = arrayList;
                String str = (String) obj;
                getCurrencyCustomFormatting.Companion companion = getCurrencyCustomFormatting.INSTANCE;
                Intrinsics.checkNotNullParameter(objectRef2, "");
                Intrinsics.checkNotNullParameter(list, "");
                Matcher matcher = pattern.matcher(Intrinsics.stringPlus((String) objectRef2.element, str));
                if (!(!matcher.matches())) {
                    int i10 = getCurrencyCustomFormatting.f55747e + 73;
                    getCurrencyCustomFormatting.f55748f = i10 % 128;
                    int i11 = i10 % 2;
                    if (matcher.groupCount() >= 2) {
                        String strGroup = matcher.group(1);
                        Intrinsics.checkNotNull(strGroup);
                        String strGroup2 = matcher.group(2);
                        Intrinsics.checkNotNull(strGroup2);
                        list.add(new getTotalElapsedTimeout(strGroup, strGroup2));
                        objectRef2.element = "";
                        return;
                    }
                }
                objectRef2.element = Intrinsics.stringPlus((String) objectRef2.element, str);
                int i12 = getCurrencyCustomFormatting.f55748f + 19;
                getCurrencyCustomFormatting.f55747e = i12 % 128;
                if (i12 % 2 != 0) {
                    int i13 = 76 / 0;
                }
            }
        });
        String str = this.f55752a;
        if (str != null) {
            arrayList.add(new getTotalElapsedTimeout(f55745c, str));
            int i10 = f55748f + 69;
            f55747e = i10 % 128;
            int i11 = i10 % 2;
        }
        Object[] array = arrayList.toArray(new getTotalElapsedTimeout[0]);
        if (array != null) {
            return (getTotalElapsedTimeout[]) array;
        }
        Object[] objArr = new Object[1];
        a("쯦쮈⍘樆⸠灰熢\ufff2囩扺\u2429ොꏠ噂\ue8f0\ud946團誔\udc90镉᭗ﻶ肘ꄾ캖ㄦ甸窬\uf2b1敳㥹㛘\ua6ff奍\uedec쉚樲趌퇌鹋Ḓ쇒薇ꩦ솂㐤乊柨\uf59b档㈢㏫맯尙\ue6d8콀", View.resolveSizeAndState(0, 0, 0) + 1, objArr);
        throw new NullPointerException(((String) objArr[0]).intern());
    }

    @NotNull
    public final getTotalElapsedTimeout[] setDividerPadding() throws Throwable {
        Process processStart;
        Throwable th2;
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
            Object[] objArr = new Object[1];
            a("퓘퓷\ue800\uf3b8\ue57e\ue9db䋔\ue098斀ꤤ붛㻴볒鴜煔\uea20䠣䇌䕺\ua633Ѻ㖲ᤢ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr);
            processStart = processBuilder.command(((String) objArr[0]).intern()).redirectErrorStream(true).start();
            try {
                Intrinsics.checkNotNull(processStart);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
                try {
                    Stream<String> streamLines = bufferedReader.lines();
                    Intrinsics.checkNotNullExpressionValue(streamLines, "");
                    getTotalElapsedTimeout[] gettotalelapsedtimeoutArrD = d(streamLines);
                    CloseableKt.closeFinally(bufferedReader, null);
                    processStart.destroy();
                    return gettotalelapsedtimeoutArrD;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(bufferedReader, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                th2 = th5;
                if (processStart != null) {
                    processStart.destroy();
                    int i10 = f55747e + 121;
                    f55748f = i10 % 128;
                    int i11 = i10 % 2;
                }
                throw th2;
            }
        } catch (Throwable th6) {
            processStart = null;
            th2 = th6;
        }
    }

    public /* synthetic */ getCurrencyCustomFormatting(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getCurrencyCustomFormatting() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
