package com.salesforce.marketingcloud.messages;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.f;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.storage.k;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f64573a = d.C;

    private b() {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    public static void a(Message message, j jVar) throws Exception {
        TimeUnit timeUnit;
        int actualMaximum;
        long j10;
        long millis;
        Calendar calendar;
        int iPeriodType;
        Date date = new Date();
        f.a(message, date);
        f.c(message, f.e(message) + 1);
        int iB = b(message);
        if (iB > -1 && message.numberOfPeriods() > -1 && message.periodType() != 0) {
            f.b(message, f.d(message) + 1);
            if (f.d(message) >= message.messagesPerPeriod()) {
                int iPeriodType2 = message.periodType();
                if (iPeriodType2 != 1) {
                    if (iPeriodType2 != 2) {
                        if (iPeriodType2 != 3) {
                            j10 = 1;
                            if (iPeriodType2 == 4) {
                                timeUnit = TimeUnit.DAYS;
                            } else if (iPeriodType2 != 5) {
                                millis = 0;
                            } else {
                                timeUnit = TimeUnit.HOURS;
                            }
                        } else {
                            timeUnit = TimeUnit.DAYS;
                            j10 = 7;
                        }
                        millis = timeUnit.toMillis(j10);
                    } else {
                        timeUnit = TimeUnit.DAYS;
                        actualMaximum = Calendar.getInstance().getActualMaximum(5);
                    }
                    f.b(message, new Date((((long) message.numberOfPeriods()) * millis) + date.getTime()));
                    if (!message.isRollingPeriod()) {
                        calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(f.b(message).getTime());
                        calendar.set(14, 0);
                        calendar.set(13, 0);
                        iPeriodType = message.periodType();
                        if (iPeriodType != 1) {
                            if (iPeriodType != 2) {
                                if (iPeriodType != 3) {
                                    if (iPeriodType != 4) {
                                        if (iPeriodType == 5) {
                                        }
                                        f.b(message, calendar.getTime());
                                    }
                                    calendar.set(12, 0);
                                    f.b(message, calendar.getTime());
                                } else {
                                    calendar.set(7, 1);
                                }
                            }
                            calendar.set(10, 0);
                            calendar.set(12, 0);
                            f.b(message, calendar.getTime());
                        } else {
                            calendar.set(2, 0);
                        }
                        calendar.set(5, 1);
                        calendar.set(10, 0);
                        calendar.set(12, 0);
                        f.b(message, calendar.getTime());
                    }
                } else {
                    timeUnit = TimeUnit.DAYS;
                    actualMaximum = Calendar.getInstance().getActualMaximum(6);
                }
                j10 = actualMaximum;
                millis = timeUnit.toMillis(j10);
                f.b(message, new Date((((long) message.numberOfPeriods()) * millis) + date.getTime()));
                if (!message.isRollingPeriod()) {
                    calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(f.b(message).getTime());
                    calendar.set(14, 0);
                    calendar.set(13, 0);
                    iPeriodType = message.periodType();
                    if (iPeriodType != 1) {
                        if (iPeriodType != 2) {
                            if (iPeriodType != 3) {
                                if (iPeriodType != 4) {
                                    if (iPeriodType == 5) {
                                    }
                                    f.b(message, calendar.getTime());
                                }
                                calendar.set(12, 0);
                                f.b(message, calendar.getTime());
                            } else {
                                calendar.set(7, 1);
                            }
                        }
                        calendar.set(10, 0);
                        calendar.set(12, 0);
                        f.b(message, calendar.getTime());
                    } else {
                        calendar.set(2, 0);
                    }
                    calendar.set(5, 1);
                    calendar.set(10, 0);
                    calendar.set(12, 0);
                    f.b(message, calendar.getTime());
                }
            }
        }
        if (f.d(message) > -1 && iB > -1 && f.d(message) > iB) {
            f.b(message, 0);
        }
        jVar.s().a(message, jVar.b());
    }

    private static int b(Message message) {
        int iMessagesPerPeriod = message.messagesPerPeriod();
        if (iMessagesPerPeriod > 0 || message.numberOfPeriods() <= 0 || message.periodType() == 0) {
            return iMessagesPerPeriod;
        }
        return 1;
    }

    public static boolean c(Message message) {
        try {
            if (TextUtils.isEmpty(message.alert().trim())) {
                g.a(f64573a, "Message (%s) was tripped, but does not have an alert message", message.id());
                return false;
            }
            Date date = new Date();
            if (message.endDateUtc() != null && message.endDateUtc().before(date)) {
                g.a(f64573a, "Message (%s) was tripped, but has expired.", message.id());
                return false;
            }
            if (message.startDateUtc() != null && message.startDateUtc().after(date)) {
                g.a(f64573a, "Message (%s) was tripped, but has not started", message.id());
                return false;
            }
            if (message.messageLimit() > -1 && f.e(message) >= message.messageLimit()) {
                g.a(f64573a, "Message (%s) was tripped, but has met its message limit.", message.id());
                return false;
            }
            int iB = b(message);
            if (iB > -1 && f.d(message) >= iB && f.b(message) != null && date.before(f.b(message))) {
                g.a(f64573a, "Message (%s) was tripped, but has met its message per period limit", message.id());
                return false;
            }
            if (f.b(message) == null || !date.before(f.b(message))) {
                return true;
            }
            g.a(f64573a, "Message (%s) was tripped, but was before its next allowed show time.", message.id());
            return false;
        } catch (Exception e5) {
            g.b(f64573a, e5, "Failed to determine is message should be shown.", new Object[0]);
            return false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void a(Message message, k kVar, com.salesforce.marketingcloud.util.c cVar) {
        Message messageA = kVar.a(message.id(), cVar);
        if (messageA != null) {
            f.a(message, f.a(messageA));
            f.c(message, f.e(messageA));
            if (message.periodType() == messageA.periodType()) {
                f.b(message, f.d(messageA));
                f.b(message, f.b(messageA));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean a(Message message) {
        Date dateEndDateUtc = message.endDateUtc();
        return dateEndDateUtc == null || dateEndDateUtc.getTime() >= System.currentTimeMillis();
    }
}
