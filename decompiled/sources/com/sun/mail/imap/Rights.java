package com.sun.mail.imap;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class Rights implements Cloneable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean[] f65395p0;

    public static final class Right {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char f65397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Right[] f65396b = new Right[128];
        public static final Right LOOKUP = getInstance('l');
        public static final Right READ = getInstance('r');
        public static final Right KEEP_SEEN = getInstance('s');
        public static final Right WRITE = getInstance('w');
        public static final Right INSERT = getInstance('i');
        public static final Right POST = getInstance('p');
        public static final Right CREATE = getInstance('c');
        public static final Right DELETE = getInstance('d');
        public static final Right ADMINISTER = getInstance('a');

        public static synchronized Right getInstance(char c10) {
            Right[] rightArr;
            try {
                if (c10 >= 128) {
                    throw new IllegalArgumentException("Right must be ASCII");
                }
                rightArr = f65396b;
                if (rightArr[c10] == null) {
                    Right right = new Right();
                    if (c10 >= 128) {
                        throw new IllegalArgumentException("Right must be ASCII");
                    }
                    right.f65397a = c10;
                    rightArr[c10] = right;
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return rightArr[c10];
        }

        public String toString() {
            return String.valueOf(this.f65397a);
        }
    }

    public Rights() {
        this.f65395p0 = new boolean[128];
    }

    public void add(Right right) {
        this.f65395p0[right.f65397a] = true;
    }

    public Object clone() {
        Rights rights = null;
        try {
            Rights rights2 = (Rights) super.clone();
            try {
                boolean[] zArr = new boolean[128];
                rights2.f65395p0 = zArr;
                boolean[] zArr2 = this.f65395p0;
                System.arraycopy(zArr2, 0, zArr, 0, zArr2.length);
                return rights2;
            } catch (CloneNotSupportedException unused) {
                rights = rights2;
                return rights;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public boolean contains(Right right) {
        return this.f65395p0[right.f65397a];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Rights)) {
            return false;
        }
        Rights rights = (Rights) obj;
        int i10 = 0;
        while (true) {
            boolean[] zArr = rights.f65395p0;
            if (i10 >= zArr.length) {
                return true;
            }
            if (zArr[i10] != this.f65395p0[i10]) {
                return false;
            }
            i10++;
        }
    }

    public Right[] getRights() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.f65395p0;
            if (i10 >= zArr.length) {
                return (Right[]) arrayList.toArray(new Right[arrayList.size()]);
            }
            if (zArr[i10]) {
                arrayList.add(Right.getInstance((char) i10));
            }
            i10++;
        }
    }

    public int hashCode() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean[] zArr = this.f65395p0;
            if (i10 >= zArr.length) {
                return i11;
            }
            if (zArr[i10]) {
                i11++;
            }
            i10++;
        }
    }

    public void remove(Right right) {
        this.f65395p0[right.f65397a] = false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            boolean[] zArr = this.f65395p0;
            if (i10 >= zArr.length) {
                return sb2.toString();
            }
            if (zArr[i10]) {
                sb2.append((char) i10);
            }
            i10++;
        }
    }

    public void add(Rights rights) {
        int i10 = 0;
        while (true) {
            boolean[] zArr = rights.f65395p0;
            if (i10 >= zArr.length) {
                return;
            }
            if (zArr[i10]) {
                this.f65395p0[i10] = true;
            }
            i10++;
        }
    }

    public boolean contains(Rights rights) {
        int i10 = 0;
        while (true) {
            boolean[] zArr = rights.f65395p0;
            if (i10 >= zArr.length) {
                return true;
            }
            if (zArr[i10] && !this.f65395p0[i10]) {
                return false;
            }
            i10++;
        }
    }

    public void remove(Rights rights) {
        int i10 = 0;
        while (true) {
            boolean[] zArr = rights.f65395p0;
            if (i10 >= zArr.length) {
                return;
            }
            if (zArr[i10]) {
                this.f65395p0[i10] = false;
            }
            i10++;
        }
    }

    public Rights(Rights rights) {
        boolean[] zArr = new boolean[128];
        this.f65395p0 = zArr;
        System.arraycopy(rights.f65395p0, 0, zArr, 0, zArr.length);
    }

    public Rights(String str) {
        this.f65395p0 = new boolean[128];
        for (int i10 = 0; i10 < str.length(); i10++) {
            add(Right.getInstance(str.charAt(i10)));
        }
    }

    public Rights(Right right) {
        boolean[] zArr = new boolean[128];
        this.f65395p0 = zArr;
        zArr[right.f65397a] = true;
    }
}
