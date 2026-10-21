package com.google.i18n.phonenumbers.internal;

import com.google.i18n.phonenumbers.Phonemetadata;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes10.dex */
public final class RegexBasedMatcher implements MatcherApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RegexCache f49340a = new RegexCache(100);

    public static MatcherApi create() {
        return new RegexBasedMatcher();
    }

    @Override // com.google.i18n.phonenumbers.internal.MatcherApi
    public boolean matchNationalNumber(CharSequence charSequence, Phonemetadata.PhoneNumberDesc phoneNumberDesc, boolean z10) {
        String nationalNumberPattern = phoneNumberDesc.getNationalNumberPattern();
        if (nationalNumberPattern.length() == 0) {
            return false;
        }
        Matcher matcher = this.f49340a.getPatternForRegex(nationalNumberPattern).matcher(charSequence);
        if (!matcher.lookingAt()) {
            return false;
        }
        if (matcher.matches()) {
            z10 = true;
        }
        return z10;
    }
}
