package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: com.google.mlkit:face-detection@@16.1.7 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzvf {
    public static final zzvf zza;
    public static final zzvf zzb;
    public static final zzvf zzc;
    public static final zzvf zzd;
    public static final zzvf zze;
    public static final zzvf zzf;
    public static final zzvf zzg;
    public static final zzvf zzh;
    public static final zzvf zzi;
    public static final zzvf zzj;
    private static final /* synthetic */ zzvf[] zzk;
    private final Class zzl;

    static {
        zzvf zzvfVar = new zzvf("VOID", 0, Void.class, Void.class, null);
        zza = zzvfVar;
        Class cls = Integer.TYPE;
        zzvf zzvfVar2 = new zzvf("INT", 1, cls, Integer.class, 0);
        zzb = zzvfVar2;
        zzvf zzvfVar3 = new zzvf("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzvfVar3;
        zzvf zzvfVar4 = new zzvf("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzvfVar4;
        zzvf zzvfVar5 = new zzvf("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzvfVar5;
        zzvf zzvfVar6 = new zzvf("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzvfVar6;
        zzvf zzvfVar7 = new zzvf("STRING", 6, String.class, String.class, "");
        zzg = zzvfVar7;
        zzvf zzvfVar8 = new zzvf("BYTE_STRING", 7, zztu.class, zztu.class, zztu.zzb);
        zzh = zzvfVar8;
        zzvf zzvfVar9 = new zzvf("ENUM", 8, cls, Integer.class, null);
        zzi = zzvfVar9;
        zzvf zzvfVar10 = new zzvf("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzvfVar10;
        zzk = new zzvf[]{zzvfVar, zzvfVar2, zzvfVar3, zzvfVar4, zzvfVar5, zzvfVar6, zzvfVar7, zzvfVar8, zzvfVar9, zzvfVar10};
    }

    private zzvf(String str, int i10, Class cls, Class cls2, Object obj) {
        super(str, i10);
        this.zzl = cls2;
    }

    public static zzvf[] values() {
        return (zzvf[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzl;
    }
}
