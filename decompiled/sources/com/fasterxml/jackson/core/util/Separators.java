package com.fasterxml.jackson.core.util;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class Separators implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final char f43152p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final char f43153q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final char f43154r0;

    public Separators() {
        this(AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.COMMA, AbstractJsonLexerKt.COMMA);
    }

    public static Separators createDefaultInstance() {
        return new Separators();
    }

    public char getArrayValueSeparator() {
        return this.f43154r0;
    }

    public char getObjectEntrySeparator() {
        return this.f43153q0;
    }

    public char getObjectFieldValueSeparator() {
        return this.f43152p0;
    }

    public Separators withArrayValueSeparator(char c10) {
        return this.f43154r0 == c10 ? this : new Separators(this.f43152p0, this.f43153q0, c10);
    }

    public Separators withObjectEntrySeparator(char c10) {
        return this.f43153q0 == c10 ? this : new Separators(this.f43152p0, c10, this.f43154r0);
    }

    public Separators withObjectFieldValueSeparator(char c10) {
        return this.f43152p0 == c10 ? this : new Separators(c10, this.f43153q0, this.f43154r0);
    }

    public Separators(char c10, char c11, char c12) {
        this.f43152p0 = c10;
        this.f43153q0 = c11;
        this.f43154r0 = c12;
    }
}
