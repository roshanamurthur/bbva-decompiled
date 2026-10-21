package com.google.i18n.phonenumbers;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class PhoneNumberMatch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Phonenumber.PhoneNumber f49231c;

    public PhoneNumberMatch(int i10, String str, Phonenumber.PhoneNumber phoneNumber) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Start index must be >= 0.");
        }
        if (str == null) {
            throw null;
        }
        this.f49229a = i10;
        this.f49230b = str;
        this.f49231c = phoneNumber;
    }

    public int end() {
        return this.f49230b.length() + this.f49229a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneNumberMatch)) {
            return false;
        }
        PhoneNumberMatch phoneNumberMatch = (PhoneNumberMatch) obj;
        return this.f49230b.equals(phoneNumberMatch.f49230b) && this.f49229a == phoneNumberMatch.f49229a && this.f49231c.equals(phoneNumberMatch.f49231c);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f49229a), this.f49230b, this.f49231c});
    }

    public Phonenumber.PhoneNumber number() {
        return this.f49231c;
    }

    public String rawString() {
        return this.f49230b;
    }

    public int start() {
        return this.f49229a;
    }

    public String toString() {
        return "PhoneNumberMatch [" + start() + "," + end() + ") " + this.f49230b;
    }
}
