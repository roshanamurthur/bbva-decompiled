package kotlin.reflect.jvm.internal.impl.name;

import com.fasterxml.jackson.core.JsonPointer;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public final class ClassId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FqName f81325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FqName f81326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f81327c;

    public ClassId(@NotNull FqName fqName, @NotNull FqName fqName2, boolean z10) {
        if (fqName == null) {
            a(1);
            throw null;
        }
        if (fqName2 == null) {
            a(2);
            throw null;
        }
        this.f81325a = fqName;
        this.f81326b = fqName2;
        this.f81327c = z10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                case 15:
                case 16:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                case 15:
                case 16:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i10 == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i10 == 7) {
            objArr[1] = "getShortClassName";
        } else if (i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                    objArr[1] = "asString";
                    break;
                case 15:
                case 16:
                    objArr[1] = "asFqNameString";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                    break;
            }
        } else {
            objArr[1] = "asSingleFqName";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
            case 7:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static ClassId fromString(@NotNull String str) {
        if (str != null) {
            return fromString(str, false);
        }
        a(11);
        throw null;
    }

    @NotNull
    public static ClassId topLevel(@NotNull FqName fqName) {
        if (fqName != null) {
            return new ClassId(fqName.parent(), fqName.shortName());
        }
        a(0);
        throw null;
    }

    @NotNull
    public FqName asSingleFqName() {
        FqName fqName = this.f81325a;
        boolean zIsRoot = fqName.isRoot();
        FqName fqName2 = this.f81326b;
        if (zIsRoot) {
            if (fqName2 != null) {
                return fqName2;
            }
            a(9);
            throw null;
        }
        return new FqName(fqName.asString() + Constant.DOT_STRING + fqName2.asString());
    }

    @NotNull
    public String asString() {
        FqName fqName = this.f81325a;
        boolean zIsRoot = fqName.isRoot();
        FqName fqName2 = this.f81326b;
        if (zIsRoot) {
            String strAsString = fqName2.asString();
            if (strAsString != null) {
                return strAsString;
            }
            a(13);
            throw null;
        }
        String str = fqName.asString().replace('.', JsonPointer.SEPARATOR) + "/" + fqName2.asString();
        if (str != null) {
            return str;
        }
        a(14);
        throw null;
    }

    @NotNull
    public ClassId createNestedClassId(@NotNull Name name) {
        if (name != null) {
            return new ClassId(getPackageFqName(), this.f81326b.child(name), this.f81327c);
        }
        a(8);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClassId.class != obj.getClass()) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return this.f81325a.equals(classId.f81325a) && this.f81326b.equals(classId.f81326b) && this.f81327c == classId.f81327c;
    }

    @Nullable
    public ClassId getOuterClassId() {
        FqName fqNameParent = this.f81326b.parent();
        if (fqNameParent.isRoot()) {
            return null;
        }
        return new ClassId(getPackageFqName(), fqNameParent, this.f81327c);
    }

    @NotNull
    public FqName getPackageFqName() {
        FqName fqName = this.f81325a;
        if (fqName != null) {
            return fqName;
        }
        a(5);
        throw null;
    }

    @NotNull
    public FqName getRelativeClassName() {
        FqName fqName = this.f81326b;
        if (fqName != null) {
            return fqName;
        }
        a(6);
        throw null;
    }

    @NotNull
    public Name getShortClassName() {
        Name nameShortName = this.f81326b.shortName();
        if (nameShortName != null) {
            return nameShortName;
        }
        a(7);
        throw null;
    }

    public int hashCode() {
        return Boolean.valueOf(this.f81327c).hashCode() + ((this.f81326b.hashCode() + (this.f81325a.hashCode() * 31)) * 31);
    }

    public boolean isLocal() {
        return this.f81327c;
    }

    public boolean isNestedClass() {
        return !this.f81326b.parent().isRoot();
    }

    public String toString() {
        if (!this.f81325a.isRoot()) {
            return asString();
        }
        return "/" + asString();
    }

    @NotNull
    public static ClassId fromString(@NotNull String str, boolean z10) {
        String str2;
        if (str != null) {
            int iLastIndexOf = str.lastIndexOf("/");
            if (iLastIndexOf == -1) {
                str2 = "";
            } else {
                String strReplace = str.substring(0, iLastIndexOf).replace(JsonPointer.SEPARATOR, '.');
                str = str.substring(iLastIndexOf + 1);
                str2 = strReplace;
            }
            return new ClassId(new FqName(str2), new FqName(str), z10);
        }
        a(12);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(@NotNull FqName fqName, @NotNull Name name) {
        this(fqName, FqName.topLevel(name), false);
        if (fqName == null) {
            a(3);
            throw null;
        }
        if (name != null) {
        } else {
            a(4);
            throw null;
        }
    }
}
