package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bk.g;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.esotericsoftware.asm.Opcodes;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u001a2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u001b\u001aJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\u000bJ\"\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0097\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017"}, d2 = {"Lcom/mypinpad/tsdk/i/ye;", "", "Lkotlin/Pair;", "", "p0", "setCompoundDrawableTintBlendMode", "(Ljava/lang/String;)Ljava/lang/String;", "", "setY", "(I)Ljava/lang/String;", "", "(Ljava/lang/String;)Ljava/util/List;", "", "iterator", "()Ljava/util/Iterator;", "Lcom/mypinpad/tsdk/i/ye$setOnFocusChangeListener;", "setX", "()Lcom/mypinpad/tsdk/i/ye$setOnFocusChangeListener;", "", "", "equals", "(Ljava/lang/Object;)Z", GenerateActivationFormCommand.HASH_CODE, "()I", "toString", "()Ljava/lang/String;", "setDividerPadding", "setOnFocusChangeListener"}, k = 1, mv = {1, 6, 0})
public final class ye implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f62041q0 = 0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f62042r0 = 1;

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String[] f62043p0;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.ye$setDividerPadding, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bH\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/ye$setDividerPadding;", "", "", "", "p0", "Lcom/mypinpad/tsdk/i/ye;", "setOnFocusChangeListener", "([Ljava/lang/String;)Lcom/mypinpad/tsdk/i/ye;", "", "setDividerPadding", "(Ljava/util/Map;)Lcom/mypinpad/tsdk/i/ye;", "<init>", "()V"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f62044a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62045b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String a(Object[] objArr) {
            String[] strArr = (String[]) objArr[0];
            String str = (String) objArr[1];
            int i10 = f62044a;
            int i11 = ((i10 | 97) << 1) - (i10 ^ 97);
            f62045b = i11 % 128;
            int i12 = i11 % 2;
            int length = strArr.length;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i13 = length * (-159);
            int i14 = 318 & i13;
            int i15 = i14 + ((i13 ^ TypedValues.AttributesType.TYPE_PIVOT_TARGET) | i14);
            int i16 = length & 1;
            int i17 = (i16 | ((~i16) & (length | 1))) * 160;
            int i18 = i15 & i17;
            int i19 = (i17 ^ i15) | i18;
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            int i21 = ~iCurrentTimeMillis;
            int i22 = (iCurrentTimeMillis | i21) & i21;
            int i23 = (i22 & 1) | ((~i22) & (-2));
            int i24 = i22 & (-2);
            int i25 = ~((i24 & i23) | (i23 ^ i24));
            int i26 = ~length;
            int i27 = ~(((-2) ^ length) | ((-2) & length));
            int i28 = ((i25 & i27) | (i25 ^ i27)) * (-160);
            int i29 = (i20 & i28) + (i28 | i20);
            int i30 = (length | i26) & i26;
            int i31 = ((~i21) & i30) | ((~i30) & i21);
            int i32 = i30 & i21;
            int i33 = (i32 & i31) | (i31 ^ i32);
            int i34 = ~i33;
            int i35 = (i33 | i34) & i34;
            int i36 = (-2) & i35;
            int i37 = (i35 | (-2)) & (~i36);
            int i38 = -(~(((i37 & i36) | (i37 ^ i36)) * 160));
            int i39 = ((i29 & i38) + (i38 | i29)) - 1;
            int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(i39, 0, -2);
            if (progressionLastElement <= i39) {
                while (true) {
                    int i40 = ((i39 & (-111)) | ((~i39) & 110)) + ((i39 & 110) << 1);
                    int i41 = ((i40 ^ (-111)) + ((i40 & (-111)) << 1)) - 1;
                    if (l.equals(str, strArr[i39], true)) {
                        int i42 = f62044a;
                        int i43 = i42 & 17;
                        int i44 = (i42 | 17) & (~i43);
                        int i45 = -(-(i43 << 1));
                        int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
                        f62045b = i46 % 128;
                        int i47 = i46 % 2;
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i48 = -(-(i39 * (-518)));
                        int i49 = (((-518) | i48) << 1) - (i48 ^ (-518));
                        int i50 = ~iCurrentTimeMillis2;
                        int i51 = (-2) & i50;
                        int i52 = ~(((-2) ^ i50) | i51);
                        int i53 = i39 & i52;
                        int i54 = (i52 | i39) & (~i53);
                        int i55 = ((i54 & i53) | (i54 ^ i53)) * 519;
                        int i56 = i49 & i55;
                        int i57 = (((i49 ^ i55) | i56) << 1) - ((i55 | i49) & (~i56));
                        int i58 = (i50 & 1) | ((~i50) & (-2));
                        int i59 = ~((i58 & i51) | (i58 ^ i51) | i39);
                        int i60 = i39 & 1;
                        int i61 = (~i60) & (i39 | 1);
                        int i62 = (i60 & i61) | (i61 ^ i60) | iCurrentTimeMillis2;
                        int i63 = ~i62;
                        int i64 = (i62 | i63) & i63;
                        int i65 = i59 & i64;
                        int i66 = (((i59 | i64) & (~i65)) | i65) * (-519);
                        int i67 = i57 & i66;
                        int i68 = -(-((i66 ^ i57) | i67));
                        int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                        int i70 = i39 & iCurrentTimeMillis2;
                        int i71 = (iCurrentTimeMillis2 | i39) & (~i70);
                        int i72 = (i71 & i70) | (i71 ^ i70);
                        int i73 = ~i72;
                        int i74 = i69 - (~((((i72 | i73) & i73) | 1) * 519));
                        String str2 = strArr[(i74 ^ (-1)) + (i74 << 1)];
                        int i75 = f62044a + 21;
                        f62045b = i75 % 128;
                        if (i75 % 2 == 0) {
                            int i76 = 34 / 0;
                        }
                        return str2;
                    }
                    if (i39 != progressionLastElement) {
                        i39 = i41;
                    }
                }
            }
            int i77 = f62045b + 63;
            f62044a = i77 % 128;
            int i78 = i77 % 2;
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x010f  */
        /* JADX WARN: Code duplicated, block: B:22:0x0130  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ae A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:34:0x0159 A[SYNTHETIC] */
        public static /* synthetic */ void b(Object[] objArr) throws NoSuchAlgorithmException, IOException {
            int length;
            int i10;
            boolean z10;
            String strStringPlus;
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            int i11 = f62045b;
            int i12 = i11 & 97;
            int i13 = (i11 | 97) & (~i12);
            int i14 = -(-(i12 << 1));
            int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
            f62044a = i15 % 128;
            if (i15 % 2 != 0) {
                length = str.length();
                i10 = 1;
            } else {
                length = str.length();
                i10 = 0;
            }
            while (i10 < length) {
                int i16 = f62044a;
                int i17 = i16 & 49;
                int i18 = (((i16 ^ 49) | i17) << 1) - ((i16 | 49) & (~i17));
                f62045b = i18 % 128;
                int i19 = i18 % 2;
                int i20 = (i10 ^ 89) + ((i10 & 89) << 1);
                int i21 = (i20 | (-88)) + (i20 & (-88));
                char cCharAt = str.charAt(i10);
                if (cCharAt != '\t') {
                    int i22 = f62044a;
                    int i23 = i22 + 57;
                    f62045b = i23 % 128;
                    int i24 = i23 % 2;
                    if (' ' <= cCharAt) {
                        int i25 = (((i22 & (-16)) | ((~i22) & 15)) - (~(-(-((i22 & 15) << 1))))) - 1;
                        int i26 = i25 % 128;
                        f62045b = i26;
                        int i27 = i25 % 2;
                        if (cCharAt < 127) {
                            int i28 = (i22 ^ 23) + ((i22 & 23) << 1);
                            int i29 = i28 % 128;
                            f62045b = i29;
                            int i30 = i28 % 2;
                            int i31 = i29 + 27;
                            f62044a = i31 % 128;
                            int i32 = i31 % 2;
                            z10 = true;
                        } else {
                            int i33 = ((i26 & 100) + (i26 | 100)) - 1;
                            f62044a = i33 % 128;
                            int i34 = i33 % 2;
                        }
                        if (!z10) {
                            int i35 = f62045b;
                            int i36 = i35 & 65;
                            int i37 = ((((i35 ^ 65) | i36) << 1) - (~(-((~i36) & (i35 | 65))))) - 1;
                            f62044a = i37 % 128;
                            int i38 = i37 % 2;
                            int i39 = i35 + 103;
                            f62044a = i39 % 128;
                            int i40 = i39 % 2;
                            String str3 = (String) yt.setY(new Object[]{"Unexpected char %#04x at %d in %s value", new Object[]{Integer.valueOf(cCharAt), Integer.valueOf(i10), str2}}, -1701904396, 1701904431, (int) System.currentTimeMillis());
                            if (((Boolean) yt.setY(new Object[]{str2}, -1456569763, 1456569810, (int) System.currentTimeMillis())).booleanValue()) {
                                int i41 = f62045b;
                                int i42 = i41 + 27;
                                f62044a = i42 % 128;
                                int i43 = i42 % 2;
                                int i44 = i41 & 81;
                                int i45 = ((i41 ^ 81) | i44) << 1;
                                int i46 = -((i41 | 81) & (~i44));
                                int i47 = ((i45 | i46) << 1) - (i46 ^ i45);
                                f62044a = i47 % 128;
                                int i48 = i47 % 2;
                                strStringPlus = "";
                            } else {
                                strStringPlus = Intrinsics.stringPlus(": ", str);
                                int i49 = f62044a;
                                int i50 = i49 & 19;
                                int i51 = ((((i49 ^ 19) | i50) << 1) - (~(-((i49 | 19) & (~i50))))) - 1;
                                f62045b = i51 % 128;
                                int i52 = i51 % 2;
                            }
                            throw new IllegalArgumentException(Intrinsics.stringPlus(str3, strStringPlus).toString());
                        }
                    } else {
                        int i53 = i22 & 69;
                        int i54 = (i22 | 69) & (~i53);
                        int i55 = i53 << 1;
                        int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
                        f62045b = i56 % 128;
                        int i57 = i56 % 2;
                    }
                    z10 = false;
                    if (!z10) {
                        int i310 = f62045b;
                        int i311 = i310 & 65;
                        int i312 = ((((i310 ^ 65) | i311) << 1) - (~(-((~i311) & (i310 | 65))))) - 1;
                        f62044a = i312 % 128;
                        int i313 = i312 % 2;
                        int i314 = i310 + 103;
                        f62044a = i314 % 128;
                        int i410 = i314 % 2;
                        String str4 = (String) yt.setY(new Object[]{"Unexpected char %#04x at %d in %s value", new Object[]{Integer.valueOf(cCharAt), Integer.valueOf(i10), str2}}, -1701904396, 1701904431, (int) System.currentTimeMillis());
                        if (((Boolean) yt.setY(new Object[]{str2}, -1456569763, 1456569810, (int) System.currentTimeMillis())).booleanValue()) {
                            int i411 = f62045b;
                            int i412 = i411 + 27;
                            f62044a = i412 % 128;
                            int i413 = i412 % 2;
                            int i414 = i411 & 81;
                            int i415 = ((i411 ^ 81) | i414) << 1;
                            int i416 = -((i411 | 81) & (~i414));
                            int i417 = ((i415 | i416) << 1) - (i416 ^ i415);
                            f62044a = i417 % 128;
                            int i418 = i417 % 2;
                            strStringPlus = "";
                        } else {
                            strStringPlus = Intrinsics.stringPlus(": ", str);
                            int i419 = f62044a;
                            int i58 = i419 & 19;
                            int i59 = ((((i419 ^ 19) | i58) << 1) - (~(-((i419 | 19) & (~i58))))) - 1;
                            f62045b = i59 % 128;
                            int i510 = i59 % 2;
                        }
                        throw new IllegalArgumentException(Intrinsics.stringPlus(str4, strStringPlus).toString());
                    }
                }
                int i60 = f62045b;
                int i61 = ((i60 ^ 71) | (i60 & 71)) << 1;
                int i62 = -(((~i60) & 71) | (i60 & (-72)));
                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                f62044a = i63 % 128;
                int i64 = i63 % 2;
                i10 = i21;
            }
            int i65 = f62045b;
            int i66 = (i65 ^ 83) + ((i65 & 83) << 1);
            f62044a = i66 % 128;
            if (i66 % 2 != 0) {
                throw null;
            }
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        public static ye setDividerPadding(@NotNull Map<String, String> map) {
            return (ye) setX(new Object[]{map}, -1788511693, 1788511697, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Code duplicated, block: B:56:0x0445 A[PHI: r6
          0x0445: PHI (r6v18 int) = (r6v17 int), (r6v22 int) binds: [B:55:0x0443, B:52:0x0428] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:57:0x0466 A[PHI: r6
          0x0466: PHI (r6v20 int) = (r6v17 int), (r6v22 int) binds: [B:55:0x0443, B:52:0x0428] A[DONT_GENERATE, DONT_INLINE]] */
        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            String[] strArr;
            int length;
            int i13;
            boolean z10;
            String[] strArr2;
            Iterator it;
            int i14;
            int i15;
            int i16 = ~i10;
            int i17 = ~i11;
            int i18 = (((~(i16 | i12)) | i17) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i10 | i12)) | (~(i17 | i10))) * (-318)) + (((~(i11 | (~i12) | i10)) | (~(i16 | i17 | i12))) * (-318)) + (i11 * 319) + (i10 * (-317));
            int i19 = 412848545;
            int i20 = -412848540;
            int i21 = -1493980502;
            int i22 = 1493980502;
            switch (i18) {
                case 1:
                    return a(objArr);
                case 2:
                    String[] strArr3 = (String[]) objArr[0];
                    int i23 = f62045b;
                    int i24 = i23 ^ 25;
                    int i25 = ((i23 & 25) | i24) << 1;
                    int i26 = -i24;
                    int i27 = (i25 & i26) + (i25 | i26);
                    f62044a = i27 % 128;
                    if (i27 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(strArr3, "");
                        int length2 = strArr3.length;
                        strArr = (String[]) strArr3.clone();
                        length = strArr.length;
                    } else {
                        Intrinsics.checkNotNullParameter(strArr3, "");
                        int length3 = strArr3.length % 2;
                        strArr = (String[]) strArr3.clone();
                        length = strArr.length;
                    }
                    int i28 = 0;
                    while (i28 < length) {
                        int i29 = f62045b;
                        int i30 = i29 ^ 65;
                        int i31 = ((i29 & 65) | i30) << 1;
                        int i32 = -i30;
                        int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
                        f62044a = i33 % 128;
                        if (i33 % 2 != 0) {
                            int i34 = ((i28 & 32) - (~(-(-(i28 | 32))))) - 1;
                            int i35 = i34 & 13;
                            int i36 = -(-(i34 | 13));
                            i13 = (i35 & i36) + (i36 | i35);
                            if (strArr[i28] != null) {
                                int i37 = ((i29 & 120) + (i29 | 120)) - 1;
                                f62044a = i37 % 128;
                                int i38 = i37 % 2;
                                int i39 = (((i29 & (-60)) | ((~i29) & 59)) - (~(-(-((i29 & 59) << 1))))) - 1;
                                f62044a = i39 % 128;
                                int i40 = i39 % 2;
                                z10 = true;
                            } else {
                                int i41 = i29 + 13;
                                f62044a = i41 % 128;
                                int i42 = i41 % 2;
                                z10 = false;
                            }
                        } else {
                            int i43 = i28 & 68;
                            int i44 = (i28 ^ 68) | i43;
                            int i45 = (i43 ^ i44) + ((i43 & i44) << 1);
                            int i46 = i45 & (-67);
                            int i47 = (~i46) & (i45 | (-67));
                            int i48 = i46 << 1;
                            i13 = ((i47 | i48) << 1) - (i48 ^ i47);
                            if (strArr[i28] != null) {
                                int i310 = ((i29 & 120) + (i29 | 120)) - 1;
                                f62044a = i310 % 128;
                                int i311 = i310 % 2;
                                int i312 = (((i29 & (-60)) | ((~i29) & 59)) - (~(-(-((i29 & 59) << 1))))) - 1;
                                f62044a = i312 % 128;
                                int i49 = i312 % 2;
                                z10 = true;
                            } else {
                                int i410 = i29 + 13;
                                f62044a = i410 % 128;
                                int i411 = i410 % 2;
                                z10 = false;
                            }
                        }
                        if (!z10) {
                            throw new IllegalArgumentException("Headers cannot be null".toString());
                        }
                        strArr[i28] = StringsKt__StringsKt.trim((CharSequence) strArr[i28]).toString();
                        int i50 = f62044a;
                        int i51 = ((i50 & (-124)) | ((~i50) & 123)) + ((i50 & 123) << 1);
                        f62045b = i51 % 128;
                        int i52 = i51 % 2;
                        i28 = i13;
                    }
                    int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, strArr.length - 1, 2);
                    if (progressionLastElement >= 0) {
                        int i53 = 0;
                        while (true) {
                            int i54 = i53 & 72;
                            int i55 = (~i54) & (i53 | 72);
                            int i56 = -(-(i54 << 1));
                            int i57 = ((i55 ^ i56) + ((i56 & i55) << 1)) - 70;
                            String str = strArr[i53];
                            int i58 = (i53 & 2) + (i53 | 2);
                            String str2 = strArr[(i58 ^ (-1)) + (i58 << 1)];
                            setX(new Object[]{str}, 1493980502, -1493980502, (int) System.currentTimeMillis());
                            setX(new Object[]{str2, str}, -412848540, 412848545, (int) System.currentTimeMillis());
                            if (i53 != progressionLastElement) {
                                i53 = i57;
                            }
                        }
                    }
                    ye yeVar = new ye(strArr, null);
                    int i59 = f62045b + 61;
                    f62044a = i59 % 128;
                    int i60 = i59 % 2;
                    return yeVar;
                case 3:
                    String str3 = (String) objArr[0];
                    String str4 = (String) objArr[1];
                    int i61 = f62044a;
                    int i62 = i61 & 1;
                    int i63 = (((i61 | 1) & (~i62)) - (~(-(-(i62 << 1))))) - 1;
                    f62045b = i63 % 128;
                    int i64 = i63 % 2;
                    setX(new Object[]{str3, str4}, -412848540, 412848545, (int) System.currentTimeMillis());
                    int i65 = f62045b;
                    int i66 = i65 & 25;
                    int i67 = i65 | 25;
                    int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                    f62044a = i68 % 128;
                    int i69 = i68 % 2;
                    return null;
                case 4:
                    Map map = (Map) objArr[0];
                    int i70 = f62045b;
                    int i71 = i70 & 119;
                    int i72 = (i70 ^ 119) | i71;
                    int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                    f62044a = i73 % 128;
                    if (i73 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(map, "");
                        strArr2 = new String[map.size() % 1];
                        it = map.entrySet().iterator();
                        i14 = 1;
                    } else {
                        Intrinsics.checkNotNullParameter(map, "");
                        strArr2 = new String[map.size() << 1];
                        it = map.entrySet().iterator();
                        i14 = 0;
                    }
                    while (it.hasNext()) {
                        int i74 = f62044a;
                        int i75 = (((i74 ^ 25) | (i74 & 25)) << 1) - (((~i74) & 25) | (i74 & (-26)));
                        f62045b = i75 % 128;
                        int i76 = i75 % 2;
                        Map.Entry entry = (Map.Entry) it.next();
                        String str5 = (String) entry.getKey();
                        String str6 = (String) entry.getValue();
                        String string = StringsKt__StringsKt.trim((CharSequence) str5).toString();
                        String string2 = StringsKt__StringsKt.trim((CharSequence) str6).toString();
                        String[] strArr4 = strArr2;
                        setX(new Object[]{string}, i22, i21, (int) System.currentTimeMillis());
                        setX(new Object[]{string2, string}, i20, i19, (int) System.currentTimeMillis());
                        strArr4[i14] = string;
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        int i77 = -(-(i14 * Opcodes.INSTANCEOF));
                        int i78 = 193 & i77;
                        int i79 = (i77 | Opcodes.INSTANCEOF) & (~i78);
                        int i80 = i78 << 1;
                        int i81 = (i79 ^ i80) + ((i79 & i80) << 1);
                        int i82 = ~iCurrentTimeMillis;
                        int i83 = (i82 | iCurrentTimeMillis) & i82;
                        int i84 = (-2) & i14;
                        int i85 = (~i84) & ((-2) | i14);
                        int i86 = ~((i84 & i85) | (i85 ^ i84));
                        int i87 = -(-(((i86 & i83) | (i83 ^ i86)) * (-192)));
                        int i88 = i81 & i87;
                        int i89 = (i87 ^ i81) | i88;
                        int i90 = (i88 & i89) + (i89 | i88);
                        int i91 = ~i14;
                        int i92 = (i91 | i14) & i91;
                        int i93 = ~(((-2) ^ i92) | (i92 & (-2)));
                        int i94 = ((~i91) & i83) | ((~i83) & i91);
                        int i95 = i91 & i83;
                        int i96 = ~((i94 ^ i95) | (i94 & i95));
                        int i97 = i93 ^ i96;
                        int i98 = i96 & i93;
                        int i99 = -(-(((i97 & i98) | (i97 ^ i98)) * (-384)));
                        int i100 = i90 & i99;
                        int i101 = i99 | i90;
                        int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                        int i103 = (-2) & i91;
                        int i104 = (~i103) & ((-2) | i91);
                        int i105 = (i104 & i103) | (i104 ^ i103);
                        int i106 = (i105 & i82) | ((~i105) & iCurrentTimeMillis);
                        int i107 = i105 & iCurrentTimeMillis;
                        int i108 = (i107 & i106) | (i106 ^ i107);
                        int i109 = ~i108;
                        int i110 = (i108 | i109) & i109;
                        int i111 = (~i95) & (i91 | i83);
                        int i112 = (i111 & i95) | (i111 ^ i95);
                        int i113 = ~((i112 & 1) | (i112 ^ 1));
                        int i114 = i110 & i113;
                        int i115 = ((i110 | i113) & (~i114)) | i114;
                        int i116 = i14 | 1;
                        int i117 = i116 & iCurrentTimeMillis;
                        int i118 = ~(((i116 | iCurrentTimeMillis) & (~i117)) | i117);
                        int i119 = ((~i118) & i115) | ((~i115) & i118);
                        int i120 = i115 & i118;
                        int i121 = -(~(-(-(((i120 & i119) | (i119 ^ i120)) * 192))));
                        strArr4[(-2) - (((i102 & i121) + (i121 | i102)) ^ (-1))] = string2;
                        i14 = ((i14 | 2) << 1) - (i14 ^ 2);
                        int i122 = f62045b;
                        int i123 = (i122 ^ 15) + ((i122 & 15) << 1);
                        f62044a = i123 % 128;
                        int i124 = i123 % 2;
                        i19 = 412848545;
                        i21 = -1493980502;
                        i22 = 1493980502;
                        strArr2 = strArr4;
                        i20 = -412848540;
                    }
                    ye yeVar2 = new ye(strArr2, null);
                    int i125 = f62045b;
                    int i126 = ((i125 & (-64)) | ((~i125) & 63)) + ((i125 & 63) << 1);
                    f62044a = i126 % 128;
                    int i127 = i126 % 2;
                    return yeVar2;
                case 5:
                    b(objArr);
                    return null;
                case 6:
                    String str7 = (String) objArr[0];
                    int i128 = f62045b;
                    int i129 = i128 ^ 95;
                    int i130 = (i128 & 95) << 1;
                    int i131 = ((i129 | i130) << 1) - (i130 ^ i129);
                    f62044a = i131 % 128;
                    int i132 = i131 % 2;
                    setX(new Object[]{str7}, 1493980502, -1493980502, (int) System.currentTimeMillis());
                    int i133 = f62045b;
                    int i134 = ((i133 ^ 17) | (i133 & 17)) << 1;
                    int i135 = -(((~i133) & 17) | (i133 & (-18)));
                    int i136 = ((i134 | i135) << 1) - (i135 ^ i134);
                    f62044a = i136 % 128;
                    if (i136 % 2 == 0) {
                        return null;
                    }
                    int i137 = 56 / 0;
                    return null;
                case 7:
                    String[] strArr5 = (String[]) objArr[0];
                    String str8 = (String) objArr[1];
                    int i138 = f62044a;
                    int i139 = i138 & 1;
                    int i140 = i138 | 1;
                    int i141 = (i139 & i140) + (i140 | i139);
                    f62045b = i141 % 128;
                    int i142 = i141 % 2;
                    String str9 = (String) setX(new Object[]{strArr5, str8}, -1853264377, 1853264378, (int) System.currentTimeMillis());
                    int i143 = f62045b;
                    int i144 = (i143 & (-24)) | ((~i143) & 23);
                    int i145 = -(-((i143 & 23) << 1));
                    int i146 = (i144 & i145) + (i145 | i144);
                    f62044a = i146 % 128;
                    if (i146 % 2 == 0) {
                        return str9;
                    }
                    int i147 = 22 / 0;
                    return str9;
                default:
                    String str10 = (String) objArr[0];
                    int i148 = f62045b + 25;
                    f62044a = i148 % 128;
                    int i149 = i148 % 2;
                    if (str10.length() <= 0) {
                        int i150 = f62045b;
                        int i151 = (i150 & 15) + (i150 | 15);
                        f62044a = i151 % 128;
                        int i152 = i151 % 2;
                        throw new IllegalArgumentException("name is empty".toString());
                    }
                    int i153 = f62045b;
                    int i154 = i153 & 77;
                    int i155 = (i153 ^ 77) | i154;
                    int i156 = (i154 ^ i155) + ((i154 & i155) << 1);
                    f62044a = i156 % 128;
                    int i157 = i156 % 2;
                    int i158 = (i153 & 9) + (i153 | 9);
                    f62044a = i158 % 128;
                    int i159 = i158 % 2;
                    int length4 = str10.length();
                    int i160 = f62045b;
                    int i161 = i160 & 25;
                    int i162 = i160 | 25;
                    int i163 = (i161 & i162) + (i162 | i161);
                    f62044a = i163 % 128;
                    int i164 = i163 % 2;
                    int i165 = 0;
                    while (true) {
                        if (i165 >= length4) {
                            int i166 = f62045b;
                            int i167 = ((i166 & 36) + (i166 | 36)) - 1;
                            f62044a = i167 % 128;
                            if (i167 % 2 == 0) {
                                return null;
                            }
                            int i168 = 18 / 0;
                            return null;
                        }
                        int i169 = f62045b;
                        int i170 = (i169 & 48) + (i169 | 48);
                        int i171 = (i170 ^ (-1)) + (i170 << 1);
                        f62044a = i171 % 128;
                        int i172 = i171 % 2;
                        int i173 = (-2) - (((i165 ^ 92) + ((i165 & 92) << 1)) ^ (-1));
                        int i174 = i173 & (-90);
                        int i175 = (i174 - (~(-(-((i173 ^ (-90)) | i174))))) - 1;
                        char cCharAt = str10.charAt(i165);
                        if ('!' <= cCharAt) {
                            int i176 = f62045b;
                            int i177 = i176 + 23;
                            i15 = i177 % 128;
                            f62044a = i15;
                            if (i177 % 2 != 0) {
                                if (cCharAt < '}') {
                                    int i178 = i176 & 65;
                                    int i179 = i176 | 65;
                                    int i180 = (i178 ^ i179) + ((i178 & i179) << 1);
                                    f62044a = i180 % 128;
                                    int i181 = i180 % 2;
                                    int i182 = i176 | 17;
                                    int i183 = i182 << 1;
                                    int i184 = -(i182 & (~(i176 & 17)));
                                    int i185 = (i183 ^ i184) + ((i184 & i183) << 1);
                                    f62044a = i185 % 128;
                                    int i186 = i185 % 2;
                                    i165 = i175;
                                }
                            } else if (cCharAt < 127) {
                                int i1710 = i176 & 65;
                                int i1711 = i176 | 65;
                                int i187 = (i1710 ^ i1711) + ((i1710 & i1711) << 1);
                                f62044a = i187 % 128;
                                int i188 = i187 % 2;
                                int i189 = i176 | 17;
                                int i1810 = i189 << 1;
                                int i1811 = -(i189 & (~(i176 & 17)));
                                int i1812 = (i1810 ^ i1811) + ((i1811 & i1810) << 1);
                                f62044a = i1812 % 128;
                                int i1813 = i1812 % 2;
                                i165 = i175;
                            }
                        } else {
                            int i190 = f62044a;
                            int i191 = ((i190 ^ 13) | (i190 & 13)) << 1;
                            int i192 = -(((~i190) & 13) | (i190 & (-14)));
                            int i193 = (i191 & i192) + (i192 | i191);
                            f62045b = i193 % 128;
                            int i194 = i193 % 2;
                        }
                        throw new IllegalArgumentException(((String) yt.setY(new Object[]{"Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(cCharAt), Integer.valueOf(i165), str10}}, -1701904396, 1701904431, (int) System.currentTimeMillis())).toString());
                    }
                    int i195 = ((i15 & (-72)) | ((~i15) & 71)) + ((i15 & 71) << 1);
                    f62045b = i195 % 128;
                    int i196 = i195 % 2;
                    throw new IllegalArgumentException(((String) yt.setY(new Object[]{"Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(cCharAt), Integer.valueOf(i165), str10}}, -1701904396, 1701904431, (int) System.currentTimeMillis())).toString());
            }
        }

        public static final /* synthetic */ String setY(String[] strArr, String str) {
            return (String) setX(new Object[]{strArr, str}, 1618476612, -1618476605, (int) System.currentTimeMillis());
        }

        @JvmStatic
        @JvmName(name = "of")
        @NotNull
        public static ye setOnFocusChangeListener(@NotNull String... p4) {
            return (ye) setX(new Object[]{p4}, 1069746043, -1069746041, (int) System.currentTimeMillis());
        }
    }

    public static final class setOnFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f62046b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f62047c = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ArrayList f62048a = new ArrayList(20);

        /* JADX WARN: Code duplicated, block: B:22:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:35:0x0266 A[PHI: r2
          0x0266: PHI (r2v21 int) = (r2v20 int), (r2v51 int) binds: [B:34:0x0264, B:31:0x0253] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x02e2  */
        /* JADX WARN: Code duplicated, block: B:39:0x02ea  */
        /* JADX WARN: Code duplicated, block: B:40:0x032b  */
        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
            int iIndexOf$default;
            int i13;
            int i14 = ~i10;
            int i15 = ~(i11 | i12);
            switch ((((~(i10 | (~i11))) | (~(i14 | i11))) * 110) + (((~(i10 | i11)) | i15) * 220) + ((i14 | i15) * (-220)) + (i11 * 111) + (i10 * (-109))) {
                case 1:
                    setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                    int i16 = f62046b + 73;
                    int i17 = i16 % 128;
                    f62047c = i17;
                    int i18 = i16 % 2;
                    ArrayList arrayList = setonfocuschangelistener.f62048a;
                    int i19 = i17 + 117;
                    f62046b = i19 % 128;
                    if (i19 % 2 == 0) {
                        return arrayList;
                    }
                    int i20 = 37 / 0;
                    return arrayList;
                case 2:
                    setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
                    String str = (String) objArr[1];
                    String str2 = (String) objArr[2];
                    int i21 = f62047c;
                    int i22 = (i21 & 65) + (i21 | 65);
                    f62046b = i22 % 128;
                    int i23 = i22 % 2;
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(str2, "");
                    ((List) setOnFocusChangeListener(new Object[]{setonfocuschangelistener2}, 1989277016, -1989277015, System.identityHashCode(setonfocuschangelistener2))).add(str);
                    ((List) setOnFocusChangeListener(new Object[]{setonfocuschangelistener2}, 1989277016, -1989277015, System.identityHashCode(setonfocuschangelistener2))).add(StringsKt__StringsKt.trim((CharSequence) str2).toString());
                    int i24 = f62047c;
                    int i25 = ((((i24 ^ 55) | (i24 & 55)) << 1) - (~(-(((~i24) & 55) | (i24 & (-56)))))) - 1;
                    f62046b = i25 % 128;
                    int i26 = i25 % 2;
                    return setonfocuschangelistener2;
                case 3:
                    setOnFocusChangeListener setonfocuschangelistener3 = (setOnFocusChangeListener) objArr[0];
                    String str3 = (String) objArr[1];
                    int i27 = f62046b;
                    int i28 = ((i27 | 93) << 1) - (i27 ^ 93);
                    f62047c = i28 % 128;
                    if (i28 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(str3, "");
                        iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str3, 'm', 0, false, 3, (Object) null);
                        if (iIndexOf$default != -1) {
                            String strSubstring = str3.substring(0, iIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                            System.identityHashCode(setonfocuschangelistener3);
                            int i29 = (-701) - (~(iIndexOf$default * 702));
                            int i30 = ~iIndexOf$default;
                            int i31 = (i30 | iIndexOf$default) & i30;
                            int i32 = (-2) ^ i31;
                            int i33 = i31 & (-2);
                            int i34 = (~((i33 & i32) | (i32 ^ i33))) * 701;
                            int i35 = ((i29 ^ i34) | (i29 & i34)) << 1;
                            int i36 = -(((~i29) & i34) | ((~i34) & i29));
                            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                            int i38 = iIndexOf$default & (-2);
                            int i39 = (iIndexOf$default | (-2)) & (~i38);
                            int i40 = -(-(((i39 & i38) | (i39 ^ i38)) * (-701)));
                            int i41 = (i37 & i40) + (i40 | i37);
                            int i42 = i30 * 701;
                            int i43 = i41 & i42;
                            int i44 = (i41 ^ i42) | i43;
                            String strSubstring2 = str3.substring((i43 ^ i44) + ((i43 & i44) << 1));
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                            int i45 = f62046b;
                            int i46 = i45 ^ 83;
                            int i47 = (i45 & 83) << 1;
                            i13 = ((i46 | i47) << 1) - (i47 ^ i46);
                        } else if (str3.charAt(0) == ':') {
                            int i48 = f62047c;
                            int i49 = i48 & 63;
                            int i50 = (((i48 ^ 63) | i49) << 1) - ((i48 | 63) & (~i49));
                            f62046b = i50 % 128;
                            int i51 = i50 % 2;
                            String strSubstring3 = str3.substring(1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
                            int i52 = f62047c;
                            int i53 = ((i52 ^ 79) - (~((i52 & 79) << 1))) - 1;
                            f62046b = i53 % 128;
                            int i54 = i53 % 2;
                        } else {
                            int i55 = f62046b;
                            int i56 = i55 & 23;
                            int i57 = (i55 ^ 23) | i56;
                            i13 = (i56 ^ i57) + ((i57 & i56) << 1);
                        }
                        f62047c = i13 % 128;
                        int i58 = i13 % 2;
                    } else {
                        Intrinsics.checkNotNullParameter(str3, "");
                        iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str3, AbstractJsonLexerKt.COLON, 1, false, 4, (Object) null);
                        if (iIndexOf$default != -1) {
                            String strSubstring4 = str3.substring(0, iIndexOf$default);
                            Intrinsics.checkNotNullExpressionValue(strSubstring4, "");
                            System.identityHashCode(setonfocuschangelistener3);
                            int i210 = (-701) - (~(iIndexOf$default * 702));
                            int i310 = ~iIndexOf$default;
                            int i311 = (i310 | iIndexOf$default) & i310;
                            int i312 = (-2) ^ i311;
                            int i313 = i311 & (-2);
                            int i314 = (~((i313 & i312) | (i312 ^ i313))) * 701;
                            int i315 = ((i210 ^ i314) | (i210 & i314)) << 1;
                            int i316 = -(((~i210) & i314) | ((~i314) & i210));
                            int i317 = (i315 ^ i316) + ((i316 & i315) << 1);
                            int i318 = iIndexOf$default & (-2);
                            int i319 = (iIndexOf$default | (-2)) & (~i318);
                            int i410 = -(-(((i319 & i318) | (i319 ^ i318)) * (-701)));
                            int i411 = (i317 & i410) + (i410 | i317);
                            int i412 = i310 * 701;
                            int i413 = i411 & i412;
                            int i414 = (i411 ^ i412) | i413;
                            String strSubstring5 = str3.substring((i413 ^ i414) + ((i413 & i414) << 1));
                            Intrinsics.checkNotNullExpressionValue(strSubstring5, "");
                            int i415 = f62046b;
                            int i416 = i415 ^ 83;
                            int i417 = (i415 & 83) << 1;
                            i13 = ((i416 | i417) << 1) - (i417 ^ i416);
                        } else if (str3.charAt(0) == ':') {
                            int i418 = f62047c;
                            int i419 = i418 & 63;
                            int i59 = (((i418 ^ 63) | i419) << 1) - ((i418 | 63) & (~i419));
                            f62046b = i59 % 128;
                            int i510 = i59 % 2;
                            String strSubstring6 = str3.substring(1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring6, "");
                            int i511 = f62047c;
                            int i512 = ((i511 ^ 79) - (~((i511 & 79) << 1))) - 1;
                            f62046b = i512 % 128;
                            int i513 = i512 % 2;
                        } else {
                            int i514 = f62046b;
                            int i515 = i514 & 23;
                            int i516 = (i514 ^ 23) | i515;
                            i13 = (i515 ^ i516) + ((i516 & i515) << 1);
                        }
                        f62047c = i13 % 128;
                        int i517 = i13 % 2;
                    }
                    int i60 = f62046b;
                    int i61 = ((i60 ^ 13) | (i60 & 13)) << 1;
                    int i62 = -(((~i60) & 13) | (i60 & (-14)));
                    int i63 = (i61 & i62) + (i62 | i61);
                    f62047c = i63 % 128;
                    int i64 = i63 % 2;
                    return setonfocuschangelistener3;
                case 4:
                    setOnFocusChangeListener setonfocuschangelistener4 = (setOnFocusChangeListener) objArr[0];
                    String str4 = (String) objArr[1];
                    int i65 = f62046b;
                    int i66 = ((i65 & 8) + (i65 | 8)) - 1;
                    f62047c = i66 % 128;
                    int i67 = i66 % 2;
                    Intrinsics.checkNotNullParameter(str4, "");
                    int i68 = f62047c;
                    int i69 = (i68 & (-120)) | ((~i68) & 119);
                    int i70 = (i68 & 119) << 1;
                    int i71 = (i69 & i70) + (i70 | i69);
                    f62046b = i71 % 128;
                    int i72 = i71 % 2;
                    int i73 = 0;
                    while (i73 < ((List) setOnFocusChangeListener(new Object[]{setonfocuschangelistener4}, 1989277016, -1989277015, System.identityHashCode(setonfocuschangelistener4))).size()) {
                        int i74 = f62046b;
                        int i75 = ((i74 | 35) << 1) - (i74 ^ 35);
                        f62047c = i75 % 128;
                        if (i75 % 2 == 0) {
                            if (l.equals(str4, (String) ((List) setOnFocusChangeListener(new Object[]{setonfocuschangelistener4}, 1989277016, -1989277015, System.identityHashCode(setonfocuschangelistener4))).get(i73), true)) {
                                ((List) setOnFocusChangeListener(new Object[]{setonfocuschangelistener4}, 1989277016, -1989277015, System.identityHashCode(setonfocuschangelistener4))).remove(i73);
                                ((List) setOnFocusChangeListener(new Object[]{setonfocuschangelistener4}, 1989277016, -1989277015, System.identityHashCode(setonfocuschangelistener4))).remove(i73);
                                i73 -= 2;
                                int i76 = f62046b;
                                int i77 = i76 ^ 49;
                                int i78 = ((i76 & 49) | i77) << 1;
                                int i79 = -i77;
                                int i80 = ((i78 | i79) << 1) - (i78 ^ i79);
                                f62047c = i80 % 128;
                                int i81 = i80 % 2;
                            }
                        } else if (l.equals(str4, (String) ((List) setOnFocusChangeListener(new Object[]{setonfocuschangelistener4}, 1989277016, -1989277015, System.identityHashCode(setonfocuschangelistener4))).get(i73), true)) {
                            ((List) setOnFocusChangeListener(new Object[]{setonfocuschangelistener4}, 1989277016, -1989277015, System.identityHashCode(setonfocuschangelistener4))).remove(i73);
                            ((List) setOnFocusChangeListener(new Object[]{setonfocuschangelistener4}, 1989277016, -1989277015, System.identityHashCode(setonfocuschangelistener4))).remove(i73);
                            i73 -= 2;
                            int i710 = f62046b;
                            int i711 = i710 ^ 49;
                            int i712 = ((i710 & 49) | i711) << 1;
                            int i713 = -i711;
                            int i82 = ((i712 | i713) << 1) - (i712 ^ i713);
                            f62047c = i82 % 128;
                            int i83 = i82 % 2;
                        }
                        i73 = ((i73 & 2) << 1) + (i73 ^ 2);
                        int i84 = f62046b;
                        int i85 = ((i84 ^ 37) | (i84 & 37)) << 1;
                        int i86 = -(((~i84) & 37) | (i84 & (-38)));
                        int i87 = (i85 & i86) + (i86 | i85);
                        f62047c = i87 % 128;
                        int i88 = i87 % 2;
                    }
                    int i89 = f62046b;
                    int i90 = ((i89 & 50) + (i89 | 50)) - 1;
                    f62047c = i90 % 128;
                    if (i90 % 2 != 0) {
                        return setonfocuschangelistener4;
                    }
                    throw null;
                case 5:
                    Object[] array = ((setOnFocusChangeListener) objArr[0]).f62048a.toArray(new String[0]);
                    if (array != null) {
                        return new ye((String[]) array, null);
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                case 6:
                    setOnFocusChangeListener setonfocuschangelistener5 = (setOnFocusChangeListener) objArr[0];
                    String str5 = (String) objArr[1];
                    String str6 = (String) objArr[2];
                    int i91 = f62047c;
                    int i92 = i91 | 77;
                    int i93 = ((i92 << 1) - (~(-((~(i91 & 77)) & i92)))) - 1;
                    f62046b = i93 % 128;
                    int i94 = i93 % 2;
                    Intrinsics.checkNotNullParameter(str5, "");
                    Intrinsics.checkNotNullParameter(str6, "");
                    Companion companion = ye.INSTANCE;
                    Companion.setX(new Object[]{str5}, 61834918, -61834912, (int) System.currentTimeMillis());
                    Companion.setX(new Object[]{str6, str5}, 347307625, -347307622, (int) System.currentTimeMillis());
                    int i95 = f62046b;
                    int i96 = i95 & 71;
                    int i97 = (((i95 | 71) & (~i96)) - (~(i96 << 1))) - 1;
                    f62047c = i97 % 128;
                    int i98 = i97 % 2;
                    return setonfocuschangelistener5;
                default:
                    setOnFocusChangeListener setonfocuschangelistener6 = (setOnFocusChangeListener) objArr[0];
                    String str7 = (String) objArr[1];
                    String str8 = (String) objArr[2];
                    int i99 = f62046b + 33;
                    f62047c = i99 % 128;
                    int i100 = i99 % 2;
                    Intrinsics.checkNotNullParameter(str7, "");
                    Intrinsics.checkNotNullParameter(str8, "");
                    Companion companion2 = ye.INSTANCE;
                    Companion.setX(new Object[]{str7}, 61834918, -61834912, (int) System.currentTimeMillis());
                    Companion.setX(new Object[]{str8, str7}, 347307625, -347307622, (int) System.currentTimeMillis());
                    int i101 = f62047c;
                    int i102 = i101 & 61;
                    int i103 = i102 + ((i101 ^ 61) | i102);
                    f62046b = i103 % 128;
                    int i104 = i103 % 2;
                    return setonfocuschangelistener6;
            }
        }

        @NotNull
        public final setOnFocusChangeListener setCompoundDrawableTintBlendMode(@NotNull String str, @NotNull String str2) {
            return (setOnFocusChangeListener) setOnFocusChangeListener(new Object[]{this, str, str2}, 730581667, -730581667, System.identityHashCode(this));
        }

        @NotNull
        public final setOnFocusChangeListener setDividerPadding(@NotNull String str) {
            return (setOnFocusChangeListener) setOnFocusChangeListener(new Object[]{this, str}, -799481598, 799481601, System.identityHashCode(this));
        }

        @NotNull
        public final ye setX() {
            return (ye) setOnFocusChangeListener(new Object[]{this}, -1008790874, 1008790879, System.identityHashCode(this));
        }

        @NotNull
        public final setOnFocusChangeListener setCompoundDrawableTintBlendMode(@NotNull String str) {
            return (setOnFocusChangeListener) setOnFocusChangeListener(new Object[]{this, str}, -1784117658, 1784117662, System.identityHashCode(this));
        }

        @NotNull
        public final setOnFocusChangeListener setX(@NotNull String str, @NotNull String str2) {
            return (setOnFocusChangeListener) setOnFocusChangeListener(new Object[]{this, str, str2}, -387141171, 387141173, System.identityHashCode(this));
        }

        @NotNull
        public final setOnFocusChangeListener setOnFocusChangeListener(@NotNull String str, @NotNull String str2) {
            return (setOnFocusChangeListener) setOnFocusChangeListener(new Object[]{this, str, str2}, -116831863, 116831869, System.identityHashCode(this));
        }

        @NotNull
        public final List<String> setOnFocusChangeListener() {
            return (List) setOnFocusChangeListener(new Object[]{this}, 1989277016, -1989277015, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f62041q0;
        int i11 = (i10 & 12) + (i10 | 12);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f62042r0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public ye(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f62043p0 = strArr;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x02b1 A[PHI: r3 r6
      0x02b1: PHI (r3v118 java.lang.String) = (r3v97 java.lang.String), (r3v120 java.lang.String) binds: [B:32:0x02af, B:29:0x025d] A[DONT_GENERATE, DONT_INLINE]
      0x02b1: PHI (r6v39 int) = (r6v36 int), (r6v47 int) binds: [B:32:0x02af, B:29:0x025d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x02c7 A[PHI: r6
      0x02c7: PHI (r6v37 int) = (r6v36 int), (r6v47 int) binds: [B:32:0x02af, B:29:0x025d] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException, CloneNotSupportedException {
        int iHashCode;
        int i13;
        String str;
        int i14 = ((~(i11 | i12)) * TypedValues.CycleType.TYPE_EASING) + (i11 * 421) + (i10 * (-419));
        int i15 = ~i10;
        int i16 = -2;
        int i17 = 1668064356;
        int i18 = -1668064352;
        int i19 = -611642844;
        int i20 = 611642845;
        switch ((((~(i15 | (~i11))) | (~(i11 | (~i12)))) * TypedValues.CycleType.TYPE_EASING) + ((i11 | i15) * (-420)) + i14) {
            case 1:
                ye yeVar = (ye) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i21 = f62042r0 + 69;
                f62041q0 = i21 % 128;
                int i22 = i21 % 2;
                String[] strArr = yeVar.f62043p0;
                return i22 != 0 ? strArr[iIntValue % 0] : strArr[iIntValue << 1];
            case 2:
                ye yeVar2 = (ye) objArr[0];
                int iIdentityHashCode = System.identityHashCode(yeVar2);
                int i23 = ~iIdentityHashCode;
                int i24 = ((-2077200523) & i23) | ((-2077200523) ^ i23);
                int i25 = ~i24;
                int i26 = (i24 | i25) & i25;
                int i27 = ((~i26) & 1900380290) | ((-1900380291) & i26);
                int i28 = i26 & 1900380290;
                int i29 = (i28 & i27) | (i27 ^ i28);
                int i30 = 247084633 & i23;
                int i31 = ~((247084633 ^ i23) | i30);
                int i32 = i29 & i31;
                int i33 = (i29 | i31) & (~i32);
                int i34 = (i33 & i32) | (i33 ^ i32);
                int i35 = (-70264402) & iIdentityHashCode;
                int i36 = ~((((-70264402) | iIdentityHashCode) & (~i35)) | i35);
                int i37 = i34 ^ i36;
                int i38 = i34 & i36;
                int i39 = -(~(((i38 & i37) | (i37 ^ i38)) * (-84)));
                int i40 = ((941027824 & i39) + (i39 | 941027824)) - 1;
                int i41 = (iIdentityHashCode & (-247084634)) | i30;
                int i42 = iIdentityHashCode & 247084633;
                int i43 = ~((i42 & i41) | (i41 ^ i42));
                int i44 = (i43 & 2077200522) | (2077200522 ^ i43);
                int i45 = i23 ^ (-247084634);
                int i46 = i23 & (-247084634);
                int i47 = ~((i45 ^ i46) | (i45 & i46));
                int i48 = -(-(((i44 & i47) | (i44 ^ i47)) * (-84)));
                int i49 = i40 & i48;
                int i50 = ((i40 ^ i48) | i49) << 1;
                int i51 = -((i48 | i40) & (~i49));
                int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                int i53 = i45 | i46;
                int i54 = ~i53;
                int i55 = (i53 | i54) & i54;
                int i56 = ((i55 & 70264401) | (i55 ^ 70264401)) * 84;
                int i57 = ((i52 ^ i56) | (i52 & i56)) << 1;
                int i58 = -((i56 & (~i52)) | ((~i56) & i52));
                int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                int iIdentityHashCode2 = System.identityHashCode(yeVar2);
                int i60 = ((~iIdentityHashCode2) & (-645493769)) | (645493768 & iIdentityHashCode2);
                int i61 = (-645493769) & iIdentityHashCode2;
                int i62 = ~((i60 & i61) | (i60 ^ i61));
                int i63 = -(-(((i62 & 541598720) | ((~i62) & 541598720) | ((-541598721) & i62)) * (-566)));
                int i64 = (-103398543) & i63;
                int i65 = (i63 | (-103398543)) & (~i64);
                int i66 = i64 << 1;
                int i67 = ((i65 | i66) << 1) - (i65 ^ i66);
                int i68 = ((i67 ^ (-1554373982)) - (~(((-1554373982) & i67) << 1))) - 1;
                int i69 = (-103895049) ^ iIdentityHashCode2;
                int i70 = iIdentityHashCode2 & (-103895049);
                int i71 = -(-((~((i70 & i69) | (i69 ^ i70))) * 566));
                int i72 = ((i68 | i71) << 1) - (i71 ^ i68);
                String[] strArr2 = yeVar2.f62043p0;
                if (i59 <= i72) {
                    iHashCode = Arrays.hashCode(strArr2);
                    int i73 = 37 / 0;
                } else {
                    iHashCode = Arrays.hashCode(strArr2);
                }
                int i74 = f62041q0 + 28;
                int i75 = (i74 ^ (-1)) + (i74 << 1);
                f62042r0 = i75 % 128;
                int i76 = i75 % 2;
                return Integer.valueOf(iHashCode);
            case 3:
                ye yeVar3 = (ye) objArr[0];
                String str2 = (String) objArr[1];
                int i77 = f62041q0;
                int i78 = (((i77 ^ 111) | (i77 & 111)) << 1) - (((~i77) & 111) | (i77 & (-112)));
                f62042r0 = i78 % 128;
                int i79 = i78 % 2;
                Intrinsics.checkNotNullParameter(str2, "");
                int iIntValue2 = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{yeVar3}, -1558209065, 1558209065, System.identityHashCode(yeVar3))).intValue();
                int i80 = f62042r0;
                int i81 = (i80 & (-98)) | ((~i80) & 97);
                int i82 = (i80 & 97) << 1;
                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                f62041q0 = i83 % 128;
                int i84 = i83 % 2;
                ArrayList arrayList = null;
                int i85 = 0;
                while (i85 < iIntValue2) {
                    int i86 = f62041q0 + 125;
                    f62042r0 = i86 % 128;
                    int i87 = i86 % 2;
                    int i88 = ((i85 | 1) << 1) - (i85 ^ 1);
                    if (l.equals(str2, (String) setCompoundDrawableTintBlendMode(new Object[]{yeVar3, Integer.valueOf(i85)}, 611642845, -611642844, i85), true)) {
                        int i89 = f62042r0;
                        int i90 = (-2) - (((i89 & 82) + (i89 | 82)) ^ (-1));
                        f62041q0 = i90 % 128;
                        if (i90 % 2 != 0) {
                            throw null;
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList(2);
                            int i91 = f62041q0;
                            int i92 = ((i91 ^ 21) | (i91 & 21)) << 1;
                            int i93 = -((i91 & (-22)) | ((~i91) & 21));
                            int i94 = (i92 & i93) + (i93 | i92);
                            f62042r0 = i94 % 128;
                            int i95 = i94 % 2;
                        }
                        arrayList.add((String) setCompoundDrawableTintBlendMode(new Object[]{yeVar3, Integer.valueOf(i85)}, -1668064352, 1668064356, i85));
                        int i96 = f62041q0;
                        int i97 = (i96 & (-84)) | ((~i96) & 83);
                        int i98 = -(-((i96 & 83) << 1));
                        int i99 = (i97 & i98) + (i98 | i97);
                        f62042r0 = i99 % 128;
                        int i100 = i99 % 2;
                    }
                    i85 = i88;
                }
                if (arrayList == null) {
                    List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    int i101 = f62042r0;
                    int i102 = i101 & 93;
                    int i103 = ((i101 ^ 93) | i102) << 1;
                    int i104 = -((i101 | 93) & (~i102));
                    int i105 = (i103 ^ i104) + ((i104 & i103) << 1);
                    f62041q0 = i105 % 128;
                    int i106 = i105 % 2;
                    return listEmptyList;
                }
                int i107 = f62041q0;
                int i108 = (i107 ^ 1) + ((i107 & 1) << 1);
                f62042r0 = i108 % 128;
                int i109 = i108 % 2;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
                int i110 = f62042r0;
                int i111 = ((i110 | 10) << 1) - (i110 ^ 10);
                int i112 = (i111 ^ (-1)) + (i111 << 1);
                f62041q0 = i112 % 128;
                int i113 = i112 % 2;
                return listUnmodifiableList;
            case 4:
                ye yeVar4 = (ye) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int i114 = f62041q0;
                int i115 = ((i114 & (-82)) | ((~i114) & 81)) + ((i114 & 81) << 1);
                int i116 = i115 % 128;
                f62042r0 = i116;
                int i117 = i115 % 2;
                int i118 = iIntValue3 << 1;
                int i119 = i118 & 1;
                int i120 = (i118 ^ 1) | i119;
                String str3 = yeVar4.f62043p0[((i119 | i120) << 1) - (i120 ^ i119)];
                int i121 = (i116 & (-80)) | ((~i116) & 79);
                int i122 = (i116 & 79) << 1;
                int i123 = ((i121 | i122) << 1) - (i121 ^ i122);
                f62041q0 = i123 % 128;
                int i124 = i123 % 2;
                return str3;
            case 5:
                ye yeVar5 = (ye) objArr[0];
                Object obj = objArr[1];
                int i125 = f62042r0;
                int i126 = i125 & 19;
                int i127 = -(-((i125 ^ 19) | i126));
                int i128 = (i126 & i127) + (i127 | i126);
                int i129 = i128 % 128;
                f62041q0 = i129;
                int i130 = i128 % 2;
                if (obj instanceof ye) {
                    int i131 = i129 + 57;
                    f62042r0 = i131 % 128;
                    int i132 = i131 % 2;
                    if (Arrays.equals(yeVar5.f62043p0, ((ye) obj).f62043p0)) {
                        int i133 = f62041q0;
                        int i134 = i133 ^ 83;
                        int i135 = ((i133 & 83) | i134) << 1;
                        int i136 = -i134;
                        int i137 = ((i135 | i136) << 1) - (i135 ^ i136);
                        f62042r0 = i137 % 128;
                        return Boolean.valueOf(!(i137 % 2 == 0));
                    }
                }
                int i138 = (-2) - ((f62042r0 + 90) ^ (-1));
                f62041q0 = i138 % 128;
                if (i138 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            case 6:
                ye yeVar6 = (ye) objArr[0];
                setOnFocusChangeListener setonfocuschangelistener = new setOnFocusChangeListener();
                g.addAll((List) setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, 1989277016, -1989277015, System.identityHashCode(setonfocuschangelistener)), yeVar6.f62043p0);
                int i139 = f62042r0 + 45;
                f62041q0 = i139 % 128;
                int i140 = i139 % 2;
                return setonfocuschangelistener;
            case 7:
                ye yeVar7 = (ye) objArr[0];
                String str4 = (String) objArr[1];
                int i141 = f62041q0;
                int i142 = (i141 ^ 3) + ((i141 & 3) << 1);
                f62042r0 = i142 % 128;
                if (i142 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(str4, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(str4, "");
                String str5 = (String) Companion.setX(new Object[]{yeVar7.f62043p0, str4}, 1618476612, -1618476605, (int) System.currentTimeMillis());
                int i143 = f62042r0;
                int i144 = i143 & 77;
                int i145 = -(-(i143 | 77));
                int i146 = (i144 & i145) + (i145 | i144);
                f62041q0 = i146 % 128;
                if (i146 % 2 == 0) {
                    return str5;
                }
                int i147 = 72 / 0;
                return str5;
            case 8:
                ye yeVar8 = (ye) objArr[0];
                StringBuilder sb2 = new StringBuilder();
                int iIntValue4 = ((Integer) setCompoundDrawableTintBlendMode(new Object[]{yeVar8}, -1558209065, 1558209065, System.identityHashCode(yeVar8))).intValue();
                int i148 = f62042r0;
                int i149 = i148 & 69;
                int i150 = -(-((i148 ^ 69) | i149));
                int i151 = (i149 ^ i150) + ((i150 & i149) << 1);
                f62041q0 = i151 % 128;
                int i152 = i151 % 2;
                int i153 = 0;
                while (i153 < iIntValue4) {
                    int i154 = f62041q0;
                    int i155 = i154 & 123;
                    int i156 = (((i154 | 123) & (~i155)) - (~(-(-(i155 << 1))))) - 1;
                    f62042r0 = i156 % 128;
                    if (i156 % 2 == 0) {
                        int i157 = i153 & 87;
                        int i158 = ((i153 ^ 87) | i157) << 1;
                        int i159 = -((~i157) & (i153 | 87));
                        int i160 = (i158 ^ i159) + ((i158 & i159) << 1);
                        int i161 = i160 ^ 25;
                        i13 = (((i160 & 25) | i161) << 1) - i161;
                        String str6 = (String) setCompoundDrawableTintBlendMode(new Object[]{yeVar8, Integer.valueOf(i153)}, 611642845, -611642844, i153);
                        str = (String) setCompoundDrawableTintBlendMode(new Object[]{yeVar8, Integer.valueOf(i153)}, -1668064352, 1668064356, i153);
                        sb2.append(str6);
                        sb2.append(": ");
                        if (((Boolean) yt.setY(new Object[]{str6}, -1456569763, 1456569810, (int) System.currentTimeMillis())).booleanValue()) {
                            int i162 = f62041q0;
                            int i163 = i162 & 35;
                            int i164 = -(-((i162 ^ 35) | i163));
                            int i165 = (i163 ^ i164) + ((i164 & i163) << 1);
                            int i166 = i165 % 128;
                            f62042r0 = i166;
                            int i167 = i165 % 2;
                            int i168 = i166 & 85;
                            int i169 = i168 + ((i166 ^ 85) | i168);
                            f62041q0 = i169 % 128;
                            int i170 = i169 % 2;
                            str = "██";
                        } else {
                            int i171 = f62042r0;
                            int i172 = i171 | 11;
                            int i173 = i172 << 1;
                            int i174 = -((~(i171 & 11)) & i172);
                            int i175 = ((i173 | i174) << 1) - (i174 ^ i173);
                            f62041q0 = i175 % 128;
                            int i176 = i175 % 2;
                        }
                    } else {
                        i13 = i153 + 1;
                        String str7 = (String) setCompoundDrawableTintBlendMode(new Object[]{yeVar8, Integer.valueOf(i153)}, 611642845, -611642844, i153);
                        str = (String) setCompoundDrawableTintBlendMode(new Object[]{yeVar8, Integer.valueOf(i153)}, -1668064352, 1668064356, i153);
                        sb2.append(str7);
                        sb2.append(": ");
                        if (!((Boolean) yt.setY(new Object[]{str7}, -1456569763, 1456569810, (int) System.currentTimeMillis())).booleanValue()) {
                            int i177 = f62042r0;
                            int i178 = i177 | 11;
                            int i179 = i178 << 1;
                            int i1710 = -((~(i177 & 11)) & i178);
                            int i1711 = ((i179 | i1710) << 1) - (i1710 ^ i179);
                            f62041q0 = i1711 % 128;
                            int i1712 = i1711 % 2;
                        } else {
                            int i1610 = f62041q0;
                            int i1611 = i1610 & 35;
                            int i1612 = -(-((i1610 ^ 35) | i1611));
                            int i1613 = (i1611 ^ i1612) + ((i1612 & i1611) << 1);
                            int i1614 = i1613 % 128;
                            f62042r0 = i1614;
                            int i1615 = i1613 % 2;
                            int i1616 = i1614 & 85;
                            int i1617 = i1616 + ((i1614 ^ 85) | i1616);
                            f62041q0 = i1617 % 128;
                            int i1713 = i1617 % 2;
                            str = "██";
                        }
                    }
                    sb2.append(str);
                    sb2.append(RootService.LINE_BREAK);
                    int i180 = f62041q0;
                    int i181 = i180 & 11;
                    int i182 = (i180 ^ 11) | i181;
                    int i183 = ((i181 | i182) << 1) - (i182 ^ i181);
                    f62042r0 = i183 % 128;
                    int i184 = i183 % 2;
                    i153 = i13;
                }
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i185 = f62042r0;
                int i186 = (i185 ^ 31) + ((i185 & 31) << 1);
                f62041q0 = i186 % 128;
                int i187 = i186 % 2;
                return string;
            case 9:
                ye yeVar9 = (ye) objArr[0];
                int i188 = f62041q0;
                int i189 = i188 & 77;
                int i190 = ((i188 | 77) & (~i189)) + (i189 << 1);
                f62042r0 = i190 % 128;
                int iIntValue5 = ((Integer) (i190 % 2 == 0 ? setCompoundDrawableTintBlendMode(new Object[]{yeVar9}, -1558209065, 1558209065, System.identityHashCode(yeVar9)) : setCompoundDrawableTintBlendMode(new Object[]{yeVar9}, -1558209065, 1558209065, System.identityHashCode(yeVar9)))).intValue();
                Pair[] pairArr = new Pair[iIntValue5];
                int i191 = f62041q0;
                int i192 = ((i191 | 91) << 1) - (((~i191) & 91) | (i191 & (-92)));
                f62042r0 = i192 % 128;
                int i193 = i192 % 2;
                int i194 = 0;
                while (i194 < iIntValue5) {
                    int i195 = f62042r0;
                    int i196 = ((i195 & (-104)) | ((~i195) & 103)) + ((i195 & 103) << 1);
                    f62041q0 = i196 % 128;
                    int i197 = i196 % 2;
                    pairArr[i194] = TuplesKt.to((String) setCompoundDrawableTintBlendMode(new Object[]{yeVar9, Integer.valueOf(i194)}, i20, i19, i194), (String) setCompoundDrawableTintBlendMode(new Object[]{yeVar9, Integer.valueOf(i194)}, i18, i17, i194));
                    int iIdentityHashCode3 = System.identityHashCode(yeVar9);
                    int i198 = i194 * (-657);
                    int i199 = ((659 ^ i198) | (659 & i198)) << 1;
                    int i200 = -(((~i198) & 659) | (i198 & (-660)));
                    int i201 = ((i199 | i200) << 1) - (i199 ^ i200);
                    int i202 = ~i194;
                    int i203 = i16 & i202;
                    int i204 = i203 | (i194 & 1);
                    int i205 = i194 & i16;
                    int i206 = ~((i204 ^ i205) | (i204 & i205));
                    int i207 = i202 & 1;
                    int i208 = (i202 ^ 1) | i207;
                    int i209 = ~i208;
                    int i210 = (i208 | i209) & i209;
                    int i211 = i206 & i210;
                    int i212 = ((i206 | i210) & (~i211)) | i211;
                    int i213 = ((~iIdentityHashCode3) & 1) | (iIdentityHashCode3 & (-2));
                    int i214 = iIdentityHashCode3 & 1;
                    int i215 = ~((i213 & i214) | (i213 ^ i214));
                    int i216 = i212 ^ i215;
                    int i217 = i212 & i215;
                    int i218 = -(-(((i217 & i216) | (i216 ^ i217)) * (-658)));
                    int i219 = i201 ^ i218;
                    int i220 = -(-((i218 & i201) << 1));
                    int i221 = ((i219 | i220) << 1) - (i220 ^ i219);
                    int i222 = -(-(i209 * 658));
                    int i223 = (i221 | i222) << 1;
                    int i224 = -((i222 & (~i221)) | ((~i222) & i221));
                    int i225 = ((i223 | i224) << 1) - (i224 ^ i223);
                    int i226 = ((~i202) & 1) | i203;
                    int i227 = (i226 & i207) | (i226 ^ i207);
                    int i228 = ~i227;
                    int i229 = (i227 | i228) & i228;
                    int i230 = iIdentityHashCode3 ^ 1;
                    int i231 = ~((i230 & i214) | (i230 ^ i214));
                    int i232 = ((~i231) & i229) | ((~i229) & i231);
                    int i233 = i229 & i231;
                    int i234 = ((i233 & i232) | (i232 ^ i233)) * 658;
                    i194 = ((((~i234) & i225) | ((~i225) & i234)) - (~(-(-((i234 & i225) << 1))))) - 1;
                    int i235 = f62041q0;
                    int i236 = (i235 ^ 1) + ((i235 & 1) << 1);
                    f62042r0 = i236 % 128;
                    int i237 = i236 % 2;
                    i16 = -2;
                    i17 = 1668064356;
                    i18 = -1668064352;
                    i19 = -611642844;
                    i20 = 611642845;
                }
                Iterator it = ArrayIteratorKt.iterator(pairArr);
                int i238 = f62042r0;
                int i239 = i238 & 47;
                int i240 = i239 + ((i238 ^ 47) | i239);
                f62041q0 = i240 % 128;
                if (i240 % 2 == 0) {
                    return it;
                }
                throw null;
            default:
                ye yeVar10 = (ye) objArr[0];
                int i241 = f62041q0;
                int i242 = (i241 & 27) + (i241 | 27);
                f62042r0 = i242 % 128;
                int i243 = i242 % 2;
                String[] strArr3 = yeVar10.f62043p0;
                int length = i243 == 0 ? strArr3.length >>> 4 : strArr3.length / 2;
                int i244 = i241 + 57;
                f62042r0 = i244 % 128;
                if (i244 % 2 != 0) {
                    return Integer.valueOf(length);
                }
                throw null;
        }
    }

    public final boolean equals(@Nullable Object p4) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 731368220, -731368215, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 541786510, -541786508, System.identityHashCode(this))).intValue();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        return (Iterator) setCompoundDrawableTintBlendMode(new Object[]{this}, 866406129, -866406120, System.identityHashCode(this));
    }

    @JvmName(name = "setDividerPadding")
    public final int setDividerPadding() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1558209065, 1558209065, System.identityHashCode(this))).intValue();
    }

    @NotNull
    public final setOnFocusChangeListener setX() {
        return (setOnFocusChangeListener) setCompoundDrawableTintBlendMode(new Object[]{this}, -1528950893, 1528950899, System.identityHashCode(this));
    }

    @NotNull
    public final List<String> setY(@NotNull String p4) {
        return (List) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -1178426431, 1178426434, System.identityHashCode(this));
    }

    @NotNull
    public final String toString() {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this}, -2044075689, 2044075697, System.identityHashCode(this));
    }

    @NotNull
    public final String setY(int p4) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(p4)}, 611642845, -611642844, p4);
    }

    @NotNull
    public final String setCompoundDrawableTintBlendMode(int p4) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(p4)}, -1668064352, 1668064356, p4);
    }

    @Nullable
    public final String setCompoundDrawableTintBlendMode(@NotNull String p4) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 914142416, -914142409, System.identityHashCode(this));
    }
}
