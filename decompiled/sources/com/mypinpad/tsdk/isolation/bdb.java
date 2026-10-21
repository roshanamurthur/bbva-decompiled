package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

/* JADX INFO: loaded from: classes10.dex */
public final class bdb implements bbu, PrivateKey {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f54537s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54538t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public transient adu f54539p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient azr f54540q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public transient aee f54541r0;

    public bdb(ahw ahwVar) throws IOException {
        setY(new Object[]{this, ahwVar}, -2001806260, 2001806260, System.identityHashCode(this));
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        int i10 = f54538t0;
        int i11 = i10 & 27;
        int i12 = -(-(i10 | 27));
        int i13 = (i11 & i12) + (i12 | i11);
        f54537s0 = i13 % 128;
        int i14 = i13 % 2;
        objectInputStream.defaultReadObject();
        byte[] bArr = (byte[]) objectInputStream.readObject();
        if (i14 == 0) {
            setY(new Object[]{this, (ahw) ahw.setX(new Object[]{bArr}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, -2001806260, 2001806260, System.identityHashCode(this));
        } else {
            setY(new Object[]{this, (ahw) ahw.setX(new Object[]{bArr}, -1552871480, 1552871484, (int) System.currentTimeMillis())}, -2001806260, 2001806260, System.identityHashCode(this));
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x020a, code lost:
    
        if ((!((java.lang.Boolean) com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(r5, -576846525, 576846546, (int) java.lang.System.currentTimeMillis())).booleanValue()) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0240, code lost:
    
        if (((java.lang.Boolean) com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{r0, (byte[]) com.mypinpad.tsdk.isolation.azr.setX(new java.lang.Object[]{r4}, -1255903986, 1255903986, java.lang.System.identityHashCode(r4))}, -576846525, 576846546, (int) java.lang.System.currentTimeMillis())).booleanValue() != true) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0243, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.bdb.f54538t0 + 27;
        com.mypinpad.tsdk.isolation.bdb.f54537s0 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x024c, code lost:
    
        if ((r0 % 2) != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0251, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.bdb.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        int i10 = f54537s0 + 31;
        f54538t0 = i10 % 128;
        int i11 = i10 % 2;
        objectOutputStream.defaultWriteObject();
        if (i11 != 0) {
            objectOutputStream.writeObject((byte[]) setY(new Object[]{this}, 1741358622, -1741358620, System.identityHashCode(this)));
        } else {
            objectOutputStream.writeObject((byte[]) setY(new Object[]{this}, 1741358622, -1741358620, System.identityHashCode(this)));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, -951111747, 951111752, System.identityHashCode(this))).booleanValue();
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return (String) setY(new Object[]{this}, 1625769050, -1625769049, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final byte[] getEncoded() {
        return (byte[]) setY(new Object[]{this}, 1741358622, -1741358620, System.identityHashCode(this));
    }

    @Override // java.security.Key
    public final String getFormat() {
        return (String) setY(new Object[]{this}, 1304510881, -1304510878, System.identityHashCode(this));
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, 770329162, -770329158, System.identityHashCode(this))).intValue();
    }
}
