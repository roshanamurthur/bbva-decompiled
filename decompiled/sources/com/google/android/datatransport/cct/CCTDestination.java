package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public final class CCTDestination implements EncodedDestination {
    public static final CCTDestination INSTANCE;
    public static final CCTDestination LEGACY_INSTANCE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f43570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set<Encoding> f43571d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final String f43572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f43573b;

    static {
        String strA = StringMerger.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f43570c = strA;
        String strA2 = StringMerger.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strA3 = StringMerger.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f43571d = Collections.unmodifiableSet(new HashSet(Arrays.asList(Encoding.of("proto"), Encoding.of("json"))));
        INSTANCE = new CCTDestination(strA, null);
        LEGACY_INSTANCE = new CCTDestination(strA2, strA3);
    }

    public CCTDestination(@NonNull String str, @Nullable String str2) {
        this.f43572a = str;
        this.f43573b = str2;
    }

    @NonNull
    public static CCTDestination fromByteArray(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new CCTDestination(str2, str3);
    }

    @Nullable
    public byte[] asByteArray() {
        String str = this.f43572a;
        String str2 = this.f43573b;
        if (str2 == null && str == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = str;
        objArr[2] = "\\";
        if (str2 == null) {
            str2 = "";
        }
        objArr[3] = str2;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    @Nullable
    public String getAPIKey() {
        return this.f43573b;
    }

    @NonNull
    public String getEndPoint() {
        return this.f43572a;
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @Nullable
    public byte[] getExtras() {
        return asByteArray();
    }

    @Override // com.google.android.datatransport.runtime.Destination
    @NonNull
    public String getName() {
        return "cct";
    }

    @Override // com.google.android.datatransport.runtime.EncodedDestination
    public Set<Encoding> getSupportedEncodings() {
        return f43571d;
    }
}
