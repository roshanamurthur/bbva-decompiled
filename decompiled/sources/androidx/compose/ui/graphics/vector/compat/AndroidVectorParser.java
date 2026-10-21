package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.activity.a;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleableRes;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: XmlVectorParser.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010$\u001a\u00020!\u0012\b\b\u0002\u0010%\u001a\u00020\u000f¢\u0006\u0004\b5\u00106J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0018\u00010\u0004R\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ(\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0013J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0015J\u001e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0013J\u001e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000fJ\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0013J8\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0018\u00010\u0004R\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0011\u001a\u00020\u000fJ0\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\f\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0018\u00010\u0004R\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000fJ\t\u0010\"\u001a\u00020!HÆ\u0003J\t\u0010#\u001a\u00020\u000fHÆ\u0003J\u001d\u0010&\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020\u000fHÆ\u0001J\t\u0010'\u001a\u00020\rHÖ\u0001J\t\u0010(\u001a\u00020\u000fHÖ\u0001J\u0013\u0010*\u001a\u00020\u00152\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010$\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u0010%\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00067"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", SetCommand.ID, "", "attrs", "Landroid/content/res/TypedArray;", "obtainAttributes", "typedArray", "", "attrName", "", "resId", "defaultValue", "getNamedInt", "", "getNamedFloat", "", "getNamedBoolean", FirebaseAnalytics.Param.INDEX, "getFloat", "getInt", "getString", "defValue", "getDimension", "Landroidx/core/content/res/ComplexColorCompat;", "getNamedComplexColor", "Landroid/content/res/ColorStateList;", "getNamedColorStateList", "Lorg/xmlpull/v1/XmlPullParser;", "component1", "component2", "xmlParser", "config", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lorg/xmlpull/v1/XmlPullParser;", "getXmlParser", "()Lorg/xmlpull/v1/XmlPullParser;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getConfig", "()I", "setConfig", "(I)V", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AndroidVectorParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final XmlPullParser xmlParser;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public int config;

    public AndroidVectorParser(@NotNull XmlPullParser xmlParser, int i10) {
        Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
        this.xmlParser = xmlParser;
        this.config = i10;
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i11 & 2) != 0) {
            i10 = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i10);
    }

    public final void a(int i10) {
        this.config = i10 | this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConfig() {
        return this.config;
    }

    @NotNull
    public final AndroidVectorParser copy(@NotNull XmlPullParser xmlParser, int config) {
        Intrinsics.checkNotNullParameter(xmlParser, "xmlParser");
        return new AndroidVectorParser(xmlParser, config);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) other;
        return Intrinsics.areEqual(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final int getConfig() {
        return this.config;
    }

    public final float getDimension(@NotNull TypedArray typedArray, int index, float defValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float dimension = typedArray.getDimension(index, defValue);
        a(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(@NotNull TypedArray typedArray, int index, float defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        float f6 = typedArray.getFloat(index, defaultValue);
        a(typedArray.getChangingConfigurations());
        return f6;
    }

    public final int getInt(@NotNull TypedArray typedArray, int index, int defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        int i10 = typedArray.getInt(index, defaultValue);
        a(typedArray.getChangingConfigurations());
        return i10;
    }

    public final boolean getNamedBoolean(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int resId, boolean defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        boolean namedBoolean = TypedArrayUtils.getNamedBoolean(typedArray, this.xmlParser, attrName, resId, defaultValue);
        a(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    @Nullable
    public final ColorStateList getNamedColorStateList(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String attrName, @StyleableRes int resId) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, this.xmlParser, theme, attrName, resId);
        a(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }

    @NotNull
    public final ComplexColorCompat getNamedComplexColor(@NotNull TypedArray typedArray, @Nullable Resources.Theme theme, @NotNull String attrName, @StyleableRes int resId, @ColorInt int defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        ComplexColorCompat result = TypedArrayUtils.getNamedComplexColor(typedArray, this.xmlParser, theme, attrName, resId, defaultValue);
        a(typedArray.getChangingConfigurations());
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public final float getNamedFloat(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int resId, float defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, this.xmlParser, attrName, resId, defaultValue);
        a(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final int getNamedInt(@NotNull TypedArray typedArray, @NotNull String attrName, @StyleableRes int resId, int defaultValue) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(attrName, "attrName");
        int namedInt = TypedArrayUtils.getNamedInt(typedArray, this.xmlParser, attrName, resId, defaultValue);
        a(typedArray.getChangingConfigurations());
        return namedInt;
    }

    @Nullable
    public final String getString(@NotNull TypedArray typedArray, int index) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        String string = typedArray.getString(index);
        a(typedArray.getChangingConfigurations());
        return string;
    }

    @NotNull
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public int hashCode() {
        return (this.xmlParser.hashCode() * 31) + this.config;
    }

    @NotNull
    public final TypedArray obtainAttributes(@NotNull Resources res, @Nullable Resources.Theme theme, @NotNull AttributeSet set, @NotNull int[] attrs) {
        Intrinsics.checkNotNullParameter(res, "res");
        Intrinsics.checkNotNullParameter(set, "set");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(res, theme, set, attrs);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(\n      …          attrs\n        )");
        a(typedArrayObtainAttributes.getChangingConfigurations());
        return typedArrayObtainAttributes;
    }

    public final void setConfig(int i10) {
        this.config = i10;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.xmlParser);
        sb2.append(", config=");
        return a.d(sb2, this.config, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }
}
