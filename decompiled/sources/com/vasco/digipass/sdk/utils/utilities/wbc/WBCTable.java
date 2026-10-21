package com.vasco.digipass.sdk.utils.utilities.wbc;

import cz.muni.fi.xklinex.whiteboxAES.AES;
import cz.muni.fi.xklinex.whiteboxAES.T1Box;
import cz.muni.fi.xklinex.whiteboxAES.T2Box;
import cz.muni.fi.xklinex.whiteboxAES.T3Box;
import cz.muni.fi.xklinex.whiteboxAES.XORCascade;
import cz.muni.fi.xklinex.whiteboxAES.XORCascadeState;
import cz.muni.fi.xklinex.whiteboxAES.generator.ExternalBijections;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class WBCTable implements Serializable {
    public static final int BYTES = 16;
    public static final int ROUNDS = 10;
    public static final int T1BOXES = 2;
    private static final long serialVersionUID = -8735138231669345519L;
    protected ExternalBijections extc;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    protected T1Box[][] f66538t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    protected T2Box[][] f66539t2;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    protected T3Box[][] f66540t3;
    protected XORCascade[][] xor;
    protected XORCascadeState[] xorState;

    public WBCTable() {
        this.extc = new ExternalBijections();
        this.f66539t2 = (T2Box[][]) Array.newInstance((Class<?>) T2Box.class, 10, 16);
        this.f66540t3 = (T3Box[][]) Array.newInstance((Class<?>) T3Box.class, 10, 16);
        this.xorState = new XORCascadeState[2];
        this.xor = (XORCascade[][]) Array.newInstance((Class<?>) XORCascade.class, 10, 8);
        this.f66538t1 = (T1Box[][]) Array.newInstance((Class<?>) T1Box.class, 2, 16);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WBCTable wBCTable = (WBCTable) obj;
        return Objects.equals(this.extc, wBCTable.extc) && Arrays.deepEquals(this.f66539t2, wBCTable.f66539t2) && Arrays.deepEquals(this.f66540t3, wBCTable.f66540t3) && Arrays.deepEquals(this.xorState, wBCTable.xorState) && Arrays.deepEquals(this.xor, wBCTable.xor) && Arrays.deepEquals(this.f66538t1, wBCTable.f66538t1);
    }

    public ExternalBijections getExternalBijections() {
        return this.extc;
    }

    public T1Box[][] getT1() {
        return this.f66538t1;
    }

    public T2Box[][] getT2() {
        return this.f66539t2;
    }

    public T3Box[][] getT3() {
        return this.f66540t3;
    }

    public XORCascade[][] getXor() {
        return this.xor;
    }

    public XORCascadeState[] getXorState() {
        return this.xorState;
    }

    public int hashCode() {
        return (((((((((Objects.hash(this.extc) * 31) + Arrays.deepHashCode(this.f66539t2)) * 31) + Arrays.deepHashCode(this.f66540t3)) * 31) + Arrays.deepHashCode(this.xorState)) * 31) + Arrays.deepHashCode(this.xor)) * 31) + Arrays.deepHashCode(this.f66538t1);
    }

    public void populateTable(AES aes) {
        this.f66538t1 = aes.getT1();
        this.xorState = aes.getXorState();
        this.f66539t2 = aes.getT2();
        this.f66540t3 = aes.getT3();
        this.xor = aes.getXor();
    }

    public void setExternalBijections(ExternalBijections externalBijections) {
        this.extc = externalBijections;
    }

    public WBCTable(AES aes) {
        this.extc = new ExternalBijections();
        this.f66539t2 = (T2Box[][]) Array.newInstance((Class<?>) T2Box.class, 10, 16);
        this.f66540t3 = (T3Box[][]) Array.newInstance((Class<?>) T3Box.class, 10, 16);
        this.xorState = new XORCascadeState[2];
        this.xor = (XORCascade[][]) Array.newInstance((Class<?>) XORCascade.class, 10, 8);
        this.f66538t1 = (T1Box[][]) Array.newInstance((Class<?>) T1Box.class, 2, 16);
        this.f66538t1 = aes.getT1();
        this.xorState = aes.getXorState();
        this.f66539t2 = aes.getT2();
        this.f66540t3 = aes.getT3();
        this.xor = aes.getXor();
    }
}
