package com.dasnano.vddocumentcapture.other;

import androidx.annotation.Keep;
import com.dasnano.vddocumentcapture.other.BackwardsCompatibleEnum;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public abstract class BackwardsCompatibleEnum<E extends BackwardsCompatibleEnum<E>> implements Comparable<E>, Serializable {
    private static final int HASH_SALT = 2311;
    public final BackwardsCompatibleEnum<E> aliasOf;

    @Keep
    public final String name;

    @Keep
    public final int ordinal;

    public BackwardsCompatibleEnum(int i10, String str, BackwardsCompatibleEnum<E> backwardsCompatibleEnum) {
        this.ordinal = i10;
        this.name = str;
        this.aliasOf = backwardsCompatibleEnum;
    }

    private boolean isAlias() {
        return this.aliasOf != null;
    }

    @Keep
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        throw new InvalidObjectException("Can't deserialize backwards compatible enum");
    }

    @Keep
    private void readObjectNoData() throws ObjectStreamException {
        throw new InvalidObjectException("Can't deserialize backwards compatible enum");
    }

    @Keep
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Keep
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        BackwardsCompatibleEnum<E> backwardsCompatibleEnum = (BackwardsCompatibleEnum) obj;
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (this == backwardsCompatibleEnum) {
            return true;
        }
        if (backwardsCompatibleEnum.isAlias() && equals(backwardsCompatibleEnum.aliasOf)) {
            return true;
        }
        return isAlias() && this.aliasOf.equals(backwardsCompatibleEnum);
    }

    @Keep
    public Class<E> getDeclaringClass() {
        Class<E> cls = (Class<E>) getClass();
        Class superclass = cls.getSuperclass();
        return superclass == BackwardsCompatibleEnum.class ? cls : superclass;
    }

    @Keep
    public final int hashCode() {
        if (this.aliasOf.isAlias()) {
            return this.aliasOf.hashCode();
        }
        return this.name.hashCode() + (this.ordinal * 5340721);
    }

    @Keep
    public String name() {
        return this.name;
    }

    @Keep
    public int ordinal() {
        return this.ordinal;
    }

    @Keep
    public String toString() {
        return this.name;
    }

    @Override // java.lang.Comparable
    @Keep
    public int compareTo(E e5) {
        if (getClass() == e5.getClass() || getDeclaringClass() == e5.getDeclaringClass()) {
            return this.ordinal - e5.ordinal;
        }
        throw new ClassCastException();
    }

    @Keep
    public void finalize() {
    }
}
