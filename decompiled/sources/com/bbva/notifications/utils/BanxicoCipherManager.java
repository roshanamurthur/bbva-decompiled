package com.bbva.notifications.utils;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.a;
import com.bbva.ethermobilesdk.cipher.model.CipherResult;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.cipher.utils.EncodingUtilsKt;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BanxicoCipherManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/bbva/notifications/utils/BanxicoCipherManager;", "", "", "id", "data", "serial", "decryptData", "maks", "pass", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBanxicoCipherManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BanxicoCipherManager.kt\ncom/bbva/notifications/utils/BanxicoCipherManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n12734#2,3:80\n1789#3,3:83\n*S KotlinDebug\n*F\n+ 1 BanxicoCipherManager.kt\ncom/bbva/notifications/utils/BanxicoCipherManager\n*L\n55#1:80,3\n73#1:83,3\n*E\n"})
public final class BanxicoCipherManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f35469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f35470b;

    public BanxicoCipherManager(@NotNull String maks, @NotNull String pass) {
        Intrinsics.checkNotNullParameter(maks, "maks");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.f35469a = maks;
        this.f35470b = pass;
    }

    public static /* synthetic */ String decryptData$default(BanxicoCipherManager banxicoCipherManager, String str, String str2, String str3, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        return banxicoCipherManager.decryptData(str, str2, str3);
    }

    @Nullable
    public final String decryptData(@NotNull String id, @NotNull String data, @NotNull String serial) throws Exception {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(serial, "serial");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String str = this.f35470b;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, str.length() - 1, 2);
        if (progressionLastElement >= 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 2;
                String strSubstring = str.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                String strSubstring2 = this.f35469a.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList2.add(strSubstring2);
                if (i10 == progressionLastElement) {
                    break;
                }
                i10 = i11;
            }
        }
        Iterator<Integer> it = CollectionsKt__CollectionsKt.getIndices(arrayList).iterator();
        String strF = "";
        String strF2 = "";
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            String string = Integer.toString(Integer.parseInt((String) arrayList.get(iNextInt), CharsKt.checkRadix(16)) ^ Integer.parseInt((String) arrayList2.get(iNextInt), CharsKt.checkRadix(16)), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
            strF2 = u.f(strF2, StringsKt__StringsKt.padStart(string, 2, '0'));
        }
        String strB = a.b(id, strF2, serial);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        byte[] bytes = strB.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        for (byte b10 : bArrDigest) {
            String string2 = Integer.toString((b10 & 255) + 256, CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
            String strSubstring3 = string2.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String).substring(startIndex)");
            strF = u.f(strF, strSubstring3);
        }
        String strSubstring4 = strF.substring(0, 32);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring5 = strF.substring(strSubstring4.length(), strSubstring4.length() + 32);
        Intrinsics.checkNotNullExpressionValue(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
        ByteString.Companion companion = ByteString.INSTANCE;
        CipherResult<byte[]> cipherResultDecrypt = new SoftCipher().decrypt(EncodingUtilsKt.base64ToByteArray(data), companion.decodeHex(strSubstring4).toByteArray(), "AES", "AES/CBC/PKCS5Padding", companion.decodeHex(strSubstring5).toByteArray());
        if (cipherResultDecrypt instanceof CipherResult.Success) {
            Object value = ((CipherResult.Success) cipherResultDecrypt).getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            return new String((byte[]) value, Charsets.UTF_8);
        }
        if (cipherResultDecrypt instanceof CipherResult.Error) {
            throw ((CipherResult.Error) cipherResultDecrypt).getException();
        }
        throw new NoWhenBranchMatchedException();
    }
}
