package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import bk.d;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.domain.util.Constant;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/abk;", "", "", "p0", "setY", "(Ljava/lang/String;)Ljava/lang/String;", "<init>", "()V", "setDividerPadding"}, k = 1, mv = {1, 6, 0})
public final class abk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f52309h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f52310i = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f52311a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CountDownLatch f52312b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f52313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f52314d;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final byte[] f52306e = {42};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final List<String> f52307f = d.listOf(ProxyConfig.MATCH_ALL_SCHEMES);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final abk f52308g = new abk();

    static {
        int i10 = f52309h + 69;
        f52310i = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 74 / 0;
        }
    }

    public static /* synthetic */ void a(Object[] objArr) {
        abk abkVar = (abk) objArr[0];
        int i10 = f52310i;
        int i11 = ((i10 | 53) << 1) - (i10 ^ 53);
        f52309h = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    setX(new Object[]{abkVar}, -493355997, 493355997, System.identityHashCode(abkVar));
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e5) {
                    aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
                    aaw.setCompoundDrawableTintBlendMode(new Object[]{"Failed to read public suffix list", 5, e5}, 1271727973, -1271727970, 5);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        int i13 = f52309h;
                        int i14 = (i13 & 95) + (i13 | 95);
                        f52310i = i14 % 128;
                        int i15 = i14 % 2;
                    }
                    System.identityHashCode(abkVar);
                    System.identityHashCode(abkVar);
                    return;
                }
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                    int i16 = f52309h;
                    int i17 = (i16 | 11) << 1;
                    int i18 = -(i16 ^ 11);
                    int i19 = ((i17 | i18) << 1) - (i18 ^ i17);
                    f52310i = i19 % 128;
                    int i20 = i19 % 2;
                }
                throw th2;
            }
        }
        if (!(!z10)) {
            int i21 = f52310i + 3;
            f52309h = i21 % 128;
            int i22 = i21 % 2;
            Thread.currentThread().interrupt();
            int i23 = f52309h;
            int i24 = (-2) - (((i23 & 68) + (i23 | 68)) ^ (-1));
            f52310i = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = f52310i;
        int i27 = ((i26 & 48) + (i26 | 48)) - 1;
        f52309h = i27 % 128;
        int i28 = i27 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x04e5 A[PHI: r4
      0x04e5: PHI (r4v67 int) = (r4v66 int), (r4v80 int) binds: [B:115:0x04e3, B:111:0x04d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x05f5 A[PHI: r6 r11
      0x05f5: PHI (r6v67 byte[]) = (r6v53 byte[]), (r6v72 byte[]) binds: [B:133:0x060f, B:128:0x05f2] A[DONT_GENERATE, DONT_INLINE]
      0x05f5: PHI (r11v24 int) = (r11v21 int), (r11v28 int) binds: [B:133:0x060f, B:128:0x05f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x0611 A[PHI: r11
      0x0611: PHI (r11v22 int) = (r11v21 int), (r11v28 int) binds: [B:133:0x060f, B:128:0x05f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:197:0x033f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0434 A[PHI: r16
      0x0434: PHI (r16v13 int) = (r16v12 int), (r16v18 int) binds: [B:87:0x0432, B:84:0x0413] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0442  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        List<String> listSplit$default;
        String str;
        String str2;
        String str3;
        List listSplit$default2;
        int i13;
        List listSplit$default3;
        int i14;
        byte[] bArr;
        int i15;
        byte[][] bArr2;
        int length;
        int i16;
        int i17;
        byte[] bArr3;
        int i18;
        byte[] bArr4;
        int i19;
        int size;
        int i20 = ~i10;
        int i21 = i11 | i12;
        int i22 = ((i20 | i21) * 465) + ((i11 | (~(i20 | i12))) * 930) + (((~i21) | i20) * (-465)) + (i11 * (-929)) + (i10 * (-464));
        if (i22 == 1) {
            String str4 = (String) objArr[0];
            int i23 = f52309h;
            int i24 = (i23 & (-110)) | ((~i23) & 109);
            int i25 = (i23 & 109) << 1;
            int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
            f52310i = i26 % 128;
            int i27 = i26 % 2;
            listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str4, new char[]{'.'}, false, 0, 6, (Object) null);
            if (Intrinsics.areEqual(CollectionsKt___CollectionsKt.last((List) listSplit$default), "")) {
                int i28 = f52310i;
                int i29 = ((((i28 ^ 75) | (i28 & 75)) << 1) - (~(-(((~i28) & 75) | (i28 & (-76)))))) - 1;
                f52309h = i29 % 128;
                int i30 = i29 % 2;
                listSplit$default = CollectionsKt___CollectionsKt.dropLast(listSplit$default, 1);
                int i31 = f52309h;
                int i32 = (((i31 & (-80)) | ((~i31) & 79)) - (~(-(-((i31 & 79) << 1))))) - 1;
                f52310i = i32 % 128;
                if (i32 % 2 == 0) {
                    int i33 = 44 / 0;
                }
            } else {
                int i34 = f52310i;
                int i35 = i34 & 95;
                int i36 = i35 + ((i34 ^ 95) | i35);
                f52309h = i36 % 128;
                if (i36 % 2 != 0) {
                    throw null;
                }
            }
        } else {
            if (i22 == 2) {
                a(objArr);
                return null;
            }
            if (i22 != 3) {
                if (i22 == 4) {
                    int i37 = f52310i;
                    int i38 = ((i37 & 39) - (~(-(-(i37 | 39))))) - 1;
                    f52309h = i38 % 128;
                    int i39 = i38 % 2;
                    int i40 = (i37 & 23) + (i37 | 23);
                    f52309h = i40 % 128;
                    if (i40 % 2 == 0) {
                        return f52308g;
                    }
                    throw null;
                }
                if (i22 != 5) {
                    abk abkVar = (abk) objArr[0];
                    InputStream resourceAsStream = abk.class.getResourceAsStream(PublicSuffixDatabase.PUBLIC_SUFFIX_RESOURCE);
                    if (resourceAsStream == null) {
                        return null;
                    }
                    aby abyVar = (aby) ach.setOnFocusChangeListener(new Object[]{new aca((acp) ach.setOnFocusChangeListener(new Object[]{resourceAsStream}, -1653320900, 1653320905, (int) System.currentTimeMillis()))}, -878740537, 878740541, (int) System.currentTimeMillis());
                    try {
                        byte[] onDragListener = abyVar.setOnDragListener(abyVar.setLayoutAnimation());
                        byte[] onDragListener2 = abyVar.setOnDragListener(abyVar.setLayoutAnimation());
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(abyVar, null);
                        synchronized (abkVar) {
                            Intrinsics.checkNotNull(onDragListener);
                            abkVar.f52313c = onDragListener;
                            Intrinsics.checkNotNull(onDragListener2);
                            abkVar.f52314d = onDragListener2;
                        }
                        abkVar.f52312b.countDown();
                        return null;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(abyVar, th2);
                            throw th3;
                        }
                    }
                }
                abk abkVar2 = (abk) objArr[0];
                String str5 = (String) objArr[1];
                int i41 = f52310i + 23;
                f52309h = i41 % 128;
                int i42 = i41 % 2;
                Intrinsics.checkNotNullParameter(str5, "");
                String unicode = IDN.toUnicode(str5);
                Intrinsics.checkNotNullExpressionValue(unicode, "");
                List list = (List) setX(new Object[]{unicode}, -535490582, 535490583, (int) System.currentTimeMillis());
                List list2 = (List) setX(new Object[]{abkVar2, list}, 324022124, -324022121, System.identityHashCode(abkVar2));
                if (list.size() == list2.size()) {
                    int i43 = f52309h;
                    int i44 = i43 ^ 113;
                    int i45 = (((i43 & 113) | i44) << 1) - i44;
                    f52310i = i45 % 128;
                    if (i45 % 2 != 0 ? ((String) list2.get(0)).charAt(0) != '!' : ((String) list2.get(0)).charAt(1) != 0) {
                        int i46 = f52309h + 104;
                        int i47 = (i46 ^ (-1)) + (i46 << 1);
                        f52310i = i47 % 128;
                        if (i47 % 2 != 0) {
                            return null;
                        }
                        int i48 = 2 / 0;
                        return null;
                    }
                }
                if (((String) list2.get(0)).charAt(0) == '!') {
                    int i49 = f52309h;
                    int i50 = ((i49 | 9) << 1) - (i49 ^ 9);
                    f52310i = i50 % 128;
                    if (i50 % 2 == 0) {
                        size = list.size() >> list2.size();
                    } else {
                        int size2 = list.size();
                        int i51 = -list2.size();
                        int i52 = size2 & i51;
                        size = ((size2 | i51) & (~i52)) + (i52 << 1);
                    }
                    int i53 = f52309h;
                    int i54 = i53 & 17;
                    int i55 = -(-((i53 ^ 17) | i54));
                    int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                    f52310i = i56 % 128;
                    int i57 = i56 % 2;
                } else {
                    int size3 = list.size();
                    int size4 = list2.size();
                    System.identityHashCode(abkVar2);
                    int i58 = -(-(size4 * (-628)));
                    int i59 = 630 | i58;
                    int i60 = ((i59 << 1) - (~(-((~(i58 & 630)) & i59)))) - 1;
                    int i61 = ~size4;
                    int i62 = -(-(i61 * (-629)));
                    int i63 = (i60 ^ i62) + ((i62 & i60) << 1);
                    int i64 = i61 & (i61 | size4);
                    int i65 = (-2) & i64;
                    int i66 = -(-((~(((i64 | (-2)) & (~i65)) | i65)) * (-629)));
                    int i67 = i63 & i66;
                    int i68 = (i67 - (~((i66 ^ i63) | i67))) - 1;
                    int i69 = size4 ^ (-2);
                    int i70 = (-2) & size4;
                    int i71 = ((i70 & i69) | (i69 ^ i70)) * 629;
                    int i72 = ((i68 ^ i71) | (i68 & i71)) << 1;
                    int i73 = -((i71 & (~i68)) | ((~i71) & i68));
                    int i74 = -((i72 & i73) + (i73 | i72));
                    size = ((size3 | i74) << 1) - (size3 ^ i74);
                    int i75 = f52309h;
                    int i76 = i75 & 97;
                    int i77 = ((i75 ^ 97) | i76) << 1;
                    int i78 = -((i75 | 97) & (~i76));
                    int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
                    f52310i = i79 % 128;
                    int i80 = i79 % 2;
                }
                String strJoinToString$default = SequencesKt___SequencesKt.joinToString$default(SequencesKt___SequencesKt.drop(CollectionsKt___CollectionsKt.asSequence((List) setX(new Object[]{str5}, -535490582, 535490583, (int) System.currentTimeMillis())), size), Constant.DOT_STRING, null, null, 0, null, null, 62, null);
                int iIdentityHashCode = System.identityHashCode(abkVar2);
                int i81 = ~iIdentityHashCode;
                int i82 = -(-((~(((-462554721) ^ i81) | ((-462554721) & i81))) * 979));
                int i83 = ((-1903697192) & i82) + (i82 | (-1903697192));
                int i84 = (-1679050226) & iIdentityHashCode;
                int i85 = (~i84) & ((-1679050226) | iIdentityHashCode);
                int i86 = -(-(((i84 & i85) | (i85 ^ i84)) * (-979)));
                int i87 = ((~i86) & i83) | ((~i83) & i86);
                int i88 = -(-((i86 & i83) << 1));
                int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                int i90 = (-462554721) ^ iIdentityHashCode;
                int i91 = (-462554721) & iIdentityHashCode;
                int i92 = ~((i91 & i90) | (i90 ^ i91));
                int i93 = ~(((iIdentityHashCode | i81) & i81) | (-1679050226));
                int i94 = ((i93 & i92) | (i92 ^ i93)) * 979;
                int i95 = i89 ^ i94;
                int i96 = (i94 & i89) << 1;
                int i97 = (i95 ^ i96) + ((i96 & i95) << 1);
                int iIdentityHashCode2 = System.identityHashCode(abkVar2);
                int i98 = ~iIdentityHashCode2;
                int i99 = (-1601304927) - (~(((i98 & (-1630635285)) | ((-1630635285) ^ i98)) * (-490)));
                int i100 = (i99 ^ (-1)) + (i99 << 1);
                int i101 = (-1778369847) & iIdentityHashCode2;
                int i102 = (iIdentityHashCode2 | (-1778369847)) & (~i101);
                int i103 = ~((i102 & i101) | (i102 ^ i101));
                int i104 = 147734562 ^ i103;
                int i105 = i103 & 147734562;
                int i106 = -(-(((i105 & i104) | (i104 ^ i105)) * 490));
                int i107 = (i100 ^ i106) + ((i106 & i100) << 1);
                int i108 = i107 ^ 1460919012;
                int i109 = (1460919012 & i107) << 1;
                if (i97 <= ((i108 | i109) << 1) - (i109 ^ i108)) {
                    return strJoinToString$default;
                }
                int i110 = 98 / 0;
                return strJoinToString$default;
            }
            abk abkVar3 = (abk) objArr[0];
            List list3 = (List) objArr[1];
            int i111 = f52310i;
            int i112 = ((i111 | 11) << 1) - (i111 ^ 11);
            f52309h = i112 % 128;
            int i113 = i112 % 2;
            if (abkVar3.f52311a.get()) {
                abkVar3.f52312b.await();
                int i114 = f52309h;
                int i115 = i114 & 73;
                int i116 = i115 + ((i114 ^ 73) | i115);
                f52310i = i116 % 128;
                int i117 = i116 % 2;
            } else {
                int i118 = f52309h + 83;
                f52310i = i118 % 128;
                int i119 = i118 % 2;
                AtomicBoolean atomicBoolean = abkVar3.f52311a;
                if (i119 != 0 ? !atomicBoolean.compareAndSet(false, true) : (!atomicBoolean.compareAndSet(true, false))) {
                    try {
                        abkVar3.f52312b.await();
                        int i1110 = f52309h;
                        int i1111 = i1110 & 73;
                        int i1112 = i1111 + ((i1110 ^ 73) | i1111);
                        f52310i = i1112 % 128;
                        int i1113 = i1112 % 2;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    int i120 = f52310i;
                    int i121 = i120 & 115;
                    int i122 = (((i120 ^ 115) | i121) << 1) - ((i120 | 115) & (~i121));
                    f52309h = i122 % 128;
                    int i123 = i122 % 2;
                    setX(new Object[]{abkVar3}, 1935478944, -1935478942, System.identityHashCode(abkVar3));
                    int i124 = f52309h;
                    int i125 = ((i124 & 104) + (i124 | 104)) - 1;
                    f52310i = i125 % 128;
                    int i126 = i125 % 2;
                }
            }
            if (abkVar3.f52313c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
            }
            int i127 = f52309h + 91;
            int i128 = i127 % 128;
            f52310i = i128;
            int i129 = i127 % 2;
            int i130 = i128 & 111;
            int i131 = (((i128 ^ 111) | i130) << 1) - ((i128 | 111) & (~i130));
            f52309h = i131 % 128;
            int i132 = i131 % 2;
            int size5 = list3.size();
            byte[][] bArr5 = new byte[size5][];
            int i133 = f52309h;
            int i134 = ((i133 & 91) - (~(-(-(i133 | 91))))) - 1;
            f52310i = i134 % 128;
            int i135 = i134 % 2;
            int i136 = 0;
            while (i136 < size5) {
                int i137 = f52310i;
                int i138 = (i137 ^ 105) + ((i137 & 105) << 1);
                f52309h = i138 % 128;
                if (i138 % 2 != 0) {
                    String str6 = (String) list3.get(i136);
                    Charset charset = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(charset, "");
                    byte[] bytes = str6.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                    bArr5[i136] = bytes;
                    i136--;
                } else {
                    String str7 = (String) list3.get(i136);
                    Charset charset2 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(charset2, "");
                    byte[] bytes2 = str7.getBytes(charset2);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "");
                    bArr5[i136] = bytes2;
                    int i139 = i136 & 1;
                    int i140 = -(-((i136 ^ 1) | i139));
                    i136 = (i139 ^ i140) + ((i140 & i139) << 1);
                }
            }
            int i141 = 0;
            while (true) {
                if (i141 >= size5) {
                    str = null;
                    break;
                }
                int i142 = f52310i;
                int i143 = i142 & 49;
                int i144 = ((i142 ^ 49) | i143) << 1;
                int i145 = -((~i143) & (i142 | 49));
                int i146 = (i144 & i145) + (i145 | i144);
                int i147 = i146 % 128;
                f52309h = i147;
                if (i146 % 2 != 0) {
                    int i148 = i141 & 79;
                    int i149 = (i141 ^ 79) | i148;
                    int i150 = (i148 & i149) + (i148 | i149);
                    int i151 = i150 ^ 4;
                    int i152 = ((i150 & 4) | i151) << 1;
                    int i153 = -i151;
                    i18 = (i152 ^ i153) + ((i153 & i152) << 1);
                    bArr4 = abkVar3.f52313c;
                    if (bArr4 == null) {
                        i19 = ((i147 ^ 16) + ((i147 & 16) << 1)) - 1;
                        f52310i = i19 % 128;
                        if (i19 % 2 != 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        bArr4 = null;
                    }
                } else {
                    int i154 = i141 & 61;
                    int i155 = (((~i154) & (i141 | 61)) - (~(-(-(i154 << 1))))) - 1;
                    i18 = (((-60) & (~i155)) | (i155 & 59)) + ((i155 & (-60)) << 1);
                    bArr4 = abkVar3.f52313c;
                    if (bArr4 == null) {
                        i19 = ((i147 ^ 16) + ((i147 & 16) << 1)) - 1;
                        f52310i = i19 % 128;
                        if (i19 % 2 != 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        bArr4 = null;
                    }
                }
                String str8 = (String) Companion.setY(new Object[]{bArr4, bArr5, Integer.valueOf(i141)}, 329097188, -329097186, i141);
                if (str8 != null) {
                    int i156 = f52309h + 98;
                    int i157 = (i156 ^ (-1)) + (i156 << 1);
                    f52310i = i157 % 128;
                    if (i157 % 2 == 0) {
                        throw null;
                    }
                    str = str8;
                    break;
                }
                i141 = i18;
            }
            int i158 = -1;
            if (size5 <= 1) {
                str2 = null;
                break;
            }
            int i159 = f52310i + 11;
            f52309h = i159 % 128;
            if (i159 % 2 != 0) {
                bArr2 = (byte[][]) bArr5.clone();
                length = bArr2.length >>> 1;
                i16 = 1;
            } else {
                bArr2 = (byte[][]) bArr5.clone();
                int length2 = bArr2.length;
                int i160 = (length2 ^ (-1)) | length2;
                length = ((length2 | i160) << 1) - (length2 ^ i160);
                i16 = 0;
            }
            while (true) {
                if (i16 >= length) {
                    str2 = null;
                    break;
                }
                int i161 = f52309h;
                int i162 = (i161 & (-40)) | ((~i161) & 39);
                int i163 = (i161 & 39) << 1;
                int i164 = ((i162 | i163) << 1) - (i163 ^ i162);
                f52310i = i164 % 128;
                int i165 = i164 % 2;
                byte[] bArr6 = f52306e;
                if (i165 == 0) {
                    i17 = (-2) - (((i16 ^ 113) + ((i16 & 113) << 1)) ^ i158);
                    bArr2[i16] = bArr6;
                    byte[] bArr7 = abkVar3.f52313c;
                    if (bArr7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i166 = f52309h;
                        int i167 = ((i166 | 75) << 1) - (i166 ^ 75);
                        f52310i = i167 % 128;
                        int i168 = i167 % 2;
                        bArr3 = null;
                    } else {
                        bArr3 = bArr7;
                    }
                } else {
                    i17 = ((i16 & (-2)) | ((~i16) & 1)) + ((i16 & 1) << 1);
                    bArr2[i16] = bArr6;
                    bArr3 = abkVar3.f52313c;
                    if (bArr3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i169 = f52309h;
                        int i1610 = ((i169 | 75) << 1) - (i169 ^ 75);
                        f52310i = i1610 % 128;
                        int i1611 = i1610 % 2;
                        bArr3 = null;
                    }
                }
                str2 = (String) Companion.setY(new Object[]{bArr3, bArr2, Integer.valueOf(i16)}, 329097188, -329097186, i16);
                if (str2 != null) {
                    int i170 = f52310i;
                    int i171 = i170 & 51;
                    int i172 = (~i171) & (i170 | 51);
                    int i173 = i171 << 1;
                    int i174 = (i172 ^ i173) + ((i173 & i172) << 1);
                    f52309h = i174 % 128;
                    int i175 = i174 % 2;
                    int i176 = i170 | 15;
                    int i177 = i176 << 1;
                    int i178 = -((~(i170 & 15)) & i176);
                    int i179 = (i177 & i178) + (i178 | i177);
                    f52309h = i179 % 128;
                    int i180 = i179 % 2;
                    break;
                }
                i16 = i17;
                i158 = -1;
            }
            if (str2 == null) {
                str3 = null;
                break;
            }
            int i181 = f52310i;
            int i182 = i181 & 25;
            int i183 = -(-((i181 ^ 25) | i182));
            int i184 = (i182 ^ i183) + ((i183 & i182) << 1);
            f52309h = i184 % 128;
            int i185 = i184 % 2;
            int iIdentityHashCode3 = System.identityHashCode(abkVar3);
            int i186 = -(-(size5 * 503));
            int i187 = (-503) & i186;
            int i188 = (((-503) ^ i186) | i187) << 1;
            int i189 = -((i186 | (-503)) & (~i187));
            int i190 = ((i188 | i189) << 1) - (i189 ^ i188);
            int i191 = -(-((((-1) ^ size5) | size5) * (-502)));
            int i192 = i190 & i191;
            int i193 = (i192 - (~((i191 ^ i190) | i192))) - 1;
            int i194 = ~size5;
            int i195 = ~i194;
            int i196 = i195 & (i195 | i194);
            int i197 = ~iIdentityHashCode3;
            int i198 = ~i197;
            int i199 = ((~i198) & i196) | ((~i196) & i198);
            int i200 = i196 & i198;
            int i201 = (i199 & i200) | (i199 ^ i200);
            int i202 = i194 | size5;
            int i203 = i202 & iIdentityHashCode3;
            int i204 = (~i203) & (i202 | iIdentityHashCode3);
            int i205 = ~((i204 & i203) | (i204 ^ i203));
            int i206 = i201 & i205;
            int i207 = -(~(-(-((((i201 | i205) & (~i206)) | i206) * (-502)))));
            int i208 = ((i193 ^ i207) + ((i207 & i193) << 1)) - 1;
            int i209 = ~((i197 & i194) | (size5 & i198) | (i197 & size5));
            int i210 = (i194 & size5) | (i194 ^ size5);
            int i211 = ~((iIdentityHashCode3 & i210) | (i210 ^ iIdentityHashCode3));
            int i212 = i209 ^ i211;
            int i213 = i209 & i211;
            int i214 = (((i213 & i212) | (i212 ^ i213)) * 502) + i208;
            int i215 = 0;
            while (true) {
                if (i215 >= i214) {
                    str3 = null;
                    break;
                }
                int i216 = f52310i;
                int i217 = (-2) - (((i216 & 118) + (i216 | 118)) ^ (-1));
                f52309h = i217 % 128;
                if (i217 % 2 != 0) {
                    int i218 = i215 & 32;
                    int i219 = (i215 ^ 32) | i218;
                    int i220 = (i218 & i219) + (i218 | i219);
                    int i221 = i220 ^ 24;
                    int i222 = (i220 & 24) << 1;
                    i14 = (i221 & i222) + (i221 | i222);
                    bArr = abkVar3.f52314d;
                    if (bArr == null) {
                        int i223 = (i216 & 103) + (i216 | 103);
                        f52309h = i223 % 128;
                        int i224 = i223 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i225 = f52309h;
                        int i226 = i225 & 71;
                        int i227 = i226 + ((i225 ^ 71) | i226);
                        f52310i = i227 % 128;
                        i15 = 2;
                        int i228 = i227 % 2;
                        bArr = null;
                    } else {
                        i15 = 2;
                    }
                } else {
                    int i229 = i215 & 60;
                    int i230 = i229 + ((i215 ^ 60) | i229);
                    int i231 = i230 & (-59);
                    int i232 = ((i230 ^ (-59)) | i231) << 1;
                    int i233 = -((i230 | (-59)) & (~i231));
                    i14 = (i232 & i233) + (i233 | i232);
                    bArr = abkVar3.f52314d;
                    if (bArr == null) {
                        int i2210 = (i216 & 103) + (i216 | 103);
                        f52309h = i2210 % 128;
                        int i2211 = i2210 % 2;
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        int i2212 = f52309h;
                        int i2213 = i2212 & 71;
                        int i2214 = i2213 + ((i2212 ^ 71) | i2213);
                        f52310i = i2214 % 128;
                        i15 = 2;
                        int i2215 = i2214 % 2;
                        bArr = null;
                    } else {
                        i15 = 2;
                    }
                }
                Object[] objArr2 = new Object[3];
                objArr2[0] = bArr;
                objArr2[1] = bArr5;
                objArr2[i15] = Integer.valueOf(i215);
                str3 = (String) Companion.setY(objArr2, 329097188, -329097186, i215);
                if (str3 != null) {
                    int i234 = f52309h;
                    int i235 = i234 + 101;
                    f52310i = i235 % 128;
                    int i236 = i235 % i15;
                    int i237 = (((i234 | 103) << 1) - (~(-(((~i234) & 103) | (i234 & (-104)))))) - 1;
                    f52310i = i237 % 128;
                    int i238 = i237 % 2;
                    break;
                }
                i215 = i14;
            }
            if (str3 == null) {
                if (str == null) {
                    int i239 = f52309h;
                    int i240 = ((i239 | 31) << 1) - (i239 ^ 31);
                    f52310i = i240 % 128;
                    int i241 = i240 % 2;
                    if (str2 == null) {
                        System.identityHashCode(abkVar3);
                        System.identityHashCode(abkVar3);
                        int i242 = f52310i;
                        int i243 = ((i242 | 39) << 1) - (i242 ^ 39);
                        f52309h = i243 % 128;
                        if (i243 % 2 != 0) {
                            throw null;
                        }
                        listSplit$default = f52307f;
                    }
                }
                if (str == null) {
                    int i244 = f52309h + 67;
                    f52310i = i244 % 128;
                    if (i244 % 2 == 0) {
                        throw null;
                    }
                    listSplit$default2 = null;
                    i13 = 2;
                } else {
                    listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
                    int i245 = f52310i;
                    int i246 = ((i245 & (-60)) | ((~i245) & 59)) + ((i245 & 59) << 1);
                    f52309h = i246 % 128;
                    i13 = 2;
                    int i247 = i246 % 2;
                }
                if (listSplit$default2 == null) {
                    int i248 = f52309h + 13;
                    f52310i = i248 % 128;
                    int i249 = i248 % i13;
                    listSplit$default2 = CollectionsKt__CollectionsKt.emptyList();
                    int i250 = f52309h;
                    int i251 = (i250 & 95) + (i250 | 95);
                    f52310i = i251 % 128;
                    int i252 = i251 % 2;
                }
                if (str2 == null) {
                    int i253 = f52309h;
                    int i254 = i253 & 49;
                    int i255 = i254 + ((i253 ^ 49) | i254);
                    f52310i = i255 % 128;
                    int i256 = i255 % 2;
                    listSplit$default3 = null;
                } else {
                    listSplit$default3 = StringsKt__StringsKt.split$default((CharSequence) str2, new char[]{'.'}, false, 0, 6, (Object) null);
                    int i257 = f52310i;
                    int i258 = (((i257 | 119) << 1) - (~(-(i257 ^ 119)))) - 1;
                    f52309h = i258 % 128;
                    int i259 = i258 % 2;
                }
                if (listSplit$default3 == null) {
                    int i260 = f52310i;
                    int i261 = ((((i260 ^ 31) | (i260 & 31)) << 1) - (~(-(((~i260) & 31) | (i260 & (-32)))))) - 1;
                    f52309h = i261 % 128;
                    if (i261 % 2 != 0) {
                        CollectionsKt__CollectionsKt.emptyList();
                        throw null;
                    }
                    listSplit$default3 = CollectionsKt__CollectionsKt.emptyList();
                }
                if (listSplit$default2.size() <= listSplit$default3.size()) {
                    System.identityHashCode(abkVar3);
                    System.identityHashCode(abkVar3);
                    return listSplit$default3;
                }
                int i262 = f52310i;
                int i263 = i262 ^ 59;
                int i264 = (i262 & 59) << 1;
                int i265 = (i263 & i264) + (i264 | i263);
                f52309h = i265 % 128;
                if (i265 % 2 == 0) {
                    return listSplit$default2;
                }
                throw null;
            }
            int i266 = f52309h + 31;
            f52310i = i266 % 128;
            listSplit$default = i266 % 2 == 0 ? StringsKt__StringsKt.split$default((CharSequence) Intrinsics.stringPlus(CommandConstants.Z11_EXCLAMATION_MARK, str3), new char[]{'^'}, false, 0, 5, (Object) null) : StringsKt__StringsKt.split$default((CharSequence) Intrinsics.stringPlus(CommandConstants.Z11_EXCLAMATION_MARK, str3), new char[]{'.'}, false, 0, 6, (Object) null);
        }
        return listSplit$default;
    }

    @Nullable
    public final String setY(@NotNull String p4) {
        return (String) setX(new Object[]{this, p4}, -919103912, 919103917, System.identityHashCode(this));
    }

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.abk$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/mypinpad/tsdk/i/abk$setDividerPadding;", "", "Lcom/mypinpad/tsdk/i/abk;", "setY", "()Lcom/mypinpad/tsdk/i/abk;", "", "", "setOnDragListener", "Ljava/util/List;", "setDividerPadding", "", "setNavigationOnClickListener", "[B", "setLayoutAnimation", "Lcom/mypinpad/tsdk/i/abk;", "setOnFocusChangeListener", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52315a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52316b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String a(Object[] objArr) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            String str;
            int i10;
            int i11;
            int i12;
            int i13;
            boolean z10;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            boolean z11;
            byte[] bArr = (byte[]) objArr[0];
            int i23 = 1;
            byte[][] bArr2 = (byte[][]) objArr[1];
            int i24 = 2;
            int iIntValue = ((Number) objArr[2]).intValue();
            int i25 = f52315a;
            int i26 = (((i25 ^ 31) | (i25 & 31)) << 1) - (((~i25) & 31) | (i25 & (-32)));
            int i27 = i26 % 128;
            f52316b = i27;
            int i28 = i26 % 2;
            int length = bArr.length;
            int i29 = i27 + 61;
            f52315a = i29 % 128;
            int i30 = i29 % 2;
            int i31 = 0;
            while (true) {
                if (i31 >= length) {
                    str = null;
                    break;
                }
                int i32 = f52315a + 55;
                f52316b = i32 % 128;
                if (i32 % i24 == 0) {
                    int i33 = i31 >>> length;
                    int i34 = i33 & (-2);
                    int i35 = i33 | (-2);
                    i10 = ((i34 | i35) << i23) - (i35 ^ i34);
                } else {
                    i10 = ((((i31 ^ length) | (i31 & length)) << i23) - (((~length) & i31) | ((~i31) & length))) / 2;
                }
                while (i10 >= 0) {
                    int i36 = f52316b;
                    int i37 = (((i36 & (-62)) | ((~i36) & 61)) - (~(-(-((i36 & 61) << i23))))) - i23;
                    f52315a = i37 % 128;
                    if (i37 % i24 == 0) {
                        if (bArr[i10] == 10) {
                            break;
                        }
                        int i38 = ((i10 ^ (-1)) | i10) << i23;
                        int i39 = -(~i10);
                        i10 = ((i38 | i39) << i23) - (i38 ^ i39);
                        int i40 = i36 & 25;
                        int i41 = (i36 | 25) & (~i40);
                        int i42 = i40 << i23;
                        int i43 = ((i41 | i42) << i23) - (i42 ^ i41);
                        f52315a = i43 % 128;
                        int i44 = i43 % i24;
                    } else {
                        if (bArr[i10] == 58) {
                            break;
                        }
                        int i310 = ((i10 ^ (-1)) | i10) << i23;
                        int i311 = -(~i10);
                        i10 = ((i310 | i311) << i23) - (i310 ^ i311);
                        int i45 = i36 & 25;
                        int i46 = (i36 | 25) & (~i45);
                        int i47 = i45 << i23;
                        int i48 = ((i46 | i47) << i23) - (i47 ^ i46);
                        f52315a = i48 % 128;
                        int i49 = i48 % i24;
                    }
                }
                int i50 = i10 ^ 1;
                int i51 = (((i10 & 1) | i50) << i23) - (~(-i50));
                int i52 = i51 - 1;
                int i53 = f52315a;
                int i54 = i53 & 103;
                int i55 = (((~i54) & (i53 | 103)) - (~(-(-(i54 << 1))))) - i23;
                f52316b = i55 % 128;
                int i56 = i55 % i24;
                int i57 = i23;
                while (true) {
                    int i58 = -(-i57);
                    int i59 = i52 ^ i58;
                    i11 = i58 & i52;
                    i12 = i59 | i11;
                    int i60 = i12 << 1;
                    int i61 = -i59;
                    if (bArr[(i60 & i61) + (i60 | i61)] == 10) {
                        break;
                    }
                    int i62 = f52316b;
                    int i63 = i62 & 79;
                    int i64 = ((i62 ^ 79) | i63) << i23;
                    int i65 = -((i62 | 79) & (~i63));
                    int i66 = (i64 & i65) + (i65 | i64);
                    int i67 = i66 % 128;
                    f52315a = i67;
                    if (i66 % i24 == 0) {
                        i57 = ((i57 & 1) << i23) + (i57 ^ 1);
                    }
                    int i68 = i67 ^ 33;
                    int i69 = ((i67 & 33) | i68) << i23;
                    int i70 = -i68;
                    int i71 = (i69 ^ i70) + ((i69 & i70) << i23);
                    f52316b = i71 % 128;
                    int i72 = i71 % i24;
                }
                int i73 = i52 ^ i57;
                int i74 = ~i57;
                int i75 = (i52 & i57) << 1;
                int i76 = (i73 & i75) + (i73 | i75);
                int i77 = -i52;
                int i78 = (i76 | i77) << 1;
                int i79 = -(i76 ^ i77);
                int i80 = ((i78 | i79) << 1) - (i78 ^ i79);
                int i81 = f52315a;
                int i82 = ((i81 | 123) << 1) - (i81 ^ 123);
                f52316b = i82 % 128;
                int i83 = i82 % i24;
                int i84 = iIntValue;
                boolean z12 = false;
                int i85 = 0;
                int i86 = 0;
                while (true) {
                    if (z12) {
                        int i87 = f52316b;
                        int i88 = i87 & 107;
                        int i89 = -(-(i87 | 107));
                        int i90 = ((i88 | i89) << 1) - (i88 ^ i89);
                        int i91 = i90 % 128;
                        f52315a = i91;
                        if (i90 % i24 != 0) {
                            i14 = 7;
                            z11 = true;
                        } else {
                            i14 = 46;
                            z11 = false;
                        }
                        int i92 = i91 ^ 29;
                        int i93 = -(-((i91 & 29) << 1));
                        int i94 = (i92 ^ i93) + ((i92 & i93) << 1);
                        f52316b = i94 % 128;
                        int i95 = i94 % i24;
                        i13 = i86;
                        z10 = z11;
                    } else {
                        i13 = i86;
                        int x4 = yt.setX(bArr2[i84][i13]);
                        int i96 = f52316b;
                        int i97 = i96 & 109;
                        int i98 = (~i97) & (i96 | 109);
                        int i99 = -(-(i97 << 1));
                        int i100 = (i98 & i99) + (i98 | i99);
                        f52315a = i100 % 128;
                        int i101 = i100 % 2;
                        z10 = z12;
                        i14 = x4;
                    }
                    int i102 = -yt.setX(bArr[i52 + i85]);
                    boolean z13 = z10;
                    int i103 = i14 & i102;
                    int i104 = ((i14 ^ i102) | i103) << 1;
                    int i105 = -((~i103) & (i102 | i14));
                    i15 = (i104 ^ i105) + ((i104 & i105) << 1);
                    i86 = -1;
                    if (i15 != 0) {
                        i16 = i57;
                        bArr = bArr;
                        i17 = length;
                        i18 = i12;
                        i19 = i51;
                        i20 = i11;
                        i21 = i74;
                        i22 = i13;
                        i85 = i85;
                        break;
                    }
                    int i106 = f52315a;
                    int i107 = i106 | 37;
                    i17 = length;
                    int i108 = (i107 << 1) - ((~(i106 & 37)) & i107);
                    f52316b = i108 % 128;
                    int i109 = i108 % 2;
                    int i110 = i85 & 1;
                    i85 = i110 + ((i85 ^ 1) | i110);
                    int i111 = -(~(-(-(i13 * (-675)))));
                    int i112 = (((677 | i111) << 1) - (677 ^ i111)) - 1;
                    int i113 = iIntValue | 1;
                    bArr = bArr;
                    int i114 = ~i13;
                    int i115 = i114 & (i114 | i13);
                    int i116 = (((i113 ^ i115) | (i113 & i115)) * (-676)) + i112;
                    i20 = i11;
                    int i117 = i114 & 1;
                    i18 = i12;
                    int i118 = (~i117) & (i114 | 1);
                    int i119 = ~((i118 ^ i117) | (i118 & i117));
                    i19 = i51;
                    int i120 = ~iIntValue;
                    i21 = i74;
                    int i121 = (i120 & (-2)) | ((~i120) & 1);
                    int i122 = i120 & 1;
                    int i123 = (i121 ^ i122) | (i121 & i122);
                    i16 = i57;
                    int i124 = ~i123;
                    int i125 = i124 & (i123 | i124);
                    int i126 = i119 ^ i125;
                    int i127 = i125 & i119;
                    int i128 = ((i127 & i126) | (i126 ^ i127)) * 676;
                    int i129 = i116 & i128;
                    int i130 = -(-((i128 ^ i116) | i129));
                    int i131 = ((i129 | i130) << 1) - (i130 ^ i129);
                    int i132 = ((~i114) & (-2)) | i117;
                    int i133 = (-2) & i114;
                    int i134 = ~((i132 & i133) | (i132 ^ i133));
                    int i135 = (i120 | iIntValue) & i120;
                    int i136 = i114 & i135;
                    int i137 = (i114 | i135) & (~i136);
                    int i138 = ~((i137 & i136) | (i137 ^ i136));
                    int i139 = i134 ^ i138;
                    int i140 = i134 & i138;
                    int i141 = i13 ^ 1;
                    int i142 = i13 & 1;
                    int i143 = (i141 & i142) | (i141 ^ i142);
                    int i144 = (i143 & i120) | ((~i143) & iIntValue);
                    int i145 = i143 & iIntValue;
                    int i146 = -(-(((i140 & i139) | (i139 ^ i140) | (~((i145 & i144) | (i144 ^ i145)))) * 676));
                    int i147 = i131 & i146;
                    int i148 = -(-(i146 | i131));
                    i22 = (i148 | i147) + (i147 & i148);
                    if (i85 == i80) {
                        break;
                    }
                    int i149 = i106 + 97;
                    f52316b = i149 % 128;
                    int i150 = i149 % 2;
                    if (bArr2[i84].length == i22) {
                        int i151 = i106 | 57;
                        int i152 = i151 << 1;
                        int i153 = -(i151 & (~(i106 & 57)));
                        int i154 = ((i152 | i153) << 1) - (i153 ^ i152);
                        int i155 = i154 % 128;
                        f52316b = i155;
                        int i156 = i154 % 2;
                        int length2 = bArr2.length;
                        int i157 = -(-(length2 * 503));
                        int i158 = 501 ^ i157;
                        int i159 = -(-((i157 & 501) << 1));
                        int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                        int i161 = ~length2;
                        int i162 = ~((i161 ^ iIntValue) | (i161 & iIntValue));
                        int i163 = ~(length2 | ((-1) ^ length2));
                        int i164 = i162 & i163;
                        int i165 = (i163 | i162) & (~i164);
                        int i166 = ((i165 & i164) | (i165 ^ i164)) * (-502);
                        int i167 = i160 & i166;
                        int i168 = -(-((i166 ^ i160) | i167));
                        int i169 = ((i167 | i168) << 1) - (i168 ^ i167);
                        int i170 = i161 & i120;
                        int i171 = (~i170) & (i120 | i161);
                        int i172 = (i170 & i171) | (i171 ^ i170);
                        int i173 = ~i172;
                        int i174 = (i172 & i173) | (i173 ^ i172);
                        int i175 = ~i174;
                        int i176 = ((i174 | i175) & i175) * (-502);
                        int i177 = i169 & i176;
                        int i178 = ((i176 | i169) & (~i177)) + (i177 << 1);
                        int i179 = (i161 | (~iIntValue)) * 502;
                        int i180 = ((~i179) & i178) | ((~i178) & i179);
                        int i181 = (i178 & i179) << 1;
                        if (i84 == (i180 ^ i181) + ((i181 & i180) << 1)) {
                            break;
                        }
                        int i182 = i155 | 93;
                        int i183 = (i155 & 93) + i182;
                        f52315a = i183 % 128;
                        if (i183 % 2 != 0) {
                            z12 = false;
                        } else {
                            int i184 = i84 ^ 1;
                            i84 = (((i84 & 1) | i184) << 1) - i184;
                            z12 = true;
                        }
                        int i185 = ((i182 << 1) - (~(-(((~i155) & 93) | (i155 & (-94)))))) - 1;
                        f52315a = i185 % 128;
                        int i186 = i185 % 2;
                    } else {
                        i86 = i22;
                        z12 = z13;
                    }
                    i11 = i20;
                    length = i17;
                    bArr = bArr;
                    i12 = i18;
                    i51 = i19;
                    i74 = i21;
                    i57 = i16;
                    i24 = 2;
                }
                if (i15 < 0) {
                    int i187 = f52316b;
                    int i188 = ((i187 & (-32)) | ((~i187) & 31)) + ((i187 & 31) << 1);
                    f52315a = i188 % 128;
                    int i189 = i188 % 2;
                    int i190 = -(-(i52 * (-317)));
                    int i191 = ((((~i190) & (-319)) | (i190 & TypedValues.AttributesType.TYPE_PIVOT_TARGET)) - (~((i190 & (-319)) << 1))) - 1;
                    int i192 = ~i52;
                    int i193 = ~iIntValue;
                    int i194 = i192 ^ i193;
                    int i195 = i192 & i193;
                    int i196 = -(-(((i194 & i195) | (i194 ^ i195)) * (-318)));
                    int i197 = i191 & i196;
                    int i198 = i197 + ((i191 ^ i196) | i197);
                    int i199 = ~((i192 ^ iIntValue) | (i192 & iIntValue));
                    int i200 = ~i193;
                    int i201 = (i200 & i193) | (i200 ^ i193);
                    int i202 = (i201 & i192) | ((~i201) & i52);
                    int i203 = i201 & i52;
                    int i204 = ~((i203 & i202) | (i202 ^ i203));
                    int i205 = -(-(((i199 & i204) | (i199 ^ i204)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                    int i206 = (((i198 | i205) << 1) - (~(-(i205 ^ i198)))) - 1;
                    int i207 = (i192 | i52) & i192;
                    int i208 = i207 & i193;
                    int i209 = ((i207 | i193) & (~i208)) | i208;
                    int i210 = i209 ^ (-1);
                    int i211 = (i209 & i210) | (i210 ^ i209);
                    int i212 = ~i211;
                    int i213 = (i211 | i212) & i212;
                    int i214 = (i192 & i52) | (i192 ^ i52);
                    int i215 = (i193 & i214) | ((~i214) & iIntValue);
                    int i216 = i214 & iIntValue;
                    int i217 = ~((i216 & i215) | (i215 ^ i216));
                    int i218 = -(-(((i217 & i213) | (i213 ^ i217)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                    i23 = 1;
                    length = ((i206 | i218) << 1) - (i218 ^ i206);
                    i31 = i31;
                    i24 = 2;
                } else if (i15 > 0) {
                    int i219 = f52315a;
                    int i220 = i219 ^ 11;
                    int i221 = -(-((i219 & 11) << 1));
                    int i222 = ((i220 | i221) << 1) - (i220 ^ i221);
                    f52316b = i222 % 128;
                    int i223 = i222 % 2;
                    int i224 = i16;
                    int i225 = i224 * (-520);
                    int i226 = -(-(i52 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY));
                    int i227 = (i225 ^ i226) + ((i225 & i226) << 1);
                    int i228 = ~i52;
                    int i229 = i21;
                    int i230 = ~i229;
                    int i231 = (i21 & i228) | (i52 & i230);
                    int i232 = i229 & i52;
                    int i233 = (i231 & i232) | (i231 ^ i232);
                    int i234 = ~iIntValue;
                    int i235 = (i233 & i234) | ((~i233) & iIntValue);
                    int i236 = i233 & iIntValue;
                    int i237 = (~((i236 & i235) | (i235 ^ i236))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                    int i238 = i227 & i237;
                    int i239 = (((i237 | i227) & (~i238)) - (~(i238 << 1))) - 1;
                    int i240 = i228 ^ i224;
                    int i241 = i228 & i224;
                    int i242 = -(-((~(i240 | i241)) * (-1042)));
                    int i243 = (i239 ^ i242) + ((i242 & i239) << 1);
                    int i244 = ~((i241 & i240) | (i240 ^ i241));
                    int i245 = ((~i234) & i229) | (i234 & i230);
                    int i246 = i229 & i234;
                    int i247 = (i245 & i246) | (i245 ^ i246);
                    int i248 = i247 ^ i52;
                    int i249 = i247 & i52;
                    int i250 = ~((i249 & i248) | (i248 ^ i249));
                    int i251 = i244 & i250;
                    int i252 = (i244 | i250) & (~i251);
                    int i253 = -(-(((i252 & i251) | (i252 ^ i251)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                    int i254 = ((i243 ^ i253) | (i243 & i253)) << 1;
                    int i255 = -((i253 & (~i243)) | ((~i253) & i243));
                    int i256 = (i254 & i255) + (i255 | i254);
                    int i257 = -(-(i256 * (-949)));
                    int i258 = (-949) & i257;
                    int i259 = (((((-949) ^ i257) | i258) << 1) - (~(-((i257 | (-949)) & (~i258))))) - 1;
                    int i260 = ~i256;
                    int i261 = (i234 | iIntValue) & i234;
                    int i262 = ~((i261 & i260) | (i260 ^ i261));
                    int i263 = ~((-2) | iIntValue);
                    int i264 = i262 ^ i263;
                    int i265 = i262 & i263;
                    int i266 = -(~(-(-(((i265 & i264) | (i264 ^ i265)) * ReturnCode.ERR_REPOSITORY))));
                    int i267 = (((i259 | i266) << 1) - (i266 ^ i259)) - 1;
                    int i268 = i234 & 1;
                    int i269 = ~((i234 ^ 1) | i268);
                    int i270 = i256 & i234;
                    int i271 = (i260 & iIntValue) | i270;
                    int i272 = i256 & iIntValue;
                    int i273 = ~((i271 & i272) | (i271 ^ i272));
                    int i274 = -(~(-(-(((i273 & i269) | (i269 ^ i273)) * (-950)))));
                    int i275 = ((i267 | i274) << 1) - (i274 ^ i267);
                    int i276 = (i275 ^ (-1)) + (i275 << 1);
                    int i277 = (i234 ^ i256) | i270;
                    int i278 = ~i277;
                    int i279 = (i277 | i278) & i278;
                    int i280 = (iIntValue & (-2)) | i268;
                    int i281 = iIntValue & 1;
                    int i282 = ~((i280 & i281) | (i280 ^ i281));
                    int i283 = -(-(((i279 & i282) | (i279 ^ i282)) * 950));
                    int i284 = ((i276 | i283) << 1) - (((~i276) & i283) | ((~i283) & i276));
                    int i285 = (((i219 | 50) << 1) - (i219 ^ 50)) - 1;
                    f52316b = i285 % 128;
                    int i286 = i285 % 2;
                    length = i17;
                    i23 = 1;
                    i24 = 2;
                    i31 = i284;
                } else {
                    int i287 = -i85;
                    int i288 = (i80 ^ i287) + ((i287 & i80) << 1);
                    int length3 = bArr2[i84].length;
                    int i289 = -i22;
                    int i290 = length3 & i289;
                    int i291 = (i289 | length3) & (~i290);
                    int i292 = i290 << 1;
                    int i293 = (i291 & i292) + (i291 | i292);
                    int i294 = ((i84 & (-2)) | ((~i84) & 1)) + ((i84 & 1) << 1);
                    int length4 = bArr2.length;
                    int i295 = (-2) - ((f52315a + 70) ^ (-1));
                    f52316b = i295 % 128;
                    int i296 = i295 % 2;
                    while (i294 < length4) {
                        int i297 = f52315a;
                        int i298 = i297 & 29;
                        int i299 = ((i297 ^ 29) | i298) << 1;
                        int i300 = -((i297 | 29) & (~i298));
                        int i301 = (i299 ^ i300) + ((i300 & i299) << 1);
                        int i302 = i301 % 128;
                        f52316b = i302;
                        int i303 = i301 % 2;
                        int i304 = i294 + 1;
                        int length5 = bArr2[i294].length;
                        int i305 = length5 * (-1529);
                        int i306 = i293 * (-764);
                        int i307 = i305 & i306;
                        int i308 = (i305 | i306) & (~i307);
                        int i309 = i307 << 1;
                        int i312 = (i308 & i309) + (i308 | i309);
                        int i313 = ~length5;
                        int i314 = ~i293;
                        int i315 = i313 ^ i314;
                        int i316 = i313 & i314;
                        int i317 = i315 | i316;
                        int i318 = length4;
                        int i319 = ~iIntValue;
                        byte[][] bArr3 = bArr2;
                        int i320 = ((~i319) & i317) | ((~i317) & i319);
                        int i321 = i317 & i319;
                        int i322 = ~((i320 & i321) | (i320 ^ i321));
                        int i323 = (i313 | length5) & i313;
                        int i324 = i323 & i293;
                        int i325 = i80;
                        int i326 = (i323 | i293) & (~i324);
                        int i327 = (i326 & i324) | (i326 ^ i324);
                        int i328 = i327 & iIntValue;
                        int i329 = ~(((i327 | iIntValue) & (~i328)) | i328);
                        int i330 = i322 ^ i329;
                        int i331 = i322 & i329;
                        int i332 = (i331 & i330) | (i330 ^ i331);
                        int i333 = (i314 | i293) & i314;
                        int i334 = i333 & length5;
                        int i335 = (~i334) & (i333 | length5);
                        int i336 = ~((i334 & i335) | (i335 ^ i334) | iIntValue);
                        int i337 = i332 ^ i336;
                        int i338 = i332 & i336;
                        int i339 = -(-(((i338 & i337) | (i337 ^ i338)) * 765));
                        int i340 = i312 & i339;
                        int i341 = (i339 | i312) & (~i340);
                        int i342 = i340 << 1;
                        int i343 = (i341 & i342) + (i341 | i342);
                        int i344 = ~((i315 ^ i316) | (i315 & i316));
                        int i345 = (i319 | iIntValue) & i319;
                        int i346 = ~((i345 & i313) | ((~i345) & i313) | ((~i313) & i345));
                        int i347 = i344 & i346;
                        int i348 = (i344 | i346) & (~i347);
                        int i349 = -(~(-(-(((i348 & i347) | (i348 ^ i347)) * 1530))));
                        int i350 = (((i343 | i349) << 1) - (i349 ^ i343)) - 1;
                        int i351 = i313 ^ iIntValue;
                        int i352 = i313 & iIntValue;
                        int i353 = ~((i351 & i352) | (i351 ^ i352));
                        int i354 = (i319 & i333) | (i333 ^ i319);
                        int i355 = ~((length5 & i354) | (i354 ^ length5));
                        int i356 = i353 & i355;
                        int i357 = (i355 | i353) & (~i356);
                        int i358 = ((i357 & i356) | (i357 ^ i356)) * 765;
                        int i359 = (i350 | i358) << 1;
                        int i360 = -(i358 ^ i350);
                        i293 = (i359 & i360) + (i360 | i359);
                        int i361 = (((i302 | 126) << 1) - (i302 ^ 126)) - 1;
                        f52315a = i361 % 128;
                        int i362 = i361 % 2;
                        length4 = i318;
                        bArr2 = bArr3;
                        i294 = i304;
                        i80 = i325;
                    }
                    bArr2 = bArr2;
                    int i363 = i80;
                    if (i293 >= i288) {
                        if (i293 <= i288) {
                            Charset charset = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(charset, "");
                            str = new String(bArr, i52, i363, charset);
                            int i364 = f52316b + 119;
                            f52315a = i364 % 128;
                            int i365 = i364 % 2;
                            break;
                        }
                        int i366 = f52316b;
                        int i367 = i366 & 101;
                        int i368 = (i366 ^ 101) | i367;
                        int i369 = ((i367 | i368) << 1) - (i367 ^ i368);
                        f52315a = i369 % 128;
                        int i370 = i369 % 2;
                        int i371 = -(-i18);
                        int i372 = (i20 ^ i371) + ((i20 & i371) << 1);
                        int i373 = -(-(i372 * (-622)));
                        int i374 = (624 & i373) + (i373 | 624);
                        int i375 = ~i372;
                        int i376 = i375 & 1;
                        int i377 = (i375 ^ 1) | i376;
                        int i378 = ~iIntValue;
                        int i379 = (i377 & i378) | ((~i377) & iIntValue);
                        int i380 = i377 & iIntValue;
                        int i381 = (i380 & i379) | (i379 ^ i380);
                        int i382 = ~i381;
                        int i383 = (((i381 | i382) & i382) * 623) + i374;
                        int i384 = (-2) & i372;
                        int i385 = (i372 | (-2)) & (~i384);
                        int i386 = (i385 & i384) | (i385 ^ i384);
                        int i387 = ~i386;
                        int i388 = (i386 | i387) & i387;
                        int i389 = ((~i388) & i378) | ((~i378) & i388);
                        int i390 = i388 & i378;
                        int i391 = ((i390 & i389) | (i389 ^ i390)) * (-623);
                        int i392 = i383 & i391;
                        int i393 = (i391 ^ i383) | i392;
                        int i394 = ((i392 | i393) << 1) - (i393 ^ i392);
                        int i395 = ~(((~i376) & (i375 | 1)) | i376);
                        int i396 = (i375 & iIntValue) | (i375 ^ iIntValue);
                        int i397 = ~i396;
                        int i398 = (i396 | i397) & i397;
                        int i399 = ((~i398) & i395) | ((~i395) & i398);
                        int i400 = i398 & i395;
                        int i401 = (i400 & i399) | (i399 ^ i400);
                        int i402 = ~((iIntValue ^ 1) | (iIntValue & 1));
                        int i403 = ((~i402) & i401) | ((~i401) & i402);
                        int i404 = i401 & i402;
                        int i405 = ((i404 & i403) | (i403 ^ i404)) * 623;
                        i31 = (i394 & i405) + (i405 | i394);
                        int i406 = i366 + 83;
                        f52315a = i406 % 128;
                        int i407 = i406 % 2;
                        length = i17;
                    } else {
                        int i408 = f52315a + 9;
                        f52316b = i408 % 128;
                        if (i408 % 2 == 0) {
                            int i409 = i52 & 1;
                            length = i409 + ((i52 ^ 1) | i409);
                        } else {
                            length = i19 - 2;
                        }
                        i31 = i31;
                    }
                    i23 = 1;
                    i24 = 2;
                }
            }
            int i410 = f52316b;
            int i411 = (i410 ^ 63) + ((i410 & 63) << 1);
            f52315a = i411 % 128;
            if (i411 % 2 != 0) {
                int i412 = 79 / 0;
            }
            return str;
        }

        public static final /* synthetic */ String setCompoundDrawableTintBlendMode(byte[] bArr, byte[][] bArr2, int i10) {
            return (String) setY(new Object[]{bArr, bArr2, Integer.valueOf(i10)}, 329097188, -329097186, i10);
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058;
            if (i13 == 1) {
                return a(objArr);
            }
            if (i13 == 2) {
                byte[] bArr = (byte[]) objArr[0];
                byte[][] bArr2 = (byte[][]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i14 = f52316b;
                int i15 = ((i14 | 89) << 1) - (i14 ^ 89);
                f52315a = i15 % 128;
                int i16 = i15 % 2;
                String str = (String) setY(new Object[]{bArr, bArr2, Integer.valueOf(iIntValue)}, -1296258717, 1296258718, iIntValue);
                int i17 = f52315a;
                int i18 = i17 & 61;
                int i19 = -(-((i17 ^ 61) | i18));
                int i20 = (i18 & i19) + (i19 | i18);
                f52316b = i20 % 128;
                int i21 = i20 % 2;
                return str;
            }
            int i22 = f52315a;
            int i23 = i22 & 13;
            int i24 = (((i22 | 13) & (~i23)) - (~(i23 << 1))) - 1;
            f52316b = i24 % 128;
            if (i24 % 2 == 0) {
                throw null;
            }
            abk abkVar = (abk) abk.setX(new Object[0], 1410291485, -1410291481, (int) System.currentTimeMillis());
            int i25 = f52316b;
            int i26 = i25 & 65;
            int i27 = -(-(i25 | 65));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            f52315a = i28 % 128;
            if (i28 % 2 == 0) {
                return abkVar;
            }
            int i29 = 74 / 0;
            return abkVar;
        }

        @NotNull
        public static abk setY() {
            return (abk) setY(new Object[0], 1737357701, -1737357701, (int) System.currentTimeMillis());
        }
    }

    public static final /* synthetic */ abk setX() {
        return (abk) setX(new Object[0], 1410291485, -1410291481, (int) System.currentTimeMillis());
    }
}
