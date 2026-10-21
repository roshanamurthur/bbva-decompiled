package com.nulabinc.zxcvbn;

/* JADX INFO: loaded from: classes11.dex */
public class AttackTimes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CrackTimeSeconds f63614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CrackTimesDisplay f63615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f63616c;

    public static class CrackTimeSeconds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public double f63617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f63618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public double f63619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f63620d;

        public CrackTimeSeconds(double d2, double d3, double d7, double d10) {
            this.f63617a = d2;
            this.f63618b = d3;
            this.f63619c = d7;
            this.f63620d = d10;
        }

        public double getOfflineFastHashing1e10PerSecond() {
            return this.f63620d;
        }

        public double getOfflineSlowHashing1e4perSecond() {
            return this.f63619c;
        }

        public double getOnlineNoThrottling10perSecond() {
            return this.f63618b;
        }

        public double getOnlineThrottling100perHour() {
            return this.f63617a;
        }

        public void setOfflineFastHashing1e10PerSecond(double d2) {
            this.f63620d = d2;
        }

        public void setOfflineSlowHashing1e4perSecond(double d2) {
            this.f63619c = d2;
        }

        public void setOnlineNoThrottling10perSecond(double d2) {
            this.f63618b = d2;
        }

        public void setOnlineThrottling100perHour(double d2) {
            this.f63617a = d2;
        }
    }

    public static class CrackTimesDisplay {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f63621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f63622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f63623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f63624d;

        public CrackTimesDisplay(String str, String str2, String str3, String str4) {
            this.f63621a = str;
            this.f63622b = str2;
            this.f63623c = str3;
            this.f63624d = str4;
        }

        public String getOfflineFastHashing1e10PerSecond() {
            return this.f63624d;
        }

        public String getOfflineSlowHashing1e4perSecond() {
            return this.f63623c;
        }

        public String getOnlineNoThrottling10perSecond() {
            return this.f63622b;
        }

        public String getOnlineThrottling100perHour() {
            return this.f63621a;
        }

        public void setOfflineFastHashing1e10PerSecond(String str) {
            this.f63624d = str;
        }

        public void setOfflineSlowHashing1e4perSecond(String str) {
            this.f63623c = str;
        }

        public void setOnlineNoThrottling10perSecond(String str) {
            this.f63622b = str;
        }

        public void setOnlineThrottling100perHour(String str) {
            this.f63621a = str;
        }
    }

    public AttackTimes(CrackTimeSeconds crackTimeSeconds, CrackTimesDisplay crackTimesDisplay, int i10) {
        this.f63614a = crackTimeSeconds;
        this.f63615b = crackTimesDisplay;
        this.f63616c = i10;
    }

    public CrackTimeSeconds getCrackTimeSeconds() {
        return this.f63614a;
    }

    public CrackTimesDisplay getCrackTimesDisplay() {
        return this.f63615b;
    }

    public int getScore() {
        return this.f63616c;
    }

    public void setCrackTimeSeconds(CrackTimeSeconds crackTimeSeconds) {
        this.f63614a = crackTimeSeconds;
    }

    public void setCrackTimesDisplay(CrackTimesDisplay crackTimesDisplay) {
        this.f63615b = crackTimesDisplay;
    }

    public void setScore(int i10) {
        this.f63616c = i10;
    }
}
