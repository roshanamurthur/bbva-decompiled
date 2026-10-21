package br.com.opencs.bincodec;

/* JADX INFO: loaded from: classes2.dex */
public interface Alphabet {
    int getCharacter(int i10);

    int getValue(int i10) throws IllegalArgumentException;

    int size();
}
