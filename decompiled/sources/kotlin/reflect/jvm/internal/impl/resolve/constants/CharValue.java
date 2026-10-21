package kotlin.reflect.jvm.internal.impl.resolve.constants;

import ai.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c10) {
        super(Character.valueOf(c10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        String strValueOf;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(getValue().charValue());
        char cCharValue = getValue().charValue();
        if (cCharValue == '\b') {
            strValueOf = "\\b";
        } else if (cCharValue == '\t') {
            strValueOf = "\\t";
        } else if (cCharValue == '\n') {
            strValueOf = "\\n";
        } else if (cCharValue == '\f') {
            strValueOf = "\\f";
        } else if (cCharValue == '\r') {
            strValueOf = "\\r";
        } else {
            byte type = (byte) Character.getType(cCharValue);
            strValueOf = (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? "?" : String.valueOf(cCharValue);
        }
        objArr[1] = strValueOf;
        return a.i(objArr, 2, "\\u%04X ('%s')", "format(...)");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        SimpleType charType = module.getBuiltIns().getCharType();
        Intrinsics.checkNotNullExpressionValue(charType, "getCharType(...)");
        return charType;
    }
}
