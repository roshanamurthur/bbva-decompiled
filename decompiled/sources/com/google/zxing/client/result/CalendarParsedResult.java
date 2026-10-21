package com.google.zxing.client.result;

import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class CalendarParsedResult extends ParsedResult {
    public static final Pattern m = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long[] f49717n = {604800000, 86400000, 3600000, 60000, 1000};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f49718o = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f49720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f49721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f49722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f49723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f49724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f49725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String[] f49726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f49727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final double f49728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final double f49729l;

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public CalendarParsedResult(String str, String str2, String str3, String str4, String str5, String str6, String[] strArr, String str7, double d2, double d3) {
        long j10;
        super(ParsedResultType.CALENDAR);
        this.f49719b = str;
        try {
            this.f49720c = a(str2);
            boolean z10 = false;
            if (str3 == null) {
                if (str4 != null) {
                    Matcher matcher = m.matcher(str4);
                    if (matcher.matches()) {
                        int i10 = 0;
                        j10 = 0;
                        while (true) {
                            long[] jArr = f49717n;
                            if (i10 >= jArr.length) {
                                break;
                            }
                            int i11 = i10 + 1;
                            String strGroup = matcher.group(i11);
                            if (strGroup != null) {
                                j10 += jArr[i10] * ((long) Integer.parseInt(strGroup));
                            }
                            i10 = i11;
                        }
                    } else {
                        j10 = -1;
                    }
                } else {
                    j10 = -1;
                }
                this.f49722e = j10 < 0 ? -1L : this.f49720c + j10;
            } else {
                try {
                    this.f49722e = a(str3);
                } catch (ParseException e5) {
                    throw new IllegalArgumentException(e5.toString());
                }
            }
            this.f49721d = str2.length() == 8;
            if (str3 != null && str3.length() == 8) {
                z10 = true;
            }
            this.f49723f = z10;
            this.f49724g = str5;
            this.f49725h = str6;
            this.f49726i = strArr;
            this.f49727j = str7;
            this.f49728k = d2;
            this.f49729l = d3;
        } catch (ParseException e7) {
            throw new IllegalArgumentException(e7.toString());
        }
    }

    public static long a(String str) throws ParseException {
        if (!f49718o.matcher(str).matches()) {
            throw new ParseException(str, 0);
        }
        if (str.length() == 8) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(Time.GMT));
            return simpleDateFormat.parse(str).getTime();
        }
        if (str.length() != 16 || str.charAt(15) != 'Z') {
            return new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH).parse(str).getTime();
        }
        long time = new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH).parse(str.substring(0, 15)).getTime();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        long j10 = time + ((long) gregorianCalendar.get(15));
        gregorianCalendar.setTime(new Date(j10));
        return j10 + ((long) gregorianCalendar.get(16));
    }

    public String[] getAttendees() {
        return this.f49726i;
    }

    public String getDescription() {
        return this.f49727j;
    }

    @Override // com.google.zxing.client.result.ParsedResult
    public String getDisplayResult() {
        String str;
        StringBuilder sb2 = new StringBuilder(100);
        ParsedResult.maybeAppend(this.f49719b, sb2);
        long j10 = this.f49720c;
        String str2 = null;
        if (j10 < 0) {
            str = null;
        } else {
            str = (this.f49721d ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(Long.valueOf(j10));
        }
        ParsedResult.maybeAppend(str, sb2);
        long j11 = this.f49722e;
        if (j11 >= 0) {
            str2 = (this.f49723f ? DateFormat.getDateInstance(2) : DateFormat.getDateTimeInstance(2, 2)).format(Long.valueOf(j11));
        }
        ParsedResult.maybeAppend(str2, sb2);
        ParsedResult.maybeAppend(this.f49724g, sb2);
        ParsedResult.maybeAppend(this.f49725h, sb2);
        ParsedResult.maybeAppend(this.f49726i, sb2);
        ParsedResult.maybeAppend(this.f49727j, sb2);
        return sb2.toString();
    }

    @Deprecated
    public Date getEnd() {
        long j10 = this.f49722e;
        if (j10 < 0) {
            return null;
        }
        return new Date(j10);
    }

    public long getEndTimestamp() {
        return this.f49722e;
    }

    public double getLatitude() {
        return this.f49728k;
    }

    public String getLocation() {
        return this.f49724g;
    }

    public double getLongitude() {
        return this.f49729l;
    }

    public String getOrganizer() {
        return this.f49725h;
    }

    @Deprecated
    public Date getStart() {
        return new Date(this.f49720c);
    }

    public long getStartTimestamp() {
        return this.f49720c;
    }

    public String getSummary() {
        return this.f49719b;
    }

    public boolean isEndAllDay() {
        return this.f49723f;
    }

    public boolean isStartAllDay() {
        return this.f49721d;
    }
}
