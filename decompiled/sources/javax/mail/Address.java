package javax.mail;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Address implements Serializable {
    public abstract boolean equals(Object obj);

    public abstract String getType();

    public abstract String toString();
}
