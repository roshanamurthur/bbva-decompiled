package com.bbva.component.dm.actionlauncher;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.webkit.internal.AssetHelper;
import com.bbva.component.dm.actionlauncher.model.Action;
import com.bbva.component.dm.actionlauncher.model.ViewPayload;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IntentMappers.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0006H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0007H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\bH\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\tH\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\nH\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u000bH\u0000¨\u0006\f"}, d2 = {"toIntent", "Landroid/content/Intent;", "Lcom/bbva/component/dm/actionlauncher/model/Action;", "context", "Landroid/content/Context;", "Lcom/bbva/component/dm/actionlauncher/model/Action$App;", "Lcom/bbva/component/dm/actionlauncher/model/Action$Dialer;", "Lcom/bbva/component/dm/actionlauncher/model/Action$Market;", "Lcom/bbva/component/dm/actionlauncher/model/Action$Settings;", "Lcom/bbva/component/dm/actionlauncher/model/Action$Share;", "Lcom/bbva/component/dm/actionlauncher/model/Action$ShareFile;", "Lcom/bbva/component/dm/actionlauncher/model/Action$View;", "component-dm-actionlauncher_release"}, k = 2, mv = {1, 1, 13})
public final class IntentMappersKt {
    @Nullable
    public static final Intent toIntent(@NotNull Action action, @NotNull Context context) {
        if (action instanceof Action.Dialer) {
            return toIntent((Action.Dialer) action);
        }
        if (action instanceof Action.Share) {
            return toIntent((Action.Share) action);
        }
        if (action instanceof Action.View) {
            return toIntent((Action.View) action);
        }
        if (action instanceof Action.Market) {
            return toIntent((Action.Market) action);
        }
        if (action instanceof Action.App) {
            return toIntent((Action.App) action, context);
        }
        if (action instanceof Action.ShareFile) {
            return toIntent((Action.ShareFile) action);
        }
        if (action instanceof Action.Settings) {
            return toIntent((Action.Settings) action);
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final Intent toIntent(@NotNull Action.Dialer dialer) {
        Intent data = new Intent("android.intent.action.DIAL").setData(Uri.parse("tel:" + dialer.getPhone()));
        Intrinsics.checkExpressionValueIsNotNull(data, "Intent(Intent.ACTION_DIA…(Uri.parse(\"tel:$phone\"))");
        return data;
    }

    @NotNull
    public static final Intent toIntent(@NotNull Action.Share share) {
        String[] strArr;
        Intent intent = new Intent("android.intent.action.SEND");
        String text = share.getPayload().getText();
        if (text != null && text.length() != 0) {
            intent.putExtra("android.intent.extra.TEXT", share.getPayload().getText());
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        }
        List<String> email = share.getPayload().getEmail();
        if (email != null && email.size() > 0) {
            List<String> email2 = share.getPayload().getEmail();
            if (email2 != null) {
                Object[] array = email2.toArray(new String[0]);
                if (array == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                strArr = (String[]) array;
            } else {
                strArr = null;
            }
            intent.putExtra("android.intent.extra.EMAIL", strArr);
        }
        String subject = share.getPayload().getSubject();
        if (subject != null && subject.length() != 0) {
            intent.putExtra("android.intent.extra.SUBJECT", share.getPayload().getSubject());
        }
        Intent intentCreateChooser = Intent.createChooser(intent, share.getPayload().getTitle());
        Intrinsics.checkExpressionValueIsNotNull(intentCreateChooser, "Intent.createChooser(intent, payload.title)");
        return intentCreateChooser;
    }

    @NotNull
    public static final Intent toIntent(@NotNull Action.View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uri = Uri.parse(view.getPayload().getValue());
        if (view.getPayload().getMime() != null) {
            intent.setDataAndType(uri, view.getPayload().getMime());
        } else {
            intent.setData(uri);
        }
        if (view.getPayload().getFlags() != 0) {
            intent.setFlags(view.getPayload().getFlags());
        }
        return intent;
    }

    @NotNull
    public static final Intent toIntent(@NotNull Action.ShareFile shareFile) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(shareFile.getPayload().getUri()));
        intent.setType(shareFile.getPayload().getMimeType());
        if (shareFile.getPayload().getFlags() != 0) {
            intent.setFlags(shareFile.getPayload().getFlags());
        }
        Intent intentCreateChooser = Intent.createChooser(intent, shareFile.getPayload().getTitle());
        Intrinsics.checkExpressionValueIsNotNull(intentCreateChooser, "Intent.createChooser(this, payload.title)");
        Intrinsics.checkExpressionValueIsNotNull(intentCreateChooser, "Intent(Intent.ACTION_SEN…er(this, payload.title) }");
        return intentCreateChooser;
    }

    @Nullable
    public static final Intent toIntent(@NotNull Action.App app, @NotNull Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(app.getPayload().getPackageName());
        if (launchIntentForPackage != null) {
            return launchIntentForPackage;
        }
        if (!app.getPayload().getMarketFallback()) {
            return null;
        }
        return toIntent(new Action.View(new ViewPayload("market://details?id=" + app.getPayload().getPackageName(), null, 0, 6, null), null, 2, null));
    }

    @NotNull
    public static final Intent toIntent(@NotNull Action.Market market) {
        return toIntent(new Action.View(new ViewPayload("market://details?id=" + market.getPackageName(), null, 0, 6, null), null, 2, null));
    }

    @NotNull
    public static final Intent toIntent(@NotNull Action.Settings settings) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", settings.getPackageName(), null));
        return intent;
    }
}
