package org.junit.internal.runners.rules;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.MethodRule;
import org.junit.rules.TestRule;
import org.junit.runners.model.FrameworkMember;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes13.dex */
public class RuleMemberValidator {
    public static final RuleMemberValidator CLASS_RULE_METHOD_VALIDATOR;
    public static final RuleMemberValidator CLASS_RULE_VALIDATOR;
    public static final RuleMemberValidator RULE_METHOD_VALIDATOR;
    public static final RuleMemberValidator RULE_VALIDATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f91899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f91901c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends Annotation> f91902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f91903b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f91904c = new ArrayList();

        public a(Class cls) {
            this.f91902a = cls;
        }

        public final void a(j jVar) {
            this.f91904c.add(jVar);
        }
    }

    public static final class b implements j {
        @Override // org.junit.internal.runners.rules.RuleMemberValidator.j
        public final void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (Modifier.isPublic(frameworkMember.getDeclaringClass().getModifiers())) {
                return;
            }
            list.add(new kn.a(frameworkMember, cls, "must be declared in a public class."));
        }
    }

    public static final class c implements j {
        @Override // org.junit.internal.runners.rules.RuleMemberValidator.j
        public final void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            RuleMemberValidator ruleMemberValidator = RuleMemberValidator.CLASS_RULE_VALIDATOR;
            if (MethodRule.class.isAssignableFrom(frameworkMember.getType()) || TestRule.class.isAssignableFrom(frameworkMember.getType())) {
                return;
            }
            list.add(new kn.a(frameworkMember, cls, "must implement MethodRule or TestRule."));
        }
    }

    public static final class d implements j {
        @Override // org.junit.internal.runners.rules.RuleMemberValidator.j
        public final void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            RuleMemberValidator ruleMemberValidator = RuleMemberValidator.CLASS_RULE_VALIDATOR;
            if (TestRule.class.isAssignableFrom(frameworkMember.getType())) {
                return;
            }
            list.add(new kn.a(frameworkMember, cls, "must implement TestRule."));
        }
    }

    public static final class e implements j {
        @Override // org.junit.internal.runners.rules.RuleMemberValidator.j
        public final void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            RuleMemberValidator ruleMemberValidator = RuleMemberValidator.CLASS_RULE_VALIDATOR;
            boolean zIsAssignableFrom = MethodRule.class.isAssignableFrom(frameworkMember.getType());
            boolean z10 = frameworkMember.getAnnotation(ClassRule.class) != null;
            if (frameworkMember.isStatic()) {
                if (zIsAssignableFrom || !z10) {
                    list.add(new kn.a(frameworkMember, cls, MethodRule.class.isAssignableFrom(frameworkMember.getType()) ? "must not be static." : "must not be static or it must be annotated with @ClassRule."));
                }
            }
        }
    }

    public static final class f implements j {
        @Override // org.junit.internal.runners.rules.RuleMemberValidator.j
        public final void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (frameworkMember.isPublic()) {
                return;
            }
            list.add(new kn.a(frameworkMember, cls, "must be public."));
        }
    }

    public static final class g implements j {
        @Override // org.junit.internal.runners.rules.RuleMemberValidator.j
        public final void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            if (frameworkMember.isStatic()) {
                return;
            }
            list.add(new kn.a(frameworkMember, cls, "must be static."));
        }
    }

    public static final class h implements j {
        @Override // org.junit.internal.runners.rules.RuleMemberValidator.j
        public final void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            RuleMemberValidator ruleMemberValidator = RuleMemberValidator.CLASS_RULE_VALIDATOR;
            if (MethodRule.class.isAssignableFrom(frameworkMember.getType()) || TestRule.class.isAssignableFrom(frameworkMember.getType())) {
                return;
            }
            list.add(new kn.a(frameworkMember, cls, "must return an implementation of MethodRule or TestRule."));
        }
    }

    public static final class i implements j {
        @Override // org.junit.internal.runners.rules.RuleMemberValidator.j
        public final void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list) {
            RuleMemberValidator ruleMemberValidator = RuleMemberValidator.CLASS_RULE_VALIDATOR;
            if (TestRule.class.isAssignableFrom(frameworkMember.getType())) {
                return;
            }
            list.add(new kn.a(frameworkMember, cls, "must return an implementation of TestRule."));
        }
    }

    public interface j {
        void a(FrameworkMember<?> frameworkMember, Class<? extends Annotation> cls, List<Throwable> list);
    }

    static {
        a aVar = new a(ClassRule.class);
        aVar.a(new b());
        aVar.a(new g());
        aVar.a(new f());
        aVar.a(new d());
        CLASS_RULE_VALIDATOR = new RuleMemberValidator(aVar);
        a aVar2 = new a(Rule.class);
        aVar2.a(new e());
        aVar2.a(new f());
        aVar2.a(new c());
        RULE_VALIDATOR = new RuleMemberValidator(aVar2);
        a aVar3 = new a(ClassRule.class);
        aVar3.f91903b = true;
        aVar3.a(new b());
        aVar3.a(new g());
        aVar3.a(new f());
        aVar3.a(new i());
        CLASS_RULE_METHOD_VALIDATOR = new RuleMemberValidator(aVar3);
        a aVar4 = new a(Rule.class);
        aVar4.f91903b = true;
        aVar4.a(new e());
        aVar4.a(new f());
        aVar4.a(new h());
        RULE_METHOD_VALIDATOR = new RuleMemberValidator(aVar4);
    }

    public RuleMemberValidator(a aVar) {
        this.f91899a = aVar.f91902a;
        this.f91900b = aVar.f91903b;
        this.f91901c = aVar.f91904c;
    }

    public void validate(TestClass testClass, List<Throwable> list) {
        boolean z10 = this.f91900b;
        Class<? extends Annotation> cls = this.f91899a;
        for (FrameworkMember<?> frameworkMember : z10 ? testClass.getAnnotatedMethods(cls) : testClass.getAnnotatedFields(cls)) {
            Iterator it = this.f91901c.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(frameworkMember, cls, list);
            }
        }
    }
}
