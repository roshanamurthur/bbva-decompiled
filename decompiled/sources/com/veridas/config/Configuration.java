package com.veridas.config;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.camera.camera2.internal.compat.u;
import androidx.lifecycle.SavedStateHandle;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.google.pay.GoogleTapAndPay;
import com.veridas.config.parser.BooleanParser;
import com.veridas.config.parser.ColorParser;
import com.veridas.config.parser.DisplayOrientationParser;
import com.veridas.config.parser.DoubleParser;
import com.veridas.config.parser.FloatParser;
import com.veridas.config.parser.IntParser;
import com.veridas.config.parser.LongParser;
import com.veridas.config.validator.BooleanValidator;
import com.veridas.config.validator.ColorValidator;
import com.veridas.config.validator.DisplayOrientationValidator;
import com.veridas.config.validator.DoubleValidator;
import com.veridas.config.validator.FloatValidator;
import com.veridas.config.validator.IntValidator;
import com.veridas.config.validator.LongValidator;
import com.veridas.config.validator.StringValidator;
import com.veridas.config.validator.Validator;
import com.veridas.display.DisplayOrientation;
import com.veridas.log.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u0000 m2\u00020\u0001:\u0001mB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0004J\u000e\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0007J\u000e\u0010<\u001a\u00020=2\u0006\u0010;\u001a\u00020\u0007J\u0006\u0010>\u001a\u00020\u0013J\u000e\u0010?\u001a\u00020@2\u0006\u0010;\u001a\u00020\u0007J\u000e\u0010A\u001a\u00020B2\u0006\u0010;\u001a\u00020\u0007J\u000e\u0010C\u001a\u00020D2\u0006\u0010;\u001a\u00020\u0007J\u0010\u0010E\u001a\u00020\u00072\u0006\u0010F\u001a\u00020\u0007H\u0014J\u000e\u0010G\u001a\u00020=2\u0006\u0010;\u001a\u00020\u0007J\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u00070Ij\b\u0012\u0004\u0012\u00020\u0007`JJ\u000e\u0010K\u001a\u00020L2\u0006\u0010;\u001a\u00020\u0007J\b\u0010M\u001a\u00020\u0007H\u0014J\u0010\u0010N\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u0007H\u0002J\b\u0010O\u001a\u00020\u0007H\u0014J\u0010\u0010P\u001a\u0004\u0018\u00010\u00072\u0006\u0010;\u001a\u00020\u0007J\u0016\u0010Q\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010;\u001a\u00020\u0007J\u0010\u0010R\u001a\u00020:2\u0006\u0010F\u001a\u00020\u0007H\u0014J\u0010\u0010S\u001a\u0002062\u0006\u0010\u0002\u001a\u00020\u0003H$J\u0010\u0010T\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0007H\u0014J\u0010\u0010U\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0007H\u0014J\u000e\u0010V\u001a\u0002062\u0006\u0010W\u001a\u00020XJ\u000e\u0010V\u001a\u0002062\u0006\u0010Y\u001a\u00020ZJ\u000e\u0010V\u001a\u0002062\u0006\u0010[\u001a\u00020\\J\u001a\u0010V\u001a\u0002062\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070^J\b\u0010_\u001a\u000206H\u0002J\u001a\u0010`\u001a\u0002062\u0006\u0010;\u001a\u00020\u00072\b\u0010a\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010b\u001a\u0002062\u0006\u0010;\u001a\u00020\u00072\b\u0010a\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010c\u001a\u0002062\u0006\u0010;\u001a\u00020\u00072\b\u0010a\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010d\u001a\u0002062\u0006\u0010;\u001a\u00020\u00072\b\u0010a\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010e\u001a\u0002062\u0006\u0010;\u001a\u00020\u00072\b\u0010a\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010f\u001a\u0002062\u0006\u0010;\u001a\u00020\u00072\b\u0010a\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010g\u001a\u0002062\u0006\u0010;\u001a\u00020\u00072\b\u0010a\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010h\u001a\u0002062\u0006\u0010;\u001a\u00020\u00072\b\u0010a\u001a\u0004\u0018\u00010\u0007H\u0014J\u001a\u0010i\u001a\u0002062\u0006\u0010;\u001a\u00020\u00072\b\u0010a\u001a\u0004\u0018\u00010\u0007H\u0014J\u0016\u0010j\u001a\u0002062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070kH\u0014J\u000e\u0010l\u001a\u0002062\u0006\u0010W\u001a\u00020XJ\u000e\u0010l\u001a\u0002062\u0006\u0010Y\u001a\u00020ZJ\u000e\u0010l\u001a\u0002062\u0006\u0010[\u001a\u00020\\R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020\u0013X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0015R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020-0\u0006X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\tR\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000700X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006n"}, d2 = {"Lcom/veridas/config/Configuration;", "", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "aliases", "", "", "getAliases", "()Ljava/util/Map;", "booleanParser", "Lcom/veridas/config/parser/BooleanParser;", "booleanValidator", "Lcom/veridas/config/validator/BooleanValidator;", "colorParser", "Lcom/veridas/config/parser/ColorParser;", "colorValidator", "Lcom/veridas/config/validator/ColorValidator;", "defaultProperties", "Ljava/util/Properties;", "getDefaultProperties", "()Ljava/util/Properties;", "displayOrientationParser", "Lcom/veridas/config/parser/DisplayOrientationParser;", "displayOrientationValidator", "Lcom/veridas/config/validator/DisplayOrientationValidator;", "doubleParser", "Lcom/veridas/config/parser/DoubleParser;", "doubleValidator", "Lcom/veridas/config/validator/DoubleValidator;", "floatParser", "Lcom/veridas/config/parser/FloatParser;", "floatValidator", "Lcom/veridas/config/validator/FloatValidator;", "intParser", "Lcom/veridas/config/parser/IntParser;", "integerValidator", "Lcom/veridas/config/validator/IntValidator;", "longParser", "Lcom/veridas/config/parser/LongParser;", "longValidator", "Lcom/veridas/config/validator/LongValidator;", LogKeysKt.PROPERTIES, "getProperties", "propertyValidators", "Lcom/veridas/config/validator/Validator;", "getPropertyValidators", "protectedProperties", "", "getProtectedProperties", "()Ljava/util/List;", "stringValidator", "Lcom/veridas/config/validator/StringValidator;", "addAliasFor", "", "key", GoogleTapAndPay.KEY_ALIAS, "getBoolean", "", "name", "getColor", "", "getConfiguredProperties", "getDisplayOrientation", "Lcom/veridas/display/DisplayOrientation;", "getDouble", "", "getFloat", "", "getFullPropertyName", "propertyName", "getInteger", "getKeys", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getLong", "", "getNamespace", "getPropertyNameFromAlias", "getPropertyNamePrefix", "getString", "getStringFromResources", "hasValidatorForPropertyName", "initialize", "isExistingProperty", "isProtectedProperty", "load", "intent", "Landroid/content/Intent;", "bundle", "Landroid/os/Bundle;", "state", "Landroidx/lifecycle/SavedStateHandle;", "map", "", "loadDefaults", "setDefaultBooleanProperty", "value", "setDefaultColorProperty", "setDefaultDisplayOrientationProperty", "setDefaultDoubleProperty", "setDefaultFloatProperty", "setDefaultIntegerProperty", "setDefaultLongProperty", "setDefaultStringProperty", "setProperty", "setProtectedProperties", "", "store", "Companion", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Configuration {

    @NotNull
    public static final String LANDSCAPE = "landscape";

    @NotNull
    public static final String NO = "NO";

    @NotNull
    public static final String PORTRAIT = "portrait";

    @NotNull
    public static final String UNDEFINED = "undefined";

    @NotNull
    public static final String YES = "YES";

    @NotNull
    private final Map<String, String> aliases;

    @NotNull
    private final BooleanParser booleanParser;

    @NotNull
    private final BooleanValidator booleanValidator;

    @NotNull
    private final ColorParser colorParser;

    @NotNull
    private final ColorValidator colorValidator;

    @NotNull
    private final Properties defaultProperties;

    @NotNull
    private final DisplayOrientationParser displayOrientationParser;

    @NotNull
    private final DisplayOrientationValidator displayOrientationValidator;

    @NotNull
    private final DoubleParser doubleParser;

    @NotNull
    private final DoubleValidator doubleValidator;

    @NotNull
    private final FloatParser floatParser;

    @NotNull
    private final FloatValidator floatValidator;

    @NotNull
    private final IntParser intParser;

    @NotNull
    private final IntValidator integerValidator;

    @NotNull
    private final LongParser longParser;

    @NotNull
    private final LongValidator longValidator;

    @NotNull
    private final Properties properties;

    @NotNull
    private final Map<String, Validator> propertyValidators;

    @NotNull
    private final List<String> protectedProperties;

    @NotNull
    private final StringValidator stringValidator;

    public Configuration(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.booleanParser = new BooleanParser();
        this.colorParser = new ColorParser();
        this.displayOrientationParser = new DisplayOrientationParser();
        this.doubleParser = new DoubleParser();
        this.floatParser = new FloatParser();
        this.intParser = new IntParser();
        this.longParser = new LongParser();
        this.booleanValidator = new BooleanValidator();
        this.colorValidator = new ColorValidator();
        this.displayOrientationValidator = new DisplayOrientationValidator();
        this.doubleValidator = new DoubleValidator();
        this.floatValidator = new FloatValidator();
        this.integerValidator = new IntValidator();
        this.longValidator = new LongValidator();
        this.stringValidator = new StringValidator();
        this.defaultProperties = new Properties();
        this.properties = new Properties();
        this.propertyValidators = new LinkedHashMap();
        this.protectedProperties = new ArrayList();
        this.aliases = new LinkedHashMap();
        initialize(resources);
        loadDefaults();
    }

    private final String getPropertyNameFromAlias(String alias) {
        if (!this.aliases.keySet().contains(alias)) {
            return alias;
        }
        String str = this.aliases.get(alias);
        Intrinsics.checkNotNull(str);
        String str2 = str;
        Log.w(ConfigurationKt.f66676a, ConfigurationKt.MSG_DEPRECATED_CONFIGURATION_KEY, alias, str2);
        return str2;
    }

    private final void loadDefaults() {
        for (String str : this.defaultProperties.stringPropertyNames()) {
            this.properties.put(str, this.defaultProperties.get(str));
        }
    }

    public final void addAliasFor(@NotNull String key, @NotNull String alias) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.aliases.put(alias, key);
    }

    @NotNull
    public final Map<String, String> getAliases() {
        return this.aliases;
    }

    public final boolean getBoolean(@NotNull String name) throws PropertyNameNotFoundException {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isExistingProperty(name)) {
            return this.booleanParser.parse(this.properties.getProperty(name)).booleanValue();
        }
        throw new PropertyNameNotFoundException(name);
    }

    public final int getColor(@NotNull String name) throws IllegalColorValueException, PropertyNameNotFoundException {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isExistingProperty(name)) {
            return this.colorParser.parse(this.properties.getProperty(name)).intValue();
        }
        throw new PropertyNameNotFoundException(name);
    }

    @NotNull
    public final Properties getConfiguredProperties() {
        Properties properties = new Properties();
        properties.putAll(this.properties);
        return properties;
    }

    @NotNull
    public final Properties getDefaultProperties() {
        return this.defaultProperties;
    }

    @NotNull
    public final DisplayOrientation getDisplayOrientation(@NotNull String name) throws InvalidDisplayOrientationException, PropertyNameNotFoundException {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isExistingProperty(name)) {
            return this.displayOrientationParser.parse(this.properties.getProperty(name));
        }
        throw new PropertyNameNotFoundException(name);
    }

    public final double getDouble(@NotNull String name) throws PropertyNameNotFoundException, NumberFormatException {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isExistingProperty(name)) {
            return this.doubleParser.parse(this.properties.getProperty(name)).doubleValue();
        }
        throw new PropertyNameNotFoundException(name);
    }

    public final float getFloat(@NotNull String name) throws PropertyNameNotFoundException, NumberFormatException {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isExistingProperty(name)) {
            return this.floatParser.parse(this.properties.getProperty(name)).floatValue();
        }
        throw new PropertyNameNotFoundException(name);
    }

    @NotNull
    public String getFullPropertyName(@NotNull String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        return u.f(getPropertyNamePrefix(), propertyName);
    }

    public final int getInteger(@NotNull String name) throws PropertyNameNotFoundException, NumberFormatException {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isExistingProperty(name)) {
            return this.intParser.parse(this.properties.getProperty(name)).intValue();
        }
        throw new PropertyNameNotFoundException(name);
    }

    @NotNull
    public final ArrayList<String> getKeys() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : this.defaultProperties.stringPropertyNames()) {
            Intrinsics.checkNotNull(str);
            if (!isProtectedProperty(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public final long getLong(@NotNull String name) throws PropertyNameNotFoundException, NumberFormatException {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isExistingProperty(name)) {
            return this.longParser.parse(this.properties.getProperty(name)).longValue();
        }
        throw new PropertyNameNotFoundException(name);
    }

    @NotNull
    public String getNamespace() {
        return String.valueOf(Reflection.getOrCreateKotlinClass(getClass()).getQualifiedName());
    }

    @NotNull
    public final Properties getProperties() {
        return this.properties;
    }

    @NotNull
    public String getPropertyNamePrefix() {
        return u.f(getNamespace(), Constant.DOT_STRING);
    }

    @NotNull
    public final Map<String, Validator> getPropertyValidators() {
        return this.propertyValidators;
    }

    @NotNull
    public final List<String> getProtectedProperties() {
        return this.protectedProperties;
    }

    @Nullable
    public final String getString(@NotNull String name) throws PropertyNameNotFoundException {
        Intrinsics.checkNotNullParameter(name, "name");
        if (isExistingProperty(name)) {
            return this.properties.getProperty(name);
        }
        throw new PropertyNameNotFoundException(name);
    }

    @NotNull
    public final String getStringFromResources(@NotNull Resources resources, @NotNull String name) throws PropertyNameNotFoundException, NumberFormatException {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(name, "name");
        if (!isExistingProperty(name)) {
            throw new PropertyNameNotFoundException(name);
        }
        String string = resources.getString(this.intParser.parse(this.properties.getProperty(name)).intValue());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public boolean hasValidatorForPropertyName(@NotNull String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        return this.propertyValidators.containsKey(propertyName);
    }

    public abstract void initialize(@NotNull Resources resources);

    public boolean isExistingProperty(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.defaultProperties.containsKey(name);
    }

    public boolean isProtectedProperty(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.protectedProperties.contains(name);
    }

    public final void load(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        for (String str : this.defaultProperties.stringPropertyNames()) {
            Intrinsics.checkNotNull(str);
            String fullPropertyName = getFullPropertyName(str);
            if (!isProtectedProperty(str) && bundle.containsKey(fullPropertyName)) {
                setProperty(str, bundle.getString(fullPropertyName));
            }
        }
    }

    public void setDefaultBooleanProperty(@NotNull String name, @Nullable String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.booleanValidator.validate(value)) {
            Log.w(ConfigurationKt.f66676a, ConfigurationKt.MSG_INVALID_BOOLEAN, value, name);
        } else {
            this.propertyValidators.put(name, this.booleanValidator);
            this.defaultProperties.setProperty(name, value);
        }
    }

    public void setDefaultColorProperty(@NotNull String name, @Nullable String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.propertyValidators.put(name, this.colorValidator);
        if (!this.colorValidator.validate(value)) {
            Log.w(ConfigurationKt.f66676a, ConfigurationKt.MSG_INVALID_COLOR, value, name);
            value = ConfigurationKt.COLOR_TRANSPARENT;
        }
        this.defaultProperties.setProperty(name, value);
    }

    public void setDefaultDisplayOrientationProperty(@NotNull String name, @Nullable String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.displayOrientationValidator.validate(value)) {
            Log.w(ConfigurationKt.f66676a, ConfigurationKt.MSG_INVALID_DSPL_ORIENTATION, value, name);
        } else {
            this.propertyValidators.put(name, this.displayOrientationValidator);
            this.defaultProperties.setProperty(name, value);
        }
    }

    public void setDefaultDoubleProperty(@NotNull String name, @Nullable String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.doubleValidator.validate(value)) {
            Log.w(ConfigurationKt.f66676a, ConfigurationKt.MSG_INVALID_DOUBLE, value, name);
        } else {
            this.propertyValidators.put(name, this.doubleValidator);
            this.defaultProperties.setProperty(name, value);
        }
    }

    public void setDefaultFloatProperty(@NotNull String name, @Nullable String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.floatValidator.validate(value)) {
            Log.w(ConfigurationKt.f66676a, ConfigurationKt.MSG_INVALID_FLOAT, value, name);
        } else {
            this.propertyValidators.put(name, this.floatValidator);
            this.defaultProperties.setProperty(name, value);
        }
    }

    public void setDefaultIntegerProperty(@NotNull String name, @Nullable String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.integerValidator.validate(value)) {
            Log.w(ConfigurationKt.f66676a, ConfigurationKt.MSG_INVALID_INTEGER, value, name);
        } else {
            this.propertyValidators.put(name, this.integerValidator);
            this.defaultProperties.setProperty(name, value);
        }
    }

    public void setDefaultLongProperty(@NotNull String name, @Nullable String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.longValidator.validate(value)) {
            Log.w(ConfigurationKt.f66676a, ConfigurationKt.MSG_INVALID_LONG, value, name);
        } else {
            this.propertyValidators.put(name, this.longValidator);
            this.defaultProperties.setProperty(name, value);
        }
    }

    public void setDefaultStringProperty(@NotNull String name, @Nullable String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.stringValidator.validate(value)) {
            Log.w(ConfigurationKt.f66676a, ConfigurationKt.MSG_INVALID_STRING, value, name);
        } else {
            this.propertyValidators.put(name, this.stringValidator);
            this.defaultProperties.setProperty(name, value);
        }
    }

    public void setProperty(@NotNull String name, @Nullable String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!hasValidatorForPropertyName(name)) {
            Log.w(ConfigurationKt.f66676a, ConfigurationKt.MSG_NO_PROPERTY_VALIDATOR_AVAILABLE, name);
            return;
        }
        Validator validator = this.propertyValidators.get(name);
        Intrinsics.checkNotNull(validator);
        if (validator.validate(value)) {
            this.properties.setProperty(name, value);
            return;
        }
        String str = ConfigurationKt.f66676a;
        Validator validator2 = this.propertyValidators.get(name);
        Intrinsics.checkNotNull(validator2);
        Log.w(str, ConfigurationKt.MSG_INVALID_PROPERTY, value, name, Reflection.getOrCreateKotlinClass(validator2.getClass()).getSimpleName());
    }

    public void setProtectedProperties(@NotNull List<String> protectedProperties) {
        Intrinsics.checkNotNullParameter(protectedProperties, "protectedProperties");
        this.protectedProperties.clear();
        this.protectedProperties.addAll(protectedProperties);
    }

    public final void store(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        for (String str : this.defaultProperties.stringPropertyNames()) {
            Intrinsics.checkNotNull(str);
            bundle.putString(getFullPropertyName(str), this.properties.getProperty(str));
        }
    }

    public final void load(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        for (String str : this.defaultProperties.stringPropertyNames()) {
            Intrinsics.checkNotNull(str);
            String fullPropertyName = getFullPropertyName(str);
            if (!isProtectedProperty(str) && intent.hasExtra(fullPropertyName)) {
                setProperty(str, intent.getStringExtra(fullPropertyName));
            }
        }
    }

    public final void store(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        for (String str : this.defaultProperties.stringPropertyNames()) {
            Intrinsics.checkNotNull(str);
            intent.putExtra(getFullPropertyName(str), this.properties.getProperty(str));
        }
    }

    public final void load(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        for (String str : map.keySet()) {
            String propertyNameFromAlias = getPropertyNameFromAlias(str);
            if (!isProtectedProperty(propertyNameFromAlias) && isExistingProperty(propertyNameFromAlias)) {
                setProperty(propertyNameFromAlias, map.get(str));
            }
        }
    }

    public final void store(@NotNull SavedStateHandle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        for (String str : this.defaultProperties.stringPropertyNames()) {
            Intrinsics.checkNotNull(str);
            state.set(getFullPropertyName(str), this.properties.getProperty(str));
        }
    }

    public final void load(@NotNull SavedStateHandle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        for (String str : this.defaultProperties.stringPropertyNames()) {
            Intrinsics.checkNotNull(str);
            String fullPropertyName = getFullPropertyName(str);
            if (!isProtectedProperty(str) && state.contains(fullPropertyName)) {
                setProperty(str, (String) state.get(fullPropertyName));
            }
        }
    }
}
