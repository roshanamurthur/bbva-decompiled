package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class FqName {
    public static final FqName ROOT = new FqName("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FqNameUnsafe f81328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient FqName f81329b;

    public FqName(@NotNull String str) {
        if (str != null) {
            this.f81328a = new FqNameUnsafe(this, str);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            case 8:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @NotNull
    public static FqName topLevel(@NotNull Name name) {
        if (name != null) {
            return new FqName(FqNameUnsafe.topLevel(name));
        }
        a(14);
        throw null;
    }

    @NotNull
    public String asString() {
        String strAsString = this.f81328a.asString();
        if (strAsString != null) {
            return strAsString;
        }
        a(4);
        throw null;
    }

    @NotNull
    public FqName child(@NotNull Name name) {
        if (name != null) {
            return new FqName(this.f81328a.child(name), this);
        }
        a(8);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && this.f81328a.equals(((FqName) obj).f81328a);
    }

    public int hashCode() {
        return this.f81328a.hashCode();
    }

    public boolean isRoot() {
        return this.f81328a.isRoot();
    }

    @NotNull
    public FqName parent() {
        FqName fqName = this.f81329b;
        if (fqName != null) {
            if (fqName != null) {
                return fqName;
            }
            a(6);
            throw null;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        FqName fqName2 = new FqName(this.f81328a.parent());
        this.f81329b = fqName2;
        return fqName2;
    }

    @NotNull
    public List<Name> pathSegments() {
        List<Name> listPathSegments = this.f81328a.pathSegments();
        if (listPathSegments != null) {
            return listPathSegments;
        }
        a(11);
        throw null;
    }

    @NotNull
    public Name shortName() {
        Name nameShortName = this.f81328a.shortName();
        if (nameShortName != null) {
            return nameShortName;
        }
        a(9);
        throw null;
    }

    @NotNull
    public Name shortNameOrSpecial() {
        Name nameShortNameOrSpecial = this.f81328a.shortNameOrSpecial();
        if (nameShortNameOrSpecial != null) {
            return nameShortNameOrSpecial;
        }
        a(10);
        throw null;
    }

    public boolean startsWith(@NotNull Name name) {
        if (name != null) {
            return this.f81328a.startsWith(name);
        }
        a(12);
        throw null;
    }

    public String toString() {
        return this.f81328a.toString();
    }

    @NotNull
    public FqNameUnsafe toUnsafe() {
        FqNameUnsafe fqNameUnsafe = this.f81328a;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        a(5);
        throw null;
    }

    public FqName(@NotNull FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe != null) {
            this.f81328a = fqNameUnsafe;
        } else {
            a(2);
            throw null;
        }
    }

    public FqName(@NotNull FqNameUnsafe fqNameUnsafe, FqName fqName) {
        if (fqNameUnsafe != null) {
            this.f81328a = fqNameUnsafe;
            this.f81329b = fqName;
        } else {
            a(3);
            throw null;
        }
    }
}
