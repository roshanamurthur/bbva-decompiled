package com.bbva.document.scanner.plugin.command;

import android.app.Activity;
import androidx.camera.core.impl.t;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.document.scanner.plugin.Injector;
import com.bbva.document.scanner.plugin.launcher.DocumentScannerActivityLauncher;
import com.cells.validator.ValidatorChecker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActivityAwareCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u001d\u0010\n\u001a\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\b\tH\u0004¨\u0006\u0012"}, d2 = {"Lcom/bbva/document/scanner/plugin/command/ActivityAwareCommand;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "commandCallback", "Lkotlin/Function2;", "Lcom/bbva/document/scanner/plugin/launcher/DocumentScannerActivityLauncher;", "Landroid/app/Activity;", "", "Lkotlin/ExtensionFunctionType;", "activityLauncher", "withScannerRequest", "Ljava/lang/Class;", "clazz", "Lcom/cells/validator/ValidatorChecker;", "validatorChecker", "<init>", "(Ljava/lang/Class;Lcom/cells/validator/ValidatorChecker;)V", "document-scanner-plugin_release"}, k = 1, mv = {1, 8, 0})
public abstract class ActivityAwareCommand<T> extends AbstractCommand<T> {

    /* JADX INFO: compiled from: ActivityAwareCommand.kt */
    @SourceDebugExtension({"SMAP\nActivityAwareCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityAwareCommand.kt\ncom/bbva/document/scanner/plugin/command/ActivityAwareCommand$withScannerRequest$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
    public static final class a extends Lambda implements Function1<Activity, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ActivityAwareCommand<T> f29142p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<DocumentScannerActivityLauncher, Activity, Unit> f29143q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ActivityAwareCommand<T> activityAwareCommand, Function2<? super DocumentScannerActivityLauncher, ? super Activity, Unit> function2) {
            super(1);
            this.f29142p0 = activityAwareCommand;
            this.f29143q0 = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Activity activity) {
            Activity it = activity;
            DocumentScannerActivityLauncher documentScannerActivityLauncherAccess$documentScannerActivityRequest = ActivityAwareCommand.access$documentScannerActivityRequest(this.f29142p0);
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this.f29143q0.invoke(documentScannerActivityLauncherAccess$documentScannerActivityRequest, it);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityAwareCommand(@NotNull Class<T> clazz, @NotNull ValidatorChecker<T> validatorChecker) {
        super(clazz, validatorChecker);
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(validatorChecker, "validatorChecker");
    }

    public static final DocumentScannerActivityLauncher access$documentScannerActivityRequest(ActivityAwareCommand activityAwareCommand) {
        activityAwareCommand.getClass();
        return Injector.INSTANCE.getLauncherLauncher();
    }

    public final void withScannerRequest(@NotNull CommandCallback commandCallback, @NotNull Function2<? super DocumentScannerActivityLauncher, ? super Activity, Unit> activityLauncher) {
        Intrinsics.checkNotNullParameter(commandCallback, "commandCallback");
        Intrinsics.checkNotNullParameter(activityLauncher, "activityLauncher");
        Optional<Activity> optional = this.mActivityContainer.get();
        final a aVar = new a(this, activityLauncher);
        optional.ifPresentOrElse(new Consumer() { // from class: r6.a
            @Override // com.bbva.androidtoolkit.optional.function.Consumer
            public final void accept(Object obj) {
                Function1 tmp0 = aVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }
        }, new t(commandCallback, 3));
    }
}
