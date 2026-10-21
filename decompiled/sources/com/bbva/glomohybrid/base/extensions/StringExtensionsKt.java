package com.bbva.glomohybrid.base.extensions;

import android.util.Base64;
import com.google.gson.Gson;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StringExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u001a.\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\tj\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001`\n*\u00020\u0001\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0001\u001a\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r*\u00020\u0001¢\u0006\u0002\u0010\u000e\u001a\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0001¨\u0006\u0011"}, d2 = {"capitalizeSentence", "", "delimiter", "decodeBase64", "decryptHexKey", "encodeBase64", "flag", "", "jsonStringToHashMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "removeAccents", "splitWithVerticalBarToArray", "", "(Ljava/lang/String;)[Ljava/lang/String;", "toByte", "", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStringExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringExtensions.kt\ncom/bbva/glomohybrid/base/extensions/StringExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,61:1\n766#2:62\n857#2,2:63\n1#3:65\n37#4,2:66\n*S KotlinDebug\n*F\n+ 1 StringExtensions.kt\ncom/bbva/glomohybrid/base/extensions/StringExtensionsKt\n*L\n12#1:62\n12#1:63,2\n53#1:66,2\n*E\n"})
public final class StringExtensionsKt {

    /* JADX INFO: compiled from: StringExtensions.kt */
    public static final class a extends Lambda implements Function1<String, CharSequence> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31308p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String str) {
            String word = str;
            Intrinsics.checkNotNullParameter(word, "word");
            return com.bbva.glomoutils.StringExtensionsKt.capitalizeWord(word);
        }
    }

    @Nullable
    public static final String capitalizeSentence(@Nullable String str, @NotNull String delimiter) {
        List listSplit$default;
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        if (str == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{delimiter}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (!l.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, delimiter, null, null, 0, null, a.f31308p0, 30, null);
    }

    public static /* synthetic */ String capitalizeSentence$default(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = " ";
        }
        return capitalizeSentence(str, str2);
    }

    @NotNull
    public static final String decodeBase64(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArrDecode = Base64.decode(str, 0);
        Intrinsics.checkNotNull(bArrDecode);
        return new String(bArrDecode, Charsets.UTF_8);
    }

    @Nullable
    public static final String decryptHexKey(@NotNull String str) {
        Object objM5535constructorimpl;
        byte[] bArrDecryptByte;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] bArr = toByte(str);
            objM5535constructorimpl = Result.m5535constructorimpl((bArr == null || (bArrDecryptByte = ByteArrayCryptoExtensionKt.decryptByte(bArr)) == null) ? null : new String(bArrDecryptByte, Charsets.UTF_8));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (String) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }

    @NotNull
    public static final String encodeBase64(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = Base64.encodeToString(bytes, i10);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }

    public static /* synthetic */ String encodeBase64$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return encodeBase64(str, i10);
    }

    @Nullable
    public static final HashMap<String, String> jsonStringToHashMap(@NotNull String str) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object objFromJson = new Gson().fromJson(str, (Class<Object>) HashMap.class);
            Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String?>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String?> }");
            objM5535constructorimpl = Result.m5535constructorimpl((HashMap) objFromJson);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (HashMap) objM5535constructorimpl;
    }

    @NotNull
    public static final String removeAccents(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        Intrinsics.checkNotNullExpressionValue(strNormalize, "normalize(...)");
        return new Regex("\\p{InCombiningDiacriticalMarks}+").replace(strNormalize, "");
    }

    @Nullable
    public static final String[] splitWithVerticalBarToArray(@NotNull String str) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl((String[]) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"||"}, false, 0, 6, (Object) null).toArray(new String[0]));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (String[]) objM5535constructorimpl;
    }

    @Nullable
    public static final byte[] toByte(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                String strSubstring = str.substring(i11, i11 + 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                bArr[i10] = (byte) Integer.valueOf(strSubstring, 16).intValue();
            }
            return bArr;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                objM5535constructorimpl = null;
            }
            return (byte[]) objM5535constructorimpl;
        }
    }
}
