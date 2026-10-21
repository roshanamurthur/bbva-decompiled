package com.mypinpad.tsdk.isolation;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class zm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final setY f62409a = new setY();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String[] f62410b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final DateFormat[] f62411c = new DateFormat[15];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f62412d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f62413e;

    public static final class setY extends ThreadLocal<DateFormat> {
        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 253) + (i10 * 253);
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = ~(i14 | i15);
            int i17 = i15 | (~i12);
            int i18 = i16 | (~i17);
            int i19 = i11 | i10;
            int i20 = ~(i12 | i19);
            int i21 = i19 * (-252);
            if ((((~(i10 | i17)) | i20) * 252) + i21 + ((i18 | i20) * (-252)) + i13 == 1) {
                return (DateFormat) setY(new Object[0], -1246484672, 1246484672, (int) System.currentTimeMillis());
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(yt.setCompoundDrawableTintBlendMode);
            return simpleDateFormat;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.text.DateFormat] */
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DateFormat initialValue() {
            return setY(new Object[]{this}, -2114086104, 2114086105, System.identityHashCode(this));
        }
    }

    static {
        int i10 = f62412d;
        int i11 = i10 ^ 85;
        int i12 = ((((i10 & 85) | i11) << 1) - (~(-i11))) - 1;
        f62413e = i12 % 128;
        int i13 = i12 % 2;
    }

    @Nullable
    public static final Date setCompoundDrawableTintBlendMode(@NotNull String str) {
        return (Date) setOnFocusChangeListener(new Object[]{str}, 413331518, -413331518, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = i10 | i11;
        int i14 = (i13 * (-502)) + (i11 * 503) + (i10 * 503);
        int i15 = ~i10;
        int i16 = ~((~i11) | i15);
        int i17 = i15 | (~i12);
        int i18 = i16 | (~i17);
        int i19 = ~(i12 | i13);
        if ((((~(i17 | i11)) | i19) * 502) + ((i18 | i19) * (-502)) + i14 == 1) {
            Date date = (Date) objArr[0];
            int i20 = f62413e;
            int i21 = ((i20 ^ 77) | (i20 & 77)) << 1;
            int i22 = -((i20 & (-78)) | ((~i20) & 77));
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            f62412d = i23 % 128;
            int i24 = i23 % 2;
            Intrinsics.checkNotNullParameter(date, "");
            String str = f62409a.get().format(date);
            Intrinsics.checkNotNullExpressionValue(str, "");
            int i25 = ((i20 & 110) + (i20 | 110)) - 1;
            f62412d = i25 % 128;
            if (i25 % 2 == 0) {
                return str;
            }
            throw null;
        }
        String str2 = (String) objArr[0];
        Intrinsics.checkNotNullParameter(str2, "");
        if (str2.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date2 = f62409a.get().parse(str2, parsePosition);
        if (parsePosition.getIndex() == str2.length()) {
            return date2;
        }
        String[] strArr = f62410b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                int i26 = 0;
                while (i26 < length) {
                    int i27 = i26 & 1;
                    int i28 = ((~i27) & (i26 | 1)) + (i27 << 1);
                    DateFormat[] dateFormatArr = f62411c;
                    DateFormat simpleDateFormat = dateFormatArr[i26];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f62410b[i26], Locale.US);
                        simpleDateFormat.setTimeZone(yt.setCompoundDrawableTintBlendMode);
                        dateFormatArr[i26] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date3 = simpleDateFormat.parse(str2, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date3;
                    }
                    i26 = i28;
                }
                Unit unit = Unit.INSTANCE;
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public static final String setOnFocusChangeListener(@NotNull Date date) {
        return (String) setOnFocusChangeListener(new Object[]{date}, 1853930851, -1853930850, (int) System.currentTimeMillis());
    }
}
