package com.cells.validator.rules;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes9.dex */
public class RegexRule implements Rule<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f39216a;

    public RegexRule(String str) {
        this.f39216a = Pattern.compile(str);
    }

    @Override // com.cells.validator.rules.Rule
    public boolean isValid(String str) {
        return this.f39216a.matcher(str).matches();
    }
}
