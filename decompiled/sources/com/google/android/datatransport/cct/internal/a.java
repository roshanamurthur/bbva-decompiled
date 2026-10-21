package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: AutoValue_AndroidClientInfo.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a extends AndroidClientInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f43610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f43613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f43614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f43615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f43616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f43617h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f43618i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f43619j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f43620k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f43621l;

    /* JADX INFO: renamed from: com.google.android.datatransport.cct.internal.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoValue_AndroidClientInfo.java */
    public static final class C0194a extends AndroidClientInfo.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f43622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f43623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f43624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f43625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f43626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f43627f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f43628g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f43629h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f43630i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f43631j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f43632k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f43633l;

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo build() {
            return new a(this.f43622a, this.f43623b, this.f43624c, this.f43625d, this.f43626e, this.f43627f, this.f43628g, this.f43629h, this.f43630i, this.f43631j, this.f43632k, this.f43633l);
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setApplicationBuild(@Nullable String str) {
            this.f43633l = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setCountry(@Nullable String str) {
            this.f43631j = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setDevice(@Nullable String str) {
            this.f43625d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setFingerprint(@Nullable String str) {
            this.f43629h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setHardware(@Nullable String str) {
            this.f43624c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setLocale(@Nullable String str) {
            this.f43630i = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setManufacturer(@Nullable String str) {
            this.f43628g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setMccMnc(@Nullable String str) {
            this.f43632k = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setModel(@Nullable String str) {
            this.f43623b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setOsBuild(@Nullable String str) {
            this.f43627f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setProduct(@Nullable String str) {
            this.f43626e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo.Builder
        public final AndroidClientInfo.Builder setSdkVersion(@Nullable Integer num) {
            this.f43622a = num;
            return this;
        }
    }

    public a(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f43610a = num;
        this.f43611b = str;
        this.f43612c = str2;
        this.f43613d = str3;
        this.f43614e = str4;
        this.f43615f = str5;
        this.f43616g = str6;
        this.f43617h = str7;
        this.f43618i = str8;
        this.f43619j = str9;
        this.f43620k = str10;
        this.f43621l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidClientInfo)) {
            return false;
        }
        AndroidClientInfo androidClientInfo = (AndroidClientInfo) obj;
        Integer num = this.f43610a;
        if (num != null ? num.equals(androidClientInfo.getSdkVersion()) : androidClientInfo.getSdkVersion() == null) {
            String str = this.f43611b;
            if (str != null ? str.equals(androidClientInfo.getModel()) : androidClientInfo.getModel() == null) {
                String str2 = this.f43612c;
                if (str2 != null ? str2.equals(androidClientInfo.getHardware()) : androidClientInfo.getHardware() == null) {
                    String str3 = this.f43613d;
                    if (str3 != null ? str3.equals(androidClientInfo.getDevice()) : androidClientInfo.getDevice() == null) {
                        String str4 = this.f43614e;
                        if (str4 != null ? str4.equals(androidClientInfo.getProduct()) : androidClientInfo.getProduct() == null) {
                            String str5 = this.f43615f;
                            if (str5 != null ? str5.equals(androidClientInfo.getOsBuild()) : androidClientInfo.getOsBuild() == null) {
                                String str6 = this.f43616g;
                                if (str6 != null ? str6.equals(androidClientInfo.getManufacturer()) : androidClientInfo.getManufacturer() == null) {
                                    String str7 = this.f43617h;
                                    if (str7 != null ? str7.equals(androidClientInfo.getFingerprint()) : androidClientInfo.getFingerprint() == null) {
                                        String str8 = this.f43618i;
                                        if (str8 != null ? str8.equals(androidClientInfo.getLocale()) : androidClientInfo.getLocale() == null) {
                                            String str9 = this.f43619j;
                                            if (str9 != null ? str9.equals(androidClientInfo.getCountry()) : androidClientInfo.getCountry() == null) {
                                                String str10 = this.f43620k;
                                                if (str10 != null ? str10.equals(androidClientInfo.getMccMnc()) : androidClientInfo.getMccMnc() == null) {
                                                    String str11 = this.f43621l;
                                                    if (str11 == null) {
                                                        if (androidClientInfo.getApplicationBuild() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(androidClientInfo.getApplicationBuild())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final String getApplicationBuild() {
        return this.f43621l;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final String getCountry() {
        return this.f43619j;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final String getDevice() {
        return this.f43613d;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final String getFingerprint() {
        return this.f43617h;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final String getHardware() {
        return this.f43612c;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final String getLocale() {
        return this.f43618i;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final String getManufacturer() {
        return this.f43616g;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final String getMccMnc() {
        return this.f43620k;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final String getModel() {
        return this.f43611b;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final String getOsBuild() {
        return this.f43615f;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final String getProduct() {
        return this.f43614e;
    }

    @Override // com.google.android.datatransport.cct.internal.AndroidClientInfo
    @Nullable
    public final Integer getSdkVersion() {
        return this.f43610a;
    }

    public final int hashCode() {
        Integer num = this.f43610a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f43611b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f43612c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f43613d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f43614e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f43615f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f43616g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f43617h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f43618i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f43619j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f43620k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f43621l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f43610a);
        sb2.append(", model=");
        sb2.append(this.f43611b);
        sb2.append(", hardware=");
        sb2.append(this.f43612c);
        sb2.append(", device=");
        sb2.append(this.f43613d);
        sb2.append(", product=");
        sb2.append(this.f43614e);
        sb2.append(", osBuild=");
        sb2.append(this.f43615f);
        sb2.append(", manufacturer=");
        sb2.append(this.f43616g);
        sb2.append(", fingerprint=");
        sb2.append(this.f43617h);
        sb2.append(", locale=");
        sb2.append(this.f43618i);
        sb2.append(", country=");
        sb2.append(this.f43619j);
        sb2.append(", mccMnc=");
        sb2.append(this.f43620k);
        sb2.append(", applicationBuild=");
        return ad.d.f(sb2, this.f43621l, "}");
    }
}
