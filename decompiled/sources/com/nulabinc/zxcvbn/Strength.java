package com.nulabinc.zxcvbn;

import com.nulabinc.zxcvbn.matchers.Match;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class Strength {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f63640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f63641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f63642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AttackTimes.CrackTimeSeconds f63643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AttackTimes.CrackTimesDisplay f63644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63645f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Feedback f63646g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<Match> f63647h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f63648i;

    public long getCalcTime() {
        return this.f63648i;
    }

    public AttackTimes.CrackTimeSeconds getCrackTimeSeconds() {
        return this.f63643d;
    }

    public AttackTimes.CrackTimesDisplay getCrackTimesDisplay() {
        return this.f63644e;
    }

    public Feedback getFeedback() {
        return this.f63646g;
    }

    public double getGuesses() {
        return this.f63641b;
    }

    public double getGuessesLog10() {
        return this.f63642c;
    }

    public CharSequence getPassword() {
        return this.f63640a;
    }

    public int getScore() {
        return this.f63645f;
    }

    public List<Match> getSequence() {
        return this.f63647h;
    }

    public void setCalcTime(long j10) {
        this.f63648i = j10;
    }

    public void setCrackTimeSeconds(AttackTimes.CrackTimeSeconds crackTimeSeconds) {
        this.f63643d = crackTimeSeconds;
    }

    public void setCrackTimesDisplay(AttackTimes.CrackTimesDisplay crackTimesDisplay) {
        this.f63644e = crackTimesDisplay;
    }

    public void setFeedback(Feedback feedback) {
        this.f63646g = feedback;
    }

    public void setGuesses(double d2) {
        this.f63641b = d2;
    }

    public void setGuessesLog10(double d2) {
        this.f63642c = d2;
    }

    public void setPassword(CharSequence charSequence) {
        this.f63640a = charSequence;
    }

    public void setScore(int i10) {
        this.f63645f = i10;
    }

    public void setSequence(List<Match> list) {
        this.f63647h = list;
    }

    public void wipe() {
        WipeableString.wipeIfPossible(this.f63640a);
        for (Match match : this.f63647h) {
            WipeableString.wipeIfPossible(match.token);
            WipeableString.wipeIfPossible(match.baseToken);
            WipeableString.wipeIfPossible(match.matchedWord);
        }
    }
}
