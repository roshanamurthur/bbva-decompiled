package com.mastercard.sonic.model;

import ad.d;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.n1;
import androidx.collection.k;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.contextualdata.ContextualDataConstants;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SonicMerchant.kt */
/* JADX INFO: loaded from: classes10.dex */
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\t\u001a\u00020\u0002HÆ\u0003JJ\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\bR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/mastercard/sonic/model/SonicMerchant;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "()[Ljava/lang/String;", "component5", "merchantName", ContextualDataConstants.CD_COUNTRY_CODE, "city", "merchantCategoryCodes", "merchantId", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Lcom/mastercard/sonic/model/SonicMerchant;", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "p0", "Ljava/lang/String;", "getMerchantName", "()Ljava/lang/String;", "q0", "getCountryCode", "r0", "getCity", "s0", "[Ljava/lang/String;", "getMerchantCategoryCodes", "t0", "getMerchantId", "setMerchantId", "(Ljava/lang/String;)V", "Builder", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SonicMerchant implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SonicMerchant> CREATOR = new Creator();

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String merchantName;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String countryCode;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String city;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String[] merchantCategoryCodes;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String merchantId;

    /* JADX INFO: compiled from: SonicMerchant.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u001b\u0010\t\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\f¨\u0006\u0010"}, d2 = {"Lcom/mastercard/sonic/model/SonicMerchant$Builder;", "", "", "merchantName", "country", ContextualDataConstants.CD_COUNTRY_CODE, "city", "", "merchantCategoryCode", "merchantCategoryCodes", "([Ljava/lang/String;)Lcom/mastercard/sonic/model/SonicMerchant$Builder;", "merchantId", "Lcom/mastercard/sonic/model/SonicMerchant;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSonicMerchant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SonicMerchant.kt\ncom/mastercard/sonic/model/SonicMerchant$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f51515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f51516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f51517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public String[] f51518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public String f51519e;

        @NotNull
        public final SonicMerchant build() {
            String str = this.f51515a;
            if (str != null) {
                Intrinsics.checkNotNull(str);
                if (str.length() > 0) {
                    String str2 = this.f51516b;
                    if (str2 != null) {
                        Intrinsics.checkNotNull(str2);
                        if (str2.length() > 0) {
                            String[] strArr = this.f51518d;
                            if (strArr != null) {
                                Intrinsics.checkNotNull(strArr);
                                if (!(strArr.length == 0)) {
                                    String str3 = this.f51519e;
                                    if (str3 == null || str3 == null || str3.length() == 0) {
                                        Regex regex = new Regex("[^A-Za-z0-9]");
                                        String str4 = this.f51515a;
                                        Intrinsics.checkNotNull(str4);
                                        String lowerCase = regex.replace(str4, "").toLowerCase(Locale.ROOT);
                                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        this.f51519e = lowerCase;
                                    }
                                    String str5 = this.f51515a;
                                    Intrinsics.checkNotNull(str5);
                                    String str6 = this.f51516b;
                                    Intrinsics.checkNotNull(str6);
                                    String str7 = this.f51517c;
                                    String[] strArr2 = this.f51518d;
                                    Intrinsics.checkNotNull(strArr2);
                                    String str8 = this.f51519e;
                                    Intrinsics.checkNotNull(str8);
                                    return new SonicMerchant(str5, str6, str7, strArr2, str8, null);
                                }
                            }
                            throw new IllegalArgumentException("merchantCategoryCode must be initialized".toString());
                        }
                    }
                    throw new IllegalArgumentException("country must be initialized".toString());
                }
            }
            throw new IllegalArgumentException("merchantName must be initialized".toString());
        }

        @NotNull
        public final Builder city(@Nullable String city) {
            this.f51517c = city;
            return this;
        }

        @NotNull
        public final Builder countryCode(@NotNull String country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f51516b = country;
            return this;
        }

        @NotNull
        public final Builder merchantCategoryCodes(@NotNull String[] merchantCategoryCode) {
            Intrinsics.checkNotNullParameter(merchantCategoryCode, "merchantCategoryCode");
            this.f51518d = merchantCategoryCode;
            return this;
        }

        @NotNull
        public final Builder merchantId(@NotNull String merchantId) {
            Intrinsics.checkNotNullParameter(merchantId, "merchantId");
            this.f51519e = merchantId;
            return this;
        }

        @NotNull
        public final Builder merchantName(@NotNull String merchantName) {
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            this.f51515a = merchantName;
            return this;
        }
    }

    /* JADX INFO: compiled from: SonicMerchant.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SonicMerchant> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SonicMerchant createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SonicMerchant(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SonicMerchant[] newArray(int i10) {
            return new SonicMerchant[i10];
        }
    }

    public /* synthetic */ SonicMerchant(String str, String str2, String str3, String[] strArr, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr, str4);
    }

    public static /* synthetic */ SonicMerchant copy$default(SonicMerchant sonicMerchant, String str, String str2, String str3, String[] strArr, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sonicMerchant.merchantName;
        }
        if ((i10 & 2) != 0) {
            str2 = sonicMerchant.countryCode;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = sonicMerchant.city;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            strArr = sonicMerchant.merchantCategoryCodes;
        }
        String[] strArr2 = strArr;
        if ((i10 & 16) != 0) {
            str4 = sonicMerchant.merchantId;
        }
        return sonicMerchant.copy(str, str5, str6, strArr2, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String[] getMerchantCategoryCodes() {
        return this.merchantCategoryCodes;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    public final SonicMerchant copy(@NotNull String merchantName, @NotNull String countryCode, @Nullable String city, @NotNull String[] merchantCategoryCodes, @NotNull String merchantId) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(merchantCategoryCodes, "merchantCategoryCodes");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        return new SonicMerchant(merchantName, countryCode, city, merchantCategoryCodes, merchantId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SonicMerchant)) {
            return false;
        }
        SonicMerchant sonicMerchant = (SonicMerchant) other;
        return Intrinsics.areEqual(this.merchantName, sonicMerchant.merchantName) && Intrinsics.areEqual(this.countryCode, sonicMerchant.countryCode) && Intrinsics.areEqual(this.city, sonicMerchant.city) && Intrinsics.areEqual(this.merchantCategoryCodes, sonicMerchant.merchantCategoryCodes) && Intrinsics.areEqual(this.merchantId, sonicMerchant.merchantId);
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String[] getMerchantCategoryCodes() {
        return this.merchantCategoryCodes;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    public int hashCode() {
        int iC = n1.c(this.countryCode, this.merchantName.hashCode() * 31, 31);
        String str = this.city;
        return this.merchantId.hashCode() + ((((iC + (str == null ? 0 : str.hashCode())) * 31) + Arrays.hashCode(this.merchantCategoryCodes)) * 31);
    }

    public final void setMerchantId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.merchantId = str;
    }

    @NotNull
    public String toString() {
        String string = Arrays.toString(this.merchantCategoryCodes);
        String str = this.merchantId;
        StringBuilder sb2 = new StringBuilder("SonicMerchant(merchantName=");
        sb2.append(this.merchantName);
        sb2.append(", countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", city=");
        k.e(sb2, this.city, ", merchantCategoryCodes=", string, ", merchantId=");
        return d.f(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.merchantName);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.city);
        parcel.writeStringArray(this.merchantCategoryCodes);
        parcel.writeString(this.merchantId);
    }

    public SonicMerchant(String str, String str2, String str3, String[] strArr, String str4) {
        this.merchantName = str;
        this.countryCode = str2;
        this.city = str3;
        this.merchantCategoryCodes = strArr;
        this.merchantId = str4;
    }
}
