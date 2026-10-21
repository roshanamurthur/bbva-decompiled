package kotlin.reflect.jvm.internal.impl.name;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class FqNameUnsafe {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Name f81330e = Name.special("<root>");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f81331f = Pattern.compile("\\.");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f81332g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f81333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient FqName f81334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient FqNameUnsafe f81335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Name f81336d;

    public static class a implements Function1<String, Name> {
        @Override // kotlin.jvm.functions.Function1
        public Name invoke(String str) {
            return Name.guessByFirstCharacter(str);
        }
    }

    public FqNameUnsafe(@NotNull FqName fqName, @NotNull String str) {
        if (str == null) {
            a(0);
            throw null;
        }
        if (fqName == null) {
            a(1);
            throw null;
        }
        this.f81333a = str;
        this.f81334b = fqName;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i11 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @NotNull
    public static FqNameUnsafe topLevel(@NotNull Name name) {
        if (name != null) {
            return new FqNameUnsafe(name.asString(), FqName.ROOT.toUnsafe(), name);
        }
        a(17);
        throw null;
    }

    @NotNull
    public String asString() {
        String str = this.f81333a;
        if (str != null) {
            return str;
        }
        a(4);
        throw null;
    }

    public final void b() {
        String str = this.f81333a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f81336d = Name.guessByFirstCharacter(str.substring(iLastIndexOf + 1));
            this.f81335c = new FqNameUnsafe(str.substring(0, iLastIndexOf));
        } else {
            this.f81336d = Name.guessByFirstCharacter(str);
            this.f81335c = FqName.ROOT.toUnsafe();
        }
    }

    @NotNull
    public FqNameUnsafe child(@NotNull Name name) {
        String strAsString;
        if (name == null) {
            a(9);
            throw null;
        }
        if (isRoot()) {
            strAsString = name.asString();
        } else {
            strAsString = this.f81333a + Constant.DOT_STRING + name.asString();
        }
        return new FqNameUnsafe(strAsString, this, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && this.f81333a.equals(((FqNameUnsafe) obj).f81333a);
    }

    public int hashCode() {
        return this.f81333a.hashCode();
    }

    public boolean isRoot() {
        return this.f81333a.isEmpty();
    }

    public boolean isSafe() {
        return this.f81334b != null || asString().indexOf(60) < 0;
    }

    @NotNull
    public FqNameUnsafe parent() {
        FqNameUnsafe fqNameUnsafe = this.f81335c;
        if (fqNameUnsafe != null) {
            if (fqNameUnsafe != null) {
                return fqNameUnsafe;
            }
            a(7);
            throw null;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        b();
        FqNameUnsafe fqNameUnsafe2 = this.f81335c;
        if (fqNameUnsafe2 != null) {
            return fqNameUnsafe2;
        }
        a(8);
        throw null;
    }

    @NotNull
    public List<Name> pathSegments() {
        List<Name> listEmptyList = isRoot() ? Collections.emptyList() : ArraysKt___ArraysKt.map(f81331f.split(this.f81333a), f81332g);
        if (listEmptyList != null) {
            return listEmptyList;
        }
        a(14);
        throw null;
    }

    @NotNull
    public Name shortName() {
        Name name = this.f81336d;
        if (name != null) {
            if (name != null) {
                return name;
            }
            a(10);
            throw null;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        b();
        Name name2 = this.f81336d;
        if (name2 != null) {
            return name2;
        }
        a(11);
        throw null;
    }

    @NotNull
    public Name shortNameOrSpecial() {
        if (isRoot()) {
            Name name = f81330e;
            if (name != null) {
                return name;
            }
            a(12);
            throw null;
        }
        Name nameShortName = shortName();
        if (nameShortName != null) {
            return nameShortName;
        }
        a(13);
        throw null;
    }

    public boolean startsWith(@NotNull Name name) {
        if (name == null) {
            a(15);
            throw null;
        }
        if (isRoot()) {
            return false;
        }
        String str = this.f81333a;
        int iIndexOf = str.indexOf(46);
        String strAsString = name.asString();
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strAsString.length());
        }
        return str.regionMatches(0, strAsString, 0, iIndexOf);
    }

    @NotNull
    public FqName toSafe() {
        FqName fqName = this.f81334b;
        if (fqName == null) {
            FqName fqName2 = new FqName(this);
            this.f81334b = fqName2;
            return fqName2;
        }
        if (fqName != null) {
            return fqName;
        }
        a(5);
        throw null;
    }

    @NotNull
    public String toString() {
        String strAsString = isRoot() ? f81330e.asString() : this.f81333a;
        if (strAsString != null) {
            return strAsString;
        }
        a(18);
        throw null;
    }

    public FqNameUnsafe(@NotNull String str) {
        if (str != null) {
            this.f81333a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public FqNameUnsafe(@NotNull String str, FqNameUnsafe fqNameUnsafe, Name name) {
        if (str != null) {
            this.f81333a = str;
            this.f81335c = fqNameUnsafe;
            this.f81336d = name;
            return;
        }
        a(3);
        throw null;
    }
}
