package com.bbva.encryptionplugin;

import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.encryptionplugin.contract.Injections;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EncryptionPlugin.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014R\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/bbva/encryptionplugin/EncryptionPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "Lcom/bbva/encryptionplugin/contract/Injections;", "a", "Lkotlin/Lazy;", "getInjections", "()Lcom/bbva/encryptionplugin/contract/Injections;", "injections", "<init>", "()V", "Companion", "encryption_plugin_release"}, k = 1, mv = {1, 4, 0})
public final class EncryptionPlugin extends Plugin {

    @NotNull
    public static final String ID = "Encryption";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy injections = LazyKt__LazyJVMKt.lazy(b.f29233p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f29230b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EncryptionPlugin.class), "injections", "getInjections()Lcom/bbva/encryptionplugin/contract/Injections;"))};

    /* JADX INFO: compiled from: EncryptionPlugin.kt */
    public static final class a extends Lambda implements Function0<Injections> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Injections invoke() {
            return EncryptionPlugin.this.getInjections();
        }
    }

    /* JADX INFO: compiled from: EncryptionPlugin.kt */
    public static final class b extends Lambda implements Function0<InjectionsImpl> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f29233p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final InjectionsImpl invoke() {
            return new InjectionsImpl();
        }
    }

    public EncryptionPlugin() {
        InjectionsContainer injectionsContainer = InjectionsContainer.INSTANCE;
        injectionsContainer.getMap().put(Reflection.getOrCreateKotlinClass(Injections.class), new a());
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new EncryptionCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }

    @NotNull
    public final Injections getInjections() {
        KProperty kProperty = f29230b[0];
        return (Injections) this.injections.getValue();
    }
}
