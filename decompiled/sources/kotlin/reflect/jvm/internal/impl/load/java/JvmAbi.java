package kotlin.reflect.jvm.internal.impl.load.java;

import com.bbva.plugin.localstorage.command.SetCommand;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JvmAbi.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JvmAbi {

    @NotNull
    public static final JvmAbi INSTANCE = new JvmAbi();

    @JvmField
    @NotNull
    public static final ClassId JVM_FIELD_ANNOTATION_CLASS_ID;

    @JvmField
    @NotNull
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ClassId f80524a;

    static {
        FqName fqName = new FqName("kotlin.jvm.JvmField");
        JVM_FIELD_ANNOTATION_FQ_NAME = fqName;
        ClassId classId = ClassId.topLevel(fqName);
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
        JVM_FIELD_ANNOTATION_CLASS_ID = classId;
        Intrinsics.checkNotNullExpressionValue(ClassId.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl")), "topLevel(...)");
        ClassId classIdFromString = ClassId.fromString("kotlin/jvm/internal/RepeatableContainer");
        Intrinsics.checkNotNullExpressionValue(classIdFromString, "fromString(...)");
        f80524a = classIdFromString;
    }

    @JvmStatic
    @NotNull
    public static final String getterName(@NotNull String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        if (startsWithIsPrefix(propertyName)) {
            return propertyName;
        }
        return "get" + CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName);
    }

    @JvmStatic
    public static final boolean isGetterName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return l.startsWith$default(name, "get", false, 2, null) || l.startsWith$default(name, "is", false, 2, null);
    }

    @JvmStatic
    public static final boolean isSetterName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return l.startsWith$default(name, SetCommand.ID, false, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final String setterName(@NotNull String propertyName) {
        String strCapitalizeAsciiOnly;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        StringBuilder sb2 = new StringBuilder(SetCommand.ID);
        if (startsWithIsPrefix(propertyName)) {
            strCapitalizeAsciiOnly = propertyName.substring(2);
            Intrinsics.checkNotNullExpressionValue(strCapitalizeAsciiOnly, "substring(...)");
        } else {
            strCapitalizeAsciiOnly = CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName);
        }
        sb2.append(strCapitalizeAsciiOnly);
        return sb2.toString();
    }

    @JvmStatic
    public static final boolean startsWithIsPrefix(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!l.startsWith$default(name, "is", false, 2, null) || name.length() == 2) {
            return false;
        }
        char cCharAt = name.charAt(2);
        return Intrinsics.compare(97, (int) cCharAt) > 0 || Intrinsics.compare((int) cCharAt, 122) > 0;
    }

    @NotNull
    public final ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return f80524a;
    }
}
