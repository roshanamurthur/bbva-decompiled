package kotlinx.serialization.json.internal;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonPath.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\b\u0010\u0010\u001a\u00020\u000eH\u0016R\u001e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath;", "", "", "resize", "Lkotlinx/serialization/descriptors/SerialDescriptor;", DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_DESCRIPTION, "pushDescriptor", "", FirebaseAnalytics.Param.INDEX, "updateDescriptorIndex", "key", "updateCurrentMapKey", "resetCurrentMapKey", "popDescriptor", "", "getPath", "toString", "", "currentObjectPath", "[Ljava/lang/Object;", "", "indicies", "[I", "currentDepth", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "<init>", "()V", "Tombstone", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0})
public final class JsonPath {
    private int currentDepth;

    @NotNull
    private Object[] currentObjectPath = new Object[8];

    @NotNull
    private int[] indicies;

    /* JADX INFO: compiled from: JsonPath.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath$Tombstone;", "", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Tombstone {

        @NotNull
        public static final Tombstone INSTANCE = new Tombstone();

        private Tombstone() {
        }
    }

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.indicies = iArr;
        this.currentDepth = -1;
    }

    private final void resize() {
        int i10 = this.currentDepth * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.currentObjectPath, i10);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.currentObjectPath = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.indicies, i10);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.indicies = iArrCopyOf;
    }

    @NotNull
    public final String getPath() {
        StringBuilder sb2 = new StringBuilder(Constant.MXN_SYMBOL);
        int i10 = this.currentDepth + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.currentObjectPath[i11];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!Intrinsics.areEqual(serialDescriptor.getKind(), StructureKind.LIST.INSTANCE)) {
                    int i12 = this.indicies[i11];
                    if (i12 >= 0) {
                        sb2.append(Constant.DOT_STRING);
                        sb2.append(serialDescriptor.getElementName(i12));
                    }
                } else if (this.indicies[i11] != -1) {
                    sb2.append(Constant.BRACKET_OPEN);
                    sb2.append(this.indicies[i11]);
                    sb2.append(Constant.BRACKET_CLOSE);
                }
            } else if (obj != Tombstone.INSTANCE) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void popDescriptor() {
        int i10 = this.currentDepth;
        int[] iArr = this.indicies;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.currentDepth = i10 - 1;
        }
        int i11 = this.currentDepth;
        if (i11 != -1) {
            this.currentDepth = i11 - 1;
        }
    }

    public final void pushDescriptor(@NotNull SerialDescriptor sd2) {
        Intrinsics.checkNotNullParameter(sd2, "sd");
        int i10 = this.currentDepth + 1;
        this.currentDepth = i10;
        if (i10 == this.currentObjectPath.length) {
            resize();
        }
        this.currentObjectPath[i10] = sd2;
    }

    public final void resetCurrentMapKey() {
        int[] iArr = this.indicies;
        int i10 = this.currentDepth;
        if (iArr[i10] == -2) {
            this.currentObjectPath[i10] = Tombstone.INSTANCE;
        }
    }

    @NotNull
    public String toString() {
        return getPath();
    }

    public final void updateCurrentMapKey(@Nullable Object key) {
        int[] iArr = this.indicies;
        int i10 = this.currentDepth;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.currentDepth = i11;
            if (i11 == this.currentObjectPath.length) {
                resize();
            }
        }
        Object[] objArr = this.currentObjectPath;
        int i12 = this.currentDepth;
        objArr[i12] = key;
        this.indicies[i12] = -2;
    }

    public final void updateDescriptorIndex(int index) {
        this.indicies[this.currentDepth] = index;
    }
}
