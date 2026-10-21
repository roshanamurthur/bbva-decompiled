package com.mastercard.sonic.androidsvg;

import android.util.Log;
import androidx.webkit.ProxyConfig;
import com.bbva.cellswidgets.MaskTextWatcher;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.nativesettings.common.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.Typography;
import kotlin.text.l;
import kotlin.time.DurationKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: CSSParser.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0015\u0014\u0015\u0016\u0017\u0013\u0018\u0019\u0007\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B!\b\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0013\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006'"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser;", "", "", "sheet", "Lcom/mastercard/sonic/androidsvg/CSSParser$Ruleset;", "parse", "Lcom/mastercard/sonic/androidsvg/CSSParser$MediaType;", "a", "Lcom/mastercard/sonic/androidsvg/CSSParser$MediaType;", "getDeviceMediaType", "()Lcom/mastercard/sonic/androidsvg/CSSParser$MediaType;", "setDeviceMediaType", "(Lcom/mastercard/sonic/androidsvg/CSSParser$MediaType;)V", "deviceMediaType", "Lcom/mastercard/sonic/androidsvg/CSSParser$Source;", "source", "<init>", "(Lcom/mastercard/sonic/androidsvg/CSSParser$MediaType;Lcom/mastercard/sonic/androidsvg/CSSParser$Source;)V", "(Lcom/mastercard/sonic/androidsvg/CSSParser$Source;)V", "Companion", "Attrib", "AttribOp", "CSSTextScanner", "Combinator", "MediaType", "PseudoClass", "b", "PseudoClassIdents", "c", "d", "e", "f", "g", "Rule", "RuleMatchContext", "Ruleset", "Selector", "SimpleSelector", "Source", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class CSSParser {

    @NotNull
    public static final String CSS_MIME_TYPE = "text/css";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MediaType deviceMediaType;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Source f51127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f51128c;

    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$Attrib;", "", "", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "Lcom/mastercard/sonic/androidsvg/CSSParser$AttribOp;", "b", "Lcom/mastercard/sonic/androidsvg/CSSParser$AttribOp;", "getOperation", "()Lcom/mastercard/sonic/androidsvg/CSSParser$AttribOp;", "operation", "c", "getValue", "value", "<init>", "(Ljava/lang/String;Lcom/mastercard/sonic/androidsvg/CSSParser$AttribOp;Ljava/lang/String;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Attrib {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final AttribOp operation;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final String value;

        public Attrib(@NotNull String name, @NotNull AttribOp operation, @Nullable String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.name = name;
            this.operation = operation;
            this.value = str;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final AttribOp getOperation() {
            return this.operation;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$AttribOp;", "", "EXISTS", "EQUALS", "INCLUDES", "DASHMATCH", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class AttribOp {
        private static final /* synthetic */ AttribOp[] $VALUES;
        public static final AttribOp DASHMATCH;
        public static final AttribOp EQUALS;
        public static final AttribOp EXISTS;
        public static final AttribOp INCLUDES;

        static {
            AttribOp attribOp = new AttribOp("EXISTS", 0);
            EXISTS = attribOp;
            AttribOp attribOp2 = new AttribOp("EQUALS", 1);
            EQUALS = attribOp2;
            AttribOp attribOp3 = new AttribOp("INCLUDES", 2);
            INCLUDES = attribOp3;
            AttribOp attribOp4 = new AttribOp("DASHMATCH", 3);
            DASHMATCH = attribOp4;
            $VALUES = new AttribOp[]{attribOp, attribOp2, attribOp3, attribOp4};
        }

        public AttribOp() {
            throw null;
        }

        public static AttribOp valueOf(String str) {
            return (AttribOp) Enum.valueOf(AttribOp.class, str);
        }

        public static AttribOp[] values() {
            return (AttribOp[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\n\u001a\u0004\u0018\u00010\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\u0002¨\u0006\u0012"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$CSSTextScanner;", "Lcom/mastercard/sonic/androidsvg/SVGParser$TextScanner;", "", "nextIdentifier", "", "Lcom/mastercard/sonic/androidsvg/CSSParser$Selector;", "nextSelectorGroup", "selector", "", "nextSimpleSelector", "nextPropertyValue", "nextCSSString", "nextURL", "nextLegacyURL", "input", "<init>", "(Ljava/lang/String;)V", "a", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class CSSTextScanner extends SVGParser.TextScanner {

        /* JADX INFO: compiled from: CSSParser.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PseudoClassIdents.values().length];
                try {
                    iArr[PseudoClassIdents.first_child.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PseudoClassIdents.last_child.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PseudoClassIdents.only_child.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PseudoClassIdents.first_of_type.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PseudoClassIdents.last_of_type.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PseudoClassIdents.only_of_type.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[PseudoClassIdents.root.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[PseudoClassIdents.empty.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[PseudoClassIdents.nth_child.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[PseudoClassIdents.nth_last_child.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[PseudoClassIdents.nth_of_type.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[PseudoClassIdents.not.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[PseudoClassIdents.target.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[PseudoClassIdents.lang.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[PseudoClassIdents.link.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[PseudoClassIdents.visited.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[PseudoClassIdents.hover.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[PseudoClassIdents.active.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[PseudoClassIdents.focus.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[PseudoClassIdents.enabled.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[PseudoClassIdents.disabled.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[PseudoClassIdents.checked.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[PseudoClassIdents.indeterminate.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: compiled from: CSSParser.kt */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f51132a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f51133b;

            public a(int i10, int i11) {
                this.f51132a = i10;
                this.f51133b = i11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CSSTextScanner(@NotNull String input) {
            super(new Regex("(?s)/\\*.*?\\*/").replace(input, ""));
            Intrinsics.checkNotNullParameter(input, "input");
        }

        public static int a(int i10) {
            if (i10 >= 48 && i10 <= 57) {
                return i10 - 48;
            }
            if (i10 >= 65 && i10 <= 70) {
                return i10 - 55;
            }
            if (i10 < 97 || i10 > 102) {
                return -1;
            }
            return i10 - 87;
        }

        @Nullable
        public final String nextCSSString() {
            if (empty()) {
                return null;
            }
            Integer numValueOf = Integer.valueOf(getInput().charAt(getPosition()));
            if (numValueOf.intValue() != 39 && numValueOf.intValue() != 34) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            setPosition(getPosition() + 1);
            Integer numNextChar = nextChar();
            while (true) {
                if ((numNextChar != null && numNextChar.intValue() == -1) || Intrinsics.areEqual(numNextChar, numValueOf)) {
                    break;
                }
                if (numNextChar != null && numNextChar.intValue() == 92) {
                    numNextChar = nextChar();
                    if (numNextChar == null || numNextChar.intValue() != -1) {
                        if ((numNextChar != null && numNextChar.intValue() == 10) || (numNextChar != null && numNextChar.intValue() == 13)) {
                            numNextChar = nextChar();
                        } else {
                            Intrinsics.checkNotNull(numNextChar);
                            int iA = a(numNextChar.intValue());
                            if (iA != -1) {
                                for (int i10 = 1; i10 < 6; i10++) {
                                    numNextChar = nextChar();
                                    Intrinsics.checkNotNull(numNextChar);
                                    int iA2 = a(numNextChar.intValue());
                                    if (iA2 == -1) {
                                        break;
                                    }
                                    iA = (iA * 16) + iA2;
                                }
                                sb2.append((char) iA);
                            }
                        }
                    }
                }
                sb2.append(numNextChar != null ? Character.valueOf((char) numNextChar.intValue()) : null);
                numNextChar = nextChar();
            }
            return sb2.toString();
        }

        @Nullable
        public final String nextIdentifier() {
            int position;
            if (empty()) {
                position = getPosition();
            } else {
                int position2 = getPosition();
                int position3 = getPosition();
                int iCharAt = getInput().charAt(getPosition());
                if (iCharAt == 45) {
                    iCharAt = advanceChar();
                }
                if ((iCharAt >= 65 && iCharAt <= 90) || ((iCharAt >= 97 && iCharAt <= 122) || iCharAt == 95)) {
                    int iAdvanceChar = advanceChar();
                    while (true) {
                        if ((iAdvanceChar < 65 || iAdvanceChar > 90) && ((iAdvanceChar < 97 || iAdvanceChar > 122) && !((iAdvanceChar >= 48 && iAdvanceChar <= 57) || iAdvanceChar == 45 || iAdvanceChar == 95))) {
                            break;
                        }
                        iAdvanceChar = advanceChar();
                    }
                    position3 = getPosition();
                }
                setPosition(position2);
                position = position3;
            }
            if (position == getPosition()) {
                return null;
            }
            String strSubstring = getInput().substring(getPosition(), position);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            setPosition(position);
            return strSubstring;
        }

        @Nullable
        public final String nextLegacyURL() {
            char cCharAt;
            int iA;
            StringBuilder sb2 = new StringBuilder();
            while (!empty() && (cCharAt = getInput().charAt(getPosition())) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !isWhitespace(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                setPosition(getPosition() + 1);
                if (cCharAt == '\\') {
                    if (!empty()) {
                        String input = getInput();
                        int position = getPosition();
                        setPosition(position + 1);
                        cCharAt = input.charAt(position);
                        if (cCharAt != '\n' && cCharAt != '\r') {
                            int iA2 = a(cCharAt);
                            if (iA2 != -1) {
                                for (int i10 = 1; i10 < 6 && !empty() && (iA = a(getInput().charAt(getPosition()))) != -1; i10++) {
                                    setPosition(getPosition() + 1);
                                    iA2 = (iA2 * 16) + iA;
                                }
                                sb2.append((char) iA2);
                            }
                        }
                    }
                }
                sb2.append(cCharAt);
            }
            if (sb2.length() == 0) {
                return null;
            }
            return sb2.toString();
        }

        @Nullable
        public final String nextPropertyValue() {
            if (empty()) {
                return null;
            }
            int position = getPosition();
            int position2 = getPosition();
            int iCharAt = getInput().charAt(getPosition());
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !isEOL(iCharAt)) {
                if (!isWhitespace(iCharAt)) {
                    position2 = getPosition() + 1;
                }
                iCharAt = advanceChar();
            }
            if (getPosition() <= position) {
                setPosition(position);
                return null;
            }
            String strSubstring = getInput().substring(position, position2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        @Nullable
        public final List<Selector> nextSelectorGroup() throws CSSParseException {
            if (empty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            Selector selector = new Selector();
            while (!empty() && nextSimpleSelector(selector)) {
                if (skipCommaWhitespace()) {
                    arrayList.add(selector);
                    selector = new Selector();
                }
            }
            if (!selector.isEmpty()) {
                arrayList.add(selector);
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:112:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:13:0x0038  */
        /* JADX WARN: Code duplicated, block: B:164:0x0294  */
        /* JADX WARN: Code duplicated, block: B:216:0x0378  */
        /* JADX WARN: Code duplicated, block: B:217:0x037a  */
        /* JADX WARN: Code duplicated, block: B:234:0x0443  */
        /* JADX WARN: Code duplicated, block: B:236:0x0448  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v16 */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v18, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r11v10, types: [com.mastercard.sonic.androidsvg.CSSParser$AttribOp] */
        /* JADX WARN: Type inference failed for: r11v18, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v19, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v23 */
        /* JADX WARN: Type inference failed for: r11v26 */
        /* JADX WARN: Type inference failed for: r11v27 */
        /* JADX WARN: Type inference failed for: r11v28 */
        /* JADX WARN: Type inference failed for: r11v29 */
        /* JADX WARN: Type inference failed for: r11v30 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Type inference failed for: r12v0 */
        /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r12v38 */
        /* JADX WARN: Type inference failed for: r12v39 */
        /* JADX WARN: Type inference failed for: r12v40 */
        /* JADX WARN: Type inference failed for: r12v5 */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r29v0, types: [com.mastercard.sonic.androidsvg.CSSParser$Selector, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Exception, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r6v13 */
        /* JADX WARN: Type inference failed for: r6v14 */
        /* JADX WARN: Type inference failed for: r6v15, types: [com.mastercard.sonic.androidsvg.CSSParser$CSSTextScanner$a] */
        /* JADX WARN: Type inference failed for: r6v16 */
        /* JADX WARN: Type inference failed for: r6v17 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r7v10, types: [com.mastercard.sonic.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r7v11, types: [com.mastercard.sonic.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r7v12, types: [com.mastercard.sonic.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r7v13, types: [com.mastercard.sonic.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r7v14, types: [com.mastercard.sonic.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v19 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6, types: [com.mastercard.sonic.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r7v7, types: [com.mastercard.sonic.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r7v8, types: [com.mastercard.sonic.androidsvg.CSSParser$SimpleSelector] */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final boolean nextSimpleSelector(@NotNull Selector selector) throws CSSParseException {
            Combinator combinator;
            ?? simpleSelector;
            ?? r11;
            AttribOp attribOp;
            AttribOp attribOp2;
            ?? r12;
            String strNextQuotedString;
            ?? NextIdentifier;
            AttribOp attribOp3;
            PseudoClass aVar;
            int i10;
            IntegerParser integerParser;
            a aVar2;
            ?? r10;
            ?? NextSelectorGroup;
            Intrinsics.checkNotNullParameter(selector, "selector");
            boolean z10 = false;
            if (empty()) {
                return false;
            }
            int position = getPosition();
            ?? r13 = 0;
            if (selector.isEmpty()) {
                combinator = null;
            } else if (consume(Typography.greater)) {
                combinator = Combinator.CHILD;
                skipWhitespace();
            } else if (consume('+')) {
                combinator = Combinator.FOLLOWS;
                skipWhitespace();
            } else {
                combinator = null;
            }
            if (consume('*')) {
                simpleSelector = new SimpleSelector(combinator, null);
            } else {
                String strNextIdentifier = nextIdentifier();
                if (strNextIdentifier != null) {
                    SimpleSelector simpleSelector2 = new SimpleSelector(combinator, strNextIdentifier);
                    selector.addedElement();
                    simpleSelector = simpleSelector2;
                } else {
                    simpleSelector = 0;
                }
            }
            while (!empty()) {
                if (consume('.')) {
                    if (simpleSelector == 0) {
                        simpleSelector = new SimpleSelector(combinator, r13);
                    }
                    String strNextIdentifier2 = nextIdentifier();
                    if (strNextIdentifier2 == null) {
                        throw new CSSParseException("Invalid \".class\" simpleSelectors", r13, 2, r13);
                    }
                    simpleSelector.addAttrib(Name.LABEL, AttribOp.EQUALS, strNextIdentifier2);
                    selector.addedAttributeOrPseudo();
                } else if (consume(MaskTextWatcher.WILDCARD)) {
                    if (simpleSelector == 0) {
                        simpleSelector = new SimpleSelector(combinator, r13);
                    }
                    String strNextIdentifier3 = nextIdentifier();
                    if (strNextIdentifier3 == null) {
                        throw new CSSParseException("Invalid \"#id\" simpleSelectors", r13, 2, r13);
                    }
                    simpleSelector.addAttrib("id", AttribOp.EQUALS, strNextIdentifier3);
                    selector.addedIdAttribute();
                } else if (consume(AbstractJsonLexerKt.BEGIN_LIST)) {
                    if (simpleSelector == 0) {
                        simpleSelector = new SimpleSelector(combinator, r13);
                    }
                    skipWhitespace();
                    String strNextIdentifier4 = nextIdentifier();
                    if (strNextIdentifier4 == null) {
                        throw new CSSParseException("Invalid attribute simpleSelectors", r13, 2, r13);
                    }
                    skipWhitespace();
                    if (consume('=')) {
                        attribOp3 = AttribOp.EQUALS;
                    } else if (consume("~=")) {
                        attribOp2 = AttribOp.INCLUDES;
                    } else if (consume("|=")) {
                        attribOp = AttribOp.DASHMATCH;
                    } else {
                        r11 = r13;
                    }
                    if (r11 != 0) {
                        r11 = attribOp;
                        r11 = attribOp2;
                        skipWhitespace();
                        if (empty()) {
                            NextIdentifier = r13;
                        } else {
                            strNextQuotedString = nextQuotedString();
                            if (strNextQuotedString == null) {
                                r11 = attribOp3;
                                NextIdentifier = strNextQuotedString;
                                NextIdentifier = nextIdentifier();
                            }
                        }
                        if (NextIdentifier == 0) {
                            r11 = attribOp3;
                            throw new CSSParseException("Invalid attribute simpleSelectors", r13, 2, r13);
                        }
                        r11 = attribOp3;
                        skipWhitespace();
                        r12 = NextIdentifier;
                    } else {
                        r11 = attribOp;
                        r11 = attribOp2;
                        r11 = attribOp3;
                        r12 = r13;
                    }
                    ?? r14 = r11;
                    if (!consume(AbstractJsonLexerKt.END_LIST)) {
                        throw new CSSParseException("Invalid attribute simpleSelectors", r13, 2, r13);
                    }
                    if (r11 == 0) {
                        r14 = AttribOp.EXISTS;
                    }
                    simpleSelector.addAttrib(strNextIdentifier4, r14, r12);
                    selector.addedAttributeOrPseudo();
                } else {
                    simpleSelector = simpleSelector;
                    if (!consume(AbstractJsonLexerKt.COLON)) {
                        if (simpleSelector != 0) {
                            selector.add(simpleSelector);
                            return true;
                        }
                        setPosition(position);
                        return false;
                    }
                    if (simpleSelector == 0) {
                        simpleSelector = new SimpleSelector(combinator, r13);
                    }
                    String strNextIdentifier5 = nextIdentifier();
                    if (strNextIdentifier5 == null) {
                        throw new CSSParseException("Invalid pseudo class", null, 2, null);
                    }
                    PseudoClassIdents pseudoClassIdentsFromString = PseudoClassIdents.Companion.fromString(strNextIdentifier5);
                    switch (WhenMappings.$EnumSwitchMapping$0[pseudoClassIdentsFromString.ordinal()]) {
                        case 1:
                            combinator = combinator;
                            aVar = new a(null, 0, 1, true, false);
                            selector.addedAttributeOrPseudo();
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                        case 2:
                            combinator = combinator;
                            aVar = new a(null, 0, 1, false, false);
                            selector.addedAttributeOrPseudo();
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                        case 3:
                            combinator = combinator;
                            aVar = new e(false, null);
                            selector.addedAttributeOrPseudo();
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                        case 4:
                            combinator = combinator;
                            aVar = new a(simpleSelector.getTag(), 0, 1, true, true);
                            selector.addedAttributeOrPseudo();
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                        case 5:
                            combinator = combinator;
                            aVar = new a(simpleSelector.getTag(), 0, 1, false, true);
                            selector.addedAttributeOrPseudo();
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                        case 6:
                            combinator = combinator;
                            aVar = new e(true, simpleSelector.getTag());
                            selector.addedAttributeOrPseudo();
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                        case 7:
                            combinator = combinator;
                            aVar = new f();
                            selector.addedAttributeOrPseudo();
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                        case 8:
                            combinator = combinator;
                            aVar = new b();
                            selector.addedAttributeOrPseudo();
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                            boolean z11 = (pseudoClassIdentsFromString == PseudoClassIdents.nth_child || pseudoClassIdentsFromString == PseudoClassIdents.nth_of_type) ? true : z10 ? 1 : 0;
                            boolean z12 = (pseudoClassIdentsFromString == PseudoClassIdents.nth_of_type || pseudoClassIdentsFromString == PseudoClassIdents.nth_last_of_type) ? true : z10 ? 1 : 0;
                            if (empty()) {
                                combinator = combinator;
                                r10 = r13;
                            } else {
                                int position2 = getPosition();
                                if (consume(RootService.OPEN_BRACKET)) {
                                    skipWhitespace();
                                    if (consume("odd")) {
                                        aVar2 = new a(2, 1);
                                    } else {
                                        if (consume("even")) {
                                            aVar2 = new a(2, z10 ? 1 : 0);
                                        } else {
                                            int i11 = (consume('+') || !consume('-')) ? 1 : -1;
                                            IntegerParser.Companion companion = IntegerParser.INSTANCE;
                                            IntegerParser integerParser2 = companion.parseInt(getInput(), getPosition(), getInputLength(), z10);
                                            if (integerParser2 != null) {
                                                setPosition(integerParser2.getEndPos());
                                            }
                                            if (consume('n') || consume('N')) {
                                                if (integerParser2 == null) {
                                                    integerParser2 = new IntegerParser(1L, getPosition());
                                                }
                                                skipWhitespace();
                                                boolean zConsume = consume('+');
                                                int i12 = (zConsume || !(zConsume = consume('-'))) ? 1 : -1;
                                                if (zConsume) {
                                                    skipWhitespace();
                                                    integerParser = companion.parseInt(getInput(), getPosition(), getInputLength(), false);
                                                    if (integerParser != null) {
                                                        setPosition(integerParser.getEndPos());
                                                        i10 = i11;
                                                        i11 = i12;
                                                    } else {
                                                        setPosition(position2);
                                                    }
                                                } else {
                                                    i10 = i11;
                                                    i11 = i12;
                                                    integerParser = null;
                                                }
                                            } else {
                                                combinator = combinator;
                                                integerParser = integerParser2;
                                                integerParser2 = null;
                                                i10 = 1;
                                            }
                                            aVar2 = new a(integerParser2 == null ? 0 : integerParser2.value() * i10, integerParser == null ? 0 : integerParser.value() * i11);
                                            skipWhitespace();
                                            if (consume(RootService.CLOSE_BRACKET)) {
                                                r10 = aVar2;
                                            } else {
                                                setPosition(position2);
                                            }
                                        }
                                        r10 = 0;
                                    }
                                    combinator = combinator;
                                    skipWhitespace();
                                    if (consume(RootService.CLOSE_BRACKET)) {
                                        r10 = aVar2;
                                    } else {
                                        setPosition(position2);
                                        r10 = 0;
                                    }
                                } else {
                                    combinator = combinator;
                                    r10 = r13;
                                }
                            }
                            if (r10 == 0) {
                                throw new CSSParseException("Invalid or missing parameter section for pseudo class: ".concat(strNextIdentifier5), null, 2, null);
                            }
                            aVar = new a(simpleSelector.getTag(), r10.f51132a, r10.f51133b, z11, z12);
                            selector.addedAttributeOrPseudo();
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                            break;
                        case 13:
                            if (empty()) {
                                NextSelectorGroup = r13;
                            } else {
                                int position3 = getPosition();
                                if (consume(RootService.OPEN_BRACKET)) {
                                    skipWhitespace();
                                    NextSelectorGroup = nextSelectorGroup();
                                    if (NextSelectorGroup != 0 && consume(RootService.CLOSE_BRACKET)) {
                                        for (Selector selector2 : NextSelectorGroup) {
                                            if (selector2.getSimpleSelectors() != null) {
                                                List<SimpleSelector> simpleSelectors = selector2.getSimpleSelectors();
                                                Intrinsics.checkNotNull(simpleSelectors);
                                                Iterator<SimpleSelector> it = simpleSelectors.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        SimpleSelector next = it.next();
                                                        if (next.getPseudos() != null) {
                                                            List<PseudoClass> pseudos = next.getPseudos();
                                                            Intrinsics.checkNotNull(pseudos);
                                                            Iterator<PseudoClass> it2 = pseudos.iterator();
                                                            while (true) {
                                                                if (it2.hasNext()) {
                                                                    if (it2.next() instanceof c) {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        setPosition(position3);
                                    }
                                    NextSelectorGroup = r13;
                                } else {
                                    NextSelectorGroup = r13;
                                }
                            }
                            if (NextSelectorGroup == 0) {
                                throw new CSSParseException("Invalid or missing parameter section for pseudo class: ".concat(strNextIdentifier5), r13, 2, r13);
                            }
                            aVar = new c(NextSelectorGroup);
                            int specificity = Integer.MIN_VALUE;
                            for (Selector selector3 : NextSelectorGroup) {
                                if (selector3.getSpecificity() > specificity) {
                                    specificity = selector3.getSpecificity();
                                }
                            }
                            selector.setSpecificity(specificity);
                            combinator = combinator;
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                            break;
                        case 14:
                            aVar = new g();
                            selector.addedAttributeOrPseudo();
                            combinator = combinator;
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                        case 15:
                            if (!empty()) {
                                int position4 = getPosition();
                                if (consume(RootService.OPEN_BRACKET)) {
                                    skipWhitespace();
                                    ?? arrayList = r13;
                                    while (true) {
                                        String strNextIdentifier6 = nextIdentifier();
                                        arrayList = arrayList;
                                        if (strNextIdentifier6 == null) {
                                            setPosition(position4);
                                        } else {
                                            if (arrayList == 0) {
                                                arrayList = new ArrayList();
                                            }
                                            arrayList.add(strNextIdentifier6);
                                            skipWhitespace();
                                            if (!skipCommaWhitespace()) {
                                                if (!consume(RootService.CLOSE_BRACKET)) {
                                                    setPosition(position4);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            aVar = new d(strNextIdentifier5);
                            selector.addedAttributeOrPseudo();
                            combinator = combinator;
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                            aVar = new d(strNextIdentifier5);
                            selector.addedAttributeOrPseudo();
                            combinator = combinator;
                            simpleSelector.addPseudo(aVar);
                            combinator = combinator;
                            z10 = false;
                            r13 = 0;
                            break;
                        default:
                            throw new CSSParseException("Unsupported pseudo class: ".concat(strNextIdentifier5), r13, 2, r13);
                    }
                }
            }
            if (simpleSelector != 0) {
                selector.add(simpleSelector);
                return true;
            }
            setPosition(position);
            return false;
        }

        @Nullable
        public final String nextURL() {
            if (empty()) {
                return null;
            }
            int position = getPosition();
            if (!consume("url(")) {
                return null;
            }
            skipWhitespace();
            String strNextCSSString = nextCSSString();
            if (strNextCSSString == null) {
                strNextCSSString = nextLegacyURL();
            }
            if (strNextCSSString == null) {
                setPosition(position);
                return null;
            }
            skipWhitespace();
            if (empty() || consume(")")) {
                return strNextCSSString;
            }
            setPosition(position);
            return null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$Combinator;", "", "DESCENDANT", "CHILD", "FOLLOWS", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Combinator {
        private static final /* synthetic */ Combinator[] $VALUES;
        public static final Combinator CHILD;
        public static final Combinator DESCENDANT;
        public static final Combinator FOLLOWS;

        static {
            Combinator combinator = new Combinator("DESCENDANT", 0);
            DESCENDANT = combinator;
            Combinator combinator2 = new Combinator("CHILD", 1);
            CHILD = combinator2;
            Combinator combinator3 = new Combinator("FOLLOWS", 2);
            FOLLOWS = combinator3;
            $VALUES = new Combinator[]{combinator, combinator2, combinator3};
        }

        public Combinator() {
            throw null;
        }

        public static Combinator valueOf(String str) {
            return (Combinator) Enum.valueOf(Combinator.class, str);
        }

        public static Combinator[] values() {
            return (Combinator[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0002H\u0007J&\u0010\u0011\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$Companion;", "", "", "mediaListStr", "Lcom/mastercard/sonic/androidsvg/CSSParser$MediaType;", "rendererMediaType", "", "mediaMatches", "val", "", "parseClassAttribute", "Lcom/mastercard/sonic/androidsvg/CSSParser$RuleMatchContext;", "ruleMatchContext", "Lcom/mastercard/sonic/androidsvg/CSSParser$Selector;", "selector", "Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;", "obj", "ruleMatch", "CLASS", "Ljava/lang/String;", "CSS_MIME_TYPE", "ID", "", "SPECIFICITY_ATTRIBUTE_OR_PSEUDOCLASS", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "SPECIFICITY_ELEMENT_OR_PSEUDOELEMENT", "SPECIFICITY_ID_ATTRIBUTE", "TAG", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static int a(List list, int i10, SVG.SvgElementBase svgElementBase) {
            int i11 = 0;
            if (i10 < 0) {
                return 0;
            }
            Object obj = list.get(i10);
            Intrinsics.checkNotNull(svgElementBase);
            if (obj != svgElementBase.getParent()) {
                return -1;
            }
            SVG.SvgContainer parent = svgElementBase.getParent();
            Intrinsics.checkNotNull(parent);
            Iterator<SVG.SvgObject> it = parent.getChildren().iterator();
            while (it.hasNext()) {
                int i12 = i11 + 1;
                if (it.next() == svgElementBase) {
                    return i11;
                }
                i11 = i12;
            }
            return -1;
        }

        public static final /* synthetic */ int access$getChildPosition(Companion companion, List list, int i10, SVG.SvgElementBase svgElementBase) {
            companion.getClass();
            return a(list, i10, svgElementBase);
        }

        public static final boolean access$mediaMatches(Companion companion, List list, MediaType mediaType) {
            companion.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaType mediaType2 = (MediaType) it.next();
                if (mediaType2 == MediaType.all || mediaType2 == mediaType) {
                    return true;
                }
            }
            return false;
        }

        public static final /* synthetic */ List access$parseMediaList(Companion companion, CSSTextScanner cSSTextScanner) {
            companion.getClass();
            return b(cSSTextScanner);
        }

        public static final /* synthetic */ boolean access$ruleMatch(Companion companion, RuleMatchContext ruleMatchContext, Selector selector, int i10, List list, int i11, SVG.SvgElementBase svgElementBase) {
            companion.getClass();
            return c(ruleMatchContext, selector, i10, list, i11, svgElementBase);
        }

        public static final /* synthetic */ boolean access$ruleMatchOnAncestors(Companion companion, RuleMatchContext ruleMatchContext, Selector selector, int i10, List list, int i11) {
            companion.getClass();
            return d(ruleMatchContext, selector, i10, list, i11);
        }

        public static final /* synthetic */ boolean access$selectorMatch(Companion companion, RuleMatchContext ruleMatchContext, SimpleSelector simpleSelector, List list, int i10, SVG.SvgElementBase svgElementBase) {
            companion.getClass();
            return e(ruleMatchContext, simpleSelector, svgElementBase);
        }

        public static final void access$warn(Companion companion, String str, Object... objArr) {
            companion.getClass();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            Log.w("CSSParser", str2);
        }

        @JvmStatic
        public static ArrayList b(CSSTextScanner cSSTextScanner) {
            String strNextWord;
            ArrayList arrayList = new ArrayList();
            while (!cSSTextScanner.empty() && (strNextWord = cSSTextScanner.nextWord()) != null) {
                try {
                    arrayList.add(MediaType.valueOf(strNextWord));
                } catch (IllegalArgumentException unused) {
                }
                if (!cSSTextScanner.skipCommaWhitespace()) {
                    break;
                }
            }
            return arrayList;
        }

        @JvmStatic
        public static boolean c(RuleMatchContext ruleMatchContext, Selector selector, int i10, List list, int i11, SVG.SvgElementBase svgElementBase) {
            Intrinsics.checkNotNull(selector);
            SimpleSelector simpleSelector = selector.get(i10);
            if (!e(ruleMatchContext, simpleSelector, svgElementBase)) {
                return false;
            }
            if (simpleSelector.getCombinator() == Combinator.DESCENDANT) {
                if (i10 == 0) {
                    return true;
                }
                for (int i12 = i11; i12 >= 0; i12--) {
                    if (d(ruleMatchContext, selector, i10 - 1, list, i12)) {
                        return true;
                    }
                }
                return false;
            }
            if (simpleSelector.getCombinator() == Combinator.CHILD) {
                return d(ruleMatchContext, selector, i10 - 1, list, i11);
            }
            int iA = a(list, i11, svgElementBase);
            if (iA <= 0) {
                return false;
            }
            Intrinsics.checkNotNull(svgElementBase);
            SVG.SvgContainer parent = svgElementBase.getParent();
            Intrinsics.checkNotNull(parent);
            SVG.SvgObject svgObject = parent.getChildren().get(iA - 1);
            Intrinsics.checkNotNull(svgObject, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.SvgElementBase");
            return c(ruleMatchContext, selector, i10 - 1, list, i11, (SVG.SvgElementBase) svgObject);
        }

        @JvmStatic
        public static boolean d(RuleMatchContext ruleMatchContext, Selector selector, int i10, List list, int i11) {
            Intrinsics.checkNotNull(selector);
            SimpleSelector simpleSelector = selector.get(i10);
            Object obj = list.get(i11);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.SvgElementBase");
            SVG.SvgElementBase svgElementBase = (SVG.SvgElementBase) obj;
            if (!e(ruleMatchContext, simpleSelector, svgElementBase)) {
                return false;
            }
            if (simpleSelector.getCombinator() == Combinator.DESCENDANT) {
                if (i10 == 0) {
                    return true;
                }
                int i12 = i11;
                while (i12 > 0) {
                    i12--;
                    if (d(ruleMatchContext, selector, i10 - 1, list, i12)) {
                        return true;
                    }
                }
                return false;
            }
            if (simpleSelector.getCombinator() == Combinator.CHILD) {
                return d(ruleMatchContext, selector, i10 - 1, list, i11 - 1);
            }
            int iA = a(list, i11, svgElementBase);
            if (iA <= 0) {
                return false;
            }
            SVG.SvgContainer parent = svgElementBase.getParent();
            Intrinsics.checkNotNull(parent);
            SVG.SvgObject svgObject = parent.getChildren().get(iA - 1);
            Intrinsics.checkNotNull(svgObject, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.SvgElementBase");
            return c(ruleMatchContext, selector, i10 - 1, list, i11, (SVG.SvgElementBase) svgObject);
        }

        @JvmStatic
        public static boolean e(RuleMatchContext ruleMatchContext, SimpleSelector simpleSelector, SVG.SvgElementBase svgElementBase) {
            String strD;
            String nodeName;
            if (simpleSelector.getTag() != null) {
                String tag = simpleSelector.getTag();
                if (svgElementBase == null || (nodeName = svgElementBase.getNodeName()) == null) {
                    strD = null;
                } else {
                    Locale locale = Locale.US;
                    strD = androidx.room.a.d(locale, "US", nodeName, locale, "this as java.lang.String).toLowerCase(locale)");
                }
                if (!Intrinsics.areEqual(tag, strD)) {
                    return false;
                }
            }
            if (simpleSelector.getAttribs() != null) {
                List<Attrib> attribs = simpleSelector.getAttribs();
                Intrinsics.checkNotNull(attribs);
                for (Attrib attrib : attribs) {
                    String name = attrib.getName();
                    if (!Intrinsics.areEqual(name, "id")) {
                        if (Intrinsics.areEqual(name, Name.LABEL)) {
                            Intrinsics.checkNotNull(svgElementBase);
                            if (svgElementBase.getClassNames() == null) {
                                return false;
                            }
                            List<String> classNames = svgElementBase.getClassNames();
                            Intrinsics.checkNotNull(classNames);
                            String value = attrib.getValue();
                            Intrinsics.checkNotNull(value);
                            if (!classNames.contains(value)) {
                            }
                        }
                        return false;
                    }
                    String value2 = attrib.getValue();
                    Intrinsics.checkNotNull(svgElementBase);
                    if (!Intrinsics.areEqual(value2, svgElementBase.getId())) {
                        return false;
                    }
                }
            }
            if (simpleSelector.getPseudos() == null) {
                return true;
            }
            List<PseudoClass> pseudos = simpleSelector.getPseudos();
            Intrinsics.checkNotNull(pseudos);
            Iterator<PseudoClass> it = pseudos.iterator();
            while (it.hasNext()) {
                if (!it.next().matches(ruleMatchContext, svgElementBase)) {
                    return false;
                }
            }
            return true;
        }

        @JvmStatic
        public final boolean mediaMatches(@NotNull String mediaListStr, @Nullable MediaType rendererMediaType) {
            Intrinsics.checkNotNullParameter(mediaListStr, "mediaListStr");
            CSSTextScanner cSSTextScanner = new CSSTextScanner(mediaListStr);
            cSSTextScanner.skipWhitespace();
            for (MediaType mediaType : b(cSSTextScanner)) {
                if (mediaType == MediaType.all || mediaType == rendererMediaType) {
                    return true;
                }
            }
            return false;
        }

        @JvmStatic
        @Nullable
        public final List<String> parseClassAttribute(@NotNull String val) {
            Intrinsics.checkNotNullParameter(val, "val");
            CSSTextScanner cSSTextScanner = new CSSTextScanner(val);
            ArrayList arrayList = null;
            while (!cSSTextScanner.empty()) {
                String strNextToken$default = SVGParser.TextScanner.nextToken$default(cSSTextScanner, (char) 0, false, 3, null);
                if (strNextToken$default != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(strNextToken$default);
                    cSSTextScanner.skipWhitespace();
                }
            }
            return arrayList;
        }

        @JvmStatic
        public final boolean ruleMatch(@Nullable RuleMatchContext ruleMatchContext, @Nullable Selector selector, @Nullable SVG.SvgElementBase obj) {
            ArrayList arrayList = new ArrayList();
            Intrinsics.checkNotNull(obj);
            for (Object parent = obj.getParent(); parent != null; parent = ((SVG.SvgObject) parent).getParent()) {
                arrayList.add(0, parent);
            }
            int size = arrayList.size() - 1;
            Intrinsics.checkNotNull(selector);
            return selector.size() == 1 ? e(ruleMatchContext, selector.get(0), obj) : c(ruleMatchContext, selector, selector.size() - 1, arrayList, size, obj);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$MediaType;", "", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "aural", "braille", "embossed", "handheld", Constants.PRINT, "projection", "screen", "speech", "tty", "tv", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class MediaType {
        private static final /* synthetic */ MediaType[] $VALUES;
        public static final MediaType all;
        public static final MediaType aural;
        public static final MediaType braille;
        public static final MediaType embossed;
        public static final MediaType handheld;
        public static final MediaType print;
        public static final MediaType projection;
        public static final MediaType screen;
        public static final MediaType speech;
        public static final MediaType tty;
        public static final MediaType tv;

        static {
            MediaType mediaType = new MediaType(SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, 0);
            all = mediaType;
            MediaType mediaType2 = new MediaType("aural", 1);
            aural = mediaType2;
            MediaType mediaType3 = new MediaType("braille", 2);
            braille = mediaType3;
            MediaType mediaType4 = new MediaType("embossed", 3);
            embossed = mediaType4;
            MediaType mediaType5 = new MediaType("handheld", 4);
            handheld = mediaType5;
            MediaType mediaType6 = new MediaType(Constants.PRINT, 5);
            print = mediaType6;
            MediaType mediaType7 = new MediaType("projection", 6);
            projection = mediaType7;
            MediaType mediaType8 = new MediaType("screen", 7);
            screen = mediaType8;
            MediaType mediaType9 = new MediaType("speech", 8);
            speech = mediaType9;
            MediaType mediaType10 = new MediaType("tty", 9);
            tty = mediaType10;
            MediaType mediaType11 = new MediaType("tv", 10);
            tv = mediaType11;
            $VALUES = new MediaType[]{mediaType, mediaType2, mediaType3, mediaType4, mediaType5, mediaType6, mediaType7, mediaType8, mediaType9, mediaType10, mediaType11};
        }

        public MediaType() {
            throw null;
        }

        public static MediaType valueOf(String str) {
            return (MediaType) Enum.valueOf(MediaType.class, str);
        }

        public static MediaType[] values() {
            return (MediaType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$PseudoClass;", "", "matches", "", "ruleMatchContext", "Lcom/mastercard/sonic/androidsvg/CSSParser$RuleMatchContext;", "obj", "Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface PseudoClass {
        boolean matches(@Nullable RuleMatchContext ruleMatchContext, @Nullable SVG.SvgElementBase obj);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CSSParser.kt */
    public static final class PseudoClassIdents {
        private static final /* synthetic */ PseudoClassIdents[] $VALUES;

        @NotNull
        public static final Companion Companion;
        public static final PseudoClassIdents UNSUPPORTED;
        public static final PseudoClassIdents active;

        @NotNull
        private static final Map<String, PseudoClassIdents> cache;
        public static final PseudoClassIdents checked;
        public static final PseudoClassIdents disabled;
        public static final PseudoClassIdents empty;
        public static final PseudoClassIdents enabled;
        public static final PseudoClassIdents first_child;
        public static final PseudoClassIdents first_of_type;
        public static final PseudoClassIdents focus;
        public static final PseudoClassIdents hover;
        public static final PseudoClassIdents indeterminate;
        public static final PseudoClassIdents lang;
        public static final PseudoClassIdents last_child;
        public static final PseudoClassIdents last_of_type;
        public static final PseudoClassIdents link;
        public static final PseudoClassIdents not;
        public static final PseudoClassIdents nth_child;
        public static final PseudoClassIdents nth_last_child;
        public static final PseudoClassIdents nth_last_of_type;
        public static final PseudoClassIdents nth_of_type;
        public static final PseudoClassIdents only_child;
        public static final PseudoClassIdents only_of_type;
        public static final PseudoClassIdents root;
        public static final PseudoClassIdents target;
        public static final PseudoClassIdents visited;

        /* JADX INFO: compiled from: CSSParser.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$PseudoClassIdents$Companion;", "", "()V", "cache", "", "", "Lcom/mastercard/sonic/androidsvg/CSSParser$PseudoClassIdents;", "fromString", "str", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final PseudoClassIdents fromString(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "str");
                PseudoClassIdents pseudoClassIdents = (PseudoClassIdents) PseudoClassIdents.cache.get(str);
                return pseudoClassIdents == null ? PseudoClassIdents.UNSUPPORTED : pseudoClassIdents;
            }
        }

        static {
            PseudoClassIdents pseudoClassIdents = new PseudoClassIdents("target", 0);
            target = pseudoClassIdents;
            PseudoClassIdents pseudoClassIdents2 = new PseudoClassIdents("root", 1);
            root = pseudoClassIdents2;
            PseudoClassIdents pseudoClassIdents3 = new PseudoClassIdents("nth_child", 2);
            nth_child = pseudoClassIdents3;
            PseudoClassIdents pseudoClassIdents4 = new PseudoClassIdents("nth_last_child", 3);
            nth_last_child = pseudoClassIdents4;
            PseudoClassIdents pseudoClassIdents5 = new PseudoClassIdents("nth_of_type", 4);
            nth_of_type = pseudoClassIdents5;
            PseudoClassIdents pseudoClassIdents6 = new PseudoClassIdents("nth_last_of_type", 5);
            nth_last_of_type = pseudoClassIdents6;
            PseudoClassIdents pseudoClassIdents7 = new PseudoClassIdents("first_child", 6);
            first_child = pseudoClassIdents7;
            PseudoClassIdents pseudoClassIdents8 = new PseudoClassIdents("last_child", 7);
            last_child = pseudoClassIdents8;
            PseudoClassIdents pseudoClassIdents9 = new PseudoClassIdents("first_of_type", 8);
            first_of_type = pseudoClassIdents9;
            PseudoClassIdents pseudoClassIdents10 = new PseudoClassIdents("last_of_type", 9);
            last_of_type = pseudoClassIdents10;
            PseudoClassIdents pseudoClassIdents11 = new PseudoClassIdents("only_child", 10);
            only_child = pseudoClassIdents11;
            PseudoClassIdents pseudoClassIdents12 = new PseudoClassIdents("only_of_type", 11);
            only_of_type = pseudoClassIdents12;
            PseudoClassIdents pseudoClassIdents13 = new PseudoClassIdents("empty", 12);
            empty = pseudoClassIdents13;
            PseudoClassIdents pseudoClassIdents14 = new PseudoClassIdents("not", 13);
            not = pseudoClassIdents14;
            PseudoClassIdents pseudoClassIdents15 = new PseudoClassIdents("lang", 14);
            lang = pseudoClassIdents15;
            PseudoClassIdents pseudoClassIdents16 = new PseudoClassIdents(DynamicLink.Builder.KEY_LINK, 15);
            link = pseudoClassIdents16;
            PseudoClassIdents pseudoClassIdents17 = new PseudoClassIdents("visited", 16);
            visited = pseudoClassIdents17;
            PseudoClassIdents pseudoClassIdents18 = new PseudoClassIdents("hover", 17);
            hover = pseudoClassIdents18;
            PseudoClassIdents pseudoClassIdents19 = new PseudoClassIdents(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, 18);
            active = pseudoClassIdents19;
            PseudoClassIdents pseudoClassIdents20 = new PseudoClassIdents("focus", 19);
            focus = pseudoClassIdents20;
            PseudoClassIdents pseudoClassIdents21 = new PseudoClassIdents("enabled", 20);
            enabled = pseudoClassIdents21;
            PseudoClassIdents pseudoClassIdents22 = new PseudoClassIdents(BaseMenuItem.STATE_DISABLED, 21);
            disabled = pseudoClassIdents22;
            PseudoClassIdents pseudoClassIdents23 = new PseudoClassIdents("checked", 22);
            checked = pseudoClassIdents23;
            PseudoClassIdents pseudoClassIdents24 = new PseudoClassIdents("indeterminate", 23);
            indeterminate = pseudoClassIdents24;
            PseudoClassIdents pseudoClassIdents25 = new PseudoClassIdents("UNSUPPORTED", 24);
            UNSUPPORTED = pseudoClassIdents25;
            $VALUES = new PseudoClassIdents[]{pseudoClassIdents, pseudoClassIdents2, pseudoClassIdents3, pseudoClassIdents4, pseudoClassIdents5, pseudoClassIdents6, pseudoClassIdents7, pseudoClassIdents8, pseudoClassIdents9, pseudoClassIdents10, pseudoClassIdents11, pseudoClassIdents12, pseudoClassIdents13, pseudoClassIdents14, pseudoClassIdents15, pseudoClassIdents16, pseudoClassIdents17, pseudoClassIdents18, pseudoClassIdents19, pseudoClassIdents20, pseudoClassIdents21, pseudoClassIdents22, pseudoClassIdents23, pseudoClassIdents24, pseudoClassIdents25};
            Companion = new Companion(null);
            cache = new HashMap();
            for (PseudoClassIdents pseudoClassIdents26 : values()) {
                if (pseudoClassIdents26 != UNSUPPORTED) {
                    cache.put(l.replace$default(pseudoClassIdents26.name(), '_', '-', false, 4, (Object) null), pseudoClassIdents26);
                }
            }
        }

        public PseudoClassIdents() {
            throw null;
        }

        public static PseudoClassIdents valueOf(String str) {
            return (PseudoClassIdents) Enum.valueOf(PseudoClassIdents.class, str);
        }

        public static PseudoClassIdents[] values() {
            return (PseudoClassIdents[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$Rule;", "", "", "toString", "Lcom/mastercard/sonic/androidsvg/CSSParser$Selector;", "a", "Lcom/mastercard/sonic/androidsvg/CSSParser$Selector;", "getSelector", "()Lcom/mastercard/sonic/androidsvg/CSSParser$Selector;", "setSelector", "(Lcom/mastercard/sonic/androidsvg/CSSParser$Selector;)V", "selector", "Lcom/mastercard/sonic/androidsvg/SVG$Style;", "b", "Lcom/mastercard/sonic/androidsvg/SVG$Style;", "getStyle", "()Lcom/mastercard/sonic/androidsvg/SVG$Style;", "setStyle", "(Lcom/mastercard/sonic/androidsvg/SVG$Style;)V", "style", "Lcom/mastercard/sonic/androidsvg/CSSParser$Source;", "c", "Lcom/mastercard/sonic/androidsvg/CSSParser$Source;", "getSource", "()Lcom/mastercard/sonic/androidsvg/CSSParser$Source;", "setSource", "(Lcom/mastercard/sonic/androidsvg/CSSParser$Source;)V", "source", "<init>", "(Lcom/mastercard/sonic/androidsvg/CSSParser$Selector;Lcom/mastercard/sonic/androidsvg/SVG$Style;Lcom/mastercard/sonic/androidsvg/CSSParser$Source;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Rule {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Selector selector;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SVG.Style style;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Source source;

        public Rule(@Nullable Selector selector, @Nullable SVG.Style style, @Nullable Source source) {
            this.selector = selector;
            this.style = style;
            this.source = source;
        }

        @Nullable
        public final Selector getSelector() {
            return this.selector;
        }

        @Nullable
        public final Source getSource() {
            return this.source;
        }

        @Nullable
        public final SVG.Style getStyle() {
            return this.style;
        }

        public final void setSelector(@Nullable Selector selector) {
            this.selector = selector;
        }

        public final void setSource(@Nullable Source source) {
            this.source = source;
        }

        public final void setStyle(@Nullable SVG.Style style) {
            this.style = style;
        }

        @NotNull
        public String toString() {
            return this.selector + " {...} (src=" + this.source + ")";
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$RuleMatchContext;", "", "", "toString", "Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;", "a", "Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;", "getTargetElement", "()Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;", "setTargetElement", "(Lcom/mastercard/sonic/androidsvg/SVG$SvgElementBase;)V", "targetElement", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class RuleMatchContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public SVG.SvgElementBase targetElement;

        @Nullable
        public final SVG.SvgElementBase getTargetElement() {
            return this.targetElement;
        }

        public final void setTargetElement(@Nullable SVG.SvgElementBase svgElementBase) {
            this.targetElement = svgElementBase;
        }

        @NotNull
        public String toString() {
            SVG.SvgElementBase svgElementBase = this.targetElement;
            if (svgElementBase == null) {
                return "";
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Intrinsics.checkNotNull(svgElementBase);
            SVG.SvgElementBase svgElementBase2 = this.targetElement;
            Intrinsics.checkNotNull(svgElementBase2);
            return ai.a.i(new Object[]{svgElementBase.getNodeName(), svgElementBase2.getId()}, 2, "<%s id=\"%s\">", "format(format, *args)");
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\rH\u0016R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$Ruleset;", "", "Lcom/mastercard/sonic/androidsvg/CSSParser$Rule;", "rule", "", "add", "rules", "addAll", "", "ruleCount", "Lcom/mastercard/sonic/androidsvg/CSSParser$Source;", "sourceToBeRemoved", "removeFromSource", "", "toString", "", "a", "Ljava/util/List;", "getRules", "()Ljava/util/List;", "setRules", "(Ljava/util/List;)V", "", "isEmpty", "()Z", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Ruleset {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<Rule> rules;

        public final void add(@NotNull Rule rule) {
            Intrinsics.checkNotNullParameter(rule, "rule");
            if (this.rules == null) {
                this.rules = new ArrayList();
            }
            List<Rule> list = this.rules;
            Intrinsics.checkNotNull(list);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<Rule> list2 = this.rules;
                Intrinsics.checkNotNull(list2);
                Selector selector = list2.get(i10).getSelector();
                Intrinsics.checkNotNull(selector);
                int specificity = selector.getSpecificity();
                Selector selector2 = rule.getSelector();
                Intrinsics.checkNotNull(selector2);
                if (specificity > selector2.getSpecificity()) {
                    List<Rule> list3 = this.rules;
                    Intrinsics.checkNotNull(list3);
                    list3.add(i10, rule);
                    return;
                }
            }
            List<Rule> list4 = this.rules;
            Intrinsics.checkNotNull(list4);
            list4.add(rule);
        }

        public final void addAll(@Nullable Ruleset rules) {
            Intrinsics.checkNotNull(rules);
            if (rules.rules == null) {
                return;
            }
            if (this.rules == null) {
                List<Rule> list = rules.rules;
                Intrinsics.checkNotNull(list);
                this.rules = new ArrayList(list.size());
            }
            List<Rule> list2 = rules.rules;
            Intrinsics.checkNotNull(list2);
            Iterator<Rule> it = list2.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        }

        @Nullable
        public final List<Rule> getRules() {
            return this.rules;
        }

        public final boolean isEmpty() {
            List<Rule> list = this.rules;
            if (list != null) {
                Intrinsics.checkNotNull(list);
                if (!list.isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        public final void removeFromSource(@NotNull Source sourceToBeRemoved) {
            Intrinsics.checkNotNullParameter(sourceToBeRemoved, "sourceToBeRemoved");
            List<Rule> list = this.rules;
            if (list == null) {
                return;
            }
            Intrinsics.checkNotNull(list);
            Iterator<Rule> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getSource() == sourceToBeRemoved) {
                    it.remove();
                }
            }
        }

        public final int ruleCount() {
            List<Rule> list = this.rules;
            if (list == null) {
                return 0;
            }
            Intrinsics.checkNotNull(list);
            return list.size();
        }

        public final void setRules(@Nullable List<Rule> list) {
            this.rules = list;
        }

        @NotNull
        public String toString() {
            if (this.rules == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            List<Rule> list = this.rules;
            Intrinsics.checkNotNull(list);
            Iterator<Rule> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(it.next().toString());
                sb2.append('\n');
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0086\u0002J\u0006\u0010\n\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\u0004J\b\u0010\u000e\u001a\u00020\rH\u0016R*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$Selector;", "", "Lcom/mastercard/sonic/androidsvg/CSSParser$SimpleSelector;", "part", "", "add", "", "size", "i", "get", "addedIdAttribute", "addedAttributeOrPseudo", "addedElement", "", "toString", "", "a", "Ljava/util/List;", "getSimpleSelectors", "()Ljava/util/List;", "setSimpleSelectors", "(Ljava/util/List;)V", "simpleSelectors", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSpecificity", "()I", "setSpecificity", "(I)V", "specificity", "", "isEmpty", "()Z", "<init>", "()V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Selector {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<SimpleSelector> simpleSelectors;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public int specificity;

        public final void add(@NotNull SimpleSelector part) {
            Intrinsics.checkNotNullParameter(part, "part");
            if (this.simpleSelectors == null) {
                this.simpleSelectors = new ArrayList();
            }
            List<SimpleSelector> list = this.simpleSelectors;
            Intrinsics.checkNotNull(list);
            list.add(part);
        }

        public final void addedAttributeOrPseudo() {
            this.specificity += 1000;
        }

        public final void addedElement() {
            this.specificity++;
        }

        public final void addedIdAttribute() {
            this.specificity += DurationKt.NANOS_IN_MILLIS;
        }

        @NotNull
        public final SimpleSelector get(int i10) {
            List<SimpleSelector> list = this.simpleSelectors;
            Intrinsics.checkNotNull(list);
            return list.get(i10);
        }

        @Nullable
        public final List<SimpleSelector> getSimpleSelectors() {
            return this.simpleSelectors;
        }

        public final int getSpecificity() {
            return this.specificity;
        }

        public final boolean isEmpty() {
            List<SimpleSelector> list = this.simpleSelectors;
            if (list != null) {
                Intrinsics.checkNotNull(list);
                if (!list.isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        public final void setSimpleSelectors(@Nullable List<SimpleSelector> list) {
            this.simpleSelectors = list;
        }

        public final void setSpecificity(int i10) {
            this.specificity = i10;
        }

        public final int size() {
            List<SimpleSelector> list = this.simpleSelectors;
            if (list == null) {
                return 0;
            }
            Intrinsics.checkNotNull(list);
            return list.size();
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            List<SimpleSelector> list = this.simpleSelectors;
            Intrinsics.checkNotNull(list);
            Iterator<SimpleSelector> it = list.iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(' ');
            }
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(this.specificity);
            sb2.append(AbstractJsonLexerKt.END_LIST);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.append('[').append(sp…y).append(']').toString()");
            return string;
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b)\u0010*J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\b\u0010\f\u001a\u00020\u0002H\u0016R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#¨\u0006+"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$SimpleSelector;", "", "", "attrName", "Lcom/mastercard/sonic/androidsvg/CSSParser$AttribOp;", "op", "attrValue", "", "addAttrib", "Lcom/mastercard/sonic/androidsvg/CSSParser$PseudoClass;", "pseudo", "addPseudo", "toString", "Lcom/mastercard/sonic/androidsvg/CSSParser$Combinator;", "a", "Lcom/mastercard/sonic/androidsvg/CSSParser$Combinator;", "getCombinator", "()Lcom/mastercard/sonic/androidsvg/CSSParser$Combinator;", "setCombinator", "(Lcom/mastercard/sonic/androidsvg/CSSParser$Combinator;)V", "combinator", "b", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", LogKeysKt.TAG, "", "Lcom/mastercard/sonic/androidsvg/CSSParser$Attrib;", "c", "Ljava/util/List;", "getAttribs", "()Ljava/util/List;", "setAttribs", "(Ljava/util/List;)V", "attribs", "d", "getPseudos", "setPseudos", "pseudos", "<init>", "(Lcom/mastercard/sonic/androidsvg/CSSParser$Combinator;Ljava/lang/String;)V", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class SimpleSelector {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Combinator combinator;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public String tag;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<Attrib> attribs;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public List<PseudoClass> pseudos;

        /* JADX INFO: compiled from: CSSParser.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AttribOp.values().length];
                try {
                    iArr[AttribOp.EQUALS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AttribOp.INCLUDES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AttribOp.DASHMATCH.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public SimpleSelector(@Nullable Combinator combinator, @Nullable String str) {
            this.combinator = combinator == null ? Combinator.DESCENDANT : combinator;
            this.tag = str;
        }

        public final void addAttrib(@NotNull String attrName, @NotNull AttribOp op, @Nullable String attrValue) {
            Intrinsics.checkNotNullParameter(attrName, "attrName");
            Intrinsics.checkNotNullParameter(op, "op");
            if (this.attribs == null) {
                this.attribs = new ArrayList();
            }
            List<Attrib> list = this.attribs;
            Intrinsics.checkNotNull(list);
            list.add(new Attrib(attrName, op, attrValue));
        }

        public final void addPseudo(@NotNull PseudoClass pseudo) {
            Intrinsics.checkNotNullParameter(pseudo, "pseudo");
            if (this.pseudos == null) {
                this.pseudos = new ArrayList();
            }
            List<PseudoClass> list = this.pseudos;
            Intrinsics.checkNotNull(list);
            list.add(pseudo);
        }

        @Nullable
        public final List<Attrib> getAttribs() {
            return this.attribs;
        }

        @Nullable
        public final Combinator getCombinator() {
            return this.combinator;
        }

        @Nullable
        public final List<PseudoClass> getPseudos() {
            return this.pseudos;
        }

        @Nullable
        public final String getTag() {
            return this.tag;
        }

        public final void setAttribs(@Nullable List<Attrib> list) {
            this.attribs = list;
        }

        public final void setCombinator(@Nullable Combinator combinator) {
            this.combinator = combinator;
        }

        public final void setPseudos(@Nullable List<PseudoClass> list) {
            this.pseudos = list;
        }

        public final void setTag(@Nullable String str) {
            this.tag = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Combinator combinator = this.combinator;
            if (combinator == Combinator.CHILD) {
                sb2.append("> ");
            } else if (combinator == Combinator.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.tag;
            if (str == null) {
                str = ProxyConfig.MATCH_ALL_SCHEMES;
            }
            sb2.append(str);
            List<Attrib> list = this.attribs;
            if (list != null) {
                Intrinsics.checkNotNull(list);
                for (Attrib attrib : list) {
                    sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb2.append(attrib.getName());
                    int i10 = WhenMappings.$EnumSwitchMapping$0[attrib.getOperation().ordinal()];
                    if (i10 == 1) {
                        sb2.append('=');
                        sb2.append(attrib.getValue());
                    } else if (i10 == 2) {
                        sb2.append("~=");
                        sb2.append(attrib.getValue());
                    } else if (i10 == 3) {
                        sb2.append("|=");
                        sb2.append(attrib.getValue());
                    }
                    sb2.append(AbstractJsonLexerKt.END_LIST);
                }
            }
            List<PseudoClass> list2 = this.pseudos;
            if (list2 != null) {
                Intrinsics.checkNotNull(list2);
                for (PseudoClass pseudoClass : list2) {
                    sb2.append(AbstractJsonLexerKt.COLON);
                    sb2.append(pseudoClass);
                }
            }
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: CSSParser.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/mastercard/sonic/androidsvg/CSSParser$Source;", "", "Document", "RenderOptions", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Source {
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source Document;
        public static final Source RenderOptions;

        static {
            Source source = new Source("Document", 0);
            Document = source;
            Source source2 = new Source("RenderOptions", 1);
            RenderOptions = source2;
            $VALUES = new Source[]{source, source2};
        }

        public Source() {
            throw null;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    public static final class a implements PseudoClass {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f51146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f51147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f51148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f51149e;

        public a(@Nullable String str, int i10, int i11, boolean z10, boolean z11) {
            this.f51145a = i10;
            this.f51146b = i11;
            this.f51147c = z10;
            this.f51148d = z11;
            this.f51149e = str;
        }

        @Override // com.mastercard.sonic.androidsvg.CSSParser.PseudoClass
        public final boolean matches(@Nullable RuleMatchContext ruleMatchContext, @Nullable SVG.SvgElementBase svgElementBase) {
            int i10;
            int i11;
            boolean z10 = this.f51148d;
            String nodeName = this.f51149e;
            if (z10 && nodeName == null) {
                nodeName = svgElementBase != null ? svgElementBase.getNodeName() : null;
            }
            Intrinsics.checkNotNull(svgElementBase);
            if (svgElementBase.getParent() != null) {
                SVG.SvgContainer parent = svgElementBase.getParent();
                Intrinsics.checkNotNull(parent);
                i10 = 0;
                i11 = 0;
                for (SVG.SvgObject svgObject : parent.getChildren()) {
                    Intrinsics.checkNotNull(svgObject, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.SvgElementBase");
                    SVG.SvgElementBase svgElementBase2 = (SVG.SvgElementBase) svgObject;
                    if (svgElementBase2 == svgElementBase) {
                        i10 = i11;
                    }
                    if (nodeName == null || Intrinsics.areEqual(svgElementBase2.getNodeName(), nodeName)) {
                        i11++;
                    }
                }
            } else {
                i10 = 0;
                i11 = 1;
            }
            int i12 = this.f51147c ? i10 + 1 : i11 - i10;
            int i13 = this.f51145a;
            int i14 = this.f51146b;
            if (i13 != 0) {
                if ((i12 - i14) % i13 != 0) {
                    return false;
                }
                if (Integer.signum(i12 - i14) != 0 && Integer.signum(i12 - i14) != Integer.signum(i13)) {
                    return false;
                }
            } else if (i12 != i14) {
                return false;
            }
            return true;
        }

        @NotNull
        public final String toString() {
            String str = this.f51147c ? "" : "last-";
            boolean z10 = this.f51148d;
            int i10 = this.f51146b;
            int i11 = this.f51145a;
            if (z10) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return ai.a.i(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10), this.f51149e}, 4, "nth-%schild(%dn%+d of type <%s>)", "format(format, *args)");
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            return ai.a.i(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3, "nth-%schild(%dn%+d)", "format(format, *args)");
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    public static final class b implements PseudoClass {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.mastercard.sonic.androidsvg.CSSParser.PseudoClass
        public final boolean matches(@Nullable RuleMatchContext ruleMatchContext, @Nullable SVG.SvgElementBase svgElementBase) {
            return !(svgElementBase instanceof SVG.SvgContainer) || ((SVG.SvgContainer) svgElementBase).getChildren().size() == 0;
        }

        @NotNull
        public final String toString() {
            return "empty";
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    public static final class c implements PseudoClass {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<Selector> f51150a;

        public c(@NotNull List<Selector> selectorGroup) {
            Intrinsics.checkNotNullParameter(selectorGroup, "selectorGroup");
            this.f51150a = selectorGroup;
        }

        @Override // com.mastercard.sonic.androidsvg.CSSParser.PseudoClass
        public final boolean matches(@Nullable RuleMatchContext ruleMatchContext, @Nullable SVG.SvgElementBase svgElementBase) {
            Iterator<Selector> it = this.f51150a.iterator();
            while (it.hasNext()) {
                if (CSSParser.INSTANCE.ruleMatch(ruleMatchContext, it.next(), svgElementBase)) {
                    return false;
                }
            }
            return true;
        }

        @NotNull
        public final String toString() {
            return androidx.camera.core.imagecapture.a.c(new StringBuilder("not("), this.f51150a, ")");
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    public static final class d implements PseudoClass {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f51151a;

        public d(@NotNull String clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            this.f51151a = clazz;
        }

        @Override // com.mastercard.sonic.androidsvg.CSSParser.PseudoClass
        public final boolean matches(@Nullable RuleMatchContext ruleMatchContext, @Nullable SVG.SvgElementBase svgElementBase) {
            return false;
        }

        @NotNull
        public final String toString() {
            return this.f51151a;
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    public static final class e implements PseudoClass {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f51152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f51153b;

        public e(boolean z10, @Nullable String str) {
            this.f51152a = z10;
            this.f51153b = str;
        }

        @Override // com.mastercard.sonic.androidsvg.CSSParser.PseudoClass
        public final boolean matches(@Nullable RuleMatchContext ruleMatchContext, @Nullable SVG.SvgElementBase svgElementBase) {
            boolean z10 = this.f51152a;
            String nodeName = this.f51153b;
            if (z10 && nodeName == null) {
                nodeName = svgElementBase != null ? svgElementBase.getNodeName() : null;
            }
            Intrinsics.checkNotNull(svgElementBase);
            if (svgElementBase.getParent() == null) {
                return true;
            }
            SVG.SvgContainer parent = svgElementBase.getParent();
            Intrinsics.checkNotNull(parent);
            int i10 = 0;
            for (SVG.SvgObject svgObject : parent.getChildren()) {
                Intrinsics.checkNotNull(svgObject, "null cannot be cast to non-null type com.mastercard.sonic.androidsvg.SVG.SvgElementBase");
                SVG.SvgElementBase svgElementBase2 = (SVG.SvgElementBase) svgObject;
                if (nodeName == null || Intrinsics.areEqual(svgElementBase2.getNodeName(), nodeName)) {
                    i10++;
                }
            }
            return i10 == 1;
        }

        @NotNull
        public final String toString() {
            if (this.f51152a) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return ai.a.i(new Object[]{this.f51153b}, 1, "only-of-type <%s>", "format(format, *args)");
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            return ai.a.i(new Object[0], 0, "only-child", "format(format, *args)");
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    public static final class f implements PseudoClass {
        @Override // com.mastercard.sonic.androidsvg.CSSParser.PseudoClass
        public final boolean matches(@Nullable RuleMatchContext ruleMatchContext, @Nullable SVG.SvgElementBase svgElementBase) {
            Intrinsics.checkNotNull(svgElementBase);
            return svgElementBase.getParent() == null;
        }

        @NotNull
        public final String toString() {
            return "root";
        }
    }

    /* JADX INFO: compiled from: CSSParser.kt */
    public static final class g implements PseudoClass {
        @Override // com.mastercard.sonic.androidsvg.CSSParser.PseudoClass
        public final boolean matches(@Nullable RuleMatchContext ruleMatchContext, @Nullable SVG.SvgElementBase svgElementBase) {
            return ruleMatchContext != null && svgElementBase == ruleMatchContext.getTargetElement();
        }

        @NotNull
        public final String toString() {
            return "target";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CSSParser() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @JvmStatic
    public static final boolean mediaMatches(@NotNull String str, @Nullable MediaType mediaType) {
        return INSTANCE.mediaMatches(str, mediaType);
    }

    @JvmStatic
    @Nullable
    public static final List<String> parseClassAttribute(@NotNull String str) {
        return INSTANCE.parseClassAttribute(str);
    }

    @JvmStatic
    public static final boolean ruleMatch(@Nullable RuleMatchContext ruleMatchContext, @Nullable Selector selector, @Nullable SVG.SvgElementBase svgElementBase) {
        return INSTANCE.ruleMatch(ruleMatchContext, selector, svgElementBase);
    }

    public final void a(Ruleset ruleset, CSSTextScanner cSSTextScanner) throws CSSParseException {
        Integer numNextChar;
        String strNextIdentifier = cSSTextScanner.nextIdentifier();
        cSSTextScanner.skipWhitespace();
        if (strNextIdentifier == null) {
            throw new CSSParseException("Invalid '@' rule", null, 2, null);
        }
        int i10 = 0;
        if (!this.f51128c && Intrinsics.areEqual(strNextIdentifier, SVGParser.XML_STYLESHEET_ATTR_MEDIA)) {
            Companion companion = INSTANCE;
            List listAccess$parseMediaList = Companion.access$parseMediaList(companion, cSSTextScanner);
            if (!cSSTextScanner.consume(AbstractJsonLexerKt.BEGIN_OBJ)) {
                throw new CSSParseException("Invalid @media rule: missing rule set", null, 2, null);
            }
            cSSTextScanner.skipWhitespace();
            if (Companion.access$mediaMatches(companion, listAccess$parseMediaList, this.deviceMediaType)) {
                this.f51128c = true;
                ruleset.addAll(c(cSSTextScanner));
                this.f51128c = false;
            } else {
                c(cSSTextScanner);
            }
            if (!cSSTextScanner.empty() && !cSSTextScanner.consume(AbstractJsonLexerKt.END_OBJ)) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set", null, 2, null);
            }
        } else if (this.f51128c || !Intrinsics.areEqual(strNextIdentifier, "import")) {
            Companion.access$warn(INSTANCE, "Ignoring @%s rule", strNextIdentifier);
            while (!cSSTextScanner.empty() && ((numNextChar = cSSTextScanner.nextChar()) == null || numNextChar.intValue() != 59 || i10 != 0)) {
                if (numNextChar != null && numNextChar.intValue() == 123) {
                    i10++;
                } else if (numNextChar != null && numNextChar.intValue() == 125 && i10 > 0 && (i10 = i10 - 1) == 0) {
                    break;
                }
            }
        } else {
            String strNextURL = cSSTextScanner.nextURL();
            if (strNextURL == null) {
                strNextURL = cSSTextScanner.nextCSSString();
            }
            if (strNextURL == null) {
                throw new CSSParseException("Invalid @import rule: expected string or url()", null, 2, null);
            }
            cSSTextScanner.skipWhitespace();
            Companion companion2 = INSTANCE;
            List listAccess$parseMediaList2 = Companion.access$parseMediaList(companion2, cSSTextScanner);
            if (!cSSTextScanner.empty() && !cSSTextScanner.consume(';')) {
                throw new CSSParseException("Invalid @media rule: expected '}' at end of rule set", null, 2, null);
            }
            SVG.Companion companion3 = SVG.INSTANCE;
            if (companion3.getExternalFileResolver() != null && Companion.access$mediaMatches(companion2, listAccess$parseMediaList2, this.deviceMediaType)) {
                SVGExternalFileResolver externalFileResolver = companion3.getExternalFileResolver();
                Intrinsics.checkNotNull(externalFileResolver);
                String strResolveCSSStyleSheet = externalFileResolver.resolveCSSStyleSheet(strNextURL);
                if (strResolveCSSStyleSheet == null) {
                    return;
                } else {
                    ruleset.addAll(parse(strResolveCSSStyleSheet));
                }
            }
        }
        cSSTextScanner.skipWhitespace();
    }

    public final boolean b(Ruleset ruleset, CSSTextScanner cSSTextScanner) throws CSSParseException {
        List<Selector> listNextSelectorGroup = cSSTextScanner.nextSelectorGroup();
        if (listNextSelectorGroup == null || listNextSelectorGroup.isEmpty()) {
            return false;
        }
        if (!cSSTextScanner.consume(AbstractJsonLexerKt.BEGIN_OBJ)) {
            throw new CSSParseException("Malformed rule block: expected '{'", null, 2, null);
        }
        cSSTextScanner.skipWhitespace();
        SVG.Style style = new SVG.Style();
        do {
            String strNextIdentifier = cSSTextScanner.nextIdentifier();
            cSSTextScanner.skipWhitespace();
            if (!cSSTextScanner.consume(AbstractJsonLexerKt.COLON)) {
                throw new CSSParseException("Expected ':'", null, 2, null);
            }
            cSSTextScanner.skipWhitespace();
            String strNextPropertyValue = cSSTextScanner.nextPropertyValue();
            if (strNextPropertyValue == null) {
                throw new CSSParseException("Expected property value", null, 2, null);
            }
            cSSTextScanner.skipWhitespace();
            if (cSSTextScanner.consume('!')) {
                cSSTextScanner.skipWhitespace();
                if (!cSSTextScanner.consume("important")) {
                    throw new CSSParseException("Malformed rule set: found unexpected '!'", null, 2, null);
                }
                cSSTextScanner.skipWhitespace();
            }
            cSSTextScanner.consume(';');
            SVGParser.INSTANCE.processStyleProperty(style, strNextIdentifier, strNextPropertyValue);
            cSSTextScanner.skipWhitespace();
            if (cSSTextScanner.empty()) {
                break;
            }
        } while (!cSSTextScanner.consume(AbstractJsonLexerKt.END_OBJ));
        cSSTextScanner.skipWhitespace();
        Iterator<Selector> it = listNextSelectorGroup.iterator();
        while (it.hasNext()) {
            ruleset.add(new Rule(it.next(), style, this.f51127b));
        }
        return true;
    }

    public final Ruleset c(CSSTextScanner cSSTextScanner) {
        Ruleset ruleset = new Ruleset();
        while (!cSSTextScanner.empty()) {
            try {
                if (!cSSTextScanner.consume("<!--") && !cSSTextScanner.consume("-->")) {
                    if (cSSTextScanner.consume('@')) {
                        a(ruleset, cSSTextScanner);
                    } else if (!b(ruleset, cSSTextScanner)) {
                        break;
                    }
                }
            } catch (CSSParseException e5) {
                e5.getMessage();
            }
        }
        return ruleset;
    }

    @Nullable
    public final MediaType getDeviceMediaType() {
        return this.deviceMediaType;
    }

    @NotNull
    public final Ruleset parse(@NotNull String sheet) {
        Intrinsics.checkNotNullParameter(sheet, "sheet");
        CSSTextScanner cSSTextScanner = new CSSTextScanner(sheet);
        cSSTextScanner.skipWhitespace();
        return c(cSSTextScanner);
    }

    public final void setDeviceMediaType(@Nullable MediaType mediaType) {
        this.deviceMediaType = mediaType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public CSSParser(@Nullable MediaType mediaType) {
        this(mediaType, null, 2, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public CSSParser(@Nullable MediaType mediaType, @Nullable Source source) {
        this.deviceMediaType = mediaType;
        this.f51127b = source;
    }

    public /* synthetic */ CSSParser(MediaType mediaType, Source source, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? MediaType.screen : mediaType, (i10 & 2) != 0 ? Source.Document : source);
    }

    public CSSParser(@Nullable Source source) {
        this(MediaType.screen, source);
    }
}
