package com.nimbusds.jose.util;

import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
@Deprecated
public class DateUtils {
    public static Date fromSecondsSinceEpoch(long j10) {
        return new Date(j10 * 1000);
    }

    public static boolean isAfter(Date date, Date date2, long j10) {
        return new Date((j10 * 1000) + date.getTime()).after(date2);
    }

    public static boolean isBefore(Date date, Date date2, long j10) {
        return new Date(date.getTime() - (j10 * 1000)).before(date2);
    }

    public static long toSecondsSinceEpoch(Date date) {
        return date.getTime() / 1000;
    }
}
