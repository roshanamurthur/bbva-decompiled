package com.google.mlkit.vision.barcode.common;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
/* JADX INFO: loaded from: classes10.dex */
public class Barcode {
    public static final int FORMAT_ALL_FORMATS = 0;
    public static final int FORMAT_AZTEC = 4096;
    public static final int FORMAT_CODABAR = 8;
    public static final int FORMAT_CODE_128 = 1;
    public static final int FORMAT_CODE_39 = 2;
    public static final int FORMAT_CODE_93 = 4;
    public static final int FORMAT_DATA_MATRIX = 16;
    public static final int FORMAT_EAN_13 = 32;
    public static final int FORMAT_EAN_8 = 64;
    public static final int FORMAT_ITF = 128;
    public static final int FORMAT_PDF417 = 2048;
    public static final int FORMAT_QR_CODE = 256;
    public static final int FORMAT_UNKNOWN = -1;
    public static final int FORMAT_UPC_A = 512;
    public static final int FORMAT_UPC_E = 1024;
    public static final int TYPE_CALENDAR_EVENT = 11;
    public static final int TYPE_CONTACT_INFO = 1;
    public static final int TYPE_DRIVER_LICENSE = 12;
    public static final int TYPE_EMAIL = 2;
    public static final int TYPE_GEO = 10;
    public static final int TYPE_ISBN = 3;
    public static final int TYPE_PHONE = 4;
    public static final int TYPE_PRODUCT = 5;
    public static final int TYPE_SMS = 6;
    public static final int TYPE_TEXT = 7;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_URL = 8;
    public static final int TYPE_WIFI = 9;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeSource f49494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Rect f49495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Point[] f49496c;

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class Address {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f49498b;

        /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
        @Retention(RetentionPolicy.CLASS)
        public @interface AddressType {
        }

        @KeepForSdk
        public Address(int i10, @NonNull String[] strArr) {
            this.f49497a = i10;
            this.f49498b = strArr;
        }

        @NonNull
        public String[] getAddressLines() {
            return this.f49498b;
        }

        @AddressType
        public int getType() {
            return this.f49497a;
        }
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface BarcodeFormat {
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface BarcodeValueType {
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class CalendarDateTime {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f49502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f49503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f49504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f49505g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final String f49506h;

        @KeepForSdk
        public CalendarDateTime(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, @Nullable String str) {
            this.f49499a = i10;
            this.f49500b = i11;
            this.f49501c = i12;
            this.f49502d = i13;
            this.f49503e = i14;
            this.f49504f = i15;
            this.f49505g = z10;
            this.f49506h = str;
        }

        public int getDay() {
            return this.f49501c;
        }

        public int getHours() {
            return this.f49502d;
        }

        public int getMinutes() {
            return this.f49503e;
        }

        public int getMonth() {
            return this.f49500b;
        }

        @Nullable
        public String getRawValue() {
            return this.f49506h;
        }

        public int getSeconds() {
            return this.f49504f;
        }

        public int getYear() {
            return this.f49499a;
        }

        public boolean isUtc() {
            return this.f49505g;
        }
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class CalendarEvent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f49507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f49508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f49509c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f49510d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f49511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final CalendarDateTime f49512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final CalendarDateTime f49513g;

        @KeepForSdk
        public CalendarEvent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable CalendarDateTime calendarDateTime, @Nullable CalendarDateTime calendarDateTime2) {
            this.f49507a = str;
            this.f49508b = str2;
            this.f49509c = str3;
            this.f49510d = str4;
            this.f49511e = str5;
            this.f49512f = calendarDateTime;
            this.f49513g = calendarDateTime2;
        }

        @Nullable
        public String getDescription() {
            return this.f49508b;
        }

        @Nullable
        public CalendarDateTime getEnd() {
            return this.f49513g;
        }

        @Nullable
        public String getLocation() {
            return this.f49509c;
        }

        @Nullable
        public String getOrganizer() {
            return this.f49510d;
        }

        @Nullable
        public CalendarDateTime getStart() {
            return this.f49512f;
        }

        @Nullable
        public String getStatus() {
            return this.f49511e;
        }

        @Nullable
        public String getSummary() {
            return this.f49507a;
        }
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class ContactInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final PersonName f49514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f49515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f49516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f49517d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f49518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f49519f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f49520g;

        @KeepForSdk
        public ContactInfo(@Nullable PersonName personName, @Nullable String str, @Nullable String str2, @NonNull List<Phone> list, @NonNull List<Email> list2, @NonNull List<String> list3, @NonNull List<Address> list4) {
            this.f49514a = personName;
            this.f49515b = str;
            this.f49516c = str2;
            this.f49517d = list;
            this.f49518e = list2;
            this.f49519f = list3;
            this.f49520g = list4;
        }

        @NonNull
        public List<Address> getAddresses() {
            return this.f49520g;
        }

        @NonNull
        public List<Email> getEmails() {
            return this.f49518e;
        }

        @Nullable
        public PersonName getName() {
            return this.f49514a;
        }

        @Nullable
        public String getOrganization() {
            return this.f49515b;
        }

        @NonNull
        public List<Phone> getPhones() {
            return this.f49517d;
        }

        @Nullable
        public String getTitle() {
            return this.f49516c;
        }

        @NonNull
        public List<String> getUrls() {
            return this.f49519f;
        }
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class DriverLicense {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f49521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f49522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f49523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f49524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f49525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f49526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f49527g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public final String f49528h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public final String f49529i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final String f49530j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final String f49531k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @Nullable
        public final String f49532l;

        @Nullable
        public final String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public final String f49533n;

        @KeepForSdk
        public DriverLicense(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
            this.f49521a = str;
            this.f49522b = str2;
            this.f49523c = str3;
            this.f49524d = str4;
            this.f49525e = str5;
            this.f49526f = str6;
            this.f49527g = str7;
            this.f49528h = str8;
            this.f49529i = str9;
            this.f49530j = str10;
            this.f49531k = str11;
            this.f49532l = str12;
            this.m = str13;
            this.f49533n = str14;
        }

        @Nullable
        public String getAddressCity() {
            return this.f49527g;
        }

        @Nullable
        public String getAddressState() {
            return this.f49528h;
        }

        @Nullable
        public String getAddressStreet() {
            return this.f49526f;
        }

        @Nullable
        public String getAddressZip() {
            return this.f49529i;
        }

        @Nullable
        public String getBirthDate() {
            return this.m;
        }

        @Nullable
        public String getDocumentType() {
            return this.f49521a;
        }

        @Nullable
        public String getExpiryDate() {
            return this.f49532l;
        }

        @Nullable
        public String getFirstName() {
            return this.f49522b;
        }

        @Nullable
        public String getGender() {
            return this.f49525e;
        }

        @Nullable
        public String getIssueDate() {
            return this.f49531k;
        }

        @Nullable
        public String getIssuingCountry() {
            return this.f49533n;
        }

        @Nullable
        public String getLastName() {
            return this.f49524d;
        }

        @Nullable
        public String getLicenseNumber() {
            return this.f49530j;
        }

        @Nullable
        public String getMiddleName() {
            return this.f49523c;
        }
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class Email {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f49535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f49536c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f49537d;

        /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
        @Retention(RetentionPolicy.CLASS)
        public @interface FormatType {
        }

        @KeepForSdk
        public Email(int i10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f49534a = i10;
            this.f49535b = str;
            this.f49536c = str2;
            this.f49537d = str3;
        }

        @Nullable
        public String getAddress() {
            return this.f49535b;
        }

        @Nullable
        public String getBody() {
            return this.f49537d;
        }

        @Nullable
        public String getSubject() {
            return this.f49536c;
        }

        @FormatType
        public int getType() {
            return this.f49534a;
        }
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class GeoPoint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f49538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f49539b;

        @KeepForSdk
        public GeoPoint(double d2, double d3) {
            this.f49538a = d2;
            this.f49539b = d3;
        }

        public double getLat() {
            return this.f49538a;
        }

        public double getLng() {
            return this.f49539b;
        }
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class PersonName {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f49540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f49541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f49542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f49543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f49544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f49545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f49546g;

        @KeepForSdk
        public PersonName(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            this.f49540a = str;
            this.f49541b = str2;
            this.f49542c = str3;
            this.f49543d = str4;
            this.f49544e = str5;
            this.f49545f = str6;
            this.f49546g = str7;
        }

        @Nullable
        public String getFirst() {
            return this.f49543d;
        }

        @Nullable
        public String getFormattedName() {
            return this.f49540a;
        }

        @Nullable
        public String getLast() {
            return this.f49545f;
        }

        @Nullable
        public String getMiddle() {
            return this.f49544e;
        }

        @Nullable
        public String getPrefix() {
            return this.f49542c;
        }

        @Nullable
        public String getPronunciation() {
            return this.f49541b;
        }

        @Nullable
        public String getSuffix() {
            return this.f49546g;
        }
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class Phone {
        public static final int TYPE_FAX = 3;
        public static final int TYPE_HOME = 2;
        public static final int TYPE_MOBILE = 4;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f49547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49548b;

        /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
        @Retention(RetentionPolicy.CLASS)
        public @interface FormatType {
        }

        @KeepForSdk
        public Phone(@Nullable String str, int i10) {
            this.f49547a = str;
            this.f49548b = i10;
        }

        @Nullable
        public String getNumber() {
            return this.f49547a;
        }

        @FormatType
        public int getType() {
            return this.f49548b;
        }
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class Sms {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f49549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f49550b;

        @KeepForSdk
        public Sms(@Nullable String str, @Nullable String str2) {
            this.f49549a = str;
            this.f49550b = str2;
        }

        @Nullable
        public String getMessage() {
            return this.f49549a;
        }

        @Nullable
        public String getPhoneNumber() {
            return this.f49550b;
        }
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class UrlBookmark {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f49551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f49552b;

        @KeepForSdk
        public UrlBookmark(@Nullable String str, @Nullable String str2) {
            this.f49551a = str;
            this.f49552b = str2;
        }

        @Nullable
        public String getTitle() {
            return this.f49551a;
        }

        @Nullable
        public String getUrl() {
            return this.f49552b;
        }
    }

    /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
    public static class WiFi {
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_WEP = 3;
        public static final int TYPE_WPA = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f49553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f49554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f49555c;

        /* JADX INFO: compiled from: com.google.mlkit:barcode-scanning-common@@17.0.0 */
        @Retention(RetentionPolicy.CLASS)
        public @interface EncryptionType {
        }

        @KeepForSdk
        public WiFi(@Nullable String str, @Nullable String str2, int i10) {
            this.f49553a = str;
            this.f49554b = str2;
            this.f49555c = i10;
        }

        @EncryptionType
        public int getEncryptionType() {
            return this.f49555c;
        }

        @Nullable
        public String getPassword() {
            return this.f49554b;
        }

        @Nullable
        public String getSsid() {
            return this.f49553a;
        }
    }

    @KeepForSdk
    public Barcode(@NonNull BarcodeSource barcodeSource) {
        this(barcodeSource, null);
    }

    @Nullable
    public Rect getBoundingBox() {
        return this.f49495b;
    }

    @Nullable
    public CalendarEvent getCalendarEvent() {
        return this.f49494a.getCalendarEvent();
    }

    @Nullable
    public ContactInfo getContactInfo() {
        return this.f49494a.getContactInfo();
    }

    @Nullable
    public Point[] getCornerPoints() {
        return this.f49496c;
    }

    @Nullable
    public String getDisplayValue() {
        return this.f49494a.getDisplayValue();
    }

    @Nullable
    public DriverLicense getDriverLicense() {
        return this.f49494a.getDriverLicense();
    }

    @Nullable
    public Email getEmail() {
        return this.f49494a.getEmail();
    }

    @BarcodeFormat
    public int getFormat() {
        int format = this.f49494a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    @Nullable
    public GeoPoint getGeoPoint() {
        return this.f49494a.getGeoPoint();
    }

    @Nullable
    public Phone getPhone() {
        return this.f49494a.getPhone();
    }

    @Nullable
    public byte[] getRawBytes() {
        byte[] rawBytes = this.f49494a.getRawBytes();
        if (rawBytes != null) {
            return Arrays.copyOf(rawBytes, rawBytes.length);
        }
        return null;
    }

    @Nullable
    public String getRawValue() {
        return this.f49494a.getRawValue();
    }

    @Nullable
    public Sms getSms() {
        return this.f49494a.getSms();
    }

    @Nullable
    public UrlBookmark getUrl() {
        return this.f49494a.getUrl();
    }

    @BarcodeValueType
    public int getValueType() {
        return this.f49494a.getValueType();
    }

    @Nullable
    public WiFi getWifi() {
        return this.f49494a.getWifi();
    }

    @KeepForSdk
    public Barcode(@NonNull BarcodeSource barcodeSource, @Nullable Matrix matrix) {
        this.f49494a = (BarcodeSource) Preconditions.checkNotNull(barcodeSource);
        Rect boundingBox = barcodeSource.getBoundingBox();
        if (boundingBox != null && matrix != null) {
            CommonConvertUtils.transformRect(boundingBox, matrix);
        }
        this.f49495b = boundingBox;
        Point[] cornerPoints = barcodeSource.getCornerPoints();
        if (cornerPoints != null && matrix != null) {
            CommonConvertUtils.transformPointArray(cornerPoints, matrix);
        }
        this.f49496c = cornerPoints;
    }
}
