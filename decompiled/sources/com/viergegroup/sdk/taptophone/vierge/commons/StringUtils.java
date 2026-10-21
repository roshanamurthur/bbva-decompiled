package com.viergegroup.sdk.taptophone.vierge.commons;

import ai.a;
import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import androidx.exifinterface.media.ExifInterface;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import kotlin.reflect.KFunction;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0004J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0014J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0016J \u0010 \u001a\u0004\u0018\u0001H!\"\u0006\b\u0000\u0010!\u0018\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0086\b¢\u0006\u0002\u0010\"J \u0010 \u001a\u0004\u0018\u0001H!\"\u0006\b\u0000\u0010!\u0018\u00012\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010#J\u000e\u0010$\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0001J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0001J\u000e\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0016J\u000e\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\fJ\u000e\u0010)\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0004J\u000e\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0004J\u000e\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u0004J\u000e\u00102\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\bJ\u0010\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0004J\u0010\u00106\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0004J\u001e\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0004J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020>H\u0002J\u0016\u0010?\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u00109\u001a\u00020\bJ\u001e\u0010?\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0006\u00109\u001a\u00020\b2\u0006\u0010=\u001a\u00020>J \u0010?\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u00010\u00042\u0006\u00109\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u0004J\u0016\u0010A\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010B\u001a\u00020CJ\u0010\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0004J\u000e\u0010G\u001a\u00020\u00042\u0006\u0010H\u001a\u00020>J\u000e\u0010G\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004J\u000e\u0010I\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\fJ\n\u0010J\u001a\u00020\f*\u00020\u0004J\n\u0010K\u001a\u00020\f*\u00020\u0004J\n\u0010L\u001a\u00020\u0004*\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/viergegroup/sdk/taptophone/vierge/commons/StringUtils;", "", "()V", "HEX_CHARS", "", "HEX_CHARS2", "", "PAD_LIMIT", "", "hexArray", "asciiFromByteArray", "data", "", "asciiToByteArray", "bytes", "asciiToHex", "asciiStr", "asciiToHexByteArray", "ascciiParam", "boolsToByte", "", "array", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "byteArrToBinaryString", "value", "byteToHex", "num", "cleanTextContent", "text", "convertBoolArrayToByteArray", "boolArr", "decodeBase64", ExifInterface.GPS_DIRECTION_TRUE, "([B)Ljava/lang/Object;", "(Ljava/lang/String;)Ljava/lang/Object;", "encodeBase64Bytes", "encodeBase64String", "encodeBoolArrToHexString", "encodeHexString", "byteArray", "fromByteArray", "gzip", "content", "hexStringToByteArray", "sParam", "hexStringToByteArrayNeo", "s", "hexToAscii", "hexStr", "intToHexString", "isEmpty", "", "str", "isNullOrEmpty", "leftPad", "strParam", "size", "padStr", "padding", VDPhotoSelfieCapture.LOG_TAG_REPEAT, "padChar", "", "rightPad", "padStrParam", "strictStringToBytes", "charset", "Ljava/nio/charset/Charset;", "stringToDateTime", "Ljava/util/Date;", "string", "toHexString", "ch", "ungzip", "decodeHex", "hexString2ByteArray", "toHex", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStringUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringUtils.kt\ncom/viergegroup/sdk/taptophone/vierge/commons/StringUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,536:1\n1#2:537\n1549#3:538\n1620#3,3:539\n13586#4,2:542\n107#5:544\n79#5,22:545\n*S KotlinDebug\n*F\n+ 1 StringUtils.kt\ncom/viergegroup/sdk/taptophone/vierge/commons/StringUtils\n*L\n156#1:538\n156#1:539,3\n179#1:542,2\n320#1:544\n320#1:545,22\n*E\n"})
public final class StringUtils {

