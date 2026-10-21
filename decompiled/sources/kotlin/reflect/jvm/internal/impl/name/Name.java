package kotlin.reflect.jvm.internal.impl.name;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Name implements Comparable<Name> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final String f81337p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f81338q0;

    public Name(@NotNull String str, boolean z10) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f81337p0 = str;
        this.f81338q0 = z10;
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static Name guessByFirstCharacter(@NotNull String str) {
        if (str != null) {
            return str.startsWith("<") ? special(str) : identifier(str);
        }
        a(9);
        throw null;
    }

    @NotNull
    public static Name identifier(@NotNull String str) {
        if (str != null) {
            return new Name(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean isValidIdentifier(@NotNull String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static Name special(@NotNull String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    @NotNull
    public String asString() {
        String str = this.f81337p0;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.f81338q0 == name.f81338q0 && this.f81337p0.equals(name.f81337p0);
    }

    @NotNull
    public String getIdentifier() {
        if (this.f81338q0) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strAsString = asString();
        if (strAsString != null) {
            return strAsString;
        }
        a(2);
        throw null;
    }

    public int hashCode() {
        return (this.f81337p0.hashCode() * 31) + (this.f81338q0 ? 1 : 0);
    }

    public boolean isSpecial() {
        return this.f81338q0;
    }

    public String toString() {
        return this.f81337p0;
    }

    @Override // java.lang.Comparable
    public int compareTo(Name name) {
        return this.f81337p0.compareTo(name.f81337p0);
    }
}
