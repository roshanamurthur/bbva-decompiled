package com.nulabinc.zxcvbn;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes11.dex */
public class TimeEstimates {
    public static double a(double d2, double d3) {
        return new BigDecimal(d2).divide(new BigDecimal(d3), 5).doubleValue();
    }

    public static String b(String str, Double d2) {
        if (d2 == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format(str, Long.valueOf(Math.round(d2.doubleValue()))));
        sb2.append(d2.doubleValue() != 1.0d ? "s" : "");
        return sb2.toString();
    }

    public static String displayTime(double d2) {
        Double dValueOf = Double.valueOf(60.0d);
        Double dValueOf2 = Double.valueOf(dValueOf.doubleValue() * 60.0d);
        Double dValueOf3 = Double.valueOf(dValueOf2.doubleValue() * 24.0d);
        Double dValueOf4 = Double.valueOf(dValueOf3.doubleValue() * 31.0d);
        Double dValueOf5 = Double.valueOf(dValueOf4.doubleValue() * 12.0d);
        Double dValueOf6 = Double.valueOf(dValueOf5.doubleValue() * 100.0d);
        if (d2 < 1.0d) {
            return "less than a second";
        }
        if (d2 < dValueOf.doubleValue()) {
            return b("%s second", Double.valueOf(d2));
        }
        if (d2 < dValueOf2.doubleValue()) {
            return b("%s minute", Double.valueOf(a(d2, dValueOf.doubleValue())));
        }
        if (d2 < dValueOf3.doubleValue()) {
            return b("%s hour", Double.valueOf(a(d2, dValueOf2.doubleValue())));
        }
        if (d2 < dValueOf4.doubleValue()) {
            return b("%s day", Double.valueOf(a(d2, dValueOf3.doubleValue())));
        }
        if (d2 < dValueOf5.doubleValue()) {
            return b("%s month", Double.valueOf(a(d2, dValueOf4.doubleValue())));
        }
        return d2 < dValueOf6.doubleValue() ? b("%s year", Double.valueOf(a(d2, dValueOf5.doubleValue()))) : "centuries";
    }

    public static AttackTimes estimateAttackTimes(double d2) {
        AttackTimes.CrackTimeSeconds crackTimeSeconds = new AttackTimes.CrackTimeSeconds(a(d2, 0.027777777777777776d), d2 / 10.0d, d2 / 10000.0d, d2 / 1.0E10d);
        return new AttackTimes(crackTimeSeconds, new AttackTimes.CrackTimesDisplay(displayTime(crackTimeSeconds.getOnlineThrottling100perHour()), displayTime(crackTimeSeconds.getOnlineNoThrottling10perSecond()), displayTime(crackTimeSeconds.getOfflineSlowHashing1e4perSecond()), displayTime(crackTimeSeconds.getOfflineFastHashing1e10PerSecond())), guessesToScore(d2));
    }

    public static int guessesToScore(double d2) {
        double d3 = 5;
        if (d2 < 1000.0d + d3) {
            return 0;
        }
        if (d2 < 1000000.0d + d3) {
            return 1;
        }
        if (d2 < 1.0E8d + d3) {
            return 2;
        }
        return d2 < d3 + 1.0E10d ? 3 : 4;
    }
}
