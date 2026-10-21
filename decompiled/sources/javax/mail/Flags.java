package javax.mail;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Vector;

/* JADX INFO: loaded from: classes12.dex */
public class Flags implements Cloneable, Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f78884p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Hashtable<String, String> f78885q0;

    public static final class Flag {
        public static final Flag ANSWERED = new Flag(1);
        public static final Flag DELETED = new Flag(2);
        public static final Flag DRAFT = new Flag(4);
        public static final Flag FLAGGED = new Flag(8);
        public static final Flag RECENT = new Flag(16);
        public static final Flag SEEN = new Flag(32);
        public static final Flag USER = new Flag(Integer.MIN_VALUE);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78886a;

        public Flag(int i10) {
            this.f78886a = i10;
        }
    }

    public Flags() {
        this.f78884p0 = 0;
        this.f78885q0 = null;
    }

    public void add(Flag flag) {
        this.f78884p0 = flag.f78886a | this.f78884p0;
    }

    public void clearSystemFlags() {
        this.f78884p0 = 0;
    }

    public void clearUserFlags() {
        this.f78885q0 = null;
    }

    public Object clone() {
        Flags flags;
        try {
            flags = (Flags) super.clone();
        } catch (CloneNotSupportedException unused) {
            flags = null;
        }
        Hashtable<String, String> hashtable = this.f78885q0;
        if (hashtable != null) {
            flags.f78885q0 = (Hashtable) hashtable.clone();
        }
        return flags;
    }

    public boolean contains(Flag flag) {
        return (flag.f78886a & this.f78884p0) != 0;
    }

    public boolean equals(Object obj) {
        Hashtable<String, String> hashtable;
        if (!(obj instanceof Flags)) {
            return false;
        }
        Flags flags = (Flags) obj;
        if (flags.f78884p0 != this.f78884p0) {
            return false;
        }
        Hashtable<String, String> hashtable2 = this.f78885q0;
        int size = hashtable2 == null ? 0 : hashtable2.size();
        Hashtable<String, String> hashtable3 = flags.f78885q0;
        int size2 = hashtable3 == null ? 0 : hashtable3.size();
        if (size == 0 && size2 == 0) {
            return true;
        }
        if (flags.f78885q0 == null || (hashtable = this.f78885q0) == null || size2 != size) {
            return false;
        }
        return hashtable.keySet().equals(flags.f78885q0.keySet());
    }

    public Flag[] getSystemFlags() {
        Vector vector = new Vector();
        if ((this.f78884p0 & 1) != 0) {
            vector.addElement(Flag.ANSWERED);
        }
        if ((this.f78884p0 & 2) != 0) {
            vector.addElement(Flag.DELETED);
        }
        if ((this.f78884p0 & 4) != 0) {
            vector.addElement(Flag.DRAFT);
        }
        if ((this.f78884p0 & 8) != 0) {
            vector.addElement(Flag.FLAGGED);
        }
        if ((this.f78884p0 & 16) != 0) {
            vector.addElement(Flag.RECENT);
        }
        if ((this.f78884p0 & 32) != 0) {
            vector.addElement(Flag.SEEN);
        }
        if ((this.f78884p0 & Integer.MIN_VALUE) != 0) {
            vector.addElement(Flag.USER);
        }
        Flag[] flagArr = new Flag[vector.size()];
        vector.copyInto(flagArr);
        return flagArr;
    }

    public String[] getUserFlags() {
        Vector vector = new Vector();
        Hashtable<String, String> hashtable = this.f78885q0;
        if (hashtable != null) {
            Enumeration<String> enumerationElements = hashtable.elements();
            while (enumerationElements.hasMoreElements()) {
                vector.addElement(enumerationElements.nextElement());
            }
        }
        String[] strArr = new String[vector.size()];
        vector.copyInto(strArr);
        return strArr;
    }

    public int hashCode() {
        int iHashCode = this.f78884p0;
        Hashtable<String, String> hashtable = this.f78885q0;
        if (hashtable != null) {
            Enumeration<String> enumerationKeys = hashtable.keys();
            while (enumerationKeys.hasMoreElements()) {
                iHashCode += enumerationKeys.nextElement().hashCode();
            }
        }
        return iHashCode;
    }

    public void remove(Flag flag) {
        this.f78884p0 = (~flag.f78886a) & this.f78884p0;
    }

    public boolean retainAll(Flags flags) {
        boolean z10;
        int i10 = this.f78884p0;
        int i11 = flags.f78884p0 & i10;
        if (i10 != i11) {
            this.f78884p0 = i11;
            z10 = true;
        } else {
            z10 = false;
        }
        Hashtable<String, String> hashtable = this.f78885q0;
        if (hashtable == null || (flags.f78884p0 & Integer.MIN_VALUE) != 0) {
            return z10;
        }
        if (flags.f78885q0 == null) {
            boolean z11 = hashtable.size() > 0;
            this.f78885q0 = null;
            return z11;
        }
        Enumeration<String> enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            String strNextElement = enumerationKeys.nextElement();
            if (!flags.f78885q0.containsKey(strNextElement)) {
                this.f78885q0.remove(strNextElement);
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if ((this.f78884p0 & 1) != 0) {
            sb2.append("\\Answered ");
        }
        if ((this.f78884p0 & 2) != 0) {
            sb2.append("\\Deleted ");
        }
        if ((this.f78884p0 & 4) != 0) {
            sb2.append("\\Draft ");
        }
        if ((this.f78884p0 & 8) != 0) {
            sb2.append("\\Flagged ");
        }
        if ((this.f78884p0 & 16) != 0) {
            sb2.append("\\Recent ");
        }
        if ((this.f78884p0 & 32) != 0) {
            sb2.append("\\Seen ");
        }
        if ((this.f78884p0 & Integer.MIN_VALUE) != 0) {
            sb2.append("\\* ");
        }
        Hashtable<String, String> hashtable = this.f78885q0;
        if (hashtable != null) {
            Enumeration<String> enumerationElements = hashtable.elements();
            boolean z10 = true;
            while (enumerationElements.hasMoreElements()) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(' ');
                }
                sb2.append(enumerationElements.nextElement());
            }
            if (z10) {
                if (sb2.length() > 0) {
                    sb2.setLength(sb2.length() - 1);
                }
            }
        } else if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    public boolean contains(String str) {
        Hashtable<String, String> hashtable = this.f78885q0;
        if (hashtable == null) {
            return false;
        }
        return hashtable.containsKey(str.toLowerCase(Locale.ENGLISH));
    }

    public Flags(Flags flags) {
        this.f78884p0 = 0;
        this.f78885q0 = null;
        this.f78884p0 = flags.f78884p0;
        Hashtable<String, String> hashtable = flags.f78885q0;
        if (hashtable != null) {
            this.f78885q0 = (Hashtable) hashtable.clone();
        }
    }

    public void add(String str) {
        if (this.f78885q0 == null) {
            this.f78885q0 = new Hashtable<>(1);
        }
        this.f78885q0.put(str.toLowerCase(Locale.ENGLISH), str);
    }

    public void remove(String str) {
        Hashtable<String, String> hashtable = this.f78885q0;
        if (hashtable != null) {
            hashtable.remove(str.toLowerCase(Locale.ENGLISH));
        }
    }

    public boolean contains(Flags flags) {
        int i10 = flags.f78884p0;
        if ((this.f78884p0 & i10) != i10) {
            return false;
        }
        Hashtable<String, String> hashtable = flags.f78885q0;
        if (hashtable == null) {
            return true;
        }
        if (this.f78885q0 == null) {
            return false;
        }
        Enumeration<String> enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            if (!this.f78885q0.containsKey(enumerationKeys.nextElement())) {
                return false;
            }
        }
        return true;
    }

    public void remove(Flags flags) {
        this.f78884p0 &= ~flags.f78884p0;
        Hashtable<String, String> hashtable = flags.f78885q0;
        if (hashtable == null || this.f78885q0 == null) {
            return;
        }
        Enumeration<String> enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            this.f78885q0.remove(enumerationKeys.nextElement());
        }
    }

    public void add(Flags flags) {
        this.f78884p0 |= flags.f78884p0;
        if (flags.f78885q0 != null) {
            if (this.f78885q0 == null) {
                this.f78885q0 = new Hashtable<>(1);
            }
            Enumeration<String> enumerationKeys = flags.f78885q0.keys();
            while (enumerationKeys.hasMoreElements()) {
                String strNextElement = enumerationKeys.nextElement();
                this.f78885q0.put(strNextElement, flags.f78885q0.get(strNextElement));
            }
        }
    }

    public Flags(Flag flag) {
        this.f78884p0 = 0;
        this.f78885q0 = null;
        this.f78884p0 = flag.f78886a;
    }

    public Flags(String str) {
        this.f78884p0 = 0;
        this.f78885q0 = null;
        Hashtable<String, String> hashtable = new Hashtable<>(1);
        this.f78885q0 = hashtable;
        hashtable.put(str.toLowerCase(Locale.ENGLISH), str);
    }
}
