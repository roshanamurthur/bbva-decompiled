package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class JvmClassName {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81566a;

    public JvmClassName(@NotNull String str) {
        if (str != null) {
            this.f81566a = str;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i10) {
        String str = (i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i10 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i10 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    public static JvmClassName byClassId(@NotNull ClassId classId) {
        if (classId == null) {
            a(1);
            throw null;
        }
        FqName packageFqName = classId.getPackageFqName();
        String strReplace = classId.getRelativeClassName().asString().replace('.', Typography.dollar);
        if (packageFqName.isRoot()) {
            return new JvmClassName(strReplace);
        }
        return new JvmClassName(packageFqName.asString().replace('.', JsonPointer.SEPARATOR) + "/" + strReplace);
    }

    @NotNull
    public static JvmClassName byFqNameWithoutInnerClasses(@NotNull FqName fqName) {
        if (fqName != null) {
            return new JvmClassName(fqName.asString().replace('.', JsonPointer.SEPARATOR));
        }
        a(2);
        throw null;
    }

    @NotNull
    public static JvmClassName byInternalName(@NotNull String str) {
        if (str != null) {
            return new JvmClassName(str);
        }
        a(0);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f81566a.equals(((JvmClassName) obj).f81566a);
    }

    @NotNull
    public FqName getFqNameForTopLevelClassMaybeWithDollars() {
        return new FqName(this.f81566a.replace(JsonPointer.SEPARATOR, '.'));
    }

    @NotNull
    public String getInternalName() {
        String str = this.f81566a;
        if (str != null) {
            return str;
        }
        a(8);
        throw null;
    }

    @NotNull
    public FqName getPackageFqName() {
        String str = this.f81566a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new FqName(str.substring(0, iLastIndexOf).replace(JsonPointer.SEPARATOR, '.'));
        }
        FqName fqName = FqName.ROOT;
        if (fqName != null) {
            return fqName;
        }
        a(7);
        throw null;
    }

    public int hashCode() {
        return this.f81566a.hashCode();
    }

    public String toString() {
        return this.f81566a;
    }
}
