import{z as e,a8 as t,ac as r,ad as a,ab as o,a9 as i,aa as s,an as l,L as n,bu as c,V as d,ak as m,h as f,bv as u,bt as p,aV as h,aY as g,dp as y,dH as b,af as v,i as S,aN as _,cU as P}from"./952f98a9.js";import{R as A,Y as x,D as $,T as C,v as k,w as T,x as I,G as D,Z as B,M as L,L as E,V as F,E as w,I as M,f as N,z as O,H as z,A as V,a1 as R,F as H,Q as q,a2 as j,aD as X,j as W,t as U,N as G,a3 as K,a4 as Y,K as Z,e as J,S as Q}from"./216055dc.js";import{bf as ee,bg as te,aI as re,aH as ae}from"./7f3d7ca9.js";import{B as oe,a as ie}from"./ff7f0130.js";import{b as se,B as le}from"./30ef6f1f.js";import{s as ne}from"./9ab4f92c.js";import{c as ce,b as de,B as me,a as fe}from"./e3d898b2.js";import"./f89161ad.js";import{B as ue}from"./4861c1f7.js";import{B as pe}from"./077d7438.js";import{B as he}from"./13014d63.js";import{B as ge}from"./c281d121.js";import{B as ye,a as be}from"./8fb82dfa.js";import{B as ve}from"./d7cc5593.js";import"./ff18b1dc.js";import{B as Se}from"./0fc1b8c5.js";import"./6d48045c.js";import"./137e0eeb.js";import"./43966a25.js";import"./c0a2f832.js";import"./cae0f1de.js";import"./854beed0.js";import"./84dff06e.js";import"./7d773f57.js";import"./d2484b66.js";import"./4656db6d.js";import"./a0b89eb0.js";import"./4eb8d874.js";import"./40b41b3c.js";import"./a4e2d801.js";import"./71f625a6.js";import"./d4f10f09.js";var _e=e`
:host {
  display: block;
  box-sizing: border-box;
  text-align: start;
  padding-bottom: 0;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.confirm-step {
  background-color: var(--_card-origination-oc-debit-card-inmediate-delivery-bg-color);
  width: auto;
  padding: 1.5rem 1rem;
}
`,Pe={colorPrimarySurfaceAmbientDefault:"#f4f4f4",colorPrimarySurfaceAmbientPressed:"#ffffff",colorPrimarySurfaceAmbientPreloading:"#ffffff",colorPrimarySurfaceAmbientOverlay:"#043263",colorPrimarySurfaceAlternativeDefault:"#ffffff",colorPrimarySurfaceAlternativePressed:"#f4f4f4",colorPrimarySurfaceAlternativePreloading:"#e9e9e9",colorPrimarySurfaceContrastDefault:"#004481",colorPrimarySurfaceContrastPressed:"#043263",colorPrimarySurfaceInfoDefault:"#d4edfc",colorPrimarySurfaceInfoPreloading:"#ffffff",colorPrimarySurfaceSuccessDefault:"#d9efe0",colorPrimarySurfaceSuccessPreloading:"#ffffff",colorPrimarySurfaceWarningDefault:"#fef5dc",colorPrimarySurfaceWarningPreloading:"#ffffff",colorPrimarySurfaceErrorDefault:"#fcdfdf",colorPrimarySurfaceErrorPreloading:"#ffffff",colorPrimarySurfaceSustainabilityDefault:"#eaf9fa",colorPrimarySurfaceSustainabilityPreloading:"#ffffff",colorPrimarySupportInfoDefault:"#004481",colorPrimarySupportSuccessDefault:"#277a3e",colorPrimarySupportWarningDefault:"#685219",colorPrimarySupportErrorDefault:"#b92a45",colorPrimarySupportPendingDefault:"#666666",colorPrimarySupportSustainabilityDefault:"#028484",colorPrimaryBadgeInfoBackground:"#004481",colorPrimaryBadgeInfoText:"#ffffff",colorPrimaryBadgeSuccessBackground:"#277a3e",colorPrimaryBadgeSuccessText:"#ffffff",colorPrimaryBadgeWarningBackground:"#685219",colorPrimaryBadgeWarningText:"#ffffff",colorPrimaryBadgeErrorBackground:"#b92a45",colorPrimaryBadgeErrorText:"#ffffff",colorPrimaryBadgeOffBackground:"#666666",colorPrimaryBadgeOffText:"#ffffff",colorPrimaryBadgeSustainabilityBackground:"#028484",colorPrimaryBadgeSustainabilityText:"#ffffff",colorPrimaryNotificationAlertBackground:"#b92a45",colorPrimaryNotificationAlertText:"#ffffff",colorPrimaryNotificationInfoBackground:"#ffffff",colorPrimaryNotificationInfoText:"#043263",colorPrimaryTextUncovered:"#b92a45",colorPrimaryTextIncome:"#1464a5",colorPrimaryText01Default:"#121212",colorPrimaryText01Inverse:"#ffffff",colorPrimaryText02Default:"#666666",colorPrimaryText02Inverse:"#f4f4f4",colorPrimaryFormatDivider:"#d3d3d3",colorPrimaryFormatBullet:"#1464a5",colorPrimaryRatingStars:"#8e7022",colorPrimaryCategoriesExpectedExpenses:"#5bbeff",colorPrimaryCategoriesExpectedIncome:"#d8be75",colorPrimaryCategoriesTransportation:"#b79e5e",colorPrimaryCategoriesOtherIncomes:"#b79e5e",colorPrimaryCategoriesLeisure:"#c49735",colorPrimaryCategoriesHome:"#d8732c",colorPrimaryCategoriesFinancing:"#d8732c",colorPrimaryCategoriesPublicAdministration:"#c0475e",colorPrimaryCategoriesEducation:"#d44b50",colorPrimaryCategoriesHealthBeauty:"#b92a45",colorPrimaryCategoriesSalariesRentsSubsidies:"#c569b9",colorPrimaryCategoriesTravel:"#c569b9",colorPrimaryCategoriesSaving:"#c569b9",colorPrimaryCategoriesInvestment:"#7c6ac7",colorPrimaryCategoriesShopping:"#7c6ac7",colorPrimaryCategoriesNgoAssociations:"#6754b8",colorPrimaryCategoriesSustainability:"#02a5a5",colorPrimaryCategoriesCashFinancialServices:"#006c6c",colorPrimaryCategoriesCashTransfersChecks:"#006c6c",colorPrimaryCategoriesCollectionInvoicesRemittances:"#277a3e",colorPrimaryCategoriesOthers:"#666666",colorPrimaryCategoriesPoints:"#006c6c",colorPrimaryCategoriesOfferDiscountRefound:"#c569b9",colorPrimaryCategoriesFinancingSkipPayments:"#b79e5e",colorPrimaryCategoriesCombinedPromotions:"#7c6ac7",colorPrimaryProcessPending:"#666666",colorPrimaryProcessInProgress:"#02a5a5",colorPrimaryProcessAlert:"#b92a45",colorPrimaryProcessWarning:"#685219",colorPrimaryProcessCompleted:"#277a3e",colorPrimaryRiskLevelOne:"#d44b50",colorPrimaryRiskLevelTwo:"#d8732c",colorPrimaryRiskLevelThree:"#9c6c01",colorPrimaryRiskLevelFour:"#388d4f",colorPrimaryRiskLevelFive:"#277a3e",colorPrimaryDataAxis01:"#d3d3d3",colorPrimaryDataAxis02:"#666666",colorPrimaryLocationsUser:"#d44b50",colorPrimaryLocationsPinsIcon:"#ffffff",colorPrimaryLocationsPinsBackgroundDefault:"#004481",colorPrimaryLocationsPinsBackgroundPressed:"#043263",colorPrimaryLocationsPinsBackgroundSelected:"#ffffff",colorPrimaryLocationsPinsBackgroundSelectedPressed:"#f4f4f4",colorPrimaryLocationsPinsTextDefault:"#ffffff",colorPrimaryLocationsPinsTextPressed:"#d4edfc",colorPrimaryLocationsPinsTextSelected:"#000000",colorPrimaryLocationsPinsTextSelectedPressed:"#666666",colorPrimaryEmergentMainText:"#ffffff",colorPrimaryEmergentMainBackgroundDefault:"#1464a5",colorPrimaryEmergentMainBackgroundPressed:"#004481",colorPrimaryEmergentMainLinkDefault:"#ffffff",colorPrimaryEmergentMainLinkPressed:"#d4edfc",colorPrimaryCtaMainBackgroundDefault:"#1464a5",colorPrimaryCtaMainBackgroundPressed:"#004481",colorPrimaryCtaMainTextDefault:"#ffffff",colorPrimaryCtaMainTextPressed:"#ffffff",colorPrimaryCtaMainTextPreloading:"#004481",colorPrimaryCtaComplementaryBackgroundPressed:"#ffffff",colorPrimaryCtaComplementaryTextDefault:"#1464a5",colorPrimaryCtaComplementaryTextPressed:"#004481",colorPrimaryCtaComplementaryBorderDefault:"#d3d3d3",colorPrimaryCtaPositiveBackgroundDefault:"#028484",colorPrimaryCtaPositiveBackgroundPressed:"#006c6c",colorPrimaryCtaPositiveTextDefault:"#ffffff",colorPrimaryCtaPositiveTextPressed:"#ffffff",colorPrimaryCtaNegativeBackgroundDefault:"#b92a45",colorPrimaryCtaNegativeBackgroundPressed:"#c0475e",colorPrimaryCtaNegativeTextDefault:"#ffffff",colorPrimaryCtaNegativeTextPressed:"#ffffff",colorPrimaryCtaNegativeTextPreloading:"#c0475e",colorPrimaryCtaDisabledBackground:"#e9e9e9",colorPrimaryCtaDisabledText:"#bdbdbd",colorPrimaryCtaMultistepBackgroundDefault:"#1464a5",colorPrimaryCtaMultistepBackgroundPressed:"#004481",colorPrimaryCtaMultistepTextDefault:"#ffffff",colorPrimaryCtaMultistepTextPressed:"#ffffff",colorPrimarySelectionInteraction01BackgroundSelected:"#004481",colorPrimarySelectionInteraction01BackgroundSelectedPressed:"#043263",colorPrimarySelectionInteraction01TextSelected:"#ffffff",colorPrimarySelectionInteraction01TextSelectedPressed:"#d4edfc",colorPrimarySelectionInteraction02Selected:"#004481",colorPrimarySelectionInteraction02SelectedPressed:"#043263",colorPrimaryLinkMainPressed:"#004481",colorPrimaryLinkMainDefault:"#1464a5",colorPrimaryLinkComplementaryDefault:"#121212",colorPrimaryLinkComplementaryPressed:"#666666",colorPrimaryLinkHighlightDefault:"#f8cd51",colorPrimaryLinkHighlightPressed:"#ffffff",colorPrimaryLinkNegativeDefault:"#b92a45",colorPrimaryLinkNegativePressed:"#c0475e",colorPrimaryLinkInverseDefault:"#1464a5",colorPrimaryLinkInversePressed:"#004481",colorPrimaryLinkImageDefault:"#ffffff",colorPrimaryLinkImagePressed:"#d4edfc",colorPrimaryFormInputBackgroundDefault:"#ffffff",colorPrimaryFormInputBackgroundError:"#fcdfdf",colorPrimaryFormInputPlaceholderDefault:"#666666",colorPrimaryFormInputPlaceholderError:"#b92a45",colorPrimaryFormInputFieldTextDefault:"#121212",colorPrimaryFormInputFieldTextError:"#121212",colorPrimaryFormInputHintTextDefault:"#666666",colorPrimaryFormInputHintTextError:"#666666",colorPrimaryFormInputIconDefault:"#1464a5",colorPrimaryFormInputIconReadOnly:"#666666",colorPrimaryFormInputIconError:"#b92a45",colorPrimaryFormInputAddIconDefault:"#1464a5",colorPrimaryFormInputAddIconError:"#1464a5",colorPrimaryFormInputBorderInactive:"#666666",colorPrimaryFormInputBorderActive:"#121212",colorPrimaryFormInputBorderError:"#d44b50",colorPrimaryFormSelectorBackgroundDefault:"#ffffff",colorPrimaryFormSelectorBackgroundAlternative:"#f4f4f4",colorPrimaryFormSelectorBackgroundError:"#fcdfdf",colorPrimaryFormSelectorBackgroundContrast:"#043263",colorPrimaryFormSelectorBorderDefault:"#666666",colorPrimaryFormSelectorBorderError:"#d44b50",colorPrimaryFormSelectorBorderContrast:"#ffffff",colorPrimaryFormSelectorCheckDefault:"#004481",colorPrimaryFormSelectorCheckReadOnly:"#666666",colorPrimaryFormSelectorCheckContrast:"#ffffff",colorPrimaryFormSwitchBackgroundOn:"#1464a5",colorPrimaryFormSwitchBackgroundOff:"#666666",colorPrimaryFormSwitchBackgroundContrast:"#ffffff",colorPrimaryFormSwitchHandleOn:"#ffffff",colorPrimaryFormSwitchHandleOff:"#ffffff",colorPrimaryFormSwitchHandleContrast:"#1464a5",colorPrimaryAltSurfaceAmbientDefault:"#ffffff",colorPrimaryAltSurfaceAmbientPressed:"#f4f4f4",colorPrimaryAltSurfaceAmbientPreloading:"#e9e9e9",colorPrimaryAltSurfaceAmbientOverlay:"#043263",colorPrimaryAltSurfaceAlternativeDefault:"#f4f4f4",colorPrimaryAltSurfaceAlternativePressed:"#ffffff",colorPrimaryAltSurfaceAlternativePreloading:"#ffffff",colorPrimaryAltSurfaceContrastDefault:"#004481",colorPrimaryAltSurfaceContrastPressed:"#043263",colorPrimaryAltSurfaceInfoDefault:"#d4edfc",colorPrimaryAltSurfaceInfoPreloading:"#ffffff",colorPrimaryAltSurfaceSuccessDefault:"#d9efe0",colorPrimaryAltSurfaceSuccessPreloading:"#ffffff",colorPrimaryAltSurfaceWarningDefault:"#fef5dc",colorPrimaryAltSurfaceWarningPreloading:"#ffffff",colorPrimaryAltSurfaceErrorDefault:"#fcdfdf",colorPrimaryAltSurfaceErrorPreloading:"#ffffff",colorPrimaryAltSurfaceSustainabilityDefault:"#eaf9fa",colorPrimaryAltSurfaceSustainabilityPreloading:"#ffffff",colorPrimaryAltSupportInfoDefault:"#004481",colorPrimaryAltSupportSuccessDefault:"#277a3e",colorPrimaryAltSupportWarningDefault:"#685219",colorPrimaryAltSupportErrorDefault:"#b92a45",colorPrimaryAltSupportPendingDefault:"#666666",colorPrimaryAltSupportSustainabilityDefault:"#028484",colorPrimaryAltBadgeInfoBackground:"#004481",colorPrimaryAltBadgeInfoText:"#ffffff",colorPrimaryAltBadgeSuccessBackground:"#277a3e",colorPrimaryAltBadgeSuccessText:"#ffffff",colorPrimaryAltBadgeWarningBackground:"#685219",colorPrimaryAltBadgeWarningText:"#ffffff",colorPrimaryAltBadgeErrorBackground:"#b92a45",colorPrimaryAltBadgeErrorText:"#ffffff",colorPrimaryAltBadgeOffBackground:"#666666",colorPrimaryAltBadgeOffText:"#ffffff",colorPrimaryAltBadgeSustainabilityBackground:"#028484",colorPrimaryAltBadgeSustainabilityText:"#ffffff",colorPrimaryAltNotificationAlertBackground:"#b92a45",colorPrimaryAltNotificationAlertText:"#ffffff",colorPrimaryAltNotificationInfoBackground:"#f4f4f4",colorPrimaryAltNotificationInfoText:"#043263",colorPrimaryAltTextUncovered:"#b92a45",colorPrimaryAltTextIncome:"#1464a5",colorPrimaryAltText01Default:"#121212",colorPrimaryAltText01Inverse:"#ffffff",colorPrimaryAltText02Default:"#666666",colorPrimaryAltText02Inverse:"#f4f4f4",colorPrimaryAltFormatDivider:"#d3d3d3",colorPrimaryAltFormatBullet:"#1464a5",colorPrimaryAltRatingStars:"#8e7022",colorPrimaryAltCategoriesExpectedExpenses:"#5bbeff",colorPrimaryAltCategoriesExpectedIncome:"#d8be75",colorPrimaryAltCategoriesTransportation:"#b79e5e",colorPrimaryAltCategoriesOtherIncomes:"#b79e5e",colorPrimaryAltCategoriesLeisure:"#c49735",colorPrimaryAltCategoriesHome:"#d8732c",colorPrimaryAltCategoriesFinancing:"#d8732c",colorPrimaryAltCategoriesPublicAdministration:"#c0475e",colorPrimaryAltCategoriesEducation:"#d44b50",colorPrimaryAltCategoriesHealthBeauty:"#b92a45",colorPrimaryAltCategoriesSalariesRentsSubsidies:"#c569b9",colorPrimaryAltCategoriesTravel:"#c569b9",colorPrimaryAltCategoriesSaving:"#c569b9",colorPrimaryAltCategoriesInvestment:"#7c6ac7",colorPrimaryAltCategoriesShopping:"#7c6ac7",colorPrimaryAltCategoriesNgoAssociations:"#6754b8",colorPrimaryAltCategoriesSustainability:"#02a5a5",colorPrimaryAltCategoriesCashFinancialServices:"#006c6c",colorPrimaryAltCategoriesCashTransfersChecks:"#006c6c",colorPrimaryAltCategoriesCollectionInvoicesRemittances:"#277a3e",colorPrimaryAltCategoriesOthers:"#666666",colorPrimaryAltCategoriesPoints:"#006c6c",colorPrimaryAltCategoriesOfferDiscountRefound:"#c569b9",colorPrimaryAltCategoriesFinancingSkipPayments:"#b79e5e",colorPrimaryAltCategoriesCombinedPromotions:"#7c6ac7",colorPrimaryAltProcessPending:"#666666",colorPrimaryAltProcessInProgress:"#02a5a5",colorPrimaryAltProcessAlert:"#b92a45",colorPrimaryAltProcessWarning:"#685219",colorPrimaryAltProcessCompleted:"#277a3e",colorPrimaryAltRiskLevelOne:"#d44b50",colorPrimaryAltRiskLevelTwo:"#d8732c",colorPrimaryAltRiskLevelThree:"#9c6c01",colorPrimaryAltRiskLevelFour:"#388d4f",colorPrimaryAltRiskLevelFive:"#277a3e",colorPrimaryAltDataAxis01:"#d3d3d3",colorPrimaryAltDataAxis02:"#666666",colorPrimaryAltLocationsUser:"#d44b50",colorPrimaryAltLocationsPinsIcon:"#ffffff",colorPrimaryAltLocationsPinsBackgroundDefault:"#004481",colorPrimaryAltLocationsPinsBackgroundPressed:"#043263",colorPrimaryAltLocationsPinsBackgroundSelected:"#ffffff",colorPrimaryAltLocationsPinsBackgroundSelectedPressed:"#f4f4f4",colorPrimaryAltLocationsPinsTextDefault:"#ffffff",colorPrimaryAltLocationsPinsTextPressed:"#d4edfc",colorPrimaryAltLocationsPinsTextSelected:"#000000",colorPrimaryAltLocationsPinsTextSelectedPressed:"#666666",colorPrimaryAltEmergentMainText:"#ffffff",colorPrimaryAltEmergentMainBackgroundDefault:"#1464a5",colorPrimaryAltEmergentMainBackgroundPressed:"#004481",colorPrimaryAltEmergentMainLinkDefault:"#ffffff",colorPrimaryAltEmergentMainLinkPressed:"#d4edfc",colorPrimaryAltCtaMainBackgroundDefault:"#1464a5",colorPrimaryAltCtaMainBackgroundPressed:"#004481",colorPrimaryAltCtaMainTextDefault:"#ffffff",colorPrimaryAltCtaMainTextPressed:"#ffffff",colorPrimaryAltCtaMainTextPreloading:"#004481",colorPrimaryAltCtaComplementaryBackgroundPressed:"#f4f4f4",colorPrimaryAltCtaComplementaryTextDefault:"#1464a5",colorPrimaryAltCtaComplementaryTextPressed:"#004481",colorPrimaryAltCtaComplementaryBorderDefault:"#d3d3d3",colorPrimaryAltCtaPositiveBackgroundDefault:"#028484",colorPrimaryAltCtaPositiveBackgroundPressed:"#006c6c",colorPrimaryAltCtaPositiveTextDefault:"#ffffff",colorPrimaryAltCtaPositiveTextPressed:"#ffffff",colorPrimaryAltCtaNegativeBackgroundDefault:"#b92a45",colorPrimaryAltCtaNegativeBackgroundPressed:"#c0475e",colorPrimaryAltCtaNegativeTextDefault:"#ffffff",colorPrimaryAltCtaNegativeTextPressed:"#ffffff",colorPrimaryAltCtaNegativeTextPreloading:"#c0475e",colorPrimaryAltCtaDisabledBackground:"#e9e9e9",colorPrimaryAltCtaDisabledText:"#bdbdbd",colorPrimaryAltCtaMultistepBackgroundDefault:"#1464a5",colorPrimaryAltCtaMultistepBackgroundPressed:"#004481",colorPrimaryAltCtaMultistepTextDefault:"#ffffff",colorPrimaryAltCtaMultistepTextPressed:"#ffffff",colorPrimaryAltSelectionInteraction01BackgroundSelected:"#004481",colorPrimaryAltSelectionInteraction01BackgroundSelectedPressed:"#043263",colorPrimaryAltSelectionInteraction01TextSelected:"#ffffff",colorPrimaryAltSelectionInteraction01TextSelectedPressed:"#d4edfc",colorPrimaryAltSelectionInteraction02Selected:"#004481",colorPrimaryAltSelectionInteraction02SelectedPressed:"#043263",colorPrimaryAltLinkMainDefault:"#1464a5",colorPrimaryAltLinkMainPressed:"#004481",colorPrimaryAltLinkComplementaryDefault:"#121212",colorPrimaryAltLinkComplementaryPressed:"#666666",colorPrimaryAltLinkHighlightDefault:"#f8cd51",colorPrimaryAltLinkHighlightPressed:"#ffffff",colorPrimaryAltLinkNegativeDefault:"#b92a45",colorPrimaryAltLinkNegativePressed:"#c0475e",colorPrimaryAltLinkInverseDefault:"#1464a5",colorPrimaryAltLinkInversePressed:"#004481",colorPrimaryAltLinkImageDefault:"#ffffff",colorPrimaryAltLinkImagePressed:"#d4edfc",colorPrimaryAltFormInputBackgroundDefault:"#f4f4f4",colorPrimaryAltFormInputBackgroundError:"#fcdfdf",colorPrimaryAltFormInputPlaceholderDefault:"#666666",colorPrimaryAltFormInputPlaceholderError:"#b92a45",colorPrimaryAltFormInputFieldTextDefault:"#121212",colorPrimaryAltFormInputFieldTextError:"#121212",colorPrimaryAltFormInputHintTextDefault:"#666666",colorPrimaryAltFormInputHintTextError:"#666666",colorPrimaryAltFormInputIconDefault:"#1464a5",colorPrimaryAltFormInputIconReadOnly:"#666666",colorPrimaryAltFormInputIconError:"#b92a45",colorPrimaryAltFormInputAddIconDefault:"#1464a5",colorPrimaryAltFormInputAddIconError:"#1464a5",colorPrimaryAltFormInputBorderInactive:"#666666",colorPrimaryAltFormInputBorderActive:"#121212",colorPrimaryAltFormInputBorderError:"#d44b50",colorPrimaryAltFormSelectorBackgroundDefault:"#f4f4f4",colorPrimaryAltFormSelectorBackgroundAlternative:"#ffffff",colorPrimaryAltFormSelectorBackgroundError:"#fcdfdf",colorPrimaryAltFormSelectorBackgroundContrast:"#043263",colorPrimaryAltFormSelectorBorderDefault:"#666666",colorPrimaryAltFormSelectorBorderError:"#d44b50",colorPrimaryAltFormSelectorBorderContrast:"#ffffff",colorPrimaryAltFormSelectorCheckDefault:"#004481",colorPrimaryAltFormSelectorCheckReadOnly:"#666666",colorPrimaryAltFormSelectorCheckContrast:"#ffffff",colorPrimaryAltFormSwitchBackgroundOn:"#1464a5",colorPrimaryAltFormSwitchBackgroundOff:"#666666",colorPrimaryAltFormSwitchBackgroundContrast:"#ffffff",colorPrimaryAltFormSwitchHandleOn:"#ffffff",colorPrimaryAltFormSwitchHandleOff:"#ffffff",colorPrimaryAltFormSwitchHandleContrast:"#1464a5",colorSecondarySurfaceAmbientDefault:"#043263",colorSecondarySurfaceAmbientPressed:"#004481",colorSecondarySurfaceAmbientPreloading:"#004481",colorSecondarySurfaceAmbientOverlay:"#043263",colorSecondarySurfaceAlternativeDefault:"#004481",colorSecondarySurfaceAlternativePressed:"#043263",colorSecondarySurfaceAlternativePreloading:"#043263",colorSecondarySurfaceContrastDefault:"#ffffff",colorSecondarySurfaceContrastPressed:"#e9e9e9",colorSecondarySurfaceInfoDefault:"#d4edfc",colorSecondarySurfaceInfoPreloading:"#ffffff",colorSecondarySurfaceSuccessDefault:"#d9efe0",colorSecondarySurfaceSuccessPreloading:"#ffffff",colorSecondarySurfaceWarningDefault:"#fef5dc",colorSecondarySurfaceWarningPreloading:"#ffffff",colorSecondarySurfaceErrorDefault:"#fcdfdf",colorSecondarySurfaceErrorPreloading:"#ffffff",colorSecondarySurfaceSustainabilityDefault:"#eaf9fa",colorSecondarySurfaceSustainabilityPreloading:"#ffffff",colorSecondarySupportInfoDefault:"#d4edfc",colorSecondarySupportSuccessDefault:"#d9efe0",colorSecondarySupportWarningDefault:"#fef5dc",colorSecondarySupportErrorDefault:"#fcdfdf",colorSecondarySupportPendingDefault:"#f4f4f4",colorSecondarySupportSustainabilityDefault:"#eaf9fa",colorSecondaryBadgeInfoBackground:"#ffffff",colorSecondaryBadgeInfoText:"#004481",colorSecondaryBadgeSuccessBackground:"#ffffff",colorSecondaryBadgeSuccessText:"#277a3e",colorSecondaryBadgeWarningBackground:"#ffffff",colorSecondaryBadgeWarningText:"#685219",colorSecondaryBadgeErrorBackground:"#ffffff",colorSecondaryBadgeErrorText:"#b92a45",colorSecondaryBadgeOffBackground:"#ffffff",colorSecondaryBadgeOffText:"#666666",colorSecondaryBadgeSustainabilityBackground:"#ffffff",colorSecondaryBadgeSustainabilityText:"#028484",colorSecondaryNotificationAlertBackground:"#e77d8e",colorSecondaryNotificationAlertText:"#121212",colorSecondaryNotificationInfoBackground:"#004481",colorSecondaryNotificationInfoText:"#ffffff",colorSecondaryTextUncovered:"#e77d8e",colorSecondaryTextIncome:"#d4edfc",colorSecondaryText01Default:"#ffffff",colorSecondaryText01Inverse:"#121212",colorSecondaryText02Default:"#f4f4f4",colorSecondaryText02Inverse:"#666666",colorSecondaryFormatDivider:"#d3d3d3",colorSecondaryFormatBullet:"#2dcccd",colorSecondaryRatingStars:"#5bbeff",colorSecondaryCategoriesExpectedExpenses:"#5bbeff",colorSecondaryCategoriesExpectedIncome:"#f3ebd5",colorSecondaryCategoriesTransportation:"#d8be75",colorSecondaryCategoriesOtherIncomes:"#d8be75",colorSecondaryCategoriesLeisure:"#f8cd51",colorSecondaryCategoriesHome:"#fab27f",colorSecondaryCategoriesFinancing:"#f7893b",colorSecondaryCategoriesPublicAdministration:"#e77d8e",colorSecondaryCategoriesEducation:"#f35e61",colorSecondaryCategoriesHealthBeauty:"#da3851",colorSecondaryCategoriesSalariesRentsSubsidies:"#fab3f0",colorSecondaryCategoriesTravel:"#f78be8",colorSecondaryCategoriesSaving:"#f78be8",colorSecondaryCategoriesInvestment:"#b6a8ee",colorSecondaryCategoriesShopping:"#8f7ae5",colorSecondaryCategoriesNgoAssociations:"#b6a8ee",colorSecondaryCategoriesSustainability:"#5ac4c4",colorSecondaryCategoriesCashFinancialServices:"#2dcccd",colorSecondaryCategoriesCashTransfersChecks:"#2dcccd",colorSecondaryCategoriesCollectionInvoicesRemittances:"#88ca9a",colorSecondaryCategoriesOthers:"#f4f4f4",colorSecondaryCategoriesPoints:"#2dcccd",colorSecondaryCategoriesOfferDiscountRefound:"#fab3f0",colorSecondaryCategoriesFinancingSkipPayments:"#d8be75",colorSecondaryCategoriesCombinedPromotions:"#b6a8ee",colorSecondaryProcessPending:"#f4f4f4",colorSecondaryProcessInProgress:"#2dcccd",colorSecondaryProcessAlert:"#e77d8e",colorSecondaryProcessWarning:"#f8cd51",colorSecondaryProcessCompleted:"#48ae64",colorSecondaryRiskLevelOne:"#f35e61",colorSecondaryRiskLevelTwo:"#f7893b",colorSecondaryRiskLevelThree:"#f8cd51",colorSecondaryRiskLevelFour:"#88ca9a",colorSecondaryRiskLevelFive:"#48ae64",colorSecondaryDataAxis01:"#d3d3d3",colorSecondaryDataAxis02:"#f4f4f4",colorSecondaryLocationsUser:"#f35e61",colorSecondaryLocationsPinsIcon:"#ffffff",colorSecondaryLocationsPinsBackgroundDefault:"#ffffff",colorSecondaryLocationsPinsBackgroundPressed:"#f4f4f4",colorSecondaryLocationsPinsBackgroundSelected:"#004481",colorSecondaryLocationsPinsBackgroundSelectedPressed:"#043263",colorSecondaryLocationsPinsTextDefault:"#121212",colorSecondaryLocationsPinsTextPressed:"#666666",colorSecondaryLocationsPinsTextSelected:"#ffffff",colorSecondaryLocationsPinsTextSelectedPressed:"#d4edfc",colorSecondaryEmergentMainText:"#121212",colorSecondaryEmergentMainBackgroundDefault:"#ffffff",colorSecondaryEmergentMainBackgroundPressed:"#d4edfc",colorSecondaryEmergentMainLinkDefault:"#1464a5",colorSecondaryEmergentMainLinkPressed:"#004481",colorSecondaryCtaMainBackgroundDefault:"#ffffff",colorSecondaryCtaMainBackgroundPressed:"#d4edfc",colorSecondaryCtaMainTextDefault:"#1464a5",colorSecondaryCtaMainTextPressed:"#1464a5",colorSecondaryCtaMainTextPreloading:"#e9e9e9",colorSecondaryCtaComplementaryBackgroundPressed:"#ffffff",colorSecondaryCtaComplementaryTextDefault:"#ffffff",colorSecondaryCtaComplementaryTextPressed:"#1464a5",colorSecondaryCtaComplementaryBorderDefault:"#ffffff",colorSecondaryCtaPositiveBackgroundDefault:"#02a5a5",colorSecondaryCtaPositiveBackgroundPressed:"#028484",colorSecondaryCtaPositiveTextDefault:"#ffffff",colorSecondaryCtaPositiveTextPressed:"#ffffff",colorSecondaryCtaNegativeBackgroundDefault:"#b92a45",colorSecondaryCtaNegativeBackgroundPressed:"#c0475e",colorSecondaryCtaNegativeTextDefault:"#ffffff",colorSecondaryCtaNegativeTextPressed:"#ffffff",colorSecondaryCtaNegativeTextPreloading:"#c0475e",colorSecondaryCtaDisabledBackground:"#072146",colorSecondaryCtaDisabledText:"#004481",colorSecondaryCtaMultistepBackgroundDefault:"#1464a5",colorSecondaryCtaMultistepBackgroundPressed:"#004481",colorSecondaryCtaMultistepTextDefault:"#ffffff",colorSecondaryCtaMultistepTextPressed:"#ffffff",colorSecondarySelectionInteraction01BackgroundSelected:"#ffffff",colorSecondarySelectionInteraction01BackgroundSelectedPressed:"#f4f4f4",colorSecondarySelectionInteraction01TextSelected:"#121212",colorSecondarySelectionInteraction01TextSelectedPressed:"#666666",colorSecondarySelectionInteraction02Selected:"#5bbeff",colorSecondarySelectionInteraction02SelectedPressed:"#49a5e6",colorSecondaryLinkMainDefault:"#5bbeff",colorSecondaryLinkMainPressed:"#49a5e6",colorSecondaryLinkComplementaryDefault:"#ffffff",colorSecondaryLinkComplementaryPressed:"#d4edfc",colorSecondaryLinkHighlightDefault:"#f8cd51",colorSecondaryLinkHighlightPressed:"#ffffff",colorSecondaryLinkNegativeDefault:"#fcdfdf",colorSecondaryLinkNegativePressed:"#f59799",colorSecondaryLinkInverseDefault:"#ffffff",colorSecondaryLinkInversePressed:"#d4edfc",colorSecondaryLinkImageDefault:"#ffffff",colorSecondaryLinkImagePressed:"#d4edfc",colorSecondaryFormInputBackgroundDefault:"#004481",colorSecondaryFormInputBackgroundError:"#fcdfdf",colorSecondaryFormInputPlaceholderDefault:"#f4f4f4",colorSecondaryFormInputPlaceholderError:"#b92a45",colorSecondaryFormInputFieldTextDefault:"#ffffff",colorSecondaryFormInputFieldTextError:"#121212",colorSecondaryFormInputHintTextDefault:"#f4f4f4",colorSecondaryFormInputHintTextError:"#666666",colorSecondaryFormInputIconDefault:"#5bbeff",colorSecondaryFormInputIconReadOnly:"#f4f4f4",colorSecondaryFormInputIconError:"#b92a45",colorSecondaryFormInputAddIconDefault:"#5bbeff",colorSecondaryFormInputAddIconError:"#1464a5",colorSecondaryFormInputBorderInactive:"#f4f4f4",colorSecondaryFormInputBorderActive:"#ffffff",colorSecondaryFormInputBorderError:"#d44b50",colorSecondaryFormSelectorBackgroundDefault:"#004481",colorSecondaryFormSelectorBackgroundAlternative:"#043263",colorSecondaryFormSelectorBackgroundError:"#fcdfdf",colorSecondaryFormSelectorBackgroundContrast:"#f4f4f4",colorSecondaryFormSelectorBorderDefault:"#f4f4f4",colorSecondaryFormSelectorBorderError:"#d44b50",colorSecondaryFormSelectorBorderContrast:"#666666",colorSecondaryFormSelectorCheckDefault:"#ffffff",colorSecondaryFormSelectorCheckReadOnly:"#f4f4f4",colorSecondaryFormSelectorCheckContrast:"#004481",colorSecondaryFormSwitchBackgroundOn:"#ffffff",colorSecondaryFormSwitchBackgroundOff:"#ffffff",colorSecondaryFormSwitchBackgroundContrast:"#1464a5",colorSecondaryFormSwitchHandleOn:"#1464a5",colorSecondaryFormSwitchHandleOff:"#666666",colorSecondaryFormSwitchHandleContrast:"#f4f4f4",colorSecondaryAltSurfaceAmbientDefault:"#004481",colorSecondaryAltSurfaceAmbientPressed:"#043263",colorSecondaryAltSurfaceAmbientPreloading:"#043263",colorSecondaryAltSurfaceAmbientOverlay:"#043263",colorSecondaryAltSurfaceAlternativeDefault:"#043263",colorSecondaryAltSurfaceAlternativePressed:"#004481",colorSecondaryAltSurfaceAlternativePreloading:"#004481",colorSecondaryAltSurfaceContrastDefault:"#ffffff",colorSecondaryAltSurfaceContrastPressed:"#e9e9e9",colorSecondaryAltSurfaceSuccessDefault:"#d9efe0",colorSecondaryAltSurfaceSuccessPreloading:"#ffffff",colorSecondaryAltSurfaceWarningDefault:"#fef5dc",colorSecondaryAltSurfaceWarningPreloading:"#ffffff",colorSecondaryAltSurfaceInfoDefault:"#d4edfc",colorSecondaryAltSurfaceInfoPreloading:"#ffffff",colorSecondaryAltSurfaceErrorDefault:"#fcdfdf",colorSecondaryAltSurfaceErrorPreloading:"#ffffff",colorSecondaryAltSurfaceSustainabilityDefault:"#eaf9fa",colorSecondaryAltSurfaceSustainabilityPreloading:"#ffffff",colorSecondaryAltSupportInfoDefault:"#d4edfc",colorSecondaryAltSupportSuccessDefault:"#d9efe0",colorSecondaryAltSupportWarningDefault:"#fef5dc",colorSecondaryAltSupportErrorDefault:"#fcdfdf",colorSecondaryAltSupportPendingDefault:"#f4f4f4",colorSecondaryAltSupportSustainabilityDefault:"#eaf9fa",colorSecondaryAltBadgeInfoBackground:"#ffffff",colorSecondaryAltBadgeInfoText:"#004481",colorSecondaryAltBadgeSuccessBackground:"#ffffff",colorSecondaryAltBadgeSuccessText:"#277a3e",colorSecondaryAltBadgeWarningBackground:"#ffffff",colorSecondaryAltBadgeWarningText:"#685219",colorSecondaryAltBadgeErrorBackground:"#ffffff",colorSecondaryAltBadgeErrorText:"#b92a45",colorSecondaryAltBadgeOffBackground:"#ffffff",colorSecondaryAltBadgeOffText:"#666666",colorSecondaryAltBadgeSustainabilityBackground:"#ffffff",colorSecondaryAltBadgeSustainabilityText:"#028484",colorSecondaryAltNotificationAlertBackground:"#e77d8e",colorSecondaryAltNotificationAlertText:"#121212",colorSecondaryAltNotificationInfoBackground:"#043263",colorSecondaryAltNotificationInfoText:"#ffffff",colorSecondaryAltTextUncovered:"#e77d8e",colorSecondaryAltTextIncome:"#d4edfc",colorSecondaryAltText01Default:"#ffffff",colorSecondaryAltText01Inverse:"#121212",colorSecondaryAltText02Default:"#f4f4f4",colorSecondaryAltText02Inverse:"#666666",colorSecondaryAltFormatDivider:"#d3d3d3",colorSecondaryAltFormatBullet:"#2dcccd",colorSecondaryAltRatingStars:"#5bbeff",colorSecondaryAltCategoriesExpectedExpenses:"#5bbeff",colorSecondaryAltCategoriesExpectedIncome:"#f3ebd5",colorSecondaryAltCategoriesTransportation:"#d8be75",colorSecondaryAltCategoriesOtherIncomes:"#d8be75",colorSecondaryAltCategoriesLeisure:"#f8cd51",colorSecondaryAltCategoriesHome:"#fab27f",colorSecondaryAltCategoriesFinancing:"#f7893b",colorSecondaryAltCategoriesPublicAdministration:"#e77d8e",colorSecondaryAltCategoriesEducation:"#f35e61",colorSecondaryAltCategoriesHealthBeauty:"#da3851",colorSecondaryAltCategoriesSalariesRentsSubsidies:"#fab3f0",colorSecondaryAltCategoriesTravel:"#f78be8",colorSecondaryAltCategoriesSaving:"#f78be8",colorSecondaryAltCategoriesInvestment:"#b6a8ee",colorSecondaryAltCategoriesShopping:"#8f7ae5",colorSecondaryAltCategoriesNgoAssociations:"#b6a8ee",colorSecondaryAltCategoriesSustainability:"#5ac4c4",colorSecondaryAltCategoriesCashFinancialServices:"#2dcccd",colorSecondaryAltCategoriesCashTransfersChecks:"#2dcccd",colorSecondaryAltCategoriesCollectionInvoicesRemittances:"#88ca9a",colorSecondaryAltCategoriesOthers:"#f4f4f4",colorSecondaryAltCategoriesPoints:"#2dcccd",colorSecondaryAltCategoriesOfferDiscountRefound:"#fab3f0",colorSecondaryAltCategoriesFinancingSkipPayments:"#d8be75",colorSecondaryAltCategoriesCombinedPromotions:"#b6a8ee",colorSecondaryAltProcessPending:"#f4f4f4",colorSecondaryAltProcessInProgress:"#2dcccd",colorSecondaryAltProcessAlert:"#e77d8e",colorSecondaryAltProcessWarning:"#f8cd51",colorSecondaryAltProcessCompleted:"#48ae64",colorSecondaryAltRiskLevelOne:"#f35e61",colorSecondaryAltRiskLevelTwo:"#f7893b",colorSecondaryAltRiskLevelThree:"#f8cd51",colorSecondaryAltRiskLevelFour:"#88ca9a",colorSecondaryAltRiskLevelFive:"#48ae64",colorSecondaryAltDataAxis01:"#d3d3d3",colorSecondaryAltDataAxis02:"#f4f4f4",colorSecondaryAltLocationsUser:"#f35e61",colorSecondaryAltLocationsPinsIcon:"#ffffff",colorSecondaryAltLocationsPinsBackgroundDefault:"#ffffff",colorSecondaryAltLocationsPinsBackgroundPressed:"#f4f4f4",colorSecondaryAltLocationsPinsBackgroundSelected:"#004481",colorSecondaryAltLocationsPinsBackgroundSelectedPressed:"#043263",colorSecondaryAltLocationsPinsTextDefault:"#121212",colorSecondaryAltLocationsPinsTextPressed:"#666666",colorSecondaryAltLocationsPinsTextSelected:"#ffffff",colorSecondaryAltLocationsPinsTextSelectedPressed:"#d4edfc",colorSecondaryAltEmergentMainText:"#121212",colorSecondaryAltEmergentMainBackgroundDefault:"#ffffff",colorSecondaryAltEmergentMainBackgroundPressed:"#d4edfc",colorSecondaryAltEmergentMainLinkDefault:"#1464a5",colorSecondaryAltEmergentMainLinkPressed:"#004481",colorSecondaryAltCtaMainBackgroundDefault:"#ffffff",colorSecondaryAltCtaMainBackgroundPressed:"#d4edfc",colorSecondaryAltCtaMainTextDefault:"#1464a5",colorSecondaryAltCtaMainTextPressed:"#1464a5",colorSecondaryAltCtaMainTextPreloading:"#e9e9e9",colorSecondaryAltCtaComplementaryBackgroundPressed:"#ffffff",colorSecondaryAltCtaComplementaryTextDefault:"#ffffff",colorSecondaryAltCtaComplementaryTextPressed:"#1464a5",colorSecondaryAltCtaComplementaryBorderDefault:"#ffffff",colorSecondaryAltCtaPositiveBackgroundDefault:"#02a5a5",colorSecondaryAltCtaPositiveBackgroundPressed:"#028484",colorSecondaryAltCtaPositiveTextDefault:"#ffffff",colorSecondaryAltCtaPositiveTextPressed:"#ffffff",colorSecondaryAltCtaNegativeBackgroundDefault:"#b92a45",colorSecondaryAltCtaNegativeBackgroundPressed:"#c0475e",colorSecondaryAltCtaNegativeTextDefault:"#ffffff",colorSecondaryAltCtaNegativeTextPressed:"#ffffff",colorSecondaryAltCtaNegativeTextPreloading:"#c0475e",colorSecondaryAltCtaDisabledBackground:"#072146",colorSecondaryAltCtaDisabledText:"#004481",colorSecondaryAltCtaMultistepBackgroundDefault:"#1464a5",colorSecondaryAltCtaMultistepBackgroundPressed:"#004481",colorSecondaryAltCtaMultistepTextDefault:"#ffffff",colorSecondaryAltCtaMultistepTextPressed:"#ffffff",colorSecondaryAltSelectionInteraction01BackgroundSelected:"#ffffff",colorSecondaryAltSelectionInteraction01BackgroundSelectedPressed:"#f4f4f4",colorSecondaryAltSelectionInteraction01TextSelected:"#000000",colorSecondaryAltSelectionInteraction01TextSelectedPressed:"#666666",colorSecondaryAltSelectionInteraction02Selected:"#5bbeff",colorSecondaryAltSelectionInteraction02SelectedPressed:"#49a5e6",colorSecondaryAltLinkMainDefault:"#5bbeff",colorSecondaryAltLinkMainPressed:"#49a5e6",colorSecondaryAltLinkComplementaryDefault:"#ffffff",colorSecondaryAltLinkComplementaryPressed:"#d4edfc",colorSecondaryAltLinkHighlightDefault:"#f8cd51",colorSecondaryAltLinkHighlightPressed:"#ffffff",colorSecondaryAltLinkNegativeDefault:"#fcdfdf",colorSecondaryAltLinkNegativePressed:"#f59799",colorSecondaryAltLinkInverseDefault:"#ffffff",colorSecondaryAltLinkInversePressed:"#d4edfc",colorSecondaryAltLinkImageDefault:"#ffffff",colorSecondaryAltLinkImagePressed:"#d4edfc",colorSecondaryAltFormInputBackgroundDefault:"#043263",colorSecondaryAltFormInputBackgroundError:"#fcdfdf",colorSecondaryAltFormInputPlaceholderDefault:"#f4f4f4",colorSecondaryAltFormInputPlaceholderError:"#b92a45",colorSecondaryAltFormInputFieldTextDefault:"#ffffff",colorSecondaryAltFormInputFieldTextError:"#121212",colorSecondaryAltFormInputHintTextDefault:"#f4f4f4",colorSecondaryAltFormInputHintTextError:"#666666",colorSecondaryAltFormInputIconDefault:"#5bbeff",colorSecondaryAltFormInputIconReadOnly:"#f4f4f4",colorSecondaryAltFormInputIconError:"#b92a45",colorSecondaryAltFormInputAddIconDefault:"#5bbeff",colorSecondaryAltFormInputAddIconError:"#1464a5",colorSecondaryAltFormInputBorderInactive:"#f4f4f4",colorSecondaryAltFormInputBorderActive:"#ffffff",colorSecondaryAltFormInputBorderError:"#d44b50",colorSecondaryAltFormSelectorBackgroundDefault:"#043263",colorSecondaryAltFormSelectorBackgroundAlternative:"#004481",colorSecondaryAltFormSelectorBackgroundError:"#fcdfdf",colorSecondaryAltFormSelectorBackgroundContrast:"#f4f4f4",colorSecondaryAltFormSelectorBorderDefault:"#f4f4f4",colorSecondaryAltFormSelectorBorderError:"#d44b50",colorSecondaryAltFormSelectorBorderContrast:"#666666",colorSecondaryAltFormSelectorCheckDefault:"#ffffff",colorSecondaryAltFormSelectorCheckReadOnly:"#f4f4f4",colorSecondaryAltFormSelectorCheckContrast:"#004481",colorSecondaryAltFormSwitchBackgroundOn:"#ffffff",colorSecondaryAltFormSwitchBackgroundOff:"#ffffff",colorSecondaryAltFormSwitchBackgroundContrast:"#1464a5",colorSecondaryAltFormSwitchHandleOn:"#1464a5",colorSecondaryAltFormSwitchHandleOff:"#666666",colorSecondaryAltFormSwitchHandleContrast:"#f4f4f4"};const Ae=e`
  :host([ambient~='primary']),
  [ambient~='primary'],
  [data-ambient~='primary'] {
    --bbva-clip-card-data--_ambient--skeleton-quote-color: initial;
    --bbva-clip-card-data--_ambient--skeleton-quote-bg: initial;
    --bbva-clip-card-data--_ambient--skeleton-animated-layer-bg: initial;
  }
`,xe=e`
  :host([ambient~='primary-alt']),
  [ambient~='primary-alt'],
  [data-ambient~='primary-alt'] {
    --bbva-clip-card-data--_ambient--skeleton-quote-color: var(
      --bbva-clip-card-data--custom--primary-alt-ambient--skeleton-quote-color,
      ${A("colorPrimaryAltSurfaceAmbientDefault",Pe)}
    );
    --bbva-clip-card-data--_ambient--skeleton-quote-bg: var(
      --bbva-clip-card-data--custom--primary-alt-ambient--skeleton-quote-bg,
      ${A("colorPrimaryAltSurfaceAmbientPreloading",Pe)}
    );
    --bbva-clip-card-data--_ambient--skeleton-animated-layer-bg: var(
      --bbva-clip-card-data--custom--primary-alt-ambient--skeleton-animated-layer-bg,
      ${A("colorPrimaryAltSurfaceAmbientDefault",Pe)}
    );
  }
`,$e=e`
  :host([ambient~='secondary']),
  [ambient~='secondary'],
  [data-ambient~='secondary'] {
    --bbva-clip-card-data--_ambient--skeleton-quote-color: var(
      --bbva-clip-card-data--custom--secondary-ambient--skeleton-quote-color,
      ${A("colorSecondarySurfaceAmbientDefault",Pe)}
    );
    --bbva-clip-card-data--_ambient--skeleton-quote-bg: var(
      --bbva-clip-card-data--custom--secondary-ambient--skeleton-quote-bg,
      ${A("colorSecondarySurfaceAmbientPreloading",Pe)}
    );
    --bbva-clip-card-data--_ambient--skeleton-animated-layer-bg: var(
      --bbva-clip-card-data--custom--secondary-ambient--skeleton-animated-layer-bg,
      ${A("colorSecondarySurfaceAmbientDefault",Pe)}
    );
  }
`,Ce=e`
  :host([ambient~='secondary-alt']),
  [ambient~='secondary-alt'],
  [data-ambient~='secondary-alt'] {
    --bbva-clip-card-data--_ambient--skeleton-quote-color: var(
      --bbva-clip-card-data--custom--secondary-alt-ambient--skeleton-quote-color,
      ${A("colorSecondaryAltSurfaceAmbientDefault",Pe)}
    );
    --bbva-clip-card-data--_ambient--skeleton-quote-bg: var(
      --bbva-clip-card-data--custom--secondary-alt-ambient--skeleton-quote-bg,
      ${A("colorSecondaryAltSurfaceAmbientPreloading",Pe)}
    );
    --bbva-clip-card-data--_ambient--skeleton-animated-layer-bg: var(
      --bbva-clip-card-data--custom--secondary-alt-ambient--skeleton-animated-layer-bg,
      ${A("colorSecondaryAltSurfaceAmbientDefault",Pe)}
    );
  }
`,ke={primary:e`
    ${Ae} ${x.primary} ${$.primary} ${C.primary}
  `,primaryAlt:e`
    ${xe}
  `,secondary:e`
    ${$e} ${x.secondary} ${$.secondary} ${C.secondary}
  `,secondaryAlt:e`
    ${Ce}
  `},Te=Object.values(ke);var Ie=e`
  :host {
    --_clip-card-data-skeleton-quote-color: var(
      --bbva-clip-card-data--_ambient--skeleton-quote-color,
      var(
        --bbva-clip-card-data--custom--primary-ambient--skeleton-quote-color,
        ${A("colorPrimarySurfaceAmbientDefault",Pe)}
      )
    );
    --_clip-card-data-skeleton-quote-bg: var(
      --bbva-clip-card-data--_ambient--skeleton-quote-bg,
      var(
        --bbva-clip-card-data--custom--primary-ambient--skeleton-quote-bg,
        ${A("colorPrimarySurfaceAmbientPreloading",Pe)}
      )
    );
    --_clip-card-data-skeleton-animated-layer-bg: var(
      --bbva-clip-card-data--_ambient--skeleton-animated-layer-bg,
      var(
        --bbva-clip-card-data--custom--primary-ambient--skeleton-animated-layer-bg,
        ${A("colorPrimarySurfaceAmbientDefault",Pe)}
      )
    );
  }
`,De=e`
  :host {
    --_clip-card-data-type2XSmall: var(--bbva-clip-card-data-type-2x, 0.875rem);
    --_clip-card-data-type3XSmall: var(--bbva-clip-card-data-type-3x, 0.5625rem);
    --_clip-card-data-type4XSmall: var(--bbva-clip-card-data-type-4x, 0.375rem);
    --_clip-card-data-filter-navy: var(--bbva-clip-card-data-filter-navy, rgb(7, 33, 70, 0.2));
    -webkit-text-size-adjust: none;
    text-size-adjust: none;
    display: block;
    box-sizing: border-box;
    border-radius: 0.3125rem;
    overflow: hidden;
  }

  :host([hidden]),
  [hidden] {
    display: none !important;
  }

  .sr-only,
  .sr-only ::slotted([slot='sr-only']) {
    border: 0;
    clip: rect(0 0 0 0);
    height: 1px;
    margin: -1px;
    overflow: hidden;
    padding: 0;
    position: absolute;
    width: 1px;
  }

  *,
  *:before,
  *:after {
    box-sizing: inherit;
  }

  svg {
    display: inline-block;
    height: 100%;
    max-width: 100%;
    pointer-events: none;
  }

  figure {
    background-image: var(--bg-image);
  }

  .container {
    display: grid;
  }
  .container[ambient~='primary'] [data-tag-name='bbva-type-text'] {
    color: var(--colorsSecondary600, ${t(i.secondary600)});
  }
  .container[ambient~='primary'] [data-tag-name='bbva-type-icon'] {
    fill: var(--colorsSecondary600, ${t(i.secondary600)});
  }

  .card {
    display: grid;
    height: 100%;
    width: 100%;
    margin: auto;
    background-size: cover;
    background-position: center;
  }
  .card.shadow {
    text-shadow: 0 0.125rem 0.125rem
        var(--colorsSecondary600, ${t(i.secondary600)}),
      0 0.0625rem 0.0625rem var(--colorsSecondary600, ${t(i.secondary600)}),
      0 -0.0625rem 0.0625rem var(--colorsSecondary600, ${t(i.secondary600)}),
      -0.0625rem 0 0.0625rem var(--colorsSecondary600, ${t(i.secondary600)});
  }

  :not(.number-top) > span {
    display: block;
  }

  .main {
    display: flex;
    align-items: start;
    justify-content: space-between;
    text-shadow: none;
  }

  .main-logo {
    height: 0.875rem;
    margin-bottom: calc(
      (
          (2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
            16
        ) * 1rem
    );
  }
  .main-logo [data-tag-name='bbva-type-icon'] {
    transform: translateY(
      calc(
        (
            (
                -1.25 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))
              ) / 16
          ) * 1rem
      )
    );
  }

  .main-payment {
    font-size: var(--typographyType4XSmall, ${t(r.type4XSmall)});
    line-height: var(--lineHeightType4XSmall, ${t(a.type4XSmall)});
  }

  [ambient~='primary'] time {
    color: var(--colorsSecondary600, ${t(i.secondary600)});
  }
  [ambient~='secondary'] time {
    color: var(--colorsPrimaryCoreLightened, ${t(i.primaryCoreLightened)});
  }

  .holder-logo {
    font-size: var(--_clip-card-data-type4XSmall);
    line-height: 1.5;
  }
  .holder-logo svg {
    height: 0.875rem;
  }

  .holder {
    display: flex;
    align-self: flex-end;
    flex-direction: column;
    text-transform: uppercase;
    font-weight: var(
      --fontFacePrimaryMediumFontWeight,
      ${t(o.medium.fontWeight)}
    );
  }
  .holder .holder-bottom {
    display: flex;
    align-items: flex-end;
  }

  :host([size='XL']) {
    width: 12.5rem;
    height: 8.5rem;
  }
  :host([size='XL']) .card {
    padding: calc(
        (
            (2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
              16
          ) * 1em
      )
      calc(
        (
            (1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
              16
          ) * 1em
      )
      calc(
        (
            (
                1.5 *
                  var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))
              ) / 16
          ) * 1em
      )
      calc(
        (
            (2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
              16
          ) * 1em
      );
  }
  :host([size='XL']) [data-tag-name='bbva-type-text'] {
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    font-weight: var(--_clip-card-data-medium-text);
  }
  :host([size='XL']) [data-tag-name='bbva-type-text'].holder-number {
    word-spacing: 2px;
    margin-top: calc(
      (
          (1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
            16
        ) * 1rem
    );
    margin-bottom: 0;
  }
  :host([size='XL']) [data-tag-name='bbva-type-text'].holder-name {
    letter-spacing: initial;
  }
  :host([size='XL']) time {
    margin-bottom: calc(
      (
          (0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
            16
        ) * 1em
    );
    text-align: end;
    font-size: var(--typographyType3XSmall, ${t(r.type3XSmall)});
  }

  :host([size='XXL']) {
    width: 16rem;
    height: 11rem;
    border-radius: 0.4375rem;
  }
  :host([size='XXL']) .card {
    padding: calc(
        (
            (2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
              16
          ) * 1em
      )
      calc(
        (
            (1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
              16
          ) * 1em
      )
      calc(
        (
            (
                1.5 *
                  var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))
              ) / 16
          ) * 1em
      )
      calc(
        (
            (2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
              16
          ) * 1em
      );
  }
  :host([size='XXL']) [data-tag-name='bbva-type-text'] {
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    font-weight: var(--_clip-card-data-medium-text);
  }
  :host([size='XXL']) [data-tag-name='bbva-type-text'].holder-number {
    display: inline-flex;
    word-spacing: 2px;
    font-size: var(--typographyTypeLarge, ${t(r.typeLarge)});
    margin-top: calc(
      (
          (1 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
            16
        ) * 1rem
    );
    margin-bottom: calc(
      (
          (0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
            16
        ) * 1rem
    );
  }
  :host([size='XXL']) time {
    text-align: end;
    font-size: var(--typographyTypeSmall, ${t(r.typeSmall)});
    margin: calc(
        (
            (
                0.5 *
                  var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))
              ) / 16
          ) * 1rem
      )
      0;
  }

  :host([pan-safe='true']) .expiration-text {
    visibility: hidden;
  }

  :host([size='XXL-collapse']) {
    width: 16rem;
    height: 5rem;
    border-radius: 0.4375rem 0.4375rem 0 0;
  }
  :host([size='XXL-collapse']) .container {
    background-color: var(--_clip-card-data-filter-navy);
    padding: calc(
        (
            (2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
              16
          ) * 1em
      )
      calc(
        (
            (2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
              16
          ) * 1em
      )
      calc(
        (
            (
                1.5 *
                  var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))
              ) / 16
          ) * 1em
      )
      calc(
        (
            (2 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
              16
          ) * 1em
      );
  }
  :host([size='XXL-collapse']) .other-bank {
    background: var(
      --colorsPrimaryCoreLightened,
      ${t(i.primaryCoreLightened)}
    );
  }
  :host([size='XXL-collapse']) .other-bank .holder-number {
    margin-top: grid8Space(5px);
  }
  :host([size='XXL-collapse']) .main-logo {
    margin-bottom: calc(
      (
          (0.5 * var(--gridSpacerVariant, var(--gridSpacer, ${t(s.spacer)}))) /
            16
        ) * 1rem
    );
  }
  :host([size='XXL-collapse']) .holder {
    display: flex;
    flex-direction: row;
    align-items: last baseline;
  }
  :host([size='XXL-collapse']) .holder-logo {
    display: none;
  }
  :host([size='XXL-collapse']) [data-tag-name='bbva-type-text'] {
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    font-weight: var(--_clip-card-data-medium-text);
  }
  :host([size='XXL-collapse']) [data-tag-name='bbva-type-text'].holder-number {
    position: relative;
    display: inline-flex;
    word-spacing: 2px;
    font-size: var(--typographyTypeSmall, ${t(r.typeSmall)});
    margin-bottom: 0;
    z-index: 10;
  }
  :host([size='XXL-collapse']) [data-tag-name='bbva-type-text'].expiration-text {
    height: 1.25rem;
    text-transform: none;
    text-align: end;
    font-size: var(--typographyType4XSmall, ${t(r.type4XSmall)});
  }
  :host([size='XXL-collapse']) time {
    text-align: end;
    font-size: var(--typographyTypeSmall, ${t(r.typeSmall)});
    margin-left: 0.6875rem;
  }

  .holder-top {
    flex: 1;
    min-width: 0;
    letter-spacing: 0.128px;
  }

  :host([image-src]) figure {
    background-repeat: no-repeat;
    background-size: contain;
  }
  :host([image-src]) .main-logo,
  :host([image-src]) .number-top,
  :host([image-src]) .holder-logo {
    visibility: hidden;
  }

  :host([loading]) {
    position: relative;
    pointer-events: none;
    background-repeat: no-repeat;
    overflow: hidden;
    opacity: 1;
  }
  :host([loading]) .skeleton {
    contain: strict;
    position: absolute;
    opacity: 0.5;
    transform: translateX(200%) scaleX(1);
    transform-origin: right bottom;
    animation: skeletonAnimation 1600ms 300ms ease-out infinite both;
    height: inherit;
    background-color: var(--_clip-card-data-skeleton-animated-layer-bg);
    top: 0;
    right: 0;
    left: 5.625rem;
  }
  :host([loading]):host([size='XL']) {
    height: 8.5rem;
    background-image: linear-gradient(
        -60deg,
        transparent 50%,
        var(--_clip-card-data-skeleton-quote-color) 50%
      ),
      linear-gradient(-60deg, transparent 50%, var(--_clip-card-data-skeleton-quote-color) 50%),
      linear-gradient(-60deg, transparent 50%, var(--_clip-card-data-skeleton-quote-color) 50%),
      linear-gradient(-60deg, var(--_clip-card-data-skeleton-quote-color) 50%, transparent 50%);
    background-color: var(--_clip-card-data-skeleton-quote-bg);
    background-size: calc((32px * 2) + (12px / 2)) 12px, calc((115px * 2) + (12px / 2)) 12px,
      calc((90px * 2) + (12px / 2)) 12px, calc((30px * 2) + (12px / 2)) 12px;
    background-position: 16px 16px, 16px 86px, 16px 110px, calc(100% - 16px) 110px;
  }
  :host([loading]):host([size='XL']) .skeleton {
    left: 4.375rem;
  }
  :host([loading]):host([size='XXL']) {
    height: 10.75rem;
    background-image: linear-gradient(
        -60deg,
        transparent 50%,
        var(--_clip-card-data-skeleton-quote-color) 50%
      ),
      linear-gradient(-60deg, transparent 50%, var(--_clip-card-data-skeleton-quote-color) 50%),
      linear-gradient(-60deg, transparent 50%, var(--_clip-card-data-skeleton-quote-color) 50%),
      linear-gradient(-60deg, var(--_clip-card-data-skeleton-quote-color) 50%, transparent 50%);
    background-color: var(--_clip-card-data-skeleton-quote-bg);
    background-size: calc((32px * 2) + (16px / 2)) 16px, calc((165px * 2) + (16px / 2)) 16px,
      calc((145px * 2) + (16px / 2)) 16px, calc((40px * 2) + (16px / 2)) 16px;
    background-position: 16px 16px, 16px 107px, 16px 140px, calc(100% - 16px) 140px;
  }
  :host([loading]):host([size='XXL-collapse']) {
    height: 5rem;
    background-image: linear-gradient(
        -60deg,
        transparent 50%,
        var(--_clip-card-data-skeleton-quote-color) 50%
      ),
      linear-gradient(-60deg, transparent 50%, var(--_clip-card-data-skeleton-quote-color) 50%),
      linear-gradient(-60deg, var(--_clip-card-data-skeleton-quote-color) 50%, transparent 50%);
    background-color: var(--_clip-card-data-skeleton-quote-bg);
    background-size: calc((32px * 2) + (16px / 2)) 16px, calc((145px * 2) + (16px / 2)) 16px,
      calc((40px * 2) + (16px / 2)) 16px;
    background-position: 16px 16px, 16px 50px, calc(100% - 16px) 50px;
  }

  :host([vertical]) {
    width: 8.5rem;
    height: 12.5rem;
  }
  :host([vertical]) .holder-logo {
    display: flex;
    align-items: end;
    justify-content: end;
  }

  @keyframes skeletonAnimation {
    from {
      opacity: 0.5;
    }
    50% {
      opacity: 0.6;
    }
    60% {
      opacity: 0.6;
    }
    70% {
      opacity: 0.3;
    }
    90% {
      opacity: 0.1;
    }
    100% {
      transform: translateX(0%) scaleX(2);
      opacity: 0;
    }
  }
`;class Be extends(l(k(T(n)))){static get scopedElements(){return{"bbva-type-icon":I,"bbva-type-text":D,"bbva-clip-box":B}}static get is(){return"bbva-clip-card-data"}static get properties(){return{variant:{type:String},kind:{type:String,reflect:!0},holderName:{type:String,attribute:"holder-name"},cardNumber:{type:String,attribute:"card-number"},panSafe:{type:Boolean,attribute:"pan-safe"},visibleChars:{type:Number,attribute:"visible-chars"},expirationDate:{type:String,attribute:"expiration-date"},expirationDateText:{type:String,attribute:"expiration-date-text"},imageSrc:{type:String,attribute:"image-src"},kindPayment:{type:String,attribute:"kind-payment"},logo:{type:String},cardType:{type:String,attribute:"card-type"},shadow:{type:Boolean,attribute:"shadow"},size:{type:String,reflect:!0},loading:{type:Boolean,reflect:!1},vertical:{type:Boolean,reflect:!0}}}constructor(){super(),this.variant="default",this.logo=c(),this.cardType="visa",this.cardNumber="",this.holderName="",this.expirationDate="",this.expirationDateText="bbva-clip-card-data-expiration-date",this.kind="",this.kindPayment="",this.panSafe=!1,this.visibleChars=4,this.shadow=!1,this.size="XL",this.loading=!1}static _cardNumberFormat(e){const t=e.toString().replace(/\s+/g,"").replace(/[^0-9]/gi,"").match(/\d{4,16}/g),r=t&&t[0]||"",a=[];for(let e=0,t=r.length;e<t;e+=4)a.push(r.substring(e,e+4));return a.length?a.join(" "):""}_panTruncated(e){return d(e,"•",!0,this.visibleChars)}static _dateTimeFormat(e){return e.replace(/\//,"-").replace(/\s+/g,"")}static get styles(){return[super.styles,De,Ie,Te,m("bbva-clip-card-data-shared-styles")]}render(){return f`${this.loading?f` <div class="skeleton"></div> `:f`
          <span class="sr-only">
            <slot name="sr-only">${this._accessibleText}</slot>
          </span>
          ${this.card}
        `}`}_holderNameTpl(){const e=`${this.holderName}`;return this.holderName&&f`<li>${e}</li>`}_cardNumberTpl(){const e=`${this.t("bbva-clip-card-data-card-number")}: ${this.cardNumber}`;return this.cardNumber&&f`<li>${e}</li>`}_expirationDateTpl(){const e=`${this.t(this.expirationDateText)}: ${this.expirationDate}`;return this.expirationDate&&f`<li>${e}</li>`}_differentBank(){return!(this.logo===c()||!this.panSafe)||null}get _accessibleText(){return f`<ul>
      ${this._holderNameTpl()} ${this._cardNumberTpl()} ${this._expirationDateTpl()}
    </ul>`}get mainLogo(){return f` <bbva-type-icon icon="${this.logo}" size="32"></bbva-type-icon> `}get typeLogo(){return u`${p[this.cardType]}`}get _cardAsset(){return u`${p[`${this.variant}card`]}`}get _otherBank(){const e=this.cardNumber&&this.panSafe;return f` ${e&&f`<bbva-type-text
      class="holder-number"
      size="S"
      unset
      text=${this._panTruncated(this.cardNumber)}
    ></bbva-type-text>`}`}get _collapseCard(){return f`
      <div class="collapse">
        ${this._differentBank()?this._otherBank:f`
          <bbva-type-text class="expiration-text" unset text="${this.t(this.expirationDateText)}">
          </bbva-type-text>
      ${this.cardNumber?f`<bbva-type-text
              class="holder-number"
              size="S"
              unset
              text=${this.panSafe?this._panTruncated(this.cardNumber):this.constructor._cardNumberFormat(this.cardNumber)}
            ></bbva-type-text>`:""}
      <time datetime="${this.constructor._dateTimeFormat(this.expirationDate)}"
        >${this.expirationDate}</time
      >
    </div>
      `}
      </div>
    `}get _renderBankLogo(){return this._differentBank()?f`<bbva-clip-box .group=${[{icon:this.logo,size:"s"}]}> </bbva-clip-box>`:f`<span class="main-logo">${this.mainLogo}</span>`}get _horizontalCardTpl(){return f`
      <div class="main">
        ${this._renderBankLogo}
        <bbva-type-text
          unset
          tag="span"
          class="main-payment"
          text="${this.kindPayment}"
        ></bbva-type-text>
      </div>
      <div class="holder">
        ${"XXL-collapse"===this.size?h:f` ${this.cardNumber?f`<bbva-type-text
                    class="holder-number"
                    size="S"
                    unset
                    text=${this.panSafe?this._panTruncated(this.cardNumber):this.constructor._cardNumberFormat(this.cardNumber)}
                  ></bbva-type-text>`:h}
              <time datetime="${this.constructor._dateTimeFormat(this.expirationDate)}"
                >${this.expirationDate}</time
              >`}
        ${"XXL-collapse"===this.size&&this.cardNumber?this._collapseCard:f` <div class="holder-bottom">
              <div class="holder-top">
                <bbva-type-text
                  class="holder-name"
                  size="3XS"
                  unset
                  text="${this.holderName}"
                ></bbva-type-text>
              </div>
              <div class="holder-logo">${this.typeLogo}</div>
            </div>`}
      </div>
    `}get _verticalCardTpl(){return f`
      <div class="main">${this._renderBankLogo}</div>
      <div class=" holder-logo">${this.typeLogo}</div>
    `}get card(){return f`
      <figure
        style="--bg-image: url(${this.imageSrc||ne(this._cardAsset)});"
        class="card ${this.shadow?"shadow":""} ${this._differentBank()&&"other-bank"}"
        aria-hidden="true"
      >
        <div class="container" ambient="${"default"===this.variant?"primary":"secondary"}">
          ${this.vertical?this._verticalCardTpl:this._horizontalCardTpl}
        </div>
      </figure>
    `}}var Le=e`
*,
*:before,
*:after {
  box-sizing: inherit;
}

.cards-containers {
  display: flex;
  flex-direction: column;
}
.cards-containers [data-tag-name=bbva-type-text] {
  margin-left: 1rem;
}
.cards-containers [data-tag-name=bbva-form-control-input] {
  margin-top: 1rem;
  margin-bottom: 0 1rem;
}
.cards-containers [data-tag-name=bbva-form-input] {
  margin: 0 1rem;
}

.side-radio {
  padding: 1.25rem 0 0 0;
}
.side-radio [data-tag-name=bbva-type-text] {
  margin-left: 0.5rem;
}

.image-divider [data-tag-name=bbva-clip-card-data] {
  margin-bottom: 1rem;
  width: 70%;
}

.button-container {
  padding: 1.5rem 1rem 0 1rem;
  width: 100%;
}

.collapsed-step {
  margin: 1rem;
  display: flex;
  flex-direction: column;
  gap: 1rem;
}
.collapsed-step .horizontal {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
}
`;const Ee="card-origination-oc-debit-card-inmediate-delivery",{moment:Fe}=window,we=(e,t,r={})=>{e.dispatchEvent(new CustomEvent(`${Ee}-page-${t}`,{detail:r,bubbles:!0,composed:!0}))};const Me=e=>{var t;return null===(t=e.split(" "))||void 0===t?void 0:t.map((e=>e[0]?e[0].toUpperCase()+e.slice(1).toLowerCase():"")).join(" ")},Ne=(e,t)=>new RegExp(e,"gi").test(t);function Oe(e=0,t="EUR",r="es-ES",a=!0){const o={style:"currency",currency:t,...e%1!=0||a?{minimumFractionDigits:2}:{minimumFractionDigits:0,maximumFractionDigits:0}};return new Intl.NumberFormat(r,o).format(e??0)}class ze extends(L(E(l(n)))){static get is(){return"card-personalization"}static get styles(){return[Le,F.primary,ke.primary,w.primary,se.primary,$.primary,m("card-origination-oc-debit-card-inmediate-delivery-shared-styles")]}static get scopedElements(){const e=[oe,Be,ie,M,le,D,N];return ze.scopedElementsFromClasses(e)}static get properties(){return{aemHost:{type:String,attribute:"aem-host"},collapsed:{type:Boolean,reflect:!0},completeInformation:{type:Object,attribute:"complate-information"},imagesList:{type:Array,attribute:"images-list"},_nicknameValue:{type:Object},_selectedCard:{type:Object}}}constructor(){super(),this.aemHost="",this.collapsed=!1,this.completeInformation={},this.imagesList=[],this._nicknameValue={value:"",valid:!1},this._selectedCard={}}get _body(){const{valid:e,value:t}=this._nicknameValue;return f`
      <div class="cards-containers">
        ${ze._getTypeText({text:this._getLocales("step-subtitle"),fontWeight:g.fontWeight40})}
        <bbva-form-container @form-container-radio-change="${this._selectedOption}">
          ${this._radioButton}
        </bbva-form-container>
        <bbva-form-input
          type="text"
          label-out="${this._getLocales("nickname-label-out")}"
          info-message="${this._getLocales("nickname-info-message")}"
          ambient="primary-alt"
          label="${this._getLocales("nickname-label")}"
          ?invalid=${!e&&t.length>0}
          @form-input-value-change="${this._setValueInput}"
        ></bbva-form-input>
      </div>
    `}get _collapsedTemplate(){var e,t,r;return f`
      <div class="collapsed-step">
        ${ze._bbvaTypeTextKeyValues(this._getLocales("personalization-design"),`${(null===(e=this.completeInformation)||void 0===e||null===(t=e.design)||void 0===t?void 0:t.designId)??""}`)}
        ${ze._bbvaTypeTextKeyValues(this._getLocales("personalization-nickname"),`${(null===(r=this.completeInformation)||void 0===r?void 0:r.alias)??""}`)}
      </div>
    `}get _footer(){return f`
      <div class="button-container">
        <bbva-button-default
          id="btn-step-2"
          fullwidth
          text="${this._getLocales("continue-button")}"
          @click="${this._finishedStep}"
          ?disabled=${!(Object.keys(this._selectedCard).length>0&&this._nicknameValue.valid)}
        >
        </bbva-button-default>
      </div>
    `}get _notCollapsedTemplate(){return f`${this._body} ${this._footer} `}get _radioButton(){var e;return null===(e=this.imagesList)||void 0===e?void 0:e.map((e=>f`
        <bbva-form-control-input
          value="${`${null==e?void 0:e.id}-${null==e?void 0:e.coverName}`}"
          type="radio"
          slot="_option"
          name="cardsCovers"
        >
          <div slot="right" class="side-radio">
            ${ze._getTypeText({text:`${null==e?void 0:e.coverName}`,fontWeight:g.fontWeight40})}
          </div>
          <div slot="bottom" class="image-divider">
            <bbva-clip-card-data image-src="${this.aemHost+e.coverImage}">
              <span slot="sr-only">${e.coverName}</span>
            </bbva-clip-card-data>
            <bbva-divider-default></bbva-divider-default>
          </div>
        </bbva-form-control-input>
      `))}static _bbvaTypeTextKeyValues(e,t,r="",a="horizontal"){return f`
      <div class=${`${a} ${r}`}>
        ${ze._getTypeText({text:e})}
        ${ze._getTypeText({text:t,fontWeight:g.fontWeight40})}
      </div>
    `}_finishedStep(){var e,t;let r={};if(null!==(e=this._selectedCard)&&void 0!==e&&e.value){var a;const e=null===(a=this._selectedCard)||void 0===a?void 0:a.value.split("-");r={imageCode:e[0],designId:e[1]}}const o={alias:null===(t=this._nicknameValue)||void 0===t?void 0:t.value,design:r};this._fireEvent("button-default-finish",o)}_fireEvent(e,t){we(this,`${ze.is}-${e}`,t)}_getLocales(e){return this.t(`${Ee}-page-${ze.is}-${e}`)}static _getTypeText(e){const{text:t,tag:r="p",fontWeight:a=g.fontWeight20,size:o="M",style:i=y.fontStyle10}=e;return f`
      <bbva-type-text
        text="${t}"
        tag="${r}"
        font-weight=${a}
        size=${o}
        style=${i}
        unset
      ></bbva-type-text>
    `}_selectedOption({detail:e}){this._selectedCard=e}_setValueInput({detail:e}){const{value:t=""}=e;this._nicknameValue={value:t.toUpperCase(),valid:Ne("^[A-Z0-9 ]{1,26}$",t)}}render(){return f` ${this.collapsed?this._collapsedTemplate:this._notCollapsedTemplate} `}}var Ve=e`
:host {
  display: block;
  box-sizing: border-box;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-form-select] {
  margin: 1rem;
}

[data-tag-name=bbva-type-link] {
  display: flex;
  flex-direction: column;
}
[data-tag-name=bbva-type-link] [data-tag-name=bbva-form-select] {
  margin: 0 1rem;
}
`;class Re extends(L(E(l(n)))){static get is(){return"colony-selector"}static get styles(){return[Ve,ce.primary,de.primary,O.primary,m("card-origination-oc-debit-card-inmediate-delivery-shared-styles")]}static get scopedElements(){const e=[me,fe,z];return Re.scopedElementsFromClasses(e)}static get properties(){return{cleanColonySelector:{type:Boolean,attribute:"clean-colony-selector"},formLabel:{type:String,attribute:"form-label"},nativeSelected:{type:String,attribute:"native-selected"},options:{type:Array},_selectedIndex:{type:Number},_selectedOption:{type:String}}}constructor(){super(),this.cleanColonySelector=!1,this.formLabel="",this.nativeSelected="",this.options=[],this._selectedIndex=-1,this._selectedOption=""}updated(e){super.updated(e),e.has("cleanColonySelector")&&this.cleanColonySelector&&(this.options=[],this._selectedOption="",this._selectedIndex=-1,this._fireEvent("clean",!1),this._fireEvent("native-clean"),this.requestUpdate()),e.has("nativeSelected")&&this.nativeSelected&&(this._selectedOption=this.nativeSelected,this._sendElementSelected(this._selectedOption),this.requestUpdate())}get _androidSelector(){return f`<bbva-type-link id="android-selector" @click=${this._callPluginNativeListModal}>
      <bbva-form-select
        label=${this.formLabel}
        optional-label
        selected-index="${this._selectedIndex}"
        remove-labelledby-button
        ambient="primary-alt"
        readonly
      >
        ${this._selectorList}
      </bbva-form-select>
    </bbva-type-link> `}_callPluginNativeListModal(){var e;let t={tag:"",text:"",accessibleText:"",accessibleTextOnclick:""};Object.keys(this.options).length>0&&(t=this.options.map((e=>({tag:null==e?void 0:e.id,text:null==e?void 0:e.name,accessibleText:"",accessibleTextOnclick:""})))),this._fireEvent("native-selector-select",{selected:(null===(e=this.options.find((e=>(null==e?void 0:e.id)===this._selectedOption)))||void 0===e?void 0:e.id)??"",values:t})}_fireEvent(e,t={}){we(this,`${Re.is}-${e}`,t)}get _iosWebSelector(){var e;return f`
      <bbva-form-select
        @bbva-form-select-selected-item=${this._onFormSelected}
        label=${this.formLabel}
        optional-label
        selected-index="${this._selectedIndex}"
        remove-labelledby-button
        ambient="primary-alt"
        ?readonly="${!(null!==(e=this.options)&&void 0!==e&&e.length)>0}"
        ?native-selector="${this.nativeIOS}"
      >
        ${this._selectorList}
      </bbva-form-select>
    `}_onFormSelected({detail:e}){if(Object.keys(e).length>0){const{id:t}=this.options[null==e?void 0:e.selectedIndex];this._selectedOption=t,this._sendElementSelected(t)}}_sendElementSelected(e){e&&this._fireEvent("option-select-change",{id:e})}get _selectorList(){var e,t;const r=e=>f`
      <bbva-form-option
        value="${(null==e?void 0:e.id)??""}"
        ?selected=${(null==e?void 0:e.selected)||(null==e?void 0:e.id)===this._selectedOption}
      >
        ${Me((null==e?void 0:e.name)??"")}
      </bbva-form-option>
    `;return this.nativeIOS&&(null===(e=this.options)||void 0===e?void 0:e.length)>0&&!this._selectedOption&&this._onFormSelected({detail:{selectedIndex:0}}),this.options.length>0?null===(t=this.options)||void 0===t?void 0:t.map((e=>r(e))):r({})}render(){var e;return f`
      ${this.native&&!this.nativeIOS&&(null===(e=this.options)||void 0===e?void 0:e.length)>0?f`${this._androidSelector}`:f`${this._iosWebSelector}`}
    `}}customElements.define(Re.is,Re);var He=e`
:host {
  display: block;
  box-sizing: border-box;
}

.subtitle {
  margin: 1rem;
}

[data-tag-name=bbva-form-input] {
  margin: 1rem 1rem 1.5rem;
}

[data-tag-name=bbva-form-select] {
  margin: 1rem;
}

[data-tag-name=bbva-button-default] {
  width: 100%;
  margin-bottom: 1rem;
  margin-left: 1rem;
}

[data-tag-name=bbva-type-text] {
  margin-top: -rem(16px);
  --bbva-text-dark-mode-color: none ;
}

[data-tag-name=bbva-icon] {
  color: var(--statusColorsError);
  flex-shrink: 0;
}

.content-text {
  margin: 1rem;
}

.content-text-secondary {
  margin-left: 1rem;
  margin-top: 2rem;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class qe extends(L(E(l(n)))){static get is(){return"new-address-form"}static get styles(){return[He,se.primary,$.primary,m("card-origination-oc-debit-card-inmediate-delivery-shared-styles")]}static get scopedElements(){const e=[D,le,Re];return qe.scopedElementsFromClasses(e)}static get properties(){return{colonies:{type:Array},inputPatterns:{type:Object,attribute:"input-patterns"},isErrorPlacesService:{type:Boolean,attribute:"is-error-places-service"},nativeSelected:{type:String,attribute:"native-selected"},_cleanColonySelector:{type:Boolean},_parseAddress:{type:Object}}}constructor(){super(),this.colonies=[],this.isErrorPlacesService=!1,this.nativeSelected="",this._addressProps(),this._cleanColonySelector=!1}updated(e){super.updated(e),e.has("isErrorPlacesService")&&this.isErrorPlacesService&&(this._parseAddress.postalCode={...this._parseAddress.postalCode,valid:!this.isErrorPlacesService,reason:this._errorMessagePostalCode},this.requestUpdate())}get _addressDetail(){const e={};return Object.keys(this._parseAddress).forEach((t=>{var r;e[t]=(null===(r=this._parseAddress[t])||void 0===r?void 0:r.value)||""})),{address:this._addressDescription,addressComplete:e}}get _addressDescription(){var e;const{street:t,exteriorNumber:r,interiorNumber:a,colony:o,postalCode:i,state:s}=this._parseAddress;return`${null==t?void 0:t.value} ${null==r?void 0:r.value}, ${(null==a||null===(e=a.value)||void 0===e?void 0:e.length)>0?`Int. ${null==a?void 0:a.value} `:""}${null==o?void 0:o.value}, ${null==i?void 0:i.value}, ${null==s?void 0:s.value}`}get _errorMessagePostalCode(){var e,t;let r="";return 5!==(null===(e=this._parseAddress.postalCode)||void 0===e||null===(t=e.value)||void 0===t?void 0:t.length)&&(r="min-lenght"),this.isErrorPlacesService&&(r="invalid"),r}_addressProps(){var e,t,r,a,o,i;const s=(e,t,r,a,o)=>{const i={value:e,valid:!1,reason:""},s=a===t?`{${a}}`:`{${a||1},${t}}`;return t&&Object.assign(i,{maximumCharacters:t}),r&&Object.assign(i,{pattern:`${r}${s}$`}),o&&Object.assign(i,{allowedPattern:`${o}`}),i};this.inputPatterns={numbersAndLetters:"^[a-zA-Z0-9 ]",onlyNumbers:"^[0-9]",noNumbersLettersDotAndHyphens:"^[a-zA-Z0-9.\\- ]"},this._parseAddress={street:s("",50,null===(e=this.inputPatterns)||void 0===e?void 0:e.noNumbersLettersDotAndHyphens),exteriorNumber:s("",8,null===(t=this.inputPatterns)||void 0===t?void 0:t.numbersAndLetters),interiorNumber:s("",8,null===(r=this.inputPatterns)||void 0===r?void 0:r.numbersAndLetters),reference:s("",256,null===(a=this.inputPatterns)||void 0===a?void 0:a.noNumbersLettersDotAndHyphens),state:s("",8),postalCode:s("",5,null===(o=this.inputPatterns)||void 0===o?void 0:o.onlyNumbers,5,null===(i=this.inputPatterns)||void 0===i?void 0:i.onlyNumbers),colony:s(""),municipality:s("")}}_bbvaFormInput({id:e,label:t}){const{value:r,valid:a,allowedPattern:o,reason:i}=this._parseAddress[t],s=t.toLowerCase();return f`
      <bbva-form-input
        id=${e}
        type="text"
        label="${this._getLocales(s)}"
        value="${r}"
        ambient="primary-alt"
        allowed-pattern="${o||""}"
        error-message="${this._getError(i,s)}"
        ?invalid=${!a&&i}
        @form-input-value-change="${e=>{this._setValueInput(e,t)}}"
        @form-field-input-clear="${()=>{this._resetValueInput(t)}}"
      >
      </bbva-form-input>
    `}_bbvaFormInputReference(){const{value:e,valid:t,reason:r}=this._parseAddress.reference;return f`
      <bbva-form-input
        id="bbvaFormInputReference"
        type="textarea"
        label="${this._getLocales("reference")}"
        value="${e}"
        info-message="${r?"":this._getLocales("help")}"
        error-message="${r?this._getError(r,"reference"):""}"
        ?invalid="${!t&&r}"
        @form-input-value-change="${e=>{this._setValueInput(e,"reference")}}"
        @form-textarea-input-clear="${()=>{this._resetValueInput("reference")}}"
        ambient="primary-alt"
      >
      </bbva-form-input>
    `}static _bbvaText(e){const{text:t,tag:r="p",fontWeight:a=g.fontWeight20,size:o="M",style:i=y.fontStyle10}=e;return f`
      <bbva-type-text
        text="${t}"
        tag="${r}"
        font-weight=${a}
        size=${o}
        style=${i}
        unset
      ></bbva-type-text>
    `}_fireEvent(e,t={}){we(this,`${qe.is}-${e}`,t)}_getError(e,t){return this._getLocales(`error-${e}-${t}`)}_getLocales(e){return this.t(`${Ee}-page-${qe.is}-${e}`)}_searchFromPostalCode(){const{valid:e,value:t}=this._parseAddress.postalCode;this._parseAddress={...this._parseAddress,colony:{value:""},state:{value:""},stateId:{value:""},municipality:{value:""}},this.colonies=[],0===t.length&&(this._parseAddress.postalCode.valid=!0,this._parseAddress.postalCode.reason=""),e&&!this.isErrorPlacesService&&(null==t?void 0:t.length)>0?this._fireEvent("postal-code-select",t):this._parseAddress.postalCode.reason=this._errorMessagePostalCode,this.requestUpdate()}_selectForm({detail:e}){var t;const{id:r}=e,{state:a,geographicPlaceTypes:o,name:i}=(null===(t=this.colonies)||void 0===t?void 0:t.find((e=>(null==e?void 0:e.id)===r)))??{},{value:s}=o.find((e=>"MUNICIPALITY"===e.id)),l={colony:{value:Me(i)},stateId:{value:Me(a.name)||""},state:{value:(null==a?void 0:a.id)||""},municipality:{value:Me(s)||""}};this._parseAddress={...this._parseAddress,...l},this.requestUpdate(),this._validateForm()}_setValueInput({detail:e},t){const{value:r}=e,{maximumCharacters:a,pattern:o}=this._parseAddress[t],i=Ne(o,r);this._parseAddress[t]={...this._parseAddress[t],value:r,valid:i,reason:((e,t,r)=>{let a="";return!e&&t&&(a=(null==t?void 0:t.length)<r?"only-letters":"more-characters"),a})(i,r,a)},this._cleanColonySelector=!0,this.isErrorPlacesService=!1,"postalCode"===t&&this._searchFromPostalCode(),this.requestUpdate(),this._validateForm()}_resetValueInput(e){this._setValueInput({detail:{value:""}},e),"postalCode"===e&&(this._fireEvent("colony-selector-clean",!0),this._parseAddress.colony="",this._parseAddress.state="",this._parseAddress.municipality="",this._cleanColonySelector=!0)}_validateForm(){const{street:e,exteriorNumber:t,postalCode:r,interiorNumber:a,reference:o,colony:i}=this._parseAddress;let s=(null==e?void 0:e.valid)&&(null==t?void 0:t.valid)&&(null==r?void 0:r.valid)&&(null==i?void 0:i.value);null!=a&&a.value&&(s=s&&(null==a?void 0:a.valid)),null!=o&&o.value&&(s=s&&(null==o?void 0:o.valid));let l={};s&&(l=this._addressDetail),this._fireEvent("finish",l)}render(){var e,t,r,a;return f`
      ${this._bbvaFormInput({id:"bbvaFormInputStreet",label:"street"})}
      ${this._bbvaFormInput({id:"bbvaFormInputexteriorNumber",label:"exteriorNumber"})}
      ${this._bbvaFormInput({id:"bbvaFormInputinteriorNumber",label:"interiorNumber"})}
      ${this._bbvaFormInput({id:"bbvaFormInputpostalCode",label:"postalCode"})}
      <colony-selector
        .options="${this.colonies}"
        form-label="${this._getLocales("colony")}"
        ?clean-colony-selector=${this._cleanColonySelector}
        .native=${this.native}
        .nativeIOS=${this.nativeIOS}
        native-selected=${this.nativeSelected}
        @card-origination-oc-debit-card-inmediate-delivery-page-colony-selector-option-select-change="${this._selectForm}"
        @card-origination-oc-debit-card-inmediate-delivery-page-colony-selector-clean="${({detail:e})=>{this._cleanColonySelector=e}}"
      ></colony-selector>
      <div class="content-text">
        ${qe._bbvaText({text:this._getLocales("state")})}
        ${qe._bbvaText({text:(null===(e=this._parseAddress)||void 0===e||null===(t=e.stateId)||void 0===t?void 0:t.value)||"-"})}
      </div>
      <div class="content-text-secondary">
        ${qe._bbvaText({text:this._getLocales("municipality")})}
        ${qe._bbvaText({text:(null===(r=this._parseAddress)||void 0===r||null===(a=r.municipality)||void 0===a?void 0:a.value)||"-"})}
      </div>
      ${this._bbvaFormInputReference()}
    `}}var je=e`
*,
*:before,
*:after {
  box-sizing: inherit;
}

.side-radio {
  margin: 1rem;
}

.privacy-message {
  margin-top: 1rem;
  margin-left: 1rem;
  margin-right: 1rem;
  display: inline-block;
}
.privacy-message [data-tag-name=bbva-core-icon] {
  display: inline-block;
}
.privacy-message [data-tag-name=bbva-type-text] {
  display: inline;
}

[data-tag-name=bbva-notification-message] {
  margin-left: 1rem;
  margin-right: 1rem;
}

.privacy-link {
  margin: 0 1rem;
}

.button-container {
  padding: 1rem;
  padding-bottom: 0;
}

.collapsed-address {
  margin: 1rem;
  display: flex;
  flex-direction: column;
  gap: 1rem;
}
.collapsed-address .horizontal {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
}
.collapsed-address .vertical {
  display: flex;
  flex-direction: column;
}

.header-address {
  padding: 0 1rem;
}
`;class Xe extends(L(E(l(n)))){static get is(){return"address-selection"}static get styles(){return[je,$.primary,V.primary,O.primary,F.primary,R.secondary,m("card-origination-oc-debit-card-inmediate-delivery-shared-styles")]}static get scopedElements(){const e=[oe,ie,D,v,H,q,z,N,j,qe];return Xe.scopedElementsFromClasses(e)}static get properties(){return{address:{type:String,reflect:!0},addressUnmasked:{type:String,attribute:"address-unmasked"},cardCost:{type:String,attribute:"card-cost"},collapsed:{type:Boolean,reflect:!0},colonies:{type:Array,reflect:!0},completeInformation:{type:Object,attribute:"complate-information"},customAddress:{type:Boolean,attribute:"custom-address"},deliveryTime:{type:String,attribute:"delivery-time"},isErrorPlacesService:{type:Boolean,attribute:"is-error-places-service"},nativeSelected:{type:String,attribute:"native-selected"},_enabledButton:{type:Boolean},_isMaskAddress:{type:Boolean}}}constructor(){super(),this.address="",this.addressUnmasked="",this.cardCost="",this.collapsed=!1,this.colonies=[],this.completeInformation={},this.customAddress=!1,this.deliveryTime="",this.isErrorPlacesService=!1,this.nativeSelected="",this._isMaskAddress=!1,this._enabledButton=!1}get _bbvaTypeAmount(){var e,t,r;return f`
      <div class="horizontal">
        ${Xe._bbvaTypeText({text:this._getLocales("sending-card"),size:"M"})}
        ${Xe._bbvaTypeText({text:Oe(null===(e=this.completeInformation)||void 0===e?void 0:e.amount,null===(t=this.completeInformation)||void 0===t?void 0:t.localCurrency,null===(r=this.completeInformation)||void 0===r?void 0:r.language)??0})}
      </div>
    `}get _collapsedRender(){var e,t;return f`
      <div class="collapsed-address">
        ${Xe._bbvaTypeTextKeyValues(this._getLocales((()=>{var e;return null!==(e=this.completeInformation)&&void 0!==e&&e.customAddress?"new-direction-title":"current-address-title"})()),null===(e=this.completeInformation)||void 0===e?void 0:e.address)}
        ${(()=>{var e,t,r,a,o;return null!==(e=this.completeInformation)&&void 0!==e&&e.customAddress&&null!==(t=this.completeInformation)&&void 0!==t&&null!==(r=t.completeAddress)&&void 0!==r&&r.reference?Xe._bbvaTypeTextKeyValues(this._getLocales("new-direction-reference"),null===(a=this.completeInformation)||void 0===a||null===(o=a.completeAddress)||void 0===o?void 0:o.reference):""})()}
        ${Xe._bbvaTypeTextKeyValues(this._getLocales("delivery-time"),null===(t=this.completeInformation)||void 0===t?void 0:t.deliveryTime)}
        ${this._bbvaTypeAmount}
      </div>
    `}get _myDirection(){return f`
      <bbva-form-control-input
        id="formControlMyHome"
        tabindex="-1"
        slot="_option"
        vertical-align-top=""
        type="radio"
        name="custom"
        value="myDirection"
      >
        <div class="side-radio" slot="right">
          ${Xe._bbvaTypeText({text:this._getLocales("title"),fontWeight:g.fontWeight40})}
          ${this._bbvaNotificationHelpConfiguration("direction")}
        </div>
        <div class="privacy-link" slot="bottom">
          ${Xe._bbvaTypeText({text:(()=>this._isMaskAddress?this.addressUnmasked:this.address)()})}
          <bbva-type-text
            id="showAddress"
            text="${this._getLocales((()=>"link"+(this._isMaskAddress?"-hide":""))())}"
            variant="spotlight"
            tag="p"
            unset
            font-weight=${g.fontWeight40}
            size="M"
            @click="${()=>{this._fnUnmasked()}}"
          >
          </bbva-type-text>
        </div>
      </bbva-form-control-input>
    `}get _notCollapsedRender(){return f`
      <div class="address">
        ${this._renderAddresses}
        <bbva-notification-message
          id="info-message"
          book-title
          message-title="${this._getLocales("message-title")}"
        >
        </bbva-notification-message>
        ${this._renderDataTreatment}
        <bbva-type-link
          id="typeLinkShowPrivacy"
          class="privacy-link"
          @click="${()=>this._fireEvent("bbva-type-link-click")}"
        >
          ${this._getLocales("privacy-link")}
        </bbva-type-link>
        <div class="button-container">
          <bbva-button-default
            id="btn-step-1"
            fullwidth
            aria-label="${this._getLocales("aria-label-modal")}"
            text="${this._getLocales("continue-button")}"
            @click="${this._sendingStepInformation}"
            ?disabled=${!this._enabledButton}
          >
          </bbva-button-default>
        </div>
      </div>
    `}get _otherAddresses(){return f`
      <bbva-form-control-input slot="_option" type="radio" name="custom" value="otherDirection">
        <div class="side-radio" slot="right">
          ${Xe._bbvaTypeText({text:this._getLocales("new-direction-title"),fontWeight:g.fontWeight40})}
          ${this._bbvaNotificationHelpConfiguration("new-direction")}
        </div>
        <div class="privacy-link" slot="bottom" ?hidden=${!this.customAddress}></div>
      </bbva-form-control-input>
    `}get _renderAddresses(){return f`
      <div class="header-address">
        ${Xe._bbvaTypeText({text:this._getLocales("subtitle"),fontWeight:g.fontWeight40})}
      </div>
      <bbva-form-container
        divider-size="fit"
        @form-container-radio-change="${e=>this._addressSelector(e)}"
      >
        ${this._myDirection} ${this._otherAddresses}
      </bbva-form-container>

      ${this.customAddress?this._tplChangeAddress:h}
    `}get _renderDataTreatment(){return f`
      <div class="privacy-message">
        <bbva-core-icon
          icon="${b()}"
          class="icon"
          size="16"
        ></bbva-core-icon>
        ${Xe._bbvaTypeText({text:this._getLocales("panel-privacy"),fontWeight:g.fontWeight20,size:"2XS"})}
      </div>
    `}get _tplChangeAddress(){return f`
      <new-address-form
        ?nativeIos="${this.nativeIos}"
        ?native="${this.native}"
        .colonies=${this.colonies}
        ?is-error-places-service=${this.isErrorPlacesService}
        .native=${this.native}
        .nativeIOS=${this.nativeIOS}
        native-selected=${this.nativeSelected}
        @card-origination-oc-debit-card-inmediate-delivery-page-new-address-form-finish="${this._continueStepAddress}"
      ></new-address-form>
    `}_addressSelector(e){var t;const r=(null==e||null===(t=e.detail)||void 0===t?void 0:t.value)||"",a={myDirection:!1,otherDirection:!0};this.customAddress=a[r],this._enabledButton=!a[r],this.colonies=[]}_bbvaNotificationHelpConfiguration(e){return f`
      <bbva-notification-help
        hide-top-padding
        hide-bottom-padding
        hide-left-padding
        hide-right-padding
        icon="bbva:info"
        icon-size="16"
        text="${this._getLocales(e)}"
        ambient="primary"
      >
      </bbva-notification-help>
    `}static _bbvaTypeText(e){const{text:t,tag:r="p",fontWeight:a=g.fontWeight20,size:o="M",style:i=y.fontStyle10}=e;return f`
      <bbva-type-text
        text="${t}"
        tag="${r}"
        font-weight=${a}
        size=${o}
        style=${i}
        inherit
      ></bbva-type-text>
    `}static _bbvaTypeTextKeyValues(e,t,r="",a="vertical"){return f`
      <div class=${`${a} ${r}`}>
        ${Xe._bbvaTypeText({text:e,fontWeight:g.fontWeight10})}
        ${Xe._bbvaTypeText({text:t,fontWeight:g.fontWeight40})}
      </div>
    `}_continueStepAddress({detail:e}){const t=Object.keys(e).length;if(t){const{address:t,addressComplete:r}=e;this.completeInformation={address:t,completeAddress:r,customAddress:this.customAddress}}this._enabledButton=t}_fireEvent(e,t={}){we(this,`${Xe.is}-${e}`,t)}_fnUnmasked(){this._fireEvent("unmask",{masked:this._isMaskAddress?"masked":"unmasked"}),this._isMaskAddress=!this._isMaskAddress}_getLocales(e){return this.t(`${Ee}-page-${Xe.is}-${e}`)}_sendingStepInformation(){this.customAddress||(this.completeInformation={address:this.address,customAddress:this.customAddress}),this._fireEvent("button-default-finish",this.completeInformation)}render(){return f` ${this.collapsed?this._collapsedRender:this._notCollapsedRender} `}}var We=e`
*,
*:before,
*:after {
  box-sizing: inherit;
}

[data-tag-name=bbva-type-text] {
  margin-left: 1rem;
  margin-bottom: 1rem;
}
`;class Ue extends(L(E(l(n)))){static get is(){return"account-summary"}static get styles(){return[We,$.primary,m("card-origination-oc-debit-card-inmediate-delivery-shared-styles")]}static get scopedElements(){const e=[D];return Ue.scopedElementsFromClasses(e)}static get properties(){return{accountCard:{type:String,attribute:"account-card"}}}constructor(){super(),this.accountCard=""}_getLocales(e){return this.t(`${Ee}-page-${Ue.is}-${e}`)}render(){return f`
      ${this.stepAccountInfo}
      <bbva-type-text
        text="${`${this._getLocales("step-account-type")}${this.accountCard}`}"
        tag="span"
        ambient="secondary"
        unset
        font-style=${y.fontStyle20}
        font-weight=${g.fontWeight10}
      ></bbva-type-text>
    `}}class Ge extends(L(E(l(n)))){static get is(){return"multisteps-flow"}static get scopedElements(){const e=[ee,te,N,X,ze,Xe,Ue];return Ge.scopedElementsFromClasses(e)}static get properties(){return{account:{type:String},address:{type:String},addressComplete:{type:String,attribute:"address-complete"},aemHost:{type:String,attribute:"aem-host"},colonies:{type:Array},connectionStatus:{type:Boolean,attribute:"connection-status"},cardCost:{type:Number,attribute:"card-cost"},deliveryTime:{type:String,attribute:"delivery-time"},imagesList:{type:Array,attribute:"images-list"},isErrorPlacesService:{type:Boolean,attribute:"is-error-places-servece"},nativeSelected:{type:String,attribute:"native-selected"},_addressCollapsedInformation:{type:Object},_coverInformation:{type:Object},_parseAdresses:{type:Object},_customAddressReference:{type:String}}}static get styles(){return[_e,F.primary,m("card-origination-oc-debit-card-inmediate-delivery-shared-styles")]}constructor(){super(),this.account="",this.address="",this.addressComplete="",this.aemHost="",this.cardCost=0,this.colonies=[],this.connectionStatus=!1,this.deliveryTime="",this.imagesList=[],this.isErrorPlacesService=!1,this.nativeSelected="",this._addressCollapsedInformation={},this._coverInformation={},this._customAddressReference="",this._parseAdresses={}}get connectionError(){return f`
      <bbva-notification-status
        status="error"
        animation-height
        ?hide=${!this.connectionStatus}
        text="${this._getLocales("connection-error")}"
      >
      </bbva-notification-status>
    `}get stepAccountInfo(){const e=f` <account-summary account-card=${this.account}> </account-summary> `,t={id:"step-0",header:this._getLocales("account-step-title"),summary:e,index:0,completed:!0,prefilled:!0};return this._renderStep(t)}get stepAddressInformation(){const e=f`
      <address-selection
        .address="${this.address}"
        address-unmasked="${this.addressComplete}"
        .colonies="${this.colonies}"
        ?is-error-places-service=${this.isErrorPlacesService}
        .native=${this.native}
        .nativeIOS=${this.nativeIOS}
        native-selected=${this.nativeSelected}
        @card-origination-oc-debit-card-inmediate-delivery-page-address-selection-button-default-finish="${this._getAddressInformation}"
      ></address-selection>
    `,t=f`
      <address-selection
        .completeInformation=${this._addressCollapsedInformation}
        collapsed
      ></address-selection>
    `,r={id:"step-1",header:this._getLocales("address-step-title"),editLabel:this._getLocales("edit-step-label"),content:e,summary:t,index:1,showLink:!0};return this._renderStep(r)}get stepCustomizationCard(){const e=f`
      <card-personalization
        .imagesList=${this.imagesList}
        aem-host="${this.aemHost}"
        @card-origination-oc-debit-card-inmediate-delivery-page-card-personalization-button-default-finish="${this._getCardCoversInformation}"
      >
      </card-personalization>
    `,t=f`
      <card-personalization .completeInformation=${this._coverInformation} collapsed>
      </card-personalization>
    `,r={id:"step-2",header:this._getLocales("step3-title"),editLabel:this._getLocales("edit-step-label"),content:e,summary:t,index:2,showLink:!0};return this._renderStep(r)}_fireEvent(e,t){we(this,`${Ge.is}-${e}`,t)}_getAddressInformation(e){const{detail:t}=e;this._addressCollapsedInformation={...t,deliveryTime:this.deliveryTime,amount:this.cardCost,localCurrency:this.localCurrency,language:this.language},this._fireEvent("services-request"),Ge._nextStep(e),this._fireEvent("customization-page-view")}_getCardCoversInformation(e){this._fireEvent("card-personalization-finish");const{design:t,alias:r}=e.detail;this._coverInformation={alias:r,design:t},Ge._nextStep(e),this._fireEvent("card-personalization-service-request")}_getLocales(e,t){return this.t(`${Ee}-page-${Ge.is}-${e}`,t)}static _nextStep({target:e}){e.dispatchEvent(new CustomEvent("complete",{bubbles:!0,composed:!0}))}_renderStep(e){return f`
      <bbva-expandable-step
        current-step-label="${this._getLocales("step-heading",{step:(null==e?void 0:e.index)??"",total:2})}"
        view-label="${(null==e?void 0:e.viewLabel)??""}"
        ?show-link="${(null==e?void 0:e.showLink)??""}"
        ?prefilled="${(null==e?void 0:e.prefilled)??""}"
        ?hide-step-number="${(null==e?void 0:e.hideStepNumber)??""}"
        id="${(null==e?void 0:e.id)??""}"
        hide-padding-top
        hide-padding-left
        hide-padding-right
        hide-padding-bottom
        header="${this.t(null==e?void 0:e.header)??""}"
        step="${(null==e?void 0:e.index)??""}"
        edit-label="${this.t((null==e?void 0:e.editLabel)??"")}"
        disabled-target=".action"
        @expandable-step-complete-change="${this._stepCompleted}"
      >
        <div class="content">${e.content??""}</div>
        <div class="summary" slot="summary">${(null==e?void 0:e.summary)??""}</div>
      </bbva-expandable-step>
    `}_stepCompleted(e){const{target:t}=e;"step-2"===t.id&&this._toggleStepHeader("step-2")}_sendSummary(){const{address:e,customAddress:t,completeAddress:r={}}=this._addressCollapsedInformation,a={address:e,customAddress:t,completeAddress:r,...this._coverInformation};this._fireEvent("button-default-finish",a)}_toggleStepHeader(e){const t=this.shadowRoot.querySelector(`#${e}`);null!=t&&t.completed?t.header=this._getLocales("card-cover"):t.header=""}render(){return f`
      <bbva-expandable-multistep id="bbvaExpandableMultistep">
        <div slot="slot-content-header"></div>
        <div id="slotMultiStep" slot="content">
          ${this.connectionError} ${this.stepAccountInfo} ${this.stepAddressInformation}
          ${this.stepCustomizationCard}
        </div>
        <div class="confirm-step" slot="confirmation">
          <bbva-button-default
            id="btn-step-3"
            fullwidth
            variant="positive"
            text="${this._getLocales("request-button")}"
            class="button"
            @click="${this._sendSummary}"
          >
          </bbva-button-default>
        </div>
      </bbva-expandable-multistep>
    `}}class Ke extends(L(E(l(n)))){static get is(){return"api-usage"}static get scopedElements(){const e=[pe,he,ue,ge,ye,W,Se,be,ve,U];return Ke.scopedElementsFromClasses(e)}static get properties(){return{accountApiDm:{type:Number,attribute:"account-api-dm"},aemHost:{type:String,attribute:"aem-host"},aemPath:{type:String,attribute:"aem-path"},cardCoversApiDm:{type:Number,attribute:"card-covers-api-dm"},cardDeliveriesApiDm:{type:Number,attribute:"card-deliveries-api-dm"},cardProposeDelivery:{type:Number,attribute:"card-propose-delivery"},customersApiDm:{type:Number,attribute:"customers-api-dm"},customerAddressesApiDm:{type:Number,attribute:"customer-addresses-api-dm"},customerContactDetailsApiDm:{type:Number,attribute:"customer-contact-details-api-dm"},placesApiDm:{type:Number,attribute:"places-api-dm"},publicSettingsApiDm:{type:Number,attribute:"public-settings-api-dm"},publicSettingsHost:{type:String,attribute:"public-settings-host"}}}constructor(){super(),this.accountApiDm=0,this.aemHost="",this.aemPath="",this.cardCoversApiDm=0,this.cardDeliveriesApiDm=0,this.cardProposeDelivery=0,this.customersApiDm=0,this.customerAddressesApiDm=0,this.customerContactDetailsApiDm=0,this.placesApiDm=0,this.publicSettingsApiDm=0,this.publicSettingsHost=""}_apiInstance(){const e={BbvaGlobalAemContentFragmentDm:"bbva-global-aem-content-fragment-dm",BbvaGlobalCustomerAddressesApiDm:"bbva-global-customer-addresses-api-dm",BbvaGlobalCustomerContactDetailsApiDm:"bbva-global-customer-contact-details-api-dm",BbvaGlobalPlacesApiDm:"bbva-global-places-api-dm",BbvaGlobalCardDeliveriesApiDm:"bbva-global-card-deliveries-api-dm",BbvaGlobalCustomersApiDm:"bbva-global-customers-api-dm",BbvaGlobalAccountApiDm:"bbva-global-account-api-dm",BbvaGlobalCardCoversApiDm:"bbva-global-card-covers-api-dm",BbvaGlobalCardProposeDelivery:"bbva-global-card-propose-delivery-api-dm",BbvaGlobalPublicSettingsApiDm:"bbva-global-public-settings-api-dm"},t={};Object.keys(e).forEach((r=>{t[r]=this.shadowRoot.querySelector(`[data-tag-name="${e[r]}"]`)})),this._fireEvent("option-select",t)}get _bbvaGlobalAemContentFragmentDm(){return f`
      <bbva-global-aem-content-fragment-dm
        .host=${this.aemHost}
        .path=${this.aemPath}
        ?native=${this.native}
        @aem-content-fragment-dm-fetch="${this._successfulResponse}"
        @aem-content-fragment-dm-fetch-error="${this._serviceError}"
      >
      </bbva-global-aem-content-fragment-dm>
    `}get _bbvaCustomerAddresses(){return f`
      <bbva-global-customer-addresses-api-dm
        .host="${this.host}"
        .version="${this.customerAddressesApiDm}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        requiredOTP
        @signature-invalid=${()=>{this._fireEvent("otp-error-page-view")}}
        @signature-required-first-step=${()=>{this._fireEvent("otp-page-view")}}
        @customer-addresses-api-dm-fetch="${this._successfulResponse}"
        @customer-addresses-api-dm-fetch-error="${this._serviceError}"
      >
      </bbva-global-customer-addresses-api-dm>
    `}get _bbvaCustomerContactDetails(){return f`
      <bbva-global-customer-contact-details-api-dm
        .host="${this.host}"
        .version="${this.customerContactDetailsApiDm}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @customer-contact-details-api-dm-fetch="${this._successfulResponse}"
        @customer-contact-details-api-dm-fetch-error="${this._serviceError}"
      >
      </bbva-global-customer-contact-details-api-dm>
    `}get _bbvaGeographicplaces(){return f`
      <bbva-global-places-api-dm
        .host="${this.host}"
        .version="${this.placesApiDm}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @places-api-dm-fetch="${this._successfulResponse}"
        @places-api-dm-fetch-error="${this._serviceError}"
      >
      </bbva-global-places-api-dm>
    `}get _bbvaGlobalCardsDeliveries(){return f`
      <bbva-global-card-deliveries-api-dm
        .host="${this.host}"
        .version="${this.cardDeliveriesApiDm}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @card-deliveries-api-dm-create="${this._successfulResponse}"
        @card-deliveries-api-dm-create-error="${this._serviceError}"
      >
      </bbva-global-card-deliveries-api-dm>
    `}get _bbvaGlobalCustomers(){return f`
      <bbva-global-customers-api-dm
        .host="${this.host}"
        .version="${this.customersApiDm}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @customers-api-dm-fetch="${this._successfulResponse}"
        @customers-api-dm-fetch-error="${this._serviceError}"
      >
      </bbva-global-customers-api-dm>
    `}get _bbvaGlobalAccount(){return f`
      <bbva-global-account-api-dm
        .host="${this.host}"
        .version="${this.accountApiDm}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @account-api-dm-fetch="${this._successfulResponse}"
        @account-api-dm-fetch-error="${this._serviceError}"
      >
      </bbva-global-account-api-dm>
    `}get _bbvaGlobalCardCoversApiDm(){return f`
      <bbva-global-card-covers-api-dm
        .host="${this.host}"
        .version="${this.cardCoversApiDm}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @card-covers-api-dm-fetch="${this._successfulResponse}"
        @card-covers-api-dm-fetch-error="${this._serviceError}"
      >
      </bbva-global-card-covers-api-dm>
    `}get _bbvaGlobalCardProposeDelivery(){return f`
      <bbva-global-card-propose-delivery-api-dm
        .host="${this.host}"
        .version="${this.cardProposeDelivery}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @card-propose-delivery-api-dm-create="${this._successfulResponse}"
        @card-propose-delivery-api-dm-create-error="${this._serviceError}"
      >
      </bbva-global-card-propose-delivery-api-dm>
    `}get _bbvaGlobalPublicSettingsApiDm(){return f`
      <bbva-global-public-settings-api-dm
        .host="${this.publicSettingsHost}"
        .version="${this.publicSettingsApiDm}"
        ?native="${this.native}"
        .requiredToken="${this.requiredToken}"
        @public-settings-api-dm-fetch="${this._successfulResponse}"
        @public-settings-api-dm-fetch-error="${this._serviceError}"
      >
      </bbva-global-public-settings-api-dm>
    `}_fireEvent(e,t){we(this,`${Ke.is}-${e}`,t)}_successfulResponse({detail:e,type:t}){this._fireEvent(`${t}-correctly-respond`,e)}_serviceError({detail:e,type:t}){this._fireEvent("service-wrong",{detail:e,type:t})}render(){return f`
      ${this._bbvaGlobalAemContentFragmentDm} ${this._bbvaCustomerAddresses}
      ${this._bbvaCustomerContactDetails} ${this._bbvaGeographicplaces}
      ${this._bbvaGlobalCardsDeliveries} ${this._bbvaGlobalCustomers} ${this._bbvaGlobalAccount}
      ${this._bbvaGlobalCardCoversApiDm} ${this._bbvaGlobalCardProposeDelivery}
      ${this._bbvaGlobalPublicSettingsApiDm} ${this._apiInstance()}
    `}}var Ye=e`
:host([hidden]),
[hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}

.panel-info {
  margin-top: 1.5rem;
  padding-bottom: 1.125rem;
}

.receipt-wrapper .panel-info .receipt-subtitle {
  margin-bottom: 0.5rem;
}

[data-tag-name=bbva-clip-microillustration] {
  display: flex;
  padding-left: 1rem;
  padding-right: 1rem;
}

[data-tag-name=bbva-type-text] {
  margin-left: 1rem;
  margin-right: 1rem;
  padding-top: 1rem;
}

[data-tag-name=bbva-header-category] {
  margin-top: 1rem;
  margin-left: 1rem;
  margin-bottom: 1rem;
}

.footer {
  margin: 2rem;
  padding-bottom: 1rem;
}
.footer .content-position-absolute {
  position: absolute;
  bottom: 1rem;
  right: 1rem;
  left: 1rem;
}
.footer .message {
  margin-top: 0.5rem;
  margin-bottom: 0.5rem;
  padding-right: 2rem;
}
.footer .message .highlight {
  margin-top: 0.5rem;
}
`;class Ze extends(L(E(l(n)))){static get is(){return"card-offer"}static get styles(){return[Ye,G.primaryAlt,re.primary,K.primary,$.primary,F.primary,m("card-origination-oc-debit-card-inmediate-delivery-shared-styles")]}static get scopedElements(){const e=[D,ae,N,Y,Z];return Ze.scopedElementsFromClasses(e)}static get properties(){return{deliveryTime:{type:String,attribute:"delivery-time"}}}constructor(){super(),this.deliveryTime=""}_bbvaBullet(e,t={}){return f` <bbva-list-bullet text="${this._getLocales(e,t)}"></bbva-list-bullet> `}_fireEvent(e,t){we(this,`${Ze.is}-${e}`,t)}_getLocales(e,t={}){return this.t(`${Ee}-page-${Ze.is}-${e}`,t)}get _renderPanelInfo(){return f`
      <div class="panel-info">
        <bbva-clip-microillustration
          microillustration="addcreditcard"
          size="M"
        ></bbva-clip-microillustration>
        <bbva-type-text tag="span" text="${this._getLocales("microillustration")}"></bbva-type-text>
      </div>
    `}get _renderButtonDefault(){return f`
      <div class="footer">
        <div class="content-position-absolute">
          <bbva-button-default
            id="toMultistep"
            fullwidth
            text="${this._getLocales("button")}"
            @click=${()=>{this._fireEvent("button-default-finish")}}
          ></bbva-button-default>
        </div>
      </div>
    `}get _renderHeaderCategory(){return f`
      <bbva-header-category text="${this._getLocales("category")}"></bbva-header-category>
    `}get _renderListBullet(){return f`
      <div class="receipt-main">
        ${this._bbvaBullet("bullet-one")}
        ${this._bbvaBullet("bullet-two",{variableFecha:this.deliveryTime})}
        ${this._bbvaBullet("bullet-three")}
      </div>
    `}render(){return f`
      <div slot="slot-content">
        <div class="receipt-wrapper">
          ${this._renderPanelInfo} ${this._renderHeaderCategory} ${this._renderListBullet}
          ${this._renderButtonDefault}
        </div>
      </div>
    `}}var Je=e`
:host {
  display: block;
  box-sizing: border-box;
  width: 100%;
  height: 100%;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}

.panel-info {
  display: flex;
  flex-direction: column;
  margin: 1rem 0;
  padding: 0 1rem;
  gap: 1rem;
}

.main-container {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  padding: 0 1rem;
}
.main-container .values-list [data-tag-name=bbva-type-text]:first-child {
  text-align: left;
}
.main-container .values-list [data-tag-name=bbva-type-text]:last-child {
  text-align: right;
}

[data-tag-name=bbva-notification-message] {
  display: flex;
  flex-direction: column;
  margin-top: 1rem;
}
[data-tag-name=bbva-notification-message] [data-tag-name=bbva-type-text] {
  padding-top: 0.5rem;
  text-align: left;
}

.footer {
  padding-top: 0.5rem;
  margin-left: 1rem;
  margin-right: 1rem;
}
.footer .highlight {
  padding: 0;
}

.horizontal {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  gap: 1rem;
}
`;class Qe extends(L(E(l(n)))){static get is(){return"successful-request"}static get styles(){return[Je,G.primaryAlt,$.primary,R.primary,m("card-origination-oc-debit-card-inmediate-delivery-shared-styles")]}static get scopedElements(){const e=[D,q,Z,j];return Qe.scopedElementsFromClasses(e)}static get properties(){return{configList:{type:Object,attribute:"config-list"}}}constructor(){super(),this.configList={}}static _bbvaTypeTextKeyValues(e,t,r,a="horizontal"){const o=`values-list ${a} ${r}`,i="date"===r?y.fontStyle20:"";return f`
      <div class=${o}>
        ${Qe._getTypeText({text:e})}
        ${Qe._getTypeText({text:t,fontWeight:g.fontWeight40,style:i})}
      </div>
    `}_getLocales(e){return this.t(`${Ee}-page-${Qe.is}-${e}`)}static _getTypeText(e){const{text:t,tag:r="p",fontWeight:a=g.fontWeight20,size:o="M",style:i=y.fontStyle10,classes:s=""}=e;return f`
      <bbva-type-text
        text="${t}"
        tag="${r}"
        font-weight=${a}
        size="${o}"
        font-style=${i}
        unset
        class=${s}
      ></bbva-type-text>
    `}get _renderPanelInfo(){return f`
      <div class="panel-info">
        <bbva-clip-microillustration
          microillustration="success"
          size="M"
        ></bbva-clip-microillustration>
        ${Qe._getTypeText({text:this._getLocales("microillustration"),fontWeight:g.fontWeight50,size:"3XL",tag:"h2"})}
        ${Qe._getTypeText({text:this._getLocales("microillustration-subtitle")})}
      </div>
    `}get _renderMain(){var e,t,r,a,o,i,s,l,n,c;return f`
      <div class="main-container">
        ${Qe._bbvaTypeTextKeyValues(this._getLocales("date-time-request"),null===(e=this.configList)||void 0===e?void 0:e.requestTime,"date")}
        ${Qe._bbvaTypeTextKeyValues(this._getLocales("associated-account"),null===(t=this.configList)||void 0===t?void 0:t.account,"associated-account")}
        ${Qe._bbvaTypeTextKeyValues(this._getLocales("shipping-address"),null===(r=this.configList)||void 0===r?void 0:r.address,"shipping-address")}
        ${null!==(a=this.configList)&&void 0!==a&&a.reference?Qe._bbvaTypeTextKeyValues(this._getLocales("shipping-address-reference"),this.configList.reference,"shipping-address-reference"):""}
        ${Qe._bbvaTypeTextKeyValues(this._getLocales("date-delivery"),null===(o=this.configList)||void 0===o?void 0:o.deliveryDate,"date-delivery")}
        ${Qe._bbvaTypeTextKeyValues(this._getLocales("color-card"),null===(i=this.configList)||void 0===i||null===(s=i.design)||void 0===s?void 0:s.designId,"color-card")}
        ${Qe._bbvaTypeTextKeyValues(this._getLocales("alias-card"),null===(l=this.configList)||void 0===l?void 0:l.alias,"alias-card")}
        ${Qe._bbvaTypeTextKeyValues(this._getLocales("cost-shipping"),null===(n=this.configList)||void 0===n?void 0:n.commission,"cost-shipping")}
        ${Qe._bbvaTypeTextKeyValues(this._getLocales("application-folio"),null===(c=this.configList)||void 0===c?void 0:c.folio,"application-folio")}
      </div>
    `}get _renderNotifications(){return f`
      <div class="footer">
        <bbva-notification-message
          message-title="${this._getLocales("notification-email")}"
          book-title
          class="message"
        >
          ${Qe._getTypeText({text:this.configList.email})}
        </bbva-notification-message>
        <bbva-notification-message
          variant="caution"
          class="message"
          book-title
          message-title="${this._getLocales("notification-delivery")}"
        >
        </bbva-notification-message>
      </div>
    `}render(){return f`
      <div slot="slot-content" class="full-height">
        <div class="receipt-wrapper">
          ${this._renderPanelInfo} ${this._renderMain} ${this._renderNotifications}
        </div>
      </div>
    `}}var et=e`
:host {
  display: block;
}

[data-tag-name=bbva-help-modal] {
  z-index: 10;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

#custom-text1 {
  padding-bottom: 1rem;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;class tt extends(L(E(l(n)))){static get is(){return"card-modals"}static get styles(){return[et,$.primary,G.primary,m("card-origination-oc-debit-card-inmediate-delivery-shared-styles")]}static get scopedElements(){const e=[D,J,Z];return tt.scopedElementsFromClasses(e)}static get properties(){return{modalConfigs:{type:Object,attribute:"modal-configs"},visible:{type:Boolean,reflect:!0},template:{type:String,reflect:!0}}}constructor(){super(),this.modalConfigs={},this.template="",this.visible=!1}updated(e){var t;(super.updated(e),e.has("modalConfigs"))&&(Object.keys(this.modalConfigs).length>0?this.template="prevent-exit"===(null===(t=this.modalConfigs)||void 0===t?void 0:t.id)?this._tplHalfModal:this._modalTemplate:this.template=h);e.has("visible")&&(this.visible||(this.modalConfigs={}))}_fireEvent(e,t={}){we(this,`${tt.is}-${e}`,t)}_getlocales(e){return this.t(`${Ee}-page-${tt.is}-${e}`)}_handleFooterLinkClick(e){const{target:t}=e,r=`link-${null==t?void 0:t.id}`;this._fireEvent(r)}_handleFooterButtonClick(e){const{target:t}=e,r=`button-${null==t?void 0:t.id}`;this._fireEvent(r)}get _modalTemplate(){var e,t,r,a,o,i,s,l,n,c,d,m,u,p,g,y,b,v,_,P,A;return f`
      <bbva-help-modal
        id="${S(null===(e=this.modalConfigs)||void 0===e?void 0:e.id)}"
        header-close-icon-aria-label="${this._getlocales("icon-aria-modal")}"
        ?visible="${this.visible}"
        .closeModalElements="${this.modalConfigs.closeModalElements}"
        modal-type="${S(null===(t=this.modalConfigs)||void 0===t?void 0:t.modalType)}"
        title-icon="${S(null===(r=this.modalConfigs)||void 0===r?void 0:r.titleIcon)}"
        header-text="${S(this.t(null===(a=this.modalConfigs)||void 0===a?void 0:a.headerText))}"
        title-text="${S(this.t(null===(o=this.modalConfigs)||void 0===o?void 0:o.titleText))}"
        subtitle-text="${S(this.t(null===(i=this.modalConfigs)||void 0===i?void 0:i.subtitleText))}"
        body-text="${S(this.t(null===(s=this.modalConfigs)||void 0===s?void 0:s.bodyText))}"
        button-text="${S(this.t(null===(l=this.modalConfigs)||void 0===l?void 0:l.buttonText))}"
        .linkText="${this.t(null===(n=this.modalConfigs)||void 0===n?void 0:n.linkText)}"
        ?full-height="${null===(c=this.modalConfigs)||void 0===c?void 0:c.fullHeight}"
        sticky-footer
        ?fixed-footer="${null===(d=this.modalConfigs)||void 0===d?void 0:d.fullHeight}"
        @help-modal-footer-button-click="${this._handleFooterButtonClick}"
        @help-modal-footer-link-click="${this._handleFooterLinkClick}"
      >
        ${null!==(m=this.modalConfigs)&&void 0!==m&&m.customBody1?f`
              <div class="content" slot="slot-content">
                ${null!==(u=this.modalConfigs)&&void 0!==u&&u.microillustration?f`
                      <bbva-clip-microillustration
                        microillustration="${null===(p=this.modalConfigs)||void 0===p?void 0:p.microillustration}"
                        size="M"
                      ></bbva-clip-microillustration>
                    `:h}
                <bbva-type-text
                  id="custom-text1"
                  .fontWeight="${null!==(g=this.modalConfigs)&&void 0!==g&&g.customBody1Css?null===(y=this.modalConfigs.customBody1Css)||void 0===y?void 0:y.fontWeight:400}"
                  .size="${null!==(b=this.modalConfigs)&&void 0!==b&&b.customBody1Css?null===(v=this.modalConfigs)||void 0===v||null===(_=v.customBody1Css)||void 0===_?void 0:_.size:"M"}"
                  tag="span"
                  text="${this.t(null===(P=this.modalConfigs)||void 0===P?void 0:P.customBody1)}"
                ></bbva-type-text>
                <bbva-type-text
                  id="custom-text"
                  tag="span"
                  text="${this.t(null===(A=this.modalConfigs)||void 0===A?void 0:A.customBody2)}"
                ></bbva-type-text>
              </div>
            `:""}
      </bbva-help-modal>
    `}get _tplHalfModal(){var e,t,r,a,o,i,s,l,n,c,d;return f`
      <bbva-help-modal
        ?visible="${this.visible}"
        id="${null===(e=this.modalConfigs)||void 0===e?void 0:e.id}"
        .closeModalElements="${null===(t=this.modalConfigs)||void 0===t?void 0:t.closeModalElements}"
        header-text="${this.t(null===(r=this.modalConfigs)||void 0===r?void 0:r.headerText)}"
        title-icon="${null===(a=this.modalConfigs)||void 0===a?void 0:a.titleIcon}"
        modal-type="${null===(o=this.modalConfigs)||void 0===o?void 0:o.modalType}"
        body-text="${this.t(null===(i=this.modalConfigs)||void 0===i?void 0:i.bodyText)}"
        button-text="${this.t(null===(s=this.modalConfigs)||void 0===s?void 0:s.buttonText)}"
        subtitle-text="${this.t(null===(l=this.modalConfigs)||void 0===l?void 0:l.subtitleText)}"
        title-text="${this.t(null===(n=this.modalConfigs)||void 0===n?void 0:n.titleText)}"
        .linkText="${this.t(null===(c=this.modalConfigs)||void 0===c?void 0:c.linkText)}"
        ?full-height="${null===(d=this.modalConfigs)||void 0===d?void 0:d.fullHeight}"
        @help-modal-footer-button-click="${this._handleFooterButtonClick}"
        @help-modal-footer-link-click="${this._handleFooterLinkClick}"
      >
      </bbva-help-modal>
    `}render(){return f`${this.template}`}}var rt=e`
:host {
  display: block;
  box-sizing: border-box;
  padding-bottom: 0;
}

:host([hidden]),
[hidden] {
  display: none !important;
}

[data-tag-name=bbva-help-modal] {
  --bbva-help-modal-padding: 0;
}

[data-tag-name=bbva-progress-content] {
  z-index: 999;
}

[data-tag-name=bbva-type-text] {
  padding-top: 0;
  padding-bottom: 1.5rem;
}

.main-container {
  background-color: --_card-origination-oc-debit-card-inmediate-delivery-bg-color;
}

*,
*:before,
*:after {
  box-sizing: inherit;
}
`,at=e`
:host {
  --_card-origination-oc-debit-card-inmediate-delivery-bg-color: var(--card-origination-oc-debit-card-inmediate-delivery--custom--primary-ambient--bg-color,${A("colorPrimarySurfaceAlternativeDefault",Q)});
}
`;const ot=e=>`${Ee}-page-modal-configuration-${e}`,it={error_retry_modal:{id:"error-retry-modal",closeModalElements:["header"],modalType:"warning",titleIcon:_(),fullHeight:!1,headerText:ot("retry-error-title"),bodyText:ot("retry-error-body"),buttonText:ot("retry-error-button"),linkText:ot("leave-error-button")},exit_error_retry_modal:{id:"exit-error-retry-modal",closeModalElements:["header","footer-link","footer-button"],modalType:"warning",titleIcon:_(),fullHeight:!1,headerText:ot("retry-error-title"),bodyText:ot("retry-error-body"),buttonText:ot("leave-modal-button")},token_generate_error:{id:"token-generate-error",closeModalElements:["footer-link","footer-button"],modalMessageKey:!0,fullHeight:!0,microillustration:"error",buttonText:ot("token-button-error"),headerText:ot("token-header-error"),customBody1:ot("token-title-error"),customBody1Css:{fontWeight:600,size:"2XL"},customBody2:ot("token-body-error")},token_error_retry_modal:{id:"token-error-retry-modal",closeModalElements:["header"],modalType:"warning",titleIcon:_(),fullHeight:!1,headerText:ot("token-retry-error-title"),bodyText:ot("token-retry-error-body"),buttonText:ot("retry-error-button")},information_not_loaded:{id:"information-not-loaded",closeModalElements:["footer-link","footer-button"],modalMessageKey:!0,fullHeight:!0,microillustration:"error",buttonText:ot("not-loaded-button-retry"),linkText:ot("not-loaded-button-link-return"),headerText:ot("not-loaded-header"),customBody1:ot("not-loaded-header-information"),customBody1Css:{fontWeight:600,size:"2XL"},customBody2:ot("not-loaded-body-information")},information_not_loaded_exit:{id:"information-not-loaded-exit",closeModalElements:["footer-link","footer-button"],modalMessageKey:!0,fullHeight:!0,microillustration:"error",buttonText:ot("not-loaded-exit-button-link-return"),headerText:ot("not-loaded-exit-header"),customBody1:ot("not-loaded-exit-header-information"),customBody1Css:{fontWeight:600,size:"2XL"},customBody2:ot("not-loaded-exit-body-error-information")},exit_modal:{id:"prevent-exit",closeModalElements:["header","footer-link","footer-button"],modalType:"caution",titleIcon:P(),fullHeight:!1,headerText:ot("leave-modal-header"),bodyText:ot("leave-modal-body"),buttonText:ot("leave-modal-button"),linkText:ot("leave-modal-link"),subtitleText:"",titleText:""},info_notice_privacy_modal:{id:"notice-privacy",closeModalElements:["header"],modalType:"info",headerType:"modal",modalMessageKey:!0,fullHeight:!1,headerText:ot("privacy-modal-header"),customBody1:ot("privacy-modal-body1"),customBody2:ot("privacy-modal-body2")}},st={"aem-content-fragment-dm-fetch-error":"aemError","customer-contact-details-api-dm-fetch-error":"contactDetailsError","places-api-dm-fetch-error":"placesError","card-deliveries-api-dm-create-error":"cardDeliveriesError","customers-api-dm-fetch-error":"customersError","account-api-dm-fetch-error":"accountError","public-settings-api-dm-fetch-error":"settingsError","card-covers-api-dm-fetch-error":"cardCoversError","customer-addresses-api-dm-fetch-error":"addressError","card-propose-delivery-api-dm-create-error":"proposeError"};class lt extends(L(E(l(n)))){static get is(){return"card-origination-oc-debit-card-inmediate-delivery"}static get scopedElements(){const e=[J,Ze,Qe,Ge,tt,Ke,...lt.configurationScopedElements()];return lt.scopedElementsFromClasses(e)}static get properties(){return{accountId:{type:String,attribute:"account-id"},accountsApiVersion:{type:Number,attribute:"accounts-api-version"},addressFields:{attribute:"address-fields",type:Object},aemHost:{type:String,attribute:"aem-host"},aemPath:{type:String,attribute:"aem-path"},cardCoverApiVersion:{type:Number,attribute:"card-cover-api-version"},cardDeliveriesApiVersion:{type:Number,attribute:"card-deliveries-api-version"},cardId:{type:String,attribute:"card-id"},cardProposeDeliveryApiVersion:{type:Number,attribute:"card-propose-delivery-api-version"},catalogId:{type:String,attribute:"catalog-id"},commission:{type:Number},customersApiVersion:{type:Number,attribute:"customers-api-version"},customerAddressesApiVersion:{type:Number,attribute:"customers-addresses-api-version"},customerContactDetailsApiVersion:{type:Number,attribute:"customers-contact-details-api-version"},customerId:{type:String,attribute:"customer-id"},deliveryTime:{type:String,attribute:"delivery-time"},maxAllowedRetries:{type:Number,attribute:"max-allowed-retries"},placesApiVersion:{type:Number,attribute:"places-api-version"},productId:{type:String,attribute:"product-id"},publicSettingsApiVersion:{type:Number,attribute:"public-settings-api-version"},publicSettingsId:{type:String,attribute:"public-settings-key"},publicSettingsKey:{type:String,attribute:"public-settings-key"},relatedContracts:{type:String,attribute:"related-contracts"},serviceType:{type:String,attribute:"service-type"},_accountNumber:{type:String},_apisInstance:{type:Object},_cardCoversList:{type:Array},_connectionOffline:{type:Boolean},_email:{type:String},_handlerShowModal:{type:Object,state:!0},_headerText:{type:String},_isErrorPlaces:{type:Boolean},_isCustomAddress:{type:Boolean},_isVisible:{type:Boolean},_isUnmasked:{type:Boolean},_longCustomerAddress:{type:String},_listPlaces:{type:Array},_modalInfo:{type:Object},_modalErrorCounter:{type:Object},_multistepHeaderVariant:{type:String},_numberAccount:{type:String},_nativeSelected:{type:String},_pages:{type:Object},_payloadCardDeliverie:{type:Object},_retryService:{type:String},_shortCustomerAddress:{type:String},_showMultistep:{type:Boolean},_showLanding:{type:Boolean},_showSuccess:{type:Boolean},_showModalMultistep:{type:Boolean},_successInfo:{type:Object},_typeError:{type:String}}}static get styles(){return[rt,at,m("card-origination-oc-debit-card-inmediate-delivery-shared-styles")]}constructor(){super(),this.accountId="",this.addressFields={street:"STREET",exteriorNumber:"EXTERIOR_NUMBER",interiorNumber:"INTERIOR_NUMBER",colony:"COLONY",state:"ADMINISTRATIVE_AREA_LEVEL_1",postalCode:"POSTAL_CODE",municipality:"MUNICIPALITY",reference:"REFERENCE",country:"COUNTRY"},this.customersApiVersion=0,this.customerAddressesApiVersion=0,this.customerContactDetailsApiVersion=0,this.cardDeliveriesApiVersion=0,this.cardCoverApiVersion=0,this.cardProposeDeliveryApiVersion=0,this.accountsApiVersion=0,this.placesApiVersion=0,this.publicSettingsApiVersion=0,this.cardId="",this.catalogId="SEPOMEX",this.commission=0,this.config={loader:!0},this.customerId="",this.deliveryTime="",this.language="",this.localCurrency="",this.maxAllowedRetries=3,this.publicSettingsId="",this.publicSettingsKey="",this.serviceType="D",this.relatedContracts="",this._accountNumber="",this._apisInstance={},this._cardCoversList=[],this._connectionOffline=!1,this._email="",this._handlerShowModal={},this._headerText=this._getlocales("application-header"),this._isCustomAddress=!1,this._isErrorPlaces=!1,this._isUnmasked=!1,this._isVisible=!1,this._listPlaces=[],this._longCustomerAddress="",this._modalErrorCounter={customer:0,addressError:0},this._modalInfo={},this._multistepHeaderVariant="modal-initial-secondary",this._nativeSelected="",this._numberAccount="",this._pages={landingPage:{id:"landing",headerType:"modal-initial"},multistepPage:{id:"multistep"},successPage:{id:"success",headerType:"modal-initial"}},this._payloadCardDeliverie={},this._retryService="",this._shortCustomerAddress="",this._showLanding=!1,this._showModalMultistep=!1,this._showMultistep=!1,this._showSuccess=!1,this._successInfo={},this._typeError=""}connectedCallback(){super.connectedCallback&&(super.connectedCallback(),this.history=[this._pages.landingPage.id])}disconnectedCallback(){super.disconnectedCallback&&super.disconnectedCallback()}get apiUsage(){return f`
      <api-usage
        aem-host="${this.aemHost}"
        aem-path="${this.aemPath}"
        customer-addresses-api-dm="${this.customerAddressesApiVersion}"
        customer-contact-details-api-dm="${this.customerContactDetailsApiVersion}"
        places-api-dm="${this.placesApiVersion}"
        card-deliveries-api-dm="${this.cardDeliveriesApiVersion}"
        customers-api-dm="${this.customersApiVersion}"
        account-api-dm="${this.accountsApiVersion}"
        card-covers-api-dm="${this.cardCoverApiVersion}"
        card-propose-delivery="${this.cardProposeDeliveryApiVersion}"
        public-settings-api-dm="${this.publicSettingsApiVersion}"
        .host=${this.host}
        .native=${this.native}
        .requiredToken=${this.requiredToken}
        public-settings-host="${this.publicSettingsHost}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-aem-content-fragment-dm-fetch-correctly-respond="${this._handleAemSuccess}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-customer-addresses-api-dm-fetch-correctly-respond="${this._handleCustomerAddressesSuccess}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-customer-contact-details-api-dm-fetch-correctly-respond="${this._handleCustomerContactDetailsSuccess}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-places-api-dm-fetch-correctly-respond="${this._handlePlacesSuccess}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-card-deliveries-api-dm-create-correctly-respond="${this._handleCardDeliveriesSuccess}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-customers-api-dm-fetch-correctly-respond="${this._handleGlobalCustomersSuccess}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-account-api-dm-fetch-correctly-respond="${this._handleGlobalAccountSuccess}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-card-covers-api-dm-fetch-correctly-respond="${this._handleCardCoversSuccess}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-card-propose-delivery-api-dm-create-correctly-respond="${this._handleProposeDeliverySuccess}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-public-settings-api-dm-fetch-correctly-respond="${this._handlePublicSettingsSuccess}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-service-wrong="${this._errorRequest}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-otp-error-page-view="${this.modalErrorOTP}"
        @card-origination-oc-debit-card-inmediate-delivery-page-api-usage-option-select="${this._getApisInstance}"
      ></api-usage>
    `}connectionStatuosOffline(){this._connectionOffline=!0}connectionStatuosOnline(){this._connectionOffline=!1}init(){this.history=[],this.navigate(this._pages.landingPage.id),Object.values(this._apisInstance).some((e=>null===e))||(this._getAccounts(),this._getCustomer(),this._proposeDelivery(),this._handlerSetting(),this._showLanding=!0)}get modalFlow(){return f`
      <card-modals
        .modalConfigs=${this._modalInfo}
        ambient="primary"
        ?visible=${this._isVisible}
        @visible-changed="${e=>{e.stopPropagation(),this._isVisible=null==e?void 0:e.detail,this._isVisible||(this._modalInfo={})}}"
        @card-origination-oc-debit-card-inmediate-delivery-page-card-modals-button-prevent-exit="${()=>{this._leaveFeat("multistep")}}"
        @card-origination-oc-debit-card-inmediate-delivery-page-card-modals-button-exit-error-retry-modal="${()=>{this._leaveFeat("multistep")}}"
        @card-origination-oc-debit-card-inmediate-delivery-page-card-modals-button-error-retry-modal="${()=>{this._hanlerRetryServices()}}"
        @card-origination-oc-debit-card-inmediate-delivery-page-card-modals-link-error-retry-modal="${()=>{this._leaveFeat("multistep")}}"
        @card-origination-oc-debit-card-inmediate-delivery-page-card-modals-button-token-error-retry-modal="${()=>{this._hanlerRetryServices()}}"
        @card-origination-oc-debit-card-inmediate-delivery-page-card-modals-button-token-generate-error="${()=>{this._leaveFeat("multistep")}}"
        @card-origination-oc-debit-card-inmediate-delivery-page-card-modals-button-information-not-loaded-exit="${()=>{this._leaveFeat("multistep")}}"
      ></card-modals>
    `}nativeOptionSelected(e){this._nativeSelected=(null==e?void 0:e.native_modal_item_selected)??""}navigate(e){let t=null;"back"===e||"object"==typeof e?(t=this.history[this.history.length-1],"multistep"===t?(this._modalInfo=it.exit_modal,this._isVisible=!0):this._leaveFeat(t)):(t=e,this.history.push(e))}get renderMultistep(){return f`
      <multisteps-flow
        ambient="primary"
        .colonies=${this._listPlaces}
        ?is-error-places-servece=${this._isErrorPlaces}
        account="${this._accountNumber}"
        address="${this._shortCustomerAddress}"
        address-complete="${this._longCustomerAddress}"
        .imagesList=${this._cardCoversList}
        delivery-time="${this.deliveryTime}"
        card-cost="${this.commission}"
        .localCurrency="${this.localCurrency}"
        .language="${this.language}"
        aem-host="${this.aemHost}"
        .native=${this.native}
        .nativeIOS=${this.nativeIOS}
        native-selected=${this._nativeSelected}
        ?connection-status="${this._connectionOffline}"
        @card-origination-oc-debit-card-inmediate-delivery-page-multisteps-flow-button-default-finish="${this._requestSummarySucces}"
        @card-origination-oc-debit-card-inmediate-delivery-page-address-selection-unmask="${this._unmaskedAdress}"
        @card-origination-oc-debit-card-inmediate-delivery-page-new-address-form-colony-selector-clean="${()=>{this._listPlaces=[],this._isErrorPlaces=!1,this.requestUpdate()}}"
        @card-origination-oc-debit-card-inmediate-delivery-page-address-selection-bbva-type-link-click="${()=>{this._modalInfo=it.info_notice_privacy_modal,this._isVisible=!0}}"
        @card-origination-oc-debit-card-inmediate-delivery-page-new-address-form-postal-code-select="${({detail:e})=>{this._setUpGeographicPlaces(e)}}"
        @card-origination-oc-debit-card-inmediate-delivery-page-multisteps-flow-services-request="${this._handlerServices}"
        @card-origination-oc-debit-card-inmediate-delivery-page-multisteps-flow-card-personalization-service-request="${this._getEmail}"
        @card-origination-oc-debit-card-inmediate-delivery-page-colony-selector-native-clean="${()=>{this._nativeSelected=""}}"
        @expandable-multistep-specific-step-scroll="${e=>{this._multistepHeaderVariant=e.detail.completed?"modal-initial-secondary":"modal-initial"}}"
      ></multisteps-flow>
    `}showMultistep(){this._showModalMultistep=!0,this._showMultistep=!0,this.clearLoader()}modalErrorOTP(){this._isVisible=!0,this._modalInfo=this._modalErrorCounter.addressError===this.maxAllowedRetries?it.token_generate_error:it.token_error_retry_moda,this._retryService="addressError"}_cardCovers(){this._apisInstance.BbvaGlobalCardCoversApiDm.getCardCovers(this.cardId,{productId:this.productId})}_createDelivery(){this._apisInstance.BbvaGlobalCardDeliveriesApiDm.postCardDeliveries(this.cardId,this._payloadCardDeliverie)}_errorRequest({detail:e}){const{type:t}=e;"places-api-dm-fetch-error"===t?this._isErrorPlaces=!0:"customer-addresses-api-dm-fetch-error"===t&&this._isUnmasked?(this._isVisible=!0,this._modalInfo=this._modalErrorCounter.addressError===this.maxAllowedRetries?it.information_not_loaded_exit:it.error_retry_modal,this._retryService="addressError"):(this._isVisible=!0,this._modalInfo=this._hanlerModalError(t),this._modalErrorCounter.customer===this.maxAllowedRetries&&this._fireEvent("error-page-view"),this._retryService="cardDeliveries"),this._typeError=t,this.clearLoader()}_fireEvent(e,t={}){we(this,e,t)}_getAccounts(){this._apisInstance.BbvaGlobalAccountApiDm.getAccount(this.accountId)}_getCustomer(){this._apisInstance.BbvaGlobalCustomersApiDm.getCustomers()}_getAddress(){this._setUpCustomerAddresses(this._isUnmasked)}_getAem(){this._apisInstance.BbvaGlobalAemContentFragmentDm.getAemData()}_getPlaces(e){this._apisInstance.BbvaGlobalPlacesApiDm.getPlaces(e)}_getEmail(){this._apisInstance.BbvaGlobalCustomerContactDetailsApiDm.getCustomerContactDetails(this.customerId)}_getlocales(e,t={}){return this.t(`${lt.is}-${e}`,t)}_getApisInstance({detail:e}){Object.keys(e).some((t=>null===e[t]))||(this._apisInstance=e)}_handlerServices(){this.showLoader("transparent"),this._getAem()}_hanlerRetryServices(){this._handlerRetryServices(this._typeError),this._modalErrorCounter[{cardDeliveries:"customer",addressError:"addressError"}[this._retryService]]+=1,this._isVisible=!1}_handleCustomerAddressesSuccess({detail:e}){this._resetModalCounter("customer");const t=e.find((e=>"HOME"===e.addressType.id));this._addressHomeId=(null==t?void 0:t.id)??"";const{addressComponents:r=[]}=t.location,a={};Object.keys(this.addressFields).forEach((e=>{const t=(o=r,i=this.addressFields[e],o.find((e=>e.componentTypes.includes(i.toUpperCase())))??"");var o,i,s,l;(a[e]=Me((null==t?void 0:t.code)??"")||Me((null==t?void 0:t.name)??"")||"",null!=t&&t.name&&null!=t&&t.code)&&(null==t||null===(s=t.name)||void 0===s||!s.includes("*")||null!=t&&null!==(l=t.code)&&void 0!==l&&l.includes("*")||(a[e]=Me((null==t?void 0:t.code)??"")))})),a.street.includes("*")?this._shortCustomerAddress=`•${a.state.toUpperCase()}, ${a.country}`:(this._longCustomerAddress=`${a.street} ${a.exteriorNumber}, ${a.colony}, ${a.municipality}, ${a.postalCode}, ${a.state.toUpperCase()}`,this._showModalMultistep=!0),this.clearLoader()}_handleGlobalCustomersSuccess({detail:e}){const{id:t}=e.length?e[0]:{id:null};this.customerId=t,this.customerId&&this._setUpCustomerAddresses(),this.clearLoader()}_handleGlobalAccountSuccess({detail:e}){const{number:t=""}=e;this._numberAccount=t,this._accountNumber=t.substring(t.length-4)??""}_handleAemSuccess({detail:e}){var t,r;const a=(null==e||null===(t=e.items)||void 0===t||null===(r=t.contentfragmentlist)||void 0===r?void 0:r.items)??[];Object.keys(a).length>0&&(this._cardCoversList=a.map((e=>{const{elementsOrder:t=[],elements:r={}}=e,a={};return t.forEach((e=>(a[e]=r[e].value,a))),a})),this._cardCovers())}_handleCardCoversSuccess({detail:e}){this.clearLoader();const t=(e??[]).map((e=>(null==e?void 0:e.id)??""));this._cardCoversList=this._cardCoversList.filter((e=>t.includes((null==e?void 0:e.id)??"")))}_handleCustomerContactDetailsSuccess({detail:e}){var t,r;this._email=(null===(t=e.find((e=>"EMAIL"===e.contact.contactDetailType)))||void 0===t||null===(r=t.contact)||void 0===r?void 0:r.address.toLowerCase())??"",this._email=`•${this._email.replaceAll("*","")}`}_handlePlacesSuccess({detail:e}){this._listPlaces=e.map((e=>({...{...e,selected:!1}}))),this.clearLoader()}_handleCardDeliveriesSuccess({detail:e}){const{operationNumber:t="",alias:r="",operationDate:a="",address:o="",commission:i="",estimatedDeliveryDate:s=""}=e,{customAddress:l}=this._successInfo;let n={};if(l){var c,d;const e=(e,t)=>e.find((e=>e.componentTypes.includes(t.toUpperCase()))),t=(null==o||null===(c=o.location)||void 0===c?void 0:c.addressComponents)??[],r={};Object.keys(this.addressFields).forEach((a=>{var o;const i=(null===(o=e(t,this.addressFields[a]))||void 0===o?void 0:o.name)??"";i&&(r[a]=Me(i),"interiorNumber"===a&&i&&(r[a]=`Int. ${i} `))}));const{street:a,exteriorNumber:i,interiorNumber:s,colony:l,state:m,postalCode:f,municipality:u}=r;n={address:`${a} ${i}, ${s??""}${l}, ${u}, ${f}, ${m}`,reference:(null==o||null===(d=o.location)||void 0===d?void 0:d.additionalInformation)??""}}var m;this._successInfo={...this._successInfo,requestTime:(m=a,Fe(m).format("D MMM YYYY, h:mm A").replace(".","").replace(" PM"," h").replace(" AM"," h")),folio:t,deliveryDate:s||this.deliveryTime,alias:r,email:this._email,commission:Oe(i,this.localCurrency,this.language)||"0",language:this.language,localCurrency:this.localCurrency,...n},this._fireEvent("operation-number-success",t),this._fireEvent("success-page-view"),this.requestUpdate(),this.clearLoader(),this._showModalMultistep=!1,this._showSuccess=!0,this.navigate(this._pages.successPage.id)}_handleProposeDeliverySuccess({detail:e}){const{commission:t={}}=e;Object.keys(t).length>0&&(this.commission=Number(null==t?void 0:t.amount)||0)}_handlePublicSettingsSuccess({detail:e}){var t,r;const{value:a}=e.find((e=>null==e?void 0:e.value))??{},o=(null===(t=JSON.parse(a))||void 0===t?void 0:t.data)??{};this.deliveryTime=this._getlocales("deliveryTime",{date:(null==o||null===(r=o.cardOriginationOcDebitCardInmediateDelivery)||void 0===r?void 0:r.deliveryTime)??""})}_handlerRetryServices(e){this[{cardDeliveriesError:"_createDelivery",addressError:"_getAddress",aemError:"_getAem",contactDetailsError:"_getEmail",placesError:"_getPlaces",customersError:"_getCustomer",accountError:"_getAccounts",settingsError:"_publicSettings",cardCoversError:"_cardCovers",proposeError:"_proposeDelivery"}[st[e]]]()}_handlerSetting(){""===this.deliveryTime&&this._publicSettings()}_hanlerModalError(e){const t="cardDeliveriesError"===st[e]?it.exit_error_retry_modal:it.information_not_loaded_exit;return this._modalErrorCounter.customer===this.maxAllowedRetries?t:it.error_retry_modal}_helpModalContainer(e,t){this._handlerShowModal={landing:this._showLanding,success:this._showSuccess};return f`
      <bbva-help-modal
        class="main-container"
        id=${e.id}
        header-close-icon-aria-label="${this._getlocales(`icon-aria-${null==e?void 0:e.id}`)}"
        ?visible=${this._handlerShowModal[null==e?void 0:e.id]}
        avoid-icon-close-modal
        full-height
        hide-content-padding-top
        fixed-footer
        .headerType="${(null==e?void 0:e.headerType)||this._multistepHeaderVariant}"
        header-position="${"sticky"}"
        header-text="${this._headerText}"
        @visible-changed="${t=>{t.stopPropagation(),this._handlerShowModal[null==e?void 0:e.id]=null==t?void 0:t.detail}}"
        @help-modal-header-click="${()=>this.navigate("back")}"
      >
        <div class="content" slot="slot-content">${t}</div>
      </bbva-help-modal>
    `}_leaveFeat(e){this._fireEvent("multistep"===e?"multistep-leave":"leave"),this._showMultistep=!1,this._showSuccess=!1,this._showLanding=!1,this._isUnmasked=!1,this._showModalMultistep=!1,this.history=[],this._listPlaces=[],this._longCustomerAddress="",this._shortCustomerAddress="",this._multistepHeaderVariant="modal-initial-secondary",this._email="",this._successInfo={},this._isErrorPlaces=!1,this._isCustomAddress=!1,this._connectionOffline=!1,Object.keys(this._modalErrorCounter).forEach((e=>{this._modalErrorCounter[e]&&(this._modalErrorCounter[e]=0)}))}_publicSettings(){this._apisInstance.BbvaGlobalPublicSettingsApiDm.getPublicSettings(this.publicSettingsId,{key:this.publicSettingsKey})}_proposeDelivery(){this._apisInstance.BbvaGlobalCardProposeDelivery.postCardProposeDelivery(this.cardId,{processId:"NEW",status:"NEW"})}_requestSummarySucces({detail:e}){this.showLoader("transparent");const{address:t,customAddress:r,completeAddress:a,alias:o,design:i}=e;this._successInfo={address:t,customAddress:r,design:i,account:`${this._getlocales("account-type")}${this._accountNumber}`};let s={destination:{id:r?"CUSTOM":"HOME"},relatedContracts:{contractId:this.relatedContracts||this._numberAccount},serviceType:{id:this.serviceType},alias:o,commission:this.commission,customizationOptions:{designId:null==i?void 0:i.designId,imageCode:null==i?void 0:i.imageCode}};r&&(s={...s,address:{addressType:"SPECIFIC",location:{addressComponents:(e=>e.map((e=>({componentTypes:[this.addressFields[e]],name:a[e]??""}))))(Object.keys(this.addressFields)),additionalInformation:(null==a?void 0:a.reference)??""}}}),this._payloadCardDeliverie=s,this._createDelivery()}_resetModalCounter(e){this._modalErrorCounter[e]=0}get _requestApplication(){return this._fireEvent("card-offer-page-visit"),f`
      <card-offer
        number-account="${this._accountNumber}"
        ambient="primary"
        delivery-time="${this.deliveryTime}"
        @card-origination-oc-debit-card-inmediate-delivery-page-card-offer-button-default-finish="${()=>{this.navigate(this._pages.multistepPage.id),this._fireEvent("multistep-flow-page-visit"),this._showModalMultistep=!0,this._showMultistep=!0,this._showLanding=!1,this._headerText=this._getlocales("application-header-optional")}}"
      ></card-offer>
    `}get _requestSuccess(){return f`
      <successful-request .configList=${this._successInfo} ambient="primary"></successful-request>
    `}_setUpCustomerAddresses(e=!1){this.showLoader("transparent");const t={unmasked:e};this._apisInstance.BbvaGlobalCustomerAddressesApiDm.getCustomerAddresses(this.customerId,t)}_setUpGeographicPlaces(e){this.showLoader("transparent");const t={"catalog.id":this.catalogId,"geographicPlaceType.id":"COLONY",zipCode:e};this._isErrorPlaces=!1,this._getPlaces(t)}get _tplModalMultistep(){var e,t;return f`
      <bbva-help-modal
        id=${null===(e=this._pages.multistepPage)||void 0===e?void 0:e.id}
        header-close-icon-aria-label="${this._getlocales(`icon-aria-${null===(t=this._pages.multistepPage)||void 0===t?void 0:t.id}`)}"
        ?visible=${this._showModalMultistep}
        avoid-icon-close-modal
        full-height
        hide-content-padding-top
        .headerType="${this._multistepHeaderVariant}"
        .headerText="${this._headerText}"
        @visible-changed="${e=>{e.stopPropagation(),this._showModalMultistep=null==e?void 0:e.detail}}"
        @help-modal-header-click="${()=>this.navigate("back")}"
      >
        <div class="content" slot="slot-content">${this.renderMultistep}</div>
      </bbva-help-modal>
    `}get _tplModalSuccess(){var e,t;return f`
      <bbva-help-modal
        id=${null===(e=this._pages.successPage)||void 0===e?void 0:e.id}
        header-close-icon-aria-label="${this._getlocales(`icon-aria-${null===(t=this._pages.successPage)||void 0===t?void 0:t.id}`)}"
        ?visible=${this._showSuccess}
        avoid-icon-close-modal
        full-height
        hide-content-padding-top
        .headerType="${"modal-initial"}"
        .headerText="${this._headerText}"
        @visible-changed="${e=>{e.stopPropagation(),this._showSuccess=null==e?void 0:e.detail}}"
        @help-modal-header-click="${()=>this.navigate("back")}"
      >
        <div class="content" slot="slot-content">${this._requestSuccess}</div>
      </bbva-help-modal>
    `}_unmaskedAdress({detail:e}){"unmasked"!==e.masked||this._longCustomerAddress||(this._setUpCustomerAddresses(!0),this._isUnmasked=!0,this._showModalMultistep=!1)}render(){return f`
      <div ambient="primary">
        ${super.render()} ${this.apiUsage}
        ${this._helpModalContainer(this._pages.landingPage,this._requestApplication)}
        ${this._showMultistep?this._tplModalMultistep:h} ${this._tplModalSuccess}
        ${this.modalFlow}
      </div>
    `}}customElements.define(lt.is,lt);
