package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;

/* JADX INFO: loaded from: classes9.dex */
public class JsonpCharacterEscapes extends CharacterEscapes {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int[] f43038p0 = CharacterEscapes.standardAsciiEscapesForJSON();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final SerializedString f43039q0 = new SerializedString("\\u2028");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final SerializedString f43040r0 = new SerializedString("\\u2029");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final JsonpCharacterEscapes f43041s0 = new JsonpCharacterEscapes();

    public static JsonpCharacterEscapes instance() {
        return f43041s0;
    }

    @Override // com.fasterxml.jackson.core.io.CharacterEscapes
    public int[] getEscapeCodesForAscii() {
        return f43038p0;
    }

    @Override // com.fasterxml.jackson.core.io.CharacterEscapes
    public SerializableString getEscapeSequence(int i10) {
        if (i10 == 8232) {
            return f43039q0;
        }
        if (i10 != 8233) {
            return null;
        }
        return f43040r0;
    }
}
