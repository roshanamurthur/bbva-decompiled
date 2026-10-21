package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.WorkerThread;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.k;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public interface AFc1uSDK {
    @WorkerThread
    void valueOf(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i10);

    public static final class AFa1wSDK {
        public final String AFInAppEventParameterName;
        public final Boolean AFInAppEventType;
        public Boolean values;

        public AFa1wSDK() {
        }

        public AFa1wSDK(String str, Boolean bool) {
            this.AFInAppEventParameterName = str;
            this.AFInAppEventType = bool;
        }

        @NotNull
        public static String AFInAppEventType(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String strEncodeToString = Base64.encodeToString(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            return strEncodeToString;
        }

        public static double AFKeystoreWrapper(String str) throws ParseException {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                return Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                Number number = NumberFormat.getInstance(Locale.getDefault()).parse(str);
                if (number != null) {
                    return number.doubleValue();
                }
                throw new ParseException("Failed parse String into number", 0);
            }
        }

        @NotNull
        public static JSONArray valueOf(List<AFb1aSDK> list) {
            Intrinsics.checkNotNullParameter(list, "");
            List<AFb1aSDK> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AFb1aSDK) it.next()).valueOf());
            }
            return new JSONArray((Collection) arrayList);
        }

        @NotNull
        public static String values(String str) throws NoSuchAlgorithmException {
            Intrinsics.checkNotNullParameter(str, "");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
            String string = "";
            for (byte b10 : bArrDigest) {
                StringBuilder sbD = androidx.camera.core.impl.utils.c.d(string);
                String str2 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "");
                sbD.append(str2);
                string = sbD.toString();
            }
            return string;
        }

        public static boolean AFKeystoreWrapper(HttpURLConnection httpURLConnection) {
            Intrinsics.checkNotNullParameter(httpURLConnection, "");
            return httpURLConnection.getResponseCode() / 100 == 2;
        }

        public static int valueOf(String str) {
            String value;
            Integer intOrNull;
            String value2;
            Integer intOrNull2;
            String value3;
            Integer intOrNull3;
            Intrinsics.checkNotNullParameter(str, "");
            MatchResult matchResultMatchEntire = new Regex("(\\d+).?(\\d+)?.?(\\d+)?(-rc\\d+)?(_.*)?").matchEntire(str);
            if (matchResultMatchEntire == null) {
                return -1;
            }
            MatchGroup matchGroup = matchResultMatchEntire.getGroups().get(1);
            int iIntValue = 0;
            int iIntValue2 = ((matchGroup == null || (value3 = matchGroup.getValue()) == null || (intOrNull3 = k.toIntOrNull(value3)) == null) ? 0 : intOrNull3.intValue()) * DurationKt.NANOS_IN_MILLIS;
            MatchGroup matchGroup2 = matchResultMatchEntire.getGroups().get(2);
            int iIntValue3 = (((matchGroup2 == null || (value2 = matchGroup2.getValue()) == null || (intOrNull2 = k.toIntOrNull(value2)) == null) ? 0 : intOrNull2.intValue()) * 1000) + iIntValue2;
            MatchGroup matchGroup3 = matchResultMatchEntire.getGroups().get(3);
            if (matchGroup3 != null && (value = matchGroup3.getValue()) != null && (intOrNull = k.toIntOrNull(value)) != null) {
                iIntValue = intOrNull.intValue();
            }
            return iIntValue3 + iIntValue;
        }
    }
}
