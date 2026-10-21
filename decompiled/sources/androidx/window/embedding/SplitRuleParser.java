package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.webkit.ProxyConfig;
import androidx.window.R;
import androidx.window.core.ExperimentalWindowApi;
import bk.w;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: SplitRuleParser.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/window/embedding/SplitRuleParser;", "", "Landroid/content/Context;", "context", "", "staticRuleResourceId", "", "Landroidx/window/embedding/EmbeddingRule;", "parseSplitRules$window_release", "(Landroid/content/Context;I)Ljava/util/Set;", "parseSplitRules", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SplitRuleParser {
    public static ComponentName a(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Activity name must not be null");
        }
        String string = str.toString();
        if (string.charAt(0) == '.') {
            return new ComponentName(str2, Intrinsics.stringPlus(str2, string));
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, JsonPointer.SEPARATOR, 0, false, 6, (Object) null);
        if (iIndexOf$default > 0) {
            str2 = string.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            string = string.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(string, "this as java.lang.String).substring(startIndex)");
        }
        if (Intrinsics.areEqual(string, ProxyConfig.MATCH_ALL_SCHEMES) || StringsKt__StringsKt.indexOf$default((CharSequence) string, '.', 0, false, 6, (Object) null) >= 0) {
            return new ComponentName(str2, string);
        }
        return new ComponentName(str2, str2 + '.' + string);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public final Set<EmbeddingRule> parseSplitRules$window_release(@NotNull Context context, int staticRuleResourceId) throws XmlPullParserException, IOException {
        SplitPairRule splitPairRule;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            XmlResourceParser xml = context.getResources().getXml(staticRuleResourceId);
            Intrinsics.checkNotNullExpressionValue(xml, "resources.getXml(splitResourceId)");
            HashSet hashSet = new HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            ActivityRule activityRule = null;
            SplitPairRule splitPairRule2 = null;
            SplitPlaceholderRule splitPlaceholderRule = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || Intrinsics.areEqual("split-config", xml.getName())) {
                    next = xml.next();
                } else {
                    String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (activityRule == null && splitPlaceholderRule == null) {
                                        throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                    TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(xml, R.styleable.ActivityFilter, 0, 0);
                                    String string = typedArrayObtainStyledAttributes.getString(R.styleable.ActivityFilter_activityName);
                                    String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.ActivityFilter_activityAction);
                                    String packageName = context.getApplicationContext().getPackageName();
                                    Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                                    ActivityFilter activityFilter = new ActivityFilter(a(string, packageName), string2);
                                    if (activityRule != null) {
                                        hashSet.remove(activityRule);
                                        ActivityRule activityRulePlus$window_release = activityRule.plus$window_release(activityFilter);
                                        hashSet.add(activityRulePlus$window_release);
                                        activityRule = activityRulePlus$window_release;
                                    } else if (splitPlaceholderRule != null) {
                                        hashSet.remove(splitPlaceholderRule);
                                        SplitPlaceholderRule splitPlaceholderRulePlus$window_release = splitPlaceholderRule.plus$window_release(activityFilter);
                                        hashSet.add(splitPlaceholderRulePlus$window_release);
                                        splitPlaceholderRule = splitPlaceholderRulePlus$window_release;
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(xml, R.styleable.SplitPairRule, 0, 0);
                                    float f6 = typedArrayObtainStyledAttributes2.getFloat(R.styleable.SplitPairRule_splitRatio, 0.0f);
                                    splitPairRule = new SplitPairRule(w.emptySet(), typedArrayObtainStyledAttributes2.getBoolean(R.styleable.SplitPairRule_finishPrimaryWithSecondary, false), typedArrayObtainStyledAttributes2.getBoolean(R.styleable.SplitPairRule_finishSecondaryWithPrimary, true), typedArrayObtainStyledAttributes2.getBoolean(R.styleable.SplitPairRule_clearTop, false), (int) typedArrayObtainStyledAttributes2.getDimension(R.styleable.SplitPairRule_splitMinWidth, 0.0f), (int) typedArrayObtainStyledAttributes2.getDimension(R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f), f6, typedArrayObtainStyledAttributes2.getInt(R.styleable.SplitPairRule_splitLayoutDirection, 3));
                                    hashSet.add(splitPairRule);
                                    activityRule = null;
                                    splitPlaceholderRule = null;
                                    splitPairRule2 = splitPairRule;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (splitPairRule2 == null) {
                                        throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                    TypedArray typedArrayObtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(xml, R.styleable.SplitPairFilter, 0, 0);
                                    String string3 = typedArrayObtainStyledAttributes3.getString(R.styleable.SplitPairFilter_primaryActivityName);
                                    String string4 = typedArrayObtainStyledAttributes3.getString(R.styleable.SplitPairFilter_secondaryActivityName);
                                    String string5 = typedArrayObtainStyledAttributes3.getString(R.styleable.SplitPairFilter_secondaryActivityAction);
                                    String packageName2 = context.getApplicationContext().getPackageName();
                                    Intrinsics.checkNotNullExpressionValue(packageName2, "packageName");
                                    SplitPairFilter splitPairFilter = new SplitPairFilter(a(string3, packageName2), a(string4, packageName2), string5);
                                    hashSet.remove(splitPairRule2);
                                    splitPairRule = splitPairRule2.plus$window_release(splitPairFilter);
                                    hashSet.add(splitPairRule);
                                    splitPairRule2 = splitPairRule;
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    activityRule = new ActivityRule(w.emptySet(), context.getTheme().obtainStyledAttributes(xml, R.styleable.ActivityRule, 0, 0).getBoolean(R.styleable.ActivityRule_alwaysExpand, false));
                                    hashSet.add(activityRule);
                                    splitPairRule2 = null;
                                    splitPlaceholderRule = null;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    TypedArray typedArrayObtainStyledAttributes4 = context.getTheme().obtainStyledAttributes(xml, R.styleable.SplitPlaceholderRule, 0, 0);
                                    String string6 = typedArrayObtainStyledAttributes4.getString(R.styleable.SplitPlaceholderRule_placeholderActivityName);
                                    float f10 = typedArrayObtainStyledAttributes4.getFloat(R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
                                    int dimension = (int) typedArrayObtainStyledAttributes4.getDimension(R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
                                    int dimension2 = (int) typedArrayObtainStyledAttributes4.getDimension(R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
                                    int i10 = typedArrayObtainStyledAttributes4.getInt(R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
                                    String packageName3 = context.getApplicationContext().getPackageName();
                                    Intrinsics.checkNotNullExpressionValue(packageName3, "packageName");
                                    ComponentName componentNameA = a(string6, packageName3);
                                    Set setEmptySet = w.emptySet();
                                    Intent component = new Intent().setComponent(componentNameA);
                                    Intrinsics.checkNotNullExpressionValue(component, "Intent().setComponent(pl…eholderActivityClassName)");
                                    SplitPlaceholderRule splitPlaceholderRule2 = new SplitPlaceholderRule(setEmptySet, component, dimension, dimension2, f10, i10);
                                    hashSet.add(splitPlaceholderRule2);
                                    splitPairRule2 = null;
                                    splitPlaceholderRule = splitPlaceholderRule2;
                                    activityRule = null;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
