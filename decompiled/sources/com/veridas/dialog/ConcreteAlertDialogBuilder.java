package com.veridas.dialog;

import aj.c;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.appcompat.app.AlertDialog;
import androidx.core.text.HtmlCompat;
import androidx.room.a;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.veridas.log.Log;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AlertDialogBuilder.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BÑ\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0002\u001a\u00020\u0000H\u0016J\b\u0010\u0003\u001a\u00020\u0000H\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\tH\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\tH\u0016J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016¨\u0006!"}, d2 = {"Lcom/veridas/dialog/ConcreteAlertDialogBuilder;", "Lcom/veridas/dialog/AlertDialogBuilder;", "createAlertDialog", "createProgressDialog", "", "value", "cancelable", "Landroid/content/Context;", "context", "", "fallbackThemeId", "", "fallbackThemeName", "indeterminate", "indeterminateDrawableName", "message", "Landroid/content/DialogInterface$OnClickListener;", "negativeButtonClickButtonListener", "negativeButtonText", "negativeButtonTextColor", "positiveButtonClickButtonListener", "positiveButtonText", "positiveButtonTextColor", "style", "themeId", "themeName", "title", "Landroid/app/Dialog;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/veridas/dialog/DialogRegistry;", "registry", "<init>", "(Ljava/lang/Boolean;Landroid/content/Context;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;Ljava/lang/Integer;Landroid/content/DialogInterface$OnClickListener;Ljava/lang/String;Ljava/lang/Integer;Lcom/veridas/dialog/DialogRegistry;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class ConcreteAlertDialogBuilder implements AlertDialogBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Boolean f67062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Context f67063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public String f67064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f67065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Boolean f67066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f67067f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f67068g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public DialogInterface.OnClickListener f67069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f67070i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public DialogInterface.OnClickListener f67071j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public String f67072k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final DialogRegistry f67073l;

    @NotNull
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public String f67074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f67075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public String f67076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public c f67077q;

    /* JADX INFO: compiled from: AlertDialogBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ConcreteAlertDialogBuilder(@Nullable Boolean bool, @Nullable Context context, @NotNull String fallbackThemeName, int i10, @Nullable Boolean bool2, @Nullable String str, @Nullable String str2, @Nullable DialogInterface.OnClickListener onClickListener, @Nullable String str3, @Nullable Integer num, @Nullable DialogInterface.OnClickListener onClickListener2, @Nullable String str4, @Nullable Integer num2, @NotNull DialogRegistry registry, @NotNull String style, @NotNull String themeName, int i11, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(fallbackThemeName, "fallbackThemeName");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(themeName, "themeName");
        this.f67062a = bool;
        this.f67063b = context;
        this.f67064c = fallbackThemeName;
        this.f67065d = i10;
        this.f67066e = bool2;
        this.f67067f = str;
        this.f67068g = str2;
        this.f67069h = onClickListener;
        this.f67070i = str3;
        this.f67071j = onClickListener2;
        this.f67072k = str4;
        this.f67073l = registry;
        this.m = style;
        this.f67074n = themeName;
        this.f67075o = i11;
        this.f67076p = str5;
    }

    public final int a(Context context, Resources resources, String str) {
        String str2 = this.f67074n;
        int i10 = this.f67075o;
        Locale locale = Locale.ROOT;
        if (!Intrinsics.areEqual(a.d(locale, "ROOT", str2, locale, "toLowerCase(...)"), "undefined") || i10 != 0) {
            return !Intrinsics.areEqual(str2, "undefined") ? resources.getIdentifier(str2, "style", context.getPackageName()) : i10;
        }
        if (Intrinsics.areEqual(a.d(locale, "ROOT", str, locale, "toLowerCase(...)"), "white")) {
            return 0;
        }
        String str3 = this.f67064c;
        return !Intrinsics.areEqual(a.d(locale, "ROOT", str3, locale, "toLowerCase(...)"), "undefined") ? resources.getIdentifier(str3, "style", context.getPackageName()) : this.f67065d;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public Dialog build() {
        Dialog dialog;
        int identifier;
        c cVar = this.f67077q;
        if (cVar == null) {
            throw new IllegalArgumentException("A dialog type must be selected.".toString());
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i10 == 1) {
            Context context = this.f67063b;
            if (context == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Resources resources = context.getResources();
            String str = this.m;
            if (!(!Intrinsics.areEqual(str, "undefined"))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Intrinsics.checkNotNull(resources);
            int iA = a(context, resources, str);
            AlertDialog.Builder builder = iA == 0 ? new AlertDialog.Builder(context) : new AlertDialog.Builder(context, iA);
            String str2 = this.f67068g;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            builder.setMessage(HtmlCompat.fromHtml(str2, 0));
            String str3 = this.f67076p;
            if (str3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            builder.setTitle(HtmlCompat.fromHtml(str3, 0));
            Boolean bool = this.f67062a;
            if (bool != null) {
                builder.setCancelable(bool.booleanValue());
            }
            DialogInterface.OnClickListener onClickListener = this.f67069h;
            String str4 = this.f67070i;
            if (str4 != null || onClickListener != null) {
                if (str4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                if (onClickListener == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                builder.setNegativeButton(str4, onClickListener);
            }
            DialogInterface.OnClickListener onClickListener2 = this.f67071j;
            String str5 = this.f67072k;
            if (str5 != null || onClickListener2 != null) {
                if (str5 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                if (onClickListener2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                builder.setNegativeButton(str5, onClickListener2);
            }
            AlertDialog alertDialogCreate = builder.create();
            Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
            dialog = alertDialogCreate;
            if (!Intrinsics.areEqual(str, "white")) {
                alertDialogCreate.setOnShowListener(new aj.a());
                dialog = alertDialogCreate;
            }
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Context context2 = this.f67063b;
            if (context2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Resources resources2 = context2.getResources();
            String str6 = this.m;
            if (!(!Intrinsics.areEqual(str6, "undefined"))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Intrinsics.checkNotNull(resources2);
            int iA2 = a(context2, resources2, str6);
            ProgressDialog progressDialog = iA2 == 0 ? new ProgressDialog(context2) : new ProgressDialog(context2, iA2);
            String str7 = this.f67068g;
            if (str7 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            progressDialog.setMessage(HtmlCompat.fromHtml(str7, 0));
            String str8 = this.f67076p;
            if (str8 != null) {
                progressDialog.setTitle(HtmlCompat.fromHtml(str8, 0));
            }
            Boolean bool2 = this.f67062a;
            if (bool2 != null) {
                progressDialog.setCancelable(bool2.booleanValue());
            }
            Boolean bool3 = this.f67066e;
            if (bool3 != null) {
                progressDialog.setIndeterminate(bool3.booleanValue());
                String str9 = this.f67067f;
                if (str9 != null && (identifier = resources2.getIdentifier(str9, PluginUtils.IDENTIFIER_DRAWABLE, context2.getPackageName())) != 0) {
                    try {
                        progressDialog.setIndeterminateDrawable(resources2.getDrawable(identifier));
                    } catch (Resources.NotFoundException e5) {
                        Log.e("ConcreteAlertDialogBuilder", "Resource not found: " + identifier, e5);
                    }
                }
            }
            DialogInterface.OnClickListener onClickListener3 = this.f67069h;
            String str10 = this.f67070i;
            if (str10 != null || onClickListener3 != null) {
                if (str10 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                if (onClickListener3 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                progressDialog.setButton(-2, str10, onClickListener3);
            }
            DialogInterface.OnClickListener onClickListener4 = this.f67071j;
            String str11 = this.f67072k;
            if (str11 != null || onClickListener4 != null) {
                if (str11 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                if (onClickListener4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                progressDialog.setButton(-1, str11, onClickListener4);
            }
            dialog = progressDialog;
            if (!Intrinsics.areEqual(str6, "white")) {
                progressDialog.setOnShowListener(new aj.a());
                dialog = progressDialog;
            }
        }
        this.f67073l.add(dialog);
        return dialog;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder negativeButtonTextColor(int value) {
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder positiveButtonTextColor(int value) {
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder cancelable(boolean value) {
        this.f67062a = Boolean.valueOf(value);
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder context(@NotNull Context value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67063b = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder createAlertDialog() {
        if (this.f67077q != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f67077q = c.ALERT;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder createProgressDialog() {
        if (this.f67077q != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this.f67077q = c.PROGRESS;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder fallbackThemeId(int value) {
        this.f67065d = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder fallbackThemeName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67064c = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder indeterminate(boolean value) {
        this.f67066e = Boolean.valueOf(value);
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder indeterminateDrawableName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67067f = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder message(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67068g = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder negativeButtonClickButtonListener(@NotNull DialogInterface.OnClickListener value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67069h = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder negativeButtonText(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67070i = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder positiveButtonClickButtonListener(@NotNull DialogInterface.OnClickListener value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67071j = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder positiveButtonText(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67072k = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder style(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.m = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder themeId(int value) {
        this.f67075o = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder themeName(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67074n = value;
        return this;
    }

    @Override // com.veridas.dialog.AlertDialogBuilder
    @NotNull
    public ConcreteAlertDialogBuilder title(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67076p = value;
        return this;
    }

    public /* synthetic */ ConcreteAlertDialogBuilder(Boolean bool, Context context, String str, int i10, Boolean bool2, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, Integer num, DialogInterface.OnClickListener onClickListener2, String str5, Integer num2, DialogRegistry dialogRegistry, String str6, String str7, int i11, String str8, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : bool, (i12 & 2) != 0 ? null : context, (i12 & 4) != 0 ? "undefined" : str, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? null : bool2, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : onClickListener, (i12 & 256) != 0 ? null : str4, (i12 & 512) != 0 ? null : num, (i12 & 1024) != 0 ? null : onClickListener2, (i12 & 2048) != 0 ? null : str5, (i12 & 4096) != 0 ? null : num2, dialogRegistry, (i12 & 16384) != 0 ? "undefined" : str6, (32768 & i12) != 0 ? "undefined" : str7, (65536 & i12) != 0 ? 0 : i11, (i12 & 131072) != 0 ? null : str8);
    }
}