    @NotNull
    public static final StringUtils INSTANCE = new StringUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final char[] f67778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final char[] f67779b;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        f67778a = charArray;
        char[] charArray2 = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "");
        f67779b = charArray2;
    }

    private StringUtils() {
    }

    @NotNull
    public final String asciiFromByteArray(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "");
        try {
            return new String(data, Charsets.UTF_8);
        } catch (Exception e5) {
            return f.d("ERROR_EN_FORMATO:", e5.getMessage());
        }
    }

    @NotNull
    public final byte[] asciiToByteArray(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "");
        return hexStringToByteArray(hexToAscii(fromByteArray(bytes)));
    }

    @NotNull
    public final String asciiToHex(@NotNull String asciiStr) {
        Intrinsics.checkNotNullParameter(asciiStr, "");
        char[] charArray = asciiStr.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        StringBuilder sb2 = new StringBuilder();
        for (char c10 : charArray) {
            sb2.append(Integer.toHexString(c10));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @NotNull
    public final byte[] asciiToHexByteArray(@NotNull String ascciiParam) {
        Intrinsics.checkNotNullParameter(ascciiParam, "");
        if (ascciiParam.length() % 2 == 1) {
            ascciiParam = ascciiParam.concat("F");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = ascciiParam.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 2;
            String strSubstring = ascciiParam.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            try {
                String hexString = Integer.toHexString(Integer.parseInt(strSubstring));
                Intrinsics.checkNotNullExpressionValue(hexString, "");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String upperCase = hexString.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "");
                byte[] bytes = upperCase.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                byteArrayOutputStream.write(bytes);
            } catch (IOException e5) {
                System.out.println((Object) e5.toString());
            }
            i10 = i11;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "");
        return byteArray;
    }

    @NotNull
    public final String byteArrToBinaryString(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "");
        StringBuilder sb2 = new StringBuilder(value.length - 1);
        for (byte b10 : value) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            sb2.append(l.replace$default(a.i(new Object[]{Integer.toBinaryString(b10)}, 1, "%8s", ""), ' ', '0', false, 4, (Object) null));
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @NotNull
    public final String byteToHex(byte num) {
        return new String(new char[]{Character.forDigit((num >> 4) & 15, 16), Character.forDigit((byte) (num & 15), 16)});
    }

    @NotNull
    public final String cleanTextContent(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "");
        String strReplace = new Regex("\\p{C}").replace(new Regex("[\\p{Cntrl}&&[^\r\n\t]]").replace(new Regex("[^\\x00-\\x7F]").replace(text, ""), ""), "");
        int length = strReplace.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = Intrinsics.compare((int) strReplace.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return strReplace.subSequence(i10, length + 1).toString();
    }

    @NotNull
    public final byte[] convertBoolArrayToByteArray(@NotNull boolean[] boolArr) {
        Intrinsics.checkNotNullParameter(boolArr, "");
        int length = boolArr.length / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 << 3;
            byte b10 = 0;
            for (int i12 = 0; i12 < 8; i12++) {
                if (boolArr[i11 + i12]) {
                    b10 = (byte) (b10 | ((byte) (1 << (7 - i12))));
                }
            }
            bArr[i10] = b10;
        }
        return bArr;
    }

    public final /* synthetic */ <T> T decodeBase64(byte[] data) {
        T next;
        Intrinsics.checkNotNullParameter(data, "");
        String strUngzip = ungzip(data);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Iterator<T> it = Reflection.getOrCreateKotlinClass(Object.class).getConstructors().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((KFunction) next).getParameters().isEmpty());
        KFunction kFunction = (KFunction) next;
        if (kFunction == null) {
            return null;
        }
        R rCall = kFunction.call(new Object[0]);
        Gson gsonCreate = new GsonBuilder().create();
        Intrinsics.checkNotNull(rCall);
        return (T) gsonCreate.fromJson(strUngzip, (Class) rCall.getClass());
    }

    @NotNull
    public final byte[] decodeHex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() % 2 != 0) {
            throw new IllegalStateException("Must have an even length".toString());
        }
        List<String> listChunked = StringsKt___StringsKt.chunked(str, 2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listChunked, 10));
        Iterator<T> it = listChunked.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt.checkRadix(16))));
        }
        return CollectionsKt___CollectionsKt.toByteArray(arrayList);
    }

    @NotNull
    public final byte[] encodeBase64Bytes(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "");
        String json = new GsonBuilder().create().toJson(data);
        Intrinsics.checkNotNullExpressionValue(json, "");
        gzip(json).toString();
        gzip(json);
        return gzip(json);
    }

    @NotNull
    public final String encodeBase64String(@NotNull Object data) {
        Intrinsics.checkNotNullParameter(data, "");
        String json = new GsonBuilder().create().toJson(data);
        Base64.Encoder encoder = Base64.getEncoder();
        Intrinsics.checkNotNullExpressionValue(json, "");
        String strEncodeToString = encoder.encodeToString(gzip(json));
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }

    @NotNull
    public final String encodeBoolArrToHexString(@NotNull boolean[] boolArr) {
        Intrinsics.checkNotNullParameter(boolArr, "");
        return encodeHexString(convertBoolArrayToByteArray(boolArr));
    }

    @NotNull
    public final String encodeHexString(@NotNull byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "");
        return toHex(byteArray);
    }

    @NotNull
    public final String fromByteArray(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "");
        char[] cArr = new char[data.length << 1];
        int length = data.length;
        for (int i10 = 0; i10 < length; i10++) {
            byte b10 = data[i10];
            int i11 = i10 << 1;
            char[] cArr2 = f67778a;
            cArr[i11] = cArr2[b10 >>> 4];
            cArr[i11 + 1] = cArr2[(byte) (b10 & 15)];
        }
        return new String(cArr);
    }

    @NotNull
    public final byte[] gzip(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream, charset), 8192);
        try {
            bufferedWriter.write(content);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(bufferedWriter, null);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "");
            return byteArray;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedWriter, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final byte[] hexString2ByteArray(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArr = new byte[str.length() / 2];
        IntProgression intProgressionStep = c.step(c.until(0, str.length()), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                char cCharAt = str.charAt(first);
                char[] cArr = f67779b;
                bArr[first >> 1] = (byte) ((ArraysKt___ArraysKt.indexOf(cArr, cCharAt) << 4) | ArraysKt___ArraysKt.indexOf(cArr, str.charAt(first + 1)));
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        return bArr;
    }

    @NotNull
    public final byte[] hexStringToByteArray(@NotNull String sParam) {
        Intrinsics.checkNotNullParameter(sParam, "");
        int length = sParam.length();
        if (length % 2 != 0) {
            sParam = "0".concat(sParam);
            length++;
        }
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) (Character.digit(sParam.charAt(i10 + 1), 16) + (Character.digit(sParam.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    @NotNull
    public final byte[] hexStringToByteArrayNeo(@NotNull String s4) {
        Intrinsics.checkNotNullParameter(s4, "");
        return decodeHex(s4);
    }

    @NotNull
    public final String hexToAscii(@NotNull String hexStr) {
        Intrinsics.checkNotNullParameter(hexStr, "");
        StringBuilder sb2 = new StringBuilder("");
        int i10 = 0;
        while (i10 < hexStr.length()) {
            int i11 = i10 + 2;
            String strSubstring = hexStr.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            sb2.append((char) Integer.parseInt(strSubstring, CharsKt.checkRadix(16)));
            i10 = i11;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @NotNull
    public final String intToHexString(int value) {
        String hexString = Integer.toHexString(value);
        if (hexString.length() % 2 != 0) {
            hexString = "0".concat(hexString);
        }
        Intrinsics.checkNotNullExpressionValue(hexString, "");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = hexString.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    public final boolean isEmpty(@Nullable String str) {
        return str == null || str.length() == 0;
    }

    public final boolean isNullOrEmpty(@Nullable String str) {
        return str == null || Intrinsics.areEqual(str, "");
    }

    @NotNull
    public final String leftPad(@NotNull String strParam, int size, @NotNull String padStr) {
        Intrinsics.checkNotNullParameter(strParam, "");
        Intrinsics.checkNotNullParameter(padStr, "");
        int length = size - strParam.length();
        for (int i10 = 0; i10 < length; i10++) {
            strParam = u.f(padStr, strParam);
        }
        return strParam;
    }

    @NotNull
    public final String rightPad(@NotNull String str, int size) {
        Intrinsics.checkNotNullParameter(str, "");
        return rightPad(str, size, ' ');
    }

    @NotNull
    public final byte[] strictStringToBytes(@NotNull String s4, @NotNull Charset charset) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(s4, "");
        Intrinsics.checkNotNullParameter(charset, "");
        ByteBuffer byteBufferEncode = charset.newEncoder().onMalformedInput(CodingErrorAction.REPORT).encode(CharBuffer.wrap(s4));
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    @NotNull
    public final Date stringToDateTime(@Nullable String string) {
        try {
            Date date = new SimpleDateFormat("yyMMddHHmmss", Locale.US).parse(string);
            Intrinsics.checkNotNullExpressionValue(date, "");
            return date;
        } catch (ParseException unused) {
            return new Date();
        }
    }

    @NotNull
    public final String toHex(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append("0123456789ABCDEF".charAt((b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) >>> 4));
            stringBuffer.append("0123456789ABCDEF".charAt(b10 & 15));
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @NotNull
    public final String toHexString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            stringBuffer.append(toHexString(str.charAt(i10)));
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @NotNull
    public final String ungzip(@NotNull byte[] content) {
        Intrinsics.checkNotNullParameter(content, "");
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(content));
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, charset), 8192);
        try {
            String text = TextStreamsKt.readText(bufferedReader);
            CloseableKt.closeFinally(bufferedReader, null);
            return text;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(bufferedReader, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public final String rightPad(@NotNull String str, int size, char padChar) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = size - str.length();
        if (length <= 0) {
            return str;
        }
        if (length > 8192) {
            return rightPad(str, size, String.valueOf(padChar));
        }
        if (length < 0) {
            throw new IndexOutOfBoundsException(g0.c("Cannot pad a negative amount: ", length));
        }
        char[] cArr = new char[length];
        for (int i10 = 0; i10 < length; i10++) {
            cArr[i10] = padChar;
        }
        return str.concat(new String(cArr));
    }

    public final /* synthetic */ <T> T decodeBase64(String data) {
        T next;
        Intrinsics.checkNotNullParameter(data, "");
        byte[] bArrDecode = Base64.getDecoder().decode(data);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        String strUngzip = ungzip(bArrDecode);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Iterator<T> it = Reflection.getOrCreateKotlinClass(Object.class).getConstructors().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((KFunction) next).getParameters().isEmpty());
        KFunction kFunction = (KFunction) next;
        if (kFunction == null) {
            return null;
        }
        R rCall = kFunction.call(new Object[0]);
        Gson gsonCreate = new GsonBuilder().create();
        Intrinsics.checkNotNull(rCall);
        return (T) gsonCreate.fromJson(strUngzip, (Class) rCall.getClass());
    }

    @NotNull
    public final String toHexString(char ch2) {
        String hexString = Integer.toHexString(ch2);
        while (hexString.length() < 4) {
            hexString = "0".concat(hexString);
        }
        String strConcat = "\\u".concat(hexString);
        Intrinsics.checkNotNullExpressionValue(strConcat, "");
        return strConcat;
    }

    @NotNull
    public final String rightPad(@Nullable String str, int size, @NotNull String padStrParam) {
        Intrinsics.checkNotNullParameter(padStrParam, "");
        if (str == null) {
            return "";
        }
        if (isEmpty(padStrParam)) {
            padStrParam = " ";
        }
        int length = padStrParam.length();
        int length2 = size - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return rightPad(str, size, padStrParam.charAt(0));
        }
        if (length2 == length) {
            return str.concat(padStrParam);
        }
        if (length2 < length) {
            String strSubstring = padStrParam.substring(0, length2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return str + strSubstring;
        }
        char[] cArr = new char[length2];
        char[] charArray = padStrParam.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        for (int i10 = 0; i10 < length2; i10++) {
            cArr[i10] = charArray[i10 % length];
        }
        return str.concat(new String(cArr));
    }
}
