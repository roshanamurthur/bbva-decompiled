package com.veridas.permissions;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.veridas.permissions.IPermission;
import com.veridas.permissions.PermissionStatus;
import com.veridas.permissions.PermissionsActivity;
import com.veridas.permissions.PermissionsProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PermissionsActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\t"}, d2 = {"Lcom/veridas/permissions/PermissionsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "common-core_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPermissionsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsActivity.kt\ncom/veridas/permissions/PermissionsActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1747#2,3:139\n1549#2:142\n1620#2,3:143\n1549#2:148\n1620#2,3:149\n1549#2:152\n1620#2,2:153\n1622#2:156\n1549#2:157\n1620#2,3:158\n37#3,2:146\n1#4:155\n*S KotlinDebug\n*F\n+ 1 PermissionsActivity.kt\ncom/veridas/permissions/PermissionsActivity\n*L\n89#1:139,3\n118#1:142\n118#1:143,3\n122#1:148\n122#1:149,3\n54#1:152\n54#1:153,2\n54#1:156\n56#1:157\n56#1:158,3\n118#1:146,2\n*E\n"})
public final class PermissionsActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f67269p0 = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f67270q0 = LazyKt__LazyJVMKt.lazy(b.f67273p0);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncher<String[]> f67271r0;

    /* JADX INFO: compiled from: PermissionsActivity.kt */
    @SourceDebugExtension({"SMAP\nPermissionsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsActivity.kt\ncom/veridas/permissions/PermissionsActivity$permissionsToRequest$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1549#2:139\n1620#2,3:140\n*S KotlinDebug\n*F\n+ 1 PermissionsActivity.kt\ncom/veridas/permissions/PermissionsActivity$permissionsToRequest$2\n*L\n41#1:139\n41#1:140,3\n*E\n"})
    public static final class a extends Lambda implements Function0<List<? extends PermissionsActivity$permissionsToRequest$2$1$1>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends PermissionsActivity$permissionsToRequest$2$1$1> invoke() {
            ArrayList<String> stringArrayListExtra = PermissionsActivity.this.getIntent().getStringArrayListExtra("PERMISSIONS_EXTRA");
            Intrinsics.checkNotNull(stringArrayListExtra);
            List list = CollectionsKt___CollectionsKt.toList(stringArrayListExtra);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new PermissionsActivity$permissionsToRequest$2$1$1((String) it.next()));
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: PermissionsActivity.kt */
    public static final class b extends Lambda implements Function0<IRationaleConfigurationProvider> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f67273p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final IRationaleConfigurationProvider invoke() {
            return RationaleConfigurationInjector.INSTANCE.getConfiguration();
        }
    }

    public PermissionsActivity() {
        ActivityResultLauncher<String[]> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new vf.a(this));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.f67271r0 = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(List<? extends IPermission> list) {
        List<? extends IPermission> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((IPermission) it.next()).getId());
        }
        this.f67271r0.launch(arrayList.toArray(new String[0]));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(16);
        if (savedInstanceState == null) {
            final List<? extends IPermission> list = (List) this.f67269p0.getValue();
            IRationaleConfigurationProvider iRationaleConfigurationProvider = (IRationaleConfigurationProvider) this.f67270q0.getValue();
            List<? extends IPermission> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(this, ((IPermission) it.next()).getId())) {
                        if (!iRationaleConfigurationProvider.isRationaleEnabled()) {
                            break;
                        }
                        MaterialAlertDialogBuilder materialAlertDialogBuilder = new MaterialAlertDialogBuilder(this);
                        String title = iRationaleConfigurationProvider.getTitle(list);
                        if (title != null) {
                            materialAlertDialogBuilder.setTitle((CharSequence) title);
                        }
                        String message = iRationaleConfigurationProvider.getMessage(list);
                        if (message != null) {
                            materialAlertDialogBuilder.setMessage((CharSequence) message);
                        }
                        String negativeButtonText = iRationaleConfigurationProvider.getNegativeButtonText();
                        if (negativeButtonText != null) {
                            materialAlertDialogBuilder.setNegativeButton((CharSequence) negativeButtonText, new DialogInterface.OnClickListener() { // from class: dj.a
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i10) {
                                    PermissionsActivity.Companion companion = PermissionsActivity.INSTANCE;
                                    PermissionsActivity this$0 = this.f68182p0;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    List permissions = list;
                                    Intrinsics.checkNotNullParameter(permissions, "$permissions");
                                    this$0.getClass();
                                    List list3 = permissions;
                                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                    Iterator it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(ContextCompat.checkSelfPermission(this$0, ((IPermission) it2.next()).getId()) == 0 ? PermissionStatus.Granted.INSTANCE : PermissionStatus.NotGranted.INSTANCE);
                                    }
                                    PermissionsProvider.IPermissionRequestResultListener currentPermissionRequestListener = PermissionsProvider.INSTANCE.getCurrentPermissionRequestListener();
                                    if (currentPermissionRequestListener != null) {
                                        currentPermissionRequestListener.onPermissionsResult(arrayList);
                                    }
                                    this$0.finish();
                                }
                            });
                        }
                        materialAlertDialogBuilder.setPositiveButton((CharSequence) iRationaleConfigurationProvider.getPositiveButton(), new DialogInterface.OnClickListener() { // from class: dj.b
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i10) {
                                PermissionsActivity.Companion companion = PermissionsActivity.INSTANCE;
                                PermissionsActivity this$0 = this.f68184p0;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                List<? extends IPermission> permissions = list;
                                Intrinsics.checkNotNullParameter(permissions, "$permissions");
                                this$0.f(permissions);
                            }
                        });
                        materialAlertDialogBuilder.show();
                        return;
                    }
                }
            }
            f(list);
        }
    }

    /* JADX INFO: compiled from: PermissionsActivity.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/veridas/permissions/PermissionsActivity$Companion;", "", "()V", "PERMISSIONS_EXTRA", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "", "context", "Landroid/content/Context;", "permission", "Lcom/veridas/permissions/IPermission;", "permissions", "", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nPermissionsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsActivity.kt\ncom/veridas/permissions/PermissionsActivity$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n1549#2:139\n1620#2,3:140\n*S KotlinDebug\n*F\n+ 1 PermissionsActivity.kt\ncom/veridas/permissions/PermissionsActivity$Companion\n*L\n33#1:139\n33#1:140,3\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void start(@NotNull Context context, @NotNull IPermission permission) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permission, "permission");
            Intent intent = new Intent(context, (Class<?>) PermissionsActivity.class);
            intent.putStringArrayListExtra("PERMISSIONS_EXTRA", CollectionsKt__CollectionsKt.arrayListOf(permission.getId()));
            intent.addFlags(268435456);
            context.startActivity(intent);
        }

        public final void start(@NotNull Context context, @NotNull List<? extends IPermission> permissions) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            Intent intent = new Intent(context, (Class<?>) PermissionsActivity.class);
            List<? extends IPermission> list = permissions;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((IPermission) it.next()).getId());
            }
            intent.putStringArrayListExtra("PERMISSIONS_EXTRA", new ArrayList<>(arrayList));
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }
}
